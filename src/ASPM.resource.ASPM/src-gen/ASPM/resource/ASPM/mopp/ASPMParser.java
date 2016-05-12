// $ANTLR 3.4

	package ASPM.resource.ASPM.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ASPMParser extends ASPMANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LINEBREAK", "TEXT", "WHITESPACE", "'('", "')'", "','", "'.'", "'\\\"'", "'edge'", "'model'", "'node'", "'prop'"
    };

    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int LINEBREAK=4;
    public static final int TEXT=5;
    public static final int WHITESPACE=6;

    // delegates
    public ASPMANTLRParserBase[] getDelegates() {
        return new ASPMANTLRParserBase[] {};
    }

    // delegators


    public ASPMParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ASPMParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.initializeRuleMemo(8 + 1);
         

    }

    public String[] getTokenNames() { return ASPMParser.tokenNames; }
    public String getGrammarFileName() { return "ASPM.g"; }


    	private ASPM.resource.ASPM.IASPMTokenResolverFactory tokenResolverFactory = new ASPM.resource.ASPM.mopp.ASPMTokenResolverFactory();
    	
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
    	private java.util.List<ASPM.resource.ASPM.mopp.ASPMExpectedTerminal> expectedElements = new java.util.ArrayList<ASPM.resource.ASPM.mopp.ASPMExpectedTerminal>();
    	
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
    		postParseCommands.add(new ASPM.resource.ASPM.IASPMCommand<ASPM.resource.ASPM.IASPMTextResource>() {
    			public boolean execute(ASPM.resource.ASPM.IASPMTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for code completion
    					return true;
    				}
    				resource.addProblem(new ASPM.resource.ASPM.IASPMProblem() {
    					public ASPM.resource.ASPM.ASPMEProblemSeverity getSeverity() {
    						return ASPM.resource.ASPM.ASPMEProblemSeverity.ERROR;
    					}
    					public ASPM.resource.ASPM.ASPMEProblemType getType() {
    						return ASPM.resource.ASPM.ASPMEProblemType.SYNTAX_ERROR;
    					}
    					public String getMessage() {
    						return errorMessage;
    					}
    					public java.util.Collection<ASPM.resource.ASPM.IASPMQuickFix> getQuickFixes() {
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
    		ASPM.resource.ASPM.IASPMExpectedElement terminal = ASPM.resource.ASPM.grammar.ASPMFollowSetProvider.TERMINALS[terminalID];
    		ASPM.resource.ASPM.mopp.ASPMContainedFeature[] containmentFeatures = new ASPM.resource.ASPM.mopp.ASPMContainedFeature[ids.length - 2];
    		for (int i = 2; i < ids.length; i++) {
    			containmentFeatures[i - 2] = ASPM.resource.ASPM.grammar.ASPMFollowSetProvider.LINKS[ids[i]];
    		}
    		ASPM.resource.ASPM.grammar.ASPMContainmentTrace containmentTrace = new ASPM.resource.ASPM.grammar.ASPMContainmentTrace(eClass, containmentFeatures);
    		org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
    		ASPM.resource.ASPM.mopp.ASPMExpectedTerminal expectedElement = new ASPM.resource.ASPM.mopp.ASPMExpectedTerminal(container, terminal, followSetID, containmentTrace);
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
    		postParseCommands.add(new ASPM.resource.ASPM.IASPMCommand<ASPM.resource.ASPM.IASPMTextResource>() {
    			public boolean execute(ASPM.resource.ASPM.IASPMTextResource resource) {
    				ASPM.resource.ASPM.IASPMLocationMap locationMap = resource.getLocationMap();
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
    		postParseCommands.add(new ASPM.resource.ASPM.IASPMCommand<ASPM.resource.ASPM.IASPMTextResource>() {
    			public boolean execute(ASPM.resource.ASPM.IASPMTextResource resource) {
    				ASPM.resource.ASPM.IASPMLocationMap locationMap = resource.getLocationMap();
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
    	protected void setLocalizationEnd(java.util.Collection<ASPM.resource.ASPM.IASPMCommand<ASPM.resource.ASPM.IASPMTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
    		if (disableLocationMap) {
    			return;
    		}
    		postParseCommands.add(new ASPM.resource.ASPM.IASPMCommand<ASPM.resource.ASPM.IASPMTextResource>() {
    			public boolean execute(ASPM.resource.ASPM.IASPMTextResource resource) {
    				ASPM.resource.ASPM.IASPMLocationMap locationMap = resource.getLocationMap();
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
    	
    	public ASPM.resource.ASPM.IASPMTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
    		try {
    			if (encoding == null) {
    				return new ASPMParser(new org.antlr.runtime3_4_0.CommonTokenStream(new ASPMLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream))));
    			} else {
    				return new ASPMParser(new org.antlr.runtime3_4_0.CommonTokenStream(new ASPMLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream, encoding))));
    			}
    		} catch (java.io.IOException e) {
    			new ASPM.resource.ASPM.util.ASPMRuntimeUtil().logError("Error while creating parser.", e);
    			return null;
    		}
    	}
    	
    	/**
    	 * This default constructor is only used to call createInstance() on it.
    	 */
    	public ASPMParser() {
    		super(null);
    	}
    	
    	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_4_0.RecognitionException {
    		this.lastPosition = 0;
    		// required because the lexer class can not be subclassed
    		((ASPMLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
    		((ASPMLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
    		Object typeObject = getTypeObject();
    		if (typeObject == null) {
    			return start();
    		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
    			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
    			if (type.getInstanceClass() == ASPM.Model.class) {
    				return parse_ASPM_Model();
    			}
    			if (type.getInstanceClass() == ASPM.Node.class) {
    				return parse_ASPM_Node();
    			}
    			if (type.getInstanceClass() == ASPM.Prop.class) {
    				return parse_ASPM_Prop();
    			}
    			if (type.getInstanceClass() == ASPM.Edge.class) {
    				return parse_ASPM_Edge();
    			}
    		}
    		throw new ASPM.resource.ASPM.mopp.ASPMUnexpectedContentTypeException(typeObject);
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
    			typeObject = options.get(ASPM.resource.ASPM.IASPMOptions.RESOURCE_CONTENT_TYPE);
    		}
    		return typeObject;
    	}
    	
    	/**
    	 * Implementation that calls {@link #doParse()} and handles the thrown
    	 * RecognitionExceptions.
    	 */
    	public ASPM.resource.ASPM.IASPMParseResult parse() {
    		terminateParsing = false;
    		postParseCommands = new java.util.ArrayList<ASPM.resource.ASPM.IASPMCommand<ASPM.resource.ASPM.IASPMTextResource>>();
    		ASPM.resource.ASPM.mopp.ASPMParseResult parseResult = new ASPM.resource.ASPM.mopp.ASPMParseResult();
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
    	
    	public java.util.List<ASPM.resource.ASPM.mopp.ASPMExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, ASPM.resource.ASPM.IASPMTextResource dummyResource, int cursorOffset) {
    		this.rememberExpectedElements = true;
    		this.parseToIndexTypeObject = type;
    		this.cursorOffset = cursorOffset;
    		this.lastStartIncludingHidden = -1;
    		final org.antlr.runtime3_4_0.CommonTokenStream tokenStream = (org.antlr.runtime3_4_0.CommonTokenStream) getTokenStream();
    		ASPM.resource.ASPM.IASPMParseResult result = parse();
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
    			for (ASPM.resource.ASPM.IASPMCommand<ASPM.resource.ASPM.IASPMTextResource> command : result.getPostParseCommands()) {
    				command.execute(dummyResource);
    			}
    		}
    		// remove all expected elements that were added after the last complete element
    		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
    		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
    		java.util.Set<ASPM.resource.ASPM.mopp.ASPMExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<ASPM.resource.ASPM.mopp.ASPMExpectedTerminal>();
    		java.util.List<ASPM.resource.ASPM.mopp.ASPMExpectedTerminal> newFollowSet = new java.util.ArrayList<ASPM.resource.ASPM.mopp.ASPMExpectedTerminal>();
    		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
    			ASPM.resource.ASPM.mopp.ASPMExpectedTerminal expectedElementI = expectedElements.get(i);
    			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
    				currentFollowSet.add(expectedElementI);
    			} else {
    				break;
    			}
    		}
    		int followSetID = 64;
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
    				for (ASPM.resource.ASPM.mopp.ASPMExpectedTerminal nextFollow : newFollowSet) {
    					lastTokenIndex = 0;
    					setPosition(nextFollow, i);
    				}
    				newFollowSet.clear();
    				// normal tokens do reduce the follow set - only elements that match the token are
    				// kept
    				for (ASPM.resource.ASPM.mopp.ASPMExpectedTerminal nextFollow : currentFollowSet) {
    					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
    						// keep this one - it matches
    						java.util.Collection<ASPM.resource.ASPM.util.ASPMPair<ASPM.resource.ASPM.IASPMExpectedElement, ASPM.resource.ASPM.mopp.ASPMContainedFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
    						for (ASPM.resource.ASPM.util.ASPMPair<ASPM.resource.ASPM.IASPMExpectedElement, ASPM.resource.ASPM.mopp.ASPMContainedFeature[]> newFollowerPair : newFollowers) {
    							ASPM.resource.ASPM.IASPMExpectedElement newFollower = newFollowerPair.getLeft();
    							org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
    							ASPM.resource.ASPM.grammar.ASPMContainmentTrace containmentTrace = new ASPM.resource.ASPM.grammar.ASPMContainmentTrace(null, newFollowerPair.getRight());
    							ASPM.resource.ASPM.mopp.ASPMExpectedTerminal newFollowTerminal = new ASPM.resource.ASPM.mopp.ASPMExpectedTerminal(container, newFollower, followSetID, containmentTrace);
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
    		for (ASPM.resource.ASPM.mopp.ASPMExpectedTerminal nextFollow : newFollowSet) {
    			lastTokenIndex = 0;
    			setPosition(nextFollow, i);
    		}
    		return this.expectedElements;
    	}
    	
    	public void setPosition(ASPM.resource.ASPM.mopp.ASPMExpectedTerminal expectedElement, int tokenIndex) {
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
    	



    // $ANTLR start "start"
    // ASPM.g:508:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_ASPM_Model ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;

        int start_StartIndex = input.index();

        ASPM.Model c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }

            // ASPM.g:509:2: ( (c0= parse_ASPM_Model ) EOF )
            // ASPM.g:510:2: (c0= parse_ASPM_Model ) EOF
            {
            if ( state.backtracking==0 ) {
            		// follow set for start rule(s)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[0]);
            		expectedElementsIndexOfLastCompleteElement = 0;
            	}

            // ASPM.g:515:2: (c0= parse_ASPM_Model )
            // ASPM.g:516:3: c0= parse_ASPM_Model
            {
            pushFollow(FOLLOW_parse_ASPM_Model_in_start82);
            c0=parse_ASPM_Model();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) { element = c0; }

            }


            match(input,EOF,FOLLOW_EOF_in_start89); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		retrieveLayoutInformation(element, null, null, false);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, start_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "start"



    // $ANTLR start "parse_ASPM_Model"
    // ASPM.g:524:1: parse_ASPM_Model returns [ASPM.Model element = null] : a0= 'model' a1= '(' (a2= TEXT ) a3= ',' (a4= TEXT ) a5= ')' a6= '.' ( (a7_0= parse_ASPM_Node ) )* ( (a8_0= parse_ASPM_Prop ) )* ( (a9_0= parse_ASPM_Edge ) )* ;
    public final ASPM.Model parse_ASPM_Model() throws RecognitionException {
        ASPM.Model element =  null;

        int parse_ASPM_Model_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        ASPM.Node a7_0 =null;

        ASPM.Prop a8_0 =null;

        ASPM.Edge a9_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }

            // ASPM.g:527:2: (a0= 'model' a1= '(' (a2= TEXT ) a3= ',' (a4= TEXT ) a5= ')' a6= '.' ( (a7_0= parse_ASPM_Node ) )* ( (a8_0= parse_ASPM_Prop ) )* ( (a9_0= parse_ASPM_Edge ) )* )
            // ASPM.g:528:2: a0= 'model' a1= '(' (a2= TEXT ) a3= ',' (a4= TEXT ) a5= ')' a6= '.' ( (a7_0= parse_ASPM_Node ) )* ( (a8_0= parse_ASPM_Prop ) )* ( (a9_0= parse_ASPM_Edge ) )*
            {
            a0=(Token)match(input,13,FOLLOW_13_in_parse_ASPM_Model115); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createModel();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_0_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[1]);
            	}

            a1=(Token)match(input,7,FOLLOW_7_in_parse_ASPM_Model129); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createModel();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_0_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[2]);
            	}

            // ASPM.g:556:2: (a2= TEXT )
            // ASPM.g:557:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASPM_Model147); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new ASPM.resource.ASPM.mopp.ASPMTerminateParsingException();
            			}
            			if (element == null) {
            				element = ASPM.ASPMFactory.eINSTANCE.createModel();
            				startIncompleteElement(element);
            			}
            			if (a2 != null) {
            				ASPM.resource.ASPM.IASPMTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				ASPM.resource.ASPM.IASPMTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(ASPM.ASPMPackage.MODEL__ID), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(ASPM.ASPMPackage.MODEL__ID), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_0_0_0_2, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[3]);
            	}

            a3=(Token)match(input,9,FOLLOW_9_in_parse_ASPM_Model168); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createModel();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_0_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[4]);
            	}

            // ASPM.g:606:2: (a4= TEXT )
            // ASPM.g:607:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASPM_Model186); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new ASPM.resource.ASPM.mopp.ASPMTerminateParsingException();
            			}
            			if (element == null) {
            				element = ASPM.ASPMFactory.eINSTANCE.createModel();
            				startIncompleteElement(element);
            			}
            			if (a4 != null) {
            				ASPM.resource.ASPM.IASPMTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				ASPM.resource.ASPM.IASPMTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(ASPM.ASPMPackage.MODEL__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(ASPM.ASPMPackage.MODEL__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_0_0_0_4, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[5]);
            	}

            a5=(Token)match(input,8,FOLLOW_8_in_parse_ASPM_Model207); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createModel();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_0_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[6]);
            	}

            a6=(Token)match(input,10,FOLLOW_10_in_parse_ASPM_Model221); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createModel();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_0_0_0_6, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ASPM.ASPMPackage.eINSTANCE.getModel(), ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[7]);
            		addExpectedElement(ASPM.ASPMPackage.eINSTANCE.getModel(), ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[8]);
            		addExpectedElement(ASPM.ASPMPackage.eINSTANCE.getModel(), ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[9]);
            	}

            // ASPM.g:672:2: ( (a7_0= parse_ASPM_Node ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ASPM.g:673:3: (a7_0= parse_ASPM_Node )
            	    {
            	    // ASPM.g:673:3: (a7_0= parse_ASPM_Node )
            	    // ASPM.g:674:4: a7_0= parse_ASPM_Node
            	    {
            	    pushFollow(FOLLOW_parse_ASPM_Node_in_parse_ASPM_Model244);
            	    a7_0=parse_ASPM_Node();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new ASPM.resource.ASPM.mopp.ASPMTerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = ASPM.ASPMFactory.eINSTANCE.createModel();
            	    					startIncompleteElement(element);
            	    				}
            	    				if (a7_0 != null) {
            	    					if (a7_0 != null) {
            	    						Object value = a7_0;
            	    						addObjectToList(element, ASPM.ASPMPackage.MODEL__NODES, value);
            	    						completedElement(value, true);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_0_0_0_8, a7_0, true);
            	    					copyLocalizationInfos(a7_0, element);
            	    				}
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ASPM.ASPMPackage.eINSTANCE.getModel(), ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[10]);
            		addExpectedElement(ASPM.ASPMPackage.eINSTANCE.getModel(), ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[11]);
            		addExpectedElement(ASPM.ASPMPackage.eINSTANCE.getModel(), ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[12]);
            	}

            // ASPM.g:702:2: ( (a8_0= parse_ASPM_Prop ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ASPM.g:703:3: (a8_0= parse_ASPM_Prop )
            	    {
            	    // ASPM.g:703:3: (a8_0= parse_ASPM_Prop )
            	    // ASPM.g:704:4: a8_0= parse_ASPM_Prop
            	    {
            	    pushFollow(FOLLOW_parse_ASPM_Prop_in_parse_ASPM_Model279);
            	    a8_0=parse_ASPM_Prop();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new ASPM.resource.ASPM.mopp.ASPMTerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = ASPM.ASPMFactory.eINSTANCE.createModel();
            	    					startIncompleteElement(element);
            	    				}
            	    				if (a8_0 != null) {
            	    					if (a8_0 != null) {
            	    						Object value = a8_0;
            	    						addObjectToList(element, ASPM.ASPMPackage.MODEL__PROPS, value);
            	    						completedElement(value, true);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_0_0_0_9, a8_0, true);
            	    					copyLocalizationInfos(a8_0, element);
            	    				}
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ASPM.ASPMPackage.eINSTANCE.getModel(), ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[13]);
            		addExpectedElement(ASPM.ASPMPackage.eINSTANCE.getModel(), ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[14]);
            	}

            // ASPM.g:731:2: ( (a9_0= parse_ASPM_Edge ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ASPM.g:732:3: (a9_0= parse_ASPM_Edge )
            	    {
            	    // ASPM.g:732:3: (a9_0= parse_ASPM_Edge )
            	    // ASPM.g:733:4: a9_0= parse_ASPM_Edge
            	    {
            	    pushFollow(FOLLOW_parse_ASPM_Edge_in_parse_ASPM_Model314);
            	    a9_0=parse_ASPM_Edge();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new ASPM.resource.ASPM.mopp.ASPMTerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = ASPM.ASPMFactory.eINSTANCE.createModel();
            	    					startIncompleteElement(element);
            	    				}
            	    				if (a9_0 != null) {
            	    					if (a9_0 != null) {
            	    						Object value = a9_0;
            	    						addObjectToList(element, ASPM.ASPMPackage.MODEL__EDGES, value);
            	    						completedElement(value, true);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_0_0_0_10, a9_0, true);
            	    					copyLocalizationInfos(a9_0, element);
            	    				}
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ASPM.ASPMPackage.eINSTANCE.getModel(), ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[15]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, parse_ASPM_Model_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASPM_Model"



    // $ANTLR start "parse_ASPM_Node"
    // ASPM.g:761:1: parse_ASPM_Node returns [ASPM.Node element = null] : a0= 'node' a1= '(' (a2= TEXT ) a3= ',' (a4= TEXT ) a5= ',' a6= '\\\"' (a7= TEXT ) a8= '\\\"' a9= ',' (a10= TEXT ) a11= ')' a12= '.' ;
    public final ASPM.Node parse_ASPM_Node() throws RecognitionException {
        ASPM.Node element =  null;

        int parse_ASPM_Node_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a10=null;
        Token a11=null;
        Token a12=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }

            // ASPM.g:764:2: (a0= 'node' a1= '(' (a2= TEXT ) a3= ',' (a4= TEXT ) a5= ',' a6= '\\\"' (a7= TEXT ) a8= '\\\"' a9= ',' (a10= TEXT ) a11= ')' a12= '.' )
            // ASPM.g:765:2: a0= 'node' a1= '(' (a2= TEXT ) a3= ',' (a4= TEXT ) a5= ',' a6= '\\\"' (a7= TEXT ) a8= '\\\"' a9= ',' (a10= TEXT ) a11= ')' a12= '.'
            {
            a0=(Token)match(input,14,FOLLOW_14_in_parse_ASPM_Node355); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createNode();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_1_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[16]);
            	}

            a1=(Token)match(input,7,FOLLOW_7_in_parse_ASPM_Node369); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createNode();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_1_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[17]);
            	}

            // ASPM.g:793:2: (a2= TEXT )
            // ASPM.g:794:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASPM_Node387); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new ASPM.resource.ASPM.mopp.ASPMTerminateParsingException();
            			}
            			if (element == null) {
            				element = ASPM.ASPMFactory.eINSTANCE.createNode();
            				startIncompleteElement(element);
            			}
            			if (a2 != null) {
            				ASPM.resource.ASPM.IASPMTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				ASPM.resource.ASPM.IASPMTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(ASPM.ASPMPackage.NODE__MODEL), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				ASPM.Model proxy = ASPM.ASPMFactory.eINSTANCE.createModel();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new ASPM.resource.ASPM.mopp.ASPMContextDependentURIFragmentFactory<ASPM.Node, ASPM.Model>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getNodeModelReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASPM.ASPMPackage.NODE__MODEL), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(ASPM.ASPMPackage.NODE__MODEL), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_1_0_0_2, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[18]);
            	}

            a3=(Token)match(input,9,FOLLOW_9_in_parse_ASPM_Node408); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createNode();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_1_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[19]);
            	}

            // ASPM.g:847:2: (a4= TEXT )
            // ASPM.g:848:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASPM_Node426); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new ASPM.resource.ASPM.mopp.ASPMTerminateParsingException();
            			}
            			if (element == null) {
            				element = ASPM.ASPMFactory.eINSTANCE.createNode();
            				startIncompleteElement(element);
            			}
            			if (a4 != null) {
            				ASPM.resource.ASPM.IASPMTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				ASPM.resource.ASPM.IASPMTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(ASPM.ASPMPackage.NODE__ID), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(ASPM.ASPMPackage.NODE__ID), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_1_0_0_4, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[20]);
            	}

            a5=(Token)match(input,9,FOLLOW_9_in_parse_ASPM_Node447); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createNode();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_1_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[21]);
            	}

            a6=(Token)match(input,11,FOLLOW_11_in_parse_ASPM_Node461); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createNode();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_1_0_0_6, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[22]);
            	}

            // ASPM.g:911:2: (a7= TEXT )
            // ASPM.g:912:3: a7= TEXT
            {
            a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASPM_Node479); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new ASPM.resource.ASPM.mopp.ASPMTerminateParsingException();
            			}
            			if (element == null) {
            				element = ASPM.ASPMFactory.eINSTANCE.createNode();
            				startIncompleteElement(element);
            			}
            			if (a7 != null) {
            				ASPM.resource.ASPM.IASPMTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				ASPM.resource.ASPM.IASPMTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(ASPM.ASPMPackage.NODE__IDTRACE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(ASPM.ASPMPackage.NODE__IDTRACE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_1_0_0_7, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a7, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[23]);
            	}

            a8=(Token)match(input,11,FOLLOW_11_in_parse_ASPM_Node500); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createNode();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_1_0_0_8, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[24]);
            	}

            a9=(Token)match(input,9,FOLLOW_9_in_parse_ASPM_Node514); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createNode();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_1_0_0_9, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[25]);
            	}

            // ASPM.g:975:2: (a10= TEXT )
            // ASPM.g:976:3: a10= TEXT
            {
            a10=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASPM_Node532); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new ASPM.resource.ASPM.mopp.ASPMTerminateParsingException();
            			}
            			if (element == null) {
            				element = ASPM.ASPMFactory.eINSTANCE.createNode();
            				startIncompleteElement(element);
            			}
            			if (a10 != null) {
            				ASPM.resource.ASPM.IASPMTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				ASPM.resource.ASPM.IASPMTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(ASPM.ASPMPackage.NODE__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(ASPM.ASPMPackage.NODE__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_1_0_0_10, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a10, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[26]);
            	}

            a11=(Token)match(input,8,FOLLOW_8_in_parse_ASPM_Node553); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createNode();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_1_0_0_11, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[27]);
            	}

            a12=(Token)match(input,10,FOLLOW_10_in_parse_ASPM_Node567); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createNode();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_1_0_0_12, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ASPM.ASPMPackage.eINSTANCE.getModel(), ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[28]);
            		addExpectedElement(ASPM.ASPMPackage.eINSTANCE.getModel(), ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[29]);
            		addExpectedElement(ASPM.ASPMPackage.eINSTANCE.getModel(), ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[30]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, parse_ASPM_Node_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASPM_Node"



    // $ANTLR start "parse_ASPM_Prop"
    // ASPM.g:1043:1: parse_ASPM_Prop returns [ASPM.Prop element = null] : a0= 'prop' a1= '(' (a2= TEXT ) a3= ',' (a4= TEXT ) a5= ',' a6= '\\\"' (a7= TEXT ) a8= '\\\"' a9= ',' a10= '\\\"' (a11= TEXT ) a12= '\\\"' a13= ',' (a14= TEXT ) a15= ',' (a16= TEXT ) a17= ')' a18= '.' ;
    public final ASPM.Prop parse_ASPM_Prop() throws RecognitionException {
        ASPM.Prop element =  null;

        int parse_ASPM_Prop_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a10=null;
        Token a11=null;
        Token a12=null;
        Token a13=null;
        Token a14=null;
        Token a15=null;
        Token a16=null;
        Token a17=null;
        Token a18=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }

            // ASPM.g:1046:2: (a0= 'prop' a1= '(' (a2= TEXT ) a3= ',' (a4= TEXT ) a5= ',' a6= '\\\"' (a7= TEXT ) a8= '\\\"' a9= ',' a10= '\\\"' (a11= TEXT ) a12= '\\\"' a13= ',' (a14= TEXT ) a15= ',' (a16= TEXT ) a17= ')' a18= '.' )
            // ASPM.g:1047:2: a0= 'prop' a1= '(' (a2= TEXT ) a3= ',' (a4= TEXT ) a5= ',' a6= '\\\"' (a7= TEXT ) a8= '\\\"' a9= ',' a10= '\\\"' (a11= TEXT ) a12= '\\\"' a13= ',' (a14= TEXT ) a15= ',' (a16= TEXT ) a17= ')' a18= '.'
            {
            a0=(Token)match(input,15,FOLLOW_15_in_parse_ASPM_Prop596); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createProp();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_2_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[31]);
            	}

            a1=(Token)match(input,7,FOLLOW_7_in_parse_ASPM_Prop610); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createProp();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_2_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[32]);
            	}

            // ASPM.g:1075:2: (a2= TEXT )
            // ASPM.g:1076:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASPM_Prop628); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new ASPM.resource.ASPM.mopp.ASPMTerminateParsingException();
            			}
            			if (element == null) {
            				element = ASPM.ASPMFactory.eINSTANCE.createProp();
            				startIncompleteElement(element);
            			}
            			if (a2 != null) {
            				ASPM.resource.ASPM.IASPMTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				ASPM.resource.ASPM.IASPMTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(ASPM.ASPMPackage.PROP__MODEL), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				ASPM.Model proxy = ASPM.ASPMFactory.eINSTANCE.createModel();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new ASPM.resource.ASPM.mopp.ASPMContextDependentURIFragmentFactory<ASPM.Prop, ASPM.Model>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getPropModelReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASPM.ASPMPackage.PROP__MODEL), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(ASPM.ASPMPackage.PROP__MODEL), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_2_0_0_2, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[33]);
            	}

            a3=(Token)match(input,9,FOLLOW_9_in_parse_ASPM_Prop649); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createProp();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_2_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[34]);
            	}

            // ASPM.g:1129:2: (a4= TEXT )
            // ASPM.g:1130:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASPM_Prop667); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new ASPM.resource.ASPM.mopp.ASPMTerminateParsingException();
            			}
            			if (element == null) {
            				element = ASPM.ASPMFactory.eINSTANCE.createProp();
            				startIncompleteElement(element);
            			}
            			if (a4 != null) {
            				ASPM.resource.ASPM.IASPMTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				ASPM.resource.ASPM.IASPMTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(ASPM.ASPMPackage.PROP__ID), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(ASPM.ASPMPackage.PROP__ID), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_2_0_0_4, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[35]);
            	}

            a5=(Token)match(input,9,FOLLOW_9_in_parse_ASPM_Prop688); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createProp();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_2_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[36]);
            	}

            a6=(Token)match(input,11,FOLLOW_11_in_parse_ASPM_Prop702); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createProp();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_2_0_0_6, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[37]);
            	}

            // ASPM.g:1193:2: (a7= TEXT )
            // ASPM.g:1194:3: a7= TEXT
            {
            a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASPM_Prop720); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new ASPM.resource.ASPM.mopp.ASPMTerminateParsingException();
            			}
            			if (element == null) {
            				element = ASPM.ASPMFactory.eINSTANCE.createProp();
            				startIncompleteElement(element);
            			}
            			if (a7 != null) {
            				ASPM.resource.ASPM.IASPMTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				ASPM.resource.ASPM.IASPMTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(ASPM.ASPMPackage.PROP__IDTRACE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(ASPM.ASPMPackage.PROP__IDTRACE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_2_0_0_7, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a7, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[38]);
            	}

            a8=(Token)match(input,11,FOLLOW_11_in_parse_ASPM_Prop741); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createProp();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_2_0_0_8, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[39]);
            	}

            a9=(Token)match(input,9,FOLLOW_9_in_parse_ASPM_Prop755); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createProp();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_2_0_0_9, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[40]);
            	}

            a10=(Token)match(input,11,FOLLOW_11_in_parse_ASPM_Prop769); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createProp();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_2_0_0_10, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[41]);
            	}

            // ASPM.g:1271:2: (a11= TEXT )
            // ASPM.g:1272:3: a11= TEXT
            {
            a11=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASPM_Prop787); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new ASPM.resource.ASPM.mopp.ASPMTerminateParsingException();
            			}
            			if (element == null) {
            				element = ASPM.ASPMFactory.eINSTANCE.createProp();
            				startIncompleteElement(element);
            			}
            			if (a11 != null) {
            				ASPM.resource.ASPM.IASPMTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				ASPM.resource.ASPM.IASPMTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a11.getText(), element.eClass().getEStructuralFeature(ASPM.ASPMPackage.PROP__OWNER), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a11).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a11).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a11).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a11).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				ASPM.Node proxy = ASPM.ASPMFactory.eINSTANCE.createNode();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new ASPM.resource.ASPM.mopp.ASPMContextDependentURIFragmentFactory<ASPM.Prop, ASPM.Node>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getPropOwnerReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASPM.ASPMPackage.PROP__OWNER), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(ASPM.ASPMPackage.PROP__OWNER), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_2_0_0_11, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a11, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a11, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[42]);
            	}

            a12=(Token)match(input,11,FOLLOW_11_in_parse_ASPM_Prop808); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createProp();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_2_0_0_12, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[43]);
            	}

            a13=(Token)match(input,9,FOLLOW_9_in_parse_ASPM_Prop822); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createProp();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_2_0_0_13, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[44]);
            	}

            // ASPM.g:1339:2: (a14= TEXT )
            // ASPM.g:1340:3: a14= TEXT
            {
            a14=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASPM_Prop840); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new ASPM.resource.ASPM.mopp.ASPMTerminateParsingException();
            			}
            			if (element == null) {
            				element = ASPM.ASPMFactory.eINSTANCE.createProp();
            				startIncompleteElement(element);
            			}
            			if (a14 != null) {
            				ASPM.resource.ASPM.IASPMTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				ASPM.resource.ASPM.IASPMTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a14.getText(), element.eClass().getEStructuralFeature(ASPM.ASPMPackage.PROP__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a14).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a14).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a14).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a14).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(ASPM.ASPMPackage.PROP__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_2_0_0_14, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a14, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[45]);
            	}

            a15=(Token)match(input,9,FOLLOW_9_in_parse_ASPM_Prop861); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createProp();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_2_0_0_15, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[46]);
            	}

            // ASPM.g:1389:2: (a16= TEXT )
            // ASPM.g:1390:3: a16= TEXT
            {
            a16=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASPM_Prop879); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new ASPM.resource.ASPM.mopp.ASPMTerminateParsingException();
            			}
            			if (element == null) {
            				element = ASPM.ASPMFactory.eINSTANCE.createProp();
            				startIncompleteElement(element);
            			}
            			if (a16 != null) {
            				ASPM.resource.ASPM.IASPMTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				ASPM.resource.ASPM.IASPMTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a16.getText(), element.eClass().getEStructuralFeature(ASPM.ASPMPackage.PROP__VALUE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a16).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a16).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a16).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a16).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(ASPM.ASPMPackage.PROP__VALUE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_2_0_0_16, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a16, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[47]);
            	}

            a17=(Token)match(input,8,FOLLOW_8_in_parse_ASPM_Prop900); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createProp();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_2_0_0_17, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[48]);
            	}

            a18=(Token)match(input,10,FOLLOW_10_in_parse_ASPM_Prop914); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createProp();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_2_0_0_18, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ASPM.ASPMPackage.eINSTANCE.getModel(), ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[49]);
            		addExpectedElement(ASPM.ASPMPackage.eINSTANCE.getModel(), ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[50]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, parse_ASPM_Prop_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASPM_Prop"



    // $ANTLR start "parse_ASPM_Edge"
    // ASPM.g:1456:1: parse_ASPM_Edge returns [ASPM.Edge element = null] : a0= 'edge' a1= '(' (a2= TEXT ) a3= ',' (a4= TEXT ) a5= ',' a6= '\\\"' (a7= TEXT ) a8= '\\\"' a9= ',' (a10= TEXT ) a11= ',' a12= '\\\"' (a13= TEXT ) a14= '\\\"' a15= ',' a16= '\\\"' (a17= TEXT ) a18= '\\\"' a19= ')' a20= '.' ;
    public final ASPM.Edge parse_ASPM_Edge() throws RecognitionException {
        ASPM.Edge element =  null;

        int parse_ASPM_Edge_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a10=null;
        Token a11=null;
        Token a12=null;
        Token a13=null;
        Token a14=null;
        Token a15=null;
        Token a16=null;
        Token a17=null;
        Token a18=null;
        Token a19=null;
        Token a20=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }

            // ASPM.g:1459:2: (a0= 'edge' a1= '(' (a2= TEXT ) a3= ',' (a4= TEXT ) a5= ',' a6= '\\\"' (a7= TEXT ) a8= '\\\"' a9= ',' (a10= TEXT ) a11= ',' a12= '\\\"' (a13= TEXT ) a14= '\\\"' a15= ',' a16= '\\\"' (a17= TEXT ) a18= '\\\"' a19= ')' a20= '.' )
            // ASPM.g:1460:2: a0= 'edge' a1= '(' (a2= TEXT ) a3= ',' (a4= TEXT ) a5= ',' a6= '\\\"' (a7= TEXT ) a8= '\\\"' a9= ',' (a10= TEXT ) a11= ',' a12= '\\\"' (a13= TEXT ) a14= '\\\"' a15= ',' a16= '\\\"' (a17= TEXT ) a18= '\\\"' a19= ')' a20= '.'
            {
            a0=(Token)match(input,12,FOLLOW_12_in_parse_ASPM_Edge943); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createEdge();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_3_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[51]);
            	}

            a1=(Token)match(input,7,FOLLOW_7_in_parse_ASPM_Edge957); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createEdge();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_3_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[52]);
            	}

            // ASPM.g:1488:2: (a2= TEXT )
            // ASPM.g:1489:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASPM_Edge975); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new ASPM.resource.ASPM.mopp.ASPMTerminateParsingException();
            			}
            			if (element == null) {
            				element = ASPM.ASPMFactory.eINSTANCE.createEdge();
            				startIncompleteElement(element);
            			}
            			if (a2 != null) {
            				ASPM.resource.ASPM.IASPMTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				ASPM.resource.ASPM.IASPMTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(ASPM.ASPMPackage.EDGE__MODEL), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				ASPM.Model proxy = ASPM.ASPMFactory.eINSTANCE.createModel();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new ASPM.resource.ASPM.mopp.ASPMContextDependentURIFragmentFactory<ASPM.Edge, ASPM.Model>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getEdgeModelReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASPM.ASPMPackage.EDGE__MODEL), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(ASPM.ASPMPackage.EDGE__MODEL), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_3_0_0_2, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[53]);
            	}

            a3=(Token)match(input,9,FOLLOW_9_in_parse_ASPM_Edge996); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createEdge();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_3_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[54]);
            	}

            // ASPM.g:1542:2: (a4= TEXT )
            // ASPM.g:1543:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASPM_Edge1014); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new ASPM.resource.ASPM.mopp.ASPMTerminateParsingException();
            			}
            			if (element == null) {
            				element = ASPM.ASPMFactory.eINSTANCE.createEdge();
            				startIncompleteElement(element);
            			}
            			if (a4 != null) {
            				ASPM.resource.ASPM.IASPMTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				ASPM.resource.ASPM.IASPMTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(ASPM.ASPMPackage.EDGE__ID), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(ASPM.ASPMPackage.EDGE__ID), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_3_0_0_4, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[55]);
            	}

            a5=(Token)match(input,9,FOLLOW_9_in_parse_ASPM_Edge1035); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createEdge();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_3_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[56]);
            	}

            a6=(Token)match(input,11,FOLLOW_11_in_parse_ASPM_Edge1049); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createEdge();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_3_0_0_6, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[57]);
            	}

            // ASPM.g:1606:2: (a7= TEXT )
            // ASPM.g:1607:3: a7= TEXT
            {
            a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASPM_Edge1067); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new ASPM.resource.ASPM.mopp.ASPMTerminateParsingException();
            			}
            			if (element == null) {
            				element = ASPM.ASPMFactory.eINSTANCE.createEdge();
            				startIncompleteElement(element);
            			}
            			if (a7 != null) {
            				ASPM.resource.ASPM.IASPMTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				ASPM.resource.ASPM.IASPMTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(ASPM.ASPMPackage.EDGE__IDTRACE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(ASPM.ASPMPackage.EDGE__IDTRACE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_3_0_0_7, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a7, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[58]);
            	}

            a8=(Token)match(input,11,FOLLOW_11_in_parse_ASPM_Edge1088); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createEdge();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_3_0_0_8, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[59]);
            	}

            a9=(Token)match(input,9,FOLLOW_9_in_parse_ASPM_Edge1102); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createEdge();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_3_0_0_9, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[60]);
            	}

            // ASPM.g:1670:2: (a10= TEXT )
            // ASPM.g:1671:3: a10= TEXT
            {
            a10=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASPM_Edge1120); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new ASPM.resource.ASPM.mopp.ASPMTerminateParsingException();
            			}
            			if (element == null) {
            				element = ASPM.ASPMFactory.eINSTANCE.createEdge();
            				startIncompleteElement(element);
            			}
            			if (a10 != null) {
            				ASPM.resource.ASPM.IASPMTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				ASPM.resource.ASPM.IASPMTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(ASPM.ASPMPackage.EDGE__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(ASPM.ASPMPackage.EDGE__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_3_0_0_10, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a10, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[61]);
            	}

            a11=(Token)match(input,9,FOLLOW_9_in_parse_ASPM_Edge1141); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createEdge();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_3_0_0_11, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[62]);
            	}

            a12=(Token)match(input,11,FOLLOW_11_in_parse_ASPM_Edge1155); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createEdge();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_3_0_0_12, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[63]);
            	}

            // ASPM.g:1734:2: (a13= TEXT )
            // ASPM.g:1735:3: a13= TEXT
            {
            a13=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASPM_Edge1173); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new ASPM.resource.ASPM.mopp.ASPMTerminateParsingException();
            			}
            			if (element == null) {
            				element = ASPM.ASPMFactory.eINSTANCE.createEdge();
            				startIncompleteElement(element);
            			}
            			if (a13 != null) {
            				ASPM.resource.ASPM.IASPMTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				ASPM.resource.ASPM.IASPMTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a13.getText(), element.eClass().getEStructuralFeature(ASPM.ASPMPackage.EDGE__SOURCE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a13).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				ASPM.Node proxy = ASPM.ASPMFactory.eINSTANCE.createNode();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new ASPM.resource.ASPM.mopp.ASPMContextDependentURIFragmentFactory<ASPM.Edge, ASPM.Node>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getEdgeSourceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASPM.ASPMPackage.EDGE__SOURCE), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(ASPM.ASPMPackage.EDGE__SOURCE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_3_0_0_13, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a13, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a13, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[64]);
            	}

            a14=(Token)match(input,11,FOLLOW_11_in_parse_ASPM_Edge1194); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createEdge();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_3_0_0_14, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[65]);
            	}

            a15=(Token)match(input,9,FOLLOW_9_in_parse_ASPM_Edge1208); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createEdge();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_3_0_0_15, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[66]);
            	}

            a16=(Token)match(input,11,FOLLOW_11_in_parse_ASPM_Edge1222); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createEdge();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_3_0_0_16, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a16, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[67]);
            	}

            // ASPM.g:1816:2: (a17= TEXT )
            // ASPM.g:1817:3: a17= TEXT
            {
            a17=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASPM_Edge1240); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new ASPM.resource.ASPM.mopp.ASPMTerminateParsingException();
            			}
            			if (element == null) {
            				element = ASPM.ASPMFactory.eINSTANCE.createEdge();
            				startIncompleteElement(element);
            			}
            			if (a17 != null) {
            				ASPM.resource.ASPM.IASPMTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				ASPM.resource.ASPM.IASPMTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a17.getText(), element.eClass().getEStructuralFeature(ASPM.ASPMPackage.EDGE__TARGET), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a17).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a17).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a17).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a17).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				ASPM.Node proxy = ASPM.ASPMFactory.eINSTANCE.createNode();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new ASPM.resource.ASPM.mopp.ASPMContextDependentURIFragmentFactory<ASPM.Edge, ASPM.Node>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getEdgeTargetReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASPM.ASPMPackage.EDGE__TARGET), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(ASPM.ASPMPackage.EDGE__TARGET), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_3_0_0_17, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a17, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a17, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[68]);
            	}

            a18=(Token)match(input,11,FOLLOW_11_in_parse_ASPM_Edge1261); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createEdge();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_3_0_0_18, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[69]);
            	}

            a19=(Token)match(input,8,FOLLOW_8_in_parse_ASPM_Edge1275); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createEdge();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_3_0_0_19, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a19, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[70]);
            	}

            a20=(Token)match(input,10,FOLLOW_10_in_parse_ASPM_Edge1289); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASPM.ASPMFactory.eINSTANCE.createEdge();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.ASPM_3_0_0_20, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a20, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ASPM.ASPMPackage.eINSTANCE.getModel(), ASPM.resource.ASPM.mopp.ASPMExpectationConstants.EXPECTATIONS[71]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, parse_ASPM_Edge_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASPM_Edge"

    // Delegated rules


 

    public static final BitSet FOLLOW_parse_ASPM_Model_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_parse_ASPM_Model115 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_parse_ASPM_Model129 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASPM_Model147 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_ASPM_Model168 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASPM_Model186 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_ASPM_Model207 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_ASPM_Model221 = new BitSet(new long[]{0x000000000000D002L});
    public static final BitSet FOLLOW_parse_ASPM_Node_in_parse_ASPM_Model244 = new BitSet(new long[]{0x000000000000D002L});
    public static final BitSet FOLLOW_parse_ASPM_Prop_in_parse_ASPM_Model279 = new BitSet(new long[]{0x0000000000009002L});
    public static final BitSet FOLLOW_parse_ASPM_Edge_in_parse_ASPM_Model314 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_14_in_parse_ASPM_Node355 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_parse_ASPM_Node369 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASPM_Node387 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_ASPM_Node408 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASPM_Node426 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_ASPM_Node447 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASPM_Node461 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASPM_Node479 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASPM_Node500 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_ASPM_Node514 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASPM_Node532 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_ASPM_Node553 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_ASPM_Node567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_parse_ASPM_Prop596 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_parse_ASPM_Prop610 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASPM_Prop628 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_ASPM_Prop649 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASPM_Prop667 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_ASPM_Prop688 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASPM_Prop702 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASPM_Prop720 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASPM_Prop741 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_ASPM_Prop755 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASPM_Prop769 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASPM_Prop787 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASPM_Prop808 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_ASPM_Prop822 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASPM_Prop840 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_ASPM_Prop861 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASPM_Prop879 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_ASPM_Prop900 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_ASPM_Prop914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_parse_ASPM_Edge943 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_parse_ASPM_Edge957 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASPM_Edge975 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_ASPM_Edge996 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASPM_Edge1014 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_ASPM_Edge1035 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASPM_Edge1049 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASPM_Edge1067 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASPM_Edge1088 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_ASPM_Edge1102 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASPM_Edge1120 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_ASPM_Edge1141 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASPM_Edge1155 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASPM_Edge1173 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASPM_Edge1194 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_ASPM_Edge1208 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASPM_Edge1222 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASPM_Edge1240 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASPM_Edge1261 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_ASPM_Edge1275 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_ASPM_Edge1289 = new BitSet(new long[]{0x0000000000000002L});

}