// $ANTLR 3.4

	package ASP.resource.ASP.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ASPLexer extends Lexer {
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

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:15:6: ( '!=' )
            // ASP.g:15:8: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:16:7: ( ').' )
            // ASP.g:16:9: ').'
            {
            match(")."); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:17:7: ( ',' )
            // ASP.g:17:9: ','
            {
            match(','); 

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
            // ASP.g:18:7: ( '.' )
            // ASP.g:18:9: '.'
            {
            match('.'); 

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
            // ASP.g:19:7: ( ':-' )
            // ASP.g:19:9: ':-'
            {
            match(":-"); 



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
            // ASP.g:20:7: ( '==' )
            // ASP.g:20:9: '=='
            {
            match("=="); 



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
            // ASP.g:21:7: ( 'edge(' )
            // ASP.g:21:9: 'edge('
            {
            match("edge("); 



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
            // ASP.g:22:7: ( 'edgex(' )
            // ASP.g:22:9: 'edgex('
            {
            match("edgex("); 



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
            // ASP.g:23:7: ( 'metaedge(' )
            // ASP.g:23:9: 'metaedge('
            {
            match("metaedge("); 



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
            // ASP.g:24:7: ( 'metanode(' )
            // ASP.g:24:9: 'metanode('
            {
            match("metanode("); 



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
            // ASP.g:25:7: ( 'metaprop(' )
            // ASP.g:25:9: 'metaprop('
            {
            match("metaprop("); 



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
            // ASP.g:26:7: ( 'node(' )
            // ASP.g:26:9: 'node('
            {
            match("node("); 



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
            // ASP.g:27:7: ( 'nodex(' )
            // ASP.g:27:9: 'nodex('
            {
            match("nodex("); 



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
            // ASP.g:28:7: ( 'not' )
            // ASP.g:28:9: 'not'
            {
            match("not"); 



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
            // ASP.g:29:7: ( 'prop(' )
            // ASP.g:29:9: 'prop('
            {
            match("prop("); 



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
            // ASP.g:30:7: ( 'propx(' )
            // ASP.g:30:9: 'propx('
            {
            match("propx("); 



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
            // ASP.g:31:7: ( 'relation_edge' )
            // ASP.g:31:9: 'relation_edge'
            {
            match("relation_edge"); 



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
            // ASP.g:32:7: ( 'relation_node' )
            // ASP.g:32:9: 'relation_node'
            {
            match("relation_node"); 



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
            // ASP.g:33:7: ( 'relation_prop' )
            // ASP.g:33:9: 'relation_prop'
            {
            match("relation_prop"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:3077:8: ( ( '%' (~ ( '\\n' | '\\r' | '\\uffff' ) )* ) )
            // ASP.g:3078:2: ( '%' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            {
            // ASP.g:3078:2: ( '%' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            // ASP.g:3078:3: '%' (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            {
            match('%'); 

            // ASP.g:3078:6: (~ ( '\\n' | '\\r' | '\\uffff' ) )*
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

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:3081:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' | '!' | ':' )+ ) )
            // ASP.g:3082:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' | '!' | ':' )+ )
            {
            // ASP.g:3082:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' | '!' | ':' )+ )
            // ASP.g:3082:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' | '!' | ':' )+
            {
            // ASP.g:3082:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' | '!' | ':' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='!'||LA2_0=='-'||(LA2_0 >= '0' && LA2_0 <= ':')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ASP.g:
            	    {
            	    if ( input.LA(1)=='!'||input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= ':')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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

    // $ANTLR start "LINEBREAK"
    public final void mLINEBREAK() throws RecognitionException {
        try {
            int _type = LINEBREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:3084:10: ( ( ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // ASP.g:3085:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // ASP.g:3085:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // ASP.g:3085:3: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // ASP.g:3085:3: ( '\\r\\n' | '\\r' | '\\n' )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='\n') ) {
                    alt3=1;
                }
                else {
                    alt3=2;
                }
            }
            else if ( (LA3_0=='\n') ) {
                alt3=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // ASP.g:3085:4: '\\r\\n'
                    {
                    match("\r\n"); 



                    }
                    break;
                case 2 :
                    // ASP.g:3085:11: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // ASP.g:3085:16: '\\n'
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

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:3088:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // ASP.g:3089:2: ( ( ' ' | '\\t' | '\\f' ) )
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

    // $ANTLR start "QUOTED_40_41"
    public final void mQUOTED_40_41() throws RecognitionException {
        try {
            int _type = QUOTED_40_41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASP.g:3092:13: ( ( ( '(' ) (~ ( ')' ) )* ( ')' ) ) )
            // ASP.g:3093:2: ( ( '(' ) (~ ( ')' ) )* ( ')' ) )
            {
            // ASP.g:3093:2: ( ( '(' ) (~ ( ')' ) )* ( ')' ) )
            // ASP.g:3093:3: ( '(' ) (~ ( ')' ) )* ( ')' )
            {
            // ASP.g:3093:3: ( '(' )
            // ASP.g:3093:4: '('
            {
            match('('); 

            }


            // ASP.g:3093:8: (~ ( ')' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '\u0000' && LA4_0 <= '(')||(LA4_0 >= '*' && LA4_0 <= '\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ASP.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '(')||(input.LA(1) >= '*' && input.LA(1) <= '\uFFFF') ) {
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
            	    break loop4;
                }
            } while (true);


            // ASP.g:3093:17: ( ')' )
            // ASP.g:3093:18: ')'
            {
            match(')'); 

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
    // $ANTLR end "QUOTED_40_41"

    public void mTokens() throws RecognitionException {
        // ASP.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | COMMENT | TEXT | LINEBREAK | WHITESPACE | QUOTED_40_41 )
        int alt5=24;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // ASP.g:1:10: T__9
                {
                mT__9(); 


                }
                break;
            case 2 :
                // ASP.g:1:15: T__10
                {
                mT__10(); 


                }
                break;
            case 3 :
                // ASP.g:1:21: T__11
                {
                mT__11(); 


                }
                break;
            case 4 :
                // ASP.g:1:27: T__12
                {
                mT__12(); 


                }
                break;
            case 5 :
                // ASP.g:1:33: T__13
                {
                mT__13(); 


                }
                break;
            case 6 :
                // ASP.g:1:39: T__14
                {
                mT__14(); 


                }
                break;
            case 7 :
                // ASP.g:1:45: T__15
                {
                mT__15(); 


                }
                break;
            case 8 :
                // ASP.g:1:51: T__16
                {
                mT__16(); 


                }
                break;
            case 9 :
                // ASP.g:1:57: T__17
                {
                mT__17(); 


                }
                break;
            case 10 :
                // ASP.g:1:63: T__18
                {
                mT__18(); 


                }
                break;
            case 11 :
                // ASP.g:1:69: T__19
                {
                mT__19(); 


                }
                break;
            case 12 :
                // ASP.g:1:75: T__20
                {
                mT__20(); 


                }
                break;
            case 13 :
                // ASP.g:1:81: T__21
                {
                mT__21(); 


                }
                break;
            case 14 :
                // ASP.g:1:87: T__22
                {
                mT__22(); 


                }
                break;
            case 15 :
                // ASP.g:1:93: T__23
                {
                mT__23(); 


                }
                break;
            case 16 :
                // ASP.g:1:99: T__24
                {
                mT__24(); 


                }
                break;
            case 17 :
                // ASP.g:1:105: T__25
                {
                mT__25(); 


                }
                break;
            case 18 :
                // ASP.g:1:111: T__26
                {
                mT__26(); 


                }
                break;
            case 19 :
                // ASP.g:1:117: T__27
                {
                mT__27(); 


                }
                break;
            case 20 :
                // ASP.g:1:123: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 21 :
                // ASP.g:1:131: TEXT
                {
                mTEXT(); 


                }
                break;
            case 22 :
                // ASP.g:1:136: LINEBREAK
                {
                mLINEBREAK(); 


                }
                break;
            case 23 :
                // ASP.g:1:146: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 24 :
                // ASP.g:1:157: QUOTED_40_41
                {
                mQUOTED_40_41(); 


                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\1\uffff\1\15\3\uffff\1\15\1\uffff\5\15\6\uffff\1\30\5\15\1\uffff"+
        "\3\15\1\42\5\15\1\uffff\2\15\1\uffff\4\15\1\uffff\1\15\1\uffff\2"+
        "\15\1\uffff\3\15\2\uffff\11\15\3\uffff\12\15\1\116\1\117\1\120\3"+
        "\uffff";
    static final String DFA5_eofS =
        "\121\uffff";
    static final String DFA5_minS =
        "\1\11\1\75\3\uffff\1\55\1\uffff\1\144\1\145\1\157\1\162\1\145\6"+
        "\uffff\1\41\1\147\1\164\1\144\1\157\1\154\1\uffff\1\145\1\141\1"+
        "\145\1\41\1\160\1\141\1\50\1\145\1\50\1\uffff\1\50\1\164\1\uffff"+
        "\1\50\1\144\1\157\1\162\1\uffff\1\50\1\uffff\1\50\1\151\1\uffff"+
        "\1\147\1\144\1\157\2\uffff\1\157\2\145\1\160\1\156\3\50\1\137\3"+
        "\uffff\1\145\1\144\1\157\1\162\1\147\1\144\1\157\2\145\1\160\3\41"+
        "\3\uffff";
    static final String DFA5_maxS =
        "\1\172\1\75\3\uffff\1\55\1\uffff\1\144\1\145\1\157\1\162\1\145\6"+
        "\uffff\1\172\1\147\2\164\1\157\1\154\1\uffff\1\145\1\141\1\145\1"+
        "\172\1\160\1\141\1\170\1\160\1\170\1\uffff\1\170\1\164\1\uffff\1"+
        "\50\1\144\1\157\1\162\1\uffff\1\50\1\uffff\1\50\1\151\1\uffff\1"+
        "\147\1\144\1\157\2\uffff\1\157\2\145\1\160\1\156\3\50\1\137\3\uffff"+
        "\1\160\1\144\1\157\1\162\1\147\1\144\1\157\2\145\1\160\3\172\3\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\uffff\1\6\5\uffff\1\24\1\25\1\26\1\27\1\30"+
        "\1\1\6\uffff\1\5\11\uffff\1\16\2\uffff\1\7\4\uffff\1\14\1\uffff"+
        "\1\17\2\uffff\1\10\3\uffff\1\15\1\20\11\uffff\1\11\1\12\1\13\15"+
        "\uffff\1\21\1\22\1\23";
    static final String DFA5_specialS =
        "\121\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\17\1\16\1\uffff\1\17\1\16\22\uffff\1\17\1\1\3\uffff\1\14"+
            "\2\uffff\1\20\1\2\2\uffff\1\3\1\15\1\4\1\uffff\12\15\1\5\2\uffff"+
            "\1\6\3\uffff\32\15\4\uffff\1\15\1\uffff\4\15\1\7\7\15\1\10\1"+
            "\11\1\15\1\12\1\15\1\13\10\15",
            "\1\21",
            "",
            "",
            "",
            "\1\22",
            "",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\15\13\uffff\1\15\2\uffff\13\15\6\uffff\32\15\4\uffff\1\15"+
            "\1\uffff\32\15",
            "\1\31",
            "\1\32",
            "\1\33\17\uffff\1\34",
            "\1\35",
            "\1\36",
            "",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\15\13\uffff\1\15\2\uffff\13\15\6\uffff\32\15\4\uffff\1\15"+
            "\1\uffff\32\15",
            "\1\43",
            "\1\44",
            "\1\45\117\uffff\1\46",
            "\1\47\10\uffff\1\50\1\uffff\1\51",
            "\1\52\117\uffff\1\53",
            "",
            "\1\54\117\uffff\1\55",
            "\1\56",
            "",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "",
            "\1\63",
            "",
            "\1\64",
            "\1\65",
            "",
            "\1\66",
            "\1\67",
            "\1\70",
            "",
            "",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "",
            "",
            "",
            "\1\102\10\uffff\1\103\1\uffff\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\15\13\uffff\1\15\2\uffff\13\15\6\uffff\32\15\4\uffff\1\15"+
            "\1\uffff\32\15",
            "\1\15\13\uffff\1\15\2\uffff\13\15\6\uffff\32\15\4\uffff\1\15"+
            "\1\uffff\32\15",
            "\1\15\13\uffff\1\15\2\uffff\13\15\6\uffff\32\15\4\uffff\1\15"+
            "\1\uffff\32\15",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | COMMENT | TEXT | LINEBREAK | WHITESPACE | QUOTED_40_41 );";
        }
    }
 

}