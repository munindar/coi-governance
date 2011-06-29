lexer grammar InternalBSPL;
@header {
package ooi.bspl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T20 : 'protocol' ;
T21 : 'role' ;
T22 : 'parameter' ;
T23 : 'private' ;
T24 : 'key' ;
T25 : 'in' ;
T26 : 'out' ;
T27 : 'io' ;
T28 : 'nil' ;

// $ANTLR src "../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g" 2463
RULE_ARROW : ('->'|'&rarr;');

// $ANTLR src "../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g" 2465
RULE_COMMA : ',';

// $ANTLR src "../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g" 2467
RULE_COLON : ':';

// $ANTLR src "../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g" 2469
RULE_LBRACE : '{';

// $ANTLR src "../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g" 2471
RULE_RBRACE : '}';

// $ANTLR src "../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g" 2473
RULE_LBRACKET : '[';

// $ANTLR src "../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g" 2475
RULE_RBRACKET : ']';

// $ANTLR src "../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g" 2477
RULE_LPAREN : '(';

// $ANTLR src "../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g" 2479
RULE_RPAREN : ')';

// $ANTLR src "../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g" 2481
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g" 2483
RULE_INT : ('0'..'9')+;

// $ANTLR src "../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g" 2485
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g" 2487
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g" 2489
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g" 2491
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../ooi.bspl.ui/src-gen/ooi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g" 2493
RULE_ANY_OTHER : .;


