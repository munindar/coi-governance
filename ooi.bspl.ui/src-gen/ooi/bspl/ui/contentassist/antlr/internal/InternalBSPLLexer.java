package ooi.bspl.ui.contentassist.antlr.internal;

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
    public static final int RULE_ANY_OTHER=19;
    public static final int RULE_COMMA=5;
    public static final int T28=28;
    public static final int RULE_LBRACKET=9;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int Tokens=29;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=17;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
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
    public InternalBSPLLexer() {;} 
    public InternalBSPLLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g"; }

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:10:5: ( 'protocol' )
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:10:7: 'protocol'
            {
            match("protocol"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:11:5: ( 'role' )
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:11:7: 'role'
            {
            match("role"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:12:5: ( 'parameter' )
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:12:7: 'parameter'
            {
            match("parameter"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:13:5: ( 'private' )
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:13:7: 'private'
            {
            match("private"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:14:5: ( 'key' )
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:14:7: 'key'
            {
            match("key"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:15:5: ( 'in' )
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:15:7: 'in'
            {
            match("in"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:16:5: ( 'out' )
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:16:7: 'out'
            {
            match("out"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:17:5: ( 'io' )
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:17:7: 'io'
            {
            match("io"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:18:5: ( 'nil' )
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:18:7: 'nil'
            {
            match("nil"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start RULE_ARROW
    public final void mRULE_ARROW() throws RecognitionException {
        try {
            int _type = RULE_ARROW;
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2463:12: ( ( '->' | '&rarr;' ) )
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2463:14: ( '->' | '&rarr;' )
            {
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2463:14: ( '->' | '&rarr;' )
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
                    new NoViableAltException("2463:14: ( '->' | '&rarr;' )", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2463:15: '->'
                    {
                    match("->"); 


                    }
                    break;
                case 2 :
                    // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2463:20: '&rarr;'
                    {
                    match("&rarr;"); 


                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ARROW

    // $ANTLR start RULE_COMMA
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2465:12: ( ',' )
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2465:14: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_COMMA

    // $ANTLR start RULE_COLON
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2467:12: ( ':' )
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2467:14: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_COLON

    // $ANTLR start RULE_LBRACE
    public final void mRULE_LBRACE() throws RecognitionException {
        try {
            int _type = RULE_LBRACE;
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2469:13: ( '{' )
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2469:15: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_LBRACE

    // $ANTLR start RULE_RBRACE
    public final void mRULE_RBRACE() throws RecognitionException {
        try {
            int _type = RULE_RBRACE;
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2471:13: ( '}' )
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2471:15: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_RBRACE

    // $ANTLR start RULE_LBRACKET
    public final void mRULE_LBRACKET() throws RecognitionException {
        try {
            int _type = RULE_LBRACKET;
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2473:15: ( '[' )
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2473:17: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_LBRACKET

    // $ANTLR start RULE_RBRACKET
    public final void mRULE_RBRACKET() throws RecognitionException {
        try {
            int _type = RULE_RBRACKET;
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2475:15: ( ']' )
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2475:17: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_RBRACKET

    // $ANTLR start RULE_LPAREN
    public final void mRULE_LPAREN() throws RecognitionException {
        try {
            int _type = RULE_LPAREN;
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2477:13: ( '(' )
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2477:15: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_LPAREN

    // $ANTLR start RULE_RPAREN
    public final void mRULE_RPAREN() throws RecognitionException {
        try {
            int _type = RULE_RPAREN;
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2479:13: ( ')' )
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2479:15: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_RPAREN

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2481:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2481:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2481:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2481:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2481:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2483:10: ( ( '0' .. '9' )+ )
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2483:12: ( '0' .. '9' )+
            {
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2483:12: ( '0' .. '9' )+
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
            	    // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2483:13: '0' .. '9'
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2485:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2485:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2485:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("2485:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2485:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2485:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2485:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2485:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


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
                    // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2485:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2485:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFE')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2485:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2485:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2487:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2487:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2487:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFE')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2487:52: .
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2489:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2489:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2489:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFE')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2489:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2489:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2489:41: ( '\\r' )? '\\n'
                    {
                    // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2489:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2489:41: '\\r'
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2491:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2491:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2491:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2493:16: ( . )
            // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2493:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:8: ( T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | RULE_ARROW | RULE_COMMA | RULE_COLON | RULE_LBRACE | RULE_RBRACE | RULE_LBRACKET | RULE_RBRACKET | RULE_LPAREN | RULE_RPAREN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=25;
        int LA13_0 = input.LA(1);

        if ( (LA13_0=='p') ) {
            switch ( input.LA(2) ) {
            case 'r':
                {
                switch ( input.LA(3) ) {
                case 'o':
                    {
                    int LA13_48 = input.LA(4);

                    if ( (LA13_48=='t') ) {
                        int LA13_57 = input.LA(5);

                        if ( (LA13_57=='o') ) {
                            int LA13_64 = input.LA(6);

                            if ( (LA13_64=='c') ) {
                                int LA13_68 = input.LA(7);

                                if ( (LA13_68=='o') ) {
                                    int LA13_71 = input.LA(8);

                                    if ( (LA13_71=='l') ) {
                                        int LA13_74 = input.LA(9);

                                        if ( ((LA13_74>='0' && LA13_74<='9')||(LA13_74>='A' && LA13_74<='Z')||LA13_74=='_'||(LA13_74>='a' && LA13_74<='z')) ) {
                                            alt13=19;
                                        }
                                        else {
                                            alt13=1;}
                                    }
                                    else {
                                        alt13=19;}
                                }
                                else {
                                    alt13=19;}
                            }
                            else {
                                alt13=19;}
                        }
                        else {
                            alt13=19;}
                    }
                    else {
                        alt13=19;}
                    }
                    break;
                case 'i':
                    {
                    int LA13_49 = input.LA(4);

                    if ( (LA13_49=='v') ) {
                        int LA13_58 = input.LA(5);

                        if ( (LA13_58=='a') ) {
                            int LA13_65 = input.LA(6);

                            if ( (LA13_65=='t') ) {
                                int LA13_69 = input.LA(7);

                                if ( (LA13_69=='e') ) {
                                    int LA13_72 = input.LA(8);

                                    if ( ((LA13_72>='0' && LA13_72<='9')||(LA13_72>='A' && LA13_72<='Z')||LA13_72=='_'||(LA13_72>='a' && LA13_72<='z')) ) {
                                        alt13=19;
                                    }
                                    else {
                                        alt13=4;}
                                }
                                else {
                                    alt13=19;}
                            }
                            else {
                                alt13=19;}
                        }
                        else {
                            alt13=19;}
                    }
                    else {
                        alt13=19;}
                    }
                    break;
                default:
                    alt13=19;}

                }
                break;
            case 'a':
                {
                int LA13_26 = input.LA(3);

                if ( (LA13_26=='r') ) {
                    int LA13_50 = input.LA(4);

                    if ( (LA13_50=='a') ) {
                        int LA13_59 = input.LA(5);

                        if ( (LA13_59=='m') ) {
                            int LA13_66 = input.LA(6);

                            if ( (LA13_66=='e') ) {
                                int LA13_70 = input.LA(7);

                                if ( (LA13_70=='t') ) {
                                    int LA13_73 = input.LA(8);

                                    if ( (LA13_73=='e') ) {
                                        int LA13_76 = input.LA(9);

                                        if ( (LA13_76=='r') ) {
                                            int LA13_78 = input.LA(10);

                                            if ( ((LA13_78>='0' && LA13_78<='9')||(LA13_78>='A' && LA13_78<='Z')||LA13_78=='_'||(LA13_78>='a' && LA13_78<='z')) ) {
                                                alt13=19;
                                            }
                                            else {
                                                alt13=3;}
                                        }
                                        else {
                                            alt13=19;}
                                    }
                                    else {
                                        alt13=19;}
                                }
                                else {
                                    alt13=19;}
                            }
                            else {
                                alt13=19;}
                        }
                        else {
                            alt13=19;}
                    }
                    else {
                        alt13=19;}
                }
                else {
                    alt13=19;}
                }
                break;
            default:
                alt13=19;}

        }
        else if ( (LA13_0=='r') ) {
            int LA13_2 = input.LA(2);

            if ( (LA13_2=='o') ) {
                int LA13_28 = input.LA(3);

                if ( (LA13_28=='l') ) {
                    int LA13_51 = input.LA(4);

                    if ( (LA13_51=='e') ) {
                        int LA13_60 = input.LA(5);

                        if ( ((LA13_60>='0' && LA13_60<='9')||(LA13_60>='A' && LA13_60<='Z')||LA13_60=='_'||(LA13_60>='a' && LA13_60<='z')) ) {
                            alt13=19;
                        }
                        else {
                            alt13=2;}
                    }
                    else {
                        alt13=19;}
                }
                else {
                    alt13=19;}
            }
            else {
                alt13=19;}
        }
        else if ( (LA13_0=='k') ) {
            int LA13_3 = input.LA(2);

            if ( (LA13_3=='e') ) {
                int LA13_29 = input.LA(3);

                if ( (LA13_29=='y') ) {
                    int LA13_52 = input.LA(4);

                    if ( ((LA13_52>='0' && LA13_52<='9')||(LA13_52>='A' && LA13_52<='Z')||LA13_52=='_'||(LA13_52>='a' && LA13_52<='z')) ) {
                        alt13=19;
                    }
                    else {
                        alt13=5;}
                }
                else {
                    alt13=19;}
            }
            else {
                alt13=19;}
        }
        else if ( (LA13_0=='i') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA13_30 = input.LA(3);

                if ( ((LA13_30>='0' && LA13_30<='9')||(LA13_30>='A' && LA13_30<='Z')||LA13_30=='_'||(LA13_30>='a' && LA13_30<='z')) ) {
                    alt13=19;
                }
                else {
                    alt13=6;}
                }
                break;
            case 'o':
                {
                int LA13_31 = input.LA(3);

                if ( ((LA13_31>='0' && LA13_31<='9')||(LA13_31>='A' && LA13_31<='Z')||LA13_31=='_'||(LA13_31>='a' && LA13_31<='z')) ) {
                    alt13=19;
                }
                else {
                    alt13=8;}
                }
                break;
            default:
                alt13=19;}

        }
        else if ( (LA13_0=='o') ) {
            int LA13_5 = input.LA(2);

            if ( (LA13_5=='u') ) {
                int LA13_32 = input.LA(3);

                if ( (LA13_32=='t') ) {
                    int LA13_55 = input.LA(4);

                    if ( ((LA13_55>='0' && LA13_55<='9')||(LA13_55>='A' && LA13_55<='Z')||LA13_55=='_'||(LA13_55>='a' && LA13_55<='z')) ) {
                        alt13=19;
                    }
                    else {
                        alt13=7;}
                }
                else {
                    alt13=19;}
            }
            else {
                alt13=19;}
        }
        else if ( (LA13_0=='n') ) {
            int LA13_6 = input.LA(2);

            if ( (LA13_6=='i') ) {
                int LA13_33 = input.LA(3);

                if ( (LA13_33=='l') ) {
                    int LA13_56 = input.LA(4);

                    if ( ((LA13_56>='0' && LA13_56<='9')||(LA13_56>='A' && LA13_56<='Z')||LA13_56=='_'||(LA13_56>='a' && LA13_56<='z')) ) {
                        alt13=19;
                    }
                    else {
                        alt13=9;}
                }
                else {
                    alt13=19;}
            }
            else {
                alt13=19;}
        }
        else if ( (LA13_0=='-') ) {
            int LA13_7 = input.LA(2);

            if ( (LA13_7=='>') ) {
                alt13=10;
            }
            else {
                alt13=25;}
        }
        else if ( (LA13_0=='&') ) {
            int LA13_8 = input.LA(2);

            if ( (LA13_8=='r') ) {
                alt13=10;
            }
            else {
                alt13=25;}
        }
        else if ( (LA13_0==',') ) {
            alt13=11;
        }
        else if ( (LA13_0==':') ) {
            alt13=12;
        }
        else if ( (LA13_0=='{') ) {
            alt13=13;
        }
        else if ( (LA13_0=='}') ) {
            alt13=14;
        }
        else if ( (LA13_0=='[') ) {
            alt13=15;
        }
        else if ( (LA13_0==']') ) {
            alt13=16;
        }
        else if ( (LA13_0=='(') ) {
            alt13=17;
        }
        else if ( (LA13_0==')') ) {
            alt13=18;
        }
        else if ( (LA13_0=='^') ) {
            int LA13_17 = input.LA(2);

            if ( ((LA13_17>='A' && LA13_17<='Z')||LA13_17=='_'||(LA13_17>='a' && LA13_17<='z')) ) {
                alt13=19;
            }
            else {
                alt13=25;}
        }
        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='h')||LA13_0=='j'||(LA13_0>='l' && LA13_0<='m')||LA13_0=='q'||(LA13_0>='s' && LA13_0<='z')) ) {
            alt13=19;
        }
        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {
            alt13=20;
        }
        else if ( (LA13_0=='\"') ) {
            int LA13_20 = input.LA(2);

            if ( ((LA13_20>='\u0000' && LA13_20<='\uFFFE')) ) {
                alt13=21;
            }
            else {
                alt13=25;}
        }
        else if ( (LA13_0=='\'') ) {
            int LA13_21 = input.LA(2);

            if ( ((LA13_21>='\u0000' && LA13_21<='\uFFFE')) ) {
                alt13=21;
            }
            else {
                alt13=25;}
        }
        else if ( (LA13_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt13=23;
                }
                break;
            case '*':
                {
                alt13=22;
                }
                break;
            default:
                alt13=25;}

        }
        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
            alt13=24;
        }
        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='%')||(LA13_0>='*' && LA13_0<='+')||LA13_0=='.'||(LA13_0>=';' && LA13_0<='@')||LA13_0=='\\'||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFE')) ) {
            alt13=25;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | RULE_ARROW | RULE_COMMA | RULE_COLON | RULE_LBRACE | RULE_RBRACE | RULE_LBRACKET | RULE_RBRACKET | RULE_LPAREN | RULE_RPAREN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 13, 0, input);

            throw nvae;
        }
        switch (alt13) {
            case 1 :
                // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:10: T20
                {
                mT20(); 

                }
                break;
            case 2 :
                // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:14: T21
                {
                mT21(); 

                }
                break;
            case 3 :
                // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:18: T22
                {
                mT22(); 

                }
                break;
            case 4 :
                // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:22: T23
                {
                mT23(); 

                }
                break;
            case 5 :
                // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:26: T24
                {
                mT24(); 

                }
                break;
            case 6 :
                // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:30: T25
                {
                mT25(); 

                }
                break;
            case 7 :
                // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:34: T26
                {
                mT26(); 

                }
                break;
            case 8 :
                // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:38: T27
                {
                mT27(); 

                }
                break;
            case 9 :
                // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:42: T28
                {
                mT28(); 

                }
                break;
            case 10 :
                // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:46: RULE_ARROW
                {
                mRULE_ARROW(); 

                }
                break;
            case 11 :
                // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:57: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 12 :
                // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:68: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 13 :
                // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:79: RULE_LBRACE
                {
                mRULE_LBRACE(); 

                }
                break;
            case 14 :
                // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:91: RULE_RBRACE
                {
                mRULE_RBRACE(); 

                }
                break;
            case 15 :
                // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:103: RULE_LBRACKET
                {
                mRULE_LBRACKET(); 

                }
                break;
            case 16 :
                // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:117: RULE_RBRACKET
                {
                mRULE_RBRACKET(); 

                }
                break;
            case 17 :
                // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:131: RULE_LPAREN
                {
                mRULE_LPAREN(); 

                }
                break;
            case 18 :
                // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:143: RULE_RPAREN
                {
                mRULE_RPAREN(); 

                }
                break;
            case 19 :
                // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:155: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 20 :
                // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:163: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 21 :
                // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:172: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 22 :
                // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:184: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 23 :
                // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:200: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 24 :
                // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:216: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 25 :
                // ../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1:224: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}