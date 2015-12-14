// $ANTLR 3.4

	package ASP.resource.ASP.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ASPLexer extends Lexer {
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

    	public java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>();
    	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
    	
    	public void reportError(org.antlr.runtime3_4_0.RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionsPosition.add(((org.antlr.runtime3_4_0.ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public ASPLexer() {} 
    public ASPLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ASPLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "ASP.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:15:7: ( ':' )
            // ASP.g:15:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:16:7: ( 'Constraint' )
            // ASP.g:16:9: 'Constraint'
            {
            match("Constraint"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:17:7: ( 'Edge' )
            // ASP.g:17:9: 'Edge'
            {
            match("Edge"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:18:7: ( 'Eq' )
            // ASP.g:18:9: 'Eq'
            {
            match("Eq"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:19:7: ( 'EqSimple' )
            // ASP.g:19:9: 'EqSimple'
            {
            match("EqSimple"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:20:7: ( 'LeftPattern' )
            // ASP.g:20:9: 'LeftPattern'
            {
            match("LeftPattern"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:21:7: ( 'Literal' )
            // ASP.g:21:9: 'Literal'
            {
            match("Literal"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:22:7: ( 'Metaedge' )
            // ASP.g:22:9: 'Metaedge'
            {
            match("Metaedge"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:23:7: ( 'Metamodel' )
            // ASP.g:23:9: 'Metamodel'
            {
            match("Metamodel"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:24:7: ( 'Metanode' )
            // ASP.g:24:9: 'Metanode'
            {
            match("Metanode"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:25:7: ( 'Metaprop' )
            // ASP.g:25:9: 'Metaprop'
            {
            match("Metaprop"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:26:7: ( 'Node' )
            // ASP.g:26:9: 'Node'
            {
            match("Node"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:27:7: ( 'Not' )
            // ASP.g:27:9: 'Not'
            {
            match("Not"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:28:7: ( 'NotEq' )
            // ASP.g:28:9: 'NotEq'
            {
            match("NotEq"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:29:7: ( 'Prop' )
            // ASP.g:29:9: 'Prop'
            {
            match("Prop"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:30:7: ( 'Relation' )
            // ASP.g:30:9: 'Relation'
            {
            match("Relation"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:31:7: ( 'RightPattern' )
            // ASP.g:31:9: 'RightPattern'
            {
            match("RightPattern"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:32:7: ( 'Terminal' )
            // ASP.g:32:9: 'Terminal'
            {
            match("Terminal"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:33:7: ( 'Transformation' )
            // ASP.g:33:9: 'Transformation'
            {
            match("Transformation"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:34:7: ( 'commentsAfter' )
            // ASP.g:34:9: 'commentsAfter'
            {
            match("commentsAfter"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:35:7: ( 'commentsBefore' )
            // ASP.g:35:9: 'commentsBefore'
            {
            match("commentsBefore"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:36:7: ( 'constraints' )
            // ASP.g:36:9: 'constraints'
            {
            match("constraints"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:37:7: ( 'content' )
            // ASP.g:37:9: 'content'
            {
            match("content"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:38:7: ( 'contents' )
            // ASP.g:38:9: 'contents'
            {
            match("contents"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:39:7: ( 'edgeId' )
            // ASP.g:39:9: 'edgeId'
            {
            match("edgeId"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:40:7: ( 'element' )
            // ASP.g:40:9: 'element'
            {
            match("element"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:41:7: ( 'elements' )
            // ASP.g:41:9: 'elements'
            {
            match("elements"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:42:7: ( 'isDefinition' )
            // ASP.g:42:9: 'isDefinition'
            {
            match("isDefinition"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:43:7: ( 'isEdgex' )
            // ASP.g:43:9: 'isEdgex'
            {
            match("isEdgex"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:44:7: ( 'isMetaedge' )
            // ASP.g:44:9: 'isMetaedge'
            {
            match("isMetaedge"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:45:7: ( 'isMetanode' )
            // ASP.g:45:9: 'isMetanode'
            {
            match("isMetanode"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:46:7: ( 'isMetaprop' )
            // ASP.g:46:9: 'isMetaprop'
            {
            match("isMetaprop"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:47:7: ( 'isNodex' )
            // ASP.g:47:9: 'isNodex'
            {
            match("isNodex"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:48:7: ( 'isPropx' )
            // ASP.g:48:9: 'isPropx'
            {
            match("isPropx"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:49:7: ( 'isTrace' )
            // ASP.g:49:9: 'isTrace'
            {
            match("isTrace"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:50:7: ( 'left1' )
            // ASP.g:50:9: 'left1'
            {
            match("left1"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:51:7: ( 'left2right' )
            // ASP.g:51:9: 'left2right'
            {
            match("left2right"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:52:7: ( 'location' )
            // ASP.g:52:9: 'location'
            {
            match("location"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:53:7: ( 'lpattern' )
            // ASP.g:53:9: 'lpattern'
            {
            match("lpattern"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:54:7: ( 'metaClass' )
            // ASP.g:54:9: 'metaClass'
            {
            match("metaClass"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:55:7: ( 'metaClassId' )
            // ASP.g:55:9: 'metaClassId'
            {
            match("metaClassId"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:56:7: ( 'metamodel' )
            // ASP.g:56:9: 'metamodel'
            {
            match("metamodel"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:57:7: ( 'metamodels' )
            // ASP.g:57:9: 'metamodels'
            {
            match("metamodels"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:58:7: ( 'name' )
            // ASP.g:58:9: 'name'
            {
            match("name"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:59:7: ( 'nodeId' )
            // ASP.g:59:9: 'nodeId'
            {
            match("nodeId"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:60:7: ( 'parameterName' )
            // ASP.g:60:9: 'parameterName'
            {
            match("parameterName"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:61:7: ( 'propId' )
            // ASP.g:61:9: 'propId'
            {
            match("propId"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:62:7: ( 'propValue' )
            // ASP.g:62:9: 'propValue'
            {
            match("propValue"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:63:7: ( 'relationId' )
            // ASP.g:63:9: 'relationId'
            {
            match("relationId"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:64:7: ( 'relations' )
            // ASP.g:64:9: 'relations'
            {
            match("relations"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:65:7: ( 'right1' )
            // ASP.g:65:9: 'right1'
            {
            match("right1"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:66:7: ( 'right2left' )
            // ASP.g:66:9: 'right2left'
            {
            match("right2left"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:67:7: ( 'rpattern' )
            // ASP.g:67:9: 'rpattern'
            {
            match("rpattern"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:68:7: ( 'sourceMCId' )
            // ASP.g:68:9: 'sourceMCId'
            {
            match("sourceMCId"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:69:7: ( 'sourceMetaClass' )
            // ASP.g:69:9: 'sourceMetaClass'
            {
            match("sourceMetaClass"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:70:7: ( 'targetMCId' )
            // ASP.g:70:9: 'targetMCId'
            {
            match("targetMCId"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:71:7: ( 'targetMetaClass' )
            // ASP.g:71:9: 'targetMetaClass'
            {
            match("targetMetaClass"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:72:7: ( 'type' )
            // ASP.g:72:9: 'type'
            {
            match("type"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:73:7: ( 'usedLiterals' )
            // ASP.g:73:9: 'usedLiterals'
            {
            match("usedLiterals"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:74:7: ( '{' )
            // ASP.g:74:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:75:7: ( '}' )
            // ASP.g:75:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:12526:8: ( ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* ) )
            // ASP.g:12527:2: ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            {
            // ASP.g:12527:2: ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            // ASP.g:12527:3: '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            {
            match("//"); 



            // ASP.g:12527:7: (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ASP.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFE') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:12530:8: ( ( ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) )
            // ASP.g:12531:2: ( ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
            {
            // ASP.g:12531:2: ( ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-'||(LA4_0 >= '1' && LA4_0 <= '9')) ) {
                alt4=1;
            }
            else if ( (LA4_0=='0') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // ASP.g:12531:3: ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    // ASP.g:12531:3: ( '-' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='-') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ASP.g:12531:4: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }


                    if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // ASP.g:12531:19: ( '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ASP.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // ASP.g:12531:31: '0'
                    {
                    match('0'); 

                    }
                    break;

            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:12534:6: ( ( ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+ ) )
            // ASP.g:12535:2: ( ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+ )
            {
            // ASP.g:12535:2: ( ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+ )
            // ASP.g:12535:3: ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+
            {
            // ASP.g:12535:3: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ASP.g:12535:4: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // ASP.g:12535:9: ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0 >= '1' && LA7_0 <= '9')) ) {
                alt7=1;
            }
            else if ( (LA7_0=='0') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // ASP.g:12535:10: ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // ASP.g:12535:21: ( '0' .. '9' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ASP.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // ASP.g:12535:35: '0'
                    {
                    match('0'); 

                    }
                    break;

            }


            match('.'); 

            // ASP.g:12535:44: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ASP.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:12538:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ ) )
            // ASP.g:12539:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            {
            // ASP.g:12539:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            // ASP.g:12539:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            {
            // ASP.g:12539:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='-'||(LA9_0 >= '0' && LA9_0 <= '9')||(LA9_0 >= 'A' && LA9_0 <= 'Z')||LA9_0=='_'||(LA9_0 >= 'a' && LA9_0 <= 'z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ASP.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:12541:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // ASP.g:12542:2: ( ( ' ' | '\\t' | '\\f' ) )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "LINEBREAK"
    public final void mLINEBREAK() throws RecognitionException {
        try {
            int _type = LINEBREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:12545:10: ( ( ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // ASP.g:12546:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // ASP.g:12546:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // ASP.g:12546:3: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // ASP.g:12546:3: ( '\\r\\n' | '\\r' | '\\n' )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\r') ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1=='\n') ) {
                    alt10=1;
                }
                else {
                    alt10=2;
                }
            }
            else if ( (LA10_0=='\n') ) {
                alt10=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // ASP.g:12546:4: '\\r\\n'
                    {
                    match("\r\n"); 



                    }
                    break;
                case 2 :
                    // ASP.g:12546:13: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // ASP.g:12546:20: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINEBREAK"

    // $ANTLR start "QUOTED_34_34"
    public final void mQUOTED_34_34() throws RecognitionException {
        try {
            int _type = QUOTED_34_34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:12549:13: ( ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) ) )
            // ASP.g:12550:2: ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) )
            {
            // ASP.g:12550:2: ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) )
            // ASP.g:12550:3: ( '\"' ) (~ ( '\"' ) )* ( '\"' )
            {
            // ASP.g:12550:3: ( '\"' )
            // ASP.g:12550:4: '\"'
            {
            match('\"'); 

            }


            // ASP.g:12550:8: (~ ( '\"' ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0 >= '\u0000' && LA11_0 <= '!')||(LA11_0 >= '#' && LA11_0 <= '\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ASP.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            // ASP.g:12550:17: ( '\"' )
            // ASP.g:12550:18: '\"'
            {
            match('\"'); 

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUOTED_34_34"

    public void mTokens() throws RecognitionException {
        // ASP.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | COMMENT | INTEGER | FLOAT | TEXT | WHITESPACE | LINEBREAK | QUOTED_34_34 )
        int alt12=68;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ASP.g:1:10: T__11
                {
                mT__11(); 


                }
                break;
            case 2 :
                // ASP.g:1:16: T__12
                {
                mT__12(); 


                }
                break;
            case 3 :
                // ASP.g:1:22: T__13
                {
                mT__13(); 


                }
                break;
            case 4 :
                // ASP.g:1:28: T__14
                {
                mT__14(); 


                }
                break;
            case 5 :
                // ASP.g:1:34: T__15
                {
                mT__15(); 


                }
                break;
            case 6 :
                // ASP.g:1:40: T__16
                {
                mT__16(); 


                }
                break;
            case 7 :
                // ASP.g:1:46: T__17
                {
                mT__17(); 


                }
                break;
            case 8 :
                // ASP.g:1:52: T__18
                {
                mT__18(); 


                }
                break;
            case 9 :
                // ASP.g:1:58: T__19
                {
                mT__19(); 


                }
                break;
            case 10 :
                // ASP.g:1:64: T__20
                {
                mT__20(); 


                }
                break;
            case 11 :
                // ASP.g:1:70: T__21
                {
                mT__21(); 


                }
                break;
            case 12 :
                // ASP.g:1:76: T__22
                {
                mT__22(); 


                }
                break;
            case 13 :
                // ASP.g:1:82: T__23
                {
                mT__23(); 


                }
                break;
            case 14 :
                // ASP.g:1:88: T__24
                {
                mT__24(); 


                }
                break;
            case 15 :
                // ASP.g:1:94: T__25
                {
                mT__25(); 


                }
                break;
            case 16 :
                // ASP.g:1:100: T__26
                {
                mT__26(); 


                }
                break;
            case 17 :
                // ASP.g:1:106: T__27
                {
                mT__27(); 


                }
                break;
            case 18 :
                // ASP.g:1:112: T__28
                {
                mT__28(); 


                }
                break;
            case 19 :
                // ASP.g:1:118: T__29
                {
                mT__29(); 


                }
                break;
            case 20 :
                // ASP.g:1:124: T__30
                {
                mT__30(); 


                }
                break;
            case 21 :
                // ASP.g:1:130: T__31
                {
                mT__31(); 


                }
                break;
            case 22 :
                // ASP.g:1:136: T__32
                {
                mT__32(); 


                }
                break;
            case 23 :
                // ASP.g:1:142: T__33
                {
                mT__33(); 


                }
                break;
            case 24 :
                // ASP.g:1:148: T__34
                {
                mT__34(); 


                }
                break;
            case 25 :
                // ASP.g:1:154: T__35
                {
                mT__35(); 


                }
                break;
            case 26 :
                // ASP.g:1:160: T__36
                {
                mT__36(); 


                }
                break;
            case 27 :
                // ASP.g:1:166: T__37
                {
                mT__37(); 


                }
                break;
            case 28 :
                // ASP.g:1:172: T__38
                {
                mT__38(); 


                }
                break;
            case 29 :
                // ASP.g:1:178: T__39
                {
                mT__39(); 


                }
                break;
            case 30 :
                // ASP.g:1:184: T__40
                {
                mT__40(); 


                }
                break;
            case 31 :
                // ASP.g:1:190: T__41
                {
                mT__41(); 


                }
                break;
            case 32 :
                // ASP.g:1:196: T__42
                {
                mT__42(); 


                }
                break;
            case 33 :
                // ASP.g:1:202: T__43
                {
                mT__43(); 


                }
                break;
            case 34 :
                // ASP.g:1:208: T__44
                {
                mT__44(); 


                }
                break;
            case 35 :
                // ASP.g:1:214: T__45
                {
                mT__45(); 


                }
                break;
            case 36 :
                // ASP.g:1:220: T__46
                {
                mT__46(); 


                }
                break;
            case 37 :
                // ASP.g:1:226: T__47
                {
                mT__47(); 


                }
                break;
            case 38 :
                // ASP.g:1:232: T__48
                {
                mT__48(); 


                }
                break;
            case 39 :
                // ASP.g:1:238: T__49
                {
                mT__49(); 


                }
                break;
            case 40 :
                // ASP.g:1:244: T__50
                {
                mT__50(); 


                }
                break;
            case 41 :
                // ASP.g:1:250: T__51
                {
                mT__51(); 


                }
                break;
            case 42 :
                // ASP.g:1:256: T__52
                {
                mT__52(); 


                }
                break;
            case 43 :
                // ASP.g:1:262: T__53
                {
                mT__53(); 


                }
                break;
            case 44 :
                // ASP.g:1:268: T__54
                {
                mT__54(); 


                }
                break;
            case 45 :
                // ASP.g:1:274: T__55
                {
                mT__55(); 


                }
                break;
            case 46 :
                // ASP.g:1:280: T__56
                {
                mT__56(); 


                }
                break;
            case 47 :
                // ASP.g:1:286: T__57
                {
                mT__57(); 


                }
                break;
            case 48 :
                // ASP.g:1:292: T__58
                {
                mT__58(); 


                }
                break;
            case 49 :
                // ASP.g:1:298: T__59
                {
                mT__59(); 


                }
                break;
            case 50 :
                // ASP.g:1:304: T__60
                {
                mT__60(); 


                }
                break;
            case 51 :
                // ASP.g:1:310: T__61
                {
                mT__61(); 


                }
                break;
            case 52 :
                // ASP.g:1:316: T__62
                {
                mT__62(); 


                }
                break;
            case 53 :
                // ASP.g:1:322: T__63
                {
                mT__63(); 


                }
                break;
            case 54 :
                // ASP.g:1:328: T__64
                {
                mT__64(); 


                }
                break;
            case 55 :
                // ASP.g:1:334: T__65
                {
                mT__65(); 


                }
                break;
            case 56 :
                // ASP.g:1:340: T__66
                {
                mT__66(); 


                }
                break;
            case 57 :
                // ASP.g:1:346: T__67
                {
                mT__67(); 


                }
                break;
            case 58 :
                // ASP.g:1:352: T__68
                {
                mT__68(); 


                }
                break;
            case 59 :
                // ASP.g:1:358: T__69
                {
                mT__69(); 


                }
                break;
            case 60 :
                // ASP.g:1:364: T__70
                {
                mT__70(); 


                }
                break;
            case 61 :
                // ASP.g:1:370: T__71
                {
                mT__71(); 


                }
                break;
            case 62 :
                // ASP.g:1:376: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 63 :
                // ASP.g:1:384: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 64 :
                // ASP.g:1:392: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 65 :
                // ASP.g:1:398: TEXT
                {
                mTEXT(); 


                }
                break;
            case 66 :
                // ASP.g:1:403: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 67 :
                // ASP.g:1:414: LINEBREAK
                {
                mLINEBREAK(); 


                }
                break;
            case 68 :
                // ASP.g:1:424: QUOTED_34_34
                {
                mQUOTED_34_34(); 


                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\2\uffff\23\33\3\uffff\1\33\2\100\4\uffff\2\33\1\105\35\33\1\100"+
        "\2\uffff\3\33\1\uffff\4\33\1\161\37\33\1\u0092\4\33\1\u009a\1\33"+
        "\1\uffff\1\u009c\23\33\1\u00b2\10\33\1\u00bc\2\33\1\uffff\7\33\1"+
        "\uffff\1\u00c6\1\uffff\17\33\1\u00d6\5\33\1\uffff\11\33\1\uffff"+
        "\11\33\1\uffff\7\33\1\u00f6\7\33\1\uffff\5\33\1\u0105\1\33\1\u0107"+
        "\2\33\1\u010a\10\33\1\u0113\12\33\1\u011f\1\uffff\1\u0121\1\33\1"+
        "\u0123\3\33\1\u0127\1\u0128\1\u0129\5\33\1\uffff\1\33\1\uffff\2"+
        "\33\1\uffff\6\33\1\u013a\1\33\1\uffff\1\u013c\1\33\1\u013e\1\u013f"+
        "\1\u0140\1\33\1\u0142\3\33\1\u0147\1\uffff\1\u0148\1\uffff\1\33"+
        "\1\uffff\3\33\3\uffff\1\33\1\u014e\1\u014f\6\33\1\u0157\6\33\1\uffff"+
        "\1\33\1\uffff\1\u015f\3\uffff\1\33\1\uffff\4\33\2\uffff\5\33\2\uffff"+
        "\1\u016b\1\u016d\1\33\1\u016f\1\33\1\u0171\1\33\1\uffff\5\33\1\u0178"+
        "\1\33\1\uffff\6\33\1\u0180\1\u0181\1\u0182\1\u0183\1\33\1\uffff"+
        "\1\u0185\1\uffff\1\33\1\uffff\1\u0187\1\uffff\1\u0188\1\u0189\1"+
        "\33\1\u018b\2\33\1\uffff\1\u018e\4\33\1\u0193\1\33\4\uffff\1\u0195"+
        "\1\uffff\1\33\3\uffff\1\33\1\uffff\2\33\1\uffff\1\u019a\3\33\1\uffff"+
        "\1\u019e\1\uffff\3\33\1\u01a2\1\uffff\1\33\1\u01a4\1\33\1\uffff"+
        "\1\u01a6\2\33\1\uffff\1\u01a9\1\uffff\1\u01aa\1\uffff\2\33\2\uffff"+
        "\1\u01ad\1\u01ae\2\uffff";
    static final String DFA12_eofS =
        "\u01af\uffff";
    static final String DFA12_minS =
        "\1\11\1\uffff\1\157\1\144\2\145\1\157\1\162\2\145\1\157\1\144\1"+
        "\163\2\145\2\141\1\145\1\157\1\141\1\163\3\uffff\1\60\2\55\4\uffff"+
        "\1\156\1\147\1\55\1\146\2\164\1\144\1\157\1\154\1\147\1\162\1\141"+
        "\1\155\1\147\1\145\1\104\1\146\1\143\1\141\1\164\1\155\1\144\1\162"+
        "\1\157\1\154\1\147\1\141\1\165\1\162\1\160\1\145\1\56\1\55\2\uffff"+
        "\1\163\1\145\1\151\1\uffff\1\164\1\145\1\141\1\145\1\55\1\160\1"+
        "\141\1\150\1\155\1\156\1\155\1\163\1\145\1\155\1\145\1\144\1\145"+
        "\1\157\2\162\1\164\1\141\1\164\1\141\2\145\1\141\1\160\1\141\1\150"+
        "\1\164\1\162\1\147\1\145\1\144\1\164\1\55\1\155\1\120\1\162\1\145"+
        "\1\55\1\161\1\uffff\1\55\2\164\1\151\1\163\1\145\1\164\1\145\1\111"+
        "\1\145\1\146\1\147\1\164\1\144\1\157\1\141\1\61\2\164\1\103\1\55"+
        "\1\111\1\155\1\111\3\164\1\143\1\145\1\55\1\114\1\162\1\uffff\1"+
        "\160\2\141\1\144\2\157\1\162\1\uffff\1\55\1\uffff\1\151\1\120\1"+
        "\156\1\146\1\156\1\162\1\156\1\144\1\156\1\151\1\145\1\141\1\145"+
        "\1\160\1\143\1\55\1\162\1\151\1\145\1\154\1\157\1\uffff\1\144\1"+
        "\145\1\144\1\141\1\151\1\61\2\145\1\164\1\uffff\1\151\1\141\1\154"+
        "\1\164\1\154\1\147\2\144\1\157\1\uffff\1\157\2\141\1\157\1\164\1"+
        "\141\1\164\1\55\1\164\1\156\1\170\1\145\2\170\1\145\1\uffff\1\151"+
        "\1\157\1\162\1\141\1\144\1\55\1\164\1\55\1\154\1\157\1\55\1\154"+
        "\1\162\2\115\1\164\1\151\1\145\1\164\1\55\3\145\1\160\1\156\1\164"+
        "\1\154\1\162\1\163\1\151\1\55\1\uffff\1\55\1\151\1\55\1\144\1\157"+
        "\1\162\3\55\1\147\2\156\1\163\1\145\1\uffff\1\145\1\uffff\1\165"+
        "\1\156\1\uffff\1\145\1\156\2\103\1\145\1\156\1\55\1\145\1\uffff"+
        "\1\55\1\154\3\55\1\164\1\55\1\155\1\101\1\156\1\55\1\uffff\1\55"+
        "\1\uffff\1\164\1\uffff\1\147\1\144\1\157\3\uffff\1\150\2\55\1\163"+
        "\1\154\1\162\1\145\1\111\1\146\1\55\1\111\1\164\1\111\1\164\1\162"+
        "\1\164\1\uffff\1\162\1\uffff\1\55\3\uffff\1\145\1\uffff\1\141\1"+
        "\146\1\145\1\164\2\uffff\1\151\2\145\1\160\1\164\2\uffff\2\55\1"+
        "\116\1\55\1\144\1\55\1\164\1\uffff\1\144\1\141\1\144\2\141\1\55"+
        "\1\156\1\uffff\1\162\2\164\1\146\1\163\1\157\4\55\1\144\1\uffff"+
        "\1\55\1\uffff\1\141\1\uffff\1\55\1\uffff\2\55\1\103\1\55\1\103\1"+
        "\154\1\uffff\1\55\1\156\1\151\1\145\1\157\1\55\1\156\4\uffff\1\55"+
        "\1\uffff\1\155\3\uffff\1\154\1\uffff\1\154\1\163\1\uffff\1\55\1"+
        "\157\2\162\1\uffff\1\55\1\uffff\1\145\2\141\1\55\1\uffff\1\156\1"+
        "\55\1\145\1\uffff\1\55\2\163\1\uffff\1\55\1\uffff\1\55\1\uffff\2"+
        "\163\2\uffff\2\55\2\uffff";
    static final String DFA12_maxS =
        "\1\175\1\uffff\1\157\1\161\1\151\1\145\1\157\1\162\1\151\1\162\1"+
        "\157\1\154\1\163\1\160\1\145\1\157\1\162\1\160\1\157\1\171\1\163"+
        "\3\uffff\1\71\2\172\4\uffff\1\156\1\147\1\172\1\146\3\164\1\157"+
        "\1\154\1\147\1\162\1\141\1\156\1\147\1\145\1\124\1\146\1\143\1\141"+
        "\1\164\1\155\1\144\1\162\1\157\1\154\1\147\1\141\1\165\1\162\1\160"+
        "\1\145\1\56\1\172\2\uffff\1\163\1\145\1\151\1\uffff\1\164\1\145"+
        "\1\141\1\145\1\172\1\160\1\141\1\150\1\155\1\156\1\155\1\164\1\145"+
        "\1\155\1\145\1\144\1\145\1\157\2\162\1\164\1\141\1\164\1\141\2\145"+
        "\1\141\1\160\1\141\1\150\1\164\1\162\1\147\1\145\1\144\1\164\1\172"+
        "\1\155\1\120\1\162\1\160\1\172\1\161\1\uffff\1\172\2\164\1\151\1"+
        "\163\1\145\1\164\1\145\1\111\1\145\1\146\1\147\1\164\1\144\1\157"+
        "\1\141\1\62\2\164\1\155\1\172\1\111\1\155\1\126\3\164\1\143\1\145"+
        "\1\172\1\114\1\162\1\uffff\1\160\2\141\1\144\2\157\1\162\1\uffff"+
        "\1\172\1\uffff\1\151\1\120\1\156\1\146\1\156\1\162\1\156\1\144\1"+
        "\156\1\151\1\145\1\141\1\145\1\160\1\143\1\172\1\162\1\151\1\145"+
        "\1\154\1\157\1\uffff\1\144\1\145\1\144\1\141\1\151\1\62\2\145\1"+
        "\164\1\uffff\1\151\1\141\1\154\1\164\1\154\1\147\2\144\1\157\1\uffff"+
        "\1\157\2\141\1\157\1\164\1\141\1\164\1\172\1\164\1\156\1\170\1\160"+
        "\2\170\1\145\1\uffff\1\151\1\157\1\162\1\141\1\144\1\172\1\164\1"+
        "\172\1\154\1\157\1\172\1\154\1\162\2\115\1\164\1\151\1\145\1\164"+
        "\1\172\3\145\1\160\1\156\1\164\1\154\1\162\1\163\1\151\1\172\1\uffff"+
        "\1\172\1\151\1\172\1\144\1\157\1\162\3\172\1\147\2\156\1\163\1\145"+
        "\1\uffff\1\145\1\uffff\1\165\1\156\1\uffff\1\145\1\156\3\145\1\156"+
        "\1\172\1\145\1\uffff\1\172\1\154\3\172\1\164\1\172\1\155\1\102\1"+
        "\156\1\172\1\uffff\1\172\1\uffff\1\164\1\uffff\1\147\1\144\1\157"+
        "\3\uffff\1\150\2\172\1\163\1\154\1\162\1\145\1\163\1\146\1\172\1"+
        "\111\1\164\1\111\1\164\1\162\1\164\1\uffff\1\162\1\uffff\1\172\3"+
        "\uffff\1\145\1\uffff\1\141\1\146\1\145\1\164\2\uffff\1\151\2\145"+
        "\1\160\1\164\2\uffff\2\172\1\116\1\172\1\144\1\172\1\164\1\uffff"+
        "\1\144\1\141\1\144\2\141\1\172\1\156\1\uffff\1\162\2\164\1\146\1"+
        "\163\1\157\4\172\1\144\1\uffff\1\172\1\uffff\1\141\1\uffff\1\172"+
        "\1\uffff\2\172\1\103\1\172\1\103\1\154\1\uffff\1\172\1\156\1\151"+
        "\1\145\1\157\1\172\1\156\4\uffff\1\172\1\uffff\1\155\3\uffff\1\154"+
        "\1\uffff\1\154\1\163\1\uffff\1\172\1\157\2\162\1\uffff\1\172\1\uffff"+
        "\1\145\2\141\1\172\1\uffff\1\156\1\172\1\145\1\uffff\1\172\2\163"+
        "\1\uffff\1\172\1\uffff\1\172\1\uffff\2\163\2\uffff\2\172\2\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\23\uffff\1\74\1\75\1\76\3\uffff\1\101\1\102\1\103\1"+
        "\104\41\uffff\1\77\1\100\3\uffff\1\4\53\uffff\1\15\40\uffff\1\3"+
        "\7\uffff\1\14\1\uffff\1\17\25\uffff\1\54\11\uffff\1\72\11\uffff"+
        "\1\16\17\uffff\1\44\37\uffff\1\31\16\uffff\1\55\1\uffff\1\57\2\uffff"+
        "\1\63\10\uffff\1\7\13\uffff\1\27\1\uffff\1\32\1\uffff\1\35\3\uffff"+
        "\1\41\1\42\1\43\20\uffff\1\5\1\uffff\1\10\1\uffff\1\12\1\13\1\20"+
        "\1\uffff\1\22\4\uffff\1\30\1\33\5\uffff\1\46\1\47\7\uffff\1\65\7"+
        "\uffff\1\11\13\uffff\1\50\1\uffff\1\52\1\uffff\1\60\1\uffff\1\62"+
        "\6\uffff\1\2\7\uffff\1\36\1\37\1\40\1\45\1\uffff\1\53\1\uffff\1"+
        "\61\1\64\1\66\1\uffff\1\70\2\uffff\1\6\4\uffff\1\26\1\uffff\1\51"+
        "\4\uffff\1\21\3\uffff\1\34\3\uffff\1\73\1\uffff\1\24\1\uffff\1\56"+
        "\2\uffff\1\23\1\25\2\uffff\1\67\1\71";
    static final String DFA12_specialS =
        "\u01af\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\34\1\35\1\uffff\1\34\1\35\22\uffff\1\34\1\uffff\1\36\12\uffff"+
            "\1\30\1\uffff\1\27\1\32\11\31\1\1\6\uffff\2\33\1\2\1\33\1\3"+
            "\6\33\1\4\1\5\1\6\1\33\1\7\1\33\1\10\1\33\1\11\6\33\4\uffff"+
            "\1\33\1\uffff\2\33\1\12\1\33\1\13\3\33\1\14\2\33\1\15\1\16\1"+
            "\17\1\33\1\20\1\33\1\21\1\22\1\23\1\24\5\33\1\25\1\uffff\1\26",
            "",
            "\1\37",
            "\1\40\14\uffff\1\41",
            "\1\42\3\uffff\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47\3\uffff\1\50",
            "\1\51\14\uffff\1\52",
            "\1\53",
            "\1\54\7\uffff\1\55",
            "\1\56",
            "\1\57\11\uffff\1\60\1\61",
            "\1\62",
            "\1\63\15\uffff\1\64",
            "\1\65\20\uffff\1\66",
            "\1\67\3\uffff\1\70\6\uffff\1\71",
            "\1\72",
            "\1\73\27\uffff\1\74",
            "\1\75",
            "",
            "",
            "",
            "\1\76\11\31",
            "\1\33\1\101\1\uffff\12\77\7\uffff\32\33\4\uffff\1\33\1\uffff"+
            "\32\33",
            "\1\33\1\101\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff"+
            "\32\33",
            "",
            "",
            "",
            "",
            "\1\102",
            "\1\103",
            "\1\33\2\uffff\12\33\7\uffff\22\33\1\104\7\33\4\uffff\1\33\1"+
            "\uffff\32\33",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111\17\uffff\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120\1\121",
            "\1\122",
            "\1\123",
            "\1\124\1\125\7\uffff\1\126\1\127\1\uffff\1\130\3\uffff\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\101",
            "\1\33\1\101\1\uffff\12\77\7\uffff\32\33\4\uffff\1\33\1\uffff"+
            "\32\33",
            "",
            "",
            "\1\151",
            "\1\152",
            "\1\153",
            "",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\33\2\uffff\12\33\7\uffff\4\33\1\160\25\33\4\uffff\1\33\1"+
            "\uffff\32\33",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096\7\uffff\1\u0097\1\u0098\1\uffff\1\u0099",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u009b",
            "",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0\51\uffff\1\u00b1",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5\14\uffff\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00bd",
            "\1\u00be",
            "",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa\10\uffff\1\u00fb\1\uffff\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0106",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0108",
            "\1\u0109",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\22\33"+
            "\1\u011e\7\33",
            "",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\22\33"+
            "\1\u0120\7\33",
            "\1\u0122",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "",
            "\1\u012f",
            "",
            "\1\u0130",
            "\1\u0131",
            "",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134\41\uffff\1\u0135",
            "\1\u0136\41\uffff\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u013b",
            "",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u013d",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0141",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0143",
            "\1\u0144\1\u0145",
            "\1\u0146",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\u0149",
            "",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "",
            "",
            "",
            "\1\u014d",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154\51\uffff\1\u0155",
            "\1\u0156",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "",
            "\1\u015e",
            "",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "",
            "\1\u0160",
            "",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "",
            "",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "",
            "",
            "\1\33\2\uffff\12\33\7\uffff\10\33\1\u016a\21\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\22\33"+
            "\1\u016c\7\33",
            "\1\u016e",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0170",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0172",
            "",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0179",
            "",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0184",
            "",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\u0186",
            "",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u018a",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u018c",
            "\1\u018d",
            "",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0194",
            "",
            "",
            "",
            "",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\u0196",
            "",
            "",
            "",
            "\1\u0197",
            "",
            "\1\u0198",
            "\1\u0199",
            "",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\u01a3",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u01a5",
            "",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u01a7",
            "\1\u01a8",
            "",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\u01ab",
            "\1\u01ac",
            "",
            "",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | COMMENT | INTEGER | FLOAT | TEXT | WHITESPACE | LINEBREAK | QUOTED_34_34 );";
        }
    }
 

}