grammar ASP;

options {
	superClass = ASPANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package ASP.resource.ASP.mopp;
}

@lexer::members {
	public java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>();
	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
	
	public void reportError(org.antlr.runtime3_4_0.RecognitionException e) {
		lexerExceptions.add(e);
		lexerExceptionsPosition.add(((org.antlr.runtime3_4_0.ANTLRStringStream) input).index());
	}
}
@header{
	package ASP.resource.ASP.mopp;
}

@members{
	private ASP.resource.ASP.IASPTokenResolverFactory tokenResolverFactory = new ASP.resource.ASP.mopp.ASPTokenResolverFactory();
	
	/**
	 * the index of the last token that was handled by collectHiddenTokens()
	 */
	private int lastPosition;
	
	/**
	 * A flag that indicates whether the parser should remember all expected elements.
	 * This flag is set to true when using the parse for code completion. Otherwise it
	 * is set to false.
	 */
	private boolean rememberExpectedElements = false;
	
	private Object parseToIndexTypeObject;
	private int lastTokenIndex = 0;
	
	/**
	 * A list of expected elements the were collected while parsing the input stream.
	 * This list is only filled if <code>rememberExpectedElements</code> is set to
	 * true.
	 */
	private java.util.List<ASP.resource.ASP.mopp.ASPExpectedTerminal> expectedElements = new java.util.ArrayList<ASP.resource.ASP.mopp.ASPExpectedTerminal>();
	
	private int mismatchedTokenRecoveryTries = 0;
	/**
	 * A helper list to allow a lexer to pass errors to its parser
	 */
	protected java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>());
	
	/**
	 * Another helper list to allow a lexer to pass positions of errors to its parser
	 */
	protected java.util.List<Integer> lexerExceptionsPosition = java.util.Collections.synchronizedList(new java.util.ArrayList<Integer>());
	
	/**
	 * A stack for incomplete objects. This stack is used filled when the parser is
	 * used for code completion. Whenever the parser starts to read an object it is
	 * pushed on the stack. Once the element was parser completely it is popped from
	 * the stack.
	 */
	java.util.List<org.eclipse.emf.ecore.EObject> incompleteObjects = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
	
	private int stopIncludingHiddenTokens;
	private int stopExcludingHiddenTokens;
	private int tokenIndexOfLastCompleteElement;
	
	private int expectedElementsIndexOfLastCompleteElement;
	
	/**
	 * The offset indicating the cursor position when the parser is used for code
	 * completion by calling parseToExpectedElements().
	 */
	private int cursorOffset;
	
	/**
	 * The offset of the first hidden token of the last expected element. This offset
	 * is used to discard expected elements, which are not needed for code completion.
	 */
	private int lastStartIncludingHidden;
	
	protected void addErrorToResource(final String errorMessage, final int column, final int line, final int startIndex, final int stopIndex) {
		postParseCommands.add(new ASP.resource.ASP.IASPCommand<ASP.resource.ASP.IASPTextResource>() {
			public boolean execute(ASP.resource.ASP.IASPTextResource resource) {
				if (resource == null) {
					// the resource can be null if the parser is used for code completion
					return true;
				}
				resource.addProblem(new ASP.resource.ASP.IASPProblem() {
					public ASP.resource.ASP.ASPEProblemSeverity getSeverity() {
						return ASP.resource.ASP.ASPEProblemSeverity.ERROR;
					}
					public ASP.resource.ASP.ASPEProblemType getType() {
						return ASP.resource.ASP.ASPEProblemType.SYNTAX_ERROR;
					}
					public String getMessage() {
						return errorMessage;
					}
					public java.util.Collection<ASP.resource.ASP.IASPQuickFix> getQuickFixes() {
						return null;
					}
				}, column, line, startIndex, stopIndex);
				return true;
			}
		});
	}
	
	public void addExpectedElement(org.eclipse.emf.ecore.EClass eClass, int[] ids) {
		if (!this.rememberExpectedElements) {
			return;
		}
		int terminalID = ids[0];
		int followSetID = ids[1];
		ASP.resource.ASP.IASPExpectedElement terminal = ASP.resource.ASP.grammar.ASPFollowSetProvider.TERMINALS[terminalID];
		ASP.resource.ASP.mopp.ASPContainedFeature[] containmentFeatures = new ASP.resource.ASP.mopp.ASPContainedFeature[ids.length - 2];
		for (int i = 2; i < ids.length; i++) {
			containmentFeatures[i - 2] = ASP.resource.ASP.grammar.ASPFollowSetProvider.LINKS[ids[i]];
		}
		ASP.resource.ASP.grammar.ASPContainmentTrace containmentTrace = new ASP.resource.ASP.grammar.ASPContainmentTrace(eClass, containmentFeatures);
		org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
		ASP.resource.ASP.mopp.ASPExpectedTerminal expectedElement = new ASP.resource.ASP.mopp.ASPExpectedTerminal(container, terminal, followSetID, containmentTrace);
		setPosition(expectedElement, input.index());
		int startIncludingHiddenTokens = expectedElement.getStartIncludingHiddenTokens();
		if (lastStartIncludingHidden >= 0 && lastStartIncludingHidden < startIncludingHiddenTokens && cursorOffset > startIncludingHiddenTokens) {
			// clear list of expected elements
			this.expectedElements.clear();
			this.expectedElementsIndexOfLastCompleteElement = 0;
		}
		lastStartIncludingHidden = startIncludingHiddenTokens;
		this.expectedElements.add(expectedElement);
	}
	
	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
	}
	
	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
		if (disableLocationMap) {
			return;
		}
		postParseCommands.add(new ASP.resource.ASP.IASPCommand<ASP.resource.ASP.IASPTextResource>() {
			public boolean execute(ASP.resource.ASP.IASPTextResource resource) {
				ASP.resource.ASP.IASPLocationMap locationMap = resource.getLocationMap();
				if (locationMap == null) {
					// the locationMap can be null if the parser is used for code completion
					return true;
				}
				locationMap.setCharStart(target, locationMap.getCharStart(source));
				locationMap.setCharEnd(target, locationMap.getCharEnd(source));
				locationMap.setColumn(target, locationMap.getColumn(source));
				locationMap.setLine(target, locationMap.getLine(source));
				return true;
			}
		});
	}
	
	protected void copyLocalizationInfos(final org.antlr.runtime3_4_0.CommonToken source, final org.eclipse.emf.ecore.EObject target) {
		if (disableLocationMap) {
			return;
		}
		postParseCommands.add(new ASP.resource.ASP.IASPCommand<ASP.resource.ASP.IASPTextResource>() {
			public boolean execute(ASP.resource.ASP.IASPTextResource resource) {
				ASP.resource.ASP.IASPLocationMap locationMap = resource.getLocationMap();
				if (locationMap == null) {
					// the locationMap can be null if the parser is used for code completion
					return true;
				}
				if (source == null) {
					return true;
				}
				locationMap.setCharStart(target, source.getStartIndex());
				locationMap.setCharEnd(target, source.getStopIndex());
				locationMap.setColumn(target, source.getCharPositionInLine());
				locationMap.setLine(target, source.getLine());
				return true;
			}
		});
	}
	
	/**
	 * Sets the end character index and the last line for the given object in the
	 * location map.
	 */
	protected void setLocalizationEnd(java.util.Collection<ASP.resource.ASP.IASPCommand<ASP.resource.ASP.IASPTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
		if (disableLocationMap) {
			return;
		}
		postParseCommands.add(new ASP.resource.ASP.IASPCommand<ASP.resource.ASP.IASPTextResource>() {
			public boolean execute(ASP.resource.ASP.IASPTextResource resource) {
				ASP.resource.ASP.IASPLocationMap locationMap = resource.getLocationMap();
				if (locationMap == null) {
					// the locationMap can be null if the parser is used for code completion
					return true;
				}
				locationMap.setCharEnd(object, endChar);
				locationMap.setLine(object, endLine);
				return true;
			}
		});
	}
	
	public ASP.resource.ASP.IASPTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
		try {
			if (encoding == null) {
				return new ASPParser(new org.antlr.runtime3_4_0.CommonTokenStream(new ASPLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream))));
			} else {
				return new ASPParser(new org.antlr.runtime3_4_0.CommonTokenStream(new ASPLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream, encoding))));
			}
		} catch (java.io.IOException e) {
			new ASP.resource.ASP.util.ASPRuntimeUtil().logError("Error while creating parser.", e);
			return null;
		}
	}
	
	/**
	 * This default constructor is only used to call createInstance() on it.
	 */
	public ASPParser() {
		super(null);
	}
	
	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_4_0.RecognitionException {
		this.lastPosition = 0;
		// required because the lexer class can not be subclassed
		((ASPLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
		((ASPLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
		Object typeObject = getTypeObject();
		if (typeObject == null) {
			return start();
		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
			if (type.getInstanceClass() == ASP.Transformation.class) {
				return parse_ASP_Transformation();
			}
			if (type.getInstanceClass() == ASP.Relation.class) {
				return parse_ASP_Relation();
			}
			if (type.getInstanceClass() == ASP.LeftPattern.class) {
				return parse_ASP_LeftPattern();
			}
			if (type.getInstanceClass() == ASP.RightPattern.class) {
				return parse_ASP_RightPattern();
			}
			if (type.getInstanceClass() == ASP.Metanode.class) {
				return parse_ASP_Metanode();
			}
			if (type.getInstanceClass() == ASP.Metaprop.class) {
				return parse_ASP_Metaprop();
			}
			if (type.getInstanceClass() == ASP.Metaedge.class) {
				return parse_ASP_Metaedge();
			}
			if (type.getInstanceClass() == ASP.Literal.class) {
				return parse_ASP_Literal();
			}
			if (type.getInstanceClass() == ASP.Constraint.class) {
				return parse_ASP_Constraint();
			}
			if (type.getInstanceClass() == ASP.Terminal.class) {
				return parse_ASP_Terminal();
			}
			if (type.getInstanceClass() == ASP.Node.class) {
				return parse_ASP_Node();
			}
			if (type.getInstanceClass() == ASP.Prop.class) {
				return parse_ASP_Prop();
			}
			if (type.getInstanceClass() == ASP.Edge.class) {
				return parse_ASP_Edge();
			}
			if (type.getInstanceClass() == ASP.Not.class) {
				return parse_ASP_Not();
			}
			if (type.getInstanceClass() == ASP.Eq.class) {
				return parse_ASP_Eq();
			}
			if (type.getInstanceClass() == ASP.NotEq.class) {
				return parse_ASP_NotEq();
			}
		}
		throw new ASP.resource.ASP.mopp.ASPUnexpectedContentTypeException(typeObject);
	}
	
	public int getMismatchedTokenRecoveryTries() {
		return mismatchedTokenRecoveryTries;
	}
	
	public Object getMissingSymbol(org.antlr.runtime3_4_0.IntStream arg0, org.antlr.runtime3_4_0.RecognitionException arg1, int arg2, org.antlr.runtime3_4_0.BitSet arg3) {
		mismatchedTokenRecoveryTries++;
		return super.getMissingSymbol(arg0, arg1, arg2, arg3);
	}
	
	public Object getParseToIndexTypeObject() {
		return parseToIndexTypeObject;
	}
	
	protected Object getTypeObject() {
		Object typeObject = getParseToIndexTypeObject();
		if (typeObject != null) {
			return typeObject;
		}
		java.util.Map<?,?> options = getOptions();
		if (options != null) {
			typeObject = options.get(ASP.resource.ASP.IASPOptions.RESOURCE_CONTENT_TYPE);
		}
		return typeObject;
	}
	
	/**
	 * Implementation that calls {@link #doParse()} and handles the thrown
	 * RecognitionExceptions.
	 */
	public ASP.resource.ASP.IASPParseResult parse() {
		terminateParsing = false;
		postParseCommands = new java.util.ArrayList<ASP.resource.ASP.IASPCommand<ASP.resource.ASP.IASPTextResource>>();
		ASP.resource.ASP.mopp.ASPParseResult parseResult = new ASP.resource.ASP.mopp.ASPParseResult();
		try {
			org.eclipse.emf.ecore.EObject result =  doParse();
			if (lexerExceptions.isEmpty()) {
				parseResult.setRoot(result);
			}
		} catch (org.antlr.runtime3_4_0.RecognitionException re) {
			reportError(re);
		} catch (java.lang.IllegalArgumentException iae) {
			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
				// can be caused if a null is set on EMF models where not allowed. this will just
				// happen if other errors occurred before
			} else {
				iae.printStackTrace();
			}
		}
		for (org.antlr.runtime3_4_0.RecognitionException re : lexerExceptions) {
			reportLexicalError(re);
		}
		parseResult.getPostParseCommands().addAll(postParseCommands);
		return parseResult;
	}
	
	public java.util.List<ASP.resource.ASP.mopp.ASPExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, ASP.resource.ASP.IASPTextResource dummyResource, int cursorOffset) {
		this.rememberExpectedElements = true;
		this.parseToIndexTypeObject = type;
		this.cursorOffset = cursorOffset;
		this.lastStartIncludingHidden = -1;
		final org.antlr.runtime3_4_0.CommonTokenStream tokenStream = (org.antlr.runtime3_4_0.CommonTokenStream) getTokenStream();
		ASP.resource.ASP.IASPParseResult result = parse();
		for (org.eclipse.emf.ecore.EObject incompleteObject : incompleteObjects) {
			org.antlr.runtime3_4_0.Lexer lexer = (org.antlr.runtime3_4_0.Lexer) tokenStream.getTokenSource();
			int endChar = lexer.getCharIndex();
			int endLine = lexer.getLine();
			setLocalizationEnd(result.getPostParseCommands(), incompleteObject, endChar, endLine);
		}
		if (result != null) {
			org.eclipse.emf.ecore.EObject root = result.getRoot();
			if (root != null) {
				dummyResource.getContentsInternal().add(root);
			}
			for (ASP.resource.ASP.IASPCommand<ASP.resource.ASP.IASPTextResource> command : result.getPostParseCommands()) {
				command.execute(dummyResource);
			}
		}
		// remove all expected elements that were added after the last complete element
		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
		java.util.Set<ASP.resource.ASP.mopp.ASPExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<ASP.resource.ASP.mopp.ASPExpectedTerminal>();
		java.util.List<ASP.resource.ASP.mopp.ASPExpectedTerminal> newFollowSet = new java.util.ArrayList<ASP.resource.ASP.mopp.ASPExpectedTerminal>();
		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
			ASP.resource.ASP.mopp.ASPExpectedTerminal expectedElementI = expectedElements.get(i);
			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
				currentFollowSet.add(expectedElementI);
			} else {
				break;
			}
		}
		int followSetID = 90;
		int i;
		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
			org.antlr.runtime3_4_0.CommonToken nextToken = (org.antlr.runtime3_4_0.CommonToken) tokenStream.get(i);
			if (nextToken.getType() < 0) {
				break;
			}
			if (nextToken.getChannel() == 99) {
				// hidden tokens do not reduce the follow set
			} else {
				// now that we have found the next visible token the position for that expected
				// terminals can be set
				for (ASP.resource.ASP.mopp.ASPExpectedTerminal nextFollow : newFollowSet) {
					lastTokenIndex = 0;
					setPosition(nextFollow, i);
				}
				newFollowSet.clear();
				// normal tokens do reduce the follow set - only elements that match the token are
				// kept
				for (ASP.resource.ASP.mopp.ASPExpectedTerminal nextFollow : currentFollowSet) {
					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
						// keep this one - it matches
						java.util.Collection<ASP.resource.ASP.util.ASPPair<ASP.resource.ASP.IASPExpectedElement, ASP.resource.ASP.mopp.ASPContainedFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
						for (ASP.resource.ASP.util.ASPPair<ASP.resource.ASP.IASPExpectedElement, ASP.resource.ASP.mopp.ASPContainedFeature[]> newFollowerPair : newFollowers) {
							ASP.resource.ASP.IASPExpectedElement newFollower = newFollowerPair.getLeft();
							org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
							ASP.resource.ASP.grammar.ASPContainmentTrace containmentTrace = new ASP.resource.ASP.grammar.ASPContainmentTrace(null, newFollowerPair.getRight());
							ASP.resource.ASP.mopp.ASPExpectedTerminal newFollowTerminal = new ASP.resource.ASP.mopp.ASPExpectedTerminal(container, newFollower, followSetID, containmentTrace);
							newFollowSet.add(newFollowTerminal);
							expectedElements.add(newFollowTerminal);
						}
					}
				}
				currentFollowSet.clear();
				currentFollowSet.addAll(newFollowSet);
			}
			followSetID++;
		}
		// after the last token in the stream we must set the position for the elements
		// that were added during the last iteration of the loop
		for (ASP.resource.ASP.mopp.ASPExpectedTerminal nextFollow : newFollowSet) {
			lastTokenIndex = 0;
			setPosition(nextFollow, i);
		}
		return this.expectedElements;
	}
	
	public void setPosition(ASP.resource.ASP.mopp.ASPExpectedTerminal expectedElement, int tokenIndex) {
		int currentIndex = Math.max(0, tokenIndex);
		for (int index = lastTokenIndex; index < currentIndex; index++) {
			if (index >= input.size()) {
				break;
			}
			org.antlr.runtime3_4_0.CommonToken tokenAtIndex = (org.antlr.runtime3_4_0.CommonToken) input.get(index);
			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
			if (tokenAtIndex.getChannel() != 99 && !anonymousTokens.contains(tokenAtIndex)) {
				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
			}
		}
		lastTokenIndex = Math.max(0, currentIndex);
		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
	}
	
	public Object recoverFromMismatchedToken(org.antlr.runtime3_4_0.IntStream input, int ttype, org.antlr.runtime3_4_0.BitSet follow) throws org.antlr.runtime3_4_0.RecognitionException {
		if (!rememberExpectedElements) {
			return super.recoverFromMismatchedToken(input, ttype, follow);
		} else {
			return null;
		}
	}
	
	/**
	 * Translates errors thrown by the parser into human readable messages.
	 */
	public void reportError(final org.antlr.runtime3_4_0.RecognitionException e)  {
		String message = e.getMessage();
		if (e instanceof org.antlr.runtime3_4_0.MismatchedTokenException) {
			org.antlr.runtime3_4_0.MismatchedTokenException mte = (org.antlr.runtime3_4_0.MismatchedTokenException) e;
			String expectedTokenName = formatTokenName(mte.expecting);
			String actualTokenName = formatTokenName(e.token.getType());
			message = "Syntax error on token \"" + e.token.getText() + " (" + actualTokenName + ")\", \"" + expectedTokenName + "\" expected";
		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedTreeNodeException) {
			org.antlr.runtime3_4_0.MismatchedTreeNodeException mtne = (org.antlr.runtime3_4_0.MismatchedTreeNodeException) e;
			String expectedTokenName = formatTokenName(mtne.expecting);
			message = "mismatched tree node: " + "xxx" + "; tokenName " + expectedTokenName;
		} else if (e instanceof org.antlr.runtime3_4_0.NoViableAltException) {
			message = "Syntax error on token \"" + e.token.getText() + "\", check following tokens";
		} else if (e instanceof org.antlr.runtime3_4_0.EarlyExitException) {
			message = "Syntax error on token \"" + e.token.getText() + "\", delete this token";
		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedSetException) {
			org.antlr.runtime3_4_0.MismatchedSetException mse = (org.antlr.runtime3_4_0.MismatchedSetException) e;
			message = "mismatched token: " + e.token + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedNotSetException) {
			org.antlr.runtime3_4_0.MismatchedNotSetException mse = (org.antlr.runtime3_4_0.MismatchedNotSetException) e;
			message = "mismatched token: " +  e.token + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_4_0.FailedPredicateException) {
			org.antlr.runtime3_4_0.FailedPredicateException fpe = (org.antlr.runtime3_4_0.FailedPredicateException) e;
			message = "rule " + fpe.ruleName + " failed predicate: {" +  fpe.predicateText + "}?";
		}
		// the resource may be null if the parser is used for code completion
		final String finalMessage = message;
		if (e.token instanceof org.antlr.runtime3_4_0.CommonToken) {
			final org.antlr.runtime3_4_0.CommonToken ct = (org.antlr.runtime3_4_0.CommonToken) e.token;
			addErrorToResource(finalMessage, ct.getCharPositionInLine(), ct.getLine(), ct.getStartIndex(), ct.getStopIndex());
		} else {
			addErrorToResource(finalMessage, e.token.getCharPositionInLine(), e.token.getLine(), 1, 5);
		}
	}
	
	/**
	 * Translates errors thrown by the lexer into human readable messages.
	 */
	public void reportLexicalError(final org.antlr.runtime3_4_0.RecognitionException e)  {
		String message = "";
		if (e instanceof org.antlr.runtime3_4_0.MismatchedTokenException) {
			org.antlr.runtime3_4_0.MismatchedTokenException mte = (org.antlr.runtime3_4_0.MismatchedTokenException) e;
			message = "Syntax error on token \"" + ((char) e.c) + "\", \"" + (char) mte.expecting + "\" expected";
		} else if (e instanceof org.antlr.runtime3_4_0.NoViableAltException) {
			message = "Syntax error on token \"" + ((char) e.c) + "\", delete this token";
		} else if (e instanceof org.antlr.runtime3_4_0.EarlyExitException) {
			org.antlr.runtime3_4_0.EarlyExitException eee = (org.antlr.runtime3_4_0.EarlyExitException) e;
			message = "required (...)+ loop (decision=" + eee.decisionNumber + ") did not match anything; on line " + e.line + ":" + e.charPositionInLine + " char=" + ((char) e.c) + "'";
		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedSetException) {
			org.antlr.runtime3_4_0.MismatchedSetException mse = (org.antlr.runtime3_4_0.MismatchedSetException) e;
			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedNotSetException) {
			org.antlr.runtime3_4_0.MismatchedNotSetException mse = (org.antlr.runtime3_4_0.MismatchedNotSetException) e;
			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedRangeException) {
			org.antlr.runtime3_4_0.MismatchedRangeException mre = (org.antlr.runtime3_4_0.MismatchedRangeException) e;
			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set '" + (char) mre.a + "'..'" + (char) mre.b + "'";
		} else if (e instanceof org.antlr.runtime3_4_0.FailedPredicateException) {
			org.antlr.runtime3_4_0.FailedPredicateException fpe = (org.antlr.runtime3_4_0.FailedPredicateException) e;
			message = "rule " + fpe.ruleName + " failed predicate: {" + fpe.predicateText + "}?";
		}
		addErrorToResource(message, e.charPositionInLine, e.line, lexerExceptionsPosition.get(lexerExceptions.indexOf(e)), lexerExceptionsPosition.get(lexerExceptions.indexOf(e)));
	}
	
	private void startIncompleteElement(Object object) {
		if (object instanceof org.eclipse.emf.ecore.EObject) {
			this.incompleteObjects.add((org.eclipse.emf.ecore.EObject) object);
		}
	}
	
	private void completedElement(Object object, boolean isContainment) {
		if (isContainment && !this.incompleteObjects.isEmpty()) {
			boolean exists = this.incompleteObjects.remove(object);
			if (!exists) {
			}
		}
		if (object instanceof org.eclipse.emf.ecore.EObject) {
			this.tokenIndexOfLastCompleteElement = getTokenStream().index();
			this.expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
		}
	}
	
	private org.eclipse.emf.ecore.EObject getLastIncompleteElement() {
		if (incompleteObjects.isEmpty()) {
			return null;
		}
		return incompleteObjects.get(incompleteObjects.size() - 1);
	}
	
}

start returns [ org.eclipse.emf.ecore.EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[0]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[2]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[3]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[4]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[5]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[6]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[7]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[8]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[9]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[10]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[11]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[12]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[13]);
		expectedElementsIndexOfLastCompleteElement = 0;
	}
	(
		c0 = parse_ASP_Transformation{ element = c0; }
	)
	EOF	{
		retrieveLayoutInformation(element, null, null, false);
	}
	
;

parse_ASP_Transformation returns [ASP.Transformation element = null]
@init{
}
:
	(
		(
			a0_0 = parse_ASP_Element			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createTransformation();
					startIncompleteElement(element);
				}
				if (a0_0 != null) {
					if (a0_0 != null) {
						Object value = a0_0;
						addObjectToList(element, ASP.ASPPackage.TRANSFORMATION__ELEMENTS, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_0, a0_0, true);
					copyLocalizationInfos(a0_0, element);
				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[14]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[15]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[16]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[17]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[18]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[19]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[20]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[21]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[22]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[23]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[24]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[25]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[26]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[27]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[28]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[29]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[30]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[31]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[32]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[33]);
	}
	
	(
		(
			a1_0 = parse_ASP_Relation			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createTransformation();
					startIncompleteElement(element);
				}
				if (a1_0 != null) {
					if (a1_0 != null) {
						Object value = a1_0;
						addObjectToList(element, ASP.ASPPackage.TRANSFORMATION__RELATIONS, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_2, a1_0, true);
					copyLocalizationInfos(a1_0, element);
				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[34]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[35]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[36]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[37]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[38]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[39]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[40]);
	}
	
	(
		(
			a2_0 = parse_ASP_Constraint			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createTransformation();
					startIncompleteElement(element);
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						Object value = a2_0;
						addObjectToList(element, ASP.ASPPackage.TRANSFORMATION__CONSTRAINTS, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_4, a2_0, true);
					copyLocalizationInfos(a2_0, element);
				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[41]);
	}
	
;

parse_ASP_Relation returns [ASP.Relation element = null]
@init{
}
:
	(
		a0_0 = parse_ASP_Pattern		{
			if (terminateParsing) {
				throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
			}
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createRelation();
				startIncompleteElement(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					addObjectToList(element, ASP.ASPPackage.RELATION__PATTERNS, value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_1_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[42]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[43]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[44]);
	}
	
	(
		a1_0 = parse_ASP_RightPattern		{
			if (terminateParsing) {
				throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
			}
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createRelation();
				startIncompleteElement(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					addObjectToList(element, ASP.ASPPackage.RELATION__PATTERNS, value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_1_0_0_2, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[45]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[46]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[47]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[48]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[49]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[50]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[51]);
	}
	
;

parse_ASP_LeftPattern returns [ASP.LeftPattern element = null]
@init{
}
:
	(
		a0 = 'relation_node' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createLeftPattern();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_2_0_0_0_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[52]);
		}
		
		
		|		a1 = 'relation_prop' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createLeftPattern();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_2_0_0_0_0_1_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[53]);
		}
		
		
		|		a2 = 'relation_edge' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createLeftPattern();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_2_0_0_0_0_2_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[54]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[55]);
	}
	
	(
		a3 = QUOTED_40_41		
		{
			if (terminateParsing) {
				throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
			}
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createLeftPattern();
				startIncompleteElement(element);
			}
			if (a3 != null) {
				ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_40_41");
				tokenResolver.setOptions(getOptions());
				ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__ELEMENT), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				ASP.Function proxy = ASP.ASPFactory.eINSTANCE.createNode();
				collectHiddenTokens(element);
				registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.Pattern, ASP.Function>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getPatternElementReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__ELEMENT), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__ELEMENT), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_2_0_0_1, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[56]);
	}
	
	a4 = '.' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createLeftPattern();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_2_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[57]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[58]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[59]);
	}
	
;

parse_ASP_RightPattern returns [ASP.RightPattern element = null]
@init{
}
:
	(
		a0 = 'relation_node' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createRightPattern();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_0_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[60]);
		}
		
		
		|		a1 = 'relation_prop' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createRightPattern();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_0_0_1_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[61]);
		}
		
		
		|		a2 = 'relation_edge' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createRightPattern();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_0_0_2_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[62]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[63]);
	}
	
	(
		a3 = QUOTED_40_41		
		{
			if (terminateParsing) {
				throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
			}
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createRightPattern();
				startIncompleteElement(element);
			}
			if (a3 != null) {
				ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_40_41");
				tokenResolver.setOptions(getOptions());
				ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__ELEMENT), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				ASP.Function proxy = ASP.ASPFactory.eINSTANCE.createNode();
				collectHiddenTokens(element);
				registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.Pattern, ASP.Function>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getPatternElementReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__ELEMENT), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__ELEMENT), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_1, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[64]);
	}
	
	a4 = '.' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createRightPattern();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[65]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[66]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[67]);
	}
	
;

parse_ASP_Metanode returns [ASP.Metanode element = null]
@init{
}
:
	a0 = 'metanode(' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createMetanode();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[68]);
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
			}
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createMetanode();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.METANODE__LITERALS), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				ASP.Literal proxy = ASP.ASPFactory.eINSTANCE.createLiteral();
				collectHiddenTokens(element);
				registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.Function, ASP.Literal>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getFunctionLiteralsReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.METANODE__LITERALS), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					addObjectToList(element, ASP.ASPPackage.METANODE__LITERALS, value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_1, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[69]);
	}
	
	a2 = ',' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createMetanode();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[70]);
	}
	
	(
		a3 = TEXT		
		{
			if (terminateParsing) {
				throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
			}
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createMetanode();
				startIncompleteElement(element);
			}
			if (a3 != null) {
				ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.METANODE__LITERALS), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				ASP.Literal proxy = ASP.ASPFactory.eINSTANCE.createLiteral();
				collectHiddenTokens(element);
				registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.Function, ASP.Literal>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getFunctionLiteralsReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.METANODE__LITERALS), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					addObjectToList(element, ASP.ASPPackage.METANODE__LITERALS, value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_4, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[71]);
	}
	
	a4 = ').' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createMetanode();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[72]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[73]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[74]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[75]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[76]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[77]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[78]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[79]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[80]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[81]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[82]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[83]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[84]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[85]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[86]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[87]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[88]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[89]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[90]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[91]);
	}
	
;

parse_ASP_Metaprop returns [ASP.Metaprop element = null]
@init{
}
:
	a0 = 'metaprop(' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createMetaprop();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[92]);
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
			}
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createMetaprop();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.METAPROP__LITERALS), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				ASP.Literal proxy = ASP.ASPFactory.eINSTANCE.createLiteral();
				collectHiddenTokens(element);
				registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.Function, ASP.Literal>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getFunctionLiteralsReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.METAPROP__LITERALS), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					addObjectToList(element, ASP.ASPPackage.METAPROP__LITERALS, value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_1, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[93]);
	}
	
	a2 = ',' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createMetaprop();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[94]);
	}
	
	(
		a3 = TEXT		
		{
			if (terminateParsing) {
				throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
			}
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createMetaprop();
				startIncompleteElement(element);
			}
			if (a3 != null) {
				ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.METAPROP__LITERALS), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				ASP.Literal proxy = ASP.ASPFactory.eINSTANCE.createLiteral();
				collectHiddenTokens(element);
				registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.Function, ASP.Literal>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getFunctionLiteralsReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.METAPROP__LITERALS), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					addObjectToList(element, ASP.ASPPackage.METAPROP__LITERALS, value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_4, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[95]);
	}
	
	a4 = ',' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createMetaprop();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[96]);
	}
	
	(
		a5 = TEXT		
		{
			if (terminateParsing) {
				throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
			}
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createMetaprop();
				startIncompleteElement(element);
			}
			if (a5 != null) {
				ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.METAPROP__LITERALS), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				ASP.Literal proxy = ASP.ASPFactory.eINSTANCE.createLiteral();
				collectHiddenTokens(element);
				registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.Function, ASP.Literal>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getFunctionLiteralsReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.METAPROP__LITERALS), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					addObjectToList(element, ASP.ASPPackage.METAPROP__LITERALS, value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_7, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[97]);
	}
	
	a6 = ').' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createMetaprop();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_8, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[98]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[99]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[100]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[101]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[102]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[103]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[104]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[105]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[106]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[107]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[108]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[109]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[110]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[111]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[112]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[113]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[114]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[115]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[116]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[117]);
	}
	
;

parse_ASP_Metaedge returns [ASP.Metaedge element = null]
@init{
}
:
	a0 = 'metaedge(' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createMetaedge();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[118]);
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
			}
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createMetaedge();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__LITERALS), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				ASP.Literal proxy = ASP.ASPFactory.eINSTANCE.createLiteral();
				collectHiddenTokens(element);
				registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.Function, ASP.Literal>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getFunctionLiteralsReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__LITERALS), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					addObjectToList(element, ASP.ASPPackage.METAEDGE__LITERALS, value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_1, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[119]);
	}
	
	a2 = ',' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createMetaedge();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[120]);
	}
	
	(
		a3 = TEXT		
		{
			if (terminateParsing) {
				throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
			}
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createMetaedge();
				startIncompleteElement(element);
			}
			if (a3 != null) {
				ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__LITERALS), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				ASP.Literal proxy = ASP.ASPFactory.eINSTANCE.createLiteral();
				collectHiddenTokens(element);
				registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.Function, ASP.Literal>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getFunctionLiteralsReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__LITERALS), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					addObjectToList(element, ASP.ASPPackage.METAEDGE__LITERALS, value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_4, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[121]);
	}
	
	a4 = ',' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createMetaedge();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[122]);
	}
	
	(
		a5 = TEXT		
		{
			if (terminateParsing) {
				throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
			}
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createMetaedge();
				startIncompleteElement(element);
			}
			if (a5 != null) {
				ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__LITERALS), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				ASP.Literal proxy = ASP.ASPFactory.eINSTANCE.createLiteral();
				collectHiddenTokens(element);
				registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.Function, ASP.Literal>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getFunctionLiteralsReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__LITERALS), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					addObjectToList(element, ASP.ASPPackage.METAEDGE__LITERALS, value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_7, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[123]);
	}
	
	a6 = ',' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createMetaedge();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_8, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[124]);
	}
	
	(
		a7 = TEXT		
		{
			if (terminateParsing) {
				throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
			}
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createMetaedge();
				startIncompleteElement(element);
			}
			if (a7 != null) {
				ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__LITERALS), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				ASP.Literal proxy = ASP.ASPFactory.eINSTANCE.createLiteral();
				collectHiddenTokens(element);
				registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.Function, ASP.Literal>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getFunctionLiteralsReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__LITERALS), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					addObjectToList(element, ASP.ASPPackage.METAEDGE__LITERALS, value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_10, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a7, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a7, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[125]);
	}
	
	a8 = ').' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createMetaedge();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_11, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[126]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[127]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[128]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[129]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[130]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[131]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[132]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[133]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[134]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[135]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[136]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[137]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[138]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[139]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[140]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[141]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[142]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[143]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[144]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[145]);
	}
	
;

parse_ASP_Literal returns [ASP.Literal element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
			}
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createLiteral();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[146]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[147]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[148]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[149]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[150]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[151]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[152]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[153]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[154]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[155]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[156]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[157]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[158]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[159]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[160]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[161]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[162]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[163]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[164]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[165]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[166]);
	}
	
	(
		(
			a1 = '.' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createLiteral();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_1_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[167]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[168]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[169]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[170]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[171]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[172]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[173]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[174]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[175]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[176]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[177]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[178]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[179]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[180]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[181]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[182]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[183]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[184]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[185]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[186]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[187]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[188]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[189]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[190]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[191]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[192]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[193]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[194]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[195]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[196]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[197]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[198]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[199]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[200]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[201]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[202]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[203]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[204]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[205]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[206]);
	}
	
;

parse_ASP_Constraint returns [ASP.Constraint element = null]
@init{
}
:
	a0 = ':-' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createConstraint();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_8_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getConstraint(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[207]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getConstraint(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[208]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getConstraint(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[209]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getConstraint(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[210]);
	}
	
	(
		a1_0 = parse_ASP_Expression		{
			if (terminateParsing) {
				throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
			}
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createConstraint();
				startIncompleteElement(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					addObjectToList(element, ASP.ASPPackage.CONSTRAINT__EXPRESSIONS, value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_8_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[211]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[212]);
	}
	
	(
		(
			a2 = ',' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createConstraint();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_8_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getConstraint(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[213]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getConstraint(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[214]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getConstraint(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[215]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getConstraint(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[216]);
			}
			
			(
				a3_0 = parse_ASP_Expression				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createConstraint();
						startIncompleteElement(element);
					}
					if (a3_0 != null) {
						if (a3_0 != null) {
							Object value = a3_0;
							addObjectToList(element, ASP.ASPPackage.CONSTRAINT__EXPRESSIONS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_8_0_0_2_0_0_1, a3_0, true);
						copyLocalizationInfos(a3_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[217]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[218]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[219]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[220]);
	}
	
	a4 = '.' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createConstraint();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_8_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[221]);
	}
	
;

parse_ASP_Terminal returns [ASP.Terminal element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
			}
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createTerminal();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.TERMINAL__ELEMENT), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				ASP.Element proxy = ASP.ASPFactory.eINSTANCE.createNot();
				collectHiddenTokens(element);
				registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.Terminal, ASP.Element>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTerminalElementReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.TERMINAL__ELEMENT), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.TERMINAL__ELEMENT), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_9_0_0_0, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[222]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[223]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[224]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[225]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[226]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[227]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[228]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[229]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[230]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[231]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[232]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[233]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[234]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[235]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[236]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[237]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[238]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[239]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[240]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[241]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[242]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[243]);
	}
	
;

parse_ASP_Node returns [ASP.Node element = null]
@init{
}
:
	(
		a0 = 'node(' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createNode();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_0_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[244]);
		}
		
		
		|		a1 = 'nodex(' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createNode();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_0_0_1_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[245]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[246]);
	}
	
	(
		a2 = TEXT		
		{
			if (terminateParsing) {
				throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
			}
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createNode();
				startIncompleteElement(element);
			}
			if (a2 != null) {
				ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__LITERALS), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				ASP.Literal proxy = ASP.ASPFactory.eINSTANCE.createLiteral();
				collectHiddenTokens(element);
				registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.Function, ASP.Literal>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getFunctionLiteralsReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__LITERALS), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					addObjectToList(element, ASP.ASPPackage.NODE__LITERALS, value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_1, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[247]);
	}
	
	a3 = ',' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createNode();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[248]);
	}
	
	(
		a4 = TEXT		
		{
			if (terminateParsing) {
				throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
			}
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createNode();
				startIncompleteElement(element);
			}
			if (a4 != null) {
				ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__LITERALS), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				ASP.Literal proxy = ASP.ASPFactory.eINSTANCE.createLiteral();
				collectHiddenTokens(element);
				registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.Function, ASP.Literal>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getFunctionLiteralsReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__LITERALS), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					addObjectToList(element, ASP.ASPPackage.NODE__LITERALS, value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_4, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[249]);
	}
	
	a5 = ',' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createNode();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[250]);
	}
	
	(
		a6 = TEXT		
		{
			if (terminateParsing) {
				throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
			}
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createNode();
				startIncompleteElement(element);
			}
			if (a6 != null) {
				ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__LITERALS), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a6).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				ASP.Literal proxy = ASP.ASPFactory.eINSTANCE.createLiteral();
				collectHiddenTokens(element);
				registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.Function, ASP.Literal>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getFunctionLiteralsReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__LITERALS), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					addObjectToList(element, ASP.ASPPackage.NODE__LITERALS, value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_7, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a6, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a6, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[251]);
	}
	
	a7 = ').' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createNode();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_8, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[252]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[253]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[254]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[255]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[256]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[257]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[258]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[259]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[260]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[261]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[262]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[263]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[264]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[265]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[266]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[267]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[268]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[269]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[270]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[271]);
	}
	
;

parse_ASP_Prop returns [ASP.Prop element = null]
@init{
}
:
	(
		a0 = 'prop(' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createProp();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_0_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[272]);
		}
		
		
		|		a1 = 'propx(' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createProp();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_0_0_1_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[273]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[274]);
	}
	
	(
		a2 = TEXT		
		{
			if (terminateParsing) {
				throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
			}
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createProp();
				startIncompleteElement(element);
			}
			if (a2 != null) {
				ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__LITERALS), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				ASP.Literal proxy = ASP.ASPFactory.eINSTANCE.createLiteral();
				collectHiddenTokens(element);
				registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.Function, ASP.Literal>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getFunctionLiteralsReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__LITERALS), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					addObjectToList(element, ASP.ASPPackage.PROP__LITERALS, value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_1, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[275]);
	}
	
	a3 = ',' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createProp();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[276]);
	}
	
	(
		a4 = TEXT		
		{
			if (terminateParsing) {
				throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
			}
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createProp();
				startIncompleteElement(element);
			}
			if (a4 != null) {
				ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__LITERALS), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				ASP.Literal proxy = ASP.ASPFactory.eINSTANCE.createLiteral();
				collectHiddenTokens(element);
				registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.Function, ASP.Literal>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getFunctionLiteralsReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__LITERALS), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					addObjectToList(element, ASP.ASPPackage.PROP__LITERALS, value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_4, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[277]);
	}
	
	a5 = ',' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createProp();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[278]);
	}
	
	(
		a6 = TEXT		
		{
			if (terminateParsing) {
				throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
			}
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createProp();
				startIncompleteElement(element);
			}
			if (a6 != null) {
				ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__LITERALS), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a6).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				ASP.Literal proxy = ASP.ASPFactory.eINSTANCE.createLiteral();
				collectHiddenTokens(element);
				registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.Function, ASP.Literal>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getFunctionLiteralsReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__LITERALS), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					addObjectToList(element, ASP.ASPPackage.PROP__LITERALS, value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_7, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a6, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a6, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[279]);
	}
	
	a7 = ',' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createProp();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_8, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[280]);
	}
	
	(
		a8 = TEXT		
		{
			if (terminateParsing) {
				throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
			}
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createProp();
				startIncompleteElement(element);
			}
			if (a8 != null) {
				ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__LITERALS), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a8).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				ASP.Literal proxy = ASP.ASPFactory.eINSTANCE.createLiteral();
				collectHiddenTokens(element);
				registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.Function, ASP.Literal>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getFunctionLiteralsReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__LITERALS), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					addObjectToList(element, ASP.ASPPackage.PROP__LITERALS, value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_10, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a8, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a8, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[281]);
	}
	
	a9 = ').' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createProp();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_11, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[282]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[283]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[284]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[285]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[286]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[287]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[288]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[289]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[290]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[291]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[292]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[293]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[294]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[295]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[296]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[297]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[298]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[299]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[300]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[301]);
	}
	
;

parse_ASP_Edge returns [ASP.Edge element = null]
@init{
}
:
	(
		a0 = 'edge(' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createEdge();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_0_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[302]);
		}
		
		
		|		a1 = 'edgex(' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createEdge();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_0_0_1_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[303]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[304]);
	}
	
	(
		a2 = TEXT		
		{
			if (terminateParsing) {
				throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
			}
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createEdge();
				startIncompleteElement(element);
			}
			if (a2 != null) {
				ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__LITERALS), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				ASP.Literal proxy = ASP.ASPFactory.eINSTANCE.createLiteral();
				collectHiddenTokens(element);
				registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.Function, ASP.Literal>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getFunctionLiteralsReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__LITERALS), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					addObjectToList(element, ASP.ASPPackage.EDGE__LITERALS, value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_1, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[305]);
	}
	
	a3 = ',' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createEdge();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[306]);
	}
	
	(
		a4 = TEXT		
		{
			if (terminateParsing) {
				throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
			}
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createEdge();
				startIncompleteElement(element);
			}
			if (a4 != null) {
				ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__LITERALS), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				ASP.Literal proxy = ASP.ASPFactory.eINSTANCE.createLiteral();
				collectHiddenTokens(element);
				registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.Function, ASP.Literal>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getFunctionLiteralsReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__LITERALS), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					addObjectToList(element, ASP.ASPPackage.EDGE__LITERALS, value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_4, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[307]);
	}
	
	a5 = ',' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createEdge();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[308]);
	}
	
	(
		a6 = TEXT		
		{
			if (terminateParsing) {
				throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
			}
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createEdge();
				startIncompleteElement(element);
			}
			if (a6 != null) {
				ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__LITERALS), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a6).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				ASP.Literal proxy = ASP.ASPFactory.eINSTANCE.createLiteral();
				collectHiddenTokens(element);
				registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.Function, ASP.Literal>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getFunctionLiteralsReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__LITERALS), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					addObjectToList(element, ASP.ASPPackage.EDGE__LITERALS, value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_7, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a6, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a6, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[309]);
	}
	
	a7 = ',' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createEdge();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_8, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[310]);
	}
	
	(
		a8 = TEXT		
		{
			if (terminateParsing) {
				throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
			}
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createEdge();
				startIncompleteElement(element);
			}
			if (a8 != null) {
				ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__LITERALS), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a8).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				ASP.Literal proxy = ASP.ASPFactory.eINSTANCE.createLiteral();
				collectHiddenTokens(element);
				registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.Function, ASP.Literal>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getFunctionLiteralsReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__LITERALS), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					addObjectToList(element, ASP.ASPPackage.EDGE__LITERALS, value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_10, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a8, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a8, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[311]);
	}
	
	a9 = ',' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createEdge();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_11, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[312]);
	}
	
	(
		a10 = TEXT		
		{
			if (terminateParsing) {
				throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
			}
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createEdge();
				startIncompleteElement(element);
			}
			if (a10 != null) {
				ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__LITERALS), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				ASP.Literal proxy = ASP.ASPFactory.eINSTANCE.createLiteral();
				collectHiddenTokens(element);
				registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.Function, ASP.Literal>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getFunctionLiteralsReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__LITERALS), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					addObjectToList(element, ASP.ASPPackage.EDGE__LITERALS, value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_13, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a10, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a10, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[313]);
	}
	
	a11 = ').' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createEdge();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_14, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[314]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[315]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[316]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[317]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[318]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[319]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[320]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[321]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[322]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[323]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[324]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[325]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[326]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[327]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[328]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[329]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[330]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[331]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[332]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[333]);
	}
	
;

parse_ASP_Not returns [ASP.Not element = null]
@init{
}
:
	a0 = 'not' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createNot();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_13_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[334]);
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
			}
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createNot();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT__ELEMENT), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				ASP.Element proxy = ASP.ASPFactory.eINSTANCE.createNot();
				collectHiddenTokens(element);
				registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.Not, ASP.Element>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getNotElementReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT__ELEMENT), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT__ELEMENT), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_13_0_0_1, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[335]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[336]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[337]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[338]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[339]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[340]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[341]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[342]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[343]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[344]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[345]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[346]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[347]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[348]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[349]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[350]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[351]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[352]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[353]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[354]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[355]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[356]);
	}
	
;

parse_ASP_Eq returns [ASP.Eq element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
			}
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createEq();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__LEFT), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				ASP.Literal proxy = ASP.ASPFactory.eINSTANCE.createLiteral();
				collectHiddenTokens(element);
				registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.Eq, ASP.Literal>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getEqLeftReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__LEFT), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__LEFT), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_14_0_0_0, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[357]);
	}
	
	a1 = '==' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createEq();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_14_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[358]);
	}
	
	(
		a2 = TEXT		
		{
			if (terminateParsing) {
				throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
			}
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createEq();
				startIncompleteElement(element);
			}
			if (a2 != null) {
				ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__RIGHT), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				ASP.Literal proxy = ASP.ASPFactory.eINSTANCE.createLiteral();
				collectHiddenTokens(element);
				registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.Eq, ASP.Literal>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getEqRightReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__RIGHT), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__RIGHT), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_14_0_0_2, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[359]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[360]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[361]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[362]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[363]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[364]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[365]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[366]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[367]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[368]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[369]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[370]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[371]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[372]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[373]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[374]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[375]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[376]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[377]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[378]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[379]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[380]);
	}
	
;

parse_ASP_NotEq returns [ASP.NotEq element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
			}
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createNotEq();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__LEFT), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				ASP.Literal proxy = ASP.ASPFactory.eINSTANCE.createLiteral();
				collectHiddenTokens(element);
				registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.NotEq, ASP.Literal>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getNotEqLeftReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__LEFT), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__LEFT), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_15_0_0_0, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[381]);
	}
	
	a1 = '!=' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createNotEq();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_15_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[382]);
	}
	
	(
		a2 = TEXT		
		{
			if (terminateParsing) {
				throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
			}
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createNotEq();
				startIncompleteElement(element);
			}
			if (a2 != null) {
				ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__RIGHT), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				ASP.Literal proxy = ASP.ASPFactory.eINSTANCE.createLiteral();
				collectHiddenTokens(element);
				registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.NotEq, ASP.Literal>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getNotEqRightReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__RIGHT), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__RIGHT), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_15_0_0_2, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[383]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[384]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[385]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[386]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[387]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[388]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[389]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[390]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[391]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[392]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[393]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[394]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[395]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[396]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[397]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[398]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[399]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[400]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[401]);
		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[402]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[403]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[404]);
	}
	
;

parse_ASP_Element returns [ASP.Element element = null]
:
	c0 = parse_ASP_Metanode{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_ASP_Metaprop{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_ASP_Metaedge{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_ASP_Literal{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_ASP_Terminal{ element = c4; /* this is a subclass or primitive expression choice */ }
	|	c5 = parse_ASP_Node{ element = c5; /* this is a subclass or primitive expression choice */ }
	|	c6 = parse_ASP_Prop{ element = c6; /* this is a subclass or primitive expression choice */ }
	|	c7 = parse_ASP_Edge{ element = c7; /* this is a subclass or primitive expression choice */ }
	|	c8 = parse_ASP_Not{ element = c8; /* this is a subclass or primitive expression choice */ }
	|	c9 = parse_ASP_Eq{ element = c9; /* this is a subclass or primitive expression choice */ }
	|	c10 = parse_ASP_NotEq{ element = c10; /* this is a subclass or primitive expression choice */ }
	
;

parse_ASP_Pattern returns [ASP.Pattern element = null]
:
	c0 = parse_ASP_LeftPattern{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_ASP_RightPattern{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

parse_ASP_Expression returns [ASP.Expression element = null]
:
	c0 = parse_ASP_Terminal{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_ASP_Not{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_ASP_Eq{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_ASP_NotEq{ element = c3; /* this is a subclass or primitive expression choice */ }
	
;

COMMENT:
	('%'(~('\n'|'\r'|'\uffff'))*)
	{ _channel = 99; }
;
TEXT:
	(('A'..'Z'|'a'..'z'|'0'..'9'|'_'|'-'|'!'|':')+)
;
LINEBREAK:
	(('\r\n'|'\r'|'\n'))
	{ _channel = 99; }
;
WHITESPACE:
	((' '|'\t'|'\f'))
	{ _channel = 99; }
;
QUOTED_40_41:
	(('(')(~(')'))*(')'))
;

