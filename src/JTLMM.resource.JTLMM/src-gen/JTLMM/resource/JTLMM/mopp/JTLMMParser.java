// $ANTLR 3.4

	package JTLMM.resource.JTLMM.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class JTLMMParser extends JTLMMANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LINEBREAK", "ML_COMMENT", "SL_COMMENT", "TEXT", "WHITESPACE", "'('", "')'", "','", "':'", "'::'", "';'", "'='", "'checkonly'", "'domain'", "'enforce'", "'false'", "'relation'", "'top'", "'transformation'", "'true'", "'when'", "'where'", "'{'", "'|'", "'}'", "'};'"
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
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int LINEBREAK=4;
    public static final int ML_COMMENT=5;
    public static final int SL_COMMENT=6;
    public static final int TEXT=7;
    public static final int WHITESPACE=8;

    // delegates
    public JTLMMANTLRParserBase[] getDelegates() {
        return new JTLMMANTLRParserBase[] {};
    }

    // delegators


    public JTLMMParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public JTLMMParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.initializeRuleMemo(47 + 1);
         

    }

    public String[] getTokenNames() { return JTLMMParser.tokenNames; }
    public String getGrammarFileName() { return "JTLMM.g"; }


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
    	



    // $ANTLR start "start"
    // JTLMM.g:535:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_JTLMM_JTL_Transformation ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;

        int start_StartIndex = input.index();

        JTLMM.JTL.Transformation c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }

            // JTLMM.g:536:2: ( (c0= parse_JTLMM_JTL_Transformation ) EOF )
            // JTLMM.g:537:2: (c0= parse_JTLMM_JTL_Transformation ) EOF
            {
            if ( state.backtracking==0 ) {
            		// follow set for start rule(s)
            		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[0]);
            		expectedElementsIndexOfLastCompleteElement = 0;
            	}

            // JTLMM.g:542:2: (c0= parse_JTLMM_JTL_Transformation )
            // JTLMM.g:543:3: c0= parse_JTLMM_JTL_Transformation
            {
            pushFollow(FOLLOW_parse_JTLMM_JTL_Transformation_in_start82);
            c0=parse_JTLMM_JTL_Transformation();

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



    // $ANTLR start "parse_JTLMM_JTL_Transformation"
    // JTLMM.g:551:1: parse_JTLMM_JTL_Transformation returns [JTLMM.JTL.Transformation element = null] : a0= 'transformation' (a1= TEXT ) a2= '(' ( ( (a3_0= parse_JTLMM_JTL_Model ) ( (a4= ',' (a5_0= parse_JTLMM_JTL_Model ) ) )* ) )? a6= ')' a7= '{' ( ( (a8_0= parse_JTLMM_JTL_Relation ) ) )+ a9= '}' ;
    public final JTLMM.JTL.Transformation parse_JTLMM_JTL_Transformation() throws RecognitionException {
        JTLMM.JTL.Transformation element =  null;

        int parse_JTLMM_JTL_Transformation_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a4=null;
        Token a6=null;
        Token a7=null;
        Token a9=null;
        JTLMM.JTL.Model a3_0 =null;

        JTLMM.JTL.Model a5_0 =null;

        JTLMM.JTL.Relation a8_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }

            // JTLMM.g:554:2: (a0= 'transformation' (a1= TEXT ) a2= '(' ( ( (a3_0= parse_JTLMM_JTL_Model ) ( (a4= ',' (a5_0= parse_JTLMM_JTL_Model ) ) )* ) )? a6= ')' a7= '{' ( ( (a8_0= parse_JTLMM_JTL_Relation ) ) )+ a9= '}' )
            // JTLMM.g:555:2: a0= 'transformation' (a1= TEXT ) a2= '(' ( ( (a3_0= parse_JTLMM_JTL_Model ) ( (a4= ',' (a5_0= parse_JTLMM_JTL_Model ) ) )* ) )? a6= ')' a7= '{' ( ( (a8_0= parse_JTLMM_JTL_Relation ) ) )+ a9= '}'
            {
            a0=(Token)match(input,22,FOLLOW_22_in_parse_JTLMM_JTL_Transformation115); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = JTLMM.JTL.JTLFactory.eINSTANCE.createTransformation();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_0_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[1]);
            	}

            // JTLMM.g:569:2: (a1= TEXT )
            // JTLMM.g:570:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_JTLMM_JTL_Transformation133); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[2]);
            	}

            a2=(Token)match(input,9,FOLLOW_9_in_parse_JTLMM_JTL_Transformation154); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = JTLMM.JTL.JTLFactory.eINSTANCE.createTransformation();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_0_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getTransformation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[3]);
            		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[4]);
            	}

            // JTLMM.g:620:2: ( ( (a3_0= parse_JTLMM_JTL_Model ) ( (a4= ',' (a5_0= parse_JTLMM_JTL_Model ) ) )* ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==TEXT) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // JTLMM.g:621:3: ( (a3_0= parse_JTLMM_JTL_Model ) ( (a4= ',' (a5_0= parse_JTLMM_JTL_Model ) ) )* )
                    {
                    // JTLMM.g:621:3: ( (a3_0= parse_JTLMM_JTL_Model ) ( (a4= ',' (a5_0= parse_JTLMM_JTL_Model ) ) )* )
                    // JTLMM.g:622:4: (a3_0= parse_JTLMM_JTL_Model ) ( (a4= ',' (a5_0= parse_JTLMM_JTL_Model ) ) )*
                    {
                    // JTLMM.g:622:4: (a3_0= parse_JTLMM_JTL_Model )
                    // JTLMM.g:623:5: a3_0= parse_JTLMM_JTL_Model
                    {
                    pushFollow(FOLLOW_parse_JTLMM_JTL_Model_in_parse_JTLMM_JTL_Transformation183);
                    a3_0=parse_JTLMM_JTL_Model();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[5]);
                    				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[6]);
                    			}

                    // JTLMM.g:649:4: ( (a4= ',' (a5_0= parse_JTLMM_JTL_Model ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==11) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // JTLMM.g:650:5: (a4= ',' (a5_0= parse_JTLMM_JTL_Model ) )
                    	    {
                    	    // JTLMM.g:650:5: (a4= ',' (a5_0= parse_JTLMM_JTL_Model ) )
                    	    // JTLMM.g:651:6: a4= ',' (a5_0= parse_JTLMM_JTL_Model )
                    	    {
                    	    a4=(Token)match(input,11,FOLLOW_11_in_parse_JTLMM_JTL_Transformation224); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (element == null) {
                    	    							element = JTLMM.JTL.JTLFactory.eINSTANCE.createTransformation();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_0_0_0_4_0_0_1_0_0_0, null, true);
                    	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
                    	    					}

                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getTransformation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[7]);
                    	    					}

                    	    // JTLMM.g:665:6: (a5_0= parse_JTLMM_JTL_Model )
                    	    // JTLMM.g:666:7: a5_0= parse_JTLMM_JTL_Model
                    	    {
                    	    pushFollow(FOLLOW_parse_JTLMM_JTL_Model_in_parse_JTLMM_JTL_Transformation258);
                    	    a5_0=parse_JTLMM_JTL_Model();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
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

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[8]);
                    	    						addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[9]);
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
                    				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[10]);
                    				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[11]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[12]);
            	}

            a6=(Token)match(input,10,FOLLOW_10_in_parse_JTLMM_JTL_Transformation332); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = JTLMM.JTL.JTLFactory.eINSTANCE.createTransformation();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_0_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[13]);
            	}

            a7=(Token)match(input,26,FOLLOW_26_in_parse_JTLMM_JTL_Transformation346); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = JTLMM.JTL.JTLFactory.eINSTANCE.createTransformation();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_0_0_0_7, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getTransformation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[14]);
            		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getTransformation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[15]);
            	}

            // JTLMM.g:736:2: ( ( (a8_0= parse_JTLMM_JTL_Relation ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= 20 && LA3_0 <= 21)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // JTLMM.g:737:3: ( (a8_0= parse_JTLMM_JTL_Relation ) )
            	    {
            	    // JTLMM.g:737:3: ( (a8_0= parse_JTLMM_JTL_Relation ) )
            	    // JTLMM.g:738:4: (a8_0= parse_JTLMM_JTL_Relation )
            	    {
            	    // JTLMM.g:738:4: (a8_0= parse_JTLMM_JTL_Relation )
            	    // JTLMM.g:739:5: a8_0= parse_JTLMM_JTL_Relation
            	    {
            	    pushFollow(FOLLOW_parse_JTLMM_JTL_Relation_in_parse_JTLMM_JTL_Transformation375);
            	    a8_0=parse_JTLMM_JTL_Relation();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getTransformation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[16]);
            	    				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getTransformation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[17]);
            	    				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[18]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getTransformation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[19]);
            		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getTransformation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[20]);
            		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[21]);
            	}

            a9=(Token)match(input,28,FOLLOW_28_in_parse_JTLMM_JTL_Transformation416); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = JTLMM.JTL.JTLFactory.eINSTANCE.createTransformation();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_0_0_0_10, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, parse_JTLMM_JTL_Transformation_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_JTLMM_JTL_Transformation"



    // $ANTLR start "parse_JTLMM_JTL_Model"
    // JTLMM.g:790:1: parse_JTLMM_JTL_Model returns [JTLMM.JTL.Model element = null] : (a0= TEXT ) a1= ':' (a2= TEXT ) ;
    public final JTLMM.JTL.Model parse_JTLMM_JTL_Model() throws RecognitionException {
        JTLMM.JTL.Model element =  null;

        int parse_JTLMM_JTL_Model_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }

            // JTLMM.g:793:2: ( (a0= TEXT ) a1= ':' (a2= TEXT ) )
            // JTLMM.g:794:2: (a0= TEXT ) a1= ':' (a2= TEXT )
            {
            // JTLMM.g:794:2: (a0= TEXT )
            // JTLMM.g:795:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_JTLMM_JTL_Model449); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[22]);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_JTLMM_JTL_Model470); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = JTLMM.JTL.JTLFactory.eINSTANCE.createModel();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_1_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[23]);
            	}

            // JTLMM.g:844:2: (a2= TEXT )
            // JTLMM.g:845:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_JTLMM_JTL_Model488); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[24]);
            		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[25]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, parse_JTLMM_JTL_Model_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_JTLMM_JTL_Model"



    // $ANTLR start "parse_JTLMM_JTL_Relation"
    // JTLMM.g:883:1: parse_JTLMM_JTL_Relation returns [JTLMM.JTL.Relation element = null] : ( (a0= 'top' )? ) a3= 'relation' (a4= TEXT ) a5= '{' ( ( (a6_0= parse_JTLMM_essentialocl_Variable ) ) )* ( ( (a7_0= parse_JTLMM_JTL_Domain ) ) )* ( ( (a8_0= parse_JTLMM_JTL_Pattern ) ) )? ( ( (a9_0= parse_JTLMM_JTL_Pattern ) ) )? a10= '}' ;
    public final JTLMM.JTL.Relation parse_JTLMM_JTL_Relation() throws RecognitionException {
        JTLMM.JTL.Relation element =  null;

        int parse_JTLMM_JTL_Relation_StartIndex = input.index();

        Token a0=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a10=null;
        JTLMM.essentialocl.Variable a6_0 =null;

        JTLMM.JTL.Domain a7_0 =null;

        JTLMM.JTL.Pattern a8_0 =null;

        JTLMM.JTL.Pattern a9_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }

            // JTLMM.g:886:2: ( ( (a0= 'top' )? ) a3= 'relation' (a4= TEXT ) a5= '{' ( ( (a6_0= parse_JTLMM_essentialocl_Variable ) ) )* ( ( (a7_0= parse_JTLMM_JTL_Domain ) ) )* ( ( (a8_0= parse_JTLMM_JTL_Pattern ) ) )? ( ( (a9_0= parse_JTLMM_JTL_Pattern ) ) )? a10= '}' )
            // JTLMM.g:887:2: ( (a0= 'top' )? ) a3= 'relation' (a4= TEXT ) a5= '{' ( ( (a6_0= parse_JTLMM_essentialocl_Variable ) ) )* ( ( (a7_0= parse_JTLMM_JTL_Domain ) ) )* ( ( (a8_0= parse_JTLMM_JTL_Pattern ) ) )? ( ( (a9_0= parse_JTLMM_JTL_Pattern ) ) )? a10= '}'
            {
            // JTLMM.g:887:2: ( (a0= 'top' )? )
            // JTLMM.g:888:3: (a0= 'top' )?
            {
            // JTLMM.g:888:3: (a0= 'top' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // JTLMM.g:889:4: a0= 'top'
                    {
                    a0=(Token)match(input,21,FOLLOW_21_in_parse_JTLMM_JTL_Relation533); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[26]);
            	}

            a3=(Token)match(input,20,FOLLOW_20_in_parse_JTLMM_JTL_Relation554); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[27]);
            	}

            // JTLMM.g:932:2: (a4= TEXT )
            // JTLMM.g:933:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_JTLMM_JTL_Relation572); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[28]);
            	}

            a5=(Token)match(input,26,FOLLOW_26_in_parse_JTLMM_JTL_Relation593); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
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

            // JTLMM.g:999:2: ( ( (a6_0= parse_JTLMM_essentialocl_Variable ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==TEXT) ) {
                    int LA5_2 = input.LA(2);

                    if ( (LA5_2==12) ) {
                        int LA5_3 = input.LA(3);

                        if ( (LA5_3==TEXT) ) {
                            int LA5_5 = input.LA(4);

                            if ( (LA5_5==14) ) {
                                alt5=1;
                            }


                        }


                    }
                    else if ( (LA5_2==14) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // JTLMM.g:1000:3: ( (a6_0= parse_JTLMM_essentialocl_Variable ) )
            	    {
            	    // JTLMM.g:1000:3: ( (a6_0= parse_JTLMM_essentialocl_Variable ) )
            	    // JTLMM.g:1001:4: (a6_0= parse_JTLMM_essentialocl_Variable )
            	    {
            	    // JTLMM.g:1001:4: (a6_0= parse_JTLMM_essentialocl_Variable )
            	    // JTLMM.g:1002:5: a6_0= parse_JTLMM_essentialocl_Variable
            	    {
            	    pushFollow(FOLLOW_parse_JTLMM_essentialocl_Variable_in_parse_JTLMM_JTL_Relation622);
            	    a6_0=parse_JTLMM_essentialocl_Variable();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
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

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            if ( state.backtracking==0 ) {
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

            // JTLMM.g:1053:2: ( ( (a7_0= parse_JTLMM_JTL_Domain ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= 16 && LA6_0 <= 18)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // JTLMM.g:1054:3: ( (a7_0= parse_JTLMM_JTL_Domain ) )
            	    {
            	    // JTLMM.g:1054:3: ( (a7_0= parse_JTLMM_JTL_Domain ) )
            	    // JTLMM.g:1055:4: (a7_0= parse_JTLMM_JTL_Domain )
            	    {
            	    // JTLMM.g:1055:4: (a7_0= parse_JTLMM_JTL_Domain )
            	    // JTLMM.g:1056:5: a7_0= parse_JTLMM_JTL_Domain
            	    {
            	    pushFollow(FOLLOW_parse_JTLMM_JTL_Domain_in_parse_JTLMM_JTL_Relation678);
            	    a7_0=parse_JTLMM_JTL_Domain();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[53]);
            	    				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[54]);
            	    				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[55]);
            	    				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[56]);
            	    				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[57]);
            	    				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[58]);
            	    				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[59]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[60]);
            		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[61]);
            		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[62]);
            		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[63]);
            		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[64]);
            		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[65]);
            		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[66]);
            	}

            // JTLMM.g:1105:2: ( ( (a8_0= parse_JTLMM_JTL_Pattern ) ) )?
            int alt7=2;
            switch ( input.LA(1) ) {
                case 24:
                    {
                    int LA7_1 = input.LA(2);

                    if ( (synpred7_JTLMM()) ) {
                        alt7=1;
                    }
                    }
                    break;
                case 25:
                    {
                    int LA7_2 = input.LA(2);

                    if ( (synpred7_JTLMM()) ) {
                        alt7=1;
                    }
                    }
                    break;
                case TEXT:
                    {
                    int LA7_3 = input.LA(2);

                    if ( (synpred7_JTLMM()) ) {
                        alt7=1;
                    }
                    }
                    break;
            }

            switch (alt7) {
                case 1 :
                    // JTLMM.g:1106:3: ( (a8_0= parse_JTLMM_JTL_Pattern ) )
                    {
                    // JTLMM.g:1106:3: ( (a8_0= parse_JTLMM_JTL_Pattern ) )
                    // JTLMM.g:1107:4: (a8_0= parse_JTLMM_JTL_Pattern )
                    {
                    // JTLMM.g:1107:4: (a8_0= parse_JTLMM_JTL_Pattern )
                    // JTLMM.g:1108:5: a8_0= parse_JTLMM_JTL_Pattern
                    {
                    pushFollow(FOLLOW_parse_JTLMM_JTL_Pattern_in_parse_JTLMM_JTL_Relation734);
                    a8_0=parse_JTLMM_JTL_Pattern();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[67]);
                    				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[68]);
                    				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[69]);
                    				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[70]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[71]);
            		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[72]);
            		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[73]);
            		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[74]);
            	}

            // JTLMM.g:1151:2: ( ( (a9_0= parse_JTLMM_JTL_Pattern ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==TEXT||(LA8_0 >= 24 && LA8_0 <= 25)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // JTLMM.g:1152:3: ( (a9_0= parse_JTLMM_JTL_Pattern ) )
                    {
                    // JTLMM.g:1152:3: ( (a9_0= parse_JTLMM_JTL_Pattern ) )
                    // JTLMM.g:1153:4: (a9_0= parse_JTLMM_JTL_Pattern )
                    {
                    // JTLMM.g:1153:4: (a9_0= parse_JTLMM_JTL_Pattern )
                    // JTLMM.g:1154:5: a9_0= parse_JTLMM_JTL_Pattern
                    {
                    pushFollow(FOLLOW_parse_JTLMM_JTL_Pattern_in_parse_JTLMM_JTL_Relation790);
                    a9_0=parse_JTLMM_JTL_Pattern();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[75]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[76]);
            	}

            a10=(Token)match(input,28,FOLLOW_28_in_parse_JTLMM_JTL_Relation831); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getTransformation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[77]);
            		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getTransformation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[78]);
            		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[79]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, parse_JTLMM_JTL_Relation_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_JTLMM_JTL_Relation"



    // $ANTLR start "parse_JTLMM_JTL_Domain"
    // JTLMM.g:1214:1: parse_JTLMM_JTL_Domain returns [JTLMM.JTL.Domain element = null] : ( (a0= 'checkonly' )? ) ( (a3= 'enforce' )? ) a6= 'domain' (a7= TEXT ) (a8_0= parse_JTLMM_JTL_Pattern ) ;
    public final JTLMM.JTL.Domain parse_JTLMM_JTL_Domain() throws RecognitionException {
        JTLMM.JTL.Domain element =  null;

        int parse_JTLMM_JTL_Domain_StartIndex = input.index();

        Token a0=null;
        Token a3=null;
        Token a6=null;
        Token a7=null;
        JTLMM.JTL.Pattern a8_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }

            // JTLMM.g:1217:2: ( ( (a0= 'checkonly' )? ) ( (a3= 'enforce' )? ) a6= 'domain' (a7= TEXT ) (a8_0= parse_JTLMM_JTL_Pattern ) )
            // JTLMM.g:1218:2: ( (a0= 'checkonly' )? ) ( (a3= 'enforce' )? ) a6= 'domain' (a7= TEXT ) (a8_0= parse_JTLMM_JTL_Pattern )
            {
            // JTLMM.g:1218:2: ( (a0= 'checkonly' )? )
            // JTLMM.g:1219:3: (a0= 'checkonly' )?
            {
            // JTLMM.g:1219:3: (a0= 'checkonly' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // JTLMM.g:1220:4: a0= 'checkonly'
                    {
                    a0=(Token)match(input,16,FOLLOW_16_in_parse_JTLMM_JTL_Domain869); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[80]);
            		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[81]);
            	}

            // JTLMM.g:1250:2: ( (a3= 'enforce' )? )
            // JTLMM.g:1251:3: (a3= 'enforce' )?
            {
            // JTLMM.g:1251:3: (a3= 'enforce' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // JTLMM.g:1252:4: a3= 'enforce'
                    {
                    a3=(Token)match(input,18,FOLLOW_18_in_parse_JTLMM_JTL_Domain899); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[82]);
            	}

            a6=(Token)match(input,17,FOLLOW_17_in_parse_JTLMM_JTL_Domain920); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[83]);
            	}

            // JTLMM.g:1305:2: (a7= TEXT )
            // JTLMM.g:1306:3: a7= TEXT
            {
            a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_JTLMM_JTL_Domain938); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getDomain(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[84]);
            		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getDomain(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[85]);
            		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getDomain(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[86]);
            	}

            // JTLMM.g:1353:2: (a8_0= parse_JTLMM_JTL_Pattern )
            // JTLMM.g:1354:3: a8_0= parse_JTLMM_JTL_Pattern
            {
            pushFollow(FOLLOW_parse_JTLMM_JTL_Pattern_in_parse_JTLMM_JTL_Domain963);
            a8_0=parse_JTLMM_JTL_Pattern();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[87]);
            		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[88]);
            		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[89]);
            		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[90]);
            		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[91]);
            		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[92]);
            		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[93]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, parse_JTLMM_JTL_Domain_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_JTLMM_JTL_Domain"



    // $ANTLR start "parse_JTLMM_JTL_Pattern"
    // JTLMM.g:1397:1: parse_JTLMM_JTL_Pattern returns [JTLMM.JTL.Pattern element = null] : (a0= 'when' a1= '{' ( ( (a2_0= parse_JTLMM_JTL_Predicate ) a3= ';' ) )* a4= '}' |a5= 'where' a6= '{' ( ( (a7_0= parse_JTLMM_JTL_Predicate ) a8= ';' ) )* a9= '}' | (a10_0= parse_JTLMM_template_TemplateExp ) a11= '{' ( ( (a12_0= parse_JTLMM_JTL_Predicate ) ( (a13= ',' (a14_0= parse_JTLMM_JTL_Predicate ) ) )* ) )? a15= '};' );
    public final JTLMM.JTL.Pattern parse_JTLMM_JTL_Pattern() throws RecognitionException {
        JTLMM.JTL.Pattern element =  null;

        int parse_JTLMM_JTL_Pattern_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a8=null;
        Token a9=null;
        Token a11=null;
        Token a13=null;
        Token a15=null;
        JTLMM.JTL.Predicate a2_0 =null;

        JTLMM.JTL.Predicate a7_0 =null;

        JTLMM.template.TemplateExp a10_0 =null;

        JTLMM.JTL.Predicate a12_0 =null;

        JTLMM.JTL.Predicate a14_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }

            // JTLMM.g:1400:2: (a0= 'when' a1= '{' ( ( (a2_0= parse_JTLMM_JTL_Predicate ) a3= ';' ) )* a4= '}' |a5= 'where' a6= '{' ( ( (a7_0= parse_JTLMM_JTL_Predicate ) a8= ';' ) )* a9= '}' | (a10_0= parse_JTLMM_template_TemplateExp ) a11= '{' ( ( (a12_0= parse_JTLMM_JTL_Predicate ) ( (a13= ',' (a14_0= parse_JTLMM_JTL_Predicate ) ) )* ) )? a15= '};' )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt15=1;
                }
                break;
            case 25:
                {
                alt15=2;
                }
                break;
            case TEXT:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // JTLMM.g:1401:2: a0= 'when' a1= '{' ( ( (a2_0= parse_JTLMM_JTL_Predicate ) a3= ';' ) )* a4= '}'
                    {
                    a0=(Token)match(input,24,FOLLOW_24_in_parse_JTLMM_JTL_Pattern996); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    		if (element == null) {
                    			element = JTLMM.JTL.JTLFactory.eINSTANCE.createPattern();
                    			startIncompleteElement(element);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_4_0_0_0, null, true);
                    		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
                    	}

                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[94]);
                    	}

                    a1=(Token)match(input,26,FOLLOW_26_in_parse_JTLMM_JTL_Pattern1010); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    		if (element == null) {
                    			element = JTLMM.JTL.JTLFactory.eINSTANCE.createPattern();
                    			startIncompleteElement(element);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_4_0_0_2, null, true);
                    		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
                    	}

                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[95]);
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[96]);
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[97]);
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[98]);
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[99]);
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[100]);
                    		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[101]);
                    	}

                    // JTLMM.g:1435:2: ( ( (a2_0= parse_JTLMM_JTL_Predicate ) a3= ';' ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==TEXT||LA11_0==19||LA11_0==23||LA11_0==27) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // JTLMM.g:1436:3: ( (a2_0= parse_JTLMM_JTL_Predicate ) a3= ';' )
                    	    {
                    	    // JTLMM.g:1436:3: ( (a2_0= parse_JTLMM_JTL_Predicate ) a3= ';' )
                    	    // JTLMM.g:1437:4: (a2_0= parse_JTLMM_JTL_Predicate ) a3= ';'
                    	    {
                    	    // JTLMM.g:1437:4: (a2_0= parse_JTLMM_JTL_Predicate )
                    	    // JTLMM.g:1438:5: a2_0= parse_JTLMM_JTL_Predicate
                    	    {
                    	    pushFollow(FOLLOW_parse_JTLMM_JTL_Predicate_in_parse_JTLMM_JTL_Pattern1039);
                    	    a2_0=parse_JTLMM_JTL_Predicate();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
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

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    				// expected elements (follow set)
                    	    				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[102]);
                    	    			}

                    	    a3=(Token)match(input,14,FOLLOW_14_in_parse_JTLMM_JTL_Pattern1067); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    				if (element == null) {
                    	    					element = JTLMM.JTL.JTLFactory.eINSTANCE.createPattern();
                    	    					startIncompleteElement(element);
                    	    				}
                    	    				collectHiddenTokens(element);
                    	    				retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_4_0_0_3_0_0_2, null, true);
                    	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    	    			}

                    	    if ( state.backtracking==0 ) {
                    	    				// expected elements (follow set)
                    	    				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[103]);
                    	    				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[104]);
                    	    				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[105]);
                    	    				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[106]);
                    	    				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[107]);
                    	    				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[108]);
                    	    				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[109]);
                    	    			}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[110]);
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[111]);
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[112]);
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[113]);
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[114]);
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[115]);
                    		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[116]);
                    	}

                    a4=(Token)match(input,28,FOLLOW_28_in_parse_JTLMM_JTL_Pattern1100); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    		if (element == null) {
                    			element = JTLMM.JTL.JTLFactory.eINSTANCE.createPattern();
                    			startIncompleteElement(element);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_4_0_0_5, null, true);
                    		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
                    	}

                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[117]);
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[118]);
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[119]);
                    		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[120]);
                    	}

                    }
                    break;
                case 2 :
                    // JTLMM.g:1514:4: a5= 'where' a6= '{' ( ( (a7_0= parse_JTLMM_JTL_Predicate ) a8= ';' ) )* a9= '}'
                    {
                    a5=(Token)match(input,25,FOLLOW_25_in_parse_JTLMM_JTL_Pattern1118); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    		if (element == null) {
                    			element = JTLMM.JTL.JTLFactory.eINSTANCE.createPattern();
                    			startIncompleteElement(element);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_4_0_1_0, null, true);
                    		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
                    	}

                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[121]);
                    	}

                    a6=(Token)match(input,26,FOLLOW_26_in_parse_JTLMM_JTL_Pattern1132); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    		if (element == null) {
                    			element = JTLMM.JTL.JTLFactory.eINSTANCE.createPattern();
                    			startIncompleteElement(element);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_4_0_1_2, null, true);
                    		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
                    	}

                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[122]);
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[123]);
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[124]);
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[125]);
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[126]);
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[127]);
                    		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[128]);
                    	}

                    // JTLMM.g:1548:2: ( ( (a7_0= parse_JTLMM_JTL_Predicate ) a8= ';' ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==TEXT||LA12_0==19||LA12_0==23||LA12_0==27) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // JTLMM.g:1549:3: ( (a7_0= parse_JTLMM_JTL_Predicate ) a8= ';' )
                    	    {
                    	    // JTLMM.g:1549:3: ( (a7_0= parse_JTLMM_JTL_Predicate ) a8= ';' )
                    	    // JTLMM.g:1550:4: (a7_0= parse_JTLMM_JTL_Predicate ) a8= ';'
                    	    {
                    	    // JTLMM.g:1550:4: (a7_0= parse_JTLMM_JTL_Predicate )
                    	    // JTLMM.g:1551:5: a7_0= parse_JTLMM_JTL_Predicate
                    	    {
                    	    pushFollow(FOLLOW_parse_JTLMM_JTL_Predicate_in_parse_JTLMM_JTL_Pattern1161);
                    	    a7_0=parse_JTLMM_JTL_Predicate();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
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

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    				// expected elements (follow set)
                    	    				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[129]);
                    	    			}

                    	    a8=(Token)match(input,14,FOLLOW_14_in_parse_JTLMM_JTL_Pattern1189); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    				if (element == null) {
                    	    					element = JTLMM.JTL.JTLFactory.eINSTANCE.createPattern();
                    	    					startIncompleteElement(element);
                    	    				}
                    	    				collectHiddenTokens(element);
                    	    				retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_4_0_1_3_0_0_2, null, true);
                    	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
                    	    			}

                    	    if ( state.backtracking==0 ) {
                    	    				// expected elements (follow set)
                    	    				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[130]);
                    	    				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[131]);
                    	    				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[132]);
                    	    				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[133]);
                    	    				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[134]);
                    	    				addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[135]);
                    	    				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[136]);
                    	    			}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[137]);
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[138]);
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[139]);
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[140]);
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[141]);
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[142]);
                    		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[143]);
                    	}

                    a9=(Token)match(input,28,FOLLOW_28_in_parse_JTLMM_JTL_Pattern1222); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    		if (element == null) {
                    			element = JTLMM.JTL.JTLFactory.eINSTANCE.createPattern();
                    			startIncompleteElement(element);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_4_0_1_5, null, true);
                    		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
                    	}

                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[144]);
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[145]);
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[146]);
                    		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[147]);
                    	}

                    }
                    break;
                case 3 :
                    // JTLMM.g:1627:4: (a10_0= parse_JTLMM_template_TemplateExp ) a11= '{' ( ( (a12_0= parse_JTLMM_JTL_Predicate ) ( (a13= ',' (a14_0= parse_JTLMM_JTL_Predicate ) ) )* ) )? a15= '};'
                    {
                    // JTLMM.g:1627:4: (a10_0= parse_JTLMM_template_TemplateExp )
                    // JTLMM.g:1628:3: a10_0= parse_JTLMM_template_TemplateExp
                    {
                    pushFollow(FOLLOW_parse_JTLMM_template_TemplateExp_in_parse_JTLMM_JTL_Pattern1244);
                    a10_0=parse_JTLMM_template_TemplateExp();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[148]);
                    	}

                    a11=(Token)match(input,26,FOLLOW_26_in_parse_JTLMM_JTL_Pattern1262); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    		if (element == null) {
                    			element = JTLMM.JTL.JTLFactory.eINSTANCE.createPattern();
                    			startIncompleteElement(element);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_4_0_2_2, null, true);
                    		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
                    	}

                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[149]);
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[150]);
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[151]);
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[152]);
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[153]);
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[154]);
                    		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[155]);
                    	}

                    // JTLMM.g:1673:2: ( ( (a12_0= parse_JTLMM_JTL_Predicate ) ( (a13= ',' (a14_0= parse_JTLMM_JTL_Predicate ) ) )* ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==TEXT||LA14_0==19||LA14_0==23||LA14_0==27) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // JTLMM.g:1674:3: ( (a12_0= parse_JTLMM_JTL_Predicate ) ( (a13= ',' (a14_0= parse_JTLMM_JTL_Predicate ) ) )* )
                            {
                            // JTLMM.g:1674:3: ( (a12_0= parse_JTLMM_JTL_Predicate ) ( (a13= ',' (a14_0= parse_JTLMM_JTL_Predicate ) ) )* )
                            // JTLMM.g:1675:4: (a12_0= parse_JTLMM_JTL_Predicate ) ( (a13= ',' (a14_0= parse_JTLMM_JTL_Predicate ) ) )*
                            {
                            // JTLMM.g:1675:4: (a12_0= parse_JTLMM_JTL_Predicate )
                            // JTLMM.g:1676:5: a12_0= parse_JTLMM_JTL_Predicate
                            {
                            pushFollow(FOLLOW_parse_JTLMM_JTL_Predicate_in_parse_JTLMM_JTL_Pattern1291);
                            a12_0=parse_JTLMM_JTL_Predicate();

                            state._fsp--;
                            if (state.failed) return element;

                            if ( state.backtracking==0 ) {
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

                            }


                            if ( state.backtracking==0 ) {
                            				// expected elements (follow set)
                            				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[156]);
                            				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[157]);
                            			}

                            // JTLMM.g:1702:4: ( (a13= ',' (a14_0= parse_JTLMM_JTL_Predicate ) ) )*
                            loop13:
                            do {
                                int alt13=2;
                                int LA13_0 = input.LA(1);

                                if ( (LA13_0==11) ) {
                                    alt13=1;
                                }


                                switch (alt13) {
                            	case 1 :
                            	    // JTLMM.g:1703:5: (a13= ',' (a14_0= parse_JTLMM_JTL_Predicate ) )
                            	    {
                            	    // JTLMM.g:1703:5: (a13= ',' (a14_0= parse_JTLMM_JTL_Predicate ) )
                            	    // JTLMM.g:1704:6: a13= ',' (a14_0= parse_JTLMM_JTL_Predicate )
                            	    {
                            	    a13=(Token)match(input,11,FOLLOW_11_in_parse_JTLMM_JTL_Pattern1332); if (state.failed) return element;

                            	    if ( state.backtracking==0 ) {
                            	    						if (element == null) {
                            	    							element = JTLMM.JTL.JTLFactory.eINSTANCE.createPattern();
                            	    							startIncompleteElement(element);
                            	    						}
                            	    						collectHiddenTokens(element);
                            	    						retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_4_0_2_3_0_0_2_0_0_0, null, true);
                            	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
                            	    					}

                            	    if ( state.backtracking==0 ) {
                            	    						// expected elements (follow set)
                            	    						addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[158]);
                            	    						addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[159]);
                            	    						addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[160]);
                            	    						addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[161]);
                            	    						addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[162]);
                            	    						addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[163]);
                            	    					}

                            	    // JTLMM.g:1723:6: (a14_0= parse_JTLMM_JTL_Predicate )
                            	    // JTLMM.g:1724:7: a14_0= parse_JTLMM_JTL_Predicate
                            	    {
                            	    pushFollow(FOLLOW_parse_JTLMM_JTL_Predicate_in_parse_JTLMM_JTL_Pattern1366);
                            	    a14_0=parse_JTLMM_JTL_Predicate();

                            	    state._fsp--;
                            	    if (state.failed) return element;

                            	    if ( state.backtracking==0 ) {
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

                            	    }


                            	    if ( state.backtracking==0 ) {
                            	    						// expected elements (follow set)
                            	    						addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[164]);
                            	    						addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[165]);
                            	    					}

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop13;
                                }
                            } while (true);


                            if ( state.backtracking==0 ) {
                            				// expected elements (follow set)
                            				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[166]);
                            				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[167]);
                            			}

                            }


                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[168]);
                    	}

                    a15=(Token)match(input,29,FOLLOW_29_in_parse_JTLMM_JTL_Pattern1440); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    		if (element == null) {
                    			element = JTLMM.JTL.JTLFactory.eINSTANCE.createPattern();
                    			startIncompleteElement(element);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_4_0_2_4, null, true);
                    		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
                    	}

                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[169]);
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[170]);
                    		addExpectedElement(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[171]);
                    		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[172]);
                    	}

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
            if ( state.backtracking>0 ) { memoize(input, 6, parse_JTLMM_JTL_Pattern_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_JTLMM_JTL_Pattern"



    // $ANTLR start "parse_JTLMM_JTL_Predicate"
    // JTLMM.g:1784:1: parse_JTLMM_JTL_Predicate returns [JTLMM.JTL.Predicate element = null] : (a0_0= parse_JTLMM_essentialocl_OclExpression ) ;
    public final JTLMM.JTL.Predicate parse_JTLMM_JTL_Predicate() throws RecognitionException {
        JTLMM.JTL.Predicate element =  null;

        int parse_JTLMM_JTL_Predicate_StartIndex = input.index();

        JTLMM.essentialocl.OclExpression a0_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }

            // JTLMM.g:1787:2: ( (a0_0= parse_JTLMM_essentialocl_OclExpression ) )
            // JTLMM.g:1788:2: (a0_0= parse_JTLMM_essentialocl_OclExpression )
            {
            // JTLMM.g:1788:2: (a0_0= parse_JTLMM_essentialocl_OclExpression )
            // JTLMM.g:1789:3: a0_0= parse_JTLMM_essentialocl_OclExpression
            {
            pushFollow(FOLLOW_parse_JTLMM_essentialocl_OclExpression_in_parse_JTLMM_JTL_Predicate1473);
            a0_0=parse_JTLMM_essentialocl_OclExpression();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[173]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, parse_JTLMM_JTL_Predicate_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_JTLMM_JTL_Predicate"



    // $ANTLR start "parse_JTLMM_template_ObjectTemplateExp"
    // JTLMM.g:1816:1: parse_JTLMM_template_ObjectTemplateExp returns [JTLMM.template.ObjectTemplateExp element = null] : (a0= TEXT ) a1= ':' ( ( (a2= TEXT ) ) )? ( (a3= '::' (a4= TEXT ) ) )? ( (a5= '{' ( ( (a6_0= parse_JTLMM_imperativeocl_AssignExp ) ( (a7= ',' (a8_0= parse_JTLMM_imperativeocl_AssignExp ) ) )* ) )? a9= '}' ) )? ;
    public final JTLMM.template.ObjectTemplateExp parse_JTLMM_template_ObjectTemplateExp() throws RecognitionException {
        JTLMM.template.ObjectTemplateExp element =  null;

        int parse_JTLMM_template_ObjectTemplateExp_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a7=null;
        Token a9=null;
        JTLMM.imperativeocl.AssignExp a6_0 =null;

        JTLMM.imperativeocl.AssignExp a8_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }

            // JTLMM.g:1819:2: ( (a0= TEXT ) a1= ':' ( ( (a2= TEXT ) ) )? ( (a3= '::' (a4= TEXT ) ) )? ( (a5= '{' ( ( (a6_0= parse_JTLMM_imperativeocl_AssignExp ) ( (a7= ',' (a8_0= parse_JTLMM_imperativeocl_AssignExp ) ) )* ) )? a9= '}' ) )? )
            // JTLMM.g:1820:2: (a0= TEXT ) a1= ':' ( ( (a2= TEXT ) ) )? ( (a3= '::' (a4= TEXT ) ) )? ( (a5= '{' ( ( (a6_0= parse_JTLMM_imperativeocl_AssignExp ) ( (a7= ',' (a8_0= parse_JTLMM_imperativeocl_AssignExp ) ) )* ) )? a9= '}' ) )?
            {
            // JTLMM.g:1820:2: (a0= TEXT )
            // JTLMM.g:1821:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_JTLMM_template_ObjectTemplateExp1510); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[174]);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_JTLMM_template_ObjectTemplateExp1531); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = JTLMM.template.TemplateFactory.eINSTANCE.createObjectTemplateExp();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_6_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
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

            // JTLMM.g:1883:2: ( ( (a2= TEXT ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==TEXT) ) {
                int LA16_1 = input.LA(2);

                if ( (synpred17_JTLMM()) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // JTLMM.g:1884:3: ( (a2= TEXT ) )
                    {
                    // JTLMM.g:1884:3: ( (a2= TEXT ) )
                    // JTLMM.g:1885:4: (a2= TEXT )
                    {
                    // JTLMM.g:1885:4: (a2= TEXT )
                    // JTLMM.g:1886:5: a2= TEXT
                    {
                    a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_JTLMM_template_ObjectTemplateExp1560); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
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

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
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

            // JTLMM.g:1952:2: ( (a3= '::' (a4= TEXT ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==13) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // JTLMM.g:1953:3: (a3= '::' (a4= TEXT ) )
                    {
                    // JTLMM.g:1953:3: (a3= '::' (a4= TEXT ) )
                    // JTLMM.g:1954:4: a3= '::' (a4= TEXT )
                    {
                    a3=(Token)match(input,13,FOLLOW_13_in_parse_JTLMM_template_ObjectTemplateExp1615); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = JTLMM.template.TemplateFactory.eINSTANCE.createObjectTemplateExp();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_6_0_0_4_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[215]);
                    			}

                    // JTLMM.g:1968:4: (a4= TEXT )
                    // JTLMM.g:1969:5: a4= TEXT
                    {
                    a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_JTLMM_template_ObjectTemplateExp1641); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
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

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
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

            // JTLMM.g:2033:2: ( (a5= '{' ( ( (a6_0= parse_JTLMM_imperativeocl_AssignExp ) ( (a7= ',' (a8_0= parse_JTLMM_imperativeocl_AssignExp ) ) )* ) )? a9= '}' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                int LA20_1 = input.LA(2);

                if ( (synpred21_JTLMM()) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // JTLMM.g:2034:3: (a5= '{' ( ( (a6_0= parse_JTLMM_imperativeocl_AssignExp ) ( (a7= ',' (a8_0= parse_JTLMM_imperativeocl_AssignExp ) ) )* ) )? a9= '}' )
                    {
                    // JTLMM.g:2034:3: (a5= '{' ( ( (a6_0= parse_JTLMM_imperativeocl_AssignExp ) ( (a7= ',' (a8_0= parse_JTLMM_imperativeocl_AssignExp ) ) )* ) )? a9= '}' )
                    // JTLMM.g:2035:4: a5= '{' ( ( (a6_0= parse_JTLMM_imperativeocl_AssignExp ) ( (a7= ',' (a8_0= parse_JTLMM_imperativeocl_AssignExp ) ) )* ) )? a9= '}'
                    {
                    a5=(Token)match(input,26,FOLLOW_26_in_parse_JTLMM_template_ObjectTemplateExp1696); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = JTLMM.template.TemplateFactory.eINSTANCE.createObjectTemplateExp();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_6_0_0_5_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(JTLMM.template.TemplatePackage.eINSTANCE.getObjectTemplateExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[240]);
                    				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[241]);
                    			}

                    // JTLMM.g:2050:4: ( ( (a6_0= parse_JTLMM_imperativeocl_AssignExp ) ( (a7= ',' (a8_0= parse_JTLMM_imperativeocl_AssignExp ) ) )* ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==TEXT) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // JTLMM.g:2051:5: ( (a6_0= parse_JTLMM_imperativeocl_AssignExp ) ( (a7= ',' (a8_0= parse_JTLMM_imperativeocl_AssignExp ) ) )* )
                            {
                            // JTLMM.g:2051:5: ( (a6_0= parse_JTLMM_imperativeocl_AssignExp ) ( (a7= ',' (a8_0= parse_JTLMM_imperativeocl_AssignExp ) ) )* )
                            // JTLMM.g:2052:6: (a6_0= parse_JTLMM_imperativeocl_AssignExp ) ( (a7= ',' (a8_0= parse_JTLMM_imperativeocl_AssignExp ) ) )*
                            {
                            // JTLMM.g:2052:6: (a6_0= parse_JTLMM_imperativeocl_AssignExp )
                            // JTLMM.g:2053:7: a6_0= parse_JTLMM_imperativeocl_AssignExp
                            {
                            pushFollow(FOLLOW_parse_JTLMM_imperativeocl_AssignExp_in_parse_JTLMM_template_ObjectTemplateExp1737);
                            a6_0=parse_JTLMM_imperativeocl_AssignExp();

                            state._fsp--;
                            if (state.failed) return element;

                            if ( state.backtracking==0 ) {
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

                            }


                            if ( state.backtracking==0 ) {
                            						// expected elements (follow set)
                            						addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[242]);
                            						addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[243]);
                            					}

                            // JTLMM.g:2079:6: ( (a7= ',' (a8_0= parse_JTLMM_imperativeocl_AssignExp ) ) )*
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==11) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // JTLMM.g:2080:7: (a7= ',' (a8_0= parse_JTLMM_imperativeocl_AssignExp ) )
                            	    {
                            	    // JTLMM.g:2080:7: (a7= ',' (a8_0= parse_JTLMM_imperativeocl_AssignExp ) )
                            	    // JTLMM.g:2081:8: a7= ',' (a8_0= parse_JTLMM_imperativeocl_AssignExp )
                            	    {
                            	    a7=(Token)match(input,11,FOLLOW_11_in_parse_JTLMM_template_ObjectTemplateExp1792); if (state.failed) return element;

                            	    if ( state.backtracking==0 ) {
                            	    								if (element == null) {
                            	    									element = JTLMM.template.TemplateFactory.eINSTANCE.createObjectTemplateExp();
                            	    									startIncompleteElement(element);
                            	    								}
                            	    								collectHiddenTokens(element);
                            	    								retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_6_0_0_5_0_0_2_0_0_2_0_0_0, null, true);
                            	    								copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
                            	    							}

                            	    if ( state.backtracking==0 ) {
                            	    								// expected elements (follow set)
                            	    								addExpectedElement(JTLMM.template.TemplatePackage.eINSTANCE.getObjectTemplateExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[244]);
                            	    							}

                            	    // JTLMM.g:2095:8: (a8_0= parse_JTLMM_imperativeocl_AssignExp )
                            	    // JTLMM.g:2096:9: a8_0= parse_JTLMM_imperativeocl_AssignExp
                            	    {
                            	    pushFollow(FOLLOW_parse_JTLMM_imperativeocl_AssignExp_in_parse_JTLMM_template_ObjectTemplateExp1834);
                            	    a8_0=parse_JTLMM_imperativeocl_AssignExp();

                            	    state._fsp--;
                            	    if (state.failed) return element;

                            	    if ( state.backtracking==0 ) {
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

                            	    }


                            	    if ( state.backtracking==0 ) {
                            	    								// expected elements (follow set)
                            	    								addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[245]);
                            	    								addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[246]);
                            	    							}

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop18;
                                }
                            } while (true);


                            if ( state.backtracking==0 ) {
                            						// expected elements (follow set)
                            						addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[247]);
                            						addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[248]);
                            					}

                            }


                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[249]);
                    			}

                    a9=(Token)match(input,28,FOLLOW_28_in_parse_JTLMM_template_ObjectTemplateExp1938); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = JTLMM.template.TemplateFactory.eINSTANCE.createObjectTemplateExp();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_6_0_0_5_0_0_4, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
                    			}

                    if ( state.backtracking==0 ) {
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

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, parse_JTLMM_template_ObjectTemplateExp_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_JTLMM_template_ObjectTemplateExp"



    // $ANTLR start "parse_JTLMM_imperativeocl_AssignExp"
    // JTLMM.g:2180:1: parse_JTLMM_imperativeocl_AssignExp returns [JTLMM.imperativeocl.AssignExp element = null] : (a0= TEXT ) a1= '=' ( (a2_0= parse_JTLMM_essentialocl_OclExpression ) )* ;
    public final JTLMM.imperativeocl.AssignExp parse_JTLMM_imperativeocl_AssignExp() throws RecognitionException {
        JTLMM.imperativeocl.AssignExp element =  null;

        int parse_JTLMM_imperativeocl_AssignExp_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        JTLMM.essentialocl.OclExpression a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }

            // JTLMM.g:2183:2: ( (a0= TEXT ) a1= '=' ( (a2_0= parse_JTLMM_essentialocl_OclExpression ) )* )
            // JTLMM.g:2184:2: (a0= TEXT ) a1= '=' ( (a2_0= parse_JTLMM_essentialocl_OclExpression ) )*
            {
            // JTLMM.g:2184:2: (a0= TEXT )
            // JTLMM.g:2185:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_JTLMM_imperativeocl_AssignExp1990); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[272]);
            	}

            a1=(Token)match(input,15,FOLLOW_15_in_parse_JTLMM_imperativeocl_AssignExp2011); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = JTLMM.imperativeocl.ImperativeoclFactory.eINSTANCE.createAssignExp();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_7_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
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

            // JTLMM.g:2244:2: ( (a2_0= parse_JTLMM_essentialocl_OclExpression ) )*
            loop21:
            do {
                int alt21=2;
                switch ( input.LA(1) ) {
                case TEXT:
                    {
                    int LA21_2 = input.LA(2);

                    if ( (synpred22_JTLMM()) ) {
                        alt21=1;
                    }


                    }
                    break;
                case 23:
                    {
                    int LA21_3 = input.LA(2);

                    if ( (synpred22_JTLMM()) ) {
                        alt21=1;
                    }


                    }
                    break;
                case 19:
                    {
                    int LA21_4 = input.LA(2);

                    if ( (synpred22_JTLMM()) ) {
                        alt21=1;
                    }


                    }
                    break;
                case 27:
                    {
                    int LA21_5 = input.LA(2);

                    if ( (synpred22_JTLMM()) ) {
                        alt21=1;
                    }


                    }
                    break;

                }

                switch (alt21) {
            	case 1 :
            	    // JTLMM.g:2245:3: (a2_0= parse_JTLMM_essentialocl_OclExpression )
            	    {
            	    // JTLMM.g:2245:3: (a2_0= parse_JTLMM_essentialocl_OclExpression )
            	    // JTLMM.g:2246:4: a2_0= parse_JTLMM_essentialocl_OclExpression
            	    {
            	    pushFollow(FOLLOW_parse_JTLMM_essentialocl_OclExpression_in_parse_JTLMM_imperativeocl_AssignExp2034);
            	    a2_0=parse_JTLMM_essentialocl_OclExpression();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            if ( state.backtracking==0 ) {
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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, parse_JTLMM_imperativeocl_AssignExp_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_JTLMM_imperativeocl_AssignExp"



    // $ANTLR start "parse_JTLMM_essentialocl_OperationCallExp"
    // JTLMM.g:2284:1: parse_JTLMM_essentialocl_OperationCallExp returns [JTLMM.essentialocl.OperationCallExp element = null] : (a0= TEXT ) a1= '(' ( ( (a2_0= parse_JTLMM_essentialocl_OclExpression ) ( (a3= ',' (a4_0= parse_JTLMM_essentialocl_OclExpression ) ) )* ) )? a5= ')' ;
    public final JTLMM.essentialocl.OperationCallExp parse_JTLMM_essentialocl_OperationCallExp() throws RecognitionException {
        JTLMM.essentialocl.OperationCallExp element =  null;

        int parse_JTLMM_essentialocl_OperationCallExp_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a3=null;
        Token a5=null;
        JTLMM.essentialocl.OclExpression a2_0 =null;

        JTLMM.essentialocl.OclExpression a4_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }

            // JTLMM.g:2287:2: ( (a0= TEXT ) a1= '(' ( ( (a2_0= parse_JTLMM_essentialocl_OclExpression ) ( (a3= ',' (a4_0= parse_JTLMM_essentialocl_OclExpression ) ) )* ) )? a5= ')' )
            // JTLMM.g:2288:2: (a0= TEXT ) a1= '(' ( ( (a2_0= parse_JTLMM_essentialocl_OclExpression ) ( (a3= ',' (a4_0= parse_JTLMM_essentialocl_OclExpression ) ) )* ) )? a5= ')'
            {
            // JTLMM.g:2288:2: (a0= TEXT )
            // JTLMM.g:2289:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_JTLMM_essentialocl_OperationCallExp2079); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[295]);
            	}

            a1=(Token)match(input,9,FOLLOW_9_in_parse_JTLMM_essentialocl_OperationCallExp2100); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = JTLMM.essentialocl.EssentialoclFactory.eINSTANCE.createOperationCallExp();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_8_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getOperationCallExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[296]);
            		addExpectedElement(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getOperationCallExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[297]);
            		addExpectedElement(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getOperationCallExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[298]);
            		addExpectedElement(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getOperationCallExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[299]);
            		addExpectedElement(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getOperationCallExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[300]);
            		addExpectedElement(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getOperationCallExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[301]);
            		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[302]);
            	}

            // JTLMM.g:2344:2: ( ( (a2_0= parse_JTLMM_essentialocl_OclExpression ) ( (a3= ',' (a4_0= parse_JTLMM_essentialocl_OclExpression ) ) )* ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==TEXT||LA23_0==19||LA23_0==23||LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // JTLMM.g:2345:3: ( (a2_0= parse_JTLMM_essentialocl_OclExpression ) ( (a3= ',' (a4_0= parse_JTLMM_essentialocl_OclExpression ) ) )* )
                    {
                    // JTLMM.g:2345:3: ( (a2_0= parse_JTLMM_essentialocl_OclExpression ) ( (a3= ',' (a4_0= parse_JTLMM_essentialocl_OclExpression ) ) )* )
                    // JTLMM.g:2346:4: (a2_0= parse_JTLMM_essentialocl_OclExpression ) ( (a3= ',' (a4_0= parse_JTLMM_essentialocl_OclExpression ) ) )*
                    {
                    // JTLMM.g:2346:4: (a2_0= parse_JTLMM_essentialocl_OclExpression )
                    // JTLMM.g:2347:5: a2_0= parse_JTLMM_essentialocl_OclExpression
                    {
                    pushFollow(FOLLOW_parse_JTLMM_essentialocl_OclExpression_in_parse_JTLMM_essentialocl_OperationCallExp2129);
                    a2_0=parse_JTLMM_essentialocl_OclExpression();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[303]);
                    				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[304]);
                    			}

                    // JTLMM.g:2373:4: ( (a3= ',' (a4_0= parse_JTLMM_essentialocl_OclExpression ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==11) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // JTLMM.g:2374:5: (a3= ',' (a4_0= parse_JTLMM_essentialocl_OclExpression ) )
                    	    {
                    	    // JTLMM.g:2374:5: (a3= ',' (a4_0= parse_JTLMM_essentialocl_OclExpression ) )
                    	    // JTLMM.g:2375:6: a3= ',' (a4_0= parse_JTLMM_essentialocl_OclExpression )
                    	    {
                    	    a3=(Token)match(input,11,FOLLOW_11_in_parse_JTLMM_essentialocl_OperationCallExp2170); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (element == null) {
                    	    							element = JTLMM.essentialocl.EssentialoclFactory.eINSTANCE.createOperationCallExp();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_8_0_0_2_0_0_1_0_0_0, null, true);
                    	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    	    					}

                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getOperationCallExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[305]);
                    	    						addExpectedElement(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getOperationCallExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[306]);
                    	    						addExpectedElement(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getOperationCallExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[307]);
                    	    						addExpectedElement(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getOperationCallExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[308]);
                    	    						addExpectedElement(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getOperationCallExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[309]);
                    	    						addExpectedElement(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getOperationCallExp(), JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[310]);
                    	    					}

                    	    // JTLMM.g:2394:6: (a4_0= parse_JTLMM_essentialocl_OclExpression )
                    	    // JTLMM.g:2395:7: a4_0= parse_JTLMM_essentialocl_OclExpression
                    	    {
                    	    pushFollow(FOLLOW_parse_JTLMM_essentialocl_OclExpression_in_parse_JTLMM_essentialocl_OperationCallExp2204);
                    	    a4_0=parse_JTLMM_essentialocl_OclExpression();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
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

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[311]);
                    	    						addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[312]);
                    	    					}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[313]);
                    				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[314]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[315]);
            	}

            a5=(Token)match(input,10,FOLLOW_10_in_parse_JTLMM_essentialocl_OperationCallExp2278); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = JTLMM.essentialocl.EssentialoclFactory.eINSTANCE.createOperationCallExp();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_8_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, parse_JTLMM_essentialocl_OperationCallExp_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_JTLMM_essentialocl_OperationCallExp"



    // $ANTLR start "parse_JTLMM_essentialocl_BooleanLiteralExp"
    // JTLMM.g:2462:1: parse_JTLMM_essentialocl_BooleanLiteralExp returns [JTLMM.essentialocl.BooleanLiteralExp element = null] : ( (a0= 'true' |a1= 'false' ) ) ;
    public final JTLMM.essentialocl.BooleanLiteralExp parse_JTLMM_essentialocl_BooleanLiteralExp() throws RecognitionException {
        JTLMM.essentialocl.BooleanLiteralExp element =  null;

        int parse_JTLMM_essentialocl_BooleanLiteralExp_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }

            // JTLMM.g:2465:2: ( ( (a0= 'true' |a1= 'false' ) ) )
            // JTLMM.g:2466:2: ( (a0= 'true' |a1= 'false' ) )
            {
            // JTLMM.g:2466:2: ( (a0= 'true' |a1= 'false' ) )
            // JTLMM.g:2467:3: (a0= 'true' |a1= 'false' )
            {
            // JTLMM.g:2467:3: (a0= 'true' |a1= 'false' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==23) ) {
                alt24=1;
            }
            else if ( (LA24_0==19) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // JTLMM.g:2468:4: a0= 'true'
                    {
                    a0=(Token)match(input,23,FOLLOW_23_in_parse_JTLMM_essentialocl_BooleanLiteralExp2316); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }
                    break;
                case 2 :
                    // JTLMM.g:2481:8: a1= 'false'
                    {
                    a1=(Token)match(input,19,FOLLOW_19_in_parse_JTLMM_essentialocl_BooleanLiteralExp2331); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, parse_JTLMM_essentialocl_BooleanLiteralExp_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_JTLMM_essentialocl_BooleanLiteralExp"



    // $ANTLR start "parse_JTLMM_essentialocl_VariableExp"
    // JTLMM.g:2513:1: parse_JTLMM_essentialocl_VariableExp returns [JTLMM.essentialocl.VariableExp element = null] : (a0= TEXT ) ;
    public final JTLMM.essentialocl.VariableExp parse_JTLMM_essentialocl_VariableExp() throws RecognitionException {
        JTLMM.essentialocl.VariableExp element =  null;

        int parse_JTLMM_essentialocl_VariableExp_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }

            // JTLMM.g:2516:2: ( (a0= TEXT ) )
            // JTLMM.g:2517:2: (a0= TEXT )
            {
            // JTLMM.g:2517:2: (a0= TEXT )
            // JTLMM.g:2518:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_JTLMM_essentialocl_VariableExp2371); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, parse_JTLMM_essentialocl_VariableExp_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_JTLMM_essentialocl_VariableExp"



    // $ANTLR start "parse_JTLMM_essentialocl_StringLiteralExp"
    // JTLMM.g:2565:1: parse_JTLMM_essentialocl_StringLiteralExp returns [JTLMM.essentialocl.StringLiteralExp element = null] : a0= '|' (a1= TEXT ) a2= '|' ;
    public final JTLMM.essentialocl.StringLiteralExp parse_JTLMM_essentialocl_StringLiteralExp() throws RecognitionException {
        JTLMM.essentialocl.StringLiteralExp element =  null;

        int parse_JTLMM_essentialocl_StringLiteralExp_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }

            // JTLMM.g:2568:2: (a0= '|' (a1= TEXT ) a2= '|' )
            // JTLMM.g:2569:2: a0= '|' (a1= TEXT ) a2= '|'
            {
            a0=(Token)match(input,27,FOLLOW_27_in_parse_JTLMM_essentialocl_StringLiteralExp2407); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = JTLMM.essentialocl.EssentialoclFactory.eINSTANCE.createStringLiteralExp();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_11_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[349]);
            	}

            // JTLMM.g:2583:2: (a1= TEXT )
            // JTLMM.g:2584:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_JTLMM_essentialocl_StringLiteralExp2425); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[350]);
            	}

            a2=(Token)match(input,27,FOLLOW_27_in_parse_JTLMM_essentialocl_StringLiteralExp2446); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = JTLMM.essentialocl.EssentialoclFactory.eINSTANCE.createStringLiteralExp();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_11_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, parse_JTLMM_essentialocl_StringLiteralExp_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_JTLMM_essentialocl_StringLiteralExp"



    // $ANTLR start "parse_JTLMM_essentialocl_Variable"
    // JTLMM.g:2645:1: parse_JTLMM_essentialocl_Variable returns [JTLMM.essentialocl.Variable element = null] : (a0= TEXT ) ( (a1= ':' (a2= TEXT ) ) )? a3= ';' ;
    public final JTLMM.essentialocl.Variable parse_JTLMM_essentialocl_Variable() throws RecognitionException {
        JTLMM.essentialocl.Variable element =  null;

        int parse_JTLMM_essentialocl_Variable_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }

            // JTLMM.g:2648:2: ( (a0= TEXT ) ( (a1= ':' (a2= TEXT ) ) )? a3= ';' )
            // JTLMM.g:2649:2: (a0= TEXT ) ( (a1= ':' (a2= TEXT ) ) )? a3= ';'
            {
            // JTLMM.g:2649:2: (a0= TEXT )
            // JTLMM.g:2650:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_JTLMM_essentialocl_Variable2479); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[362]);
            		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[363]);
            	}

            // JTLMM.g:2686:2: ( (a1= ':' (a2= TEXT ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==12) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // JTLMM.g:2687:3: (a1= ':' (a2= TEXT ) )
                    {
                    // JTLMM.g:2687:3: (a1= ':' (a2= TEXT ) )
                    // JTLMM.g:2688:4: a1= ':' (a2= TEXT )
                    {
                    a1=(Token)match(input,12,FOLLOW_12_in_parse_JTLMM_essentialocl_Variable2509); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = JTLMM.essentialocl.EssentialoclFactory.eINSTANCE.createVariable();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_12_0_0_1_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[364]);
                    			}

                    // JTLMM.g:2702:4: (a2= TEXT )
                    // JTLMM.g:2703:5: a2= TEXT
                    {
                    a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_JTLMM_essentialocl_Variable2535); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[365]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, JTLMM.resource.JTLMM.mopp.JTLMMExpectationConstants.EXPECTATIONS[366]);
            	}

            a3=(Token)match(input,14,FOLLOW_14_in_parse_JTLMM_essentialocl_Variable2581); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = JTLMM.essentialocl.EssentialoclFactory.eINSTANCE.createVariable();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.JTLMM_12_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, parse_JTLMM_essentialocl_Variable_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_JTLMM_essentialocl_Variable"



    // $ANTLR start "parse_JTLMM_template_TemplateExp"
    // JTLMM.g:2768:1: parse_JTLMM_template_TemplateExp returns [JTLMM.template.TemplateExp element = null] : c0= parse_JTLMM_template_ObjectTemplateExp ;
    public final JTLMM.template.TemplateExp parse_JTLMM_template_TemplateExp() throws RecognitionException {
        JTLMM.template.TemplateExp element =  null;

        int parse_JTLMM_template_TemplateExp_StartIndex = input.index();

        JTLMM.template.ObjectTemplateExp c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return element; }

            // JTLMM.g:2769:2: (c0= parse_JTLMM_template_ObjectTemplateExp )
            // JTLMM.g:2770:2: c0= parse_JTLMM_template_ObjectTemplateExp
            {
            pushFollow(FOLLOW_parse_JTLMM_template_ObjectTemplateExp_in_parse_JTLMM_template_TemplateExp2606);
            c0=parse_JTLMM_template_ObjectTemplateExp();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, parse_JTLMM_template_TemplateExp_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_JTLMM_template_TemplateExp"



    // $ANTLR start "parse_JTLMM_essentialocl_OclExpression"
    // JTLMM.g:2774:1: parse_JTLMM_essentialocl_OclExpression returns [JTLMM.essentialocl.OclExpression element = null] : (c0= parse_JTLMM_template_ObjectTemplateExp |c1= parse_JTLMM_imperativeocl_AssignExp |c2= parse_JTLMM_essentialocl_OperationCallExp |c3= parse_JTLMM_essentialocl_BooleanLiteralExp |c4= parse_JTLMM_essentialocl_VariableExp |c5= parse_JTLMM_essentialocl_StringLiteralExp );
    public final JTLMM.essentialocl.OclExpression parse_JTLMM_essentialocl_OclExpression() throws RecognitionException {
        JTLMM.essentialocl.OclExpression element =  null;

        int parse_JTLMM_essentialocl_OclExpression_StartIndex = input.index();

        JTLMM.template.ObjectTemplateExp c0 =null;

        JTLMM.imperativeocl.AssignExp c1 =null;

        JTLMM.essentialocl.OperationCallExp c2 =null;

        JTLMM.essentialocl.BooleanLiteralExp c3 =null;

        JTLMM.essentialocl.VariableExp c4 =null;

        JTLMM.essentialocl.StringLiteralExp c5 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return element; }

            // JTLMM.g:2775:2: (c0= parse_JTLMM_template_ObjectTemplateExp |c1= parse_JTLMM_imperativeocl_AssignExp |c2= parse_JTLMM_essentialocl_OperationCallExp |c3= parse_JTLMM_essentialocl_BooleanLiteralExp |c4= parse_JTLMM_essentialocl_VariableExp |c5= parse_JTLMM_essentialocl_StringLiteralExp )
            int alt26=6;
            switch ( input.LA(1) ) {
            case TEXT:
                {
                switch ( input.LA(2) ) {
                case 12:
                    {
                    alt26=1;
                    }
                    break;
                case 15:
                    {
                    alt26=2;
                    }
                    break;
                case 9:
                    {
                    alt26=3;
                    }
                    break;
                case EOF:
                case TEXT:
                case 10:
                case 11:
                case 14:
                case 19:
                case 23:
                case 27:
                case 28:
                case 29:
                    {
                    alt26=5;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;

                }

                }
                break;
            case 19:
            case 23:
                {
                alt26=4;
                }
                break;
            case 27:
                {
                alt26=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // JTLMM.g:2776:2: c0= parse_JTLMM_template_ObjectTemplateExp
                    {
                    pushFollow(FOLLOW_parse_JTLMM_template_ObjectTemplateExp_in_parse_JTLMM_essentialocl_OclExpression2627);
                    c0=parse_JTLMM_template_ObjectTemplateExp();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // JTLMM.g:2777:4: c1= parse_JTLMM_imperativeocl_AssignExp
                    {
                    pushFollow(FOLLOW_parse_JTLMM_imperativeocl_AssignExp_in_parse_JTLMM_essentialocl_OclExpression2637);
                    c1=parse_JTLMM_imperativeocl_AssignExp();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // JTLMM.g:2778:4: c2= parse_JTLMM_essentialocl_OperationCallExp
                    {
                    pushFollow(FOLLOW_parse_JTLMM_essentialocl_OperationCallExp_in_parse_JTLMM_essentialocl_OclExpression2647);
                    c2=parse_JTLMM_essentialocl_OperationCallExp();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c2; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 4 :
                    // JTLMM.g:2779:4: c3= parse_JTLMM_essentialocl_BooleanLiteralExp
                    {
                    pushFollow(FOLLOW_parse_JTLMM_essentialocl_BooleanLiteralExp_in_parse_JTLMM_essentialocl_OclExpression2657);
                    c3=parse_JTLMM_essentialocl_BooleanLiteralExp();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c3; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 5 :
                    // JTLMM.g:2780:4: c4= parse_JTLMM_essentialocl_VariableExp
                    {
                    pushFollow(FOLLOW_parse_JTLMM_essentialocl_VariableExp_in_parse_JTLMM_essentialocl_OclExpression2667);
                    c4=parse_JTLMM_essentialocl_VariableExp();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c4; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 6 :
                    // JTLMM.g:2781:4: c5= parse_JTLMM_essentialocl_StringLiteralExp
                    {
                    pushFollow(FOLLOW_parse_JTLMM_essentialocl_StringLiteralExp_in_parse_JTLMM_essentialocl_OclExpression2677);
                    c5=parse_JTLMM_essentialocl_StringLiteralExp();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c5; /* this is a subclass or primitive expression choice */ }

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
            if ( state.backtracking>0 ) { memoize(input, 16, parse_JTLMM_essentialocl_OclExpression_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_JTLMM_essentialocl_OclExpression"

    // $ANTLR start synpred7_JTLMM
    public final void synpred7_JTLMM_fragment() throws RecognitionException {
        JTLMM.JTL.Pattern a8_0 =null;


        // JTLMM.g:1106:3: ( ( (a8_0= parse_JTLMM_JTL_Pattern ) ) )
        // JTLMM.g:1106:3: ( (a8_0= parse_JTLMM_JTL_Pattern ) )
        {
        // JTLMM.g:1106:3: ( (a8_0= parse_JTLMM_JTL_Pattern ) )
        // JTLMM.g:1107:4: (a8_0= parse_JTLMM_JTL_Pattern )
        {
        // JTLMM.g:1107:4: (a8_0= parse_JTLMM_JTL_Pattern )
        // JTLMM.g:1108:5: a8_0= parse_JTLMM_JTL_Pattern
        {
        pushFollow(FOLLOW_parse_JTLMM_JTL_Pattern_in_synpred7_JTLMM734);
        a8_0=parse_JTLMM_JTL_Pattern();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

    }
    // $ANTLR end synpred7_JTLMM

    // $ANTLR start synpred17_JTLMM
    public final void synpred17_JTLMM_fragment() throws RecognitionException {
        Token a2=null;

        // JTLMM.g:1884:3: ( ( (a2= TEXT ) ) )
        // JTLMM.g:1884:3: ( (a2= TEXT ) )
        {
        // JTLMM.g:1884:3: ( (a2= TEXT ) )
        // JTLMM.g:1885:4: (a2= TEXT )
        {
        // JTLMM.g:1885:4: (a2= TEXT )
        // JTLMM.g:1886:5: a2= TEXT
        {
        a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_synpred17_JTLMM1560); if (state.failed) return ;

        }


        }


        }

    }
    // $ANTLR end synpred17_JTLMM

    // $ANTLR start synpred21_JTLMM
    public final void synpred21_JTLMM_fragment() throws RecognitionException {
        Token a5=null;
        Token a7=null;
        Token a9=null;
        JTLMM.imperativeocl.AssignExp a6_0 =null;

        JTLMM.imperativeocl.AssignExp a8_0 =null;


        // JTLMM.g:2034:3: ( (a5= '{' ( ( (a6_0= parse_JTLMM_imperativeocl_AssignExp ) ( (a7= ',' (a8_0= parse_JTLMM_imperativeocl_AssignExp ) ) )* ) )? a9= '}' ) )
        // JTLMM.g:2034:3: (a5= '{' ( ( (a6_0= parse_JTLMM_imperativeocl_AssignExp ) ( (a7= ',' (a8_0= parse_JTLMM_imperativeocl_AssignExp ) ) )* ) )? a9= '}' )
        {
        // JTLMM.g:2034:3: (a5= '{' ( ( (a6_0= parse_JTLMM_imperativeocl_AssignExp ) ( (a7= ',' (a8_0= parse_JTLMM_imperativeocl_AssignExp ) ) )* ) )? a9= '}' )
        // JTLMM.g:2035:4: a5= '{' ( ( (a6_0= parse_JTLMM_imperativeocl_AssignExp ) ( (a7= ',' (a8_0= parse_JTLMM_imperativeocl_AssignExp ) ) )* ) )? a9= '}'
        {
        a5=(Token)match(input,26,FOLLOW_26_in_synpred21_JTLMM1696); if (state.failed) return ;

        // JTLMM.g:2050:4: ( ( (a6_0= parse_JTLMM_imperativeocl_AssignExp ) ( (a7= ',' (a8_0= parse_JTLMM_imperativeocl_AssignExp ) ) )* ) )?
        int alt33=2;
        int LA33_0 = input.LA(1);

        if ( (LA33_0==TEXT) ) {
            alt33=1;
        }
        switch (alt33) {
            case 1 :
                // JTLMM.g:2051:5: ( (a6_0= parse_JTLMM_imperativeocl_AssignExp ) ( (a7= ',' (a8_0= parse_JTLMM_imperativeocl_AssignExp ) ) )* )
                {
                // JTLMM.g:2051:5: ( (a6_0= parse_JTLMM_imperativeocl_AssignExp ) ( (a7= ',' (a8_0= parse_JTLMM_imperativeocl_AssignExp ) ) )* )
                // JTLMM.g:2052:6: (a6_0= parse_JTLMM_imperativeocl_AssignExp ) ( (a7= ',' (a8_0= parse_JTLMM_imperativeocl_AssignExp ) ) )*
                {
                // JTLMM.g:2052:6: (a6_0= parse_JTLMM_imperativeocl_AssignExp )
                // JTLMM.g:2053:7: a6_0= parse_JTLMM_imperativeocl_AssignExp
                {
                pushFollow(FOLLOW_parse_JTLMM_imperativeocl_AssignExp_in_synpred21_JTLMM1737);
                a6_0=parse_JTLMM_imperativeocl_AssignExp();

                state._fsp--;
                if (state.failed) return ;

                }


                // JTLMM.g:2079:6: ( (a7= ',' (a8_0= parse_JTLMM_imperativeocl_AssignExp ) ) )*
                loop32:
                do {
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==11) ) {
                        alt32=1;
                    }


                    switch (alt32) {
                	case 1 :
                	    // JTLMM.g:2080:7: (a7= ',' (a8_0= parse_JTLMM_imperativeocl_AssignExp ) )
                	    {
                	    // JTLMM.g:2080:7: (a7= ',' (a8_0= parse_JTLMM_imperativeocl_AssignExp ) )
                	    // JTLMM.g:2081:8: a7= ',' (a8_0= parse_JTLMM_imperativeocl_AssignExp )
                	    {
                	    a7=(Token)match(input,11,FOLLOW_11_in_synpred21_JTLMM1792); if (state.failed) return ;

                	    // JTLMM.g:2095:8: (a8_0= parse_JTLMM_imperativeocl_AssignExp )
                	    // JTLMM.g:2096:9: a8_0= parse_JTLMM_imperativeocl_AssignExp
                	    {
                	    pushFollow(FOLLOW_parse_JTLMM_imperativeocl_AssignExp_in_synpred21_JTLMM1834);
                	    a8_0=parse_JTLMM_imperativeocl_AssignExp();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop32;
                    }
                } while (true);


                }


                }
                break;

        }


        a9=(Token)match(input,28,FOLLOW_28_in_synpred21_JTLMM1938); if (state.failed) return ;

        }


        }

    }
    // $ANTLR end synpred21_JTLMM

    // $ANTLR start synpred22_JTLMM
    public final void synpred22_JTLMM_fragment() throws RecognitionException {
        JTLMM.essentialocl.OclExpression a2_0 =null;


        // JTLMM.g:2245:3: ( (a2_0= parse_JTLMM_essentialocl_OclExpression ) )
        // JTLMM.g:2245:3: (a2_0= parse_JTLMM_essentialocl_OclExpression )
        {
        // JTLMM.g:2245:3: (a2_0= parse_JTLMM_essentialocl_OclExpression )
        // JTLMM.g:2246:4: a2_0= parse_JTLMM_essentialocl_OclExpression
        {
        pushFollow(FOLLOW_parse_JTLMM_essentialocl_OclExpression_in_synpred22_JTLMM2034);
        a2_0=parse_JTLMM_essentialocl_OclExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

    }
    // $ANTLR end synpred22_JTLMM

    // Delegated rules

    public final boolean synpred22_JTLMM() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_JTLMM_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_JTLMM() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_JTLMM_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_JTLMM() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_JTLMM_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_JTLMM() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_JTLMM_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_parse_JTLMM_JTL_Transformation_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_parse_JTLMM_JTL_Transformation115 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_JTLMM_JTL_Transformation133 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_JTLMM_JTL_Transformation154 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_parse_JTLMM_JTL_Model_in_parse_JTLMM_JTL_Transformation183 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_11_in_parse_JTLMM_JTL_Transformation224 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_JTLMM_JTL_Model_in_parse_JTLMM_JTL_Transformation258 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_10_in_parse_JTLMM_JTL_Transformation332 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_parse_JTLMM_JTL_Transformation346 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_parse_JTLMM_JTL_Relation_in_parse_JTLMM_JTL_Transformation375 = new BitSet(new long[]{0x0000000010300000L});
    public static final BitSet FOLLOW_28_in_parse_JTLMM_JTL_Transformation416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_JTLMM_JTL_Model449 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_JTLMM_JTL_Model470 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_JTLMM_JTL_Model488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_parse_JTLMM_JTL_Relation533 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_parse_JTLMM_JTL_Relation554 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_JTLMM_JTL_Relation572 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_parse_JTLMM_JTL_Relation593 = new BitSet(new long[]{0x0000000013070080L});
    public static final BitSet FOLLOW_parse_JTLMM_essentialocl_Variable_in_parse_JTLMM_JTL_Relation622 = new BitSet(new long[]{0x0000000013070080L});
    public static final BitSet FOLLOW_parse_JTLMM_JTL_Domain_in_parse_JTLMM_JTL_Relation678 = new BitSet(new long[]{0x0000000013070080L});
    public static final BitSet FOLLOW_parse_JTLMM_JTL_Pattern_in_parse_JTLMM_JTL_Relation734 = new BitSet(new long[]{0x0000000013000080L});
    public static final BitSet FOLLOW_parse_JTLMM_JTL_Pattern_in_parse_JTLMM_JTL_Relation790 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_parse_JTLMM_JTL_Relation831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_parse_JTLMM_JTL_Domain869 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_parse_JTLMM_JTL_Domain899 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_JTLMM_JTL_Domain920 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_JTLMM_JTL_Domain938 = new BitSet(new long[]{0x0000000003000080L});
    public static final BitSet FOLLOW_parse_JTLMM_JTL_Pattern_in_parse_JTLMM_JTL_Domain963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_parse_JTLMM_JTL_Pattern996 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_parse_JTLMM_JTL_Pattern1010 = new BitSet(new long[]{0x0000000018880080L});
    public static final BitSet FOLLOW_parse_JTLMM_JTL_Predicate_in_parse_JTLMM_JTL_Pattern1039 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_JTLMM_JTL_Pattern1067 = new BitSet(new long[]{0x0000000018880080L});
    public static final BitSet FOLLOW_28_in_parse_JTLMM_JTL_Pattern1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_parse_JTLMM_JTL_Pattern1118 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_parse_JTLMM_JTL_Pattern1132 = new BitSet(new long[]{0x0000000018880080L});
    public static final BitSet FOLLOW_parse_JTLMM_JTL_Predicate_in_parse_JTLMM_JTL_Pattern1161 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_JTLMM_JTL_Pattern1189 = new BitSet(new long[]{0x0000000018880080L});
    public static final BitSet FOLLOW_28_in_parse_JTLMM_JTL_Pattern1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_JTLMM_template_TemplateExp_in_parse_JTLMM_JTL_Pattern1244 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_parse_JTLMM_JTL_Pattern1262 = new BitSet(new long[]{0x0000000028880080L});
    public static final BitSet FOLLOW_parse_JTLMM_JTL_Predicate_in_parse_JTLMM_JTL_Pattern1291 = new BitSet(new long[]{0x0000000020000800L});
    public static final BitSet FOLLOW_11_in_parse_JTLMM_JTL_Pattern1332 = new BitSet(new long[]{0x0000000008880080L});
    public static final BitSet FOLLOW_parse_JTLMM_JTL_Predicate_in_parse_JTLMM_JTL_Pattern1366 = new BitSet(new long[]{0x0000000020000800L});
    public static final BitSet FOLLOW_29_in_parse_JTLMM_JTL_Pattern1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_JTLMM_essentialocl_OclExpression_in_parse_JTLMM_JTL_Predicate1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_JTLMM_template_ObjectTemplateExp1510 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_JTLMM_template_ObjectTemplateExp1531 = new BitSet(new long[]{0x0000000004002082L});
    public static final BitSet FOLLOW_TEXT_in_parse_JTLMM_template_ObjectTemplateExp1560 = new BitSet(new long[]{0x0000000004002002L});
    public static final BitSet FOLLOW_13_in_parse_JTLMM_template_ObjectTemplateExp1615 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_JTLMM_template_ObjectTemplateExp1641 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_parse_JTLMM_template_ObjectTemplateExp1696 = new BitSet(new long[]{0x0000000010000080L});
    public static final BitSet FOLLOW_parse_JTLMM_imperativeocl_AssignExp_in_parse_JTLMM_template_ObjectTemplateExp1737 = new BitSet(new long[]{0x0000000010000800L});
    public static final BitSet FOLLOW_11_in_parse_JTLMM_template_ObjectTemplateExp1792 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_JTLMM_imperativeocl_AssignExp_in_parse_JTLMM_template_ObjectTemplateExp1834 = new BitSet(new long[]{0x0000000010000800L});
    public static final BitSet FOLLOW_28_in_parse_JTLMM_template_ObjectTemplateExp1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_JTLMM_imperativeocl_AssignExp1990 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_JTLMM_imperativeocl_AssignExp2011 = new BitSet(new long[]{0x0000000008880082L});
    public static final BitSet FOLLOW_parse_JTLMM_essentialocl_OclExpression_in_parse_JTLMM_imperativeocl_AssignExp2034 = new BitSet(new long[]{0x0000000008880082L});
    public static final BitSet FOLLOW_TEXT_in_parse_JTLMM_essentialocl_OperationCallExp2079 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_JTLMM_essentialocl_OperationCallExp2100 = new BitSet(new long[]{0x0000000008880480L});
    public static final BitSet FOLLOW_parse_JTLMM_essentialocl_OclExpression_in_parse_JTLMM_essentialocl_OperationCallExp2129 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_11_in_parse_JTLMM_essentialocl_OperationCallExp2170 = new BitSet(new long[]{0x0000000008880080L});
    public static final BitSet FOLLOW_parse_JTLMM_essentialocl_OclExpression_in_parse_JTLMM_essentialocl_OperationCallExp2204 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_10_in_parse_JTLMM_essentialocl_OperationCallExp2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_parse_JTLMM_essentialocl_BooleanLiteralExp2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_parse_JTLMM_essentialocl_BooleanLiteralExp2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_JTLMM_essentialocl_VariableExp2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_parse_JTLMM_essentialocl_StringLiteralExp2407 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_JTLMM_essentialocl_StringLiteralExp2425 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_parse_JTLMM_essentialocl_StringLiteralExp2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_JTLMM_essentialocl_Variable2479 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_12_in_parse_JTLMM_essentialocl_Variable2509 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_JTLMM_essentialocl_Variable2535 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_JTLMM_essentialocl_Variable2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_JTLMM_template_ObjectTemplateExp_in_parse_JTLMM_template_TemplateExp2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_JTLMM_template_ObjectTemplateExp_in_parse_JTLMM_essentialocl_OclExpression2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_JTLMM_imperativeocl_AssignExp_in_parse_JTLMM_essentialocl_OclExpression2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_JTLMM_essentialocl_OperationCallExp_in_parse_JTLMM_essentialocl_OclExpression2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_JTLMM_essentialocl_BooleanLiteralExp_in_parse_JTLMM_essentialocl_OclExpression2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_JTLMM_essentialocl_VariableExp_in_parse_JTLMM_essentialocl_OclExpression2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_JTLMM_essentialocl_StringLiteralExp_in_parse_JTLMM_essentialocl_OclExpression2677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_JTLMM_JTL_Pattern_in_synpred7_JTLMM734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_synpred17_JTLMM1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred21_JTLMM1696 = new BitSet(new long[]{0x0000000010000080L});
    public static final BitSet FOLLOW_parse_JTLMM_imperativeocl_AssignExp_in_synpred21_JTLMM1737 = new BitSet(new long[]{0x0000000010000800L});
    public static final BitSet FOLLOW_11_in_synpred21_JTLMM1792 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_JTLMM_imperativeocl_AssignExp_in_synpred21_JTLMM1834 = new BitSet(new long[]{0x0000000010000800L});
    public static final BitSet FOLLOW_28_in_synpred21_JTLMM1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_JTLMM_essentialocl_OclExpression_in_synpred22_JTLMM2034 = new BitSet(new long[]{0x0000000000000002L});

}