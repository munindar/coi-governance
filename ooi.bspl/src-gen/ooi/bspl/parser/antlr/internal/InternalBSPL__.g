lexer grammar InternalBSPL;
@header {
package ooi.bspl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T20 : 'in' ;
T21 : 'out' ;
T22 : 'io' ;
T23 : 'nil' ;
T24 : 'protocol' ;
T25 : 'role' ;
T26 : 'parameter' ;
T27 : 'private' ;
T28 : 'key' ;

// $ANTLR src "../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g" 1100
RULE_ARROW : ('->'|'&rarr;');

// $ANTLR src "../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g" 1102
RULE_COMMA : ',';

// $ANTLR src "../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g" 1104
RULE_COLON : ':';

// $ANTLR src "../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g" 1106
RULE_LBRACE : '{';

// $ANTLR src "../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g" 1108
RULE_RBRACE : '}';

// $ANTLR src "../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g" 1110
RULE_LBRACKET : '[';

// $ANTLR src "../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g" 1112
RULE_RBRACKET : ']';

// $ANTLR src "../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g" 1114
RULE_LPAREN : '(';

// $ANTLR src "../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g" 1116
RULE_RPAREN : ')';

// $ANTLR src "../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g" 1118
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g" 1120
RULE_INT : ('0'..'9')+;

// $ANTLR src "../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g" 1122
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g" 1124
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g" 1126
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g" 1128
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g" 1130
RULE_ANY_OTHER : .;


