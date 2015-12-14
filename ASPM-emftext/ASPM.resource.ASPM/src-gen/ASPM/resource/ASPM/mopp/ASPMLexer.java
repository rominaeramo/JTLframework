// $ANTLR 3.4

	package ASPM.resource.ASPM.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ASPMLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int LINEBREAK=4;
    public static final int TEXT=5;
    public static final int WHITESPACE=6;

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

    public ASPMLexer() {} 
    public ASPMLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ASPMLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "ASPM.g"; }

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASPM.g:15:6: ( '(' )
            // ASPM.g:15:8: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASPM.g:16:6: ( ')' )
            // ASPM.g:16:8: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASPM.g:17:6: ( ',' )
            // ASPM.g:17:8: ','
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
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASPM.g:18:7: ( '.' )
            // ASPM.g:18:9: '.'
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
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASPM.g:19:7: ( 'edge' )
            // ASPM.g:19:9: 'edge'
            {
            match("edge"); 



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
            // ASPM.g:20:7: ( 'model' )
            // ASPM.g:20:9: 'model'
            {
            match("model"); 



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
            // ASPM.g:21:7: ( 'node' )
            // ASPM.g:21:9: 'node'
            {
            match("node"); 



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
            // ASPM.g:22:7: ( 'prop' )
            // ASPM.g:22:9: 'prop'
            {
            match("prop"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ASPM.g:1732:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ ) )
            // ASPM.g:1733:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            {
            // ASPM.g:1733:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            // ASPM.g:1733:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            {
            // ASPM.g:1733:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='-'||(LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ASPM.g:
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
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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
            // ASPM.g:1735:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // ASPM.g:1736:2: ( ( ' ' | '\\t' | '\\f' ) )
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
            // ASPM.g:1739:10: ( ( ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // ASPM.g:1740:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // ASPM.g:1740:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // ASPM.g:1740:3: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // ASPM.g:1740:3: ( '\\r\\n' | '\\r' | '\\n' )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\r') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='\n') ) {
                    alt2=1;
                }
                else {
                    alt2=2;
                }
            }
            else if ( (LA2_0=='\n') ) {
                alt2=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // ASPM.g:1740:4: '\\r\\n'
                    {
                    match("\r\n"); 



                    }
                    break;
                case 2 :
                    // ASPM.g:1740:13: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // ASPM.g:1740:20: '\\n'
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

    public void mTokens() throws RecognitionException {
        // ASPM.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | TEXT | WHITESPACE | LINEBREAK )
        int alt3=11;
        switch ( input.LA(1) ) {
        case '(':
            {
            alt3=1;
            }
            break;
        case ')':
            {
            alt3=2;
            }
            break;
        case ',':
            {
            alt3=3;
            }
            break;
        case '.':
            {
            alt3=4;
            }
            break;
        case 'e':
            {
            int LA3_5 = input.LA(2);

            if ( (LA3_5=='d') ) {
                int LA3_12 = input.LA(3);

                if ( (LA3_12=='g') ) {
                    int LA3_16 = input.LA(4);

                    if ( (LA3_16=='e') ) {
                        int LA3_20 = input.LA(5);

                        if ( (LA3_20=='-'||(LA3_20 >= '0' && LA3_20 <= '9')||(LA3_20 >= 'A' && LA3_20 <= 'Z')||LA3_20=='_'||(LA3_20 >= 'a' && LA3_20 <= 'z')) ) {
                            alt3=9;
                        }
                        else {
                            alt3=5;
                        }
                    }
                    else {
                        alt3=9;
                    }
                }
                else {
                    alt3=9;
                }
            }
            else {
                alt3=9;
            }
            }
            break;
        case 'm':
            {
            int LA3_6 = input.LA(2);

            if ( (LA3_6=='o') ) {
                int LA3_13 = input.LA(3);

                if ( (LA3_13=='d') ) {
                    int LA3_17 = input.LA(4);

                    if ( (LA3_17=='e') ) {
                        int LA3_21 = input.LA(5);

                        if ( (LA3_21=='l') ) {
                            int LA3_25 = input.LA(6);

                            if ( (LA3_25=='-'||(LA3_25 >= '0' && LA3_25 <= '9')||(LA3_25 >= 'A' && LA3_25 <= 'Z')||LA3_25=='_'||(LA3_25 >= 'a' && LA3_25 <= 'z')) ) {
                                alt3=9;
                            }
                            else {
                                alt3=6;
                            }
                        }
                        else {
                            alt3=9;
                        }
                    }
                    else {
                        alt3=9;
                    }
                }
                else {
                    alt3=9;
                }
            }
            else {
                alt3=9;
            }
            }
            break;
        case 'n':
            {
            int LA3_7 = input.LA(2);

            if ( (LA3_7=='o') ) {
                int LA3_14 = input.LA(3);

                if ( (LA3_14=='d') ) {
                    int LA3_18 = input.LA(4);

                    if ( (LA3_18=='e') ) {
                        int LA3_22 = input.LA(5);

                        if ( (LA3_22=='-'||(LA3_22 >= '0' && LA3_22 <= '9')||(LA3_22 >= 'A' && LA3_22 <= 'Z')||LA3_22=='_'||(LA3_22 >= 'a' && LA3_22 <= 'z')) ) {
                            alt3=9;
                        }
                        else {
                            alt3=7;
                        }
                    }
                    else {
                        alt3=9;
                    }
                }
                else {
                    alt3=9;
                }
            }
            else {
                alt3=9;
            }
            }
            break;
        case 'p':
            {
            int LA3_8 = input.LA(2);

            if ( (LA3_8=='r') ) {
                int LA3_15 = input.LA(3);

                if ( (LA3_15=='o') ) {
                    int LA3_19 = input.LA(4);

                    if ( (LA3_19=='p') ) {
                        int LA3_23 = input.LA(5);

                        if ( (LA3_23=='-'||(LA3_23 >= '0' && LA3_23 <= '9')||(LA3_23 >= 'A' && LA3_23 <= 'Z')||LA3_23=='_'||(LA3_23 >= 'a' && LA3_23 <= 'z')) ) {
                            alt3=9;
                        }
                        else {
                            alt3=8;
                        }
                    }
                    else {
                        alt3=9;
                    }
                }
                else {
                    alt3=9;
                }
            }
            else {
                alt3=9;
            }
            }
            break;
        case '-':
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '_':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'o':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt3=9;
            }
            break;
        case '\t':
        case '\f':
        case ' ':
            {
            alt3=10;
            }
            break;
        case '\n':
        case '\r':
            {
            alt3=11;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 3, 0, input);

            throw nvae;

        }

        switch (alt3) {
            case 1 :
                // ASPM.g:1:10: T__7
                {
                mT__7(); 


                }
                break;
            case 2 :
                // ASPM.g:1:15: T__8
                {
                mT__8(); 


                }
                break;
            case 3 :
                // ASPM.g:1:20: T__9
                {
                mT__9(); 


                }
                break;
            case 4 :
                // ASPM.g:1:25: T__10
                {
                mT__10(); 


                }
                break;
            case 5 :
                // ASPM.g:1:31: T__11
                {
                mT__11(); 


                }
                break;
            case 6 :
                // ASPM.g:1:37: T__12
                {
                mT__12(); 


                }
                break;
            case 7 :
                // ASPM.g:1:43: T__13
                {
                mT__13(); 


                }
                break;
            case 8 :
                // ASPM.g:1:49: T__14
                {
                mT__14(); 


                }
                break;
            case 9 :
                // ASPM.g:1:55: TEXT
                {
                mTEXT(); 


                }
                break;
            case 10 :
                // ASPM.g:1:60: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 11 :
                // ASPM.g:1:71: LINEBREAK
                {
                mLINEBREAK(); 


                }
                break;

        }

    }


 

}