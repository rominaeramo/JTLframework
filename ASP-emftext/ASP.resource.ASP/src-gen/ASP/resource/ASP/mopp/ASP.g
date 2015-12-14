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
			if (type.getInstanceClass() == ASP.LeftPattern.class) {
				return parse_ASP_LeftPattern();
			}
			if (type.getInstanceClass() == ASP.RightPattern.class) {
				return parse_ASP_RightPattern();
			}
			if (type.getInstanceClass() == ASP.Constraint.class) {
				return parse_ASP_Constraint();
			}
			if (type.getInstanceClass() == ASP.Not.class) {
				return parse_ASP_Not();
			}
			if (type.getInstanceClass() == ASP.Eq.class) {
				return parse_ASP_Eq();
			}
			if (type.getInstanceClass() == ASP.EqSimple.class) {
				return parse_ASP_EqSimple();
			}
			if (type.getInstanceClass() == ASP.NotEq.class) {
				return parse_ASP_NotEq();
			}
			if (type.getInstanceClass() == ASP.Literal.class) {
				return parse_ASP_Literal();
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
			if (type.getInstanceClass() == ASP.Relation.class) {
				return parse_ASP_Relation();
			}
			if (type.getInstanceClass() == ASP.Terminal.class) {
				return parse_ASP_Terminal();
			}
			if (type.getInstanceClass() == ASP.Metamodel.class) {
				return parse_ASP_Metamodel();
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
		int followSetID = 539;
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
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[0]);
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
	a0 = 'Transformation' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createTransformation();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1]);
	}
	
	a1 = '{' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createTransformation();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[2]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[3]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[4]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[5]);
	}
	
	(
		(
			a2 = 'location' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createTransformation();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[6]);
			}
			
			a3 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createTransformation();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_2_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[7]);
			}
			
			(
				a4 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createTransformation();
						startIncompleteElement(element);
					}
					if (a4 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.TRANSFORMATION__LOCATION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.TRANSFORMATION__LOCATION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_2_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[8]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[9]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[10]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[11]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[12]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[13]);
	}
	
	(
		(
			a5 = 'commentsBefore' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createTransformation();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[14]);
			}
			
			a6 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createTransformation();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_3_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[15]);
			}
			
			(
				a7 = TEXT				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createTransformation();
						startIncompleteElement(element);
					}
					if (a7 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.TRANSFORMATION__COMMENTS_BEFORE), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, ASP.ASPPackage.TRANSFORMATION__COMMENTS_BEFORE, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_3_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a7, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[16]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[17]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[18]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[19]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[20]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[21]);
	}
	
	(
		(
			a8 = 'commentsAfter' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createTransformation();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[22]);
			}
			
			a9 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createTransformation();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_4_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[23]);
			}
			
			(
				a10 = TEXT				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createTransformation();
						startIncompleteElement(element);
					}
					if (a10 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.TRANSFORMATION__COMMENTS_AFTER), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, ASP.ASPPackage.TRANSFORMATION__COMMENTS_AFTER, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_4_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a10, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[24]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[25]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[26]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[27]);
	}
	
	(
		a11 = 'metamodels' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createTransformation();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_5_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[28]);
		}
		
		a12 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createTransformation();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_5_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[29]);
		}
		
		(
			a13_0 = parse_ASP_Metamodel			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createTransformation();
					startIncompleteElement(element);
				}
				if (a13_0 != null) {
					if (a13_0 != null) {
						Object value = a13_0;
						addObjectToList(element, ASP.ASPPackage.TRANSFORMATION__METAMODELS, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_5_0_0_2, a13_0, true);
					copyLocalizationInfos(a13_0, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[30]);
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[31]);
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[32]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[33]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[34]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[35]);
	}
	
	(
		(
			a14 = 'usedLiterals' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createTransformation();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_6_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[36]);
			}
			
			a15 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createTransformation();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_6_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[37]);
			}
			
			(
				a16_0 = parse_ASP_Literal				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createTransformation();
						startIncompleteElement(element);
					}
					if (a16_0 != null) {
						if (a16_0 != null) {
							Object value = a16_0;
							addObjectToList(element, ASP.ASPPackage.TRANSFORMATION__USED_LITERALS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_6_0_0_2, a16_0, true);
						copyLocalizationInfos(a16_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[38]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[39]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[40]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[41]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[42]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[43]);
	}
	
	(
		(
			a17 = 'constraints' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createTransformation();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_7_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[44]);
			}
			
			a18 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createTransformation();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_7_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[45]);
			}
			
			(
				a19_0 = parse_ASP_Constraint				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createTransformation();
						startIncompleteElement(element);
					}
					if (a19_0 != null) {
						if (a19_0 != null) {
							Object value = a19_0;
							addObjectToList(element, ASP.ASPPackage.TRANSFORMATION__CONSTRAINTS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_7_0_0_2, a19_0, true);
						copyLocalizationInfos(a19_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[46]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[47]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[48]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[49]);
	}
	
	(
		(
			a20 = 'elements' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createTransformation();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_8_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a20, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[50]);
			}
			
			a21 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createTransformation();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_8_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a21, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[51]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[52]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[53]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[54]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[55]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[56]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[57]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[58]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[59]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[60]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[61]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[62]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[63]);
			}
			
			(
				a22_0 = parse_ASP_Element				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createTransformation();
						startIncompleteElement(element);
					}
					if (a22_0 != null) {
						if (a22_0 != null) {
							Object value = a22_0;
							addObjectToList(element, ASP.ASPPackage.TRANSFORMATION__ELEMENTS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_8_0_0_2, a22_0, true);
						copyLocalizationInfos(a22_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[64]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[65]);
			}
			
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[66]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[67]);
	}
	
	(
		(
			a23 = 'relations' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createTransformation();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_9_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a23, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[68]);
			}
			
			a24 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createTransformation();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_9_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a24, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[69]);
			}
			
			(
				a25_0 = parse_ASP_Relation				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createTransformation();
						startIncompleteElement(element);
					}
					if (a25_0 != null) {
						if (a25_0 != null) {
							Object value = a25_0;
							addObjectToList(element, ASP.ASPPackage.TRANSFORMATION__RELATIONS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_9_0_0_2, a25_0, true);
						copyLocalizationInfos(a25_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[70]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[71]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[72]);
			}
			
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[73]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[74]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[75]);
	}
	
	(
		(
			a26 = 'name' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createTransformation();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_10_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a26, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[76]);
			}
			
			a27 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createTransformation();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_10_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a27, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[77]);
			}
			
			(
				a28 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createTransformation();
						startIncompleteElement(element);
					}
					if (a28 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a28.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.TRANSFORMATION__NAME), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a28).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a28).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a28).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a28).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.TRANSFORMATION__NAME), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_10_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a28, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[78]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[79]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[80]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[81]);
	}
	
	a29 = '}' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createTransformation();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_11, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a29, element);
	}
	{
		// expected elements (follow set)
	}
	
;

parse_ASP_LeftPattern returns [ASP.LeftPattern element = null]
@init{
}
:
	a0 = 'LeftPattern' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createLeftPattern();
			startIncompleteElement(element);
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METANODE), value);
			}
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAPROP), value);
			}
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAEDGE), value);
			}
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_1_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[82]);
	}
	
	a1 = '{' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createLeftPattern();
			startIncompleteElement(element);
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METANODE), value);
			}
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAPROP), value);
			}
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAEDGE), value);
			}
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_1_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[83]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[84]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[85]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[86]);
	}
	
	(
		(
			a2 = 'location' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createLeftPattern();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METANODE), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAPROP), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAEDGE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_1_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[87]);
			}
			
			a3 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createLeftPattern();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METANODE), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAPROP), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAEDGE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_1_0_0_2_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[88]);
			}
			
			(
				a4 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createLeftPattern();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METANODE), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAPROP), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAEDGE), value);
						}
					}
					if (a4 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__LOCATION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__LOCATION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_1_0_0_2_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[89]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[90]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[91]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[92]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[93]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[94]);
	}
	
	(
		(
			a5 = 'commentsBefore' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createLeftPattern();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METANODE), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAPROP), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAEDGE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_1_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[95]);
			}
			
			a6 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createLeftPattern();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METANODE), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAPROP), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAEDGE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_1_0_0_3_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[96]);
			}
			
			(
				a7 = TEXT				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createLeftPattern();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METANODE), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAPROP), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAEDGE), value);
						}
					}
					if (a7 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__COMMENTS_BEFORE), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, ASP.ASPPackage.LEFT_PATTERN__COMMENTS_BEFORE, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_1_0_0_3_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a7, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[97]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[98]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[99]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[100]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[101]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[102]);
	}
	
	(
		(
			a8 = 'commentsAfter' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createLeftPattern();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METANODE), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAPROP), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAEDGE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_1_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[103]);
			}
			
			a9 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createLeftPattern();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METANODE), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAPROP), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAEDGE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_1_0_0_4_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[104]);
			}
			
			(
				a10 = TEXT				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createLeftPattern();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METANODE), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAPROP), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAEDGE), value);
						}
					}
					if (a10 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__COMMENTS_AFTER), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, ASP.ASPPackage.LEFT_PATTERN__COMMENTS_AFTER, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_1_0_0_4_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a10, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[105]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[106]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[107]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[108]);
	}
	
	(
		a11 = 'element' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createLeftPattern();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METANODE), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAPROP), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAEDGE), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_1_0_0_5_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[109]);
		}
		
		a12 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createLeftPattern();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METANODE), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAPROP), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAEDGE), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_1_0_0_5_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getLeftPattern(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[110]);
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getLeftPattern(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[111]);
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getLeftPattern(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[112]);
		}
		
		(
			a13_0 = parse_ASP_PatternElement			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createLeftPattern();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METANODE), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAPROP), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAEDGE), value);
					}
				}
				if (a13_0 != null) {
					if (a13_0 != null) {
						Object value = a13_0;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__ELEMENT), value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_1_0_0_5_0_0_2, a13_0, true);
					copyLocalizationInfos(a13_0, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[113]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[114]);
	}
	
	(
		a14 = 'name' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createLeftPattern();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METANODE), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAPROP), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAEDGE), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_1_0_0_6_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[115]);
		}
		
		a15 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createLeftPattern();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METANODE), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAPROP), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAEDGE), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_1_0_0_6_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[116]);
		}
		
		(
			a16 = QUOTED_34_34			
			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createLeftPattern();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METANODE), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAPROP), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAEDGE), value);
					}
				}
				if (a16 != null) {
					ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
					tokenResolver.setOptions(getOptions());
					ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a16.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a16).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a16).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a16).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a16).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_1_0_0_6_0_0_2, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a16, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[117]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[118]);
	}
	
	(
		a17 = 'relationId' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createLeftPattern();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METANODE), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAPROP), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAEDGE), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_1_0_0_7_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[119]);
		}
		
		a18 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createLeftPattern();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METANODE), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAPROP), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAEDGE), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_1_0_0_7_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[120]);
		}
		
		(
			a19 = QUOTED_34_34			
			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createLeftPattern();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METANODE), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAPROP), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAEDGE), value);
					}
				}
				if (a19 != null) {
					ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
					tokenResolver.setOptions(getOptions());
					ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a19.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__RELATION_ID), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a19).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a19).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a19).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a19).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__RELATION_ID), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_1_0_0_7_0_0_2, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a19, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[121]);
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[122]);
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[123]);
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[124]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[125]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[126]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[127]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[128]);
	}
	
	(
		(
			(
				a20 = 'isMetanode' {
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createLeftPattern();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METANODE), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAPROP), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAEDGE), value);
						}
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_1_0_0_8_0_0_0, true, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a20, element);
					// set value of boolean attribute
					Object value = true;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METANODE), value);
					completedElement(value, false);
				}
			)
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[129]);
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[130]);
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[131]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[132]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[133]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[134]);
	}
	
	(
		(
			(
				a23 = 'isMetaprop' {
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createLeftPattern();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METANODE), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAPROP), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAEDGE), value);
						}
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_1_0_0_9_0_0_0, true, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a23, element);
					// set value of boolean attribute
					Object value = true;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAPROP), value);
					completedElement(value, false);
				}
			)
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[135]);
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[136]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[137]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[138]);
	}
	
	(
		(
			(
				a26 = 'isMetaedge' {
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createLeftPattern();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METANODE), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAPROP), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAEDGE), value);
						}
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_1_0_0_10_0_0_0, true, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a26, element);
					// set value of boolean attribute
					Object value = true;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAEDGE), value);
					completedElement(value, false);
				}
			)
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[139]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[140]);
	}
	
	a29 = '}' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createLeftPattern();
			startIncompleteElement(element);
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METANODE), value);
			}
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAPROP), value);
			}
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAEDGE), value);
			}
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_1_0_0_11, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a29, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[141]);
	}
	
;

parse_ASP_RightPattern returns [ASP.RightPattern element = null]
@init{
}
:
	a0 = 'RightPattern' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createRightPattern();
			startIncompleteElement(element);
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METANODE), value);
			}
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAPROP), value);
			}
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAEDGE), value);
			}
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_2_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[142]);
	}
	
	a1 = '{' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createRightPattern();
			startIncompleteElement(element);
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METANODE), value);
			}
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAPROP), value);
			}
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAEDGE), value);
			}
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_2_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[143]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[144]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[145]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[146]);
	}
	
	(
		(
			a2 = 'location' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createRightPattern();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METANODE), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAPROP), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAEDGE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_2_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[147]);
			}
			
			a3 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createRightPattern();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METANODE), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAPROP), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAEDGE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_2_0_0_2_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[148]);
			}
			
			(
				a4 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createRightPattern();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METANODE), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAPROP), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAEDGE), value);
						}
					}
					if (a4 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__LOCATION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__LOCATION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_2_0_0_2_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[149]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[150]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[151]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[152]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[153]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[154]);
	}
	
	(
		(
			a5 = 'commentsBefore' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createRightPattern();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METANODE), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAPROP), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAEDGE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_2_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[155]);
			}
			
			a6 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createRightPattern();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METANODE), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAPROP), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAEDGE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_2_0_0_3_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[156]);
			}
			
			(
				a7 = TEXT				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createRightPattern();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METANODE), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAPROP), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAEDGE), value);
						}
					}
					if (a7 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__COMMENTS_BEFORE), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, ASP.ASPPackage.RIGHT_PATTERN__COMMENTS_BEFORE, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_2_0_0_3_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a7, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[157]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[158]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[159]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[160]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[161]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[162]);
	}
	
	(
		(
			a8 = 'commentsAfter' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createRightPattern();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METANODE), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAPROP), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAEDGE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_2_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[163]);
			}
			
			a9 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createRightPattern();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METANODE), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAPROP), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAEDGE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_2_0_0_4_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[164]);
			}
			
			(
				a10 = TEXT				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createRightPattern();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METANODE), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAPROP), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAEDGE), value);
						}
					}
					if (a10 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__COMMENTS_AFTER), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, ASP.ASPPackage.RIGHT_PATTERN__COMMENTS_AFTER, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_2_0_0_4_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a10, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[165]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[166]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[167]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[168]);
	}
	
	(
		a11 = 'element' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createRightPattern();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METANODE), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAPROP), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAEDGE), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_2_0_0_5_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[169]);
		}
		
		a12 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createRightPattern();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METANODE), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAPROP), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAEDGE), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_2_0_0_5_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getRightPattern(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[170]);
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getRightPattern(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[171]);
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getRightPattern(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[172]);
		}
		
		(
			a13_0 = parse_ASP_PatternElement			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createRightPattern();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METANODE), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAPROP), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAEDGE), value);
					}
				}
				if (a13_0 != null) {
					if (a13_0 != null) {
						Object value = a13_0;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__ELEMENT), value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_2_0_0_5_0_0_2, a13_0, true);
					copyLocalizationInfos(a13_0, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[173]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[174]);
	}
	
	(
		a14 = 'name' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createRightPattern();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METANODE), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAPROP), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAEDGE), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_2_0_0_6_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[175]);
		}
		
		a15 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createRightPattern();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METANODE), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAPROP), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAEDGE), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_2_0_0_6_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[176]);
		}
		
		(
			a16 = QUOTED_34_34			
			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createRightPattern();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METANODE), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAPROP), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAEDGE), value);
					}
				}
				if (a16 != null) {
					ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
					tokenResolver.setOptions(getOptions());
					ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a16.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a16).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a16).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a16).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a16).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_2_0_0_6_0_0_2, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a16, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[177]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[178]);
	}
	
	(
		a17 = 'relationId' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createRightPattern();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METANODE), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAPROP), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAEDGE), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_2_0_0_7_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[179]);
		}
		
		a18 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createRightPattern();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METANODE), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAPROP), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAEDGE), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_2_0_0_7_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[180]);
		}
		
		(
			a19 = QUOTED_34_34			
			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createRightPattern();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METANODE), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAPROP), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAEDGE), value);
					}
				}
				if (a19 != null) {
					ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
					tokenResolver.setOptions(getOptions());
					ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a19.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__RELATION_ID), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a19).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a19).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a19).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a19).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__RELATION_ID), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_2_0_0_7_0_0_2, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a19, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[181]);
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[182]);
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[183]);
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[184]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[185]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[186]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[187]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[188]);
	}
	
	(
		(
			(
				a20 = 'isMetanode' {
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createRightPattern();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METANODE), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAPROP), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAEDGE), value);
						}
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_2_0_0_8_0_0_0, true, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a20, element);
					// set value of boolean attribute
					Object value = true;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METANODE), value);
					completedElement(value, false);
				}
			)
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[189]);
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[190]);
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[191]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[192]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[193]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[194]);
	}
	
	(
		(
			(
				a23 = 'isMetaprop' {
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createRightPattern();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METANODE), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAPROP), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAEDGE), value);
						}
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_2_0_0_9_0_0_0, true, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a23, element);
					// set value of boolean attribute
					Object value = true;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAPROP), value);
					completedElement(value, false);
				}
			)
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[195]);
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[196]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[197]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[198]);
	}
	
	(
		(
			(
				a26 = 'isMetaedge' {
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createRightPattern();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METANODE), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAPROP), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAEDGE), value);
						}
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_2_0_0_10_0_0_0, true, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a26, element);
					// set value of boolean attribute
					Object value = true;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAEDGE), value);
					completedElement(value, false);
				}
			)
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[199]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[200]);
	}
	
	a29 = '}' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createRightPattern();
			startIncompleteElement(element);
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METANODE), value);
			}
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAPROP), value);
			}
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAEDGE), value);
			}
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_2_0_0_11, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a29, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[201]);
	}
	
;

parse_ASP_Constraint returns [ASP.Constraint element = null]
@init{
}
:
	a0 = 'Constraint' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createConstraint();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[202]);
	}
	
	a1 = '{' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createConstraint();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[203]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[204]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[205]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[206]);
	}
	
	(
		(
			a2 = 'location' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createConstraint();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[207]);
			}
			
			a3 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createConstraint();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_2_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[208]);
			}
			
			(
				a4 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createConstraint();
						startIncompleteElement(element);
					}
					if (a4 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.CONSTRAINT__LOCATION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.CONSTRAINT__LOCATION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_2_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[209]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[210]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[211]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[212]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[213]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[214]);
	}
	
	(
		(
			a5 = 'commentsBefore' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createConstraint();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[215]);
			}
			
			a6 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createConstraint();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_3_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[216]);
			}
			
			(
				a7 = TEXT				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createConstraint();
						startIncompleteElement(element);
					}
					if (a7 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.CONSTRAINT__COMMENTS_BEFORE), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, ASP.ASPPackage.CONSTRAINT__COMMENTS_BEFORE, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_3_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a7, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[217]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[218]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[219]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[220]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[221]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[222]);
	}
	
	(
		(
			a8 = 'commentsAfter' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createConstraint();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[223]);
			}
			
			a9 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createConstraint();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_4_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[224]);
			}
			
			(
				a10 = TEXT				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createConstraint();
						startIncompleteElement(element);
					}
					if (a10 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.CONSTRAINT__COMMENTS_AFTER), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, ASP.ASPPackage.CONSTRAINT__COMMENTS_AFTER, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_4_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a10, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[225]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[226]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[227]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[228]);
	}
	
	(
		(
			a11 = 'contents' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createConstraint();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_5_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[229]);
			}
			
			a12 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createConstraint();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_5_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getConstraint(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[230]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getConstraint(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[231]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getConstraint(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[232]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getConstraint(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[233]);
				addExpectedElement(ASP.ASPPackage.eINSTANCE.getConstraint(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[234]);
			}
			
			(
				a13_0 = parse_ASP_ConstraintElement				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createConstraint();
						startIncompleteElement(element);
					}
					if (a13_0 != null) {
						if (a13_0 != null) {
							Object value = a13_0;
							addObjectToList(element, ASP.ASPPackage.CONSTRAINT__CONTENTS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_5_0_0_2, a13_0, true);
						copyLocalizationInfos(a13_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[235]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[236]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[237]);
			}
			
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[238]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[239]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[240]);
	}
	
	(
		(
			a14 = 'name' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createConstraint();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_6_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[241]);
			}
			
			a15 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createConstraint();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_6_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[242]);
			}
			
			(
				a16 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createConstraint();
						startIncompleteElement(element);
					}
					if (a16 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a16.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.CONSTRAINT__NAME), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a16).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a16).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a16).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a16).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.CONSTRAINT__NAME), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_6_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a16, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[243]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[244]);
	}
	
	a17 = '}' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createConstraint();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[245]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[246]);
	}
	
;

parse_ASP_Not returns [ASP.Not element = null]
@init{
}
:
	a0 = 'Not' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createNot();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[247]);
	}
	
	a1 = '{' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createNot();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[248]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[249]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[250]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[251]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[252]);
	}
	
	(
		(
			a2 = 'location' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createNot();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[253]);
			}
			
			a3 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createNot();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_2_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[254]);
			}
			
			(
				a4 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createNot();
						startIncompleteElement(element);
					}
					if (a4 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT__LOCATION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT__LOCATION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_2_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[255]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[256]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[257]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[258]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[259]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[260]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[261]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[262]);
	}
	
	(
		(
			a5 = 'commentsBefore' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createNot();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[263]);
			}
			
			a6 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createNot();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_3_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[264]);
			}
			
			(
				a7 = TEXT				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createNot();
						startIncompleteElement(element);
					}
					if (a7 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT__COMMENTS_BEFORE), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, ASP.ASPPackage.NOT__COMMENTS_BEFORE, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_3_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a7, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[265]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[266]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[267]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[268]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[269]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[270]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[271]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[272]);
	}
	
	(
		(
			a8 = 'commentsAfter' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createNot();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[273]);
			}
			
			a9 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createNot();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_4_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[274]);
			}
			
			(
				a10 = TEXT				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createNot();
						startIncompleteElement(element);
					}
					if (a10 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT__COMMENTS_AFTER), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, ASP.ASPPackage.NOT__COMMENTS_AFTER, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_4_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a10, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[275]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[276]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[277]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[278]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[279]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[280]);
	}
	
	(
		(
			a11 = 'name' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createNot();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_5_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[281]);
			}
			
			a12 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createNot();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_5_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[282]);
			}
			
			(
				a13 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createNot();
						startIncompleteElement(element);
					}
					if (a13 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a13.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT__NAME), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a13).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT__NAME), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_5_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a13, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[283]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[284]);
	}
	
	(
		a14 = 'element' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createNot();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_6_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[285]);
		}
		
		a15 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createNot();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_6_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getNot(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[286]);
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getNot(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[287]);
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getNot(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[288]);
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getNot(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[289]);
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getNot(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[290]);
		}
		
		(
			a16_0 = parse_ASP_ConstraintElement			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createNot();
					startIncompleteElement(element);
				}
				if (a16_0 != null) {
					if (a16_0 != null) {
						Object value = a16_0;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT__ELEMENT), value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_6_0_0_2, a16_0, true);
					copyLocalizationInfos(a16_0, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[291]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[292]);
	}
	
	a17 = '}' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createNot();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[293]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[294]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[295]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[296]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[297]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[298]);
	}
	
;

parse_ASP_Eq returns [ASP.Eq element = null]
@init{
}
:
	a0 = 'Eq' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createEq();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[299]);
	}
	
	a1 = '{' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createEq();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[300]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[301]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[302]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[303]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[304]);
	}
	
	(
		(
			a2 = 'location' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createEq();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[305]);
			}
			
			a3 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createEq();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_2_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[306]);
			}
			
			(
				a4 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createEq();
						startIncompleteElement(element);
					}
					if (a4 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__LOCATION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__LOCATION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_2_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[307]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[308]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[309]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[310]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[311]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[312]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[313]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[314]);
	}
	
	(
		(
			a5 = 'commentsBefore' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createEq();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[315]);
			}
			
			a6 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createEq();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_3_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[316]);
			}
			
			(
				a7 = TEXT				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createEq();
						startIncompleteElement(element);
					}
					if (a7 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__COMMENTS_BEFORE), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, ASP.ASPPackage.EQ__COMMENTS_BEFORE, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_3_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a7, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[317]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[318]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[319]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[320]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[321]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[322]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[323]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[324]);
	}
	
	(
		(
			a8 = 'commentsAfter' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createEq();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[325]);
			}
			
			a9 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createEq();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_4_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[326]);
			}
			
			(
				a10 = TEXT				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createEq();
						startIncompleteElement(element);
					}
					if (a10 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__COMMENTS_AFTER), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, ASP.ASPPackage.EQ__COMMENTS_AFTER, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_4_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a10, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[327]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[328]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[329]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[330]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[331]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[332]);
	}
	
	(
		(
			a11 = 'name' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createEq();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_5_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[333]);
			}
			
			a12 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createEq();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_5_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[334]);
			}
			
			(
				a13 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createEq();
						startIncompleteElement(element);
					}
					if (a13 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a13.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__NAME), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a13).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__NAME), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_5_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a13, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[335]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[336]);
	}
	
	(
		a14 = 'parameterName' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createEq();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_6_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[337]);
		}
		
		a15 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createEq();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_6_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[338]);
		}
		
		(
			a16 = QUOTED_34_34			
			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createEq();
					startIncompleteElement(element);
				}
				if (a16 != null) {
					ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
					tokenResolver.setOptions(getOptions());
					ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a16.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__PARAMETER_NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a16).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a16).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a16).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a16).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__PARAMETER_NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_6_0_0_2, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a16, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[339]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[340]);
	}
	
	(
		a17 = 'right1' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createEq();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_7_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[341]);
		}
		
		a18 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createEq();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_7_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[342]);
		}
		
		(
			a19 = TEXT			
			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createEq();
					startIncompleteElement(element);
				}
				if (a19 != null) {
					ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a19.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__RIGHT1), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a19).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a19).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a19).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a19).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					ASP.Literal proxy = ASP.ASPFactory.eINSTANCE.createLiteral();
					collectHiddenTokens(element);
					registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.Eq, ASP.Literal>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getEqRight1ReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__RIGHT1), resolved, proxy);
					if (proxy != null) {
						Object value = proxy;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__RIGHT1), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_7_0_0_2, proxy, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a19, element);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a19, proxy);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[343]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[344]);
	}
	
	(
		a20 = 'left1' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createEq();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_8_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a20, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[345]);
		}
		
		a21 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createEq();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_8_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a21, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[346]);
		}
		
		(
			a22 = TEXT			
			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createEq();
					startIncompleteElement(element);
				}
				if (a22 != null) {
					ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a22.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__LEFT1), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a22).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a22).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a22).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a22).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					ASP.Literal proxy = ASP.ASPFactory.eINSTANCE.createLiteral();
					collectHiddenTokens(element);
					registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.Eq, ASP.Literal>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getEqLeft1ReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__LEFT1), resolved, proxy);
					if (proxy != null) {
						Object value = proxy;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__LEFT1), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_8_0_0_2, proxy, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a22, element);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a22, proxy);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[347]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[348]);
	}
	
	a23 = '}' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createEq();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_9, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a23, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[349]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[350]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[351]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[352]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[353]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[354]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[355]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[356]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[357]);
	}
	
;

parse_ASP_EqSimple returns [ASP.EqSimple element = null]
@init{
}
:
	a0 = 'EqSimple' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createEqSimple();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[358]);
	}
	
	a1 = '{' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createEqSimple();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[359]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[360]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[361]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[362]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[363]);
	}
	
	(
		(
			a2 = 'location' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createEqSimple();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[364]);
			}
			
			a3 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createEqSimple();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_2_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[365]);
			}
			
			(
				a4 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createEqSimple();
						startIncompleteElement(element);
					}
					if (a4 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__LOCATION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__LOCATION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_2_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[366]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[367]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[368]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[369]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[370]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[371]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[372]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[373]);
	}
	
	(
		(
			a5 = 'commentsBefore' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createEqSimple();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[374]);
			}
			
			a6 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createEqSimple();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_3_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[375]);
			}
			
			(
				a7 = TEXT				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createEqSimple();
						startIncompleteElement(element);
					}
					if (a7 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__COMMENTS_BEFORE), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, ASP.ASPPackage.EQ_SIMPLE__COMMENTS_BEFORE, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_3_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a7, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[376]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[377]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[378]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[379]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[380]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[381]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[382]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[383]);
	}
	
	(
		(
			a8 = 'commentsAfter' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createEqSimple();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[384]);
			}
			
			a9 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createEqSimple();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_4_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[385]);
			}
			
			(
				a10 = TEXT				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createEqSimple();
						startIncompleteElement(element);
					}
					if (a10 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__COMMENTS_AFTER), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, ASP.ASPPackage.EQ_SIMPLE__COMMENTS_AFTER, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_4_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a10, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[386]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[387]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[388]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[389]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[390]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[391]);
	}
	
	(
		(
			a11 = 'name' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createEqSimple();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_5_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[392]);
			}
			
			a12 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createEqSimple();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_5_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[393]);
			}
			
			(
				a13 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createEqSimple();
						startIncompleteElement(element);
					}
					if (a13 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a13.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__NAME), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a13).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__NAME), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_5_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a13, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[394]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[395]);
	}
	
	(
		a14 = 'parameterName' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createEqSimple();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_6_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[396]);
		}
		
		a15 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createEqSimple();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_6_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[397]);
		}
		
		(
			a16 = QUOTED_34_34			
			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createEqSimple();
					startIncompleteElement(element);
				}
				if (a16 != null) {
					ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
					tokenResolver.setOptions(getOptions());
					ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a16.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__PARAMETER_NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a16).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a16).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a16).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a16).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__PARAMETER_NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_6_0_0_2, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a16, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[398]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[399]);
	}
	
	(
		a17 = 'right1' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createEqSimple();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_7_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[400]);
		}
		
		a18 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createEqSimple();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_7_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[401]);
		}
		
		(
			a19 = TEXT			
			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createEqSimple();
					startIncompleteElement(element);
				}
				if (a19 != null) {
					ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a19.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__RIGHT1), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a19).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a19).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a19).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a19).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					ASP.Literal proxy = ASP.ASPFactory.eINSTANCE.createLiteral();
					collectHiddenTokens(element);
					registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.EqSimple, ASP.Literal>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getEqSimpleRight1ReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__RIGHT1), resolved, proxy);
					if (proxy != null) {
						Object value = proxy;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__RIGHT1), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_7_0_0_2, proxy, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a19, element);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a19, proxy);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[402]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[403]);
	}
	
	(
		a20 = 'left1' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createEqSimple();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_8_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a20, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[404]);
		}
		
		a21 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createEqSimple();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_8_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a21, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[405]);
		}
		
		(
			a22 = TEXT			
			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createEqSimple();
					startIncompleteElement(element);
				}
				if (a22 != null) {
					ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a22.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__LEFT1), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a22).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a22).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a22).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a22).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					ASP.Literal proxy = ASP.ASPFactory.eINSTANCE.createLiteral();
					collectHiddenTokens(element);
					registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.EqSimple, ASP.Literal>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getEqSimpleLeft1ReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__LEFT1), resolved, proxy);
					if (proxy != null) {
						Object value = proxy;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__LEFT1), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_8_0_0_2, proxy, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a22, element);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a22, proxy);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[406]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[407]);
	}
	
	a23 = '}' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createEqSimple();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_9, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a23, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[408]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[409]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[410]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[411]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[412]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[413]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[414]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[415]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[416]);
	}
	
;

parse_ASP_NotEq returns [ASP.NotEq element = null]
@init{
}
:
	a0 = 'NotEq' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createNotEq();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[417]);
	}
	
	a1 = '{' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createNotEq();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[418]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[419]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[420]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[421]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[422]);
	}
	
	(
		(
			a2 = 'location' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createNotEq();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[423]);
			}
			
			a3 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createNotEq();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_2_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[424]);
			}
			
			(
				a4 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createNotEq();
						startIncompleteElement(element);
					}
					if (a4 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__LOCATION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__LOCATION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_2_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[425]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[426]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[427]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[428]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[429]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[430]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[431]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[432]);
	}
	
	(
		(
			a5 = 'commentsBefore' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createNotEq();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[433]);
			}
			
			a6 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createNotEq();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_3_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[434]);
			}
			
			(
				a7 = TEXT				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createNotEq();
						startIncompleteElement(element);
					}
					if (a7 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__COMMENTS_BEFORE), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, ASP.ASPPackage.NOT_EQ__COMMENTS_BEFORE, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_3_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a7, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[435]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[436]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[437]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[438]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[439]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[440]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[441]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[442]);
	}
	
	(
		(
			a8 = 'commentsAfter' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createNotEq();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[443]);
			}
			
			a9 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createNotEq();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_4_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[444]);
			}
			
			(
				a10 = TEXT				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createNotEq();
						startIncompleteElement(element);
					}
					if (a10 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__COMMENTS_AFTER), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, ASP.ASPPackage.NOT_EQ__COMMENTS_AFTER, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_4_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a10, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[445]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[446]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[447]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[448]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[449]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[450]);
	}
	
	(
		(
			a11 = 'name' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createNotEq();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_5_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[451]);
			}
			
			a12 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createNotEq();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_5_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[452]);
			}
			
			(
				a13 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createNotEq();
						startIncompleteElement(element);
					}
					if (a13 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a13.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__NAME), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a13).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__NAME), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_5_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a13, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[453]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[454]);
	}
	
	(
		a14 = 'parameterName' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createNotEq();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_6_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[455]);
		}
		
		a15 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createNotEq();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_6_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[456]);
		}
		
		(
			a16 = QUOTED_34_34			
			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createNotEq();
					startIncompleteElement(element);
				}
				if (a16 != null) {
					ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
					tokenResolver.setOptions(getOptions());
					ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a16.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__PARAMETER_NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a16).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a16).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a16).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a16).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__PARAMETER_NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_6_0_0_2, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a16, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[457]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[458]);
	}
	
	(
		a17 = 'right1' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createNotEq();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_7_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[459]);
		}
		
		a18 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createNotEq();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_7_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[460]);
		}
		
		(
			a19 = TEXT			
			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createNotEq();
					startIncompleteElement(element);
				}
				if (a19 != null) {
					ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a19.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__RIGHT1), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a19).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a19).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a19).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a19).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					ASP.Literal proxy = ASP.ASPFactory.eINSTANCE.createLiteral();
					collectHiddenTokens(element);
					registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.NotEq, ASP.Literal>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getNotEqRight1ReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__RIGHT1), resolved, proxy);
					if (proxy != null) {
						Object value = proxy;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__RIGHT1), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_7_0_0_2, proxy, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a19, element);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a19, proxy);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[461]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[462]);
	}
	
	(
		a20 = 'left1' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createNotEq();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_8_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a20, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[463]);
		}
		
		a21 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createNotEq();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_8_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a21, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[464]);
		}
		
		(
			a22 = TEXT			
			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createNotEq();
					startIncompleteElement(element);
				}
				if (a22 != null) {
					ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a22.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__LEFT1), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a22).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a22).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a22).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a22).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					ASP.Literal proxy = ASP.ASPFactory.eINSTANCE.createLiteral();
					collectHiddenTokens(element);
					registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.NotEq, ASP.Literal>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getNotEqLeft1ReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__LEFT1), resolved, proxy);
					if (proxy != null) {
						Object value = proxy;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__LEFT1), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_8_0_0_2, proxy, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a22, element);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a22, proxy);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[465]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[466]);
	}
	
	a23 = '}' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createNotEq();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_9, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a23, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[467]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[468]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[469]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[470]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[471]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[472]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[473]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[474]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[475]);
	}
	
;

parse_ASP_Literal returns [ASP.Literal element = null]
@init{
}
:
	a0 = 'Literal' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createLiteral();
			startIncompleteElement(element);
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__IS_DEFINITION), value);
			}
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_8_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[476]);
	}
	
	a1 = '{' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createLiteral();
			startIncompleteElement(element);
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__IS_DEFINITION), value);
			}
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_8_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[477]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[478]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[479]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[480]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[481]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[482]);
	}
	
	(
		(
			(
				a2 = 'isDefinition' {
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createLiteral();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__IS_DEFINITION), value);
						}
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_8_0_0_2_0_0_0, true, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
					// set value of boolean attribute
					Object value = true;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__IS_DEFINITION), value);
					completedElement(value, false);
				}
			)
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[483]);
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[484]);
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[485]);
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[486]);
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[487]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[488]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[489]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[490]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[491]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[492]);
	}
	
	(
		(
			a5 = 'location' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createLiteral();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__IS_DEFINITION), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_8_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[493]);
			}
			
			a6 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createLiteral();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__IS_DEFINITION), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_8_0_0_3_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[494]);
			}
			
			(
				a7 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createLiteral();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__IS_DEFINITION), value);
						}
					}
					if (a7 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__LOCATION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__LOCATION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_8_0_0_3_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a7, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[495]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[496]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[497]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[498]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[499]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[500]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[501]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[502]);
	}
	
	(
		(
			a8 = 'commentsBefore' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createLiteral();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__IS_DEFINITION), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_8_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[503]);
			}
			
			a9 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createLiteral();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__IS_DEFINITION), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_8_0_0_4_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[504]);
			}
			
			(
				a10 = TEXT				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createLiteral();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__IS_DEFINITION), value);
						}
					}
					if (a10 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__COMMENTS_BEFORE), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, ASP.ASPPackage.LITERAL__COMMENTS_BEFORE, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_8_0_0_4_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a10, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[505]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[506]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[507]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[508]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[509]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[510]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[511]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[512]);
	}
	
	(
		(
			a11 = 'commentsAfter' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createLiteral();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__IS_DEFINITION), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_8_0_0_5_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[513]);
			}
			
			a12 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createLiteral();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__IS_DEFINITION), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_8_0_0_5_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[514]);
			}
			
			(
				a13 = TEXT				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createLiteral();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__IS_DEFINITION), value);
						}
					}
					if (a13 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a13.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__COMMENTS_AFTER), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a13).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, ASP.ASPPackage.LITERAL__COMMENTS_AFTER, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_8_0_0_5_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a13, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[515]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[516]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[517]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[518]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[519]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[520]);
	}
	
	(
		(
			a14 = 'name' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createLiteral();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__IS_DEFINITION), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_8_0_0_6_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[521]);
			}
			
			a15 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createLiteral();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__IS_DEFINITION), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_8_0_0_6_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[522]);
			}
			
			(
				a16 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createLiteral();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__IS_DEFINITION), value);
						}
					}
					if (a16 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a16.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__NAME), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a16).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a16).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a16).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a16).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__NAME), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_8_0_0_6_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a16, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[523]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[524]);
	}
	
	(
		a17 = 'parameterName' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createLiteral();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__IS_DEFINITION), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_8_0_0_7_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[525]);
		}
		
		a18 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createLiteral();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__IS_DEFINITION), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_8_0_0_7_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[526]);
		}
		
		(
			a19 = QUOTED_34_34			
			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createLiteral();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__IS_DEFINITION), value);
					}
				}
				if (a19 != null) {
					ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
					tokenResolver.setOptions(getOptions());
					ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a19.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__PARAMETER_NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a19).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a19).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a19).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a19).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__PARAMETER_NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_8_0_0_7_0_0_2, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a19, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[527]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[528]);
	}
	
	a20 = '}' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createLiteral();
			startIncompleteElement(element);
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__IS_DEFINITION), value);
			}
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_8_0_0_8, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a20, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[529]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[530]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[531]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[532]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[533]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[534]);
	}
	
;

parse_ASP_Node returns [ASP.Node element = null]
@init{
}
:
	a0 = 'Node' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createNode();
			startIncompleteElement(element);
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_NODEX), value);
			}
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_TRACE), value);
			}
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_9_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[535]);
	}
	
	a1 = '{' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createNode();
			startIncompleteElement(element);
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_NODEX), value);
			}
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_TRACE), value);
			}
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_9_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[536]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[537]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[538]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[539]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[540]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[541]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[542]);
	}
	
	(
		(
			(
				a2 = 'isNodex' {
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createNode();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_NODEX), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_TRACE), value);
						}
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_9_0_0_2_0_0_0, true, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
					// set value of boolean attribute
					Object value = true;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_NODEX), value);
					completedElement(value, false);
				}
			)
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[543]);
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[544]);
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[545]);
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[546]);
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[547]);
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[548]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[549]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[550]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[551]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[552]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[553]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[554]);
	}
	
	(
		(
			(
				a5 = 'isTrace' {
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createNode();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_NODEX), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_TRACE), value);
						}
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_9_0_0_3_0_0_0, true, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
					// set value of boolean attribute
					Object value = true;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_TRACE), value);
					completedElement(value, false);
				}
			)
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[555]);
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[556]);
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[557]);
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[558]);
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[559]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[560]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[561]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[562]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[563]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[564]);
	}
	
	(
		(
			a8 = 'location' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createNode();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_NODEX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_TRACE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_9_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[565]);
			}
			
			a9 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createNode();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_NODEX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_TRACE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_9_0_0_4_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[566]);
			}
			
			(
				a10 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createNode();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_NODEX), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_TRACE), value);
						}
					}
					if (a10 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__LOCATION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__LOCATION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_9_0_0_4_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a10, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[567]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[568]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[569]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[570]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[571]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[572]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[573]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[574]);
	}
	
	(
		(
			a11 = 'commentsBefore' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createNode();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_NODEX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_TRACE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_9_0_0_5_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[575]);
			}
			
			a12 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createNode();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_NODEX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_TRACE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_9_0_0_5_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[576]);
			}
			
			(
				a13 = TEXT				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createNode();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_NODEX), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_TRACE), value);
						}
					}
					if (a13 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a13.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__COMMENTS_BEFORE), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a13).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, ASP.ASPPackage.NODE__COMMENTS_BEFORE, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_9_0_0_5_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a13, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[577]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[578]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[579]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[580]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[581]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[582]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[583]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[584]);
	}
	
	(
		(
			a14 = 'commentsAfter' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createNode();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_NODEX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_TRACE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_9_0_0_6_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[585]);
			}
			
			a15 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createNode();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_NODEX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_TRACE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_9_0_0_6_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[586]);
			}
			
			(
				a16 = TEXT				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createNode();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_NODEX), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_TRACE), value);
						}
					}
					if (a16 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a16.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__COMMENTS_AFTER), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a16).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a16).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a16).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a16).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, ASP.ASPPackage.NODE__COMMENTS_AFTER, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_9_0_0_6_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a16, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[587]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[588]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[589]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[590]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[591]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[592]);
	}
	
	(
		(
			a17 = 'name' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createNode();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_NODEX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_TRACE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_9_0_0_7_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[593]);
			}
			
			a18 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createNode();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_NODEX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_TRACE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_9_0_0_7_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[594]);
			}
			
			(
				a19 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createNode();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_NODEX), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_TRACE), value);
						}
					}
					if (a19 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a19.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__NAME), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a19).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a19).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a19).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a19).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__NAME), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_9_0_0_7_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a19, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[595]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[596]);
	}
	
	(
		a20 = 'metamodel' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createNode();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_NODEX), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_TRACE), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_9_0_0_8_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a20, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[597]);
		}
		
		a21 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createNode();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_NODEX), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_TRACE), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_9_0_0_8_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a21, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[598]);
		}
		
		(
			a22 = TEXT			
			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createNode();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_NODEX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_TRACE), value);
					}
				}
				if (a22 != null) {
					ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a22.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__METAMODEL), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a22).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a22).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a22).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a22).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					ASP.Metamodel proxy = ASP.ASPFactory.eINSTANCE.createMetamodel();
					collectHiddenTokens(element);
					registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.Node, ASP.Metamodel>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getNodeMetamodelReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__METAMODEL), resolved, proxy);
					if (proxy != null) {
						Object value = proxy;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__METAMODEL), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_9_0_0_8_0_0_2, proxy, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a22, element);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a22, proxy);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[599]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[600]);
	}
	
	(
		a23 = 'metaClass' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createNode();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_NODEX), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_TRACE), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_9_0_0_9_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a23, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[601]);
		}
		
		a24 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createNode();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_NODEX), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_TRACE), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_9_0_0_9_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a24, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[602]);
		}
		
		(
			a25 = QUOTED_34_34			
			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createNode();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_NODEX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_TRACE), value);
					}
				}
				if (a25 != null) {
					ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
					tokenResolver.setOptions(getOptions());
					ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a25.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__META_CLASS), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a25).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a25).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a25).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a25).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__META_CLASS), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_9_0_0_9_0_0_2, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a25, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[603]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[604]);
	}
	
	(
		a26 = 'nodeId' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createNode();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_NODEX), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_TRACE), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_9_0_0_10_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a26, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[605]);
		}
		
		a27 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createNode();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_NODEX), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_TRACE), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_9_0_0_10_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a27, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getNode(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[606]);
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getNode(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[607]);
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getNode(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[608]);
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getNode(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[609]);
		}
		
		(
			a28_0 = parse_ASP_FunctionParameter			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createNode();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_NODEX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_TRACE), value);
					}
				}
				if (a28_0 != null) {
					if (a28_0 != null) {
						Object value = a28_0;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__NODE_ID), value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_9_0_0_10_0_0_2, a28_0, true);
					copyLocalizationInfos(a28_0, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[610]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[611]);
	}
	
	a29 = '}' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createNode();
			startIncompleteElement(element);
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_NODEX), value);
			}
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_TRACE), value);
			}
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_9_0_0_11, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a29, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[612]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[613]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[614]);
	}
	
;

parse_ASP_Prop returns [ASP.Prop element = null]
@init{
}
:
	a0 = 'Prop' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createProp();
			startIncompleteElement(element);
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_PROPX), value);
			}
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_TRACE), value);
			}
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[615]);
	}
	
	a1 = '{' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createProp();
			startIncompleteElement(element);
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_PROPX), value);
			}
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_TRACE), value);
			}
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[616]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[617]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[618]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[619]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[620]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[621]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[622]);
	}
	
	(
		(
			a2 = 'isPropx' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createProp();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_PROPX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_TRACE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_2, true, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
				// set value of boolean attribute
				Object value = true;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_PROPX), value);
				completedElement(value, false);
			}
		)?	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[623]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[624]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[625]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[626]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[627]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[628]);
	}
	
	(
		(
			a5 = 'isTrace' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createProp();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_PROPX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_TRACE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_3, true, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
				// set value of boolean attribute
				Object value = true;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_TRACE), value);
				completedElement(value, false);
			}
		)?	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[629]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[630]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[631]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[632]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[633]);
	}
	
	(
		(
			a8 = 'location' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createProp();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_PROPX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_TRACE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[634]);
			}
			
			a9 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createProp();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_PROPX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_TRACE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_4_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[635]);
			}
			
			(
				a10 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createProp();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_PROPX), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_TRACE), value);
						}
					}
					if (a10 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__LOCATION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__LOCATION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_4_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a10, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[636]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[637]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[638]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[639]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[640]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[641]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[642]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[643]);
	}
	
	(
		(
			a11 = 'commentsBefore' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createProp();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_PROPX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_TRACE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_5_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[644]);
			}
			
			a12 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createProp();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_PROPX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_TRACE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_5_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[645]);
			}
			
			(
				a13 = TEXT				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createProp();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_PROPX), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_TRACE), value);
						}
					}
					if (a13 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a13.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__COMMENTS_BEFORE), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a13).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, ASP.ASPPackage.PROP__COMMENTS_BEFORE, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_5_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a13, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[646]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[647]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[648]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[649]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[650]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[651]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[652]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[653]);
	}
	
	(
		(
			a14 = 'commentsAfter' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createProp();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_PROPX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_TRACE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_6_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[654]);
			}
			
			a15 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createProp();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_PROPX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_TRACE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_6_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[655]);
			}
			
			(
				a16 = TEXT				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createProp();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_PROPX), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_TRACE), value);
						}
					}
					if (a16 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a16.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__COMMENTS_AFTER), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a16).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a16).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a16).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a16).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, ASP.ASPPackage.PROP__COMMENTS_AFTER, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_6_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a16, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[656]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[657]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[658]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[659]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[660]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[661]);
	}
	
	(
		(
			a17 = 'name' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createProp();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_PROPX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_TRACE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_7_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[662]);
			}
			
			a18 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createProp();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_PROPX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_TRACE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_7_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[663]);
			}
			
			(
				a19 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createProp();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_PROPX), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_TRACE), value);
						}
					}
					if (a19 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a19.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__NAME), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a19).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a19).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a19).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a19).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__NAME), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_7_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a19, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[664]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[665]);
	}
	
	(
		a20 = 'metamodel' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createProp();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_PROPX), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_TRACE), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_8_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a20, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[666]);
		}
		
		a21 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createProp();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_PROPX), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_TRACE), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_8_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a21, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[667]);
		}
		
		(
			a22 = TEXT			
			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createProp();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_PROPX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_TRACE), value);
					}
				}
				if (a22 != null) {
					ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a22.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__METAMODEL), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a22).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a22).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a22).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a22).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					ASP.Metamodel proxy = ASP.ASPFactory.eINSTANCE.createMetamodel();
					collectHiddenTokens(element);
					registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.Prop, ASP.Metamodel>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getPropMetamodelReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__METAMODEL), resolved, proxy);
					if (proxy != null) {
						Object value = proxy;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__METAMODEL), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_8_0_0_2, proxy, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a22, element);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a22, proxy);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[668]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[669]);
	}
	
	(
		a23 = 'propId' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createProp();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_PROPX), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_TRACE), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_9_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a23, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[670]);
		}
		
		a24 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createProp();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_PROPX), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_TRACE), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_9_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a24, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getProp(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[671]);
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getProp(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[672]);
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getProp(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[673]);
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getProp(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[674]);
		}
		
		(
			a25_0 = parse_ASP_FunctionParameter			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createProp();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_PROPX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_TRACE), value);
					}
				}
				if (a25_0 != null) {
					if (a25_0 != null) {
						Object value = a25_0;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__PROP_ID), value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_9_0_0_2, a25_0, true);
					copyLocalizationInfos(a25_0, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[675]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[676]);
	}
	
	(
		a26 = 'metaClassId' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createProp();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_PROPX), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_TRACE), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_10_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a26, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[677]);
		}
		
		a27 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createProp();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_PROPX), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_TRACE), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_10_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a27, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getProp(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[678]);
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getProp(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[679]);
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getProp(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[680]);
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getProp(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[681]);
		}
		
		(
			a28_0 = parse_ASP_FunctionParameter			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createProp();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_PROPX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_TRACE), value);
					}
				}
				if (a28_0 != null) {
					if (a28_0 != null) {
						Object value = a28_0;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__META_CLASS_ID), value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_10_0_0_2, a28_0, true);
					copyLocalizationInfos(a28_0, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[682]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[683]);
	}
	
	(
		a29 = 'propValue' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createProp();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_PROPX), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_TRACE), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_11_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a29, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[684]);
		}
		
		a30 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createProp();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_PROPX), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_TRACE), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_11_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a30, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getProp(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[685]);
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getProp(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[686]);
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getProp(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[687]);
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getProp(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[688]);
		}
		
		(
			a31_0 = parse_ASP_FunctionParameter			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createProp();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_PROPX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_TRACE), value);
					}
				}
				if (a31_0 != null) {
					if (a31_0 != null) {
						Object value = a31_0;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__PROP_VALUE), value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_11_0_0_2, a31_0, true);
					copyLocalizationInfos(a31_0, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[689]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[690]);
	}
	
	a32 = '}' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createProp();
			startIncompleteElement(element);
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_PROPX), value);
			}
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_TRACE), value);
			}
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_12, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a32, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[691]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[692]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[693]);
	}
	
;

parse_ASP_Edge returns [ASP.Edge element = null]
@init{
}
:
	a0 = 'Edge' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createEdge();
			startIncompleteElement(element);
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_EDGEX), value);
			}
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_TRACE), value);
			}
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[694]);
	}
	
	a1 = '{' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createEdge();
			startIncompleteElement(element);
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_EDGEX), value);
			}
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_TRACE), value);
			}
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[695]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[696]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[697]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[698]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[699]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[700]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[701]);
	}
	
	(
		(
			a2 = 'isEdgex' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createEdge();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_EDGEX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_TRACE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_2, true, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
				// set value of boolean attribute
				Object value = true;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_EDGEX), value);
				completedElement(value, false);
			}
		)?	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[702]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[703]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[704]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[705]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[706]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[707]);
	}
	
	(
		(
			a5 = 'isTrace' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createEdge();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_EDGEX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_TRACE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_3, true, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
				// set value of boolean attribute
				Object value = true;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_TRACE), value);
				completedElement(value, false);
			}
		)?	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[708]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[709]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[710]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[711]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[712]);
	}
	
	(
		(
			a8 = 'location' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createEdge();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_EDGEX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_TRACE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[713]);
			}
			
			a9 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createEdge();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_EDGEX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_TRACE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_4_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[714]);
			}
			
			(
				a10 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createEdge();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_EDGEX), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_TRACE), value);
						}
					}
					if (a10 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__LOCATION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__LOCATION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_4_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a10, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[715]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[716]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[717]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[718]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[719]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[720]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[721]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[722]);
	}
	
	(
		(
			a11 = 'commentsBefore' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createEdge();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_EDGEX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_TRACE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_5_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[723]);
			}
			
			a12 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createEdge();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_EDGEX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_TRACE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_5_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[724]);
			}
			
			(
				a13 = TEXT				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createEdge();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_EDGEX), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_TRACE), value);
						}
					}
					if (a13 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a13.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__COMMENTS_BEFORE), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a13).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, ASP.ASPPackage.EDGE__COMMENTS_BEFORE, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_5_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a13, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[725]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[726]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[727]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[728]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[729]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[730]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[731]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[732]);
	}
	
	(
		(
			a14 = 'commentsAfter' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createEdge();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_EDGEX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_TRACE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_6_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[733]);
			}
			
			a15 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createEdge();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_EDGEX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_TRACE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_6_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[734]);
			}
			
			(
				a16 = TEXT				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createEdge();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_EDGEX), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_TRACE), value);
						}
					}
					if (a16 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a16.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__COMMENTS_AFTER), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a16).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a16).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a16).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a16).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, ASP.ASPPackage.EDGE__COMMENTS_AFTER, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_6_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a16, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[735]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[736]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[737]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[738]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[739]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[740]);
	}
	
	(
		(
			a17 = 'name' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createEdge();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_EDGEX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_TRACE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_7_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[741]);
			}
			
			a18 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createEdge();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_EDGEX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_TRACE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_7_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[742]);
			}
			
			(
				a19 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createEdge();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_EDGEX), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_TRACE), value);
						}
					}
					if (a19 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a19.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__NAME), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a19).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a19).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a19).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a19).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__NAME), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_7_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a19, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[743]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[744]);
	}
	
	(
		a20 = 'metamodel' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createEdge();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_EDGEX), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_TRACE), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_8_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a20, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[745]);
		}
		
		a21 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createEdge();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_EDGEX), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_TRACE), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_8_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a21, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[746]);
		}
		
		(
			a22 = TEXT			
			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createEdge();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_EDGEX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_TRACE), value);
					}
				}
				if (a22 != null) {
					ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a22.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__METAMODEL), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a22).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a22).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a22).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a22).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					ASP.Metamodel proxy = ASP.ASPFactory.eINSTANCE.createMetamodel();
					collectHiddenTokens(element);
					registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.Edge, ASP.Metamodel>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getEdgeMetamodelReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__METAMODEL), resolved, proxy);
					if (proxy != null) {
						Object value = proxy;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__METAMODEL), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_8_0_0_2, proxy, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a22, element);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a22, proxy);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[747]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[748]);
	}
	
	(
		a23 = 'edgeId' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createEdge();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_EDGEX), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_TRACE), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_9_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a23, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[749]);
		}
		
		a24 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createEdge();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_EDGEX), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_TRACE), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_9_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a24, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getEdge(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[750]);
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getEdge(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[751]);
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getEdge(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[752]);
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getEdge(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[753]);
		}
		
		(
			a25_0 = parse_ASP_FunctionParameter			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createEdge();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_EDGEX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_TRACE), value);
					}
				}
				if (a25_0 != null) {
					if (a25_0 != null) {
						Object value = a25_0;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__EDGE_ID), value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_9_0_0_2, a25_0, true);
					copyLocalizationInfos(a25_0, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[754]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[755]);
	}
	
	(
		a26 = 'sourceMCId' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createEdge();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_EDGEX), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_TRACE), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_10_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a26, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[756]);
		}
		
		a27 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createEdge();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_EDGEX), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_TRACE), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_10_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a27, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getEdge(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[757]);
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getEdge(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[758]);
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getEdge(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[759]);
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getEdge(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[760]);
		}
		
		(
			a28_0 = parse_ASP_FunctionParameter			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createEdge();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_EDGEX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_TRACE), value);
					}
				}
				if (a28_0 != null) {
					if (a28_0 != null) {
						Object value = a28_0;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__SOURCE_MC_ID), value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_10_0_0_2, a28_0, true);
					copyLocalizationInfos(a28_0, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[761]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[762]);
	}
	
	(
		a29 = 'targetMCId' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createEdge();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_EDGEX), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_TRACE), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_11_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a29, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[763]);
		}
		
		a30 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createEdge();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_EDGEX), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_TRACE), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_11_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a30, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getEdge(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[764]);
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getEdge(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[765]);
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getEdge(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[766]);
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getEdge(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[767]);
		}
		
		(
			a31_0 = parse_ASP_FunctionParameter			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createEdge();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_EDGEX), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_TRACE), value);
					}
				}
				if (a31_0 != null) {
					if (a31_0 != null) {
						Object value = a31_0;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__TARGET_MC_ID), value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_11_0_0_2, a31_0, true);
					copyLocalizationInfos(a31_0, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[768]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[769]);
	}
	
	a32 = '}' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createEdge();
			startIncompleteElement(element);
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_EDGEX), value);
			}
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_TRACE), value);
			}
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_12, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a32, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[770]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[771]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[772]);
	}
	
;

parse_ASP_Relation returns [ASP.Relation element = null]
@init{
}
:
	a0 = 'Relation' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createRelation();
			startIncompleteElement(element);
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LEFT2RIGHT), value);
			}
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RIGHT2LEFT), value);
			}
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[773]);
	}
	
	a1 = '{' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createRelation();
			startIncompleteElement(element);
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LEFT2RIGHT), value);
			}
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RIGHT2LEFT), value);
			}
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[774]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[775]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[776]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[777]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[778]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[779]);
	}
	
	(
		(
			a2 = 'left2right' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createRelation();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LEFT2RIGHT), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RIGHT2LEFT), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_2, true, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
				// set value of boolean attribute
				Object value = true;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LEFT2RIGHT), value);
				completedElement(value, false);
			}
		)?	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[780]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[781]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[782]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[783]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[784]);
	}
	
	(
		(
			a5 = 'right2left' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createRelation();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LEFT2RIGHT), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RIGHT2LEFT), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_3, true, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
				// set value of boolean attribute
				Object value = true;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RIGHT2LEFT), value);
				completedElement(value, false);
			}
		)?	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[785]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[786]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[787]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[788]);
	}
	
	(
		(
			a8 = 'location' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createRelation();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LEFT2RIGHT), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RIGHT2LEFT), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[789]);
			}
			
			a9 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createRelation();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LEFT2RIGHT), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RIGHT2LEFT), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_4_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[790]);
			}
			
			(
				a10 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createRelation();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LEFT2RIGHT), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RIGHT2LEFT), value);
						}
					}
					if (a10 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LOCATION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LOCATION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_4_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a10, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[791]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[792]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[793]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[794]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[795]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[796]);
	}
	
	(
		(
			a11 = 'commentsBefore' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createRelation();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LEFT2RIGHT), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RIGHT2LEFT), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_5_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[797]);
			}
			
			a12 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createRelation();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LEFT2RIGHT), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RIGHT2LEFT), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_5_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[798]);
			}
			
			(
				a13 = TEXT				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createRelation();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LEFT2RIGHT), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RIGHT2LEFT), value);
						}
					}
					if (a13 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a13.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__COMMENTS_BEFORE), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a13).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, ASP.ASPPackage.RELATION__COMMENTS_BEFORE, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_5_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a13, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[799]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[800]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[801]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[802]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[803]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[804]);
	}
	
	(
		(
			a14 = 'commentsAfter' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createRelation();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LEFT2RIGHT), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RIGHT2LEFT), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_6_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[805]);
			}
			
			a15 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createRelation();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LEFT2RIGHT), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RIGHT2LEFT), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_6_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[806]);
			}
			
			(
				a16 = TEXT				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createRelation();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LEFT2RIGHT), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RIGHT2LEFT), value);
						}
					}
					if (a16 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a16.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__COMMENTS_AFTER), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a16).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a16).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a16).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a16).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, ASP.ASPPackage.RELATION__COMMENTS_AFTER, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_6_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a16, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[807]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[808]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[809]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[810]);
	}
	
	(
		a17 = 'lpattern' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createRelation();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LEFT2RIGHT), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RIGHT2LEFT), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_7_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[811]);
		}
		
		a18 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createRelation();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LEFT2RIGHT), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RIGHT2LEFT), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_7_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[812]);
		}
		
		(
			a19_0 = parse_ASP_LeftPattern			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createRelation();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LEFT2RIGHT), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RIGHT2LEFT), value);
					}
				}
				if (a19_0 != null) {
					if (a19_0 != null) {
						Object value = a19_0;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LPATTERN), value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_7_0_0_2, a19_0, true);
					copyLocalizationInfos(a19_0, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[813]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[814]);
	}
	
	(
		a20 = 'rpattern' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createRelation();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LEFT2RIGHT), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RIGHT2LEFT), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_8_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a20, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[815]);
		}
		
		a21 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createRelation();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LEFT2RIGHT), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RIGHT2LEFT), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_8_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a21, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[816]);
		}
		
		(
			a22_0 = parse_ASP_RightPattern			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createRelation();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LEFT2RIGHT), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RIGHT2LEFT), value);
					}
				}
				if (a22_0 != null) {
					if (a22_0 != null) {
						Object value = a22_0;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RPATTERN), value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_8_0_0_2, a22_0, true);
					copyLocalizationInfos(a22_0, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[817]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[818]);
	}
	
	(
		a23 = 'relationId' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createRelation();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LEFT2RIGHT), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RIGHT2LEFT), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_9_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a23, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[819]);
		}
		
		a24 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createRelation();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LEFT2RIGHT), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RIGHT2LEFT), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_9_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a24, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[820]);
		}
		
		(
			a25 = QUOTED_34_34			
			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createRelation();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LEFT2RIGHT), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RIGHT2LEFT), value);
					}
				}
				if (a25 != null) {
					ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
					tokenResolver.setOptions(getOptions());
					ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a25.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RELATION_ID), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a25).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a25).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a25).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a25).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RELATION_ID), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_9_0_0_2, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a25, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[821]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[822]);
	}
	
	(
		a26 = 'name' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createRelation();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LEFT2RIGHT), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RIGHT2LEFT), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_10_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a26, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[823]);
		}
		
		a27 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createRelation();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LEFT2RIGHT), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RIGHT2LEFT), value);
				}
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_10_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a27, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[824]);
		}
		
		(
			a28 = QUOTED_34_34			
			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createRelation();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LEFT2RIGHT), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RIGHT2LEFT), value);
					}
				}
				if (a28 != null) {
					ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
					tokenResolver.setOptions(getOptions());
					ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a28.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a28).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a28).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a28).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a28).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_10_0_0_2, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a28, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[825]);
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[826]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[827]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[828]);
	}
	
	(
		(
			a29 = 'type' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createRelation();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LEFT2RIGHT), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RIGHT2LEFT), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_11_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a29, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[829]);
			}
			
			a30 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createRelation();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LEFT2RIGHT), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RIGHT2LEFT), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_11_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a30, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[830]);
			}
			
			(
				a31 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createRelation();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LEFT2RIGHT), value);
						}
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RIGHT2LEFT), value);
						}
					}
					if (a31 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a31.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__TYPE), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a31).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a31).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a31).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a31).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__TYPE), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_11_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a31, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[831]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[832]);
	}
	
	a32 = '}' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createRelation();
			startIncompleteElement(element);
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LEFT2RIGHT), value);
			}
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RIGHT2LEFT), value);
			}
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_12, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a32, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[833]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[834]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[835]);
	}
	
;

parse_ASP_Terminal returns [ASP.Terminal element = null]
@init{
}
:
	a0 = 'Terminal' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createTerminal();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_13_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[836]);
	}
	
	a1 = '{' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createTerminal();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_13_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[837]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[838]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[839]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[840]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[841]);
	}
	
	(
		(
			a2 = 'location' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createTerminal();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_13_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[842]);
			}
			
			a3 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createTerminal();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_13_0_0_2_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[843]);
			}
			
			(
				a4 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createTerminal();
						startIncompleteElement(element);
					}
					if (a4 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.TERMINAL__LOCATION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.TERMINAL__LOCATION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_13_0_0_2_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[844]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[845]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[846]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[847]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[848]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[849]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[850]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[851]);
	}
	
	(
		(
			a5 = 'commentsBefore' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createTerminal();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_13_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[852]);
			}
			
			a6 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createTerminal();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_13_0_0_3_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[853]);
			}
			
			(
				a7 = TEXT				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createTerminal();
						startIncompleteElement(element);
					}
					if (a7 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.TERMINAL__COMMENTS_BEFORE), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, ASP.ASPPackage.TERMINAL__COMMENTS_BEFORE, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_13_0_0_3_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a7, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[854]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[855]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[856]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[857]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[858]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[859]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[860]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[861]);
	}
	
	(
		(
			a8 = 'commentsAfter' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createTerminal();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_13_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[862]);
			}
			
			a9 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createTerminal();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_13_0_0_4_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[863]);
			}
			
			(
				a10 = TEXT				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createTerminal();
						startIncompleteElement(element);
					}
					if (a10 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.TERMINAL__COMMENTS_AFTER), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, ASP.ASPPackage.TERMINAL__COMMENTS_AFTER, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_13_0_0_4_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a10, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[864]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[865]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[866]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[867]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[868]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[869]);
	}
	
	(
		(
			a11 = 'name' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createTerminal();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_13_0_0_5_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[870]);
			}
			
			a12 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createTerminal();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_13_0_0_5_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[871]);
			}
			
			(
				a13 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createTerminal();
						startIncompleteElement(element);
					}
					if (a13 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a13.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.TERMINAL__NAME), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a13).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.TERMINAL__NAME), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_13_0_0_5_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a13, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[872]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[873]);
	}
	
	(
		a14 = 'content' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createTerminal();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_13_0_0_6_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[874]);
		}
		
		a15 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createTerminal();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_13_0_0_6_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getTerminal(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[875]);
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getTerminal(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[876]);
			addExpectedElement(ASP.ASPPackage.eINSTANCE.getTerminal(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[877]);
		}
		
		(
			a16_0 = parse_ASP_TerminalElement			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createTerminal();
					startIncompleteElement(element);
				}
				if (a16_0 != null) {
					if (a16_0 != null) {
						Object value = a16_0;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.TERMINAL__CONTENT), value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_13_0_0_6_0_0_2, a16_0, true);
					copyLocalizationInfos(a16_0, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[878]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[879]);
	}
	
	a17 = '}' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createTerminal();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_13_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[880]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[881]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[882]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[883]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[884]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[885]);
	}
	
;

parse_ASP_Metamodel returns [ASP.Metamodel element = null]
@init{
}
:
	a0 = 'Metamodel' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createMetamodel();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_14_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[886]);
	}
	
	a1 = '{' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createMetamodel();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_14_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[887]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[888]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[889]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[890]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[891]);
	}
	
	(
		(
			a2 = 'location' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetamodel();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_14_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[892]);
			}
			
			a3 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetamodel();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_14_0_0_2_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[893]);
			}
			
			(
				a4 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createMetamodel();
						startIncompleteElement(element);
					}
					if (a4 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.METAMODEL__LOCATION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAMODEL__LOCATION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_14_0_0_2_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[894]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[895]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[896]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[897]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[898]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[899]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[900]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[901]);
	}
	
	(
		(
			a5 = 'commentsBefore' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetamodel();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_14_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[902]);
			}
			
			a6 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetamodel();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_14_0_0_3_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[903]);
			}
			
			(
				a7 = TEXT				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createMetamodel();
						startIncompleteElement(element);
					}
					if (a7 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.METAMODEL__COMMENTS_BEFORE), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, ASP.ASPPackage.METAMODEL__COMMENTS_BEFORE, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_14_0_0_3_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a7, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[904]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[905]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[906]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[907]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[908]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[909]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[910]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[911]);
	}
	
	(
		(
			a8 = 'commentsAfter' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetamodel();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_14_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[912]);
			}
			
			a9 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetamodel();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_14_0_0_4_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[913]);
			}
			
			(
				a10 = TEXT				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createMetamodel();
						startIncompleteElement(element);
					}
					if (a10 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.METAMODEL__COMMENTS_AFTER), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, ASP.ASPPackage.METAMODEL__COMMENTS_AFTER, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_14_0_0_4_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a10, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[914]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[915]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[916]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[917]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[918]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[919]);
	}
	
	(
		(
			a11 = 'name' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetamodel();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_14_0_0_5_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[920]);
			}
			
			a12 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetamodel();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_14_0_0_5_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[921]);
			}
			
			(
				a13 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createMetamodel();
						startIncompleteElement(element);
					}
					if (a13 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a13.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.METAMODEL__NAME), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a13).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAMODEL__NAME), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_14_0_0_5_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a13, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[922]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[923]);
	}
	
	a14 = '}' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createMetamodel();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_14_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[924]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[925]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[926]);
	}
	
;

parse_ASP_Metanode returns [ASP.Metanode element = null]
@init{
}
:
	a0 = 'Metanode' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createMetanode();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_15_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[927]);
	}
	
	a1 = '{' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createMetanode();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_15_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[928]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[929]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[930]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[931]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[932]);
	}
	
	(
		(
			a2 = 'location' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetanode();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_15_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[933]);
			}
			
			a3 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetanode();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_15_0_0_2_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[934]);
			}
			
			(
				a4 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createMetanode();
						startIncompleteElement(element);
					}
					if (a4 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.METANODE__LOCATION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METANODE__LOCATION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_15_0_0_2_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[935]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[936]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[937]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[938]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[939]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[940]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[941]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[942]);
	}
	
	(
		(
			a5 = 'commentsBefore' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetanode();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_15_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[943]);
			}
			
			a6 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetanode();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_15_0_0_3_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[944]);
			}
			
			(
				a7 = TEXT				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createMetanode();
						startIncompleteElement(element);
					}
					if (a7 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.METANODE__COMMENTS_BEFORE), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, ASP.ASPPackage.METANODE__COMMENTS_BEFORE, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_15_0_0_3_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a7, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[945]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[946]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[947]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[948]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[949]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[950]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[951]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[952]);
	}
	
	(
		(
			a8 = 'commentsAfter' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetanode();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_15_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[953]);
			}
			
			a9 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetanode();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_15_0_0_4_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[954]);
			}
			
			(
				a10 = TEXT				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createMetanode();
						startIncompleteElement(element);
					}
					if (a10 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.METANODE__COMMENTS_AFTER), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, ASP.ASPPackage.METANODE__COMMENTS_AFTER, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_15_0_0_4_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a10, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[955]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[956]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[957]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[958]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[959]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[960]);
	}
	
	(
		(
			a11 = 'name' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetanode();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_15_0_0_5_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[961]);
			}
			
			a12 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetanode();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_15_0_0_5_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[962]);
			}
			
			(
				a13 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createMetanode();
						startIncompleteElement(element);
					}
					if (a13 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a13.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.METANODE__NAME), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a13).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METANODE__NAME), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_15_0_0_5_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a13, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[963]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[964]);
	}
	
	(
		a14 = 'metamodel' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createMetanode();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_15_0_0_6_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[965]);
		}
		
		a15 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createMetanode();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_15_0_0_6_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[966]);
		}
		
		(
			a16 = TEXT			
			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetanode();
					startIncompleteElement(element);
				}
				if (a16 != null) {
					ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a16.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.METANODE__METAMODEL), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a16).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a16).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a16).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a16).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					ASP.Metamodel proxy = ASP.ASPFactory.eINSTANCE.createMetamodel();
					collectHiddenTokens(element);
					registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.PatternElement, ASP.Metamodel>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getPatternElementMetamodelReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.METANODE__METAMODEL), resolved, proxy);
					if (proxy != null) {
						Object value = proxy;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METANODE__METAMODEL), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_15_0_0_6_0_0_2, proxy, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a16, element);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a16, proxy);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[967]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[968]);
	}
	
	a17 = '}' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createMetanode();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_15_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[969]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[970]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[971]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[972]);
	}
	
;

parse_ASP_Metaprop returns [ASP.Metaprop element = null]
@init{
}
:
	a0 = 'Metaprop' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createMetaprop();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_16_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[973]);
	}
	
	a1 = '{' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createMetaprop();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_16_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[974]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[975]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[976]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[977]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[978]);
	}
	
	(
		(
			a2 = 'location' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetaprop();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_16_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[979]);
			}
			
			a3 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetaprop();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_16_0_0_2_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[980]);
			}
			
			(
				a4 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createMetaprop();
						startIncompleteElement(element);
					}
					if (a4 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.METAPROP__LOCATION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAPROP__LOCATION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_16_0_0_2_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[981]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[982]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[983]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[984]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[985]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[986]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[987]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[988]);
	}
	
	(
		(
			a5 = 'commentsBefore' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetaprop();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_16_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[989]);
			}
			
			a6 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetaprop();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_16_0_0_3_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[990]);
			}
			
			(
				a7 = TEXT				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createMetaprop();
						startIncompleteElement(element);
					}
					if (a7 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.METAPROP__COMMENTS_BEFORE), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, ASP.ASPPackage.METAPROP__COMMENTS_BEFORE, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_16_0_0_3_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a7, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[991]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[992]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[993]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[994]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[995]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[996]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[997]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[998]);
	}
	
	(
		(
			a8 = 'commentsAfter' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetaprop();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_16_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[999]);
			}
			
			a9 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetaprop();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_16_0_0_4_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1000]);
			}
			
			(
				a10 = TEXT				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createMetaprop();
						startIncompleteElement(element);
					}
					if (a10 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.METAPROP__COMMENTS_AFTER), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, ASP.ASPPackage.METAPROP__COMMENTS_AFTER, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_16_0_0_4_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a10, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1001]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1002]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1003]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1004]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1005]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1006]);
	}
	
	(
		(
			a11 = 'name' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetaprop();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_16_0_0_5_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1007]);
			}
			
			a12 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetaprop();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_16_0_0_5_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1008]);
			}
			
			(
				a13 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createMetaprop();
						startIncompleteElement(element);
					}
					if (a13 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a13.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.METAPROP__NAME), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a13).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAPROP__NAME), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_16_0_0_5_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a13, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1009]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1010]);
	}
	
	(
		a14 = 'metamodel' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createMetaprop();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_16_0_0_6_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1011]);
		}
		
		a15 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createMetaprop();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_16_0_0_6_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1012]);
		}
		
		(
			a16 = TEXT			
			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetaprop();
					startIncompleteElement(element);
				}
				if (a16 != null) {
					ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a16.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.METAPROP__METAMODEL), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a16).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a16).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a16).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a16).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					ASP.Metamodel proxy = ASP.ASPFactory.eINSTANCE.createMetamodel();
					collectHiddenTokens(element);
					registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.PatternElement, ASP.Metamodel>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getPatternElementMetamodelReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.METAPROP__METAMODEL), resolved, proxy);
					if (proxy != null) {
						Object value = proxy;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAPROP__METAMODEL), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_16_0_0_6_0_0_2, proxy, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a16, element);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a16, proxy);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1013]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1014]);
	}
	
	(
		a17 = 'metaClass' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createMetaprop();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_16_0_0_7_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1015]);
		}
		
		a18 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createMetaprop();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_16_0_0_7_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1016]);
		}
		
		(
			a19 = QUOTED_34_34			
			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetaprop();
					startIncompleteElement(element);
				}
				if (a19 != null) {
					ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
					tokenResolver.setOptions(getOptions());
					ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a19.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.METAPROP__META_CLASS), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a19).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a19).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a19).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a19).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAPROP__META_CLASS), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_16_0_0_7_0_0_2, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a19, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1017]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1018]);
	}
	
	a20 = '}' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createMetaprop();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_16_0_0_8, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a20, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1019]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1020]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1021]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1022]);
	}
	
;

parse_ASP_Metaedge returns [ASP.Metaedge element = null]
@init{
}
:
	a0 = 'Metaedge' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createMetaedge();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1023]);
	}
	
	a1 = '{' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createMetaedge();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1024]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1025]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1026]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1027]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1028]);
	}
	
	(
		(
			a2 = 'location' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetaedge();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1029]);
			}
			
			a3 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetaedge();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_2_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1030]);
			}
			
			(
				a4 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createMetaedge();
						startIncompleteElement(element);
					}
					if (a4 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__LOCATION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__LOCATION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_2_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1031]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1032]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1033]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1034]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1035]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1036]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1037]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1038]);
	}
	
	(
		(
			a5 = 'commentsBefore' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetaedge();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1039]);
			}
			
			a6 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetaedge();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_3_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1040]);
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
						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__COMMENTS_BEFORE), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, ASP.ASPPackage.METAEDGE__COMMENTS_BEFORE, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_3_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a7, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1041]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1042]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1043]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1044]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1045]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1046]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1047]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1048]);
	}
	
	(
		(
			a8 = 'commentsAfter' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetaedge();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1049]);
			}
			
			a9 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetaedge();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_4_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1050]);
			}
			
			(
				a10 = TEXT				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createMetaedge();
						startIncompleteElement(element);
					}
					if (a10 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__COMMENTS_AFTER), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, ASP.ASPPackage.METAEDGE__COMMENTS_AFTER, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_4_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a10, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1051]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1052]);
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1053]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1054]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1055]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1056]);
	}
	
	(
		(
			a11 = 'name' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetaedge();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_5_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1057]);
			}
			
			a12 = ':' {
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetaedge();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_5_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1058]);
			}
			
			(
				a13 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
					}
					if (element == null) {
						element = ASP.ASPFactory.eINSTANCE.createMetaedge();
						startIncompleteElement(element);
					}
					if (a13 != null) {
						ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a13.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__NAME), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a13).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__NAME), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_5_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a13, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1059]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1060]);
	}
	
	(
		a14 = 'metamodel' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createMetaedge();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_6_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1061]);
		}
		
		a15 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createMetaedge();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_6_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1062]);
		}
		
		(
			a16 = TEXT			
			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetaedge();
					startIncompleteElement(element);
				}
				if (a16 != null) {
					ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a16.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__METAMODEL), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a16).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a16).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a16).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a16).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					ASP.Metamodel proxy = ASP.ASPFactory.eINSTANCE.createMetamodel();
					collectHiddenTokens(element);
					registerContextDependentProxy(new ASP.resource.ASP.mopp.ASPContextDependentURIFragmentFactory<ASP.PatternElement, ASP.Metamodel>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getPatternElementMetamodelReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__METAMODEL), resolved, proxy);
					if (proxy != null) {
						Object value = proxy;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__METAMODEL), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_6_0_0_2, proxy, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a16, element);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a16, proxy);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1063]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1064]);
	}
	
	(
		a17 = 'sourceMetaClass' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createMetaedge();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_7_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1065]);
		}
		
		a18 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createMetaedge();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_7_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1066]);
		}
		
		(
			a19 = QUOTED_34_34			
			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetaedge();
					startIncompleteElement(element);
				}
				if (a19 != null) {
					ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
					tokenResolver.setOptions(getOptions());
					ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a19.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__SOURCE_META_CLASS), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a19).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a19).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a19).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a19).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__SOURCE_META_CLASS), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_7_0_0_2, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a19, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1067]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1068]);
	}
	
	(
		a20 = 'targetMetaClass' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createMetaedge();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_8_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a20, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1069]);
		}
		
		a21 = ':' {
			if (element == null) {
				element = ASP.ASPFactory.eINSTANCE.createMetaedge();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_8_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a21, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1070]);
		}
		
		(
			a22 = QUOTED_34_34			
			{
				if (terminateParsing) {
					throw new ASP.resource.ASP.mopp.ASPTerminateParsingException();
				}
				if (element == null) {
					element = ASP.ASPFactory.eINSTANCE.createMetaedge();
					startIncompleteElement(element);
				}
				if (a22 != null) {
					ASP.resource.ASP.IASPTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
					tokenResolver.setOptions(getOptions());
					ASP.resource.ASP.IASPTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a22.getText(), element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__TARGET_META_CLASS), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a22).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a22).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a22).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a22).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__TARGET_META_CLASS), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_8_0_0_2, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a22, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1071]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1072]);
	}
	
	a23 = '}' {
		if (element == null) {
			element = ASP.ASPFactory.eINSTANCE.createMetaedge();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_9, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a23, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1073]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1074]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1075]);
		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1076]);
	}
	
;

parse_ASP_Element returns [ASP.Element element = null]
:
	c0 = parse_ASP_Not{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_ASP_Eq{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_ASP_EqSimple{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_ASP_NotEq{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_ASP_Literal{ element = c4; /* this is a subclass or primitive expression choice */ }
	|	c5 = parse_ASP_Node{ element = c5; /* this is a subclass or primitive expression choice */ }
	|	c6 = parse_ASP_Prop{ element = c6; /* this is a subclass or primitive expression choice */ }
	|	c7 = parse_ASP_Edge{ element = c7; /* this is a subclass or primitive expression choice */ }
	|	c8 = parse_ASP_Terminal{ element = c8; /* this is a subclass or primitive expression choice */ }
	|	c9 = parse_ASP_Metamodel{ element = c9; /* this is a subclass or primitive expression choice */ }
	|	c10 = parse_ASP_Metanode{ element = c10; /* this is a subclass or primitive expression choice */ }
	|	c11 = parse_ASP_Metaprop{ element = c11; /* this is a subclass or primitive expression choice */ }
	|	c12 = parse_ASP_Metaedge{ element = c12; /* this is a subclass or primitive expression choice */ }
	
;

parse_ASP_PatternElement returns [ASP.PatternElement element = null]
:
	c0 = parse_ASP_Metanode{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_ASP_Metaprop{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_ASP_Metaedge{ element = c2; /* this is a subclass or primitive expression choice */ }
	
;

parse_ASP_ConstraintElement returns [ASP.ConstraintElement element = null]
:
	c0 = parse_ASP_Not{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_ASP_Eq{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_ASP_EqSimple{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_ASP_NotEq{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_ASP_Terminal{ element = c4; /* this is a subclass or primitive expression choice */ }
	
;

parse_ASP_FunctionParameter returns [ASP.FunctionParameter element = null]
:
	c0 = parse_ASP_Eq{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_ASP_EqSimple{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_ASP_NotEq{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_ASP_Literal{ element = c3; /* this is a subclass or primitive expression choice */ }
	
;

parse_ASP_TerminalElement returns [ASP.TerminalElement element = null]
:
	c0 = parse_ASP_Node{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_ASP_Prop{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_ASP_Edge{ element = c2; /* this is a subclass or primitive expression choice */ }
	
;

COMMENT:
	('//'(~('\n'|'\r'|'\uffff'))*)
	{ _channel = 99; }
;
INTEGER:
	(('-')?('1'..'9')('0'..'9')*|'0')
	{ _channel = 99; }
;
FLOAT:
	(('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ )
	{ _channel = 99; }
;
TEXT:
	(('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+)
;
WHITESPACE:
	((' ' | '\t' | '\f'))
	{ _channel = 99; }
;
LINEBREAK:
	(('\r\n' | '\r' | '\n'))
	{ _channel = 99; }
;
QUOTED_34_34:
	(('"')(~('"'))*('"'))
;

