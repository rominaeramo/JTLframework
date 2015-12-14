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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "FLOAT", "INTEGER", "LINEBREAK", "QUOTED_34_34", "TEXT", "WHITESPACE", "':'", "'Constraint'", "'Edge'", "'Eq'", "'EqSimple'", "'LeftPattern'", "'Literal'", "'Metaedge'", "'Metamodel'", "'Metanode'", "'Metaprop'", "'Node'", "'Not'", "'NotEq'", "'Prop'", "'Relation'", "'RightPattern'", "'Terminal'", "'Transformation'", "'commentsAfter'", "'commentsBefore'", "'constraints'", "'content'", "'contents'", "'edgeId'", "'element'", "'elements'", "'isDefinition'", "'isEdgex'", "'isMetaedge'", "'isMetanode'", "'isMetaprop'", "'isNodex'", "'isPropx'", "'isTrace'", "'left1'", "'left2right'", "'location'", "'lpattern'", "'metaClass'", "'metaClassId'", "'metamodel'", "'metamodels'", "'name'", "'nodeId'", "'parameterName'", "'propId'", "'propValue'", "'relationId'", "'relations'", "'right1'", "'right2left'", "'rpattern'", "'sourceMCId'", "'sourceMetaClass'", "'targetMCId'", "'targetMetaClass'", "'type'", "'usedLiterals'", "'{'", "'}'"
    };

    public static final int EOF=-1;
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
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int COMMENT=4;
    public static final int FLOAT=5;
    public static final int INTEGER=6;
    public static final int LINEBREAK=7;
    public static final int QUOTED_34_34=8;
    public static final int TEXT=9;
    public static final int WHITESPACE=10;

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
        this.state.initializeRuleMemo(128 + 1);
         

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
    	



    // $ANTLR start "start"
    // ASP.g:550:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_ASP_Transformation ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;

        int start_StartIndex = input.index();

        ASP.Transformation c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }

            // ASP.g:551:2: ( (c0= parse_ASP_Transformation ) EOF )
            // ASP.g:552:2: (c0= parse_ASP_Transformation ) EOF
            {
            if ( state.backtracking==0 ) {
            		// follow set for start rule(s)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[0]);
            		expectedElementsIndexOfLastCompleteElement = 0;
            	}

            // ASP.g:557:2: (c0= parse_ASP_Transformation )
            // ASP.g:558:3: c0= parse_ASP_Transformation
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
    // ASP.g:566:1: parse_ASP_Transformation returns [ASP.Transformation element = null] : a0= 'Transformation' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* (a11= 'metamodels' a12= ':' (a13_0= parse_ASP_Metamodel ) ) ( (a14= 'usedLiterals' a15= ':' (a16_0= parse_ASP_Literal ) ) )* ( (a17= 'constraints' a18= ':' (a19_0= parse_ASP_Constraint ) ) )* ( (a20= 'elements' a21= ':' (a22_0= parse_ASP_Element ) ) )+ ( (a23= 'relations' a24= ':' (a25_0= parse_ASP_Relation ) ) )+ ( (a26= 'name' a27= ':' (a28= QUOTED_34_34 ) ) )* a29= '}' ;
    public final ASP.Transformation parse_ASP_Transformation() throws RecognitionException {
        ASP.Transformation element =  null;

        int parse_ASP_Transformation_StartIndex = input.index();

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
        Token a14=null;
        Token a15=null;
        Token a17=null;
        Token a18=null;
        Token a20=null;
        Token a21=null;
        Token a23=null;
        Token a24=null;
        Token a26=null;
        Token a27=null;
        Token a28=null;
        Token a29=null;
        ASP.Metamodel a13_0 =null;

        ASP.Literal a16_0 =null;

        ASP.Constraint a19_0 =null;

        ASP.Element a22_0 =null;

        ASP.Relation a25_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }

            // ASP.g:569:2: (a0= 'Transformation' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* (a11= 'metamodels' a12= ':' (a13_0= parse_ASP_Metamodel ) ) ( (a14= 'usedLiterals' a15= ':' (a16_0= parse_ASP_Literal ) ) )* ( (a17= 'constraints' a18= ':' (a19_0= parse_ASP_Constraint ) ) )* ( (a20= 'elements' a21= ':' (a22_0= parse_ASP_Element ) ) )+ ( (a23= 'relations' a24= ':' (a25_0= parse_ASP_Relation ) ) )+ ( (a26= 'name' a27= ':' (a28= QUOTED_34_34 ) ) )* a29= '}' )
            // ASP.g:570:2: a0= 'Transformation' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* (a11= 'metamodels' a12= ':' (a13_0= parse_ASP_Metamodel ) ) ( (a14= 'usedLiterals' a15= ':' (a16_0= parse_ASP_Literal ) ) )* ( (a17= 'constraints' a18= ':' (a19_0= parse_ASP_Constraint ) ) )* ( (a20= 'elements' a21= ':' (a22_0= parse_ASP_Element ) ) )+ ( (a23= 'relations' a24= ':' (a25_0= parse_ASP_Relation ) ) )+ ( (a26= 'name' a27= ':' (a28= QUOTED_34_34 ) ) )* a29= '}'
            {
            a0=(Token)match(input,29,FOLLOW_29_in_parse_ASP_Transformation115); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createTransformation();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1]);
            	}

            a1=(Token)match(input,70,FOLLOW_70_in_parse_ASP_Transformation129); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createTransformation();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[2]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[3]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[4]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[5]);
            	}

            // ASP.g:601:2: ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==48) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ASP.g:602:3: (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) )
                    {
                    // ASP.g:602:3: (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) )
                    // ASP.g:603:4: a2= 'location' a3= ':' (a4= QUOTED_34_34 )
                    {
                    a2=(Token)match(input,48,FOLLOW_48_in_parse_ASP_Transformation152); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createTransformation();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_2_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[6]);
                    			}

                    a3=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Transformation172); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createTransformation();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_2_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[7]);
                    			}

                    // ASP.g:631:4: (a4= QUOTED_34_34 )
                    // ASP.g:632:5: a4= QUOTED_34_34
                    {
                    a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_Transformation198); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[8]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[9]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[10]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[11]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[12]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[13]);
            	}

            // ASP.g:678:2: ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==31) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ASP.g:679:3: (a5= 'commentsBefore' a6= ':' (a7= TEXT ) )
            	    {
            	    // ASP.g:679:3: (a5= 'commentsBefore' a6= ':' (a7= TEXT ) )
            	    // ASP.g:680:4: a5= 'commentsBefore' a6= ':' (a7= TEXT )
            	    {
            	    a5=(Token)match(input,31,FOLLOW_31_in_parse_ASP_Transformation253); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createTransformation();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_3_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[14]);
            	    			}

            	    a6=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Transformation273); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createTransformation();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_3_0_0_1, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[15]);
            	    			}

            	    // ASP.g:708:4: (a7= TEXT )
            	    // ASP.g:709:5: a7= TEXT
            	    {
            	    a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Transformation299); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[16]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[17]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[18]);
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
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[19]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[20]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[21]);
            	}

            // ASP.g:755:2: ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==30) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ASP.g:756:3: (a8= 'commentsAfter' a9= ':' (a10= TEXT ) )
            	    {
            	    // ASP.g:756:3: (a8= 'commentsAfter' a9= ':' (a10= TEXT ) )
            	    // ASP.g:757:4: a8= 'commentsAfter' a9= ':' (a10= TEXT )
            	    {
            	    a8=(Token)match(input,30,FOLLOW_30_in_parse_ASP_Transformation354); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createTransformation();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_4_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[22]);
            	    			}

            	    a9=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Transformation374); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createTransformation();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_4_0_0_1, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[23]);
            	    			}

            	    // ASP.g:785:4: (a10= TEXT )
            	    // ASP.g:786:5: a10= TEXT
            	    {
            	    a10=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Transformation400); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[24]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[25]);
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
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[26]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[27]);
            	}

            // ASP.g:830:2: (a11= 'metamodels' a12= ':' (a13_0= parse_ASP_Metamodel ) )
            // ASP.g:831:3: a11= 'metamodels' a12= ':' (a13_0= parse_ASP_Metamodel )
            {
            a11=(Token)match(input,53,FOLLOW_53_in_parse_ASP_Transformation450); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = ASP.ASPFactory.eINSTANCE.createTransformation();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_5_0_0_0, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[28]);
            		}

            a12=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Transformation467); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = ASP.ASPFactory.eINSTANCE.createTransformation();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_5_0_0_1, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[29]);
            		}

            // ASP.g:859:3: (a13_0= parse_ASP_Metamodel )
            // ASP.g:860:4: a13_0= parse_ASP_Metamodel
            {
            pushFollow(FOLLOW_parse_ASP_Metamodel_in_parse_ASP_Transformation489);
            a13_0=parse_ASP_Metamodel();

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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[30]);
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[31]);
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[32]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[33]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[34]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[35]);
            	}

            // ASP.g:895:2: ( (a14= 'usedLiterals' a15= ':' (a16_0= parse_ASP_Literal ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==69) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ASP.g:896:3: (a14= 'usedLiterals' a15= ':' (a16_0= parse_ASP_Literal ) )
            	    {
            	    // ASP.g:896:3: (a14= 'usedLiterals' a15= ':' (a16_0= parse_ASP_Literal ) )
            	    // ASP.g:897:4: a14= 'usedLiterals' a15= ':' (a16_0= parse_ASP_Literal )
            	    {
            	    a14=(Token)match(input,69,FOLLOW_69_in_parse_ASP_Transformation528); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createTransformation();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_6_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[36]);
            	    			}

            	    a15=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Transformation548); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createTransformation();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_6_0_0_1, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[37]);
            	    			}

            	    // ASP.g:925:4: (a16_0= parse_ASP_Literal )
            	    // ASP.g:926:5: a16_0= parse_ASP_Literal
            	    {
            	    pushFollow(FOLLOW_parse_ASP_Literal_in_parse_ASP_Transformation574);
            	    a16_0=parse_ASP_Literal();

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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[38]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[39]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[40]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[41]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[42]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[43]);
            	}

            // ASP.g:962:2: ( (a17= 'constraints' a18= ':' (a19_0= parse_ASP_Constraint ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==32) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ASP.g:963:3: (a17= 'constraints' a18= ':' (a19_0= parse_ASP_Constraint ) )
            	    {
            	    // ASP.g:963:3: (a17= 'constraints' a18= ':' (a19_0= parse_ASP_Constraint ) )
            	    // ASP.g:964:4: a17= 'constraints' a18= ':' (a19_0= parse_ASP_Constraint )
            	    {
            	    a17=(Token)match(input,32,FOLLOW_32_in_parse_ASP_Transformation624); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createTransformation();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_7_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[44]);
            	    			}

            	    a18=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Transformation644); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createTransformation();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_7_0_0_1, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[45]);
            	    			}

            	    // ASP.g:992:4: (a19_0= parse_ASP_Constraint )
            	    // ASP.g:993:5: a19_0= parse_ASP_Constraint
            	    {
            	    pushFollow(FOLLOW_parse_ASP_Constraint_in_parse_ASP_Transformation670);
            	    a19_0=parse_ASP_Constraint();

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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[46]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[47]);
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
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[48]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[49]);
            	}

            // ASP.g:1027:2: ( (a20= 'elements' a21= ':' (a22_0= parse_ASP_Element ) ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==37) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ASP.g:1028:3: (a20= 'elements' a21= ':' (a22_0= parse_ASP_Element ) )
            	    {
            	    // ASP.g:1028:3: (a20= 'elements' a21= ':' (a22_0= parse_ASP_Element ) )
            	    // ASP.g:1029:4: a20= 'elements' a21= ':' (a22_0= parse_ASP_Element )
            	    {
            	    a20=(Token)match(input,37,FOLLOW_37_in_parse_ASP_Transformation720); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createTransformation();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_8_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a20, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[50]);
            	    			}

            	    a21=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Transformation740); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createTransformation();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_8_0_0_1, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a21, element);
            	    			}

            	    if ( state.backtracking==0 ) {
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

            	    // ASP.g:1069:4: (a22_0= parse_ASP_Element )
            	    // ASP.g:1070:5: a22_0= parse_ASP_Element
            	    {
            	    pushFollow(FOLLOW_parse_ASP_Element_in_parse_ASP_Transformation766);
            	    a22_0=parse_ASP_Element();

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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[64]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[65]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[66]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[67]);
            	}

            // ASP.g:1104:2: ( (a23= 'relations' a24= ':' (a25_0= parse_ASP_Relation ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==60) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ASP.g:1105:3: (a23= 'relations' a24= ':' (a25_0= parse_ASP_Relation ) )
            	    {
            	    // ASP.g:1105:3: (a23= 'relations' a24= ':' (a25_0= parse_ASP_Relation ) )
            	    // ASP.g:1106:4: a23= 'relations' a24= ':' (a25_0= parse_ASP_Relation )
            	    {
            	    a23=(Token)match(input,60,FOLLOW_60_in_parse_ASP_Transformation816); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createTransformation();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_9_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a23, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[68]);
            	    			}

            	    a24=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Transformation836); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createTransformation();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_9_0_0_1, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a24, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[69]);
            	    			}

            	    // ASP.g:1134:4: (a25_0= parse_ASP_Relation )
            	    // ASP.g:1135:5: a25_0= parse_ASP_Relation
            	    {
            	    pushFollow(FOLLOW_parse_ASP_Relation_in_parse_ASP_Transformation862);
            	    a25_0=parse_ASP_Relation();

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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[70]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[71]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[72]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[73]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[74]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[75]);
            	}

            // ASP.g:1171:2: ( (a26= 'name' a27= ':' (a28= QUOTED_34_34 ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==54) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ASP.g:1172:3: (a26= 'name' a27= ':' (a28= QUOTED_34_34 ) )
            	    {
            	    // ASP.g:1172:3: (a26= 'name' a27= ':' (a28= QUOTED_34_34 ) )
            	    // ASP.g:1173:4: a26= 'name' a27= ':' (a28= QUOTED_34_34 )
            	    {
            	    a26=(Token)match(input,54,FOLLOW_54_in_parse_ASP_Transformation912); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createTransformation();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_10_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a26, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[76]);
            	    			}

            	    a27=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Transformation932); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createTransformation();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_10_0_0_1, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a27, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[77]);
            	    			}

            	    // ASP.g:1201:4: (a28= QUOTED_34_34 )
            	    // ASP.g:1202:5: a28= QUOTED_34_34
            	    {
            	    a28=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_Transformation958); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[78]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[79]);
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
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[80]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[81]);
            	}

            a29=(Token)match(input,71,FOLLOW_71_in_parse_ASP_Transformation1004); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createTransformation();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_0_0_0_11, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a29, element);
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
            if ( state.backtracking>0 ) { memoize(input, 2, parse_ASP_Transformation_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_Transformation"



    // $ANTLR start "parse_ASP_LeftPattern"
    // ASP.g:1261:1: parse_ASP_LeftPattern returns [ASP.LeftPattern element = null] : a0= 'LeftPattern' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* (a11= 'element' a12= ':' (a13_0= parse_ASP_PatternElement ) ) (a14= 'name' a15= ':' (a16= QUOTED_34_34 ) ) (a17= 'relationId' a18= ':' (a19= QUOTED_34_34 ) ) ( ( (a20= 'isMetanode' ) ) ) ( ( (a23= 'isMetaprop' ) ) ) ( ( (a26= 'isMetaedge' ) ) ) a29= '}' ;
    public final ASP.LeftPattern parse_ASP_LeftPattern() throws RecognitionException {
        ASP.LeftPattern element =  null;

        int parse_ASP_LeftPattern_StartIndex = input.index();

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
        Token a14=null;
        Token a15=null;
        Token a16=null;
        Token a17=null;
        Token a18=null;
        Token a19=null;
        Token a20=null;
        Token a23=null;
        Token a26=null;
        Token a29=null;
        ASP.PatternElement a13_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }

            // ASP.g:1264:2: (a0= 'LeftPattern' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* (a11= 'element' a12= ':' (a13_0= parse_ASP_PatternElement ) ) (a14= 'name' a15= ':' (a16= QUOTED_34_34 ) ) (a17= 'relationId' a18= ':' (a19= QUOTED_34_34 ) ) ( ( (a20= 'isMetanode' ) ) ) ( ( (a23= 'isMetaprop' ) ) ) ( ( (a26= 'isMetaedge' ) ) ) a29= '}' )
            // ASP.g:1265:2: a0= 'LeftPattern' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* (a11= 'element' a12= ':' (a13_0= parse_ASP_PatternElement ) ) (a14= 'name' a15= ':' (a16= QUOTED_34_34 ) ) (a17= 'relationId' a18= ':' (a19= QUOTED_34_34 ) ) ( ( (a20= 'isMetanode' ) ) ) ( ( (a23= 'isMetaprop' ) ) ) ( ( (a26= 'isMetaedge' ) ) ) a29= '}'
            {
            a0=(Token)match(input,16,FOLLOW_16_in_parse_ASP_LeftPattern1033); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[82]);
            	}

            a1=(Token)match(input,70,FOLLOW_70_in_parse_ASP_LeftPattern1047); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[83]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[84]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[85]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[86]);
            	}

            // ASP.g:1326:2: ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==48) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ASP.g:1327:3: (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) )
                    {
                    // ASP.g:1327:3: (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) )
                    // ASP.g:1328:4: a2= 'location' a3= ':' (a4= QUOTED_34_34 )
                    {
                    a2=(Token)match(input,48,FOLLOW_48_in_parse_ASP_LeftPattern1070); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[87]);
                    			}

                    a3=(Token)match(input,11,FOLLOW_11_in_parse_ASP_LeftPattern1090); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[88]);
                    			}

                    // ASP.g:1386:4: (a4= QUOTED_34_34 )
                    // ASP.g:1387:5: a4= QUOTED_34_34
                    {
                    a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_LeftPattern1116); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[89]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[90]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[91]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[92]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[93]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[94]);
            	}

            // ASP.g:1448:2: ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==31) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ASP.g:1449:3: (a5= 'commentsBefore' a6= ':' (a7= TEXT ) )
            	    {
            	    // ASP.g:1449:3: (a5= 'commentsBefore' a6= ':' (a7= TEXT ) )
            	    // ASP.g:1450:4: a5= 'commentsBefore' a6= ':' (a7= TEXT )
            	    {
            	    a5=(Token)match(input,31,FOLLOW_31_in_parse_ASP_LeftPattern1171); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[95]);
            	    			}

            	    a6=(Token)match(input,11,FOLLOW_11_in_parse_ASP_LeftPattern1191); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[96]);
            	    			}

            	    // ASP.g:1508:4: (a7= TEXT )
            	    // ASP.g:1509:5: a7= TEXT
            	    {
            	    a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_LeftPattern1217); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[97]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[98]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[99]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[100]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[101]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[102]);
            	}

            // ASP.g:1570:2: ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==30) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ASP.g:1571:3: (a8= 'commentsAfter' a9= ':' (a10= TEXT ) )
            	    {
            	    // ASP.g:1571:3: (a8= 'commentsAfter' a9= ':' (a10= TEXT ) )
            	    // ASP.g:1572:4: a8= 'commentsAfter' a9= ':' (a10= TEXT )
            	    {
            	    a8=(Token)match(input,30,FOLLOW_30_in_parse_ASP_LeftPattern1272); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[103]);
            	    			}

            	    a9=(Token)match(input,11,FOLLOW_11_in_parse_ASP_LeftPattern1292); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[104]);
            	    			}

            	    // ASP.g:1630:4: (a10= TEXT )
            	    // ASP.g:1631:5: a10= TEXT
            	    {
            	    a10=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_LeftPattern1318); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[105]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[106]);
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
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[107]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[108]);
            	}

            // ASP.g:1690:2: (a11= 'element' a12= ':' (a13_0= parse_ASP_PatternElement ) )
            // ASP.g:1691:3: a11= 'element' a12= ':' (a13_0= parse_ASP_PatternElement )
            {
            a11=(Token)match(input,36,FOLLOW_36_in_parse_ASP_LeftPattern1368); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[109]);
            		}

            a12=(Token)match(input,11,FOLLOW_11_in_parse_ASP_LeftPattern1385); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getLeftPattern(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[110]);
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getLeftPattern(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[111]);
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getLeftPattern(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[112]);
            		}

            // ASP.g:1751:3: (a13_0= parse_ASP_PatternElement )
            // ASP.g:1752:4: a13_0= parse_ASP_PatternElement
            {
            pushFollow(FOLLOW_parse_ASP_PatternElement_in_parse_ASP_LeftPattern1407);
            a13_0=parse_ASP_PatternElement();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[113]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[114]);
            	}

            // ASP.g:1798:2: (a14= 'name' a15= ':' (a16= QUOTED_34_34 ) )
            // ASP.g:1799:3: a14= 'name' a15= ':' (a16= QUOTED_34_34 )
            {
            a14=(Token)match(input,54,FOLLOW_54_in_parse_ASP_LeftPattern1441); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[115]);
            		}

            a15=(Token)match(input,11,FOLLOW_11_in_parse_ASP_LeftPattern1458); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[116]);
            		}

            // ASP.g:1857:3: (a16= QUOTED_34_34 )
            // ASP.g:1858:4: a16= QUOTED_34_34
            {
            a16=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_LeftPattern1480); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[117]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[118]);
            	}

            // ASP.g:1914:2: (a17= 'relationId' a18= ':' (a19= QUOTED_34_34 ) )
            // ASP.g:1915:3: a17= 'relationId' a18= ':' (a19= QUOTED_34_34 )
            {
            a17=(Token)match(input,59,FOLLOW_59_in_parse_ASP_LeftPattern1518); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[119]);
            		}

            a18=(Token)match(input,11,FOLLOW_11_in_parse_ASP_LeftPattern1535); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[120]);
            		}

            // ASP.g:1973:3: (a19= QUOTED_34_34 )
            // ASP.g:1974:4: a19= QUOTED_34_34
            {
            a19=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_LeftPattern1557); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[121]);
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[122]);
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[123]);
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[124]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[125]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[126]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[127]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[128]);
            	}

            // ASP.g:2036:2: ( ( (a20= 'isMetanode' ) ) )
            // ASP.g:2037:3: ( (a20= 'isMetanode' ) )
            {
            // ASP.g:2037:3: ( (a20= 'isMetanode' ) )
            // ASP.g:2038:4: (a20= 'isMetanode' )
            {
            // ASP.g:2038:4: (a20= 'isMetanode' )
            // ASP.g:2039:5: a20= 'isMetanode'
            {
            a20=(Token)match(input,41,FOLLOW_41_in_parse_ASP_LeftPattern1606); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[129]);
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[130]);
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[131]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[132]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[133]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[134]);
            	}

            // ASP.g:2084:2: ( ( (a23= 'isMetaprop' ) ) )
            // ASP.g:2085:3: ( (a23= 'isMetaprop' ) )
            {
            // ASP.g:2085:3: ( (a23= 'isMetaprop' ) )
            // ASP.g:2086:4: (a23= 'isMetaprop' )
            {
            // ASP.g:2086:4: (a23= 'isMetaprop' )
            // ASP.g:2087:5: a23= 'isMetaprop'
            {
            a23=(Token)match(input,42,FOLLOW_42_in_parse_ASP_LeftPattern1654); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[135]);
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[136]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[137]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[138]);
            	}

            // ASP.g:2130:2: ( ( (a26= 'isMetaedge' ) ) )
            // ASP.g:2131:3: ( (a26= 'isMetaedge' ) )
            {
            // ASP.g:2131:3: ( (a26= 'isMetaedge' ) )
            // ASP.g:2132:4: (a26= 'isMetaedge' )
            {
            // ASP.g:2132:4: (a26= 'isMetaedge' )
            // ASP.g:2133:5: a26= 'isMetaedge'
            {
            a26=(Token)match(input,40,FOLLOW_40_in_parse_ASP_LeftPattern1702); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[139]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[140]);
            	}

            a29=(Token)match(input,71,FOLLOW_71_in_parse_ASP_LeftPattern1735); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[141]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, parse_ASP_LeftPattern_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_LeftPattern"



    // $ANTLR start "parse_ASP_RightPattern"
    // ASP.g:2205:1: parse_ASP_RightPattern returns [ASP.RightPattern element = null] : a0= 'RightPattern' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* (a11= 'element' a12= ':' (a13_0= parse_ASP_PatternElement ) ) (a14= 'name' a15= ':' (a16= QUOTED_34_34 ) ) (a17= 'relationId' a18= ':' (a19= QUOTED_34_34 ) ) ( ( (a20= 'isMetanode' ) ) ) ( ( (a23= 'isMetaprop' ) ) ) ( ( (a26= 'isMetaedge' ) ) ) a29= '}' ;
    public final ASP.RightPattern parse_ASP_RightPattern() throws RecognitionException {
        ASP.RightPattern element =  null;

        int parse_ASP_RightPattern_StartIndex = input.index();

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
        Token a14=null;
        Token a15=null;
        Token a16=null;
        Token a17=null;
        Token a18=null;
        Token a19=null;
        Token a20=null;
        Token a23=null;
        Token a26=null;
        Token a29=null;
        ASP.PatternElement a13_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }

            // ASP.g:2208:2: (a0= 'RightPattern' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* (a11= 'element' a12= ':' (a13_0= parse_ASP_PatternElement ) ) (a14= 'name' a15= ':' (a16= QUOTED_34_34 ) ) (a17= 'relationId' a18= ':' (a19= QUOTED_34_34 ) ) ( ( (a20= 'isMetanode' ) ) ) ( ( (a23= 'isMetaprop' ) ) ) ( ( (a26= 'isMetaedge' ) ) ) a29= '}' )
            // ASP.g:2209:2: a0= 'RightPattern' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* (a11= 'element' a12= ':' (a13_0= parse_ASP_PatternElement ) ) (a14= 'name' a15= ':' (a16= QUOTED_34_34 ) ) (a17= 'relationId' a18= ':' (a19= QUOTED_34_34 ) ) ( ( (a20= 'isMetanode' ) ) ) ( ( (a23= 'isMetaprop' ) ) ) ( ( (a26= 'isMetaedge' ) ) ) a29= '}'
            {
            a0=(Token)match(input,27,FOLLOW_27_in_parse_ASP_RightPattern1764); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[142]);
            	}

            a1=(Token)match(input,70,FOLLOW_70_in_parse_ASP_RightPattern1778); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[143]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[144]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[145]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[146]);
            	}

            // ASP.g:2270:2: ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==48) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ASP.g:2271:3: (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) )
                    {
                    // ASP.g:2271:3: (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) )
                    // ASP.g:2272:4: a2= 'location' a3= ':' (a4= QUOTED_34_34 )
                    {
                    a2=(Token)match(input,48,FOLLOW_48_in_parse_ASP_RightPattern1801); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[147]);
                    			}

                    a3=(Token)match(input,11,FOLLOW_11_in_parse_ASP_RightPattern1821); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[148]);
                    			}

                    // ASP.g:2330:4: (a4= QUOTED_34_34 )
                    // ASP.g:2331:5: a4= QUOTED_34_34
                    {
                    a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_RightPattern1847); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[149]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[150]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[151]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[152]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[153]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[154]);
            	}

            // ASP.g:2392:2: ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==31) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ASP.g:2393:3: (a5= 'commentsBefore' a6= ':' (a7= TEXT ) )
            	    {
            	    // ASP.g:2393:3: (a5= 'commentsBefore' a6= ':' (a7= TEXT ) )
            	    // ASP.g:2394:4: a5= 'commentsBefore' a6= ':' (a7= TEXT )
            	    {
            	    a5=(Token)match(input,31,FOLLOW_31_in_parse_ASP_RightPattern1902); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[155]);
            	    			}

            	    a6=(Token)match(input,11,FOLLOW_11_in_parse_ASP_RightPattern1922); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[156]);
            	    			}

            	    // ASP.g:2452:4: (a7= TEXT )
            	    // ASP.g:2453:5: a7= TEXT
            	    {
            	    a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_RightPattern1948); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[157]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[158]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[159]);
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
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[160]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[161]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[162]);
            	}

            // ASP.g:2514:2: ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ASP.g:2515:3: (a8= 'commentsAfter' a9= ':' (a10= TEXT ) )
            	    {
            	    // ASP.g:2515:3: (a8= 'commentsAfter' a9= ':' (a10= TEXT ) )
            	    // ASP.g:2516:4: a8= 'commentsAfter' a9= ':' (a10= TEXT )
            	    {
            	    a8=(Token)match(input,30,FOLLOW_30_in_parse_ASP_RightPattern2003); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[163]);
            	    			}

            	    a9=(Token)match(input,11,FOLLOW_11_in_parse_ASP_RightPattern2023); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[164]);
            	    			}

            	    // ASP.g:2574:4: (a10= TEXT )
            	    // ASP.g:2575:5: a10= TEXT
            	    {
            	    a10=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_RightPattern2049); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[165]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[166]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[167]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[168]);
            	}

            // ASP.g:2634:2: (a11= 'element' a12= ':' (a13_0= parse_ASP_PatternElement ) )
            // ASP.g:2635:3: a11= 'element' a12= ':' (a13_0= parse_ASP_PatternElement )
            {
            a11=(Token)match(input,36,FOLLOW_36_in_parse_ASP_RightPattern2099); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[169]);
            		}

            a12=(Token)match(input,11,FOLLOW_11_in_parse_ASP_RightPattern2116); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getRightPattern(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[170]);
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getRightPattern(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[171]);
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getRightPattern(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[172]);
            		}

            // ASP.g:2695:3: (a13_0= parse_ASP_PatternElement )
            // ASP.g:2696:4: a13_0= parse_ASP_PatternElement
            {
            pushFollow(FOLLOW_parse_ASP_PatternElement_in_parse_ASP_RightPattern2138);
            a13_0=parse_ASP_PatternElement();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[173]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[174]);
            	}

            // ASP.g:2742:2: (a14= 'name' a15= ':' (a16= QUOTED_34_34 ) )
            // ASP.g:2743:3: a14= 'name' a15= ':' (a16= QUOTED_34_34 )
            {
            a14=(Token)match(input,54,FOLLOW_54_in_parse_ASP_RightPattern2172); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[175]);
            		}

            a15=(Token)match(input,11,FOLLOW_11_in_parse_ASP_RightPattern2189); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[176]);
            		}

            // ASP.g:2801:3: (a16= QUOTED_34_34 )
            // ASP.g:2802:4: a16= QUOTED_34_34
            {
            a16=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_RightPattern2211); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[177]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[178]);
            	}

            // ASP.g:2858:2: (a17= 'relationId' a18= ':' (a19= QUOTED_34_34 ) )
            // ASP.g:2859:3: a17= 'relationId' a18= ':' (a19= QUOTED_34_34 )
            {
            a17=(Token)match(input,59,FOLLOW_59_in_parse_ASP_RightPattern2249); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[179]);
            		}

            a18=(Token)match(input,11,FOLLOW_11_in_parse_ASP_RightPattern2266); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[180]);
            		}

            // ASP.g:2917:3: (a19= QUOTED_34_34 )
            // ASP.g:2918:4: a19= QUOTED_34_34
            {
            a19=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_RightPattern2288); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[181]);
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[182]);
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[183]);
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[184]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[185]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[186]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[187]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[188]);
            	}

            // ASP.g:2980:2: ( ( (a20= 'isMetanode' ) ) )
            // ASP.g:2981:3: ( (a20= 'isMetanode' ) )
            {
            // ASP.g:2981:3: ( (a20= 'isMetanode' ) )
            // ASP.g:2982:4: (a20= 'isMetanode' )
            {
            // ASP.g:2982:4: (a20= 'isMetanode' )
            // ASP.g:2983:5: a20= 'isMetanode'
            {
            a20=(Token)match(input,41,FOLLOW_41_in_parse_ASP_RightPattern2337); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[189]);
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[190]);
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[191]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[192]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[193]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[194]);
            	}

            // ASP.g:3028:2: ( ( (a23= 'isMetaprop' ) ) )
            // ASP.g:3029:3: ( (a23= 'isMetaprop' ) )
            {
            // ASP.g:3029:3: ( (a23= 'isMetaprop' ) )
            // ASP.g:3030:4: (a23= 'isMetaprop' )
            {
            // ASP.g:3030:4: (a23= 'isMetaprop' )
            // ASP.g:3031:5: a23= 'isMetaprop'
            {
            a23=(Token)match(input,42,FOLLOW_42_in_parse_ASP_RightPattern2385); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[195]);
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[196]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[197]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[198]);
            	}

            // ASP.g:3074:2: ( ( (a26= 'isMetaedge' ) ) )
            // ASP.g:3075:3: ( (a26= 'isMetaedge' ) )
            {
            // ASP.g:3075:3: ( (a26= 'isMetaedge' ) )
            // ASP.g:3076:4: (a26= 'isMetaedge' )
            {
            // ASP.g:3076:4: (a26= 'isMetaedge' )
            // ASP.g:3077:5: a26= 'isMetaedge'
            {
            a26=(Token)match(input,40,FOLLOW_40_in_parse_ASP_RightPattern2433); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[199]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[200]);
            	}

            a29=(Token)match(input,71,FOLLOW_71_in_parse_ASP_RightPattern2466); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[201]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, parse_ASP_RightPattern_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_RightPattern"



    // $ANTLR start "parse_ASP_Constraint"
    // ASP.g:3149:1: parse_ASP_Constraint returns [ASP.Constraint element = null] : a0= 'Constraint' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* ( (a11= 'contents' a12= ':' (a13_0= parse_ASP_ConstraintElement ) ) )+ ( (a14= 'name' a15= ':' (a16= QUOTED_34_34 ) ) )? a17= '}' ;
    public final ASP.Constraint parse_ASP_Constraint() throws RecognitionException {
        ASP.Constraint element =  null;

        int parse_ASP_Constraint_StartIndex = input.index();

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
        Token a14=null;
        Token a15=null;
        Token a16=null;
        Token a17=null;
        ASP.ConstraintElement a13_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }

            // ASP.g:3152:2: (a0= 'Constraint' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* ( (a11= 'contents' a12= ':' (a13_0= parse_ASP_ConstraintElement ) ) )+ ( (a14= 'name' a15= ':' (a16= QUOTED_34_34 ) ) )? a17= '}' )
            // ASP.g:3153:2: a0= 'Constraint' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* ( (a11= 'contents' a12= ':' (a13_0= parse_ASP_ConstraintElement ) ) )+ ( (a14= 'name' a15= ':' (a16= QUOTED_34_34 ) ) )? a17= '}'
            {
            a0=(Token)match(input,12,FOLLOW_12_in_parse_ASP_Constraint2495); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createConstraint();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[202]);
            	}

            a1=(Token)match(input,70,FOLLOW_70_in_parse_ASP_Constraint2509); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createConstraint();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[203]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[204]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[205]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[206]);
            	}

            // ASP.g:3184:2: ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==48) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ASP.g:3185:3: (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) )
                    {
                    // ASP.g:3185:3: (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) )
                    // ASP.g:3186:4: a2= 'location' a3= ':' (a4= QUOTED_34_34 )
                    {
                    a2=(Token)match(input,48,FOLLOW_48_in_parse_ASP_Constraint2532); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createConstraint();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_2_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[207]);
                    			}

                    a3=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Constraint2552); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createConstraint();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_2_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[208]);
                    			}

                    // ASP.g:3214:4: (a4= QUOTED_34_34 )
                    // ASP.g:3215:5: a4= QUOTED_34_34
                    {
                    a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_Constraint2578); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[209]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[210]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[211]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[212]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[213]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[214]);
            	}

            // ASP.g:3261:2: ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==31) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ASP.g:3262:3: (a5= 'commentsBefore' a6= ':' (a7= TEXT ) )
            	    {
            	    // ASP.g:3262:3: (a5= 'commentsBefore' a6= ':' (a7= TEXT ) )
            	    // ASP.g:3263:4: a5= 'commentsBefore' a6= ':' (a7= TEXT )
            	    {
            	    a5=(Token)match(input,31,FOLLOW_31_in_parse_ASP_Constraint2633); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createConstraint();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_3_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[215]);
            	    			}

            	    a6=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Constraint2653); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createConstraint();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_3_0_0_1, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[216]);
            	    			}

            	    // ASP.g:3291:4: (a7= TEXT )
            	    // ASP.g:3292:5: a7= TEXT
            	    {
            	    a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Constraint2679); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[217]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[218]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[219]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[220]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[221]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[222]);
            	}

            // ASP.g:3338:2: ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==30) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ASP.g:3339:3: (a8= 'commentsAfter' a9= ':' (a10= TEXT ) )
            	    {
            	    // ASP.g:3339:3: (a8= 'commentsAfter' a9= ':' (a10= TEXT ) )
            	    // ASP.g:3340:4: a8= 'commentsAfter' a9= ':' (a10= TEXT )
            	    {
            	    a8=(Token)match(input,30,FOLLOW_30_in_parse_ASP_Constraint2734); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createConstraint();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_4_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[223]);
            	    			}

            	    a9=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Constraint2754); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createConstraint();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_4_0_0_1, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[224]);
            	    			}

            	    // ASP.g:3368:4: (a10= TEXT )
            	    // ASP.g:3369:5: a10= TEXT
            	    {
            	    a10=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Constraint2780); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[225]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[226]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[227]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[228]);
            	}

            // ASP.g:3413:2: ( (a11= 'contents' a12= ':' (a13_0= parse_ASP_ConstraintElement ) ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==34) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ASP.g:3414:3: (a11= 'contents' a12= ':' (a13_0= parse_ASP_ConstraintElement ) )
            	    {
            	    // ASP.g:3414:3: (a11= 'contents' a12= ':' (a13_0= parse_ASP_ConstraintElement ) )
            	    // ASP.g:3415:4: a11= 'contents' a12= ':' (a13_0= parse_ASP_ConstraintElement )
            	    {
            	    a11=(Token)match(input,34,FOLLOW_34_in_parse_ASP_Constraint2835); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createConstraint();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_5_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[229]);
            	    			}

            	    a12=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Constraint2855); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createConstraint();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_5_0_0_1, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(ASP.ASPPackage.eINSTANCE.getConstraint(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[230]);
            	    				addExpectedElement(ASP.ASPPackage.eINSTANCE.getConstraint(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[231]);
            	    				addExpectedElement(ASP.ASPPackage.eINSTANCE.getConstraint(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[232]);
            	    				addExpectedElement(ASP.ASPPackage.eINSTANCE.getConstraint(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[233]);
            	    				addExpectedElement(ASP.ASPPackage.eINSTANCE.getConstraint(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[234]);
            	    			}

            	    // ASP.g:3447:4: (a13_0= parse_ASP_ConstraintElement )
            	    // ASP.g:3448:5: a13_0= parse_ASP_ConstraintElement
            	    {
            	    pushFollow(FOLLOW_parse_ASP_ConstraintElement_in_parse_ASP_Constraint2881);
            	    a13_0=parse_ASP_ConstraintElement();

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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[235]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[236]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[237]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[238]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[239]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[240]);
            	}

            // ASP.g:3484:2: ( (a14= 'name' a15= ':' (a16= QUOTED_34_34 ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==54) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ASP.g:3485:3: (a14= 'name' a15= ':' (a16= QUOTED_34_34 ) )
                    {
                    // ASP.g:3485:3: (a14= 'name' a15= ':' (a16= QUOTED_34_34 ) )
                    // ASP.g:3486:4: a14= 'name' a15= ':' (a16= QUOTED_34_34 )
                    {
                    a14=(Token)match(input,54,FOLLOW_54_in_parse_ASP_Constraint2931); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createConstraint();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_6_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[241]);
                    			}

                    a15=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Constraint2951); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createConstraint();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_6_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[242]);
                    			}

                    // ASP.g:3514:4: (a16= QUOTED_34_34 )
                    // ASP.g:3515:5: a16= QUOTED_34_34
                    {
                    a16=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_Constraint2977); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[243]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[244]);
            	}

            a17=(Token)match(input,71,FOLLOW_71_in_parse_ASP_Constraint3023); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createConstraint();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_3_0_0_7, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[245]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[246]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, parse_ASP_Constraint_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_Constraint"



    // $ANTLR start "parse_ASP_Not"
    // ASP.g:3574:1: parse_ASP_Not returns [ASP.Not element = null] : a0= 'Not' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* ( (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) ) )? (a14= 'element' a15= ':' (a16_0= parse_ASP_ConstraintElement ) ) a17= '}' ;
    public final ASP.Not parse_ASP_Not() throws RecognitionException {
        ASP.Not element =  null;

        int parse_ASP_Not_StartIndex = input.index();

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
        Token a17=null;
        ASP.ConstraintElement a16_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }

            // ASP.g:3577:2: (a0= 'Not' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* ( (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) ) )? (a14= 'element' a15= ':' (a16_0= parse_ASP_ConstraintElement ) ) a17= '}' )
            // ASP.g:3578:2: a0= 'Not' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* ( (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) ) )? (a14= 'element' a15= ':' (a16_0= parse_ASP_ConstraintElement ) ) a17= '}'
            {
            a0=(Token)match(input,23,FOLLOW_23_in_parse_ASP_Not3052); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createNot();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[247]);
            	}

            a1=(Token)match(input,70,FOLLOW_70_in_parse_ASP_Not3066); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createNot();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[248]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[249]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[250]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[251]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[252]);
            	}

            // ASP.g:3610:2: ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==48) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ASP.g:3611:3: (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) )
                    {
                    // ASP.g:3611:3: (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) )
                    // ASP.g:3612:4: a2= 'location' a3= ':' (a4= QUOTED_34_34 )
                    {
                    a2=(Token)match(input,48,FOLLOW_48_in_parse_ASP_Not3089); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createNot();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_2_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[253]);
                    			}

                    a3=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Not3109); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createNot();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_2_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[254]);
                    			}

                    // ASP.g:3640:4: (a4= QUOTED_34_34 )
                    // ASP.g:3641:5: a4= QUOTED_34_34
                    {
                    a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_Not3135); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[255]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[256]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[257]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[258]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[259]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[260]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[261]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[262]);
            	}

            // ASP.g:3689:2: ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==31) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ASP.g:3690:3: (a5= 'commentsBefore' a6= ':' (a7= TEXT ) )
            	    {
            	    // ASP.g:3690:3: (a5= 'commentsBefore' a6= ':' (a7= TEXT ) )
            	    // ASP.g:3691:4: a5= 'commentsBefore' a6= ':' (a7= TEXT )
            	    {
            	    a5=(Token)match(input,31,FOLLOW_31_in_parse_ASP_Not3190); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createNot();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_3_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[263]);
            	    			}

            	    a6=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Not3210); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createNot();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_3_0_0_1, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[264]);
            	    			}

            	    // ASP.g:3719:4: (a7= TEXT )
            	    // ASP.g:3720:5: a7= TEXT
            	    {
            	    a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Not3236); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[265]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[266]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[267]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[268]);
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
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[269]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[270]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[271]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[272]);
            	}

            // ASP.g:3768:2: ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==30) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ASP.g:3769:3: (a8= 'commentsAfter' a9= ':' (a10= TEXT ) )
            	    {
            	    // ASP.g:3769:3: (a8= 'commentsAfter' a9= ':' (a10= TEXT ) )
            	    // ASP.g:3770:4: a8= 'commentsAfter' a9= ':' (a10= TEXT )
            	    {
            	    a8=(Token)match(input,30,FOLLOW_30_in_parse_ASP_Not3291); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createNot();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_4_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[273]);
            	    			}

            	    a9=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Not3311); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createNot();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_4_0_0_1, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[274]);
            	    			}

            	    // ASP.g:3798:4: (a10= TEXT )
            	    // ASP.g:3799:5: a10= TEXT
            	    {
            	    a10=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Not3337); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[275]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[276]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[277]);
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
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[278]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[279]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[280]);
            	}

            // ASP.g:3845:2: ( (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==54) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ASP.g:3846:3: (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) )
                    {
                    // ASP.g:3846:3: (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) )
                    // ASP.g:3847:4: a11= 'name' a12= ':' (a13= QUOTED_34_34 )
                    {
                    a11=(Token)match(input,54,FOLLOW_54_in_parse_ASP_Not3392); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createNot();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_5_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[281]);
                    			}

                    a12=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Not3412); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createNot();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_5_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[282]);
                    			}

                    // ASP.g:3875:4: (a13= QUOTED_34_34 )
                    // ASP.g:3876:5: a13= QUOTED_34_34
                    {
                    a13=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_Not3438); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[283]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[284]);
            	}

            // ASP.g:3918:2: (a14= 'element' a15= ':' (a16_0= parse_ASP_ConstraintElement ) )
            // ASP.g:3919:3: a14= 'element' a15= ':' (a16_0= parse_ASP_ConstraintElement )
            {
            a14=(Token)match(input,36,FOLLOW_36_in_parse_ASP_Not3488); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = ASP.ASPFactory.eINSTANCE.createNot();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_6_0_0_0, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[285]);
            		}

            a15=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Not3505); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = ASP.ASPFactory.eINSTANCE.createNot();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_6_0_0_1, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getNot(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[286]);
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getNot(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[287]);
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getNot(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[288]);
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getNot(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[289]);
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getNot(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[290]);
            		}

            // ASP.g:3951:3: (a16_0= parse_ASP_ConstraintElement )
            // ASP.g:3952:4: a16_0= parse_ASP_ConstraintElement
            {
            pushFollow(FOLLOW_parse_ASP_ConstraintElement_in_parse_ASP_Not3527);
            a16_0=parse_ASP_ConstraintElement();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[291]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[292]);
            	}

            a17=(Token)match(input,71,FOLLOW_71_in_parse_ASP_Not3557); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createNot();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_4_0_0_7, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[293]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[294]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[295]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[296]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[297]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[298]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, parse_ASP_Not_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_Not"



    // $ANTLR start "parse_ASP_Eq"
    // ASP.g:4004:1: parse_ASP_Eq returns [ASP.Eq element = null] : a0= 'Eq' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* ( (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) ) )? (a14= 'parameterName' a15= ':' (a16= QUOTED_34_34 ) ) (a17= 'right1' a18= ':' (a19= TEXT ) ) (a20= 'left1' a21= ':' (a22= TEXT ) ) a23= '}' ;
    public final ASP.Eq parse_ASP_Eq() throws RecognitionException {
        ASP.Eq element =  null;

        int parse_ASP_Eq_StartIndex = input.index();

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
        Token a21=null;
        Token a22=null;
        Token a23=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }

            // ASP.g:4007:2: (a0= 'Eq' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* ( (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) ) )? (a14= 'parameterName' a15= ':' (a16= QUOTED_34_34 ) ) (a17= 'right1' a18= ':' (a19= TEXT ) ) (a20= 'left1' a21= ':' (a22= TEXT ) ) a23= '}' )
            // ASP.g:4008:2: a0= 'Eq' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* ( (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) ) )? (a14= 'parameterName' a15= ':' (a16= QUOTED_34_34 ) ) (a17= 'right1' a18= ':' (a19= TEXT ) ) (a20= 'left1' a21= ':' (a22= TEXT ) ) a23= '}'
            {
            a0=(Token)match(input,14,FOLLOW_14_in_parse_ASP_Eq3586); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createEq();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[299]);
            	}

            a1=(Token)match(input,70,FOLLOW_70_in_parse_ASP_Eq3600); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createEq();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[300]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[301]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[302]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[303]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[304]);
            	}

            // ASP.g:4040:2: ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==48) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ASP.g:4041:3: (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) )
                    {
                    // ASP.g:4041:3: (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) )
                    // ASP.g:4042:4: a2= 'location' a3= ':' (a4= QUOTED_34_34 )
                    {
                    a2=(Token)match(input,48,FOLLOW_48_in_parse_ASP_Eq3623); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createEq();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_2_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[305]);
                    			}

                    a3=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Eq3643); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createEq();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_2_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[306]);
                    			}

                    // ASP.g:4070:4: (a4= QUOTED_34_34 )
                    // ASP.g:4071:5: a4= QUOTED_34_34
                    {
                    a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_Eq3669); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[307]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[308]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[309]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[310]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[311]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[312]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[313]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[314]);
            	}

            // ASP.g:4119:2: ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==31) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ASP.g:4120:3: (a5= 'commentsBefore' a6= ':' (a7= TEXT ) )
            	    {
            	    // ASP.g:4120:3: (a5= 'commentsBefore' a6= ':' (a7= TEXT ) )
            	    // ASP.g:4121:4: a5= 'commentsBefore' a6= ':' (a7= TEXT )
            	    {
            	    a5=(Token)match(input,31,FOLLOW_31_in_parse_ASP_Eq3724); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createEq();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_3_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[315]);
            	    			}

            	    a6=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Eq3744); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createEq();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_3_0_0_1, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[316]);
            	    			}

            	    // ASP.g:4149:4: (a7= TEXT )
            	    // ASP.g:4150:5: a7= TEXT
            	    {
            	    a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Eq3770); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[317]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[318]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[319]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[320]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[321]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[322]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[323]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[324]);
            	}

            // ASP.g:4198:2: ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==30) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ASP.g:4199:3: (a8= 'commentsAfter' a9= ':' (a10= TEXT ) )
            	    {
            	    // ASP.g:4199:3: (a8= 'commentsAfter' a9= ':' (a10= TEXT ) )
            	    // ASP.g:4200:4: a8= 'commentsAfter' a9= ':' (a10= TEXT )
            	    {
            	    a8=(Token)match(input,30,FOLLOW_30_in_parse_ASP_Eq3825); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createEq();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_4_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[325]);
            	    			}

            	    a9=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Eq3845); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createEq();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_4_0_0_1, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[326]);
            	    			}

            	    // ASP.g:4228:4: (a10= TEXT )
            	    // ASP.g:4229:5: a10= TEXT
            	    {
            	    a10=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Eq3871); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[327]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[328]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[329]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[330]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[331]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[332]);
            	}

            // ASP.g:4275:2: ( (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==54) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ASP.g:4276:3: (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) )
                    {
                    // ASP.g:4276:3: (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) )
                    // ASP.g:4277:4: a11= 'name' a12= ':' (a13= QUOTED_34_34 )
                    {
                    a11=(Token)match(input,54,FOLLOW_54_in_parse_ASP_Eq3926); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createEq();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_5_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[333]);
                    			}

                    a12=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Eq3946); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createEq();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_5_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[334]);
                    			}

                    // ASP.g:4305:4: (a13= QUOTED_34_34 )
                    // ASP.g:4306:5: a13= QUOTED_34_34
                    {
                    a13=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_Eq3972); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[335]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[336]);
            	}

            // ASP.g:4348:2: (a14= 'parameterName' a15= ':' (a16= QUOTED_34_34 ) )
            // ASP.g:4349:3: a14= 'parameterName' a15= ':' (a16= QUOTED_34_34 )
            {
            a14=(Token)match(input,56,FOLLOW_56_in_parse_ASP_Eq4022); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = ASP.ASPFactory.eINSTANCE.createEq();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_6_0_0_0, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[337]);
            		}

            a15=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Eq4039); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = ASP.ASPFactory.eINSTANCE.createEq();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_6_0_0_1, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[338]);
            		}

            // ASP.g:4377:3: (a16= QUOTED_34_34 )
            // ASP.g:4378:4: a16= QUOTED_34_34
            {
            a16=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_Eq4061); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[339]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[340]);
            	}

            // ASP.g:4419:2: (a17= 'right1' a18= ':' (a19= TEXT ) )
            // ASP.g:4420:3: a17= 'right1' a18= ':' (a19= TEXT )
            {
            a17=(Token)match(input,61,FOLLOW_61_in_parse_ASP_Eq4099); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = ASP.ASPFactory.eINSTANCE.createEq();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_7_0_0_0, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[341]);
            		}

            a18=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Eq4116); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = ASP.ASPFactory.eINSTANCE.createEq();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_7_0_0_1, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[342]);
            		}

            // ASP.g:4448:3: (a19= TEXT )
            // ASP.g:4449:4: a19= TEXT
            {
            a19=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Eq4138); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[343]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[344]);
            	}

            // ASP.g:4494:2: (a20= 'left1' a21= ':' (a22= TEXT ) )
            // ASP.g:4495:3: a20= 'left1' a21= ':' (a22= TEXT )
            {
            a20=(Token)match(input,46,FOLLOW_46_in_parse_ASP_Eq4176); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = ASP.ASPFactory.eINSTANCE.createEq();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_8_0_0_0, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a20, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[345]);
            		}

            a21=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Eq4193); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = ASP.ASPFactory.eINSTANCE.createEq();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_8_0_0_1, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a21, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[346]);
            		}

            // ASP.g:4523:3: (a22= TEXT )
            // ASP.g:4524:4: a22= TEXT
            {
            a22=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Eq4215); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[347]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[348]);
            	}

            a23=(Token)match(input,71,FOLLOW_71_in_parse_ASP_Eq4249); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createEq();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_5_0_0_9, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a23, element);
            	}

            if ( state.backtracking==0 ) {
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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, parse_ASP_Eq_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_Eq"



    // $ANTLR start "parse_ASP_EqSimple"
    // ASP.g:4593:1: parse_ASP_EqSimple returns [ASP.EqSimple element = null] : a0= 'EqSimple' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* ( (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) ) )? (a14= 'parameterName' a15= ':' (a16= QUOTED_34_34 ) ) (a17= 'right1' a18= ':' (a19= TEXT ) ) (a20= 'left1' a21= ':' (a22= TEXT ) ) a23= '}' ;
    public final ASP.EqSimple parse_ASP_EqSimple() throws RecognitionException {
        ASP.EqSimple element =  null;

        int parse_ASP_EqSimple_StartIndex = input.index();

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
        Token a21=null;
        Token a22=null;
        Token a23=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }

            // ASP.g:4596:2: (a0= 'EqSimple' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* ( (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) ) )? (a14= 'parameterName' a15= ':' (a16= QUOTED_34_34 ) ) (a17= 'right1' a18= ':' (a19= TEXT ) ) (a20= 'left1' a21= ':' (a22= TEXT ) ) a23= '}' )
            // ASP.g:4597:2: a0= 'EqSimple' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* ( (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) ) )? (a14= 'parameterName' a15= ':' (a16= QUOTED_34_34 ) ) (a17= 'right1' a18= ':' (a19= TEXT ) ) (a20= 'left1' a21= ':' (a22= TEXT ) ) a23= '}'
            {
            a0=(Token)match(input,15,FOLLOW_15_in_parse_ASP_EqSimple4278); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createEqSimple();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[358]);
            	}

            a1=(Token)match(input,70,FOLLOW_70_in_parse_ASP_EqSimple4292); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createEqSimple();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[359]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[360]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[361]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[362]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[363]);
            	}

            // ASP.g:4629:2: ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==48) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ASP.g:4630:3: (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) )
                    {
                    // ASP.g:4630:3: (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) )
                    // ASP.g:4631:4: a2= 'location' a3= ':' (a4= QUOTED_34_34 )
                    {
                    a2=(Token)match(input,48,FOLLOW_48_in_parse_ASP_EqSimple4315); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createEqSimple();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_2_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[364]);
                    			}

                    a3=(Token)match(input,11,FOLLOW_11_in_parse_ASP_EqSimple4335); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createEqSimple();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_2_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[365]);
                    			}

                    // ASP.g:4659:4: (a4= QUOTED_34_34 )
                    // ASP.g:4660:5: a4= QUOTED_34_34
                    {
                    a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_EqSimple4361); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[366]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[367]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[368]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[369]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[370]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[371]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[372]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[373]);
            	}

            // ASP.g:4708:2: ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==31) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ASP.g:4709:3: (a5= 'commentsBefore' a6= ':' (a7= TEXT ) )
            	    {
            	    // ASP.g:4709:3: (a5= 'commentsBefore' a6= ':' (a7= TEXT ) )
            	    // ASP.g:4710:4: a5= 'commentsBefore' a6= ':' (a7= TEXT )
            	    {
            	    a5=(Token)match(input,31,FOLLOW_31_in_parse_ASP_EqSimple4416); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createEqSimple();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_3_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[374]);
            	    			}

            	    a6=(Token)match(input,11,FOLLOW_11_in_parse_ASP_EqSimple4436); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createEqSimple();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_3_0_0_1, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[375]);
            	    			}

            	    // ASP.g:4738:4: (a7= TEXT )
            	    // ASP.g:4739:5: a7= TEXT
            	    {
            	    a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_EqSimple4462); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[376]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[377]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[378]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[379]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[380]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[381]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[382]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[383]);
            	}

            // ASP.g:4787:2: ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==30) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ASP.g:4788:3: (a8= 'commentsAfter' a9= ':' (a10= TEXT ) )
            	    {
            	    // ASP.g:4788:3: (a8= 'commentsAfter' a9= ':' (a10= TEXT ) )
            	    // ASP.g:4789:4: a8= 'commentsAfter' a9= ':' (a10= TEXT )
            	    {
            	    a8=(Token)match(input,30,FOLLOW_30_in_parse_ASP_EqSimple4517); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createEqSimple();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_4_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[384]);
            	    			}

            	    a9=(Token)match(input,11,FOLLOW_11_in_parse_ASP_EqSimple4537); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createEqSimple();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_4_0_0_1, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[385]);
            	    			}

            	    // ASP.g:4817:4: (a10= TEXT )
            	    // ASP.g:4818:5: a10= TEXT
            	    {
            	    a10=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_EqSimple4563); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[386]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[387]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[388]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[389]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[390]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[391]);
            	}

            // ASP.g:4864:2: ( (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==54) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ASP.g:4865:3: (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) )
                    {
                    // ASP.g:4865:3: (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) )
                    // ASP.g:4866:4: a11= 'name' a12= ':' (a13= QUOTED_34_34 )
                    {
                    a11=(Token)match(input,54,FOLLOW_54_in_parse_ASP_EqSimple4618); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createEqSimple();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_5_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[392]);
                    			}

                    a12=(Token)match(input,11,FOLLOW_11_in_parse_ASP_EqSimple4638); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createEqSimple();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_5_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[393]);
                    			}

                    // ASP.g:4894:4: (a13= QUOTED_34_34 )
                    // ASP.g:4895:5: a13= QUOTED_34_34
                    {
                    a13=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_EqSimple4664); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[394]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[395]);
            	}

            // ASP.g:4937:2: (a14= 'parameterName' a15= ':' (a16= QUOTED_34_34 ) )
            // ASP.g:4938:3: a14= 'parameterName' a15= ':' (a16= QUOTED_34_34 )
            {
            a14=(Token)match(input,56,FOLLOW_56_in_parse_ASP_EqSimple4714); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = ASP.ASPFactory.eINSTANCE.createEqSimple();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_6_0_0_0, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[396]);
            		}

            a15=(Token)match(input,11,FOLLOW_11_in_parse_ASP_EqSimple4731); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = ASP.ASPFactory.eINSTANCE.createEqSimple();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_6_0_0_1, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[397]);
            		}

            // ASP.g:4966:3: (a16= QUOTED_34_34 )
            // ASP.g:4967:4: a16= QUOTED_34_34
            {
            a16=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_EqSimple4753); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[398]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[399]);
            	}

            // ASP.g:5008:2: (a17= 'right1' a18= ':' (a19= TEXT ) )
            // ASP.g:5009:3: a17= 'right1' a18= ':' (a19= TEXT )
            {
            a17=(Token)match(input,61,FOLLOW_61_in_parse_ASP_EqSimple4791); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = ASP.ASPFactory.eINSTANCE.createEqSimple();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_7_0_0_0, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[400]);
            		}

            a18=(Token)match(input,11,FOLLOW_11_in_parse_ASP_EqSimple4808); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = ASP.ASPFactory.eINSTANCE.createEqSimple();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_7_0_0_1, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[401]);
            		}

            // ASP.g:5037:3: (a19= TEXT )
            // ASP.g:5038:4: a19= TEXT
            {
            a19=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_EqSimple4830); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[402]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[403]);
            	}

            // ASP.g:5083:2: (a20= 'left1' a21= ':' (a22= TEXT ) )
            // ASP.g:5084:3: a20= 'left1' a21= ':' (a22= TEXT )
            {
            a20=(Token)match(input,46,FOLLOW_46_in_parse_ASP_EqSimple4868); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = ASP.ASPFactory.eINSTANCE.createEqSimple();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_8_0_0_0, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a20, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[404]);
            		}

            a21=(Token)match(input,11,FOLLOW_11_in_parse_ASP_EqSimple4885); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = ASP.ASPFactory.eINSTANCE.createEqSimple();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_8_0_0_1, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a21, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[405]);
            		}

            // ASP.g:5112:3: (a22= TEXT )
            // ASP.g:5113:4: a22= TEXT
            {
            a22=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_EqSimple4907); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[406]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[407]);
            	}

            a23=(Token)match(input,71,FOLLOW_71_in_parse_ASP_EqSimple4941); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createEqSimple();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_6_0_0_9, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a23, element);
            	}

            if ( state.backtracking==0 ) {
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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, parse_ASP_EqSimple_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_EqSimple"



    // $ANTLR start "parse_ASP_NotEq"
    // ASP.g:5182:1: parse_ASP_NotEq returns [ASP.NotEq element = null] : a0= 'NotEq' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* ( (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) ) )? (a14= 'parameterName' a15= ':' (a16= QUOTED_34_34 ) ) (a17= 'right1' a18= ':' (a19= TEXT ) ) (a20= 'left1' a21= ':' (a22= TEXT ) ) a23= '}' ;
    public final ASP.NotEq parse_ASP_NotEq() throws RecognitionException {
        ASP.NotEq element =  null;

        int parse_ASP_NotEq_StartIndex = input.index();

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
        Token a21=null;
        Token a22=null;
        Token a23=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }

            // ASP.g:5185:2: (a0= 'NotEq' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* ( (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) ) )? (a14= 'parameterName' a15= ':' (a16= QUOTED_34_34 ) ) (a17= 'right1' a18= ':' (a19= TEXT ) ) (a20= 'left1' a21= ':' (a22= TEXT ) ) a23= '}' )
            // ASP.g:5186:2: a0= 'NotEq' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* ( (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) ) )? (a14= 'parameterName' a15= ':' (a16= QUOTED_34_34 ) ) (a17= 'right1' a18= ':' (a19= TEXT ) ) (a20= 'left1' a21= ':' (a22= TEXT ) ) a23= '}'
            {
            a0=(Token)match(input,24,FOLLOW_24_in_parse_ASP_NotEq4970); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createNotEq();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[417]);
            	}

            a1=(Token)match(input,70,FOLLOW_70_in_parse_ASP_NotEq4984); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createNotEq();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[418]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[419]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[420]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[421]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[422]);
            	}

            // ASP.g:5218:2: ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==48) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ASP.g:5219:3: (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) )
                    {
                    // ASP.g:5219:3: (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) )
                    // ASP.g:5220:4: a2= 'location' a3= ':' (a4= QUOTED_34_34 )
                    {
                    a2=(Token)match(input,48,FOLLOW_48_in_parse_ASP_NotEq5007); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createNotEq();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_2_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[423]);
                    			}

                    a3=(Token)match(input,11,FOLLOW_11_in_parse_ASP_NotEq5027); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createNotEq();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_2_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[424]);
                    			}

                    // ASP.g:5248:4: (a4= QUOTED_34_34 )
                    // ASP.g:5249:5: a4= QUOTED_34_34
                    {
                    a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_NotEq5053); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[425]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[426]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[427]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[428]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[429]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[430]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[431]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[432]);
            	}

            // ASP.g:5297:2: ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==31) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ASP.g:5298:3: (a5= 'commentsBefore' a6= ':' (a7= TEXT ) )
            	    {
            	    // ASP.g:5298:3: (a5= 'commentsBefore' a6= ':' (a7= TEXT ) )
            	    // ASP.g:5299:4: a5= 'commentsBefore' a6= ':' (a7= TEXT )
            	    {
            	    a5=(Token)match(input,31,FOLLOW_31_in_parse_ASP_NotEq5108); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createNotEq();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_3_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[433]);
            	    			}

            	    a6=(Token)match(input,11,FOLLOW_11_in_parse_ASP_NotEq5128); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createNotEq();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_3_0_0_1, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[434]);
            	    			}

            	    // ASP.g:5327:4: (a7= TEXT )
            	    // ASP.g:5328:5: a7= TEXT
            	    {
            	    a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_NotEq5154); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[435]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[436]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[437]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[438]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[439]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[440]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[441]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[442]);
            	}

            // ASP.g:5376:2: ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==30) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ASP.g:5377:3: (a8= 'commentsAfter' a9= ':' (a10= TEXT ) )
            	    {
            	    // ASP.g:5377:3: (a8= 'commentsAfter' a9= ':' (a10= TEXT ) )
            	    // ASP.g:5378:4: a8= 'commentsAfter' a9= ':' (a10= TEXT )
            	    {
            	    a8=(Token)match(input,30,FOLLOW_30_in_parse_ASP_NotEq5209); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createNotEq();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_4_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[443]);
            	    			}

            	    a9=(Token)match(input,11,FOLLOW_11_in_parse_ASP_NotEq5229); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createNotEq();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_4_0_0_1, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[444]);
            	    			}

            	    // ASP.g:5406:4: (a10= TEXT )
            	    // ASP.g:5407:5: a10= TEXT
            	    {
            	    a10=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_NotEq5255); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[445]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[446]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[447]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[448]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[449]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[450]);
            	}

            // ASP.g:5453:2: ( (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==54) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ASP.g:5454:3: (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) )
                    {
                    // ASP.g:5454:3: (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) )
                    // ASP.g:5455:4: a11= 'name' a12= ':' (a13= QUOTED_34_34 )
                    {
                    a11=(Token)match(input,54,FOLLOW_54_in_parse_ASP_NotEq5310); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createNotEq();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_5_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[451]);
                    			}

                    a12=(Token)match(input,11,FOLLOW_11_in_parse_ASP_NotEq5330); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createNotEq();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_5_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[452]);
                    			}

                    // ASP.g:5483:4: (a13= QUOTED_34_34 )
                    // ASP.g:5484:5: a13= QUOTED_34_34
                    {
                    a13=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_NotEq5356); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[453]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[454]);
            	}

            // ASP.g:5526:2: (a14= 'parameterName' a15= ':' (a16= QUOTED_34_34 ) )
            // ASP.g:5527:3: a14= 'parameterName' a15= ':' (a16= QUOTED_34_34 )
            {
            a14=(Token)match(input,56,FOLLOW_56_in_parse_ASP_NotEq5406); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = ASP.ASPFactory.eINSTANCE.createNotEq();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_6_0_0_0, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[455]);
            		}

            a15=(Token)match(input,11,FOLLOW_11_in_parse_ASP_NotEq5423); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = ASP.ASPFactory.eINSTANCE.createNotEq();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_6_0_0_1, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[456]);
            		}

            // ASP.g:5555:3: (a16= QUOTED_34_34 )
            // ASP.g:5556:4: a16= QUOTED_34_34
            {
            a16=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_NotEq5445); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[457]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[458]);
            	}

            // ASP.g:5597:2: (a17= 'right1' a18= ':' (a19= TEXT ) )
            // ASP.g:5598:3: a17= 'right1' a18= ':' (a19= TEXT )
            {
            a17=(Token)match(input,61,FOLLOW_61_in_parse_ASP_NotEq5483); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = ASP.ASPFactory.eINSTANCE.createNotEq();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_7_0_0_0, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[459]);
            		}

            a18=(Token)match(input,11,FOLLOW_11_in_parse_ASP_NotEq5500); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = ASP.ASPFactory.eINSTANCE.createNotEq();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_7_0_0_1, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[460]);
            		}

            // ASP.g:5626:3: (a19= TEXT )
            // ASP.g:5627:4: a19= TEXT
            {
            a19=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_NotEq5522); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[461]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[462]);
            	}

            // ASP.g:5672:2: (a20= 'left1' a21= ':' (a22= TEXT ) )
            // ASP.g:5673:3: a20= 'left1' a21= ':' (a22= TEXT )
            {
            a20=(Token)match(input,46,FOLLOW_46_in_parse_ASP_NotEq5560); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = ASP.ASPFactory.eINSTANCE.createNotEq();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_8_0_0_0, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a20, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[463]);
            		}

            a21=(Token)match(input,11,FOLLOW_11_in_parse_ASP_NotEq5577); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = ASP.ASPFactory.eINSTANCE.createNotEq();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_8_0_0_1, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a21, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[464]);
            		}

            // ASP.g:5701:3: (a22= TEXT )
            // ASP.g:5702:4: a22= TEXT
            {
            a22=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_NotEq5599); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[465]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[466]);
            	}

            a23=(Token)match(input,71,FOLLOW_71_in_parse_ASP_NotEq5633); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createNotEq();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_7_0_0_9, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a23, element);
            	}

            if ( state.backtracking==0 ) {
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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, parse_ASP_NotEq_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_NotEq"



    // $ANTLR start "parse_ASP_Literal"
    // ASP.g:5771:1: parse_ASP_Literal returns [ASP.Literal element = null] : a0= 'Literal' a1= '{' ( ( (a2= 'isDefinition' ) ) ) ( (a5= 'location' a6= ':' (a7= QUOTED_34_34 ) ) )? ( (a8= 'commentsBefore' a9= ':' (a10= TEXT ) ) )* ( (a11= 'commentsAfter' a12= ':' (a13= TEXT ) ) )* ( (a14= 'name' a15= ':' (a16= QUOTED_34_34 ) ) )? (a17= 'parameterName' a18= ':' (a19= QUOTED_34_34 ) ) a20= '}' ;
    public final ASP.Literal parse_ASP_Literal() throws RecognitionException {
        ASP.Literal element =  null;

        int parse_ASP_Literal_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }

            // ASP.g:5774:2: (a0= 'Literal' a1= '{' ( ( (a2= 'isDefinition' ) ) ) ( (a5= 'location' a6= ':' (a7= QUOTED_34_34 ) ) )? ( (a8= 'commentsBefore' a9= ':' (a10= TEXT ) ) )* ( (a11= 'commentsAfter' a12= ':' (a13= TEXT ) ) )* ( (a14= 'name' a15= ':' (a16= QUOTED_34_34 ) ) )? (a17= 'parameterName' a18= ':' (a19= QUOTED_34_34 ) ) a20= '}' )
            // ASP.g:5775:2: a0= 'Literal' a1= '{' ( ( (a2= 'isDefinition' ) ) ) ( (a5= 'location' a6= ':' (a7= QUOTED_34_34 ) ) )? ( (a8= 'commentsBefore' a9= ':' (a10= TEXT ) ) )* ( (a11= 'commentsAfter' a12= ':' (a13= TEXT ) ) )* ( (a14= 'name' a15= ':' (a16= QUOTED_34_34 ) ) )? (a17= 'parameterName' a18= ':' (a19= QUOTED_34_34 ) ) a20= '}'
            {
            a0=(Token)match(input,17,FOLLOW_17_in_parse_ASP_Literal5662); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[476]);
            	}

            a1=(Token)match(input,70,FOLLOW_70_in_parse_ASP_Literal5676); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[477]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[478]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[479]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[480]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[481]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[482]);
            	}

            // ASP.g:5818:2: ( ( (a2= 'isDefinition' ) ) )
            // ASP.g:5819:3: ( (a2= 'isDefinition' ) )
            {
            // ASP.g:5819:3: ( (a2= 'isDefinition' ) )
            // ASP.g:5820:4: (a2= 'isDefinition' )
            {
            // ASP.g:5820:4: (a2= 'isDefinition' )
            // ASP.g:5821:5: a2= 'isDefinition'
            {
            a2=(Token)match(input,38,FOLLOW_38_in_parse_ASP_Literal5705); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[483]);
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[484]);
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[485]);
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[486]);
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[487]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[488]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[489]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[490]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[491]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[492]);
            	}

            // ASP.g:5860:2: ( (a5= 'location' a6= ':' (a7= QUOTED_34_34 ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==48) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ASP.g:5861:3: (a5= 'location' a6= ':' (a7= QUOTED_34_34 ) )
                    {
                    // ASP.g:5861:3: (a5= 'location' a6= ':' (a7= QUOTED_34_34 ) )
                    // ASP.g:5862:4: a5= 'location' a6= ':' (a7= QUOTED_34_34 )
                    {
                    a5=(Token)match(input,48,FOLLOW_48_in_parse_ASP_Literal5747); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[493]);
                    			}

                    a6=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Literal5767); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[494]);
                    			}

                    // ASP.g:5900:4: (a7= QUOTED_34_34 )
                    // ASP.g:5901:5: a7= QUOTED_34_34
                    {
                    a7=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_Literal5793); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[495]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[496]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[497]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[498]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[499]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[500]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[501]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[502]);
            	}

            // ASP.g:5954:2: ( (a8= 'commentsBefore' a9= ':' (a10= TEXT ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==31) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ASP.g:5955:3: (a8= 'commentsBefore' a9= ':' (a10= TEXT ) )
            	    {
            	    // ASP.g:5955:3: (a8= 'commentsBefore' a9= ':' (a10= TEXT ) )
            	    // ASP.g:5956:4: a8= 'commentsBefore' a9= ':' (a10= TEXT )
            	    {
            	    a8=(Token)match(input,31,FOLLOW_31_in_parse_ASP_Literal5848); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[503]);
            	    			}

            	    a9=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Literal5868); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[504]);
            	    			}

            	    // ASP.g:5994:4: (a10= TEXT )
            	    // ASP.g:5995:5: a10= TEXT
            	    {
            	    a10=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Literal5894); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[505]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[506]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[507]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[508]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[509]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[510]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[511]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[512]);
            	}

            // ASP.g:6048:2: ( (a11= 'commentsAfter' a12= ':' (a13= TEXT ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==30) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ASP.g:6049:3: (a11= 'commentsAfter' a12= ':' (a13= TEXT ) )
            	    {
            	    // ASP.g:6049:3: (a11= 'commentsAfter' a12= ':' (a13= TEXT ) )
            	    // ASP.g:6050:4: a11= 'commentsAfter' a12= ':' (a13= TEXT )
            	    {
            	    a11=(Token)match(input,30,FOLLOW_30_in_parse_ASP_Literal5949); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[513]);
            	    			}

            	    a12=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Literal5969); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[514]);
            	    			}

            	    // ASP.g:6088:4: (a13= TEXT )
            	    // ASP.g:6089:5: a13= TEXT
            	    {
            	    a13=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Literal5995); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[515]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[516]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[517]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[518]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[519]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[520]);
            	}

            // ASP.g:6140:2: ( (a14= 'name' a15= ':' (a16= QUOTED_34_34 ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==54) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ASP.g:6141:3: (a14= 'name' a15= ':' (a16= QUOTED_34_34 ) )
                    {
                    // ASP.g:6141:3: (a14= 'name' a15= ':' (a16= QUOTED_34_34 ) )
                    // ASP.g:6142:4: a14= 'name' a15= ':' (a16= QUOTED_34_34 )
                    {
                    a14=(Token)match(input,54,FOLLOW_54_in_parse_ASP_Literal6050); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[521]);
                    			}

                    a15=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Literal6070); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[522]);
                    			}

                    // ASP.g:6180:4: (a16= QUOTED_34_34 )
                    // ASP.g:6181:5: a16= QUOTED_34_34
                    {
                    a16=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_Literal6096); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[523]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[524]);
            	}

            // ASP.g:6228:2: (a17= 'parameterName' a18= ':' (a19= QUOTED_34_34 ) )
            // ASP.g:6229:3: a17= 'parameterName' a18= ':' (a19= QUOTED_34_34 )
            {
            a17=(Token)match(input,56,FOLLOW_56_in_parse_ASP_Literal6146); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[525]);
            		}

            a18=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Literal6163); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[526]);
            		}

            // ASP.g:6267:3: (a19= QUOTED_34_34 )
            // ASP.g:6268:4: a19= QUOTED_34_34
            {
            a19=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_Literal6185); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[527]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[528]);
            	}

            a20=(Token)match(input,71,FOLLOW_71_in_parse_ASP_Literal6219); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[529]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[530]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[531]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[532]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[533]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[534]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, parse_ASP_Literal_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_Literal"



    // $ANTLR start "parse_ASP_Node"
    // ASP.g:6340:1: parse_ASP_Node returns [ASP.Node element = null] : a0= 'Node' a1= '{' ( ( (a2= 'isNodex' ) ) ) ( ( (a5= 'isTrace' ) ) ) ( (a8= 'location' a9= ':' (a10= QUOTED_34_34 ) ) )? ( (a11= 'commentsBefore' a12= ':' (a13= TEXT ) ) )* ( (a14= 'commentsAfter' a15= ':' (a16= TEXT ) ) )* ( (a17= 'name' a18= ':' (a19= QUOTED_34_34 ) ) )? (a20= 'metamodel' a21= ':' (a22= TEXT ) ) (a23= 'metaClass' a24= ':' (a25= QUOTED_34_34 ) ) (a26= 'nodeId' a27= ':' (a28_0= parse_ASP_FunctionParameter ) ) a29= '}' ;
    public final ASP.Node parse_ASP_Node() throws RecognitionException {
        ASP.Node element =  null;

        int parse_ASP_Node_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a5=null;
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
        Token a21=null;
        Token a22=null;
        Token a23=null;
        Token a24=null;
        Token a25=null;
        Token a26=null;
        Token a27=null;
        Token a29=null;
        ASP.FunctionParameter a28_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }

            // ASP.g:6343:2: (a0= 'Node' a1= '{' ( ( (a2= 'isNodex' ) ) ) ( ( (a5= 'isTrace' ) ) ) ( (a8= 'location' a9= ':' (a10= QUOTED_34_34 ) ) )? ( (a11= 'commentsBefore' a12= ':' (a13= TEXT ) ) )* ( (a14= 'commentsAfter' a15= ':' (a16= TEXT ) ) )* ( (a17= 'name' a18= ':' (a19= QUOTED_34_34 ) ) )? (a20= 'metamodel' a21= ':' (a22= TEXT ) ) (a23= 'metaClass' a24= ':' (a25= QUOTED_34_34 ) ) (a26= 'nodeId' a27= ':' (a28_0= parse_ASP_FunctionParameter ) ) a29= '}' )
            // ASP.g:6344:2: a0= 'Node' a1= '{' ( ( (a2= 'isNodex' ) ) ) ( ( (a5= 'isTrace' ) ) ) ( (a8= 'location' a9= ':' (a10= QUOTED_34_34 ) ) )? ( (a11= 'commentsBefore' a12= ':' (a13= TEXT ) ) )* ( (a14= 'commentsAfter' a15= ':' (a16= TEXT ) ) )* ( (a17= 'name' a18= ':' (a19= QUOTED_34_34 ) ) )? (a20= 'metamodel' a21= ':' (a22= TEXT ) ) (a23= 'metaClass' a24= ':' (a25= QUOTED_34_34 ) ) (a26= 'nodeId' a27= ':' (a28_0= parse_ASP_FunctionParameter ) ) a29= '}'
            {
            a0=(Token)match(input,22,FOLLOW_22_in_parse_ASP_Node6248); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[535]);
            	}

            a1=(Token)match(input,70,FOLLOW_70_in_parse_ASP_Node6262); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[536]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[537]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[538]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[539]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[540]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[541]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[542]);
            	}

            // ASP.g:6398:2: ( ( (a2= 'isNodex' ) ) )
            // ASP.g:6399:3: ( (a2= 'isNodex' ) )
            {
            // ASP.g:6399:3: ( (a2= 'isNodex' ) )
            // ASP.g:6400:4: (a2= 'isNodex' )
            {
            // ASP.g:6400:4: (a2= 'isNodex' )
            // ASP.g:6401:5: a2= 'isNodex'
            {
            a2=(Token)match(input,43,FOLLOW_43_in_parse_ASP_Node6291); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[543]);
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[544]);
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[545]);
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[546]);
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[547]);
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[548]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[549]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[550]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[551]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[552]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[553]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[554]);
            	}

            // ASP.g:6447:2: ( ( (a5= 'isTrace' ) ) )
            // ASP.g:6448:3: ( (a5= 'isTrace' ) )
            {
            // ASP.g:6448:3: ( (a5= 'isTrace' ) )
            // ASP.g:6449:4: (a5= 'isTrace' )
            {
            // ASP.g:6449:4: (a5= 'isTrace' )
            // ASP.g:6450:5: a5= 'isTrace'
            {
            a5=(Token)match(input,45,FOLLOW_45_in_parse_ASP_Node6339); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[555]);
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[556]);
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[557]);
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[558]);
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[559]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[560]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[561]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[562]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[563]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[564]);
            	}

            // ASP.g:6494:2: ( (a8= 'location' a9= ':' (a10= QUOTED_34_34 ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==48) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ASP.g:6495:3: (a8= 'location' a9= ':' (a10= QUOTED_34_34 ) )
                    {
                    // ASP.g:6495:3: (a8= 'location' a9= ':' (a10= QUOTED_34_34 ) )
                    // ASP.g:6496:4: a8= 'location' a9= ':' (a10= QUOTED_34_34 )
                    {
                    a8=(Token)match(input,48,FOLLOW_48_in_parse_ASP_Node6381); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[565]);
                    			}

                    a9=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Node6401); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[566]);
                    			}

                    // ASP.g:6544:4: (a10= QUOTED_34_34 )
                    // ASP.g:6545:5: a10= QUOTED_34_34
                    {
                    a10=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_Node6427); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[567]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[568]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[569]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[570]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[571]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[572]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[573]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[574]);
            	}

            // ASP.g:6603:2: ( (a11= 'commentsBefore' a12= ':' (a13= TEXT ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==31) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ASP.g:6604:3: (a11= 'commentsBefore' a12= ':' (a13= TEXT ) )
            	    {
            	    // ASP.g:6604:3: (a11= 'commentsBefore' a12= ':' (a13= TEXT ) )
            	    // ASP.g:6605:4: a11= 'commentsBefore' a12= ':' (a13= TEXT )
            	    {
            	    a11=(Token)match(input,31,FOLLOW_31_in_parse_ASP_Node6482); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[575]);
            	    			}

            	    a12=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Node6502); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[576]);
            	    			}

            	    // ASP.g:6653:4: (a13= TEXT )
            	    // ASP.g:6654:5: a13= TEXT
            	    {
            	    a13=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Node6528); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[577]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[578]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[579]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[580]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[581]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[582]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[583]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[584]);
            	}

            // ASP.g:6712:2: ( (a14= 'commentsAfter' a15= ':' (a16= TEXT ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==30) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ASP.g:6713:3: (a14= 'commentsAfter' a15= ':' (a16= TEXT ) )
            	    {
            	    // ASP.g:6713:3: (a14= 'commentsAfter' a15= ':' (a16= TEXT ) )
            	    // ASP.g:6714:4: a14= 'commentsAfter' a15= ':' (a16= TEXT )
            	    {
            	    a14=(Token)match(input,30,FOLLOW_30_in_parse_ASP_Node6583); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[585]);
            	    			}

            	    a15=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Node6603); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[586]);
            	    			}

            	    // ASP.g:6762:4: (a16= TEXT )
            	    // ASP.g:6763:5: a16= TEXT
            	    {
            	    a16=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Node6629); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[587]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[588]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[589]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[590]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[591]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[592]);
            	}

            // ASP.g:6819:2: ( (a17= 'name' a18= ':' (a19= QUOTED_34_34 ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==54) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ASP.g:6820:3: (a17= 'name' a18= ':' (a19= QUOTED_34_34 ) )
                    {
                    // ASP.g:6820:3: (a17= 'name' a18= ':' (a19= QUOTED_34_34 ) )
                    // ASP.g:6821:4: a17= 'name' a18= ':' (a19= QUOTED_34_34 )
                    {
                    a17=(Token)match(input,54,FOLLOW_54_in_parse_ASP_Node6684); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[593]);
                    			}

                    a18=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Node6704); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[594]);
                    			}

                    // ASP.g:6869:4: (a19= QUOTED_34_34 )
                    // ASP.g:6870:5: a19= QUOTED_34_34
                    {
                    a19=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_Node6730); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[595]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[596]);
            	}

            // ASP.g:6922:2: (a20= 'metamodel' a21= ':' (a22= TEXT ) )
            // ASP.g:6923:3: a20= 'metamodel' a21= ':' (a22= TEXT )
            {
            a20=(Token)match(input,52,FOLLOW_52_in_parse_ASP_Node6780); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[597]);
            		}

            a21=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Node6797); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[598]);
            		}

            // ASP.g:6971:3: (a22= TEXT )
            // ASP.g:6972:4: a22= TEXT
            {
            a22=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Node6819); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[599]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[600]);
            	}

            // ASP.g:7027:2: (a23= 'metaClass' a24= ':' (a25= QUOTED_34_34 ) )
            // ASP.g:7028:3: a23= 'metaClass' a24= ':' (a25= QUOTED_34_34 )
            {
            a23=(Token)match(input,50,FOLLOW_50_in_parse_ASP_Node6857); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[601]);
            		}

            a24=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Node6874); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[602]);
            		}

            // ASP.g:7076:3: (a25= QUOTED_34_34 )
            // ASP.g:7077:4: a25= QUOTED_34_34
            {
            a25=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_Node6896); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[603]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[604]);
            	}

            // ASP.g:7128:2: (a26= 'nodeId' a27= ':' (a28_0= parse_ASP_FunctionParameter ) )
            // ASP.g:7129:3: a26= 'nodeId' a27= ':' (a28_0= parse_ASP_FunctionParameter )
            {
            a26=(Token)match(input,55,FOLLOW_55_in_parse_ASP_Node6934); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[605]);
            		}

            a27=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Node6951); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getNode(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[606]);
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getNode(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[607]);
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getNode(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[608]);
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getNode(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[609]);
            		}

            // ASP.g:7180:3: (a28_0= parse_ASP_FunctionParameter )
            // ASP.g:7181:4: a28_0= parse_ASP_FunctionParameter
            {
            pushFollow(FOLLOW_parse_ASP_FunctionParameter_in_parse_ASP_Node6973);
            a28_0=parse_ASP_FunctionParameter();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[610]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[611]);
            	}

            a29=(Token)match(input,71,FOLLOW_71_in_parse_ASP_Node7003); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[612]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[613]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[614]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, parse_ASP_Node_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_Node"



    // $ANTLR start "parse_ASP_Prop"
    // ASP.g:7250:1: parse_ASP_Prop returns [ASP.Prop element = null] : a0= 'Prop' a1= '{' ( (a2= 'isPropx' )? ) ( (a5= 'isTrace' )? ) ( (a8= 'location' a9= ':' (a10= QUOTED_34_34 ) ) )? ( (a11= 'commentsBefore' a12= ':' (a13= TEXT ) ) )* ( (a14= 'commentsAfter' a15= ':' (a16= TEXT ) ) )* ( (a17= 'name' a18= ':' (a19= QUOTED_34_34 ) ) )? (a20= 'metamodel' a21= ':' (a22= TEXT ) ) (a23= 'propId' a24= ':' (a25_0= parse_ASP_FunctionParameter ) ) (a26= 'metaClassId' a27= ':' (a28_0= parse_ASP_FunctionParameter ) ) (a29= 'propValue' a30= ':' (a31_0= parse_ASP_FunctionParameter ) ) a32= '}' ;
    public final ASP.Prop parse_ASP_Prop() throws RecognitionException {
        ASP.Prop element =  null;

        int parse_ASP_Prop_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a5=null;
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
        Token a21=null;
        Token a22=null;
        Token a23=null;
        Token a24=null;
        Token a26=null;
        Token a27=null;
        Token a29=null;
        Token a30=null;
        Token a32=null;
        ASP.FunctionParameter a25_0 =null;

        ASP.FunctionParameter a28_0 =null;

        ASP.FunctionParameter a31_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }

            // ASP.g:7253:2: (a0= 'Prop' a1= '{' ( (a2= 'isPropx' )? ) ( (a5= 'isTrace' )? ) ( (a8= 'location' a9= ':' (a10= QUOTED_34_34 ) ) )? ( (a11= 'commentsBefore' a12= ':' (a13= TEXT ) ) )* ( (a14= 'commentsAfter' a15= ':' (a16= TEXT ) ) )* ( (a17= 'name' a18= ':' (a19= QUOTED_34_34 ) ) )? (a20= 'metamodel' a21= ':' (a22= TEXT ) ) (a23= 'propId' a24= ':' (a25_0= parse_ASP_FunctionParameter ) ) (a26= 'metaClassId' a27= ':' (a28_0= parse_ASP_FunctionParameter ) ) (a29= 'propValue' a30= ':' (a31_0= parse_ASP_FunctionParameter ) ) a32= '}' )
            // ASP.g:7254:2: a0= 'Prop' a1= '{' ( (a2= 'isPropx' )? ) ( (a5= 'isTrace' )? ) ( (a8= 'location' a9= ':' (a10= QUOTED_34_34 ) ) )? ( (a11= 'commentsBefore' a12= ':' (a13= TEXT ) ) )* ( (a14= 'commentsAfter' a15= ':' (a16= TEXT ) ) )* ( (a17= 'name' a18= ':' (a19= QUOTED_34_34 ) ) )? (a20= 'metamodel' a21= ':' (a22= TEXT ) ) (a23= 'propId' a24= ':' (a25_0= parse_ASP_FunctionParameter ) ) (a26= 'metaClassId' a27= ':' (a28_0= parse_ASP_FunctionParameter ) ) (a29= 'propValue' a30= ':' (a31_0= parse_ASP_FunctionParameter ) ) a32= '}'
            {
            a0=(Token)match(input,25,FOLLOW_25_in_parse_ASP_Prop7032); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[615]);
            	}

            a1=(Token)match(input,70,FOLLOW_70_in_parse_ASP_Prop7046); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[616]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[617]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[618]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[619]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[620]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[621]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[622]);
            	}

            // ASP.g:7308:2: ( (a2= 'isPropx' )? )
            // ASP.g:7309:3: (a2= 'isPropx' )?
            {
            // ASP.g:7309:3: (a2= 'isPropx' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==44) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ASP.g:7310:4: a2= 'isPropx'
                    {
                    a2=(Token)match(input,44,FOLLOW_44_in_parse_ASP_Prop7069); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[623]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[624]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[625]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[626]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[627]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[628]);
            	}

            // ASP.g:7344:2: ( (a5= 'isTrace' )? )
            // ASP.g:7345:3: (a5= 'isTrace' )?
            {
            // ASP.g:7345:3: (a5= 'isTrace' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==45) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ASP.g:7346:4: a5= 'isTrace'
                    {
                    a5=(Token)match(input,45,FOLLOW_45_in_parse_ASP_Prop7099); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[629]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[630]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[631]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[632]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[633]);
            	}

            // ASP.g:7379:2: ( (a8= 'location' a9= ':' (a10= QUOTED_34_34 ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==48) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ASP.g:7380:3: (a8= 'location' a9= ':' (a10= QUOTED_34_34 ) )
                    {
                    // ASP.g:7380:3: (a8= 'location' a9= ':' (a10= QUOTED_34_34 ) )
                    // ASP.g:7381:4: a8= 'location' a9= ':' (a10= QUOTED_34_34 )
                    {
                    a8=(Token)match(input,48,FOLLOW_48_in_parse_ASP_Prop7129); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[634]);
                    			}

                    a9=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Prop7149); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[635]);
                    			}

                    // ASP.g:7429:4: (a10= QUOTED_34_34 )
                    // ASP.g:7430:5: a10= QUOTED_34_34
                    {
                    a10=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_Prop7175); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[636]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[637]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[638]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[639]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[640]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[641]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[642]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[643]);
            	}

            // ASP.g:7488:2: ( (a11= 'commentsBefore' a12= ':' (a13= TEXT ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==31) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ASP.g:7489:3: (a11= 'commentsBefore' a12= ':' (a13= TEXT ) )
            	    {
            	    // ASP.g:7489:3: (a11= 'commentsBefore' a12= ':' (a13= TEXT ) )
            	    // ASP.g:7490:4: a11= 'commentsBefore' a12= ':' (a13= TEXT )
            	    {
            	    a11=(Token)match(input,31,FOLLOW_31_in_parse_ASP_Prop7230); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[644]);
            	    			}

            	    a12=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Prop7250); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[645]);
            	    			}

            	    // ASP.g:7538:4: (a13= TEXT )
            	    // ASP.g:7539:5: a13= TEXT
            	    {
            	    a13=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Prop7276); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[646]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[647]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[648]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[649]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[650]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[651]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[652]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[653]);
            	}

            // ASP.g:7597:2: ( (a14= 'commentsAfter' a15= ':' (a16= TEXT ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==30) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ASP.g:7598:3: (a14= 'commentsAfter' a15= ':' (a16= TEXT ) )
            	    {
            	    // ASP.g:7598:3: (a14= 'commentsAfter' a15= ':' (a16= TEXT ) )
            	    // ASP.g:7599:4: a14= 'commentsAfter' a15= ':' (a16= TEXT )
            	    {
            	    a14=(Token)match(input,30,FOLLOW_30_in_parse_ASP_Prop7331); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[654]);
            	    			}

            	    a15=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Prop7351); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[655]);
            	    			}

            	    // ASP.g:7647:4: (a16= TEXT )
            	    // ASP.g:7648:5: a16= TEXT
            	    {
            	    a16=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Prop7377); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[656]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[657]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[658]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[659]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[660]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[661]);
            	}

            // ASP.g:7704:2: ( (a17= 'name' a18= ':' (a19= QUOTED_34_34 ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==54) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ASP.g:7705:3: (a17= 'name' a18= ':' (a19= QUOTED_34_34 ) )
                    {
                    // ASP.g:7705:3: (a17= 'name' a18= ':' (a19= QUOTED_34_34 ) )
                    // ASP.g:7706:4: a17= 'name' a18= ':' (a19= QUOTED_34_34 )
                    {
                    a17=(Token)match(input,54,FOLLOW_54_in_parse_ASP_Prop7432); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[662]);
                    			}

                    a18=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Prop7452); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[663]);
                    			}

                    // ASP.g:7754:4: (a19= QUOTED_34_34 )
                    // ASP.g:7755:5: a19= QUOTED_34_34
                    {
                    a19=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_Prop7478); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[664]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[665]);
            	}

            // ASP.g:7807:2: (a20= 'metamodel' a21= ':' (a22= TEXT ) )
            // ASP.g:7808:3: a20= 'metamodel' a21= ':' (a22= TEXT )
            {
            a20=(Token)match(input,52,FOLLOW_52_in_parse_ASP_Prop7528); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[666]);
            		}

            a21=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Prop7545); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[667]);
            		}

            // ASP.g:7856:3: (a22= TEXT )
            // ASP.g:7857:4: a22= TEXT
            {
            a22=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Prop7567); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[668]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[669]);
            	}

            // ASP.g:7912:2: (a23= 'propId' a24= ':' (a25_0= parse_ASP_FunctionParameter ) )
            // ASP.g:7913:3: a23= 'propId' a24= ':' (a25_0= parse_ASP_FunctionParameter )
            {
            a23=(Token)match(input,57,FOLLOW_57_in_parse_ASP_Prop7605); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[670]);
            		}

            a24=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Prop7622); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getProp(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[671]);
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getProp(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[672]);
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getProp(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[673]);
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getProp(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[674]);
            		}

            // ASP.g:7964:3: (a25_0= parse_ASP_FunctionParameter )
            // ASP.g:7965:4: a25_0= parse_ASP_FunctionParameter
            {
            pushFollow(FOLLOW_parse_ASP_FunctionParameter_in_parse_ASP_Prop7644);
            a25_0=parse_ASP_FunctionParameter();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[675]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[676]);
            	}

            // ASP.g:8006:2: (a26= 'metaClassId' a27= ':' (a28_0= parse_ASP_FunctionParameter ) )
            // ASP.g:8007:3: a26= 'metaClassId' a27= ':' (a28_0= parse_ASP_FunctionParameter )
            {
            a26=(Token)match(input,51,FOLLOW_51_in_parse_ASP_Prop7678); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[677]);
            		}

            a27=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Prop7695); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getProp(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[678]);
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getProp(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[679]);
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getProp(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[680]);
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getProp(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[681]);
            		}

            // ASP.g:8058:3: (a28_0= parse_ASP_FunctionParameter )
            // ASP.g:8059:4: a28_0= parse_ASP_FunctionParameter
            {
            pushFollow(FOLLOW_parse_ASP_FunctionParameter_in_parse_ASP_Prop7717);
            a28_0=parse_ASP_FunctionParameter();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[682]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[683]);
            	}

            // ASP.g:8100:2: (a29= 'propValue' a30= ':' (a31_0= parse_ASP_FunctionParameter ) )
            // ASP.g:8101:3: a29= 'propValue' a30= ':' (a31_0= parse_ASP_FunctionParameter )
            {
            a29=(Token)match(input,58,FOLLOW_58_in_parse_ASP_Prop7751); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[684]);
            		}

            a30=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Prop7768); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getProp(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[685]);
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getProp(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[686]);
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getProp(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[687]);
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getProp(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[688]);
            		}

            // ASP.g:8152:3: (a31_0= parse_ASP_FunctionParameter )
            // ASP.g:8153:4: a31_0= parse_ASP_FunctionParameter
            {
            pushFollow(FOLLOW_parse_ASP_FunctionParameter_in_parse_ASP_Prop7790);
            a31_0=parse_ASP_FunctionParameter();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[689]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[690]);
            	}

            a32=(Token)match(input,71,FOLLOW_71_in_parse_ASP_Prop7820); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[691]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[692]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[693]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, parse_ASP_Prop_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_Prop"



    // $ANTLR start "parse_ASP_Edge"
    // ASP.g:8222:1: parse_ASP_Edge returns [ASP.Edge element = null] : a0= 'Edge' a1= '{' ( (a2= 'isEdgex' )? ) ( (a5= 'isTrace' )? ) ( (a8= 'location' a9= ':' (a10= QUOTED_34_34 ) ) )? ( (a11= 'commentsBefore' a12= ':' (a13= TEXT ) ) )* ( (a14= 'commentsAfter' a15= ':' (a16= TEXT ) ) )* ( (a17= 'name' a18= ':' (a19= QUOTED_34_34 ) ) )? (a20= 'metamodel' a21= ':' (a22= TEXT ) ) (a23= 'edgeId' a24= ':' (a25_0= parse_ASP_FunctionParameter ) ) (a26= 'sourceMCId' a27= ':' (a28_0= parse_ASP_FunctionParameter ) ) (a29= 'targetMCId' a30= ':' (a31_0= parse_ASP_FunctionParameter ) ) a32= '}' ;
    public final ASP.Edge parse_ASP_Edge() throws RecognitionException {
        ASP.Edge element =  null;

        int parse_ASP_Edge_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a5=null;
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
        Token a21=null;
        Token a22=null;
        Token a23=null;
        Token a24=null;
        Token a26=null;
        Token a27=null;
        Token a29=null;
        Token a30=null;
        Token a32=null;
        ASP.FunctionParameter a25_0 =null;

        ASP.FunctionParameter a28_0 =null;

        ASP.FunctionParameter a31_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }

            // ASP.g:8225:2: (a0= 'Edge' a1= '{' ( (a2= 'isEdgex' )? ) ( (a5= 'isTrace' )? ) ( (a8= 'location' a9= ':' (a10= QUOTED_34_34 ) ) )? ( (a11= 'commentsBefore' a12= ':' (a13= TEXT ) ) )* ( (a14= 'commentsAfter' a15= ':' (a16= TEXT ) ) )* ( (a17= 'name' a18= ':' (a19= QUOTED_34_34 ) ) )? (a20= 'metamodel' a21= ':' (a22= TEXT ) ) (a23= 'edgeId' a24= ':' (a25_0= parse_ASP_FunctionParameter ) ) (a26= 'sourceMCId' a27= ':' (a28_0= parse_ASP_FunctionParameter ) ) (a29= 'targetMCId' a30= ':' (a31_0= parse_ASP_FunctionParameter ) ) a32= '}' )
            // ASP.g:8226:2: a0= 'Edge' a1= '{' ( (a2= 'isEdgex' )? ) ( (a5= 'isTrace' )? ) ( (a8= 'location' a9= ':' (a10= QUOTED_34_34 ) ) )? ( (a11= 'commentsBefore' a12= ':' (a13= TEXT ) ) )* ( (a14= 'commentsAfter' a15= ':' (a16= TEXT ) ) )* ( (a17= 'name' a18= ':' (a19= QUOTED_34_34 ) ) )? (a20= 'metamodel' a21= ':' (a22= TEXT ) ) (a23= 'edgeId' a24= ':' (a25_0= parse_ASP_FunctionParameter ) ) (a26= 'sourceMCId' a27= ':' (a28_0= parse_ASP_FunctionParameter ) ) (a29= 'targetMCId' a30= ':' (a31_0= parse_ASP_FunctionParameter ) ) a32= '}'
            {
            a0=(Token)match(input,13,FOLLOW_13_in_parse_ASP_Edge7849); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[694]);
            	}

            a1=(Token)match(input,70,FOLLOW_70_in_parse_ASP_Edge7863); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[695]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[696]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[697]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[698]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[699]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[700]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[701]);
            	}

            // ASP.g:8280:2: ( (a2= 'isEdgex' )? )
            // ASP.g:8281:3: (a2= 'isEdgex' )?
            {
            // ASP.g:8281:3: (a2= 'isEdgex' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==39) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ASP.g:8282:4: a2= 'isEdgex'
                    {
                    a2=(Token)match(input,39,FOLLOW_39_in_parse_ASP_Edge7886); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[702]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[703]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[704]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[705]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[706]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[707]);
            	}

            // ASP.g:8316:2: ( (a5= 'isTrace' )? )
            // ASP.g:8317:3: (a5= 'isTrace' )?
            {
            // ASP.g:8317:3: (a5= 'isTrace' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==45) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ASP.g:8318:4: a5= 'isTrace'
                    {
                    a5=(Token)match(input,45,FOLLOW_45_in_parse_ASP_Edge7916); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[708]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[709]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[710]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[711]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[712]);
            	}

            // ASP.g:8351:2: ( (a8= 'location' a9= ':' (a10= QUOTED_34_34 ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==48) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ASP.g:8352:3: (a8= 'location' a9= ':' (a10= QUOTED_34_34 ) )
                    {
                    // ASP.g:8352:3: (a8= 'location' a9= ':' (a10= QUOTED_34_34 ) )
                    // ASP.g:8353:4: a8= 'location' a9= ':' (a10= QUOTED_34_34 )
                    {
                    a8=(Token)match(input,48,FOLLOW_48_in_parse_ASP_Edge7946); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[713]);
                    			}

                    a9=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Edge7966); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[714]);
                    			}

                    // ASP.g:8401:4: (a10= QUOTED_34_34 )
                    // ASP.g:8402:5: a10= QUOTED_34_34
                    {
                    a10=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_Edge7992); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[715]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[716]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[717]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[718]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[719]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[720]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[721]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[722]);
            	}

            // ASP.g:8460:2: ( (a11= 'commentsBefore' a12= ':' (a13= TEXT ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==31) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ASP.g:8461:3: (a11= 'commentsBefore' a12= ':' (a13= TEXT ) )
            	    {
            	    // ASP.g:8461:3: (a11= 'commentsBefore' a12= ':' (a13= TEXT ) )
            	    // ASP.g:8462:4: a11= 'commentsBefore' a12= ':' (a13= TEXT )
            	    {
            	    a11=(Token)match(input,31,FOLLOW_31_in_parse_ASP_Edge8047); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[723]);
            	    			}

            	    a12=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Edge8067); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[724]);
            	    			}

            	    // ASP.g:8510:4: (a13= TEXT )
            	    // ASP.g:8511:5: a13= TEXT
            	    {
            	    a13=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Edge8093); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[725]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[726]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[727]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[728]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[729]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[730]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[731]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[732]);
            	}

            // ASP.g:8569:2: ( (a14= 'commentsAfter' a15= ':' (a16= TEXT ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==30) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ASP.g:8570:3: (a14= 'commentsAfter' a15= ':' (a16= TEXT ) )
            	    {
            	    // ASP.g:8570:3: (a14= 'commentsAfter' a15= ':' (a16= TEXT ) )
            	    // ASP.g:8571:4: a14= 'commentsAfter' a15= ':' (a16= TEXT )
            	    {
            	    a14=(Token)match(input,30,FOLLOW_30_in_parse_ASP_Edge8148); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[733]);
            	    			}

            	    a15=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Edge8168); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[734]);
            	    			}

            	    // ASP.g:8619:4: (a16= TEXT )
            	    // ASP.g:8620:5: a16= TEXT
            	    {
            	    a16=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Edge8194); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[735]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[736]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[737]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[738]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[739]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[740]);
            	}

            // ASP.g:8676:2: ( (a17= 'name' a18= ':' (a19= QUOTED_34_34 ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==54) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ASP.g:8677:3: (a17= 'name' a18= ':' (a19= QUOTED_34_34 ) )
                    {
                    // ASP.g:8677:3: (a17= 'name' a18= ':' (a19= QUOTED_34_34 ) )
                    // ASP.g:8678:4: a17= 'name' a18= ':' (a19= QUOTED_34_34 )
                    {
                    a17=(Token)match(input,54,FOLLOW_54_in_parse_ASP_Edge8249); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[741]);
                    			}

                    a18=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Edge8269); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[742]);
                    			}

                    // ASP.g:8726:4: (a19= QUOTED_34_34 )
                    // ASP.g:8727:5: a19= QUOTED_34_34
                    {
                    a19=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_Edge8295); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[743]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[744]);
            	}

            // ASP.g:8779:2: (a20= 'metamodel' a21= ':' (a22= TEXT ) )
            // ASP.g:8780:3: a20= 'metamodel' a21= ':' (a22= TEXT )
            {
            a20=(Token)match(input,52,FOLLOW_52_in_parse_ASP_Edge8345); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[745]);
            		}

            a21=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Edge8362); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[746]);
            		}

            // ASP.g:8828:3: (a22= TEXT )
            // ASP.g:8829:4: a22= TEXT
            {
            a22=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Edge8384); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[747]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[748]);
            	}

            // ASP.g:8884:2: (a23= 'edgeId' a24= ':' (a25_0= parse_ASP_FunctionParameter ) )
            // ASP.g:8885:3: a23= 'edgeId' a24= ':' (a25_0= parse_ASP_FunctionParameter )
            {
            a23=(Token)match(input,35,FOLLOW_35_in_parse_ASP_Edge8422); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[749]);
            		}

            a24=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Edge8439); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getEdge(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[750]);
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getEdge(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[751]);
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getEdge(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[752]);
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getEdge(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[753]);
            		}

            // ASP.g:8936:3: (a25_0= parse_ASP_FunctionParameter )
            // ASP.g:8937:4: a25_0= parse_ASP_FunctionParameter
            {
            pushFollow(FOLLOW_parse_ASP_FunctionParameter_in_parse_ASP_Edge8461);
            a25_0=parse_ASP_FunctionParameter();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[754]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[755]);
            	}

            // ASP.g:8978:2: (a26= 'sourceMCId' a27= ':' (a28_0= parse_ASP_FunctionParameter ) )
            // ASP.g:8979:3: a26= 'sourceMCId' a27= ':' (a28_0= parse_ASP_FunctionParameter )
            {
            a26=(Token)match(input,64,FOLLOW_64_in_parse_ASP_Edge8495); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[756]);
            		}

            a27=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Edge8512); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getEdge(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[757]);
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getEdge(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[758]);
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getEdge(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[759]);
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getEdge(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[760]);
            		}

            // ASP.g:9030:3: (a28_0= parse_ASP_FunctionParameter )
            // ASP.g:9031:4: a28_0= parse_ASP_FunctionParameter
            {
            pushFollow(FOLLOW_parse_ASP_FunctionParameter_in_parse_ASP_Edge8534);
            a28_0=parse_ASP_FunctionParameter();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[761]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[762]);
            	}

            // ASP.g:9072:2: (a29= 'targetMCId' a30= ':' (a31_0= parse_ASP_FunctionParameter ) )
            // ASP.g:9073:3: a29= 'targetMCId' a30= ':' (a31_0= parse_ASP_FunctionParameter )
            {
            a29=(Token)match(input,66,FOLLOW_66_in_parse_ASP_Edge8568); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[763]);
            		}

            a30=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Edge8585); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getEdge(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[764]);
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getEdge(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[765]);
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getEdge(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[766]);
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getEdge(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[767]);
            		}

            // ASP.g:9124:3: (a31_0= parse_ASP_FunctionParameter )
            // ASP.g:9125:4: a31_0= parse_ASP_FunctionParameter
            {
            pushFollow(FOLLOW_parse_ASP_FunctionParameter_in_parse_ASP_Edge8607);
            a31_0=parse_ASP_FunctionParameter();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[768]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[769]);
            	}

            a32=(Token)match(input,71,FOLLOW_71_in_parse_ASP_Edge8637); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[770]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[771]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[772]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, parse_ASP_Edge_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_Edge"



    // $ANTLR start "parse_ASP_Relation"
    // ASP.g:9194:1: parse_ASP_Relation returns [ASP.Relation element = null] : a0= 'Relation' a1= '{' ( (a2= 'left2right' )? ) ( (a5= 'right2left' )? ) ( (a8= 'location' a9= ':' (a10= QUOTED_34_34 ) ) )? ( (a11= 'commentsBefore' a12= ':' (a13= TEXT ) ) )* ( (a14= 'commentsAfter' a15= ':' (a16= TEXT ) ) )* (a17= 'lpattern' a18= ':' (a19_0= parse_ASP_LeftPattern ) ) (a20= 'rpattern' a21= ':' (a22_0= parse_ASP_RightPattern ) ) (a23= 'relationId' a24= ':' (a25= QUOTED_34_34 ) ) (a26= 'name' a27= ':' (a28= QUOTED_34_34 ) ) ( (a29= 'type' a30= ':' (a31= QUOTED_34_34 ) ) )? a32= '}' ;
    public final ASP.Relation parse_ASP_Relation() throws RecognitionException {
        ASP.Relation element =  null;

        int parse_ASP_Relation_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a5=null;
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
        Token a20=null;
        Token a21=null;
        Token a23=null;
        Token a24=null;
        Token a25=null;
        Token a26=null;
        Token a27=null;
        Token a28=null;
        Token a29=null;
        Token a30=null;
        Token a31=null;
        Token a32=null;
        ASP.LeftPattern a19_0 =null;

        ASP.RightPattern a22_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }

            // ASP.g:9197:2: (a0= 'Relation' a1= '{' ( (a2= 'left2right' )? ) ( (a5= 'right2left' )? ) ( (a8= 'location' a9= ':' (a10= QUOTED_34_34 ) ) )? ( (a11= 'commentsBefore' a12= ':' (a13= TEXT ) ) )* ( (a14= 'commentsAfter' a15= ':' (a16= TEXT ) ) )* (a17= 'lpattern' a18= ':' (a19_0= parse_ASP_LeftPattern ) ) (a20= 'rpattern' a21= ':' (a22_0= parse_ASP_RightPattern ) ) (a23= 'relationId' a24= ':' (a25= QUOTED_34_34 ) ) (a26= 'name' a27= ':' (a28= QUOTED_34_34 ) ) ( (a29= 'type' a30= ':' (a31= QUOTED_34_34 ) ) )? a32= '}' )
            // ASP.g:9198:2: a0= 'Relation' a1= '{' ( (a2= 'left2right' )? ) ( (a5= 'right2left' )? ) ( (a8= 'location' a9= ':' (a10= QUOTED_34_34 ) ) )? ( (a11= 'commentsBefore' a12= ':' (a13= TEXT ) ) )* ( (a14= 'commentsAfter' a15= ':' (a16= TEXT ) ) )* (a17= 'lpattern' a18= ':' (a19_0= parse_ASP_LeftPattern ) ) (a20= 'rpattern' a21= ':' (a22_0= parse_ASP_RightPattern ) ) (a23= 'relationId' a24= ':' (a25= QUOTED_34_34 ) ) (a26= 'name' a27= ':' (a28= QUOTED_34_34 ) ) ( (a29= 'type' a30= ':' (a31= QUOTED_34_34 ) ) )? a32= '}'
            {
            a0=(Token)match(input,26,FOLLOW_26_in_parse_ASP_Relation8666); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[773]);
            	}

            a1=(Token)match(input,70,FOLLOW_70_in_parse_ASP_Relation8680); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[774]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[775]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[776]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[777]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[778]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[779]);
            	}

            // ASP.g:9251:2: ( (a2= 'left2right' )? )
            // ASP.g:9252:3: (a2= 'left2right' )?
            {
            // ASP.g:9252:3: (a2= 'left2right' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==47) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ASP.g:9253:4: a2= 'left2right'
                    {
                    a2=(Token)match(input,47,FOLLOW_47_in_parse_ASP_Relation8703); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[780]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[781]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[782]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[783]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[784]);
            	}

            // ASP.g:9286:2: ( (a5= 'right2left' )? )
            // ASP.g:9287:3: (a5= 'right2left' )?
            {
            // ASP.g:9287:3: (a5= 'right2left' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==62) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ASP.g:9288:4: a5= 'right2left'
                    {
                    a5=(Token)match(input,62,FOLLOW_62_in_parse_ASP_Relation8733); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[785]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[786]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[787]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[788]);
            	}

            // ASP.g:9320:2: ( (a8= 'location' a9= ':' (a10= QUOTED_34_34 ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==48) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ASP.g:9321:3: (a8= 'location' a9= ':' (a10= QUOTED_34_34 ) )
                    {
                    // ASP.g:9321:3: (a8= 'location' a9= ':' (a10= QUOTED_34_34 ) )
                    // ASP.g:9322:4: a8= 'location' a9= ':' (a10= QUOTED_34_34 )
                    {
                    a8=(Token)match(input,48,FOLLOW_48_in_parse_ASP_Relation8763); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[789]);
                    			}

                    a9=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Relation8783); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[790]);
                    			}

                    // ASP.g:9370:4: (a10= QUOTED_34_34 )
                    // ASP.g:9371:5: a10= QUOTED_34_34
                    {
                    a10=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_Relation8809); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[791]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[792]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[793]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[794]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[795]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[796]);
            	}

            // ASP.g:9427:2: ( (a11= 'commentsBefore' a12= ':' (a13= TEXT ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==31) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ASP.g:9428:3: (a11= 'commentsBefore' a12= ':' (a13= TEXT ) )
            	    {
            	    // ASP.g:9428:3: (a11= 'commentsBefore' a12= ':' (a13= TEXT ) )
            	    // ASP.g:9429:4: a11= 'commentsBefore' a12= ':' (a13= TEXT )
            	    {
            	    a11=(Token)match(input,31,FOLLOW_31_in_parse_ASP_Relation8864); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[797]);
            	    			}

            	    a12=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Relation8884); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[798]);
            	    			}

            	    // ASP.g:9477:4: (a13= TEXT )
            	    // ASP.g:9478:5: a13= TEXT
            	    {
            	    a13=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Relation8910); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[799]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[800]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[801]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[802]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[803]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[804]);
            	}

            // ASP.g:9534:2: ( (a14= 'commentsAfter' a15= ':' (a16= TEXT ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==30) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ASP.g:9535:3: (a14= 'commentsAfter' a15= ':' (a16= TEXT ) )
            	    {
            	    // ASP.g:9535:3: (a14= 'commentsAfter' a15= ':' (a16= TEXT ) )
            	    // ASP.g:9536:4: a14= 'commentsAfter' a15= ':' (a16= TEXT )
            	    {
            	    a14=(Token)match(input,30,FOLLOW_30_in_parse_ASP_Relation8965); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[805]);
            	    			}

            	    a15=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Relation8985); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[806]);
            	    			}

            	    // ASP.g:9584:4: (a16= TEXT )
            	    // ASP.g:9585:5: a16= TEXT
            	    {
            	    a16=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Relation9011); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[807]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[808]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[809]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[810]);
            	}

            // ASP.g:9639:2: (a17= 'lpattern' a18= ':' (a19_0= parse_ASP_LeftPattern ) )
            // ASP.g:9640:3: a17= 'lpattern' a18= ':' (a19_0= parse_ASP_LeftPattern )
            {
            a17=(Token)match(input,49,FOLLOW_49_in_parse_ASP_Relation9061); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[811]);
            		}

            a18=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Relation9078); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[812]);
            		}

            // ASP.g:9688:3: (a19_0= parse_ASP_LeftPattern )
            // ASP.g:9689:4: a19_0= parse_ASP_LeftPattern
            {
            pushFollow(FOLLOW_parse_ASP_LeftPattern_in_parse_ASP_Relation9100);
            a19_0=parse_ASP_LeftPattern();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[813]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[814]);
            	}

            // ASP.g:9730:2: (a20= 'rpattern' a21= ':' (a22_0= parse_ASP_RightPattern ) )
            // ASP.g:9731:3: a20= 'rpattern' a21= ':' (a22_0= parse_ASP_RightPattern )
            {
            a20=(Token)match(input,63,FOLLOW_63_in_parse_ASP_Relation9134); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[815]);
            		}

            a21=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Relation9151); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getRelation(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[816]);
            		}

            // ASP.g:9779:3: (a22_0= parse_ASP_RightPattern )
            // ASP.g:9780:4: a22_0= parse_ASP_RightPattern
            {
            pushFollow(FOLLOW_parse_ASP_RightPattern_in_parse_ASP_Relation9173);
            a22_0=parse_ASP_RightPattern();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[817]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[818]);
            	}

            // ASP.g:9821:2: (a23= 'relationId' a24= ':' (a25= QUOTED_34_34 ) )
            // ASP.g:9822:3: a23= 'relationId' a24= ':' (a25= QUOTED_34_34 )
            {
            a23=(Token)match(input,59,FOLLOW_59_in_parse_ASP_Relation9207); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[819]);
            		}

            a24=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Relation9224); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[820]);
            		}

            // ASP.g:9870:3: (a25= QUOTED_34_34 )
            // ASP.g:9871:4: a25= QUOTED_34_34
            {
            a25=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_Relation9246); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[821]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[822]);
            	}

            // ASP.g:9922:2: (a26= 'name' a27= ':' (a28= QUOTED_34_34 ) )
            // ASP.g:9923:3: a26= 'name' a27= ':' (a28= QUOTED_34_34 )
            {
            a26=(Token)match(input,54,FOLLOW_54_in_parse_ASP_Relation9284); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[823]);
            		}

            a27=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Relation9301); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[824]);
            		}

            // ASP.g:9971:3: (a28= QUOTED_34_34 )
            // ASP.g:9972:4: a28= QUOTED_34_34
            {
            a28=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_Relation9323); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[825]);
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[826]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[827]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[828]);
            	}

            // ASP.g:10025:2: ( (a29= 'type' a30= ':' (a31= QUOTED_34_34 ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==68) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ASP.g:10026:3: (a29= 'type' a30= ':' (a31= QUOTED_34_34 ) )
                    {
                    // ASP.g:10026:3: (a29= 'type' a30= ':' (a31= QUOTED_34_34 ) )
                    // ASP.g:10027:4: a29= 'type' a30= ':' (a31= QUOTED_34_34 )
                    {
                    a29=(Token)match(input,68,FOLLOW_68_in_parse_ASP_Relation9366); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[829]);
                    			}

                    a30=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Relation9386); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[830]);
                    			}

                    // ASP.g:10075:4: (a31= QUOTED_34_34 )
                    // ASP.g:10076:5: a31= QUOTED_34_34
                    {
                    a31=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_Relation9412); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[831]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[832]);
            	}

            a32=(Token)match(input,71,FOLLOW_71_in_parse_ASP_Relation9458); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[833]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[834]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[835]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, parse_ASP_Relation_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_Relation"



    // $ANTLR start "parse_ASP_Terminal"
    // ASP.g:10156:1: parse_ASP_Terminal returns [ASP.Terminal element = null] : a0= 'Terminal' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* ( (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) ) )? (a14= 'content' a15= ':' (a16_0= parse_ASP_TerminalElement ) ) a17= '}' ;
    public final ASP.Terminal parse_ASP_Terminal() throws RecognitionException {
        ASP.Terminal element =  null;

        int parse_ASP_Terminal_StartIndex = input.index();

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
        Token a17=null;
        ASP.TerminalElement a16_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return element; }

            // ASP.g:10159:2: (a0= 'Terminal' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* ( (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) ) )? (a14= 'content' a15= ':' (a16_0= parse_ASP_TerminalElement ) ) a17= '}' )
            // ASP.g:10160:2: a0= 'Terminal' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* ( (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) ) )? (a14= 'content' a15= ':' (a16_0= parse_ASP_TerminalElement ) ) a17= '}'
            {
            a0=(Token)match(input,28,FOLLOW_28_in_parse_ASP_Terminal9487); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createTerminal();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_13_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[836]);
            	}

            a1=(Token)match(input,70,FOLLOW_70_in_parse_ASP_Terminal9501); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createTerminal();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_13_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[837]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[838]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[839]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[840]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[841]);
            	}

            // ASP.g:10192:2: ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==48) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ASP.g:10193:3: (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) )
                    {
                    // ASP.g:10193:3: (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) )
                    // ASP.g:10194:4: a2= 'location' a3= ':' (a4= QUOTED_34_34 )
                    {
                    a2=(Token)match(input,48,FOLLOW_48_in_parse_ASP_Terminal9524); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createTerminal();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_13_0_0_2_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[842]);
                    			}

                    a3=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Terminal9544); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createTerminal();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_13_0_0_2_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[843]);
                    			}

                    // ASP.g:10222:4: (a4= QUOTED_34_34 )
                    // ASP.g:10223:5: a4= QUOTED_34_34
                    {
                    a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_Terminal9570); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[844]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[845]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[846]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[847]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[848]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[849]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[850]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[851]);
            	}

            // ASP.g:10271:2: ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==31) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ASP.g:10272:3: (a5= 'commentsBefore' a6= ':' (a7= TEXT ) )
            	    {
            	    // ASP.g:10272:3: (a5= 'commentsBefore' a6= ':' (a7= TEXT ) )
            	    // ASP.g:10273:4: a5= 'commentsBefore' a6= ':' (a7= TEXT )
            	    {
            	    a5=(Token)match(input,31,FOLLOW_31_in_parse_ASP_Terminal9625); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createTerminal();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_13_0_0_3_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[852]);
            	    			}

            	    a6=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Terminal9645); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createTerminal();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_13_0_0_3_0_0_1, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[853]);
            	    			}

            	    // ASP.g:10301:4: (a7= TEXT )
            	    // ASP.g:10302:5: a7= TEXT
            	    {
            	    a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Terminal9671); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[854]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[855]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[856]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[857]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[858]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[859]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[860]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[861]);
            	}

            // ASP.g:10350:2: ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==30) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ASP.g:10351:3: (a8= 'commentsAfter' a9= ':' (a10= TEXT ) )
            	    {
            	    // ASP.g:10351:3: (a8= 'commentsAfter' a9= ':' (a10= TEXT ) )
            	    // ASP.g:10352:4: a8= 'commentsAfter' a9= ':' (a10= TEXT )
            	    {
            	    a8=(Token)match(input,30,FOLLOW_30_in_parse_ASP_Terminal9726); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createTerminal();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_13_0_0_4_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[862]);
            	    			}

            	    a9=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Terminal9746); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createTerminal();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_13_0_0_4_0_0_1, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[863]);
            	    			}

            	    // ASP.g:10380:4: (a10= TEXT )
            	    // ASP.g:10381:5: a10= TEXT
            	    {
            	    a10=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Terminal9772); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[864]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[865]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[866]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[867]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[868]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[869]);
            	}

            // ASP.g:10427:2: ( (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==54) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ASP.g:10428:3: (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) )
                    {
                    // ASP.g:10428:3: (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) )
                    // ASP.g:10429:4: a11= 'name' a12= ':' (a13= QUOTED_34_34 )
                    {
                    a11=(Token)match(input,54,FOLLOW_54_in_parse_ASP_Terminal9827); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createTerminal();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_13_0_0_5_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[870]);
                    			}

                    a12=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Terminal9847); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createTerminal();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_13_0_0_5_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[871]);
                    			}

                    // ASP.g:10457:4: (a13= QUOTED_34_34 )
                    // ASP.g:10458:5: a13= QUOTED_34_34
                    {
                    a13=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_Terminal9873); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[872]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[873]);
            	}

            // ASP.g:10500:2: (a14= 'content' a15= ':' (a16_0= parse_ASP_TerminalElement ) )
            // ASP.g:10501:3: a14= 'content' a15= ':' (a16_0= parse_ASP_TerminalElement )
            {
            a14=(Token)match(input,33,FOLLOW_33_in_parse_ASP_Terminal9923); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = ASP.ASPFactory.eINSTANCE.createTerminal();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_13_0_0_6_0_0_0, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[874]);
            		}

            a15=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Terminal9940); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = ASP.ASPFactory.eINSTANCE.createTerminal();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_13_0_0_6_0_0_1, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getTerminal(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[875]);
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getTerminal(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[876]);
            			addExpectedElement(ASP.ASPPackage.eINSTANCE.getTerminal(), ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[877]);
            		}

            // ASP.g:10531:3: (a16_0= parse_ASP_TerminalElement )
            // ASP.g:10532:4: a16_0= parse_ASP_TerminalElement
            {
            pushFollow(FOLLOW_parse_ASP_TerminalElement_in_parse_ASP_Terminal9962);
            a16_0=parse_ASP_TerminalElement();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[878]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[879]);
            	}

            a17=(Token)match(input,71,FOLLOW_71_in_parse_ASP_Terminal9992); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createTerminal();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_13_0_0_7, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[880]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[881]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[882]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[883]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[884]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[885]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, parse_ASP_Terminal_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_Terminal"



    // $ANTLR start "parse_ASP_Metamodel"
    // ASP.g:10584:1: parse_ASP_Metamodel returns [ASP.Metamodel element = null] : a0= 'Metamodel' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* ( (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) ) )? a14= '}' ;
    public final ASP.Metamodel parse_ASP_Metamodel() throws RecognitionException {
        ASP.Metamodel element =  null;

        int parse_ASP_Metamodel_StartIndex = input.index();

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



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return element; }

            // ASP.g:10587:2: (a0= 'Metamodel' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* ( (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) ) )? a14= '}' )
            // ASP.g:10588:2: a0= 'Metamodel' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* ( (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) ) )? a14= '}'
            {
            a0=(Token)match(input,19,FOLLOW_19_in_parse_ASP_Metamodel10021); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createMetamodel();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_14_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[886]);
            	}

            a1=(Token)match(input,70,FOLLOW_70_in_parse_ASP_Metamodel10035); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createMetamodel();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_14_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[887]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[888]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[889]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[890]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[891]);
            	}

            // ASP.g:10620:2: ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==48) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ASP.g:10621:3: (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) )
                    {
                    // ASP.g:10621:3: (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) )
                    // ASP.g:10622:4: a2= 'location' a3= ':' (a4= QUOTED_34_34 )
                    {
                    a2=(Token)match(input,48,FOLLOW_48_in_parse_ASP_Metamodel10058); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createMetamodel();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_14_0_0_2_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[892]);
                    			}

                    a3=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Metamodel10078); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createMetamodel();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_14_0_0_2_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[893]);
                    			}

                    // ASP.g:10650:4: (a4= QUOTED_34_34 )
                    // ASP.g:10651:5: a4= QUOTED_34_34
                    {
                    a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_Metamodel10104); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[894]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[895]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[896]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[897]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[898]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[899]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[900]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[901]);
            	}

            // ASP.g:10699:2: ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==31) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ASP.g:10700:3: (a5= 'commentsBefore' a6= ':' (a7= TEXT ) )
            	    {
            	    // ASP.g:10700:3: (a5= 'commentsBefore' a6= ':' (a7= TEXT ) )
            	    // ASP.g:10701:4: a5= 'commentsBefore' a6= ':' (a7= TEXT )
            	    {
            	    a5=(Token)match(input,31,FOLLOW_31_in_parse_ASP_Metamodel10159); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createMetamodel();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_14_0_0_3_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[902]);
            	    			}

            	    a6=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Metamodel10179); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createMetamodel();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_14_0_0_3_0_0_1, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[903]);
            	    			}

            	    // ASP.g:10729:4: (a7= TEXT )
            	    // ASP.g:10730:5: a7= TEXT
            	    {
            	    a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Metamodel10205); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[904]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[905]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[906]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[907]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[908]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[909]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[910]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[911]);
            	}

            // ASP.g:10778:2: ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==30) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ASP.g:10779:3: (a8= 'commentsAfter' a9= ':' (a10= TEXT ) )
            	    {
            	    // ASP.g:10779:3: (a8= 'commentsAfter' a9= ':' (a10= TEXT ) )
            	    // ASP.g:10780:4: a8= 'commentsAfter' a9= ':' (a10= TEXT )
            	    {
            	    a8=(Token)match(input,30,FOLLOW_30_in_parse_ASP_Metamodel10260); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createMetamodel();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_14_0_0_4_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[912]);
            	    			}

            	    a9=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Metamodel10280); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createMetamodel();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_14_0_0_4_0_0_1, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[913]);
            	    			}

            	    // ASP.g:10808:4: (a10= TEXT )
            	    // ASP.g:10809:5: a10= TEXT
            	    {
            	    a10=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Metamodel10306); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[914]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[915]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[916]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[917]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[918]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[919]);
            	}

            // ASP.g:10855:2: ( (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==54) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ASP.g:10856:3: (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) )
                    {
                    // ASP.g:10856:3: (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) )
                    // ASP.g:10857:4: a11= 'name' a12= ':' (a13= QUOTED_34_34 )
                    {
                    a11=(Token)match(input,54,FOLLOW_54_in_parse_ASP_Metamodel10361); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createMetamodel();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_14_0_0_5_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[920]);
                    			}

                    a12=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Metamodel10381); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createMetamodel();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_14_0_0_5_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[921]);
                    			}

                    // ASP.g:10885:4: (a13= QUOTED_34_34 )
                    // ASP.g:10886:5: a13= QUOTED_34_34
                    {
                    a13=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_Metamodel10407); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[922]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[923]);
            	}

            a14=(Token)match(input,71,FOLLOW_71_in_parse_ASP_Metamodel10453); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createMetamodel();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_14_0_0_6, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[924]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[925]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[926]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, parse_ASP_Metamodel_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_Metamodel"



    // $ANTLR start "parse_ASP_Metanode"
    // ASP.g:10946:1: parse_ASP_Metanode returns [ASP.Metanode element = null] : a0= 'Metanode' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* ( (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) ) )? (a14= 'metamodel' a15= ':' (a16= TEXT ) ) a17= '}' ;
    public final ASP.Metanode parse_ASP_Metanode() throws RecognitionException {
        ASP.Metanode element =  null;

        int parse_ASP_Metanode_StartIndex = input.index();

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



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return element; }

            // ASP.g:10949:2: (a0= 'Metanode' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* ( (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) ) )? (a14= 'metamodel' a15= ':' (a16= TEXT ) ) a17= '}' )
            // ASP.g:10950:2: a0= 'Metanode' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* ( (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) ) )? (a14= 'metamodel' a15= ':' (a16= TEXT ) ) a17= '}'
            {
            a0=(Token)match(input,20,FOLLOW_20_in_parse_ASP_Metanode10482); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createMetanode();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_15_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[927]);
            	}

            a1=(Token)match(input,70,FOLLOW_70_in_parse_ASP_Metanode10496); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createMetanode();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_15_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[928]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[929]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[930]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[931]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[932]);
            	}

            // ASP.g:10982:2: ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==48) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ASP.g:10983:3: (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) )
                    {
                    // ASP.g:10983:3: (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) )
                    // ASP.g:10984:4: a2= 'location' a3= ':' (a4= QUOTED_34_34 )
                    {
                    a2=(Token)match(input,48,FOLLOW_48_in_parse_ASP_Metanode10519); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createMetanode();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_15_0_0_2_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[933]);
                    			}

                    a3=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Metanode10539); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createMetanode();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_15_0_0_2_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[934]);
                    			}

                    // ASP.g:11012:4: (a4= QUOTED_34_34 )
                    // ASP.g:11013:5: a4= QUOTED_34_34
                    {
                    a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_Metanode10565); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[935]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[936]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[937]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[938]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[939]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[940]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[941]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[942]);
            	}

            // ASP.g:11061:2: ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==31) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // ASP.g:11062:3: (a5= 'commentsBefore' a6= ':' (a7= TEXT ) )
            	    {
            	    // ASP.g:11062:3: (a5= 'commentsBefore' a6= ':' (a7= TEXT ) )
            	    // ASP.g:11063:4: a5= 'commentsBefore' a6= ':' (a7= TEXT )
            	    {
            	    a5=(Token)match(input,31,FOLLOW_31_in_parse_ASP_Metanode10620); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createMetanode();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_15_0_0_3_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[943]);
            	    			}

            	    a6=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Metanode10640); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createMetanode();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_15_0_0_3_0_0_1, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[944]);
            	    			}

            	    // ASP.g:11091:4: (a7= TEXT )
            	    // ASP.g:11092:5: a7= TEXT
            	    {
            	    a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Metanode10666); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[945]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[946]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[947]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[948]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[949]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[950]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[951]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[952]);
            	}

            // ASP.g:11140:2: ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==30) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // ASP.g:11141:3: (a8= 'commentsAfter' a9= ':' (a10= TEXT ) )
            	    {
            	    // ASP.g:11141:3: (a8= 'commentsAfter' a9= ':' (a10= TEXT ) )
            	    // ASP.g:11142:4: a8= 'commentsAfter' a9= ':' (a10= TEXT )
            	    {
            	    a8=(Token)match(input,30,FOLLOW_30_in_parse_ASP_Metanode10721); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createMetanode();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_15_0_0_4_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[953]);
            	    			}

            	    a9=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Metanode10741); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createMetanode();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_15_0_0_4_0_0_1, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[954]);
            	    			}

            	    // ASP.g:11170:4: (a10= TEXT )
            	    // ASP.g:11171:5: a10= TEXT
            	    {
            	    a10=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Metanode10767); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[955]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[956]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[957]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[958]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[959]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[960]);
            	}

            // ASP.g:11217:2: ( (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==54) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ASP.g:11218:3: (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) )
                    {
                    // ASP.g:11218:3: (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) )
                    // ASP.g:11219:4: a11= 'name' a12= ':' (a13= QUOTED_34_34 )
                    {
                    a11=(Token)match(input,54,FOLLOW_54_in_parse_ASP_Metanode10822); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createMetanode();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_15_0_0_5_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[961]);
                    			}

                    a12=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Metanode10842); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createMetanode();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_15_0_0_5_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[962]);
                    			}

                    // ASP.g:11247:4: (a13= QUOTED_34_34 )
                    // ASP.g:11248:5: a13= QUOTED_34_34
                    {
                    a13=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_Metanode10868); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[963]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[964]);
            	}

            // ASP.g:11290:2: (a14= 'metamodel' a15= ':' (a16= TEXT ) )
            // ASP.g:11291:3: a14= 'metamodel' a15= ':' (a16= TEXT )
            {
            a14=(Token)match(input,52,FOLLOW_52_in_parse_ASP_Metanode10918); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = ASP.ASPFactory.eINSTANCE.createMetanode();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_15_0_0_6_0_0_0, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[965]);
            		}

            a15=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Metanode10935); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = ASP.ASPFactory.eINSTANCE.createMetanode();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_15_0_0_6_0_0_1, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[966]);
            		}

            // ASP.g:11319:3: (a16= TEXT )
            // ASP.g:11320:4: a16= TEXT
            {
            a16=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Metanode10957); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[967]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[968]);
            	}

            a17=(Token)match(input,71,FOLLOW_71_in_parse_ASP_Metanode10991); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createMetanode();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_15_0_0_7, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[969]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[970]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[971]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[972]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, parse_ASP_Metanode_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_Metanode"



    // $ANTLR start "parse_ASP_Metaprop"
    // ASP.g:11384:1: parse_ASP_Metaprop returns [ASP.Metaprop element = null] : a0= 'Metaprop' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* ( (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) ) )? (a14= 'metamodel' a15= ':' (a16= TEXT ) ) (a17= 'metaClass' a18= ':' (a19= QUOTED_34_34 ) ) a20= '}' ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return element; }

            // ASP.g:11387:2: (a0= 'Metaprop' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* ( (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) ) )? (a14= 'metamodel' a15= ':' (a16= TEXT ) ) (a17= 'metaClass' a18= ':' (a19= QUOTED_34_34 ) ) a20= '}' )
            // ASP.g:11388:2: a0= 'Metaprop' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* ( (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) ) )? (a14= 'metamodel' a15= ':' (a16= TEXT ) ) (a17= 'metaClass' a18= ':' (a19= QUOTED_34_34 ) ) a20= '}'
            {
            a0=(Token)match(input,21,FOLLOW_21_in_parse_ASP_Metaprop11020); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createMetaprop();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_16_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[973]);
            	}

            a1=(Token)match(input,70,FOLLOW_70_in_parse_ASP_Metaprop11034); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createMetaprop();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_16_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[974]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[975]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[976]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[977]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[978]);
            	}

            // ASP.g:11420:2: ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==48) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ASP.g:11421:3: (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) )
                    {
                    // ASP.g:11421:3: (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) )
                    // ASP.g:11422:4: a2= 'location' a3= ':' (a4= QUOTED_34_34 )
                    {
                    a2=(Token)match(input,48,FOLLOW_48_in_parse_ASP_Metaprop11057); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createMetaprop();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_16_0_0_2_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[979]);
                    			}

                    a3=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Metaprop11077); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createMetaprop();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_16_0_0_2_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[980]);
                    			}

                    // ASP.g:11450:4: (a4= QUOTED_34_34 )
                    // ASP.g:11451:5: a4= QUOTED_34_34
                    {
                    a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_Metaprop11103); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[981]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[982]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[983]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[984]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[985]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[986]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[987]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[988]);
            	}

            // ASP.g:11499:2: ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==31) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // ASP.g:11500:3: (a5= 'commentsBefore' a6= ':' (a7= TEXT ) )
            	    {
            	    // ASP.g:11500:3: (a5= 'commentsBefore' a6= ':' (a7= TEXT ) )
            	    // ASP.g:11501:4: a5= 'commentsBefore' a6= ':' (a7= TEXT )
            	    {
            	    a5=(Token)match(input,31,FOLLOW_31_in_parse_ASP_Metaprop11158); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createMetaprop();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_16_0_0_3_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[989]);
            	    			}

            	    a6=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Metaprop11178); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createMetaprop();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_16_0_0_3_0_0_1, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[990]);
            	    			}

            	    // ASP.g:11529:4: (a7= TEXT )
            	    // ASP.g:11530:5: a7= TEXT
            	    {
            	    a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Metaprop11204); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[991]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[992]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[993]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[994]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[995]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[996]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[997]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[998]);
            	}

            // ASP.g:11578:2: ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==30) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // ASP.g:11579:3: (a8= 'commentsAfter' a9= ':' (a10= TEXT ) )
            	    {
            	    // ASP.g:11579:3: (a8= 'commentsAfter' a9= ':' (a10= TEXT ) )
            	    // ASP.g:11580:4: a8= 'commentsAfter' a9= ':' (a10= TEXT )
            	    {
            	    a8=(Token)match(input,30,FOLLOW_30_in_parse_ASP_Metaprop11259); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createMetaprop();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_16_0_0_4_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[999]);
            	    			}

            	    a9=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Metaprop11279); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createMetaprop();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_16_0_0_4_0_0_1, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1000]);
            	    			}

            	    // ASP.g:11608:4: (a10= TEXT )
            	    // ASP.g:11609:5: a10= TEXT
            	    {
            	    a10=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Metaprop11305); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1001]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1002]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1003]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1004]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1005]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1006]);
            	}

            // ASP.g:11655:2: ( (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==54) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ASP.g:11656:3: (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) )
                    {
                    // ASP.g:11656:3: (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) )
                    // ASP.g:11657:4: a11= 'name' a12= ':' (a13= QUOTED_34_34 )
                    {
                    a11=(Token)match(input,54,FOLLOW_54_in_parse_ASP_Metaprop11360); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createMetaprop();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_16_0_0_5_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1007]);
                    			}

                    a12=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Metaprop11380); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createMetaprop();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_16_0_0_5_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1008]);
                    			}

                    // ASP.g:11685:4: (a13= QUOTED_34_34 )
                    // ASP.g:11686:5: a13= QUOTED_34_34
                    {
                    a13=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_Metaprop11406); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1009]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1010]);
            	}

            // ASP.g:11728:2: (a14= 'metamodel' a15= ':' (a16= TEXT ) )
            // ASP.g:11729:3: a14= 'metamodel' a15= ':' (a16= TEXT )
            {
            a14=(Token)match(input,52,FOLLOW_52_in_parse_ASP_Metaprop11456); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = ASP.ASPFactory.eINSTANCE.createMetaprop();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_16_0_0_6_0_0_0, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1011]);
            		}

            a15=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Metaprop11473); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = ASP.ASPFactory.eINSTANCE.createMetaprop();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_16_0_0_6_0_0_1, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1012]);
            		}

            // ASP.g:11757:3: (a16= TEXT )
            // ASP.g:11758:4: a16= TEXT
            {
            a16=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Metaprop11495); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1013]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1014]);
            	}

            // ASP.g:11803:2: (a17= 'metaClass' a18= ':' (a19= QUOTED_34_34 ) )
            // ASP.g:11804:3: a17= 'metaClass' a18= ':' (a19= QUOTED_34_34 )
            {
            a17=(Token)match(input,50,FOLLOW_50_in_parse_ASP_Metaprop11533); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = ASP.ASPFactory.eINSTANCE.createMetaprop();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_16_0_0_7_0_0_0, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1015]);
            		}

            a18=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Metaprop11550); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = ASP.ASPFactory.eINSTANCE.createMetaprop();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_16_0_0_7_0_0_1, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1016]);
            		}

            // ASP.g:11832:3: (a19= QUOTED_34_34 )
            // ASP.g:11833:4: a19= QUOTED_34_34
            {
            a19=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_Metaprop11572); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1017]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1018]);
            	}

            a20=(Token)match(input,71,FOLLOW_71_in_parse_ASP_Metaprop11606); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createMetaprop();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_16_0_0_8, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a20, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1019]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1020]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1021]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1022]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 18, parse_ASP_Metaprop_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_Metaprop"



    // $ANTLR start "parse_ASP_Metaedge"
    // ASP.g:11893:1: parse_ASP_Metaedge returns [ASP.Metaedge element = null] : a0= 'Metaedge' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* ( (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) ) )? (a14= 'metamodel' a15= ':' (a16= TEXT ) ) (a17= 'sourceMetaClass' a18= ':' (a19= QUOTED_34_34 ) ) (a20= 'targetMetaClass' a21= ':' (a22= QUOTED_34_34 ) ) a23= '}' ;
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
        Token a21=null;
        Token a22=null;
        Token a23=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return element; }

            // ASP.g:11896:2: (a0= 'Metaedge' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* ( (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) ) )? (a14= 'metamodel' a15= ':' (a16= TEXT ) ) (a17= 'sourceMetaClass' a18= ':' (a19= QUOTED_34_34 ) ) (a20= 'targetMetaClass' a21= ':' (a22= QUOTED_34_34 ) ) a23= '}' )
            // ASP.g:11897:2: a0= 'Metaedge' a1= '{' ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )? ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )* ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )* ( (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) ) )? (a14= 'metamodel' a15= ':' (a16= TEXT ) ) (a17= 'sourceMetaClass' a18= ':' (a19= QUOTED_34_34 ) ) (a20= 'targetMetaClass' a21= ':' (a22= QUOTED_34_34 ) ) a23= '}'
            {
            a0=(Token)match(input,18,FOLLOW_18_in_parse_ASP_Metaedge11635); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createMetaedge();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1023]);
            	}

            a1=(Token)match(input,70,FOLLOW_70_in_parse_ASP_Metaedge11649); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createMetaedge();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1024]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1025]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1026]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1027]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1028]);
            	}

            // ASP.g:11929:2: ( (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==48) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ASP.g:11930:3: (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) )
                    {
                    // ASP.g:11930:3: (a2= 'location' a3= ':' (a4= QUOTED_34_34 ) )
                    // ASP.g:11931:4: a2= 'location' a3= ':' (a4= QUOTED_34_34 )
                    {
                    a2=(Token)match(input,48,FOLLOW_48_in_parse_ASP_Metaedge11672); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createMetaedge();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_2_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1029]);
                    			}

                    a3=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Metaedge11692); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createMetaedge();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_2_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1030]);
                    			}

                    // ASP.g:11959:4: (a4= QUOTED_34_34 )
                    // ASP.g:11960:5: a4= QUOTED_34_34
                    {
                    a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_Metaedge11718); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1031]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1032]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1033]);
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1034]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1035]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1036]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1037]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1038]);
            	}

            // ASP.g:12008:2: ( (a5= 'commentsBefore' a6= ':' (a7= TEXT ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==31) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // ASP.g:12009:3: (a5= 'commentsBefore' a6= ':' (a7= TEXT ) )
            	    {
            	    // ASP.g:12009:3: (a5= 'commentsBefore' a6= ':' (a7= TEXT ) )
            	    // ASP.g:12010:4: a5= 'commentsBefore' a6= ':' (a7= TEXT )
            	    {
            	    a5=(Token)match(input,31,FOLLOW_31_in_parse_ASP_Metaedge11773); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createMetaedge();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_3_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1039]);
            	    			}

            	    a6=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Metaedge11793); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createMetaedge();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_3_0_0_1, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1040]);
            	    			}

            	    // ASP.g:12038:4: (a7= TEXT )
            	    // ASP.g:12039:5: a7= TEXT
            	    {
            	    a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Metaedge11819); if (state.failed) return element;

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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1041]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1042]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1043]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1044]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1045]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1046]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1047]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1048]);
            	}

            // ASP.g:12087:2: ( (a8= 'commentsAfter' a9= ':' (a10= TEXT ) ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==30) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // ASP.g:12088:3: (a8= 'commentsAfter' a9= ':' (a10= TEXT ) )
            	    {
            	    // ASP.g:12088:3: (a8= 'commentsAfter' a9= ':' (a10= TEXT ) )
            	    // ASP.g:12089:4: a8= 'commentsAfter' a9= ':' (a10= TEXT )
            	    {
            	    a8=(Token)match(input,30,FOLLOW_30_in_parse_ASP_Metaedge11874); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createMetaedge();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_4_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1049]);
            	    			}

            	    a9=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Metaedge11894); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ASP.ASPFactory.eINSTANCE.createMetaedge();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_4_0_0_1, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1050]);
            	    			}

            	    // ASP.g:12117:4: (a10= TEXT )
            	    // ASP.g:12118:5: a10= TEXT
            	    {
            	    a10=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Metaedge11920); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1051]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1052]);
            	    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1053]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1054]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1055]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1056]);
            	}

            // ASP.g:12164:2: ( (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==54) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ASP.g:12165:3: (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) )
                    {
                    // ASP.g:12165:3: (a11= 'name' a12= ':' (a13= QUOTED_34_34 ) )
                    // ASP.g:12166:4: a11= 'name' a12= ':' (a13= QUOTED_34_34 )
                    {
                    a11=(Token)match(input,54,FOLLOW_54_in_parse_ASP_Metaedge11975); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createMetaedge();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_5_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1057]);
                    			}

                    a12=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Metaedge11995); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = ASP.ASPFactory.eINSTANCE.createMetaedge();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_5_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1058]);
                    			}

                    // ASP.g:12194:4: (a13= QUOTED_34_34 )
                    // ASP.g:12195:5: a13= QUOTED_34_34
                    {
                    a13=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_Metaedge12021); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1059]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1060]);
            	}

            // ASP.g:12237:2: (a14= 'metamodel' a15= ':' (a16= TEXT ) )
            // ASP.g:12238:3: a14= 'metamodel' a15= ':' (a16= TEXT )
            {
            a14=(Token)match(input,52,FOLLOW_52_in_parse_ASP_Metaedge12071); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = ASP.ASPFactory.eINSTANCE.createMetaedge();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_6_0_0_0, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1061]);
            		}

            a15=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Metaedge12088); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = ASP.ASPFactory.eINSTANCE.createMetaedge();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_6_0_0_1, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1062]);
            		}

            // ASP.g:12266:3: (a16= TEXT )
            // ASP.g:12267:4: a16= TEXT
            {
            a16=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ASP_Metaedge12110); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1063]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1064]);
            	}

            // ASP.g:12312:2: (a17= 'sourceMetaClass' a18= ':' (a19= QUOTED_34_34 ) )
            // ASP.g:12313:3: a17= 'sourceMetaClass' a18= ':' (a19= QUOTED_34_34 )
            {
            a17=(Token)match(input,65,FOLLOW_65_in_parse_ASP_Metaedge12148); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = ASP.ASPFactory.eINSTANCE.createMetaedge();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_7_0_0_0, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1065]);
            		}

            a18=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Metaedge12165); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = ASP.ASPFactory.eINSTANCE.createMetaedge();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_7_0_0_1, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1066]);
            		}

            // ASP.g:12341:3: (a19= QUOTED_34_34 )
            // ASP.g:12342:4: a19= QUOTED_34_34
            {
            a19=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_Metaedge12187); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1067]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1068]);
            	}

            // ASP.g:12383:2: (a20= 'targetMetaClass' a21= ':' (a22= QUOTED_34_34 ) )
            // ASP.g:12384:3: a20= 'targetMetaClass' a21= ':' (a22= QUOTED_34_34 )
            {
            a20=(Token)match(input,67,FOLLOW_67_in_parse_ASP_Metaedge12225); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = ASP.ASPFactory.eINSTANCE.createMetaedge();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_8_0_0_0, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a20, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1069]);
            		}

            a21=(Token)match(input,11,FOLLOW_11_in_parse_ASP_Metaedge12242); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = ASP.ASPFactory.eINSTANCE.createMetaedge();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_8_0_0_1, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a21, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1070]);
            		}

            // ASP.g:12412:3: (a22= QUOTED_34_34 )
            // ASP.g:12413:4: a22= QUOTED_34_34
            {
            a22=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ASP_Metaedge12264); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1071]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1072]);
            	}

            a23=(Token)match(input,71,FOLLOW_71_in_parse_ASP_Metaedge12298); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ASP.ASPFactory.eINSTANCE.createMetaedge();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ASP.resource.ASP.grammar.ASPGrammarInformationProvider.ASP_17_0_0_9, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a23, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1073]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1074]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1075]);
            		addExpectedElement(null, ASP.resource.ASP.mopp.ASPExpectationConstants.EXPECTATIONS[1076]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 19, parse_ASP_Metaedge_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_Metaedge"



    // $ANTLR start "parse_ASP_Element"
    // ASP.g:12473:1: parse_ASP_Element returns [ASP.Element element = null] : (c0= parse_ASP_Not |c1= parse_ASP_Eq |c2= parse_ASP_EqSimple |c3= parse_ASP_NotEq |c4= parse_ASP_Literal |c5= parse_ASP_Node |c6= parse_ASP_Prop |c7= parse_ASP_Edge |c8= parse_ASP_Terminal |c9= parse_ASP_Metamodel |c10= parse_ASP_Metanode |c11= parse_ASP_Metaprop |c12= parse_ASP_Metaedge );
    public final ASP.Element parse_ASP_Element() throws RecognitionException {
        ASP.Element element =  null;

        int parse_ASP_Element_StartIndex = input.index();

        ASP.Not c0 =null;

        ASP.Eq c1 =null;

        ASP.EqSimple c2 =null;

        ASP.NotEq c3 =null;

        ASP.Literal c4 =null;

        ASP.Node c5 =null;

        ASP.Prop c6 =null;

        ASP.Edge c7 =null;

        ASP.Terminal c8 =null;

        ASP.Metamodel c9 =null;

        ASP.Metanode c10 =null;

        ASP.Metaprop c11 =null;

        ASP.Metaedge c12 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return element; }

            // ASP.g:12474:2: (c0= parse_ASP_Not |c1= parse_ASP_Eq |c2= parse_ASP_EqSimple |c3= parse_ASP_NotEq |c4= parse_ASP_Literal |c5= parse_ASP_Node |c6= parse_ASP_Prop |c7= parse_ASP_Edge |c8= parse_ASP_Terminal |c9= parse_ASP_Metamodel |c10= parse_ASP_Metanode |c11= parse_ASP_Metaprop |c12= parse_ASP_Metaedge )
            int alt82=13;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt82=1;
                }
                break;
            case 14:
                {
                alt82=2;
                }
                break;
            case 15:
                {
                alt82=3;
                }
                break;
            case 24:
                {
                alt82=4;
                }
                break;
            case 17:
                {
                alt82=5;
                }
                break;
            case 22:
                {
                alt82=6;
                }
                break;
            case 25:
                {
                alt82=7;
                }
                break;
            case 13:
                {
                alt82=8;
                }
                break;
            case 28:
                {
                alt82=9;
                }
                break;
            case 19:
                {
                alt82=10;
                }
                break;
            case 20:
                {
                alt82=11;
                }
                break;
            case 21:
                {
                alt82=12;
                }
                break;
            case 18:
                {
                alt82=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;

            }

            switch (alt82) {
                case 1 :
                    // ASP.g:12475:2: c0= parse_ASP_Not
                    {
                    pushFollow(FOLLOW_parse_ASP_Not_in_parse_ASP_Element12323);
                    c0=parse_ASP_Not();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // ASP.g:12476:4: c1= parse_ASP_Eq
                    {
                    pushFollow(FOLLOW_parse_ASP_Eq_in_parse_ASP_Element12333);
                    c1=parse_ASP_Eq();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // ASP.g:12477:4: c2= parse_ASP_EqSimple
                    {
                    pushFollow(FOLLOW_parse_ASP_EqSimple_in_parse_ASP_Element12343);
                    c2=parse_ASP_EqSimple();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c2; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 4 :
                    // ASP.g:12478:4: c3= parse_ASP_NotEq
                    {
                    pushFollow(FOLLOW_parse_ASP_NotEq_in_parse_ASP_Element12353);
                    c3=parse_ASP_NotEq();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c3; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 5 :
                    // ASP.g:12479:4: c4= parse_ASP_Literal
                    {
                    pushFollow(FOLLOW_parse_ASP_Literal_in_parse_ASP_Element12363);
                    c4=parse_ASP_Literal();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c4; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 6 :
                    // ASP.g:12480:4: c5= parse_ASP_Node
                    {
                    pushFollow(FOLLOW_parse_ASP_Node_in_parse_ASP_Element12373);
                    c5=parse_ASP_Node();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c5; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 7 :
                    // ASP.g:12481:4: c6= parse_ASP_Prop
                    {
                    pushFollow(FOLLOW_parse_ASP_Prop_in_parse_ASP_Element12383);
                    c6=parse_ASP_Prop();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c6; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 8 :
                    // ASP.g:12482:4: c7= parse_ASP_Edge
                    {
                    pushFollow(FOLLOW_parse_ASP_Edge_in_parse_ASP_Element12393);
                    c7=parse_ASP_Edge();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c7; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 9 :
                    // ASP.g:12483:4: c8= parse_ASP_Terminal
                    {
                    pushFollow(FOLLOW_parse_ASP_Terminal_in_parse_ASP_Element12403);
                    c8=parse_ASP_Terminal();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c8; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 10 :
                    // ASP.g:12484:4: c9= parse_ASP_Metamodel
                    {
                    pushFollow(FOLLOW_parse_ASP_Metamodel_in_parse_ASP_Element12413);
                    c9=parse_ASP_Metamodel();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c9; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 11 :
                    // ASP.g:12485:4: c10= parse_ASP_Metanode
                    {
                    pushFollow(FOLLOW_parse_ASP_Metanode_in_parse_ASP_Element12423);
                    c10=parse_ASP_Metanode();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c10; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 12 :
                    // ASP.g:12486:4: c11= parse_ASP_Metaprop
                    {
                    pushFollow(FOLLOW_parse_ASP_Metaprop_in_parse_ASP_Element12433);
                    c11=parse_ASP_Metaprop();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c11; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 13 :
                    // ASP.g:12487:4: c12= parse_ASP_Metaedge
                    {
                    pushFollow(FOLLOW_parse_ASP_Metaedge_in_parse_ASP_Element12443);
                    c12=parse_ASP_Metaedge();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c12; /* this is a subclass or primitive expression choice */ }

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
            if ( state.backtracking>0 ) { memoize(input, 20, parse_ASP_Element_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_Element"



    // $ANTLR start "parse_ASP_PatternElement"
    // ASP.g:12491:1: parse_ASP_PatternElement returns [ASP.PatternElement element = null] : (c0= parse_ASP_Metanode |c1= parse_ASP_Metaprop |c2= parse_ASP_Metaedge );
    public final ASP.PatternElement parse_ASP_PatternElement() throws RecognitionException {
        ASP.PatternElement element =  null;

        int parse_ASP_PatternElement_StartIndex = input.index();

        ASP.Metanode c0 =null;

        ASP.Metaprop c1 =null;

        ASP.Metaedge c2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return element; }

            // ASP.g:12492:2: (c0= parse_ASP_Metanode |c1= parse_ASP_Metaprop |c2= parse_ASP_Metaedge )
            int alt83=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt83=1;
                }
                break;
            case 21:
                {
                alt83=2;
                }
                break;
            case 18:
                {
                alt83=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;

            }

            switch (alt83) {
                case 1 :
                    // ASP.g:12493:2: c0= parse_ASP_Metanode
                    {
                    pushFollow(FOLLOW_parse_ASP_Metanode_in_parse_ASP_PatternElement12464);
                    c0=parse_ASP_Metanode();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // ASP.g:12494:4: c1= parse_ASP_Metaprop
                    {
                    pushFollow(FOLLOW_parse_ASP_Metaprop_in_parse_ASP_PatternElement12474);
                    c1=parse_ASP_Metaprop();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // ASP.g:12495:4: c2= parse_ASP_Metaedge
                    {
                    pushFollow(FOLLOW_parse_ASP_Metaedge_in_parse_ASP_PatternElement12484);
                    c2=parse_ASP_Metaedge();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c2; /* this is a subclass or primitive expression choice */ }

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
            if ( state.backtracking>0 ) { memoize(input, 21, parse_ASP_PatternElement_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_PatternElement"



    // $ANTLR start "parse_ASP_ConstraintElement"
    // ASP.g:12499:1: parse_ASP_ConstraintElement returns [ASP.ConstraintElement element = null] : (c0= parse_ASP_Not |c1= parse_ASP_Eq |c2= parse_ASP_EqSimple |c3= parse_ASP_NotEq |c4= parse_ASP_Terminal );
    public final ASP.ConstraintElement parse_ASP_ConstraintElement() throws RecognitionException {
        ASP.ConstraintElement element =  null;

        int parse_ASP_ConstraintElement_StartIndex = input.index();

        ASP.Not c0 =null;

        ASP.Eq c1 =null;

        ASP.EqSimple c2 =null;

        ASP.NotEq c3 =null;

        ASP.Terminal c4 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return element; }

            // ASP.g:12500:2: (c0= parse_ASP_Not |c1= parse_ASP_Eq |c2= parse_ASP_EqSimple |c3= parse_ASP_NotEq |c4= parse_ASP_Terminal )
            int alt84=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt84=1;
                }
                break;
            case 14:
                {
                alt84=2;
                }
                break;
            case 15:
                {
                alt84=3;
                }
                break;
            case 24:
                {
                alt84=4;
                }
                break;
            case 28:
                {
                alt84=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;

            }

            switch (alt84) {
                case 1 :
                    // ASP.g:12501:2: c0= parse_ASP_Not
                    {
                    pushFollow(FOLLOW_parse_ASP_Not_in_parse_ASP_ConstraintElement12505);
                    c0=parse_ASP_Not();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // ASP.g:12502:4: c1= parse_ASP_Eq
                    {
                    pushFollow(FOLLOW_parse_ASP_Eq_in_parse_ASP_ConstraintElement12515);
                    c1=parse_ASP_Eq();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // ASP.g:12503:4: c2= parse_ASP_EqSimple
                    {
                    pushFollow(FOLLOW_parse_ASP_EqSimple_in_parse_ASP_ConstraintElement12525);
                    c2=parse_ASP_EqSimple();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c2; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 4 :
                    // ASP.g:12504:4: c3= parse_ASP_NotEq
                    {
                    pushFollow(FOLLOW_parse_ASP_NotEq_in_parse_ASP_ConstraintElement12535);
                    c3=parse_ASP_NotEq();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c3; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 5 :
                    // ASP.g:12505:4: c4= parse_ASP_Terminal
                    {
                    pushFollow(FOLLOW_parse_ASP_Terminal_in_parse_ASP_ConstraintElement12545);
                    c4=parse_ASP_Terminal();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c4; /* this is a subclass or primitive expression choice */ }

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
            if ( state.backtracking>0 ) { memoize(input, 22, parse_ASP_ConstraintElement_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_ConstraintElement"



    // $ANTLR start "parse_ASP_FunctionParameter"
    // ASP.g:12509:1: parse_ASP_FunctionParameter returns [ASP.FunctionParameter element = null] : (c0= parse_ASP_Eq |c1= parse_ASP_EqSimple |c2= parse_ASP_NotEq |c3= parse_ASP_Literal );
    public final ASP.FunctionParameter parse_ASP_FunctionParameter() throws RecognitionException {
        ASP.FunctionParameter element =  null;

        int parse_ASP_FunctionParameter_StartIndex = input.index();

        ASP.Eq c0 =null;

        ASP.EqSimple c1 =null;

        ASP.NotEq c2 =null;

        ASP.Literal c3 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return element; }

            // ASP.g:12510:2: (c0= parse_ASP_Eq |c1= parse_ASP_EqSimple |c2= parse_ASP_NotEq |c3= parse_ASP_Literal )
            int alt85=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt85=1;
                }
                break;
            case 15:
                {
                alt85=2;
                }
                break;
            case 24:
                {
                alt85=3;
                }
                break;
            case 17:
                {
                alt85=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;

            }

            switch (alt85) {
                case 1 :
                    // ASP.g:12511:2: c0= parse_ASP_Eq
                    {
                    pushFollow(FOLLOW_parse_ASP_Eq_in_parse_ASP_FunctionParameter12566);
                    c0=parse_ASP_Eq();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // ASP.g:12512:4: c1= parse_ASP_EqSimple
                    {
                    pushFollow(FOLLOW_parse_ASP_EqSimple_in_parse_ASP_FunctionParameter12576);
                    c1=parse_ASP_EqSimple();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // ASP.g:12513:4: c2= parse_ASP_NotEq
                    {
                    pushFollow(FOLLOW_parse_ASP_NotEq_in_parse_ASP_FunctionParameter12586);
                    c2=parse_ASP_NotEq();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c2; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 4 :
                    // ASP.g:12514:4: c3= parse_ASP_Literal
                    {
                    pushFollow(FOLLOW_parse_ASP_Literal_in_parse_ASP_FunctionParameter12596);
                    c3=parse_ASP_Literal();

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
            if ( state.backtracking>0 ) { memoize(input, 23, parse_ASP_FunctionParameter_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_FunctionParameter"



    // $ANTLR start "parse_ASP_TerminalElement"
    // ASP.g:12518:1: parse_ASP_TerminalElement returns [ASP.TerminalElement element = null] : (c0= parse_ASP_Node |c1= parse_ASP_Prop |c2= parse_ASP_Edge );
    public final ASP.TerminalElement parse_ASP_TerminalElement() throws RecognitionException {
        ASP.TerminalElement element =  null;

        int parse_ASP_TerminalElement_StartIndex = input.index();

        ASP.Node c0 =null;

        ASP.Prop c1 =null;

        ASP.Edge c2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return element; }

            // ASP.g:12519:2: (c0= parse_ASP_Node |c1= parse_ASP_Prop |c2= parse_ASP_Edge )
            int alt86=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt86=1;
                }
                break;
            case 25:
                {
                alt86=2;
                }
                break;
            case 13:
                {
                alt86=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;

            }

            switch (alt86) {
                case 1 :
                    // ASP.g:12520:2: c0= parse_ASP_Node
                    {
                    pushFollow(FOLLOW_parse_ASP_Node_in_parse_ASP_TerminalElement12617);
                    c0=parse_ASP_Node();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // ASP.g:12521:4: c1= parse_ASP_Prop
                    {
                    pushFollow(FOLLOW_parse_ASP_Prop_in_parse_ASP_TerminalElement12627);
                    c1=parse_ASP_Prop();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // ASP.g:12522:4: c2= parse_ASP_Edge
                    {
                    pushFollow(FOLLOW_parse_ASP_Edge_in_parse_ASP_TerminalElement12637);
                    c2=parse_ASP_Edge();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c2; /* this is a subclass or primitive expression choice */ }

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
            if ( state.backtracking>0 ) { memoize(input, 24, parse_ASP_TerminalElement_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ASP_TerminalElement"

    // Delegated rules


 

    public static final BitSet FOLLOW_parse_ASP_Transformation_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_parse_ASP_Transformation115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_parse_ASP_Transformation129 = new BitSet(new long[]{0x00210000C0000000L});
    public static final BitSet FOLLOW_48_in_parse_ASP_Transformation152 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Transformation172 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_Transformation198 = new BitSet(new long[]{0x00200000C0000000L});
    public static final BitSet FOLLOW_31_in_parse_ASP_Transformation253 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Transformation273 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Transformation299 = new BitSet(new long[]{0x00200000C0000000L});
    public static final BitSet FOLLOW_30_in_parse_ASP_Transformation354 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Transformation374 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Transformation400 = new BitSet(new long[]{0x0020000040000000L});
    public static final BitSet FOLLOW_53_in_parse_ASP_Transformation450 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Transformation467 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_parse_ASP_Metamodel_in_parse_ASP_Transformation489 = new BitSet(new long[]{0x0000002100000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_parse_ASP_Transformation528 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Transformation548 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_parse_ASP_Literal_in_parse_ASP_Transformation574 = new BitSet(new long[]{0x0000002100000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_32_in_parse_ASP_Transformation624 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Transformation644 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_parse_ASP_Constraint_in_parse_ASP_Transformation670 = new BitSet(new long[]{0x0000002100000000L});
    public static final BitSet FOLLOW_37_in_parse_ASP_Transformation720 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Transformation740 = new BitSet(new long[]{0x0000000013FEE000L});
    public static final BitSet FOLLOW_parse_ASP_Element_in_parse_ASP_Transformation766 = new BitSet(new long[]{0x1000002000000000L});
    public static final BitSet FOLLOW_60_in_parse_ASP_Transformation816 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Transformation836 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_parse_ASP_Relation_in_parse_ASP_Transformation862 = new BitSet(new long[]{0x1040000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_54_in_parse_ASP_Transformation912 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Transformation932 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_Transformation958 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_parse_ASP_Transformation1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_parse_ASP_LeftPattern1033 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_parse_ASP_LeftPattern1047 = new BitSet(new long[]{0x00010010C0000000L});
    public static final BitSet FOLLOW_48_in_parse_ASP_LeftPattern1070 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_LeftPattern1090 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_LeftPattern1116 = new BitSet(new long[]{0x00000010C0000000L});
    public static final BitSet FOLLOW_31_in_parse_ASP_LeftPattern1171 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_LeftPattern1191 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_LeftPattern1217 = new BitSet(new long[]{0x00000010C0000000L});
    public static final BitSet FOLLOW_30_in_parse_ASP_LeftPattern1272 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_LeftPattern1292 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_LeftPattern1318 = new BitSet(new long[]{0x0000001040000000L});
    public static final BitSet FOLLOW_36_in_parse_ASP_LeftPattern1368 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_LeftPattern1385 = new BitSet(new long[]{0x0000000000340000L});
    public static final BitSet FOLLOW_parse_ASP_PatternElement_in_parse_ASP_LeftPattern1407 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_parse_ASP_LeftPattern1441 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_LeftPattern1458 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_LeftPattern1480 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_parse_ASP_LeftPattern1518 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_LeftPattern1535 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_LeftPattern1557 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_parse_ASP_LeftPattern1606 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_parse_ASP_LeftPattern1654 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_parse_ASP_LeftPattern1702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_parse_ASP_LeftPattern1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_parse_ASP_RightPattern1764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_parse_ASP_RightPattern1778 = new BitSet(new long[]{0x00010010C0000000L});
    public static final BitSet FOLLOW_48_in_parse_ASP_RightPattern1801 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_RightPattern1821 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_RightPattern1847 = new BitSet(new long[]{0x00000010C0000000L});
    public static final BitSet FOLLOW_31_in_parse_ASP_RightPattern1902 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_RightPattern1922 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_RightPattern1948 = new BitSet(new long[]{0x00000010C0000000L});
    public static final BitSet FOLLOW_30_in_parse_ASP_RightPattern2003 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_RightPattern2023 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_RightPattern2049 = new BitSet(new long[]{0x0000001040000000L});
    public static final BitSet FOLLOW_36_in_parse_ASP_RightPattern2099 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_RightPattern2116 = new BitSet(new long[]{0x0000000000340000L});
    public static final BitSet FOLLOW_parse_ASP_PatternElement_in_parse_ASP_RightPattern2138 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_parse_ASP_RightPattern2172 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_RightPattern2189 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_RightPattern2211 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_parse_ASP_RightPattern2249 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_RightPattern2266 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_RightPattern2288 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_parse_ASP_RightPattern2337 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_parse_ASP_RightPattern2385 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_parse_ASP_RightPattern2433 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_parse_ASP_RightPattern2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_parse_ASP_Constraint2495 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_parse_ASP_Constraint2509 = new BitSet(new long[]{0x00010004C0000000L});
    public static final BitSet FOLLOW_48_in_parse_ASP_Constraint2532 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Constraint2552 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_Constraint2578 = new BitSet(new long[]{0x00000004C0000000L});
    public static final BitSet FOLLOW_31_in_parse_ASP_Constraint2633 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Constraint2653 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Constraint2679 = new BitSet(new long[]{0x00000004C0000000L});
    public static final BitSet FOLLOW_30_in_parse_ASP_Constraint2734 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Constraint2754 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Constraint2780 = new BitSet(new long[]{0x0000000440000000L});
    public static final BitSet FOLLOW_34_in_parse_ASP_Constraint2835 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Constraint2855 = new BitSet(new long[]{0x000000001180C000L});
    public static final BitSet FOLLOW_parse_ASP_ConstraintElement_in_parse_ASP_Constraint2881 = new BitSet(new long[]{0x0040000400000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_54_in_parse_ASP_Constraint2931 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Constraint2951 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_Constraint2977 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_parse_ASP_Constraint3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_parse_ASP_Not3052 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_parse_ASP_Not3066 = new BitSet(new long[]{0x00410010C0000000L});
    public static final BitSet FOLLOW_48_in_parse_ASP_Not3089 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Not3109 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_Not3135 = new BitSet(new long[]{0x00400010C0000000L});
    public static final BitSet FOLLOW_31_in_parse_ASP_Not3190 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Not3210 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Not3236 = new BitSet(new long[]{0x00400010C0000000L});
    public static final BitSet FOLLOW_30_in_parse_ASP_Not3291 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Not3311 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Not3337 = new BitSet(new long[]{0x0040001040000000L});
    public static final BitSet FOLLOW_54_in_parse_ASP_Not3392 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Not3412 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_Not3438 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_parse_ASP_Not3488 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Not3505 = new BitSet(new long[]{0x000000001180C000L});
    public static final BitSet FOLLOW_parse_ASP_ConstraintElement_in_parse_ASP_Not3527 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_parse_ASP_Not3557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_parse_ASP_Eq3586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_parse_ASP_Eq3600 = new BitSet(new long[]{0x01410000C0000000L});
    public static final BitSet FOLLOW_48_in_parse_ASP_Eq3623 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Eq3643 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_Eq3669 = new BitSet(new long[]{0x01400000C0000000L});
    public static final BitSet FOLLOW_31_in_parse_ASP_Eq3724 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Eq3744 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Eq3770 = new BitSet(new long[]{0x01400000C0000000L});
    public static final BitSet FOLLOW_30_in_parse_ASP_Eq3825 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Eq3845 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Eq3871 = new BitSet(new long[]{0x0140000040000000L});
    public static final BitSet FOLLOW_54_in_parse_ASP_Eq3926 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Eq3946 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_Eq3972 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_parse_ASP_Eq4022 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Eq4039 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_Eq4061 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_parse_ASP_Eq4099 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Eq4116 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Eq4138 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_parse_ASP_Eq4176 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Eq4193 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Eq4215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_parse_ASP_Eq4249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_parse_ASP_EqSimple4278 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_parse_ASP_EqSimple4292 = new BitSet(new long[]{0x01410000C0000000L});
    public static final BitSet FOLLOW_48_in_parse_ASP_EqSimple4315 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_EqSimple4335 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_EqSimple4361 = new BitSet(new long[]{0x01400000C0000000L});
    public static final BitSet FOLLOW_31_in_parse_ASP_EqSimple4416 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_EqSimple4436 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_EqSimple4462 = new BitSet(new long[]{0x01400000C0000000L});
    public static final BitSet FOLLOW_30_in_parse_ASP_EqSimple4517 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_EqSimple4537 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_EqSimple4563 = new BitSet(new long[]{0x0140000040000000L});
    public static final BitSet FOLLOW_54_in_parse_ASP_EqSimple4618 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_EqSimple4638 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_EqSimple4664 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_parse_ASP_EqSimple4714 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_EqSimple4731 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_EqSimple4753 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_parse_ASP_EqSimple4791 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_EqSimple4808 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_EqSimple4830 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_parse_ASP_EqSimple4868 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_EqSimple4885 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_EqSimple4907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_parse_ASP_EqSimple4941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_parse_ASP_NotEq4970 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_parse_ASP_NotEq4984 = new BitSet(new long[]{0x01410000C0000000L});
    public static final BitSet FOLLOW_48_in_parse_ASP_NotEq5007 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_NotEq5027 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_NotEq5053 = new BitSet(new long[]{0x01400000C0000000L});
    public static final BitSet FOLLOW_31_in_parse_ASP_NotEq5108 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_NotEq5128 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_NotEq5154 = new BitSet(new long[]{0x01400000C0000000L});
    public static final BitSet FOLLOW_30_in_parse_ASP_NotEq5209 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_NotEq5229 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_NotEq5255 = new BitSet(new long[]{0x0140000040000000L});
    public static final BitSet FOLLOW_54_in_parse_ASP_NotEq5310 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_NotEq5330 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_NotEq5356 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_parse_ASP_NotEq5406 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_NotEq5423 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_NotEq5445 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_parse_ASP_NotEq5483 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_NotEq5500 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_NotEq5522 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_parse_ASP_NotEq5560 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_NotEq5577 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_NotEq5599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_parse_ASP_NotEq5633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_parse_ASP_Literal5662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_parse_ASP_Literal5676 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_parse_ASP_Literal5705 = new BitSet(new long[]{0x01410000C0000000L});
    public static final BitSet FOLLOW_48_in_parse_ASP_Literal5747 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Literal5767 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_Literal5793 = new BitSet(new long[]{0x01400000C0000000L});
    public static final BitSet FOLLOW_31_in_parse_ASP_Literal5848 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Literal5868 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Literal5894 = new BitSet(new long[]{0x01400000C0000000L});
    public static final BitSet FOLLOW_30_in_parse_ASP_Literal5949 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Literal5969 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Literal5995 = new BitSet(new long[]{0x0140000040000000L});
    public static final BitSet FOLLOW_54_in_parse_ASP_Literal6050 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Literal6070 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_Literal6096 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_parse_ASP_Literal6146 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Literal6163 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_Literal6185 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_parse_ASP_Literal6219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_parse_ASP_Node6248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_parse_ASP_Node6262 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_parse_ASP_Node6291 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_parse_ASP_Node6339 = new BitSet(new long[]{0x00510000C0000000L});
    public static final BitSet FOLLOW_48_in_parse_ASP_Node6381 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Node6401 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_Node6427 = new BitSet(new long[]{0x00500000C0000000L});
    public static final BitSet FOLLOW_31_in_parse_ASP_Node6482 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Node6502 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Node6528 = new BitSet(new long[]{0x00500000C0000000L});
    public static final BitSet FOLLOW_30_in_parse_ASP_Node6583 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Node6603 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Node6629 = new BitSet(new long[]{0x0050000040000000L});
    public static final BitSet FOLLOW_54_in_parse_ASP_Node6684 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Node6704 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_Node6730 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_parse_ASP_Node6780 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Node6797 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Node6819 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_parse_ASP_Node6857 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Node6874 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_Node6896 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_parse_ASP_Node6934 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Node6951 = new BitSet(new long[]{0x000000000102C000L});
    public static final BitSet FOLLOW_parse_ASP_FunctionParameter_in_parse_ASP_Node6973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_parse_ASP_Node7003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_parse_ASP_Prop7032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_parse_ASP_Prop7046 = new BitSet(new long[]{0x00513000C0000000L});
    public static final BitSet FOLLOW_44_in_parse_ASP_Prop7069 = new BitSet(new long[]{0x00512000C0000000L});
    public static final BitSet FOLLOW_45_in_parse_ASP_Prop7099 = new BitSet(new long[]{0x00510000C0000000L});
    public static final BitSet FOLLOW_48_in_parse_ASP_Prop7129 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Prop7149 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_Prop7175 = new BitSet(new long[]{0x00500000C0000000L});
    public static final BitSet FOLLOW_31_in_parse_ASP_Prop7230 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Prop7250 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Prop7276 = new BitSet(new long[]{0x00500000C0000000L});
    public static final BitSet FOLLOW_30_in_parse_ASP_Prop7331 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Prop7351 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Prop7377 = new BitSet(new long[]{0x0050000040000000L});
    public static final BitSet FOLLOW_54_in_parse_ASP_Prop7432 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Prop7452 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_Prop7478 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_parse_ASP_Prop7528 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Prop7545 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Prop7567 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_parse_ASP_Prop7605 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Prop7622 = new BitSet(new long[]{0x000000000102C000L});
    public static final BitSet FOLLOW_parse_ASP_FunctionParameter_in_parse_ASP_Prop7644 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_parse_ASP_Prop7678 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Prop7695 = new BitSet(new long[]{0x000000000102C000L});
    public static final BitSet FOLLOW_parse_ASP_FunctionParameter_in_parse_ASP_Prop7717 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_parse_ASP_Prop7751 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Prop7768 = new BitSet(new long[]{0x000000000102C000L});
    public static final BitSet FOLLOW_parse_ASP_FunctionParameter_in_parse_ASP_Prop7790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_parse_ASP_Prop7820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_parse_ASP_Edge7849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_parse_ASP_Edge7863 = new BitSet(new long[]{0x00512080C0000000L});
    public static final BitSet FOLLOW_39_in_parse_ASP_Edge7886 = new BitSet(new long[]{0x00512000C0000000L});
    public static final BitSet FOLLOW_45_in_parse_ASP_Edge7916 = new BitSet(new long[]{0x00510000C0000000L});
    public static final BitSet FOLLOW_48_in_parse_ASP_Edge7946 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Edge7966 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_Edge7992 = new BitSet(new long[]{0x00500000C0000000L});
    public static final BitSet FOLLOW_31_in_parse_ASP_Edge8047 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Edge8067 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Edge8093 = new BitSet(new long[]{0x00500000C0000000L});
    public static final BitSet FOLLOW_30_in_parse_ASP_Edge8148 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Edge8168 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Edge8194 = new BitSet(new long[]{0x0050000040000000L});
    public static final BitSet FOLLOW_54_in_parse_ASP_Edge8249 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Edge8269 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_Edge8295 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_parse_ASP_Edge8345 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Edge8362 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Edge8384 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_parse_ASP_Edge8422 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Edge8439 = new BitSet(new long[]{0x000000000102C000L});
    public static final BitSet FOLLOW_parse_ASP_FunctionParameter_in_parse_ASP_Edge8461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_parse_ASP_Edge8495 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Edge8512 = new BitSet(new long[]{0x000000000102C000L});
    public static final BitSet FOLLOW_parse_ASP_FunctionParameter_in_parse_ASP_Edge8534 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_parse_ASP_Edge8568 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Edge8585 = new BitSet(new long[]{0x000000000102C000L});
    public static final BitSet FOLLOW_parse_ASP_FunctionParameter_in_parse_ASP_Edge8607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_parse_ASP_Edge8637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_parse_ASP_Relation8666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_parse_ASP_Relation8680 = new BitSet(new long[]{0x40038000C0000000L});
    public static final BitSet FOLLOW_47_in_parse_ASP_Relation8703 = new BitSet(new long[]{0x40030000C0000000L});
    public static final BitSet FOLLOW_62_in_parse_ASP_Relation8733 = new BitSet(new long[]{0x00030000C0000000L});
    public static final BitSet FOLLOW_48_in_parse_ASP_Relation8763 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Relation8783 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_Relation8809 = new BitSet(new long[]{0x00020000C0000000L});
    public static final BitSet FOLLOW_31_in_parse_ASP_Relation8864 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Relation8884 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Relation8910 = new BitSet(new long[]{0x00020000C0000000L});
    public static final BitSet FOLLOW_30_in_parse_ASP_Relation8965 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Relation8985 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Relation9011 = new BitSet(new long[]{0x0002000040000000L});
    public static final BitSet FOLLOW_49_in_parse_ASP_Relation9061 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Relation9078 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_parse_ASP_LeftPattern_in_parse_ASP_Relation9100 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_parse_ASP_Relation9134 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Relation9151 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_parse_ASP_RightPattern_in_parse_ASP_Relation9173 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_parse_ASP_Relation9207 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Relation9224 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_Relation9246 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_parse_ASP_Relation9284 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Relation9301 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_Relation9323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_68_in_parse_ASP_Relation9366 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Relation9386 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_Relation9412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_parse_ASP_Relation9458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_parse_ASP_Terminal9487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_parse_ASP_Terminal9501 = new BitSet(new long[]{0x00410002C0000000L});
    public static final BitSet FOLLOW_48_in_parse_ASP_Terminal9524 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Terminal9544 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_Terminal9570 = new BitSet(new long[]{0x00400002C0000000L});
    public static final BitSet FOLLOW_31_in_parse_ASP_Terminal9625 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Terminal9645 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Terminal9671 = new BitSet(new long[]{0x00400002C0000000L});
    public static final BitSet FOLLOW_30_in_parse_ASP_Terminal9726 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Terminal9746 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Terminal9772 = new BitSet(new long[]{0x0040000240000000L});
    public static final BitSet FOLLOW_54_in_parse_ASP_Terminal9827 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Terminal9847 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_Terminal9873 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_parse_ASP_Terminal9923 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Terminal9940 = new BitSet(new long[]{0x0000000002402000L});
    public static final BitSet FOLLOW_parse_ASP_TerminalElement_in_parse_ASP_Terminal9962 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_parse_ASP_Terminal9992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_parse_ASP_Metamodel10021 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_parse_ASP_Metamodel10035 = new BitSet(new long[]{0x00410000C0000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_48_in_parse_ASP_Metamodel10058 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Metamodel10078 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_Metamodel10104 = new BitSet(new long[]{0x00400000C0000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_31_in_parse_ASP_Metamodel10159 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Metamodel10179 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Metamodel10205 = new BitSet(new long[]{0x00400000C0000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_30_in_parse_ASP_Metamodel10260 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Metamodel10280 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Metamodel10306 = new BitSet(new long[]{0x0040000040000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_54_in_parse_ASP_Metamodel10361 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Metamodel10381 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_Metamodel10407 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_parse_ASP_Metamodel10453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_parse_ASP_Metanode10482 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_parse_ASP_Metanode10496 = new BitSet(new long[]{0x00510000C0000000L});
    public static final BitSet FOLLOW_48_in_parse_ASP_Metanode10519 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Metanode10539 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_Metanode10565 = new BitSet(new long[]{0x00500000C0000000L});
    public static final BitSet FOLLOW_31_in_parse_ASP_Metanode10620 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Metanode10640 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Metanode10666 = new BitSet(new long[]{0x00500000C0000000L});
    public static final BitSet FOLLOW_30_in_parse_ASP_Metanode10721 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Metanode10741 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Metanode10767 = new BitSet(new long[]{0x0050000040000000L});
    public static final BitSet FOLLOW_54_in_parse_ASP_Metanode10822 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Metanode10842 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_Metanode10868 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_parse_ASP_Metanode10918 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Metanode10935 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Metanode10957 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_parse_ASP_Metanode10991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_parse_ASP_Metaprop11020 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_parse_ASP_Metaprop11034 = new BitSet(new long[]{0x00510000C0000000L});
    public static final BitSet FOLLOW_48_in_parse_ASP_Metaprop11057 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Metaprop11077 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_Metaprop11103 = new BitSet(new long[]{0x00500000C0000000L});
    public static final BitSet FOLLOW_31_in_parse_ASP_Metaprop11158 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Metaprop11178 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Metaprop11204 = new BitSet(new long[]{0x00500000C0000000L});
    public static final BitSet FOLLOW_30_in_parse_ASP_Metaprop11259 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Metaprop11279 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Metaprop11305 = new BitSet(new long[]{0x0050000040000000L});
    public static final BitSet FOLLOW_54_in_parse_ASP_Metaprop11360 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Metaprop11380 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_Metaprop11406 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_parse_ASP_Metaprop11456 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Metaprop11473 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Metaprop11495 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_parse_ASP_Metaprop11533 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Metaprop11550 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_Metaprop11572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_parse_ASP_Metaprop11606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_parse_ASP_Metaedge11635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_parse_ASP_Metaedge11649 = new BitSet(new long[]{0x00510000C0000000L});
    public static final BitSet FOLLOW_48_in_parse_ASP_Metaedge11672 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Metaedge11692 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_Metaedge11718 = new BitSet(new long[]{0x00500000C0000000L});
    public static final BitSet FOLLOW_31_in_parse_ASP_Metaedge11773 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Metaedge11793 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Metaedge11819 = new BitSet(new long[]{0x00500000C0000000L});
    public static final BitSet FOLLOW_30_in_parse_ASP_Metaedge11874 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Metaedge11894 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Metaedge11920 = new BitSet(new long[]{0x0050000040000000L});
    public static final BitSet FOLLOW_54_in_parse_ASP_Metaedge11975 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Metaedge11995 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_Metaedge12021 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_parse_ASP_Metaedge12071 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Metaedge12088 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_ASP_Metaedge12110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_parse_ASP_Metaedge12148 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Metaedge12165 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_Metaedge12187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_parse_ASP_Metaedge12225 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_ASP_Metaedge12242 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ASP_Metaedge12264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_parse_ASP_Metaedge12298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Not_in_parse_ASP_Element12323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Eq_in_parse_ASP_Element12333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_EqSimple_in_parse_ASP_Element12343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_NotEq_in_parse_ASP_Element12353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Literal_in_parse_ASP_Element12363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Node_in_parse_ASP_Element12373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Prop_in_parse_ASP_Element12383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Edge_in_parse_ASP_Element12393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Terminal_in_parse_ASP_Element12403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Metamodel_in_parse_ASP_Element12413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Metanode_in_parse_ASP_Element12423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Metaprop_in_parse_ASP_Element12433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Metaedge_in_parse_ASP_Element12443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Metanode_in_parse_ASP_PatternElement12464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Metaprop_in_parse_ASP_PatternElement12474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Metaedge_in_parse_ASP_PatternElement12484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Not_in_parse_ASP_ConstraintElement12505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Eq_in_parse_ASP_ConstraintElement12515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_EqSimple_in_parse_ASP_ConstraintElement12525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_NotEq_in_parse_ASP_ConstraintElement12535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Terminal_in_parse_ASP_ConstraintElement12545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Eq_in_parse_ASP_FunctionParameter12566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_EqSimple_in_parse_ASP_FunctionParameter12576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_NotEq_in_parse_ASP_FunctionParameter12586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Literal_in_parse_ASP_FunctionParameter12596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Node_in_parse_ASP_TerminalElement12617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Prop_in_parse_ASP_TerminalElement12627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ASP_Edge_in_parse_ASP_TerminalElement12637 = new BitSet(new long[]{0x0000000000000002L});

}