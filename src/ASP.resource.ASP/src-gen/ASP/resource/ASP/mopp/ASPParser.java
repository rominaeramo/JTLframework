// $ANTLR 3.4

	package ASP.resource.ASP.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ASPParser extends ASPANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "LINEBREAK", "QUOTED_40_41", "TEXT", "WHITESPACE", "'!='", "').'", "','", "'.'", "':-'", "'=='", "'edge('", "'edgex('", "'metaedge('", "'metanode('", "'metaprop('", "'node('", "'nodex('", "'not'", "'prop('", "'propx('", "'relation_edge'", "'relation_node'", "'relation_prop'"
    };

    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int COMMENT=4;
    public static final int LINEBREAK=5;
    public static final int QUOTED_40_41=6;
    public static final int TEXT=7;
    public static final int WHITESPACE=8;

    // delegates
    public ASPANTLRParserBase[] getDelegates() {
        return new ASPANTLRParserBase[] {};
    }

    // delegators


    public ASPParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ASPParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.initializeRuleMemo(47 + 1);
         

    }

    public String[] getTokenNames() { return ASPParser.tokenNames; }
    public String getGrammarFileName() { return "ASP.g"; }


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
    		int followSetID = 91;
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
    	



    // $ANTLR start "start"
    // ASP.g:544:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_ASP_Transformation ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;

        int start_StartIndex = input.index();

        ASP.Transformation c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }

            // ASP.g:545:2: ( (c0= parse_ASP_Transformation ) EOF )
            // ASP.g:546:2: (c0= parse_ASP_Transformation ) EOF
            {
            if ( state.backtracking==0 ) {
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

            // ASP.g:564:2: (c0= parse_ASP_Transformation )
            // ASP.g:565:3: c0= parse_ASP_Transformation
            {
            pushFollow(FOLLOW_parse_ASP_Transformation_in_start82);
            c0=parse_ASP_Transformation();

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



    // $ANTLR start "parse_ASP_Transformation"
    // ASP.g:573:1: parse_ASP_Transformation returns [ASP.Transformation element = null] : ( (a0_0= parse_ASP_Element ) )+ ( (a1_0= parse_ASP_Relation ) )+ ( (a2_0= parse_ASP_Constraint ) )* ;
    public final ASP.Transformation parse_ASP_Transformation() throws RecognitionException {
        ASP.Transformation element =  null;

        int parse_ASP_Transformation_StartIndex = input.index();

        ASP.Element a0_0 =null;

        ASP.Relation a1_0 =null;

        ASP.Constraint a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }

            // ASP.g:576:2: ( ( (a0_0= parse_ASP_Element ) )+ ( (a1_0= parse_ASP_Relation ) )+ ( (a2_0= parse_ASP_Constraint ) )* )
            // ASP.g:577:2: ( (a0_0= parse_ASP_Element ) )+ ( (a1_0= parse_ASP_Relation ) )+ ( (a2_0= parse_ASP_Constraint ) )*
            {
            // ASP.g:577:2: ( (a0_0= parse_ASP_Element ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==TEXT||(LA1_0 >= 15 && LA1_0 <= 24)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ASP.g:578:3: (a0_0= parse_ASP_Element )
            	    {
            	    // ASP.g:578:3: (a0_0= parse_ASP_Element )
            	    // ASP.g:579:4: a0_0= parse_ASP_Element
            	    {
            	    pushFollow(FOLLOW_parse_ASP_Element_in_parse_ASP_Transformation124);
            	    a0_0=parse_ASP_Element();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            if ( state.backtracking==0 ) {
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

            // ASP.g:624:2: ( (a1_0= parse_ASP_Relation ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= 25 && LA2_0 <= 27)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ASP.g:625:3: (a1_0= parse_ASP_Relation )
            	    {
            	    // ASP.g:625:3: (a1_0= parse_ASP_Relation )
            	    // ASP.g:626:4: a1_0= parse_ASP_Relation
            	    {
            	    pushFollow(FOLLOW_parse_ASP_Relation_in_parse_ASP_Transformation159);
            	    a1_0=parse_ASP_Relation();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[34]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[35]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[36]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[37]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[38]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[39]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[40]);
            	}

            // ASP.g:658:2: ( (a2_0= parse_ASP_Constraint ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ASP.g:659:3: (a2_0= parse_ASP_Constraint )
            	    {
            	    // ASP.g:659:3: (a2_0= parse_ASP_Constraint )
            	    // ASP.g:660:4: a2_0= parse_ASP_Constraint
            	    {
            	    pushFollow(FOLLOW_parse_ASP_Constraint_in_parse_ASP_Transformation194);
            	    a2_0=parse_ASP_Constraint();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[41]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, parse_ASP_Transformation_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_Transformation"



    // $ANTLR start "parse_ASP_Relation"
    // ASP.g:688:1: parse_ASP_Relation returns [ASP.Relation element = null] : (a0_0= parse_ASP_Pattern ) ( ( (a1_0= parse_ASP_Pattern ) ) )+ ;
    public final ASP.Relation parse_ASP_Relation() throws RecognitionException {
        ASP.Relation element =  null;

        int parse_ASP_Relation_StartIndex = input.index();

        ASP.Pattern a0_0 =null;

        ASP.Pattern a1_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }

            // ASP.g:691:2: ( (a0_0= parse_ASP_Pattern ) ( ( (a1_0= parse_ASP_Pattern ) ) )+ )
            // ASP.g:692:2: (a0_0= parse_ASP_Pattern ) ( ( (a1_0= parse_ASP_Pattern ) ) )+
            {
            // ASP.g:692:2: (a0_0= parse_ASP_Pattern )
            // ASP.g:693:3: a0_0= parse_ASP_Pattern
            {
            pushFollow(FOLLOW_parse_ASP_Pattern_in_parse_ASP_Relation239);
            a0_0=parse_ASP_Pattern();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[42]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[43]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[44]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[45]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[46]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[47]);
            	}

            // ASP.g:723:2: ( ( (a1_0= parse_ASP_Pattern ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                switch ( input.LA(1) ) {
                case 26:
                    {
                    int LA4_2 = input.LA(2);

                    if ( (LA4_2==QUOTED_40_41) ) {
                        int LA4_5 = input.LA(3);

                        if ( (LA4_5==12) ) {
                            int LA4_6 = input.LA(4);

                            if ( (synpred4_ASP()) ) {
                                alt4=1;
                            }


                        }


                    }


                    }
                    break;
                case 27:
                    {
                    int LA4_3 = input.LA(2);

                    if ( (LA4_3==QUOTED_40_41) ) {
                        int LA4_5 = input.LA(3);

                        if ( (LA4_5==12) ) {
                            int LA4_6 = input.LA(4);

                            if ( (synpred4_ASP()) ) {
                                alt4=1;
                            }


                        }


                    }


                    }
                    break;
                case 25:
                    {
                    int LA4_4 = input.LA(2);

                    if ( (LA4_4==QUOTED_40_41) ) {
                        int LA4_5 = input.LA(3);

                        if ( (LA4_5==12) ) {
                            int LA4_6 = input.LA(4);

                            if ( (synpred4_ASP()) ) {
                                alt4=1;
                            }


                        }


                    }


                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // ASP.g:724:3: ( (a1_0= parse_ASP_Pattern ) )
            	    {
            	    // ASP.g:724:3: ( (a1_0= parse_ASP_Pattern ) )
            	    // ASP.g:725:4: (a1_0= parse_ASP_Pattern )
            	    {
            	    // ASP.g:725:4: (a1_0= parse_ASP_Pattern )
            	    // ASP.g:726:5: a1_0= parse_ASP_Pattern
            	    {
            	    pushFollow(FOLLOW_parse_ASP_Pattern_in_parse_ASP_Relation272);
            	    a1_0=parse_ASP_Pattern();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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
            	    						retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_1_0_0_1_0_0_1, a1_0, true);
            	    						copyLocalizationInfos(a1_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[48]);
            	    				addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[49]);
            	    				addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[50]);
            	    				addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[51]);
            	    				addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[52]);
            	    				addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[53]);
            	    				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[54]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[55]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[56]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[57]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[58]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[59]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[60]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[61]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, parse_ASP_Relation_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_Relation"



    // $ANTLR start "parse_ASP_LeftPattern"
    // ASP.g:772:1: parse_ASP_LeftPattern returns [ASP.LeftPattern element = null] : (a0= 'relation_node' |a1= 'relation_prop' |a2= 'relation_edge' ) (a3= QUOTED_40_41 ) a4= '.' ;
    public final ASP.LeftPattern parse_ASP_LeftPattern() throws RecognitionException {
        ASP.LeftPattern element =  null;

        int parse_ASP_LeftPattern_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }

            // ASP.g:775:2: ( (a0= 'relation_node' |a1= 'relation_prop' |a2= 'relation_edge' ) (a3= QUOTED_40_41 ) a4= '.' )
            // ASP.g:776:2: (a0= 'relation_node' |a1= 'relation_prop' |a2= 'relation_edge' ) (a3= QUOTED_40_41 ) a4= '.'
            {
            // ASP.g:776:2: (a0= 'relation_node' |a1= 'relation_prop' |a2= 'relation_edge' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt5=1;
                }
                break;
            case 27:
                {
                alt5=2;
                }
                break;
            case 25:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // ASP.g:777:3: a0= 'relation_node'
                    {
                    a0=(Token)match(input,26,FOLLOW_26_in_parse_ASP_LeftPattern332); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    			if (element == null) {
                    				element = ASP.ASPFactory.eINSTANCE.createLeftPattern();
                    				startIncompleteElement(element);
                    			}
                    			collectHiddenTokens(element);
                    			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_2_0_0_0_0_0_0, null, true);
                    			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
                    		}

                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[62]);
                    		}

                    }
                    break;
                case 2 :
                    // ASP.g:792:6: a1= 'relation_prop'
                    {
                    a1=(Token)match(input,27,FOLLOW_27_in_parse_ASP_LeftPattern355); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    			if (element == null) {
                    				element = ASP.ASPFactory.eINSTANCE.createLeftPattern();
                    				startIncompleteElement(element);
                    			}
                    			collectHiddenTokens(element);
                    			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_2_0_0_0_0_1_0, null, true);
                    			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
                    		}

                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[63]);
                    		}

                    }
                    break;
                case 3 :
                    // ASP.g:807:6: a2= 'relation_edge'
                    {
                    a2=(Token)match(input,25,FOLLOW_25_in_parse_ASP_LeftPattern378); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    			if (element == null) {
                    				element = ASP.ASPFactory.eINSTANCE.createLeftPattern();
                    				startIncompleteElement(element);
                    			}
                    			collectHiddenTokens(element);
                    			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_2_0_0_0_0_2_0, null, true);
                    			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
                    		}

                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[64]);
                    		}

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[65]);
            	}

            // ASP.g:827:2: (a3= QUOTED_40_41 )
            // ASP.g:828:3: a3= QUOTED_40_41
            {
            a3=(Token)match(input,QUOTED_40_41,FOLLOW_QUOTED_40_41_in_parse_ASP_LeftPattern406); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[66]);
            	}

            a4=(Token)match(input,12,FOLLOW_12_in_parse_ASP_LeftPattern427); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createLeftPattern();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_2_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[67]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[68]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[69]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[70]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[71]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[72]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, parse_ASP_LeftPattern_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_LeftPattern"



    // $ANTLR start "parse_ASP_RightPattern"
    // ASP.g:888:1: parse_ASP_RightPattern returns [ASP.RightPattern element = null] : (a0= 'relation_node' |a1= 'relation_prop' |a2= 'relation_edge' ) (a3= QUOTED_40_41 ) a4= '.' ;
    public final ASP.RightPattern parse_ASP_RightPattern() throws RecognitionException {
        ASP.RightPattern element =  null;

        int parse_ASP_RightPattern_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }

            // ASP.g:891:2: ( (a0= 'relation_node' |a1= 'relation_prop' |a2= 'relation_edge' ) (a3= QUOTED_40_41 ) a4= '.' )
            // ASP.g:892:2: (a0= 'relation_node' |a1= 'relation_prop' |a2= 'relation_edge' ) (a3= QUOTED_40_41 ) a4= '.'
            {
            // ASP.g:892:2: (a0= 'relation_node' |a1= 'relation_prop' |a2= 'relation_edge' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt6=1;
                }
                break;
            case 27:
                {
                alt6=2;
                }
                break;
            case 25:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // ASP.g:893:3: a0= 'relation_node'
                    {
                    a0=(Token)match(input,26,FOLLOW_26_in_parse_ASP_RightPattern460); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    			if (element == null) {
                    				element = ASP.ASPFactory.eINSTANCE.createRightPattern();
                    				startIncompleteElement(element);
                    			}
                    			collectHiddenTokens(element);
                    			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_0_0_0_0, null, true);
                    			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
                    		}

                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[73]);
                    		}

                    }
                    break;
                case 2 :
                    // ASP.g:908:6: a1= 'relation_prop'
                    {
                    a1=(Token)match(input,27,FOLLOW_27_in_parse_ASP_RightPattern483); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    			if (element == null) {
                    				element = ASP.ASPFactory.eINSTANCE.createRightPattern();
                    				startIncompleteElement(element);
                    			}
                    			collectHiddenTokens(element);
                    			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_0_0_1_0, null, true);
                    			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
                    		}

                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[74]);
                    		}

                    }
                    break;
                case 3 :
                    // ASP.g:923:6: a2= 'relation_edge'
                    {
                    a2=(Token)match(input,25,FOLLOW_25_in_parse_ASP_RightPattern506); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    			if (element == null) {
                    				element = ASP.ASPFactory.eINSTANCE.createRightPattern();
                    				startIncompleteElement(element);
                    			}
                    			collectHiddenTokens(element);
                    			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_0_0_2_0, null, true);
                    			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
                    		}

                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[75]);
                    		}

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[76]);
            	}

            // ASP.g:943:2: (a3= QUOTED_40_41 )
            // ASP.g:944:3: a3= QUOTED_40_41
            {
            a3=(Token)match(input,QUOTED_40_41,FOLLOW_QUOTED_40_41_in_parse_ASP_RightPattern534); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[77]);
            	}

            a4=(Token)match(input,12,FOLLOW_12_in_parse_ASP_RightPattern555); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createRightPattern();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[78]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[79]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[80]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[81]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[82]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[83]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, parse_ASP_RightPattern_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_RightPattern"



    // $ANTLR start "parse_ASP_Metanode"
    // ASP.g:1004:1: parse_ASP_Metanode returns [ASP.Metanode element = null] : a0= 'metanode(' (a1= TEXT ) a2= ',' (a3= TEXT ) a4= ').' ;
    public final ASP.Metanode parse_ASP_Metanode() throws RecognitionException {
        ASP.Metanode element =  null;

        int parse_ASP_Metanode_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }

            // ASP.g:1007:2: (a0= 'metanode(' (a1= TEXT ) a2= ',' (a3= TEXT ) a4= ').' )
            // ASP.g:1008:2: a0= 'metanode(' (a1= TEXT ) a2= ',' (a3= TEXT ) a4= ').'
            {
            a0=(Token)match(input,18,FOLLOW_18_in_parse_ASP_Metanode584); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createMetanode();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[84]);
            	}

            // ASP.g:1022:2: (a1= TEXT )
            // ASP.g:1023:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Metanode602); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[85]);
            	}

            a2=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Metanode623); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createMetanode();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[86]);
            	}

            // ASP.g:1076:2: (a3= TEXT )
            // ASP.g:1077:3: a3= TEXT
            {
            a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Metanode641); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[87]);
            	}

            a4=(Token)match(input,10,FOLLOW_10_in_parse_ASP_Metanode662); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createMetanode();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[88]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[89]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[90]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[91]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[92]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[93]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[94]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[95]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[96]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[97]);
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
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, parse_ASP_Metanode_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_Metanode"



    // $ANTLR start "parse_ASP_Metaprop"
    // ASP.g:1151:1: parse_ASP_Metaprop returns [ASP.Metaprop element = null] : a0= 'metaprop(' (a1= TEXT ) a2= ',' (a3= TEXT ) a4= ',' (a5= TEXT ) a6= ').' ;
    public final ASP.Metaprop parse_ASP_Metaprop() throws RecognitionException {
        ASP.Metaprop element =  null;

        int parse_ASP_Metaprop_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }

            // ASP.g:1154:2: (a0= 'metaprop(' (a1= TEXT ) a2= ',' (a3= TEXT ) a4= ',' (a5= TEXT ) a6= ').' )
            // ASP.g:1155:2: a0= 'metaprop(' (a1= TEXT ) a2= ',' (a3= TEXT ) a4= ',' (a5= TEXT ) a6= ').'
            {
            a0=(Token)match(input,19,FOLLOW_19_in_parse_ASP_Metaprop691); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createMetaprop();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[108]);
            	}

            // ASP.g:1169:2: (a1= TEXT )
            // ASP.g:1170:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Metaprop709); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[109]);
            	}

            a2=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Metaprop730); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createMetaprop();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[110]);
            	}

            // ASP.g:1223:2: (a3= TEXT )
            // ASP.g:1224:3: a3= TEXT
            {
            a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Metaprop748); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[111]);
            	}

            a4=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Metaprop769); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createMetaprop();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[112]);
            	}

            // ASP.g:1277:2: (a5= TEXT )
            // ASP.g:1278:3: a5= TEXT
            {
            a5=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Metaprop787); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[113]);
            	}

            a6=(Token)match(input,10,FOLLOW_10_in_parse_ASP_Metaprop808); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createMetaprop();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_8, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[114]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[115]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[116]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[117]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[118]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[119]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[120]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[121]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[122]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[123]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[124]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[125]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[126]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[127]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[128]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[129]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[130]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[131]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[132]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[133]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, parse_ASP_Metaprop_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_Metaprop"



    // $ANTLR start "parse_ASP_Metaedge"
    // ASP.g:1352:1: parse_ASP_Metaedge returns [ASP.Metaedge element = null] : a0= 'metaedge(' (a1= TEXT ) a2= ',' (a3= TEXT ) a4= ',' (a5= TEXT ) a6= ',' (a7= TEXT ) a8= ').' ;
    public final ASP.Metaedge parse_ASP_Metaedge() throws RecognitionException {
        ASP.Metaedge element =  null;

        int parse_ASP_Metaedge_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }

            // ASP.g:1355:2: (a0= 'metaedge(' (a1= TEXT ) a2= ',' (a3= TEXT ) a4= ',' (a5= TEXT ) a6= ',' (a7= TEXT ) a8= ').' )
            // ASP.g:1356:2: a0= 'metaedge(' (a1= TEXT ) a2= ',' (a3= TEXT ) a4= ',' (a5= TEXT ) a6= ',' (a7= TEXT ) a8= ').'
            {
            a0=(Token)match(input,17,FOLLOW_17_in_parse_ASP_Metaedge837); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createMetaedge();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[134]);
            	}

            // ASP.g:1370:2: (a1= TEXT )
            // ASP.g:1371:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Metaedge855); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[135]);
            	}

            a2=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Metaedge876); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createMetaedge();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[136]);
            	}

            // ASP.g:1424:2: (a3= TEXT )
            // ASP.g:1425:3: a3= TEXT
            {
            a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Metaedge894); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[137]);
            	}

            a4=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Metaedge915); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createMetaedge();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[138]);
            	}

            // ASP.g:1478:2: (a5= TEXT )
            // ASP.g:1479:3: a5= TEXT
            {
            a5=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Metaedge933); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[139]);
            	}

            a6=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Metaedge954); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createMetaedge();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_8, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[140]);
            	}

            // ASP.g:1532:2: (a7= TEXT )
            // ASP.g:1533:3: a7= TEXT
            {
            a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Metaedge972); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[141]);
            	}

            a8=(Token)match(input,10,FOLLOW_10_in_parse_ASP_Metaedge993); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createMetaedge();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_11, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[142]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[143]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[144]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[145]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[146]);
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
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, parse_ASP_Metaedge_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_Metaedge"



    // $ANTLR start "parse_ASP_Literal"
    // ASP.g:1607:1: parse_ASP_Literal returns [ASP.Literal element = null] : (a0= TEXT ) ( (a1= '.' ) )? ;
    public final ASP.Literal parse_ASP_Literal() throws RecognitionException {
        ASP.Literal element =  null;

        int parse_ASP_Literal_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }

            // ASP.g:1610:2: ( (a0= TEXT ) ( (a1= '.' ) )? )
            // ASP.g:1611:2: (a0= TEXT ) ( (a1= '.' ) )?
            {
            // ASP.g:1611:2: (a0= TEXT )
            // ASP.g:1612:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Literal1026); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[162]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[163]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[164]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[165]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[166]);
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
            	}

            // ASP.g:1667:2: ( (a1= '.' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ASP.g:1668:3: (a1= '.' )
                    {
                    // ASP.g:1668:3: (a1= '.' )
                    // ASP.g:1669:4: a1= '.'
                    {
                    a1=(Token)match(input,12,FOLLOW_12_in_parse_ASP_Literal1056); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createLiteral();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_1_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[183]);
                    				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[184]);
                    				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[185]);
                    				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[186]);
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
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[203]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[204]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[205]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[206]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[207]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[208]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[209]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[210]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[211]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[212]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[213]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[214]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[215]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[216]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[217]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[218]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[219]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[220]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[221]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[222]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, parse_ASP_Literal_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_Literal"



    // $ANTLR start "parse_ASP_Constraint"
    // ASP.g:1730:1: parse_ASP_Constraint returns [ASP.Constraint element = null] : a0= ':-' (a1_0= parse_ASP_Expression ) ( (a2= ',' (a3_0= parse_ASP_Expression ) ) )* a4= '.' ;
    public final ASP.Constraint parse_ASP_Constraint() throws RecognitionException {
        ASP.Constraint element =  null;

        int parse_ASP_Constraint_StartIndex = input.index();

        Token a0=null;
        Token a2=null;
        Token a4=null;
        ASP.Expression a1_0 =null;

        ASP.Expression a3_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }

            // ASP.g:1733:2: (a0= ':-' (a1_0= parse_ASP_Expression ) ( (a2= ',' (a3_0= parse_ASP_Expression ) ) )* a4= '.' )
            // ASP.g:1734:2: a0= ':-' (a1_0= parse_ASP_Expression ) ( (a2= ',' (a3_0= parse_ASP_Expression ) ) )* a4= '.'
            {
            a0=(Token)match(input,13,FOLLOW_13_in_parse_ASP_Constraint1104); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createConstraint();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_8_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getConstraint(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[223]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getConstraint(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[224]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getConstraint(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[225]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getConstraint(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[226]);
            	}

            // ASP.g:1751:2: (a1_0= parse_ASP_Expression )
            // ASP.g:1752:3: a1_0= parse_ASP_Expression
            {
            pushFollow(FOLLOW_parse_ASP_Expression_in_parse_ASP_Constraint1122);
            a1_0=parse_ASP_Expression();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[227]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[228]);
            	}

            // ASP.g:1778:2: ( (a2= ',' (a3_0= parse_ASP_Expression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==11) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ASP.g:1779:3: (a2= ',' (a3_0= parse_ASP_Expression ) )
            	    {
            	    // ASP.g:1779:3: (a2= ',' (a3_0= parse_ASP_Expression ) )
            	    // ASP.g:1780:4: a2= ',' (a3_0= parse_ASP_Expression )
            	    {
            	    a2=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Constraint1149); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createConstraint();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_8_0_0_2_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(ASP.ASPPackage.eINSTANCE.getConstraint(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[229]);
            	    				addExpectedElement(ASP.ASPPackage.eINSTANCE.getConstraint(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[230]);
            	    				addExpectedElement(ASP.ASPPackage.eINSTANCE.getConstraint(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[231]);
            	    				addExpectedElement(ASP.ASPPackage.eINSTANCE.getConstraint(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[232]);
            	    			}

            	    // ASP.g:1797:4: (a3_0= parse_ASP_Expression )
            	    // ASP.g:1798:5: a3_0= parse_ASP_Expression
            	    {
            	    pushFollow(FOLLOW_parse_ASP_Expression_in_parse_ASP_Constraint1175);
            	    a3_0=parse_ASP_Expression();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[233]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[234]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[235]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[236]);
            	}

            a4=(Token)match(input,12,FOLLOW_12_in_parse_ASP_Constraint1216); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createConstraint();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_8_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[237]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, parse_ASP_Constraint_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_Constraint"



    // $ANTLR start "parse_ASP_Terminal"
    // ASP.g:1848:1: parse_ASP_Terminal returns [ASP.Terminal element = null] : (a0= TEXT ) ;
    public final ASP.Terminal parse_ASP_Terminal() throws RecognitionException {
        ASP.Terminal element =  null;

        int parse_ASP_Terminal_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }

            // ASP.g:1851:2: ( (a0= TEXT ) )
            // ASP.g:1852:2: (a0= TEXT )
            {
            // ASP.g:1852:2: (a0= TEXT )
            // ASP.g:1853:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Terminal1249); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[238]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[239]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[240]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[241]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[242]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[243]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[244]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[245]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[246]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[247]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[248]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[249]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[250]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[251]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[252]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[253]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[254]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[255]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[256]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[257]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[258]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[259]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, parse_ASP_Terminal_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_Terminal"



    // $ANTLR start "parse_ASP_Node"
    // ASP.g:1915:1: parse_ASP_Node returns [ASP.Node element = null] : (a0= 'node(' |a1= 'nodex(' ) (a2= TEXT ) a3= ',' (a4= TEXT ) a5= ',' (a6= TEXT ) a7= ').' ;
    public final ASP.Node parse_ASP_Node() throws RecognitionException {
        ASP.Node element =  null;

        int parse_ASP_Node_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }

            // ASP.g:1918:2: ( (a0= 'node(' |a1= 'nodex(' ) (a2= TEXT ) a3= ',' (a4= TEXT ) a5= ',' (a6= TEXT ) a7= ').' )
            // ASP.g:1919:2: (a0= 'node(' |a1= 'nodex(' ) (a2= TEXT ) a3= ',' (a4= TEXT ) a5= ',' (a6= TEXT ) a7= ').'
            {
            // ASP.g:1919:2: (a0= 'node(' |a1= 'nodex(' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            else if ( (LA9_0==21) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // ASP.g:1920:3: a0= 'node('
                    {
                    a0=(Token)match(input,20,FOLLOW_20_in_parse_ASP_Node1289); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    			if (element == null) {
                    				element = ASP.ASPFactory.eINSTANCE.createNode();
                    				startIncompleteElement(element);
                    			}
                    			collectHiddenTokens(element);
                    			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_0_0_0_0, null, true);
                    			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
                    		}

                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[260]);
                    		}

                    }
                    break;
                case 2 :
                    // ASP.g:1935:6: a1= 'nodex('
                    {
                    a1=(Token)match(input,21,FOLLOW_21_in_parse_ASP_Node1312); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    			if (element == null) {
                    				element = ASP.ASPFactory.eINSTANCE.createNode();
                    				startIncompleteElement(element);
                    			}
                    			collectHiddenTokens(element);
                    			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_0_0_1_0, null, true);
                    			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
                    		}

                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[261]);
                    		}

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[262]);
            	}

            // ASP.g:1955:2: (a2= TEXT )
            // ASP.g:1956:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Node1340); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[263]);
            	}

            a3=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Node1361); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createNode();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[264]);
            	}

            // ASP.g:2009:2: (a4= TEXT )
            // ASP.g:2010:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Node1379); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[265]);
            	}

            a5=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Node1400); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createNode();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[266]);
            	}

            // ASP.g:2063:2: (a6= TEXT )
            // ASP.g:2064:3: a6= TEXT
            {
            a6=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Node1418); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[267]);
            	}

            a7=(Token)match(input,10,FOLLOW_10_in_parse_ASP_Node1439); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createNode();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_10_0_0_8, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[268]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[269]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[270]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[271]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[272]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[273]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[274]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[275]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[276]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[277]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[278]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[279]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[280]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[281]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[282]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[283]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[284]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[285]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[286]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[287]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, parse_ASP_Node_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_Node"



    // $ANTLR start "parse_ASP_Prop"
    // ASP.g:2138:1: parse_ASP_Prop returns [ASP.Prop element = null] : (a0= 'prop(' |a1= 'propx(' ) (a2= TEXT ) a3= ',' (a4= TEXT ) a5= ',' (a6= TEXT ) a7= ',' (a8= TEXT ) a9= ').' ;
    public final ASP.Prop parse_ASP_Prop() throws RecognitionException {
        ASP.Prop element =  null;

        int parse_ASP_Prop_StartIndex = input.index();

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



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }

            // ASP.g:2141:2: ( (a0= 'prop(' |a1= 'propx(' ) (a2= TEXT ) a3= ',' (a4= TEXT ) a5= ',' (a6= TEXT ) a7= ',' (a8= TEXT ) a9= ').' )
            // ASP.g:2142:2: (a0= 'prop(' |a1= 'propx(' ) (a2= TEXT ) a3= ',' (a4= TEXT ) a5= ',' (a6= TEXT ) a7= ',' (a8= TEXT ) a9= ').'
            {
            // ASP.g:2142:2: (a0= 'prop(' |a1= 'propx(' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            else if ( (LA10_0==24) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // ASP.g:2143:3: a0= 'prop('
                    {
                    a0=(Token)match(input,23,FOLLOW_23_in_parse_ASP_Prop1472); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    			if (element == null) {
                    				element = ASP.ASPFactory.eINSTANCE.createProp();
                    				startIncompleteElement(element);
                    			}
                    			collectHiddenTokens(element);
                    			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_0_0_0_0, null, true);
                    			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
                    		}

                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[288]);
                    		}

                    }
                    break;
                case 2 :
                    // ASP.g:2158:6: a1= 'propx('
                    {
                    a1=(Token)match(input,24,FOLLOW_24_in_parse_ASP_Prop1495); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    			if (element == null) {
                    				element = ASP.ASPFactory.eINSTANCE.createProp();
                    				startIncompleteElement(element);
                    			}
                    			collectHiddenTokens(element);
                    			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_0_0_1_0, null, true);
                    			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
                    		}

                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[289]);
                    		}

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[290]);
            	}

            // ASP.g:2178:2: (a2= TEXT )
            // ASP.g:2179:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Prop1523); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[291]);
            	}

            a3=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Prop1544); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createProp();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[292]);
            	}

            // ASP.g:2232:2: (a4= TEXT )
            // ASP.g:2233:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Prop1562); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[293]);
            	}

            a5=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Prop1583); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createProp();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[294]);
            	}

            // ASP.g:2286:2: (a6= TEXT )
            // ASP.g:2287:3: a6= TEXT
            {
            a6=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Prop1601); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[295]);
            	}

            a7=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Prop1622); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createProp();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_8, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[296]);
            	}

            // ASP.g:2340:2: (a8= TEXT )
            // ASP.g:2341:3: a8= TEXT
            {
            a8=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Prop1640); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[297]);
            	}

            a9=(Token)match(input,10,FOLLOW_10_in_parse_ASP_Prop1661); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createProp();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_11_0_0_11, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[298]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[299]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[300]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[301]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[302]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[303]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[304]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[305]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[306]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[307]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[308]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[309]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[310]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[311]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[312]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[313]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[314]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[315]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[316]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[317]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, parse_ASP_Prop_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_Prop"



    // $ANTLR start "parse_ASP_Edge"
    // ASP.g:2415:1: parse_ASP_Edge returns [ASP.Edge element = null] : (a0= 'edge(' |a1= 'edgex(' ) (a2= TEXT ) a3= ',' (a4= TEXT ) a5= ',' (a6= TEXT ) a7= ',' (a8= TEXT ) a9= ',' (a10= TEXT ) a11= ').' ;
    public final ASP.Edge parse_ASP_Edge() throws RecognitionException {
        ASP.Edge element =  null;

        int parse_ASP_Edge_StartIndex = input.index();

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



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }

            // ASP.g:2418:2: ( (a0= 'edge(' |a1= 'edgex(' ) (a2= TEXT ) a3= ',' (a4= TEXT ) a5= ',' (a6= TEXT ) a7= ',' (a8= TEXT ) a9= ',' (a10= TEXT ) a11= ').' )
            // ASP.g:2419:2: (a0= 'edge(' |a1= 'edgex(' ) (a2= TEXT ) a3= ',' (a4= TEXT ) a5= ',' (a6= TEXT ) a7= ',' (a8= TEXT ) a9= ',' (a10= TEXT ) a11= ').'
            {
            // ASP.g:2419:2: (a0= 'edge(' |a1= 'edgex(' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            else if ( (LA11_0==16) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // ASP.g:2420:3: a0= 'edge('
                    {
                    a0=(Token)match(input,15,FOLLOW_15_in_parse_ASP_Edge1694); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    			if (element == null) {
                    				element = ASP.ASPFactory.eINSTANCE.createEdge();
                    				startIncompleteElement(element);
                    			}
                    			collectHiddenTokens(element);
                    			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_0_0_0_0, null, true);
                    			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
                    		}

                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[318]);
                    		}

                    }
                    break;
                case 2 :
                    // ASP.g:2435:6: a1= 'edgex('
                    {
                    a1=(Token)match(input,16,FOLLOW_16_in_parse_ASP_Edge1717); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    			if (element == null) {
                    				element = ASP.ASPFactory.eINSTANCE.createEdge();
                    				startIncompleteElement(element);
                    			}
                    			collectHiddenTokens(element);
                    			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_0_0_1_0, null, true);
                    			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
                    		}

                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[319]);
                    		}

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[320]);
            	}

            // ASP.g:2455:2: (a2= TEXT )
            // ASP.g:2456:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Edge1745); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[321]);
            	}

            a3=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Edge1766); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createEdge();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[322]);
            	}

            // ASP.g:2509:2: (a4= TEXT )
            // ASP.g:2510:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Edge1784); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[323]);
            	}

            a5=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Edge1805); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createEdge();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[324]);
            	}

            // ASP.g:2563:2: (a6= TEXT )
            // ASP.g:2564:3: a6= TEXT
            {
            a6=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Edge1823); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[325]);
            	}

            a7=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Edge1844); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createEdge();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_8, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[326]);
            	}

            // ASP.g:2617:2: (a8= TEXT )
            // ASP.g:2618:3: a8= TEXT
            {
            a8=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Edge1862); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[327]);
            	}

            a9=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Edge1883); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createEdge();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_11, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[328]);
            	}

            // ASP.g:2671:2: (a10= TEXT )
            // ASP.g:2672:3: a10= TEXT
            {
            a10=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Edge1901); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[329]);
            	}

            a11=(Token)match(input,10,FOLLOW_10_in_parse_ASP_Edge1922); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createEdge();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_12_0_0_14, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[330]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[331]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[332]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[333]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[334]);
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
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, parse_ASP_Edge_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_Edge"



    // $ANTLR start "parse_ASP_Not"
    // ASP.g:2746:1: parse_ASP_Not returns [ASP.Not element = null] : a0= 'not' (a1= TEXT ) ;
    public final ASP.Not parse_ASP_Not() throws RecognitionException {
        ASP.Not element =  null;

        int parse_ASP_Not_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return element; }

            // ASP.g:2749:2: (a0= 'not' (a1= TEXT ) )
            // ASP.g:2750:2: a0= 'not' (a1= TEXT )
            {
            a0=(Token)match(input,22,FOLLOW_22_in_parse_ASP_Not1951); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createNot();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_13_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[350]);
            	}

            // ASP.g:2764:2: (a1= TEXT )
            // ASP.g:2765:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Not1969); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[351]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[352]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[353]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[354]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[355]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[356]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[357]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[358]);
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
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[371]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[372]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, parse_ASP_Not_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_Not"



    // $ANTLR start "parse_ASP_Eq"
    // ASP.g:2827:1: parse_ASP_Eq returns [ASP.Eq element = null] : (a0= TEXT ) a1= '==' (a2= TEXT ) ;
    public final ASP.Eq parse_ASP_Eq() throws RecognitionException {
        ASP.Eq element =  null;

        int parse_ASP_Eq_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return element; }

            // ASP.g:2830:2: ( (a0= TEXT ) a1= '==' (a2= TEXT ) )
            // ASP.g:2831:2: (a0= TEXT ) a1= '==' (a2= TEXT )
            {
            // ASP.g:2831:2: (a0= TEXT )
            // ASP.g:2832:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Eq2009); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[373]);
            	}

            a1=(Token)match(input,14,FOLLOW_14_in_parse_ASP_Eq2030); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createEq();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_14_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[374]);
            	}

            // ASP.g:2885:2: (a2= TEXT )
            // ASP.g:2886:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Eq2048); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[375]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[376]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[377]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[378]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[379]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[380]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[381]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[382]);
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
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[395]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[396]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, parse_ASP_Eq_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_Eq"



    // $ANTLR start "parse_ASP_NotEq"
    // ASP.g:2948:1: parse_ASP_NotEq returns [ASP.NotEq element = null] : (a0= TEXT ) a1= '!=' (a2= TEXT ) ;
    public final ASP.NotEq parse_ASP_NotEq() throws RecognitionException {
        ASP.NotEq element =  null;

        int parse_ASP_NotEq_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return element; }

            // ASP.g:2951:2: ( (a0= TEXT ) a1= '!=' (a2= TEXT ) )
            // ASP.g:2952:2: (a0= TEXT ) a1= '!=' (a2= TEXT )
            {
            // ASP.g:2952:2: (a0= TEXT )
            // ASP.g:2953:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_NotEq2088); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[397]);
            	}

            a1=(Token)match(input,9,FOLLOW_9_in_parse_ASP_NotEq2109); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createNotEq();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_15_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[398]);
            	}

            // ASP.g:3006:2: (a2= TEXT )
            // ASP.g:3007:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_NotEq2127); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[399]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[400]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[401]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[402]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[403]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[404]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[405]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[406]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[407]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[408]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[409]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[410]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[411]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[412]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[413]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[414]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[415]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[416]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[417]);
            		addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[418]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[419]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[420]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, parse_ASP_NotEq_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_NotEq"



    // $ANTLR start "parse_ASP_Element"
    // ASP.g:3069:1: parse_ASP_Element returns [ASP.Element element = null] : (c0= parse_ASP_Metanode |c1= parse_ASP_Metaprop |c2= parse_ASP_Metaedge |c3= parse_ASP_Literal |c4= parse_ASP_Terminal |c5= parse_ASP_Node |c6= parse_ASP_Prop |c7= parse_ASP_Edge |c8= parse_ASP_Not |c9= parse_ASP_Eq |c10= parse_ASP_NotEq );
    public final ASP.Element parse_ASP_Element() throws RecognitionException {
        ASP.Element element =  null;

        int parse_ASP_Element_StartIndex = input.index();

        ASP.Metanode c0 =null;

        ASP.Metaprop c1 =null;

        ASP.Metaedge c2 =null;

        ASP.Literal c3 =null;

        ASP.Terminal c4 =null;

        ASP.Node c5 =null;

        ASP.Prop c6 =null;

        ASP.Edge c7 =null;

        ASP.Not c8 =null;

        ASP.Eq c9 =null;

        ASP.NotEq c10 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return element; }

            // ASP.g:3070:2: (c0= parse_ASP_Metanode |c1= parse_ASP_Metaprop |c2= parse_ASP_Metaedge |c3= parse_ASP_Literal |c4= parse_ASP_Terminal |c5= parse_ASP_Node |c6= parse_ASP_Prop |c7= parse_ASP_Edge |c8= parse_ASP_Not |c9= parse_ASP_Eq |c10= parse_ASP_NotEq )
            int alt12=11;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt12=1;
                }
                break;
            case 19:
                {
                alt12=2;
                }
                break;
            case 17:
                {
                alt12=3;
                }
                break;
            case TEXT:
                {
                int LA12_4 = input.LA(2);

                if ( (LA12_4==14) ) {
                    alt12=10;
                }
                else if ( (LA12_4==9) ) {
                    alt12=11;
                }
                else if ( (synpred17_ASP()) ) {
                    alt12=4;
                }
                else if ( (synpred18_ASP()) ) {
                    alt12=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 4, input);

                    throw nvae;

                }
                }
                break;
            case 20:
            case 21:
                {
                alt12=6;
                }
                break;
            case 23:
            case 24:
                {
                alt12=7;
                }
                break;
            case 15:
            case 16:
                {
                alt12=8;
                }
                break;
            case 22:
                {
                alt12=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // ASP.g:3071:2: c0= parse_ASP_Metanode
                    {
                    pushFollow(FOLLOW_parse_ASP_Metanode_in_parse_ASP_Element2159);
                    c0=parse_ASP_Metanode();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // ASP.g:3072:4: c1= parse_ASP_Metaprop
                    {
                    pushFollow(FOLLOW_parse_ASP_Metaprop_in_parse_ASP_Element2169);
                    c1=parse_ASP_Metaprop();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // ASP.g:3073:4: c2= parse_ASP_Metaedge
                    {
                    pushFollow(FOLLOW_parse_ASP_Metaedge_in_parse_ASP_Element2179);
                    c2=parse_ASP_Metaedge();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c2; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 4 :
                    // ASP.g:3074:4: c3= parse_ASP_Literal
                    {
                    pushFollow(FOLLOW_parse_ASP_Literal_in_parse_ASP_Element2189);
                    c3=parse_ASP_Literal();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c3; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 5 :
                    // ASP.g:3075:4: c4= parse_ASP_Terminal
                    {
                    pushFollow(FOLLOW_parse_ASP_Terminal_in_parse_ASP_Element2199);
                    c4=parse_ASP_Terminal();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c4; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 6 :
                    // ASP.g:3076:4: c5= parse_ASP_Node
                    {
                    pushFollow(FOLLOW_parse_ASP_Node_in_parse_ASP_Element2209);
                    c5=parse_ASP_Node();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c5; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 7 :
                    // ASP.g:3077:4: c6= parse_ASP_Prop
                    {
                    pushFollow(FOLLOW_parse_ASP_Prop_in_parse_ASP_Element2219);
                    c6=parse_ASP_Prop();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c6; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 8 :
                    // ASP.g:3078:4: c7= parse_ASP_Edge
                    {
                    pushFollow(FOLLOW_parse_ASP_Edge_in_parse_ASP_Element2229);
                    c7=parse_ASP_Edge();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c7; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 9 :
                    // ASP.g:3079:4: c8= parse_ASP_Not
                    {
                    pushFollow(FOLLOW_parse_ASP_Not_in_parse_ASP_Element2239);
                    c8=parse_ASP_Not();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c8; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 10 :
                    // ASP.g:3080:4: c9= parse_ASP_Eq
                    {
                    pushFollow(FOLLOW_parse_ASP_Eq_in_parse_ASP_Element2249);
                    c9=parse_ASP_Eq();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c9; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 11 :
                    // ASP.g:3081:4: c10= parse_ASP_NotEq
                    {
                    pushFollow(FOLLOW_parse_ASP_NotEq_in_parse_ASP_Element2259);
                    c10=parse_ASP_NotEq();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c10; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 18, parse_ASP_Element_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_Element"



    // $ANTLR start "parse_ASP_Pattern"
    // ASP.g:3085:1: parse_ASP_Pattern returns [ASP.Pattern element = null] : (c0= parse_ASP_LeftPattern |c1= parse_ASP_RightPattern );
    public final ASP.Pattern parse_ASP_Pattern() throws RecognitionException {
        ASP.Pattern element =  null;

        int parse_ASP_Pattern_StartIndex = input.index();

        ASP.LeftPattern c0 =null;

        ASP.RightPattern c1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return element; }

            // ASP.g:3086:2: (c0= parse_ASP_LeftPattern |c1= parse_ASP_RightPattern )
            int alt13=2;
            switch ( input.LA(1) ) {
            case 26:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==QUOTED_40_41) ) {
                    int LA13_4 = input.LA(3);

                    if ( (LA13_4==12) ) {
                        int LA13_5 = input.LA(4);

                        if ( (synpred24_ASP()) ) {
                            alt13=1;
                        }
                        else if ( (true) ) {
                            alt13=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return element;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 5, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 4, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;

                }
                }
                break;
            case 27:
                {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==QUOTED_40_41) ) {
                    int LA13_4 = input.LA(3);

                    if ( (LA13_4==12) ) {
                        int LA13_5 = input.LA(4);

                        if ( (synpred24_ASP()) ) {
                            alt13=1;
                        }
                        else if ( (true) ) {
                            alt13=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return element;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 5, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 4, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;

                }
                }
                break;
            case 25:
                {
                int LA13_3 = input.LA(2);

                if ( (LA13_3==QUOTED_40_41) ) {
                    int LA13_4 = input.LA(3);

                    if ( (LA13_4==12) ) {
                        int LA13_5 = input.LA(4);

                        if ( (synpred24_ASP()) ) {
                            alt13=1;
                        }
                        else if ( (true) ) {
                            alt13=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return element;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 5, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 4, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // ASP.g:3087:2: c0= parse_ASP_LeftPattern
                    {
                    pushFollow(FOLLOW_parse_ASP_LeftPattern_in_parse_ASP_Pattern2280);
                    c0=parse_ASP_LeftPattern();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // ASP.g:3088:4: c1= parse_ASP_RightPattern
                    {
                    pushFollow(FOLLOW_parse_ASP_RightPattern_in_parse_ASP_Pattern2290);
                    c1=parse_ASP_RightPattern();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 19, parse_ASP_Pattern_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_Pattern"



    // $ANTLR start "parse_ASP_Expression"
    // ASP.g:3092:1: parse_ASP_Expression returns [ASP.Expression element = null] : (c0= parse_ASP_Terminal |c1= parse_ASP_Not |c2= parse_ASP_Eq |c3= parse_ASP_NotEq );
    public final ASP.Expression parse_ASP_Expression() throws RecognitionException {
        ASP.Expression element =  null;

        int parse_ASP_Expression_StartIndex = input.index();

        ASP.Terminal c0 =null;

        ASP.Not c1 =null;

        ASP.Eq c2 =null;

        ASP.NotEq c3 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return element; }

            // ASP.g:3093:2: (c0= parse_ASP_Terminal |c1= parse_ASP_Not |c2= parse_ASP_Eq |c3= parse_ASP_NotEq )
            int alt14=4;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==TEXT) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case 11:
                case 12:
                    {
                    alt14=1;
                    }
                    break;
                case 14:
                    {
                    alt14=3;
                    }
                    break;
                case 9:
                    {
                    alt14=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;

                }

            }
            else if ( (LA14_0==22) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // ASP.g:3094:2: c0= parse_ASP_Terminal
                    {
                    pushFollow(FOLLOW_parse_ASP_Terminal_in_parse_ASP_Expression2311);
                    c0=parse_ASP_Terminal();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // ASP.g:3095:4: c1= parse_ASP_Not
                    {
                    pushFollow(FOLLOW_parse_ASP_Not_in_parse_ASP_Expression2321);
                    c1=parse_ASP_Not();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // ASP.g:3096:4: c2= parse_ASP_Eq
                    {
                    pushFollow(FOLLOW_parse_ASP_Eq_in_parse_ASP_Expression2331);
                    c2=parse_ASP_Eq();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c2; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 4 :
                    // ASP.g:3097:4: c3= parse_ASP_NotEq
                    {
                    pushFollow(FOLLOW_parse_ASP_NotEq_in_parse_ASP_Expression2341);
                    c3=parse_ASP_NotEq();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c3; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 20, parse_ASP_Expression_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_Expression"

    // $ANTLR start synpred4_ASP
    public final void synpred4_ASP_fragment() throws RecognitionException {
        ASP.Pattern a1_0 =null;


        // ASP.g:724:3: ( ( (a1_0= parse_ASP_Pattern ) ) )
        // ASP.g:724:3: ( (a1_0= parse_ASP_Pattern ) )
        {
        // ASP.g:724:3: ( (a1_0= parse_ASP_Pattern ) )
        // ASP.g:725:4: (a1_0= parse_ASP_Pattern )
        {
        // ASP.g:725:4: (a1_0= parse_ASP_Pattern )
        // ASP.g:726:5: a1_0= parse_ASP_Pattern
        {
        pushFollow(FOLLOW_parse_ASP_Pattern_in_synpred4_ASP272);
        a1_0=parse_ASP_Pattern();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

    }
    // $ANTLR end synpred4_ASP

    // $ANTLR start synpred17_ASP
    public final void synpred17_ASP_fragment() throws RecognitionException {
        ASP.Literal c3 =null;


        // ASP.g:3074:4: (c3= parse_ASP_Literal )
        // ASP.g:3074:4: c3= parse_ASP_Literal
        {
        pushFollow(FOLLOW_parse_ASP_Literal_in_synpred17_ASP2189);
        c3=parse_ASP_Literal();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred17_ASP

    // $ANTLR start synpred18_ASP
    public final void synpred18_ASP_fragment() throws RecognitionException {
        ASP.Terminal c4 =null;


        // ASP.g:3075:4: (c4= parse_ASP_Terminal )
        // ASP.g:3075:4: c4= parse_ASP_Terminal
        {
        pushFollow(FOLLOW_parse_ASP_Terminal_in_synpred18_ASP2199);
        c4=parse_ASP_Terminal();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred18_ASP

    // $ANTLR start synpred24_ASP
    public final void synpred24_ASP_fragment() throws RecognitionException {
        ASP.LeftPattern c0 =null;


        // ASP.g:3087:2: (c0= parse_ASP_LeftPattern )
        // ASP.g:3087:2: c0= parse_ASP_LeftPattern
        {
        pushFollow(FOLLOW_parse_ASP_LeftPattern_in_synpred24_ASP2280);
        c0=parse_ASP_LeftPattern();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred24_ASP

    // Delegated rules

    public final boolean synpred4_ASP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_ASP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_ASP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_ASP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_ASP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_ASP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_ASP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_ASP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_parse_ASP_Transformation_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Element_in_parse_ASP_Transformation124 = new BitSet(new long[]{0x000000000FFF8080L});
    public static final BitSet FOLLOW_parse_ASP_Relation_in_parse_ASP_Transformation159 = new BitSet(new long[]{0x000000000E002002L});
    public static final BitSet FOLLOW_parse_ASP_Constraint_in_parse_ASP_Transformation194 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_parse_ASP_Pattern_in_parse_ASP_Relation239 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_parse_ASP_Pattern_in_parse_ASP_Relation272 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_26_in_parse_ASP_LeftPattern332 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27_in_parse_ASP_LeftPattern355 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25_in_parse_ASP_LeftPattern378 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_QUOTED_40_41_in_parse_ASP_LeftPattern406 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_ASP_LeftPattern427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_parse_ASP_RightPattern460 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27_in_parse_ASP_RightPattern483 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25_in_parse_ASP_RightPattern506 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_QUOTED_40_41_in_parse_ASP_RightPattern534 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_ASP_RightPattern555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_parse_ASP_Metanode584 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Metanode602 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Metanode623 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Metanode641 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_ASP_Metanode662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_parse_ASP_Metaprop691 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Metaprop709 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Metaprop730 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Metaprop748 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Metaprop769 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Metaprop787 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_ASP_Metaprop808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_parse_ASP_Metaedge837 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Metaedge855 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Metaedge876 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Metaedge894 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Metaedge915 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Metaedge933 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Metaedge954 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Metaedge972 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_ASP_Metaedge993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Literal1026 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_parse_ASP_Literal1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_parse_ASP_Constraint1104 = new BitSet(new long[]{0x0000000000400080L});
    public static final BitSet FOLLOW_parse_ASP_Expression_in_parse_ASP_Constraint1122 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Constraint1149 = new BitSet(new long[]{0x0000000000400080L});
    public static final BitSet FOLLOW_parse_ASP_Expression_in_parse_ASP_Constraint1175 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_12_in_parse_ASP_Constraint1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Terminal1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_parse_ASP_Node1289 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_21_in_parse_ASP_Node1312 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Node1340 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Node1361 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Node1379 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Node1400 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Node1418 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_ASP_Node1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_parse_ASP_Prop1472 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_24_in_parse_ASP_Prop1495 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Prop1523 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Prop1544 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Prop1562 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Prop1583 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Prop1601 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Prop1622 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Prop1640 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_ASP_Prop1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_parse_ASP_Edge1694 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_16_in_parse_ASP_Edge1717 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Edge1745 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Edge1766 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Edge1784 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Edge1805 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Edge1823 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Edge1844 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Edge1862 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Edge1883 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Edge1901 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_ASP_Edge1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_parse_ASP_Not1951 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Not1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Eq2009 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_ASP_Eq2030 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Eq2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_NotEq2088 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_ASP_NotEq2109 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_NotEq2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Metanode_in_parse_ASP_Element2159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Metaprop_in_parse_ASP_Element2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Metaedge_in_parse_ASP_Element2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Literal_in_parse_ASP_Element2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Terminal_in_parse_ASP_Element2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Node_in_parse_ASP_Element2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Prop_in_parse_ASP_Element2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Edge_in_parse_ASP_Element2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Not_in_parse_ASP_Element2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Eq_in_parse_ASP_Element2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_NotEq_in_parse_ASP_Element2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_LeftPattern_in_parse_ASP_Pattern2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_RightPattern_in_parse_ASP_Pattern2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Terminal_in_parse_ASP_Expression2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Not_in_parse_ASP_Expression2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Eq_in_parse_ASP_Expression2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_NotEq_in_parse_ASP_Expression2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Pattern_in_synpred4_ASP272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Literal_in_synpred17_ASP2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Terminal_in_synpred18_ASP2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_LeftPattern_in_synpred24_ASP2280 = new BitSet(new long[]{0x0000000000000002L});

}