grammar JTLMM;

options {
	superClass = JTLMMANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package JTLMM.resource.JTLMM.mopp;
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
	package JTLMM.resource.JTLMM.mopp;
}

@members{
	private JTLMM.resource.JTLMM.IJTLMMTokenResolverFactory tokenResolverFactory = new JTLMM.resource.JTLMM.mopp.JTLMMTokenResolverFactory();
	
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
	private java.util.List<JTLMM.resource.JTLMM.mopp.JTLMMExpectedTerminal> expectedElements = new java.util.ArrayList<JTLMM.resource.JTLMM.mopp.JTLMMExpectedTerminal>();
	
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
		postParseCommands.add(new JTLMM.resource.JTLMM.IJTLMMCommand<JTLMM.resource.JTLMM.IJTLMMTextResource>() {
			public boolean execute(JTLMM.resource.JTLMM.IJTLMMTextResource resource) {
				if (resource == null) {
					// the resource can be null if the parser is used for code completion
					return true;
				}
				resource.addProblem(new JTLMM.resource.JTLMM.IJTLMMProblem() {
					public JTLMM.resource.JTLMM.JTLMMEProblemSeverity getSeverity() {
						return JTLMM.resource.JTLMM.JTLMMEProblemSeverity.ERROR;
					}
					public JTLMM.resource.JTLMM.JTLMMEProblemType getType() {
						return JTLMM.resource.JTLMM.JTLMMEProblemType.SYNTAX_ERROR;
					}
					public String getMessage() {
						return errorMessage;
					}
					public java.util.Collection<JTLMM.resource.JTLMM.IJTLMMQuickFix> getQuickFixes() {
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
		JTLMM.resource.JTLMM.IJTLMMExpectedElement terminal = JTLMM.resource.JTLMM.grammar.JTLMMFollowSetProvider.TERMINALS[terminalID];
		JTLMM.resource.JTLMM.mopp.JTLMMContainedFeature[] containmentFeatures = new JTLMM.resource.JTLMM.mopp.JTLMMContainedFeature[ids.length - 2];
		for (int i = 2; i < ids.length; i++) {
			containmentFeatures[i - 2] = JTLMM.resource.JTLMM.grammar.JTLMMFollowSetProvider.LINKS[ids[i]];
		}
		JTLMM.resource.JTLMM.grammar.JTLMMContainmentTrace containmentTrace = new JTLMM.resource.JTLMM.grammar.JTLMMContainmentTrace(eClass, containmentFeatures);
		org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
		JTLMM.resource.JTLMM.mopp.JTLMMExpectedTerminal expectedElement = new JTLMM.resource.JTLMM.mopp.JTLMMExpectedTerminal(container, terminal, followSetID, containmentTrace);
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
		postParseCommands.add(new JTLMM.resource.JTLMM.IJTLMMCommand<JTLMM.resource.JTLMM.IJTLMMTextResource>() {
			public boolean execute(JTLMM.resource.JTLMM.IJTLMMTextResource resource) {
				JTLMM.resource.JTLMM.IJTLMMLocationMap locationMap = resource.getLocationMap();
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
		postParseCommands.add(new JTLMM.resource.JTLMM.IJTLMMCommand<JTLMM.resource.JTLMM.IJTLMMTextResource>() {
			public boolean execute(JTLMM.resource.JTLMM.IJTLMMTextResource resource) {
				JTLMM.resource.JTLMM.IJTLMMLocationMap locationMap = resource.getLocationMap();
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
	protected void setLocalizationEnd(java.util.Collection<JTLMM.resource.JTLMM.IJTLMMCommand<JTLMM.resource.JTLMM.IJTLMMTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
		if (disableLocationMap) {
			return;
		}
		postParseCommands.add(new JTLMM.resource.JTLMM.IJTLMMCommand<JTLMM.resource.JTLMM.IJTLMMTextResource>() {
			public boolean execute(JTLMM.resource.JTLMM.IJTLMMTextResource resource) {
				JTLMM.resource.JTLMM.IJTLMMLocationMap locationMap = resource.getLocationMap();
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
	
	public JTLMM.resource.JTLMM.IJTLMMTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
		try {
			if (encoding == null) {
				return new JTLMMParser(new org.antlr.runtime3_4_0.CommonTokenStream(new JTLMMLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream))));
			} else {
				return new JTLMMParser(new org.antlr.runtime3_4_0.CommonTokenStream(new JTLMMLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream, encoding))));
			}
		} catch (java.io.IOException e) {
			new JTLMM.resource.JTLMM.util.JTLMMRuntimeUtil().logError("Error while creating parser.", e);
			return null;
		}
	}
	
	/**
	 * This default constructor is only used to call createInstance() on it.
	 */
	public JTLMMParser() {
		super(null);
	}
	
	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_4_0.RecognitionException {
		this.lastPosition = 0;
		// required because the lexer class can not be subclassed
		((JTLMMLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
		((JTLMMLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
		Object typeObject = getTypeObject();
		if (typeObject == null) {
			return start();
		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
			if (type.getInstanceClass() == JTLMM.JTL.Transformation.class) {
				return parse_JTLMM_JTL_Transformation();
			}
			if (type.getInstanceClass() == JTLMM.JTL.Model.class) {
				return parse_JTLMM_JTL_Model();
			}
			if (type.getInstanceClass() == JTLMM.JTL.Relation.class) {
				return parse_JTLMM_JTL_Relation();
			}
			if (type.getInstanceClass() == JTLMM.JTL.Domain.class) {
				return parse_JTLMM_JTL_Domain();
			}
			if (type.getInstanceClass() == JTLMM.JTL.Pattern.class) {
				return parse_JTLMM_JTL_Pattern();
			}
			if (type.getInstanceClass() == JTLMM.JTL.Predicate.class) {
				return parse_JTLMM_JTL_Predicate();
			}
			if (type.getInstanceClass() == JTLMM.template.ObjectTemplateExp.class) {
				return parse_JTLMM_template_ObjectTemplateExp();
			}
			if (type.getInstanceClass() == JTLMM.imperativeocl.AssignExp.class) {
				return parse_JTLMM_imperativeocl_AssignExp();
			}
			if (type.getInstanceClass() == JTLMM.essentialocl.OperationCallExp.class) {
				return parse_JTLMM_essentialocl_OperationCallExp();
			}
			if (type.getInstanceClass() == JTLMM.essentialocl.BooleanLiteralExp.class) {
				return parse_JTLMM_essentialocl_BooleanLiteralExp();
			}
			if (type.getInstanceClass() == JTLMM.essentialocl.VariableExp.class) {
				return parse_JTLMM_essentialocl_VariableExp();
			}
			if (type.getInstanceClass() == JTLMM.essentialocl.StringLiteralExp.class) {
				return parse_JTLMM_essentialocl_StringLiteralExp();
			}
			if (type.getInstanceClass() == JTLMM.essentialocl.Variable.class) {
				return parse_JTLMM_essentialocl_Variable();
			}
		}
		throw new JTLMM.resource.JTLMM.mopp.JTLMMUnexpectedContentTypeException(typeObject);
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
			typeObject = options.get(JTLMM.resource.JTLMM.IJTLMMOptions.RESOURCE_CONTENT_TYPE);
		}
		return typeObject;
	}
	
	/**
	 * Implementation that calls {@link #doParse()} and handles the thrown
	 * RecognitionExceptions.
	 */
	public JTLMM.resource.JTLMM.IJTLMMParseResult parse() {
		terminateParsing = false;
		postParseCommands = new java.util.ArrayList<JTLMM.resource.JTLMM.IJTLMMCommand<JTLMM.resource.JTLMM.IJTLMMTextResource>>();
		JTLMM.resource.JTLMM.mopp.JTLMMParseResult parseResult = new JTLMM.resource.JTLMM.mopp.JTLMMParseResult();
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
	
	public java.util.List<JTLMM.resource.JTLMM.mopp.JTLMMExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, JTLMM.resource.JTLMM.IJTLMMTextResource dummyResource, int cursorOffset) {
		this.rememberExpectedElements = true;
		this.parseToIndexTypeObject = type;
		this.cursorOffset = cursorOffset;
		this.lastStartIncludingHidden = -1;
		final org.antlr.runtime3_4_0.CommonTokenStream tokenStream = (org.antlr.runtime3_4_0.CommonTokenStream) getTokenStream();
		JTLMM.resource.JTLMM.IJTLMMParseResult result = parse();
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
			for (JTLMM.resource.JTLMM.IJTLMMCommand<JTLMM.resource.JTLMM.IJTLMMTextResource> command : result.getPostParseCommands()) {
				command.execute(dummyResource);
			}
		}
		// remove all expected elements that were added after the last complete element
		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
		java.util.Set<JTLMM.resource.JTLMM.mopp.JTLMMExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<JTLMM.resource.JTLMM.mopp.JTLMMExpectedTerminal>();
		java.util.List<JTLMM.resource.JTLMM.mopp.JTLMMExpectedTerminal> newFollowSet = new java.util.ArrayList<JTLMM.resource.JTLMM.mopp.JTLMMExpectedTerminal>();
		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
			JTLMM.resource.JTLMM.mopp.JTLMMExpectedTerminal expectedElementI = expectedElements.get(i);
			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
				currentFollowSet.add(expectedElementI);
			} else {
				break;
			}
		}
		int followSetID = 92;
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
				for (JTLMM.resource.JTLMM.mopp.JTLMMExpectedTerminal nextFollow : newFollowSet) {
					lastTokenIndex = 0;
					setPosition(nextFollow, i);
				}
				newFollowSet.clear();
				// normal tokens do reduce the follow set - only elements that match the token are
				// kept
				for (JTLMM.resource.JTLMM.mopp.JTLMMExpectedTerminal nextFollow : currentFollowSet) {
					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
						// keep this one - it matches
						java.util.Collection<JTLMM.resource.JTLMM.util.JTLMMPair<JTLMM.resource.JTLMM.IJTLMMExpectedElement, JTLMM.resource.JTLMM.mopp.JTLMMContainedFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
						for (JTLMM.resource.JTLMM.util.JTLMMPair<JTLMM.resource.JTLMM.IJTLMMExpectedElement, JTLMM.resource.JTLMM.mopp.JTLMMContainedFeature[]> newFollowerPair : newFollowers) {
							JTLMM.resource.JTLMM.IJTLMMExpectedElement newFollower = newFollowerPair.getLeft();
							org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
							JTLMM.resource.JTLMM.grammar.JTLMMContainmentTrace containmentTrace = new JTLMM.resource.JTLMM.grammar.JTLMMContainmentTrace(null, newFollowerPair.getRight());
							JTLMM.resource.JTLMM.mopp.JTLMMExpectedTerminal newFollowTerminal = new JTLMM.resource.JTLMM.mopp.JTLMMExpectedTerminal(container, newFollower, followSetID, containmentTrace);
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
		for (JTLMM.resource.JTLMM.mopp.JTLMMExpectedTerminal nextFollow : newFollowSet) {
			lastTokenIndex = 0;
			setPosition(nextFollow, i);
		}
		return this.expectedElements;
	}
	
	public void setPosition(JTLMM.resource.JTLMM.mopp.JTLMMExpectedTerminal expectedElement, int tokenIndex) {
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
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[0]);
		expectedElementsIndexOfLastCompleteElement = 0;
	}
	(
		c0 = parse_JTLMM_JTL_Transformation{ element = c0; }
	)
	EOF	{
		retrieveLayoutInformation(element, null, null, false);
	}
	
;

parse_JTLMM_JTL_Transformation returns [JTLMM.JTL.Transformation element = null]
@init{
}
:
	a0 = 'transformation' {
		if (element == null) {
			element = JTLMM.JTL.JTLFactory.eINSTANCE.createTransformation();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_0_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[1]);
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new JTLMM.resource.JTLMM.mopp.JTLMMTerminateParsingException();
			}
			if (element == null) {
				element = JTLMM.JTL.JTLFactory.eINSTANCE.createTransformation();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				JTLMM.resource.JTLMM.IJTLMMTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				JTLMM.resource.JTLMM.IJTLMMTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.TRANSFORMATION__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.TRANSFORMATION__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_0_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[2]);
	}
	
	a2 = '(' {
		if (element == null) {
			element = JTLMM.JTL.JTLFactory.eINSTANCE.createTransformation();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_0_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getTransformation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[3]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[4]);
	}
	
	(
		(
			(
				a3_0 = parse_JTLMM_JTL_Model				{
					if (terminateParsing) {
						throw new JTLMM.resource.JTLMM.mopp.JTLMMTerminateParsingException();
					}
					if (element == null) {
						element = JTLMM.JTL.JTLFactory.eINSTANCE.createTransformation();
						startIncompleteElement(element);
					}
					if (a3_0 != null) {
						if (a3_0 != null) {
							Object value = a3_0;
							addObjectToList(element, JTLMM.JTL.JTLPackage.TRANSFORMATION__MODEL_PARAMETER, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_0_0_0_4_0_0_0, a3_0, true);
						copyLocalizationInfos(a3_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[5]);
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[6]);
			}
			
			(
				(
					a4 = ',' {
						if (element == null) {
							element = JTLMM.JTL.JTLFactory.eINSTANCE.createTransformation();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_0_0_0_4_0_0_1_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getTransformation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[7]);
					}
					
					(
						a5_0 = parse_JTLMM_JTL_Model						{
							if (terminateParsing) {
								throw new JTLMM.resource.JTLMM.mopp.JTLMMTerminateParsingException();
							}
							if (element == null) {
								element = JTLMM.JTL.JTLFactory.eINSTANCE.createTransformation();
								startIncompleteElement(element);
							}
							if (a5_0 != null) {
								if (a5_0 != null) {
									Object value = a5_0;
									addObjectToList(element, JTLMM.JTL.JTLPackage.TRANSFORMATION__MODEL_PARAMETER, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_0_0_0_4_0_0_1_0_0_2, a5_0, true);
								copyLocalizationInfos(a5_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[8]);
						addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[9]);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[10]);
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[11]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[12]);
	}
	
	a6 = ')' {
		if (element == null) {
			element = JTLMM.JTL.JTLFactory.eINSTANCE.createTransformation();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_0_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[13]);
	}
	
	a7 = '{' {
		if (element == null) {
			element = JTLMM.JTL.JTLFactory.eINSTANCE.createTransformation();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_0_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getTransformation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[14]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getTransformation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[15]);
	}
	
	(
		(
			(
				a8_0 = parse_JTLMM_JTL_Relation				{
					if (terminateParsing) {
						throw new JTLMM.resource.JTLMM.mopp.JTLMMTerminateParsingException();
					}
					if (element == null) {
						element = JTLMM.JTL.JTLFactory.eINSTANCE.createTransformation();
						startIncompleteElement(element);
					}
					if (a8_0 != null) {
						if (a8_0 != null) {
							Object value = a8_0;
							addObjectToList(element, JTLMM.JTL.JTLPackage.TRANSFORMATION__RELATION, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_0_0_0_8_0_0_1, a8_0, true);
						copyLocalizationInfos(a8_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getTransformation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[16]);
				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getTransformation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[17]);
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[18]);
			}
			
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getTransformation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[19]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getTransformation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[20]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[21]);
	}
	
	a9 = '}' {
		if (element == null) {
			element = JTLMM.JTL.JTLFactory.eINSTANCE.createTransformation();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_0_0_0_10, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
	}
	{
		// expected elements (follow set)
	}
	
;

parse_JTLMM_JTL_Model returns [JTLMM.JTL.Model element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new JTLMM.resource.JTLMM.mopp.JTLMMTerminateParsingException();
			}
			if (element == null) {
				element = JTLMM.JTL.JTLFactory.eINSTANCE.createModel();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				JTLMM.resource.JTLMM.IJTLMMTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				JTLMM.resource.JTLMM.IJTLMMTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.MODEL__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.MODEL__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_1_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[22]);
	}
	
	a1 = ':' {
		if (element == null) {
			element = JTLMM.JTL.JTLFactory.eINSTANCE.createModel();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_1_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[23]);
	}
	
	(
		a2 = TEXT		
		{
			if (terminateParsing) {
				throw new JTLMM.resource.JTLMM.mopp.JTLMMTerminateParsingException();
			}
			if (element == null) {
				element = JTLMM.JTL.JTLFactory.eINSTANCE.createModel();
				startIncompleteElement(element);
			}
			if (a2 != null) {
				JTLMM.resource.JTLMM.IJTLMMTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				JTLMM.resource.JTLMM.IJTLMMTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.MODEL__USED_PACKAGE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.MODEL__USED_PACKAGE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_1_0_0_2, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[24]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[25]);
	}
	
;

parse_JTLMM_JTL_Relation returns [JTLMM.JTL.Relation element = null]
@init{
}
:
	(
		(
			a0 = 'top' {
				if (element == null) {
					element = JTLMM.JTL.JTLFactory.eINSTANCE.createRelation();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.RELATION__IS_TOP_LEVEL), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_2_0_0_0, true, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
				// set value of boolean attribute
				Object value = true;
				element.eSet(element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.RELATION__IS_TOP_LEVEL), value);
				completedElement(value, false);
			}
		)?	)
	{
		// expected elements (follow set)
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[26]);
	}
	
	a3 = 'relation' {
		if (element == null) {
			element = JTLMM.JTL.JTLFactory.eINSTANCE.createRelation();
			startIncompleteElement(element);
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.RELATION__IS_TOP_LEVEL), value);
			}
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_2_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[27]);
	}
	
	(
		a4 = TEXT		
		{
			if (terminateParsing) {
				throw new JTLMM.resource.JTLMM.mopp.JTLMMTerminateParsingException();
			}
			if (element == null) {
				element = JTLMM.JTL.JTLFactory.eINSTANCE.createRelation();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.RELATION__IS_TOP_LEVEL), value);
				}
			}
			if (a4 != null) {
				JTLMM.resource.JTLMM.IJTLMMTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				JTLMM.resource.JTLMM.IJTLMMTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.RELATION__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.RELATION__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_2_0_0_2, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[28]);
	}
	
	a5 = '{' {
		if (element == null) {
			element = JTLMM.JTL.JTLFactory.eINSTANCE.createRelation();
			startIncompleteElement(element);
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.RELATION__IS_TOP_LEVEL), value);
			}
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_2_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[29]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[30]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[31]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[32]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[33]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[34]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[35]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[36]);
	}
	
	(
		(
			(
				a6_0 = parse_JTLMM_essentialocl_Variable				{
					if (terminateParsing) {
						throw new JTLMM.resource.JTLMM.mopp.JTLMMTerminateParsingException();
					}
					if (element == null) {
						element = JTLMM.JTL.JTLFactory.eINSTANCE.createRelation();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.RELATION__IS_TOP_LEVEL), value);
						}
					}
					if (a6_0 != null) {
						if (a6_0 != null) {
							Object value = a6_0;
							addObjectToList(element, JTLMM.JTL.JTLPackage.RELATION__VARIABLE, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_2_0_0_5_0_0_1, a6_0, true);
						copyLocalizationInfos(a6_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[37]);
				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[38]);
				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[39]);
				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[40]);
				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[41]);
				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[42]);
				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[43]);
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[44]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[45]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[46]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[47]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[48]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[49]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[50]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[51]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[52]);
	}
	
	(
		(
			(
				a7_0 = parse_JTLMM_JTL_Domain				{
					if (terminateParsing) {
						throw new JTLMM.resource.JTLMM.mopp.JTLMMTerminateParsingException();
					}
					if (element == null) {
						element = JTLMM.JTL.JTLFactory.eINSTANCE.createRelation();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.RELATION__IS_TOP_LEVEL), value);
						}
					}
					if (a7_0 != null) {
						if (a7_0 != null) {
							Object value = a7_0;
							addObjectToList(element, JTLMM.JTL.JTLPackage.RELATION__DOMAIN, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_2_0_0_6_0_0_1, a7_0, true);
						copyLocalizationInfos(a7_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[53]);
				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[54]);
				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[55]);
				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[56]);
				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[57]);
				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[58]);
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[59]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[60]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[61]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[62]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[63]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[64]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[65]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[66]);
	}
	
	(
		(
			(
				a8_0 = parse_JTLMM_JTL_Pattern				{
					if (terminateParsing) {
						throw new JTLMM.resource.JTLMM.mopp.JTLMMTerminateParsingException();
					}
					if (element == null) {
						element = JTLMM.JTL.JTLFactory.eINSTANCE.createRelation();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.RELATION__IS_TOP_LEVEL), value);
						}
					}
					if (a8_0 != null) {
						if (a8_0 != null) {
							Object value = a8_0;
							element.eSet(element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.RELATION__WHEN), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_2_0_0_7_0_0_1, a8_0, true);
						copyLocalizationInfos(a8_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[67]);
				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[68]);
				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[69]);
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[70]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[71]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[72]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[73]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[74]);
	}
	
	(
		(
			(
				a9_0 = parse_JTLMM_JTL_Pattern				{
					if (terminateParsing) {
						throw new JTLMM.resource.JTLMM.mopp.JTLMMTerminateParsingException();
					}
					if (element == null) {
						element = JTLMM.JTL.JTLFactory.eINSTANCE.createRelation();
						startIncompleteElement(element);
						// initialize boolean attribute
						{
							Object value = false;
							element.eSet(element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.RELATION__IS_TOP_LEVEL), value);
						}
					}
					if (a9_0 != null) {
						if (a9_0 != null) {
							Object value = a9_0;
							element.eSet(element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.RELATION__WHERE), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_2_0_0_8_0_0_1, a9_0, true);
						copyLocalizationInfos(a9_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[75]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[76]);
	}
	
	a10 = '}' {
		if (element == null) {
			element = JTLMM.JTL.JTLFactory.eINSTANCE.createRelation();
			startIncompleteElement(element);
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.RELATION__IS_TOP_LEVEL), value);
			}
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_2_0_0_10, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getTransformation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[77]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getTransformation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[78]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[79]);
	}
	
;

parse_JTLMM_JTL_Domain returns [JTLMM.JTL.Domain element = null]
@init{
}
:
	(
		(
			a0 = 'checkonly' {
				if (element == null) {
					element = JTLMM.JTL.JTLFactory.eINSTANCE.createDomain();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.DOMAIN__IS_CHECKABLE), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.DOMAIN__IS_ENFORCEABLE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_3_0_0_0, true, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
				// set value of boolean attribute
				Object value = true;
				element.eSet(element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.DOMAIN__IS_CHECKABLE), value);
				completedElement(value, false);
			}
		)?	)
	{
		// expected elements (follow set)
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[80]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[81]);
	}
	
	(
		(
			a3 = 'enforce' {
				if (element == null) {
					element = JTLMM.JTL.JTLFactory.eINSTANCE.createDomain();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.DOMAIN__IS_CHECKABLE), value);
					}
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.DOMAIN__IS_ENFORCEABLE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_3_0_0_1, true, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
				// set value of boolean attribute
				Object value = true;
				element.eSet(element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.DOMAIN__IS_ENFORCEABLE), value);
				completedElement(value, false);
			}
		)?	)
	{
		// expected elements (follow set)
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[82]);
	}
	
	a6 = 'domain' {
		if (element == null) {
			element = JTLMM.JTL.JTLFactory.eINSTANCE.createDomain();
			startIncompleteElement(element);
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.DOMAIN__IS_CHECKABLE), value);
			}
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.DOMAIN__IS_ENFORCEABLE), value);
			}
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_3_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[83]);
	}
	
	(
		a7 = TEXT		
		{
			if (terminateParsing) {
				throw new JTLMM.resource.JTLMM.mopp.JTLMMTerminateParsingException();
			}
			if (element == null) {
				element = JTLMM.JTL.JTLFactory.eINSTANCE.createDomain();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.DOMAIN__IS_CHECKABLE), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.DOMAIN__IS_ENFORCEABLE), value);
				}
			}
			if (a7 != null) {
				JTLMM.resource.JTLMM.IJTLMMTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				JTLMM.resource.JTLMM.IJTLMMTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.DOMAIN__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.DOMAIN__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_3_0_0_3, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a7, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getDomain(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[84]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getDomain(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[85]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getDomain(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[86]);
	}
	
	(
		a8_0 = parse_JTLMM_JTL_Pattern		{
			if (terminateParsing) {
				throw new JTLMM.resource.JTLMM.mopp.JTLMMTerminateParsingException();
			}
			if (element == null) {
				element = JTLMM.JTL.JTLFactory.eINSTANCE.createDomain();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.DOMAIN__IS_CHECKABLE), value);
				}
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.DOMAIN__IS_ENFORCEABLE), value);
				}
			}
			if (a8_0 != null) {
				if (a8_0 != null) {
					Object value = a8_0;
					element.eSet(element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.DOMAIN__PATTERN), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_3_0_0_4, a8_0, true);
				copyLocalizationInfos(a8_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[87]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[88]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[89]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[90]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[91]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[92]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[93]);
	}
	
;

parse_JTLMM_JTL_Pattern returns [JTLMM.JTL.Pattern element = null]
@init{
}
:
	a0 = 'when' {
		if (element == null) {
			element = JTLMM.JTL.JTLFactory.eINSTANCE.createPattern();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_4_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[94]);
	}
	
	a1 = '{' {
		if (element == null) {
			element = JTLMM.JTL.JTLFactory.eINSTANCE.createPattern();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_4_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[95]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[96]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[97]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[98]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[99]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[100]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[101]);
	}
	
	(
		(
			(
				a2_0 = parse_JTLMM_JTL_Predicate				{
					if (terminateParsing) {
						throw new JTLMM.resource.JTLMM.mopp.JTLMMTerminateParsingException();
					}
					if (element == null) {
						element = JTLMM.JTL.JTLFactory.eINSTANCE.createPattern();
						startIncompleteElement(element);
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							Object value = a2_0;
							addObjectToList(element, JTLMM.JTL.JTLPackage.PATTERN__PREDICATE, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_4_0_0_3_0_0_1, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[102]);
			}
			
			a3 = ';' {
				if (element == null) {
					element = JTLMM.JTL.JTLFactory.eINSTANCE.createPattern();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_4_0_0_3_0_0_2, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[103]);
				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[104]);
				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[105]);
				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[106]);
				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[107]);
				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[108]);
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[109]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[110]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[111]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[112]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[113]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[114]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[115]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[116]);
	}
	
	a4 = '}' {
		if (element == null) {
			element = JTLMM.JTL.JTLFactory.eINSTANCE.createPattern();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_4_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[117]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[118]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[119]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[120]);
	}
	
	
	|	a5 = 'where' {
		if (element == null) {
			element = JTLMM.JTL.JTLFactory.eINSTANCE.createPattern();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_4_0_1_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[121]);
	}
	
	a6 = '{' {
		if (element == null) {
			element = JTLMM.JTL.JTLFactory.eINSTANCE.createPattern();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_4_0_1_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[122]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[123]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[124]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[125]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[126]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[127]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[128]);
	}
	
	(
		(
			(
				a7_0 = parse_JTLMM_JTL_Predicate				{
					if (terminateParsing) {
						throw new JTLMM.resource.JTLMM.mopp.JTLMMTerminateParsingException();
					}
					if (element == null) {
						element = JTLMM.JTL.JTLFactory.eINSTANCE.createPattern();
						startIncompleteElement(element);
					}
					if (a7_0 != null) {
						if (a7_0 != null) {
							Object value = a7_0;
							addObjectToList(element, JTLMM.JTL.JTLPackage.PATTERN__PREDICATE, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_4_0_1_3_0_0_1, a7_0, true);
						copyLocalizationInfos(a7_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[129]);
			}
			
			a8 = ';' {
				if (element == null) {
					element = JTLMM.JTL.JTLFactory.eINSTANCE.createPattern();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_4_0_1_3_0_0_2, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[130]);
				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[131]);
				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[132]);
				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[133]);
				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[134]);
				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[135]);
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[136]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[137]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[138]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[139]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[140]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[141]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[142]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[143]);
	}
	
	a9 = '}' {
		if (element == null) {
			element = JTLMM.JTL.JTLFactory.eINSTANCE.createPattern();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_4_0_1_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[144]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[145]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[146]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[147]);
	}
	
	
	|	(
		a10_0 = parse_JTLMM_template_TemplateExp		{
			if (terminateParsing) {
				throw new JTLMM.resource.JTLMM.mopp.JTLMMTerminateParsingException();
			}
			if (element == null) {
				element = JTLMM.JTL.JTLFactory.eINSTANCE.createPattern();
				startIncompleteElement(element);
			}
			if (a10_0 != null) {
				if (a10_0 != null) {
					Object value = a10_0;
					element.eSet(element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.PATTERN__TEMPLATE_EXPRESSION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_4_0_2_0, a10_0, true);
				copyLocalizationInfos(a10_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[148]);
	}
	
	a11 = '{' {
		if (element == null) {
			element = JTLMM.JTL.JTLFactory.eINSTANCE.createPattern();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_4_0_2_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[149]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[150]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[151]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[152]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[153]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[154]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[155]);
	}
	
	(
		(
			(
				a12_0 = parse_JTLMM_JTL_Predicate				{
					if (terminateParsing) {
						throw new JTLMM.resource.JTLMM.mopp.JTLMMTerminateParsingException();
					}
					if (element == null) {
						element = JTLMM.JTL.JTLFactory.eINSTANCE.createPattern();
						startIncompleteElement(element);
					}
					if (a12_0 != null) {
						if (a12_0 != null) {
							Object value = a12_0;
							addObjectToList(element, JTLMM.JTL.JTLPackage.PATTERN__PREDICATE, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_4_0_2_3_0_0_1, a12_0, true);
						copyLocalizationInfos(a12_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[156]);
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[157]);
			}
			
			(
				(
					a13 = ',' {
						if (element == null) {
							element = JTLMM.JTL.JTLFactory.eINSTANCE.createPattern();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_4_0_2_3_0_0_2_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[158]);
						addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[159]);
						addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[160]);
						addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[161]);
						addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[162]);
						addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[163]);
					}
					
					(
						a14_0 = parse_JTLMM_JTL_Predicate						{
							if (terminateParsing) {
								throw new JTLMM.resource.JTLMM.mopp.JTLMMTerminateParsingException();
							}
							if (element == null) {
								element = JTLMM.JTL.JTLFactory.eINSTANCE.createPattern();
								startIncompleteElement(element);
							}
							if (a14_0 != null) {
								if (a14_0 != null) {
									Object value = a14_0;
									addObjectToList(element, JTLMM.JTL.JTLPackage.PATTERN__PREDICATE, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_4_0_2_3_0_0_2_0_0_2, a14_0, true);
								copyLocalizationInfos(a14_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[164]);
						addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[165]);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[166]);
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[167]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[168]);
	}
	
	a15 = '};' {
		if (element == null) {
			element = JTLMM.JTL.JTLFactory.eINSTANCE.createPattern();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_4_0_2_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[169]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[170]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[171]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[172]);
	}
	
;

parse_JTLMM_JTL_Predicate returns [JTLMM.JTL.Predicate element = null]
@init{
}
:
	(
		a0_0 = parse_JTLMM_essentialocl_OclExpression		{
			if (terminateParsing) {
				throw new JTLMM.resource.JTLMM.mopp.JTLMMTerminateParsingException();
			}
			if (element == null) {
				element = JTLMM.JTL.JTLFactory.eINSTANCE.createPredicate();
				startIncompleteElement(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(JTLMM.JTL.JTLPackage.PREDICATE__CONDITION_EXPRESSION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_5_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[173]);
	}
	
;

parse_JTLMM_template_ObjectTemplateExp returns [JTLMM.template.ObjectTemplateExp element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new JTLMM.resource.JTLMM.mopp.JTLMMTerminateParsingException();
			}
			if (element == null) {
				element = JTLMM.template.TemplateFactory.eINSTANCE.createObjectTemplateExp();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				JTLMM.resource.JTLMM.IJTLMMTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				JTLMM.resource.JTLMM.IJTLMMTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(JTLMM.template.TemplatePackage.OBJECT_TEMPLATE_EXP__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(JTLMM.template.TemplatePackage.OBJECT_TEMPLATE_EXP__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_6_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[174]);
	}
	
	a1 = ':' {
		if (element == null) {
			element = JTLMM.template.TemplateFactory.eINSTANCE.createObjectTemplateExp();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_6_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[175]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[176]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[177]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[178]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[179]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[180]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[181]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[182]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[183]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[184]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[185]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[186]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[187]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[188]);
	}
	
	(
		(
			(
				a2 = TEXT				
				{
					if (terminateParsing) {
						throw new JTLMM.resource.JTLMM.mopp.JTLMMTerminateParsingException();
					}
					if (element == null) {
						element = JTLMM.template.TemplateFactory.eINSTANCE.createObjectTemplateExp();
						startIncompleteElement(element);
					}
					if (a2 != null) {
						JTLMM.resource.JTLMM.IJTLMMTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						JTLMM.resource.JTLMM.IJTLMMTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(JTLMM.template.TemplatePackage.OBJECT_TEMPLATE_EXP__TYPE), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(JTLMM.template.TemplatePackage.OBJECT_TEMPLATE_EXP__TYPE), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_6_0_0_3_0_0_1, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[189]);
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[190]);
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[191]);
				addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[192]);
				addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[193]);
				addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[194]);
				addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[195]);
				addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[196]);
				addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[197]);
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[198]);
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[199]);
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[200]);
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[201]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[202]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[203]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[204]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[205]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[206]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[207]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[208]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[209]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[210]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[211]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[212]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[213]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[214]);
	}
	
	(
		(
			a3 = '::' {
				if (element == null) {
					element = JTLMM.template.TemplateFactory.eINSTANCE.createObjectTemplateExp();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_6_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[215]);
			}
			
			(
				a4 = TEXT				
				{
					if (terminateParsing) {
						throw new JTLMM.resource.JTLMM.mopp.JTLMMTerminateParsingException();
					}
					if (element == null) {
						element = JTLMM.template.TemplateFactory.eINSTANCE.createObjectTemplateExp();
						startIncompleteElement(element);
					}
					if (a4 != null) {
						JTLMM.resource.JTLMM.IJTLMMTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						JTLMM.resource.JTLMM.IJTLMMTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(JTLMM.template.TemplatePackage.OBJECT_TEMPLATE_EXP__REFERRED_CLASS), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(JTLMM.template.TemplatePackage.OBJECT_TEMPLATE_EXP__REFERRED_CLASS), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_6_0_0_4_0_0_1, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[216]);
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[217]);
				addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[218]);
				addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[219]);
				addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[220]);
				addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[221]);
				addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[222]);
				addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[223]);
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[224]);
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[225]);
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[226]);
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[227]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[228]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[229]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[230]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[231]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[232]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[233]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[234]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[235]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[236]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[237]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[238]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[239]);
	}
	
	(
		(
			a5 = '{' {
				if (element == null) {
					element = JTLMM.template.TemplateFactory.eINSTANCE.createObjectTemplateExp();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_6_0_0_5_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(JTLMM.template.TemplatePackage.eINSTANCE.getObjectTemplateExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[240]);
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[241]);
			}
			
			(
				(
					(
						a6_0 = parse_JTLMM_imperativeocl_AssignExp						{
							if (terminateParsing) {
								throw new JTLMM.resource.JTLMM.mopp.JTLMMTerminateParsingException();
							}
							if (element == null) {
								element = JTLMM.template.TemplateFactory.eINSTANCE.createObjectTemplateExp();
								startIncompleteElement(element);
							}
							if (a6_0 != null) {
								if (a6_0 != null) {
									Object value = a6_0;
									addObjectToList(element, JTLMM.template.TemplatePackage.OBJECT_TEMPLATE_EXP__INSIDE, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_6_0_0_5_0_0_2_0_0_1, a6_0, true);
								copyLocalizationInfos(a6_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[242]);
						addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[243]);
					}
					
					(
						(
							a7 = ',' {
								if (element == null) {
									element = JTLMM.template.TemplateFactory.eINSTANCE.createObjectTemplateExp();
									startIncompleteElement(element);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_6_0_0_5_0_0_2_0_0_2_0_0_0, null, true);
								copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
							}
							{
								// expected elements (follow set)
								addExpectedElement(JTLMM.template.TemplatePackage.eINSTANCE.getObjectTemplateExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[244]);
							}
							
							(
								a8_0 = parse_JTLMM_imperativeocl_AssignExp								{
									if (terminateParsing) {
										throw new JTLMM.resource.JTLMM.mopp.JTLMMTerminateParsingException();
									}
									if (element == null) {
										element = JTLMM.template.TemplateFactory.eINSTANCE.createObjectTemplateExp();
										startIncompleteElement(element);
									}
									if (a8_0 != null) {
										if (a8_0 != null) {
											Object value = a8_0;
											addObjectToList(element, JTLMM.template.TemplatePackage.OBJECT_TEMPLATE_EXP__INSIDE, value);
											completedElement(value, true);
										}
										collectHiddenTokens(element);
										retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_6_0_0_5_0_0_2_0_0_2_0_0_2, a8_0, true);
										copyLocalizationInfos(a8_0, element);
									}
								}
							)
							{
								// expected elements (follow set)
								addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[245]);
								addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[246]);
							}
							
						)
						
					)*					{
						// expected elements (follow set)
						addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[247]);
						addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[248]);
					}
					
				)
				
			)?			{
				// expected elements (follow set)
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[249]);
			}
			
			a9 = '}' {
				if (element == null) {
					element = JTLMM.template.TemplateFactory.eINSTANCE.createObjectTemplateExp();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_6_0_0_5_0_0_4, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[250]);
				addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[251]);
				addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[252]);
				addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[253]);
				addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[254]);
				addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[255]);
				addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[256]);
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[257]);
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[258]);
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[259]);
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[260]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[261]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[262]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[263]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[264]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[265]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[266]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[267]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[268]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[269]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[270]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[271]);
	}
	
;

parse_JTLMM_imperativeocl_AssignExp returns [JTLMM.imperativeocl.AssignExp element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new JTLMM.resource.JTLMM.mopp.JTLMMTerminateParsingException();
			}
			if (element == null) {
				element = JTLMM.imperativeocl.ImperativeoclFactory.eINSTANCE.createAssignExp();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				JTLMM.resource.JTLMM.IJTLMMTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				JTLMM.resource.JTLMM.IJTLMMTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(JTLMM.imperativeocl.ImperativeoclPackage.ASSIGN_EXP__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(JTLMM.imperativeocl.ImperativeoclPackage.ASSIGN_EXP__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_7_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[272]);
	}
	
	a1 = '=' {
		if (element == null) {
			element = JTLMM.imperativeocl.ImperativeoclFactory.eINSTANCE.createAssignExp();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_7_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[273]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[274]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[275]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[276]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[277]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[278]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[279]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[280]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[281]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[282]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[283]);
	}
	
	(
		(
			a2_0 = parse_JTLMM_essentialocl_OclExpression			{
				if (terminateParsing) {
					throw new JTLMM.resource.JTLMM.mopp.JTLMMTerminateParsingException();
				}
				if (element == null) {
					element = JTLMM.imperativeocl.ImperativeoclFactory.eINSTANCE.createAssignExp();
					startIncompleteElement(element);
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						Object value = a2_0;
						addObjectToList(element, JTLMM.imperativeocl.ImperativeoclPackage.ASSIGN_EXP__VALUE, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_7_0_0_4, a2_0, true);
					copyLocalizationInfos(a2_0, element);
				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[284]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[285]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[286]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[287]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[288]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[289]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[290]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[291]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[292]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[293]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[294]);
	}
	
;

parse_JTLMM_essentialocl_OperationCallExp returns [JTLMM.essentialocl.OperationCallExp element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new JTLMM.resource.JTLMM.mopp.JTLMMTerminateParsingException();
			}
			if (element == null) {
				element = JTLMM.essentialocl.EssentialoclFactory.eINSTANCE.createOperationCallExp();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				JTLMM.resource.JTLMM.IJTLMMTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				JTLMM.resource.JTLMM.IJTLMMTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(JTLMM.essentialocl.EssentialoclPackage.OPERATION_CALL_EXP__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(JTLMM.essentialocl.EssentialoclPackage.OPERATION_CALL_EXP__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_8_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[295]);
	}
	
	a1 = '(' {
		if (element == null) {
			element = JTLMM.essentialocl.EssentialoclFactory.eINSTANCE.createOperationCallExp();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_8_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getOperationCallExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[296]);
		addExpectedElement(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getOperationCallExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[297]);
		addExpectedElement(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getOperationCallExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[298]);
		addExpectedElement(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getOperationCallExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[299]);
		addExpectedElement(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getOperationCallExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[300]);
		addExpectedElement(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getOperationCallExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[301]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[302]);
	}
	
	(
		(
			(
				a2_0 = parse_JTLMM_essentialocl_OclExpression				{
					if (terminateParsing) {
						throw new JTLMM.resource.JTLMM.mopp.JTLMMTerminateParsingException();
					}
					if (element == null) {
						element = JTLMM.essentialocl.EssentialoclFactory.eINSTANCE.createOperationCallExp();
						startIncompleteElement(element);
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							Object value = a2_0;
							addObjectToList(element, JTLMM.essentialocl.EssentialoclPackage.OPERATION_CALL_EXP__ARGUMENT, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_8_0_0_2_0_0_0, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[303]);
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[304]);
			}
			
			(
				(
					a3 = ',' {
						if (element == null) {
							element = JTLMM.essentialocl.EssentialoclFactory.eINSTANCE.createOperationCallExp();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_8_0_0_2_0_0_1_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getOperationCallExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[305]);
						addExpectedElement(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getOperationCallExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[306]);
						addExpectedElement(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getOperationCallExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[307]);
						addExpectedElement(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getOperationCallExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[308]);
						addExpectedElement(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getOperationCallExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[309]);
						addExpectedElement(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getOperationCallExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[310]);
					}
					
					(
						a4_0 = parse_JTLMM_essentialocl_OclExpression						{
							if (terminateParsing) {
								throw new JTLMM.resource.JTLMM.mopp.JTLMMTerminateParsingException();
							}
							if (element == null) {
								element = JTLMM.essentialocl.EssentialoclFactory.eINSTANCE.createOperationCallExp();
								startIncompleteElement(element);
							}
							if (a4_0 != null) {
								if (a4_0 != null) {
									Object value = a4_0;
									addObjectToList(element, JTLMM.essentialocl.EssentialoclPackage.OPERATION_CALL_EXP__ARGUMENT, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_8_0_0_2_0_0_1_0_0_1, a4_0, true);
								copyLocalizationInfos(a4_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[311]);
						addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[312]);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[313]);
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[314]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[315]);
	}
	
	a5 = ')' {
		if (element == null) {
			element = JTLMM.essentialocl.EssentialoclFactory.eINSTANCE.createOperationCallExp();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_8_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[316]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[317]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[318]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[319]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[320]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[321]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[322]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[323]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[324]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[325]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[326]);
	}
	
;

parse_JTLMM_essentialocl_BooleanLiteralExp returns [JTLMM.essentialocl.BooleanLiteralExp element = null]
@init{
}
:
	(
		(
			a0 = 'true' {
				if (element == null) {
					element = JTLMM.essentialocl.EssentialoclFactory.eINSTANCE.createBooleanLiteralExp();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_9_0_0_0, true, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
				// set value of boolean attribute
				Object value = true;
				element.eSet(element.eClass().getEStructuralFeature(JTLMM.essentialocl.EssentialoclPackage.BOOLEAN_LITERAL_EXP__BOOLEAN_SYMBOL), value);
				completedElement(value, false);
			}
			|			a1 = 'false' {
				if (element == null) {
					element = JTLMM.essentialocl.EssentialoclFactory.eINSTANCE.createBooleanLiteralExp();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_9_0_0_0, false, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
				// set value of boolean attribute
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(JTLMM.essentialocl.EssentialoclPackage.BOOLEAN_LITERAL_EXP__BOOLEAN_SYMBOL), value);
				completedElement(value, false);
			}
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[327]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[328]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[329]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[330]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[331]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[332]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[333]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[334]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[335]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[336]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[337]);
	}
	
;

parse_JTLMM_essentialocl_VariableExp returns [JTLMM.essentialocl.VariableExp element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new JTLMM.resource.JTLMM.mopp.JTLMMTerminateParsingException();
			}
			if (element == null) {
				element = JTLMM.essentialocl.EssentialoclFactory.eINSTANCE.createVariableExp();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				JTLMM.resource.JTLMM.IJTLMMTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				JTLMM.resource.JTLMM.IJTLMMTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(JTLMM.essentialocl.EssentialoclPackage.VARIABLE_EXP__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(JTLMM.essentialocl.EssentialoclPackage.VARIABLE_EXP__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_10_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[338]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[339]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[340]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[341]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[342]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[343]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[344]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[345]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[346]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[347]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[348]);
	}
	
;

parse_JTLMM_essentialocl_StringLiteralExp returns [JTLMM.essentialocl.StringLiteralExp element = null]
@init{
}
:
	a0 = '|' {
		if (element == null) {
			element = JTLMM.essentialocl.EssentialoclFactory.eINSTANCE.createStringLiteralExp();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_11_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[349]);
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new JTLMM.resource.JTLMM.mopp.JTLMMTerminateParsingException();
			}
			if (element == null) {
				element = JTLMM.essentialocl.EssentialoclFactory.eINSTANCE.createStringLiteralExp();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				JTLMM.resource.JTLMM.IJTLMMTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				JTLMM.resource.JTLMM.IJTLMMTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(JTLMM.essentialocl.EssentialoclPackage.STRING_LITERAL_EXP__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(JTLMM.essentialocl.EssentialoclPackage.STRING_LITERAL_EXP__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_11_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[350]);
	}
	
	a2 = '|' {
		if (element == null) {
			element = JTLMM.essentialocl.EssentialoclFactory.eINSTANCE.createStringLiteralExp();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_11_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[351]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[352]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[353]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[354]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[355]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[356]);
		addExpectedElement(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[357]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[358]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[359]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[360]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[361]);
	}
	
;

parse_JTLMM_essentialocl_Variable returns [JTLMM.essentialocl.Variable element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new JTLMM.resource.JTLMM.mopp.JTLMMTerminateParsingException();
			}
			if (element == null) {
				element = JTLMM.essentialocl.EssentialoclFactory.eINSTANCE.createVariable();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				JTLMM.resource.JTLMM.IJTLMMTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				JTLMM.resource.JTLMM.IJTLMMTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(JTLMM.essentialocl.EssentialoclPackage.VARIABLE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(JTLMM.essentialocl.EssentialoclPackage.VARIABLE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_12_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[362]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[363]);
	}
	
	(
		(
			a1 = ':' {
				if (element == null) {
					element = JTLMM.essentialocl.EssentialoclFactory.eINSTANCE.createVariable();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_12_0_0_1_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[364]);
			}
			
			(
				a2 = TEXT				
				{
					if (terminateParsing) {
						throw new JTLMM.resource.JTLMM.mopp.JTLMMTerminateParsingException();
					}
					if (element == null) {
						element = JTLMM.essentialocl.EssentialoclFactory.eINSTANCE.createVariable();
						startIncompleteElement(element);
					}
					if (a2 != null) {
						JTLMM.resource.JTLMM.IJTLMMTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						JTLMM.resource.JTLMM.IJTLMMTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(JTLMM.essentialocl.EssentialoclPackage.VARIABLE__TYPE), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(JTLMM.essentialocl.EssentialoclPackage.VARIABLE__TYPE), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_12_0_0_1_0_0_3, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[365]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[366]);
	}
	
	a3 = ';' {
		if (element == null) {
			element = JTLMM.essentialocl.EssentialoclFactory.eINSTANCE.createVariable();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_12_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[367]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[368]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[369]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[370]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[371]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[372]);
		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[373]);
		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[374]);
	}
	
;

parse_JTLMM_template_TemplateExp returns [JTLMM.template.TemplateExp element = null]
:
	c0 = parse_JTLMM_template_ObjectTemplateExp{ element = c0; /* this is a subclass or primitive expression choice */ }
	
;

parse_JTLMM_essentialocl_OclExpression returns [JTLMM.essentialocl.OclExpression element = null]
:
	c0 = parse_JTLMM_template_ObjectTemplateExp{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_JTLMM_imperativeocl_AssignExp{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_JTLMM_essentialocl_OperationCallExp{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_JTLMM_essentialocl_BooleanLiteralExp{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_JTLMM_essentialocl_VariableExp{ element = c4; /* this is a subclass or primitive expression choice */ }
	|	c5 = parse_JTLMM_essentialocl_StringLiteralExp{ element = c5; /* this is a subclass or primitive expression choice */ }
	
;

SL_COMMENT:
	(('//'|'--')(~('\n'|'\r'|'\uffff'))* )
	{ _channel = 99; }
;
ML_COMMENT:
	('/*'.*'*/')
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

