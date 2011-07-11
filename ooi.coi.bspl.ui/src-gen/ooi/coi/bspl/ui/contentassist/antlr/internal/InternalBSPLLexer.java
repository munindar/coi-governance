package ooi.coi.bspl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBSPLLexer extends Lexer {
    public static final int RULE_ID=13;
    public static final int RULE_RBRACE=6;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=19;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_COMMA=5;
    public static final int RULE_LBRACKET=9;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=17;
    public static final int RULE_ML_COMMENT=16;
    public static final int RULE_COLON=8;
    public static final int RULE_STRING=15;
    public static final int RULE_LPAREN=11;
    public static final int RULE_ARROW=7;
    public static final int RULE_INT=14;
    public static final int RULE_LBRACE=4;
    public static final int RULE_RPAREN=12;
    public static final int RULE_WS=18;
    public static final int RULE_RBRACKET=10;

    // delegates
    // delegators

    public InternalBSPLLexer() {;} 
    public InternalBSPLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalBSPLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g"; }

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:11:7: ( 'protocol' )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:11:9: 'protocol'
            {
            match("protocol"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:12:7: ( 'role' )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:12:9: 'role'
            {
            match("role"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:13:7: ( 'parameter' )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:13:9: 'parameter'
            {
            match("parameter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:14:7: ( 'private' )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:14:9: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:15:7: ( 'key' )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:15:9: 'key'
            {
            match("key"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:16:7: ( 'in' )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:16:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:17:7: ( 'out' )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:17:9: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:18:7: ( 'io' )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:18:9: 'io'
            {
            match("io"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:19:7: ( 'nil' )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:19:9: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "RULE_ARROW"
    public final void mRULE_ARROW() throws RecognitionException {
        try {
            int _type = RULE_ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2463:12: ( ( '->' | '&rarr;' ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2463:14: ( '->' | '&rarr;' )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2463:14: ( '->' | '&rarr;' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            else if ( (LA1_0=='&') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2463:15: '->'
                    {
                    match("->"); 


                    }
                    break;
                case 2 :
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2463:20: '&rarr;'
                    {
                    match("&rarr;"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ARROW"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2465:12: ( ',' )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2465:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2467:12: ( ':' )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2467:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_LBRACE"
    public final void mRULE_LBRACE() throws RecognitionException {
        try {
            int _type = RULE_LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2469:13: ( '{' )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2469:15: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LBRACE"

    // $ANTLR start "RULE_RBRACE"
    public final void mRULE_RBRACE() throws RecognitionException {
        try {
            int _type = RULE_RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2471:13: ( '}' )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2471:15: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RBRACE"

    // $ANTLR start "RULE_LBRACKET"
    public final void mRULE_LBRACKET() throws RecognitionException {
        try {
            int _type = RULE_LBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2473:15: ( '[' )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2473:17: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LBRACKET"

    // $ANTLR start "RULE_RBRACKET"
    public final void mRULE_RBRACKET() throws RecognitionException {
        try {
            int _type = RULE_RBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2475:15: ( ']' )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2475:17: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RBRACKET"

    // $ANTLR start "RULE_LPAREN"
    public final void mRULE_LPAREN() throws RecognitionException {
        try {
            int _type = RULE_LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2477:13: ( '(' )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2477:15: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LPAREN"

    // $ANTLR start "RULE_RPAREN"
    public final void mRULE_RPAREN() throws RecognitionException {
        try {
            int _type = RULE_RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2479:13: ( ')' )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2479:15: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RPAREN"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2481:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2481:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2481:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2481:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2481:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2483:10: ( ( '0' .. '9' )+ )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2483:12: ( '0' .. '9' )+
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2483:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2483:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2485:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2485:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2485:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2485:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2485:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2485:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2485:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2485:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2485:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2485:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2485:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2487:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2487:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2487:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2487:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2489:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2489:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2489:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2489:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2489:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2489:41: ( '\\r' )? '\\n'
                    {
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2489:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2489:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2491:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2491:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2491:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2493:16: ( . )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2493:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:8: ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | RULE_ARROW | RULE_COMMA | RULE_COLON | RULE_LBRACE | RULE_RBRACE | RULE_LBRACKET | RULE_RBRACKET | RULE_LPAREN | RULE_RPAREN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=25;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:10: T__20
                {
                mT__20(); 

                }
                break;
            case 2 :
                // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:16: T__21
                {
                mT__21(); 

                }
                break;
            case 3 :
                // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:22: T__22
                {
                mT__22(); 

                }
                break;
            case 4 :
                // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:28: T__23
                {
                mT__23(); 

                }
                break;
            case 5 :
                // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:34: T__24
                {
                mT__24(); 

                }
                break;
            case 6 :
                // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:40: T__25
                {
                mT__25(); 

                }
                break;
            case 7 :
                // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:46: T__26
                {
                mT__26(); 

                }
                break;
            case 8 :
                // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:52: T__27
                {
                mT__27(); 

                }
                break;
            case 9 :
                // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:58: T__28
                {
                mT__28(); 

                }
                break;
            case 10 :
                // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:64: RULE_ARROW
                {
                mRULE_ARROW(); 

                }
                break;
            case 11 :
                // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:75: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 12 :
                // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:86: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 13 :
                // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:97: RULE_LBRACE
                {
                mRULE_LBRACE(); 

                }
                break;
            case 14 :
                // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:109: RULE_RBRACE
                {
                mRULE_RBRACE(); 

                }
                break;
            case 15 :
                // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:121: RULE_LBRACKET
                {
                mRULE_LBRACKET(); 

                }
                break;
            case 16 :
                // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:135: RULE_RBRACKET
                {
                mRULE_RBRACKET(); 

                }
                break;
            case 17 :
                // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:149: RULE_LPAREN
                {
                mRULE_LPAREN(); 

                }
                break;
            case 18 :
                // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:161: RULE_RPAREN
                {
                mRULE_RPAREN(); 

                }
                break;
            case 19 :
                // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:173: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 20 :
                // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:181: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 21 :
                // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:190: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 22 :
                // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:202: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 23 :
                // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:218: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 24 :
                // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:234: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 25 :
                // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:242: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\6\33\2\30\10\uffff\1\30\2\uffff\3\30\2\uffff\2\33\1\uffff"+
        "\2\33\1\65\1\66\2\33\16\uffff\4\33\1\75\2\uffff\1\76\1\77\3\33\1"+
        "\103\3\uffff\3\33\1\uffff\4\33\1\113\1\33\1\115\1\uffff\1\33\1\uffff"+
        "\1\117\1\uffff";
    static final String DFA13_eofS =
        "\120\uffff";
    static final String DFA13_minS =
        "\1\0\1\141\1\157\1\145\1\156\1\165\1\151\1\76\1\162\10\uffff\1"+
        "\101\2\uffff\2\0\1\52\2\uffff\1\151\1\162\1\uffff\1\154\1\171\2"+
        "\60\1\164\1\154\16\uffff\1\164\1\166\1\141\1\145\1\60\2\uffff\2"+
        "\60\1\157\1\141\1\155\1\60\3\uffff\1\143\1\164\1\145\1\uffff\1\157"+
        "\1\145\1\164\1\154\1\60\1\145\1\60\1\uffff\1\162\1\uffff\1\60\1"+
        "\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\162\1\157\1\145\1\157\1\165\1\151\1\76\1\162\10\uffff"+
        "\1\172\2\uffff\2\uffff\1\57\2\uffff\1\157\1\162\1\uffff\1\154\1"+
        "\171\2\172\1\164\1\154\16\uffff\1\164\1\166\1\141\1\145\1\172\2"+
        "\uffff\2\172\1\157\1\141\1\155\1\172\3\uffff\1\143\1\164\1\145\1"+
        "\uffff\1\157\1\145\1\164\1\154\1\172\1\145\1\172\1\uffff\1\162\1"+
        "\uffff\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\11\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\uffff\1\23"+
        "\1\24\3\uffff\1\30\1\31\2\uffff\1\23\6\uffff\1\12\1\13\1\14\1\15"+
        "\1\16\1\17\1\20\1\21\1\22\1\24\1\25\1\26\1\27\1\30\5\uffff\1\6\1"+
        "\10\6\uffff\1\5\1\7\1\11\3\uffff\1\2\7\uffff\1\4\1\uffff\1\1\1\uffff"+
        "\1\3";
    static final String DFA13_specialS =
        "\1\1\23\uffff\1\2\1\0\72\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\30\2\27\2\30\1\27\22\30\1\27\1\30\1\24\3\30\1\10\1\25\1"+
            "\17\1\20\2\30\1\11\1\7\1\30\1\26\12\23\1\12\6\30\32\22\1\15"+
            "\1\30\1\16\1\21\1\22\1\30\10\22\1\4\1\22\1\3\2\22\1\6\1\5\1"+
            "\1\1\22\1\2\10\22\1\13\1\30\1\14\uff82\30",
            "\1\32\20\uffff\1\31",
            "\1\34",
            "\1\35",
            "\1\36\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\42",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\0\54",
            "\0\54",
            "\1\55\4\uffff\1\56",
            "",
            "",
            "\1\61\5\uffff\1\60",
            "\1\62",
            "",
            "\1\63",
            "\1\64",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\67",
            "\1\70",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\100",
            "\1\101",
            "\1\102",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "",
            "\1\104",
            "\1\105",
            "\1\106",
            "",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\114",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\116",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | RULE_ARROW | RULE_COMMA | RULE_COLON | RULE_LBRACE | RULE_RBRACE | RULE_LBRACKET | RULE_RBRACKET | RULE_LPAREN | RULE_RPAREN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_21 = input.LA(1);

                        s = -1;
                        if ( ((LA13_21>='\u0000' && LA13_21<='\uFFFF')) ) {s = 44;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='p') ) {s = 1;}

                        else if ( (LA13_0=='r') ) {s = 2;}

                        else if ( (LA13_0=='k') ) {s = 3;}

                        else if ( (LA13_0=='i') ) {s = 4;}

                        else if ( (LA13_0=='o') ) {s = 5;}

                        else if ( (LA13_0=='n') ) {s = 6;}

                        else if ( (LA13_0=='-') ) {s = 7;}

                        else if ( (LA13_0=='&') ) {s = 8;}

                        else if ( (LA13_0==',') ) {s = 9;}

                        else if ( (LA13_0==':') ) {s = 10;}

                        else if ( (LA13_0=='{') ) {s = 11;}

                        else if ( (LA13_0=='}') ) {s = 12;}

                        else if ( (LA13_0=='[') ) {s = 13;}

                        else if ( (LA13_0==']') ) {s = 14;}

                        else if ( (LA13_0=='(') ) {s = 15;}

                        else if ( (LA13_0==')') ) {s = 16;}

                        else if ( (LA13_0=='^') ) {s = 17;}

                        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='h')||LA13_0=='j'||(LA13_0>='l' && LA13_0<='m')||LA13_0=='q'||(LA13_0>='s' && LA13_0<='z')) ) {s = 18;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 19;}

                        else if ( (LA13_0=='\"') ) {s = 20;}

                        else if ( (LA13_0=='\'') ) {s = 21;}

                        else if ( (LA13_0=='/') ) {s = 22;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 23;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='%')||(LA13_0>='*' && LA13_0<='+')||LA13_0=='.'||(LA13_0>=';' && LA13_0<='@')||LA13_0=='\\'||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 24;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_20 = input.LA(1);

                        s = -1;
                        if ( ((LA13_20>='\u0000' && LA13_20<='\uFFFF')) ) {s = 44;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}