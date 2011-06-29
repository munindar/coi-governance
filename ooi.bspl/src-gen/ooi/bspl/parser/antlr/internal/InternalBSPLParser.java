package ooi.bspl.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import ooi.bspl.services.BSPLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBSPLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_LBRACE", "RULE_COMMA", "RULE_RBRACE", "RULE_ARROW", "RULE_COLON", "RULE_LBRACKET", "RULE_RBRACKET", "RULE_LPAREN", "RULE_RPAREN", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'in'", "'out'", "'io'", "'nil'", "'protocol'", "'role'", "'parameter'", "'private'", "'key'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_RBRACE=7;
    public static final int RULE_ANY_OTHER=19;
    public static final int RULE_COMMA=6;
    public static final int RULE_LBRACKET=10;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=17;
    public static final int RULE_ML_COMMENT=16;
    public static final int RULE_COLON=9;
    public static final int RULE_STRING=15;
    public static final int RULE_LPAREN=12;
    public static final int RULE_ARROW=8;
    public static final int RULE_INT=14;
    public static final int RULE_LBRACE=5;
    public static final int RULE_RPAREN=13;
    public static final int RULE_WS=18;
    public static final int RULE_RBRACKET=11;

        public InternalBSPLParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g"; }



     	private BSPLGrammarAccess grammarAccess;
     	
        public InternalBSPLParser(TokenStream input, IAstFactory factory, BSPLGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("ooi/bspl/parser/antlr/internal/InternalBSPL.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Protocol";	
       	}
       	
       	@Override
       	protected BSPLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleProtocol
    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:78:1: entryRuleProtocol returns [EObject current=null] : iv_ruleProtocol= ruleProtocol EOF ;
    public final EObject entryRuleProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocol = null;


        try {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:79:2: (iv_ruleProtocol= ruleProtocol EOF )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:80:2: iv_ruleProtocol= ruleProtocol EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProtocolRule(), currentNode); 
            pushFollow(FOLLOW_ruleProtocol_in_entryRuleProtocol75);
            iv_ruleProtocol=ruleProtocol();
            _fsp--;

             current =iv_ruleProtocol; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtocol85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleProtocol


    // $ANTLR start ruleProtocol
    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:87:1: ruleProtocol returns [EObject current=null] : ( ( (lv_junkProtocol_0_0= rulekPROTOCOL ) )? ( (lv_name_1_0= RULE_ID ) ) RULE_LBRACE ( (lv_junkRole_3_0= rulekROLE ) ) ( (lv_roles_4_0= ruleRole ) ) RULE_COMMA ( (lv_roles_6_0= ruleRole ) ) ( RULE_COMMA ( (lv_roles_8_0= ruleRole ) ) )* ( (lv_junkPub_9_0= rulekPARAMETER ) ) ( (lv_publicParams_10_0= ruleParamDecl ) ) ( RULE_COMMA ( (lv_publicParams_12_0= ruleParamDecl ) ) )* ( ( (lv_junkPriv_13_0= rulekPRIVATE ) ) ( (lv_privateParams_14_0= ruleParameter ) ) ( RULE_COMMA ( (lv_privateParams_16_0= ruleParameter ) ) )* )? ( ( (lv_references_17_1= ruleReference | lv_references_17_2= ruleMessage ) ) )+ RULE_RBRACE ) ;
    public final EObject ruleProtocol() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_junkProtocol_0_0 = null;

        Enumerator lv_junkRole_3_0 = null;

        EObject lv_roles_4_0 = null;

        EObject lv_roles_6_0 = null;

        EObject lv_roles_8_0 = null;

        Enumerator lv_junkPub_9_0 = null;

        EObject lv_publicParams_10_0 = null;

        EObject lv_publicParams_12_0 = null;

        Enumerator lv_junkPriv_13_0 = null;

        EObject lv_privateParams_14_0 = null;

        EObject lv_privateParams_16_0 = null;

        EObject lv_references_17_1 = null;

        EObject lv_references_17_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:92:6: ( ( ( (lv_junkProtocol_0_0= rulekPROTOCOL ) )? ( (lv_name_1_0= RULE_ID ) ) RULE_LBRACE ( (lv_junkRole_3_0= rulekROLE ) ) ( (lv_roles_4_0= ruleRole ) ) RULE_COMMA ( (lv_roles_6_0= ruleRole ) ) ( RULE_COMMA ( (lv_roles_8_0= ruleRole ) ) )* ( (lv_junkPub_9_0= rulekPARAMETER ) ) ( (lv_publicParams_10_0= ruleParamDecl ) ) ( RULE_COMMA ( (lv_publicParams_12_0= ruleParamDecl ) ) )* ( ( (lv_junkPriv_13_0= rulekPRIVATE ) ) ( (lv_privateParams_14_0= ruleParameter ) ) ( RULE_COMMA ( (lv_privateParams_16_0= ruleParameter ) ) )* )? ( ( (lv_references_17_1= ruleReference | lv_references_17_2= ruleMessage ) ) )+ RULE_RBRACE ) )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:93:1: ( ( (lv_junkProtocol_0_0= rulekPROTOCOL ) )? ( (lv_name_1_0= RULE_ID ) ) RULE_LBRACE ( (lv_junkRole_3_0= rulekROLE ) ) ( (lv_roles_4_0= ruleRole ) ) RULE_COMMA ( (lv_roles_6_0= ruleRole ) ) ( RULE_COMMA ( (lv_roles_8_0= ruleRole ) ) )* ( (lv_junkPub_9_0= rulekPARAMETER ) ) ( (lv_publicParams_10_0= ruleParamDecl ) ) ( RULE_COMMA ( (lv_publicParams_12_0= ruleParamDecl ) ) )* ( ( (lv_junkPriv_13_0= rulekPRIVATE ) ) ( (lv_privateParams_14_0= ruleParameter ) ) ( RULE_COMMA ( (lv_privateParams_16_0= ruleParameter ) ) )* )? ( ( (lv_references_17_1= ruleReference | lv_references_17_2= ruleMessage ) ) )+ RULE_RBRACE )
            {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:93:1: ( ( (lv_junkProtocol_0_0= rulekPROTOCOL ) )? ( (lv_name_1_0= RULE_ID ) ) RULE_LBRACE ( (lv_junkRole_3_0= rulekROLE ) ) ( (lv_roles_4_0= ruleRole ) ) RULE_COMMA ( (lv_roles_6_0= ruleRole ) ) ( RULE_COMMA ( (lv_roles_8_0= ruleRole ) ) )* ( (lv_junkPub_9_0= rulekPARAMETER ) ) ( (lv_publicParams_10_0= ruleParamDecl ) ) ( RULE_COMMA ( (lv_publicParams_12_0= ruleParamDecl ) ) )* ( ( (lv_junkPriv_13_0= rulekPRIVATE ) ) ( (lv_privateParams_14_0= ruleParameter ) ) ( RULE_COMMA ( (lv_privateParams_16_0= ruleParameter ) ) )* )? ( ( (lv_references_17_1= ruleReference | lv_references_17_2= ruleMessage ) ) )+ RULE_RBRACE )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:93:2: ( (lv_junkProtocol_0_0= rulekPROTOCOL ) )? ( (lv_name_1_0= RULE_ID ) ) RULE_LBRACE ( (lv_junkRole_3_0= rulekROLE ) ) ( (lv_roles_4_0= ruleRole ) ) RULE_COMMA ( (lv_roles_6_0= ruleRole ) ) ( RULE_COMMA ( (lv_roles_8_0= ruleRole ) ) )* ( (lv_junkPub_9_0= rulekPARAMETER ) ) ( (lv_publicParams_10_0= ruleParamDecl ) ) ( RULE_COMMA ( (lv_publicParams_12_0= ruleParamDecl ) ) )* ( ( (lv_junkPriv_13_0= rulekPRIVATE ) ) ( (lv_privateParams_14_0= ruleParameter ) ) ( RULE_COMMA ( (lv_privateParams_16_0= ruleParameter ) ) )* )? ( ( (lv_references_17_1= ruleReference | lv_references_17_2= ruleMessage ) ) )+ RULE_RBRACE
            {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:93:2: ( (lv_junkProtocol_0_0= rulekPROTOCOL ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==24) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:94:1: (lv_junkProtocol_0_0= rulekPROTOCOL )
                    {
                    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:94:1: (lv_junkProtocol_0_0= rulekPROTOCOL )
                    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:95:3: lv_junkProtocol_0_0= rulekPROTOCOL
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProtocolAccess().getJunkProtocolKPROTOCOLEnumRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulekPROTOCOL_in_ruleProtocol131);
                    lv_junkProtocol_0_0=rulekPROTOCOL();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProtocolRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"junkProtocol",
                    	        		true, 
                    	        		"kPROTOCOL", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:117:3: ( (lv_name_1_0= RULE_ID ) )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:118:1: (lv_name_1_0= RULE_ID )
            {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:118:1: (lv_name_1_0= RULE_ID )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:119:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProtocol149); 

            			createLeafNode(grammarAccess.getProtocolAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProtocolRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleProtocol163); 
             
                createLeafNode(grammarAccess.getProtocolAccess().getLBRACETerminalRuleCall_2(), null); 
                
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:145:1: ( (lv_junkRole_3_0= rulekROLE ) )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:146:1: (lv_junkRole_3_0= rulekROLE )
            {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:146:1: (lv_junkRole_3_0= rulekROLE )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:147:3: lv_junkRole_3_0= rulekROLE
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getProtocolAccess().getJunkRoleKROLEEnumRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulekROLE_in_ruleProtocol183);
            lv_junkRole_3_0=rulekROLE();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProtocolRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"junkRole",
            	        		true, 
            	        		"kROLE", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:169:2: ( (lv_roles_4_0= ruleRole ) )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:170:1: (lv_roles_4_0= ruleRole )
            {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:170:1: (lv_roles_4_0= ruleRole )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:171:3: lv_roles_4_0= ruleRole
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getProtocolAccess().getRolesRoleParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleRole_in_ruleProtocol204);
            lv_roles_4_0=ruleRole();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProtocolRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"roles",
            	        		lv_roles_4_0, 
            	        		"Role", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleProtocol213); 
             
                createLeafNode(grammarAccess.getProtocolAccess().getCOMMATerminalRuleCall_5(), null); 
                
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:197:1: ( (lv_roles_6_0= ruleRole ) )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:198:1: (lv_roles_6_0= ruleRole )
            {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:198:1: (lv_roles_6_0= ruleRole )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:199:3: lv_roles_6_0= ruleRole
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getProtocolAccess().getRolesRoleParserRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleRole_in_ruleProtocol233);
            lv_roles_6_0=ruleRole();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProtocolRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"roles",
            	        		lv_roles_6_0, 
            	        		"Role", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:221:2: ( RULE_COMMA ( (lv_roles_8_0= ruleRole ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_COMMA) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:221:3: RULE_COMMA ( (lv_roles_8_0= ruleRole ) )
            	    {
            	    match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleProtocol243); 
            	     
            	        createLeafNode(grammarAccess.getProtocolAccess().getCOMMATerminalRuleCall_7_0(), null); 
            	        
            	    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:225:1: ( (lv_roles_8_0= ruleRole ) )
            	    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:226:1: (lv_roles_8_0= ruleRole )
            	    {
            	    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:226:1: (lv_roles_8_0= ruleRole )
            	    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:227:3: lv_roles_8_0= ruleRole
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getProtocolAccess().getRolesRoleParserRuleCall_7_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleRole_in_ruleProtocol263);
            	    lv_roles_8_0=ruleRole();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getProtocolRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"roles",
            	    	        		lv_roles_8_0, 
            	    	        		"Role", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:249:4: ( (lv_junkPub_9_0= rulekPARAMETER ) )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:250:1: (lv_junkPub_9_0= rulekPARAMETER )
            {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:250:1: (lv_junkPub_9_0= rulekPARAMETER )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:251:3: lv_junkPub_9_0= rulekPARAMETER
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getProtocolAccess().getJunkPubKPARAMETEREnumRuleCall_8_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulekPARAMETER_in_ruleProtocol286);
            lv_junkPub_9_0=rulekPARAMETER();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProtocolRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"junkPub",
            	        		true, 
            	        		"kPARAMETER", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:273:2: ( (lv_publicParams_10_0= ruleParamDecl ) )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:274:1: (lv_publicParams_10_0= ruleParamDecl )
            {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:274:1: (lv_publicParams_10_0= ruleParamDecl )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:275:3: lv_publicParams_10_0= ruleParamDecl
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getProtocolAccess().getPublicParamsParamDeclParserRuleCall_9_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleParamDecl_in_ruleProtocol307);
            lv_publicParams_10_0=ruleParamDecl();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProtocolRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"publicParams",
            	        		lv_publicParams_10_0, 
            	        		"ParamDecl", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:297:2: ( RULE_COMMA ( (lv_publicParams_12_0= ruleParamDecl ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_COMMA) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:297:3: RULE_COMMA ( (lv_publicParams_12_0= ruleParamDecl ) )
            	    {
            	    match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleProtocol317); 
            	     
            	        createLeafNode(grammarAccess.getProtocolAccess().getCOMMATerminalRuleCall_10_0(), null); 
            	        
            	    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:301:1: ( (lv_publicParams_12_0= ruleParamDecl ) )
            	    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:302:1: (lv_publicParams_12_0= ruleParamDecl )
            	    {
            	    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:302:1: (lv_publicParams_12_0= ruleParamDecl )
            	    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:303:3: lv_publicParams_12_0= ruleParamDecl
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getProtocolAccess().getPublicParamsParamDeclParserRuleCall_10_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleParamDecl_in_ruleProtocol337);
            	    lv_publicParams_12_0=ruleParamDecl();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getProtocolRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"publicParams",
            	    	        		lv_publicParams_12_0, 
            	    	        		"ParamDecl", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:325:4: ( ( (lv_junkPriv_13_0= rulekPRIVATE ) ) ( (lv_privateParams_14_0= ruleParameter ) ) ( RULE_COMMA ( (lv_privateParams_16_0= ruleParameter ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:325:5: ( (lv_junkPriv_13_0= rulekPRIVATE ) ) ( (lv_privateParams_14_0= ruleParameter ) ) ( RULE_COMMA ( (lv_privateParams_16_0= ruleParameter ) ) )*
                    {
                    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:325:5: ( (lv_junkPriv_13_0= rulekPRIVATE ) )
                    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:326:1: (lv_junkPriv_13_0= rulekPRIVATE )
                    {
                    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:326:1: (lv_junkPriv_13_0= rulekPRIVATE )
                    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:327:3: lv_junkPriv_13_0= rulekPRIVATE
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProtocolAccess().getJunkPrivKPRIVATEEnumRuleCall_11_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulekPRIVATE_in_ruleProtocol361);
                    lv_junkPriv_13_0=rulekPRIVATE();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProtocolRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"junkPriv",
                    	        		true, 
                    	        		"kPRIVATE", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:349:2: ( (lv_privateParams_14_0= ruleParameter ) )
                    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:350:1: (lv_privateParams_14_0= ruleParameter )
                    {
                    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:350:1: (lv_privateParams_14_0= ruleParameter )
                    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:351:3: lv_privateParams_14_0= ruleParameter
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProtocolAccess().getPrivateParamsParameterParserRuleCall_11_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleProtocol382);
                    lv_privateParams_14_0=ruleParameter();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProtocolRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"privateParams",
                    	        		lv_privateParams_14_0, 
                    	        		"Parameter", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:373:2: ( RULE_COMMA ( (lv_privateParams_16_0= ruleParameter ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_COMMA) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:373:3: RULE_COMMA ( (lv_privateParams_16_0= ruleParameter ) )
                    	    {
                    	    match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleProtocol392); 
                    	     
                    	        createLeafNode(grammarAccess.getProtocolAccess().getCOMMATerminalRuleCall_11_2_0(), null); 
                    	        
                    	    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:377:1: ( (lv_privateParams_16_0= ruleParameter ) )
                    	    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:378:1: (lv_privateParams_16_0= ruleParameter )
                    	    {
                    	    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:378:1: (lv_privateParams_16_0= ruleParameter )
                    	    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:379:3: lv_privateParams_16_0= ruleParameter
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getProtocolAccess().getPrivateParamsParameterParserRuleCall_11_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleProtocol412);
                    	    lv_privateParams_16_0=ruleParameter();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getProtocolRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"privateParams",
                    	    	        		lv_privateParams_16_0, 
                    	    	        		"Parameter", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:401:6: ( ( (lv_references_17_1= ruleReference | lv_references_17_2= ruleMessage ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:402:1: ( (lv_references_17_1= ruleReference | lv_references_17_2= ruleMessage ) )
            	    {
            	    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:402:1: ( (lv_references_17_1= ruleReference | lv_references_17_2= ruleMessage ) )
            	    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:403:1: (lv_references_17_1= ruleReference | lv_references_17_2= ruleMessage )
            	    {
            	    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:403:1: (lv_references_17_1= ruleReference | lv_references_17_2= ruleMessage )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==RULE_ID) ) {
            	        int LA6_1 = input.LA(2);

            	        if ( (LA6_1==RULE_LPAREN) ) {
            	            alt6=1;
            	        }
            	        else if ( (LA6_1==RULE_ARROW) ) {
            	            alt6=2;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("403:1: (lv_references_17_1= ruleReference | lv_references_17_2= ruleMessage )", 6, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("403:1: (lv_references_17_1= ruleReference | lv_references_17_2= ruleMessage )", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:404:3: lv_references_17_1= ruleReference
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getProtocolAccess().getReferencesReferenceParserRuleCall_12_0_0(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_ruleReference_in_ruleProtocol439);
            	            lv_references_17_1=ruleReference();
            	            _fsp--;


            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getProtocolRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	        }
            	            	        try {
            	            	       		add(
            	            	       			current, 
            	            	       			"references",
            	            	        		lv_references_17_1, 
            	            	        		"Reference", 
            	            	        		currentNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	        currentNode = currentNode.getParent();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:425:8: lv_references_17_2= ruleMessage
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getProtocolAccess().getReferencesMessageParserRuleCall_12_0_1(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_ruleMessage_in_ruleProtocol458);
            	            lv_references_17_2=ruleMessage();
            	            _fsp--;


            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getProtocolRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	        }
            	            	        try {
            	            	       		add(
            	            	       			current, 
            	            	       			"references",
            	            	        		lv_references_17_2, 
            	            	        		"Message", 
            	            	        		currentNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	        currentNode = currentNode.getParent();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleProtocol471); 
             
                createLeafNode(grammarAccess.getProtocolAccess().getRBRACETerminalRuleCall_13(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleProtocol


    // $ANTLR start entryRuleRole
    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:461:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:462:2: (iv_ruleRole= ruleRole EOF )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:463:2: iv_ruleRole= ruleRole EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRoleRule(), currentNode); 
            pushFollow(FOLLOW_ruleRole_in_entryRuleRole506);
            iv_ruleRole=ruleRole();
            _fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRole516); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRole


    // $ANTLR start ruleRole
    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:470:1: ruleRole returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:475:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:476:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:476:1: ( (lv_name_0_0= RULE_ID ) )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:477:1: (lv_name_0_0= RULE_ID )
            {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:477:1: (lv_name_0_0= RULE_ID )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:478:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRole557); 

            			createLeafNode(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRoleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRole


    // $ANTLR start entryRuleParamDecl
    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:508:1: entryRuleParamDecl returns [EObject current=null] : iv_ruleParamDecl= ruleParamDecl EOF ;
    public final EObject entryRuleParamDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamDecl = null;


        try {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:509:2: (iv_ruleParamDecl= ruleParamDecl EOF )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:510:2: iv_ruleParamDecl= ruleParamDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParamDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleParamDecl_in_entryRuleParamDecl597);
            iv_ruleParamDecl=ruleParamDecl();
            _fsp--;

             current =iv_ruleParamDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParamDecl607); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleParamDecl


    // $ANTLR start ruleParamDecl
    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:517:1: ruleParamDecl returns [EObject current=null] : ( ( (lv_adornment_0_0= rulekAdornment ) ) ( (lv_param_1_0= ruleParameter ) ) ( (lv_isKey_2_0= rulekKEY ) )? ) ;
    public final EObject ruleParamDecl() throws RecognitionException {
        EObject current = null;

        Enumerator lv_adornment_0_0 = null;

        EObject lv_param_1_0 = null;

        Enumerator lv_isKey_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:522:6: ( ( ( (lv_adornment_0_0= rulekAdornment ) ) ( (lv_param_1_0= ruleParameter ) ) ( (lv_isKey_2_0= rulekKEY ) )? ) )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:523:1: ( ( (lv_adornment_0_0= rulekAdornment ) ) ( (lv_param_1_0= ruleParameter ) ) ( (lv_isKey_2_0= rulekKEY ) )? )
            {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:523:1: ( ( (lv_adornment_0_0= rulekAdornment ) ) ( (lv_param_1_0= ruleParameter ) ) ( (lv_isKey_2_0= rulekKEY ) )? )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:523:2: ( (lv_adornment_0_0= rulekAdornment ) ) ( (lv_param_1_0= ruleParameter ) ) ( (lv_isKey_2_0= rulekKEY ) )?
            {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:523:2: ( (lv_adornment_0_0= rulekAdornment ) )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:524:1: (lv_adornment_0_0= rulekAdornment )
            {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:524:1: (lv_adornment_0_0= rulekAdornment )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:525:3: lv_adornment_0_0= rulekAdornment
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getParamDeclAccess().getAdornmentKAdornmentEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulekAdornment_in_ruleParamDecl653);
            lv_adornment_0_0=rulekAdornment();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getParamDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"adornment",
            	        		lv_adornment_0_0, 
            	        		"kAdornment", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:547:2: ( (lv_param_1_0= ruleParameter ) )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:548:1: (lv_param_1_0= ruleParameter )
            {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:548:1: (lv_param_1_0= ruleParameter )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:549:3: lv_param_1_0= ruleParameter
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getParamDeclAccess().getParamParameterParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleParamDecl674);
            lv_param_1_0=ruleParameter();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getParamDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"param",
            	        		lv_param_1_0, 
            	        		"Parameter", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:571:2: ( (lv_isKey_2_0= rulekKEY ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:572:1: (lv_isKey_2_0= rulekKEY )
                    {
                    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:572:1: (lv_isKey_2_0= rulekKEY )
                    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:573:3: lv_isKey_2_0= rulekKEY
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getParamDeclAccess().getIsKeyKKEYEnumRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulekKEY_in_ruleParamDecl695);
                    lv_isKey_2_0=rulekKEY();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getParamDeclRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"isKey",
                    	        		true, 
                    	        		"kKEY", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleParamDecl


    // $ANTLR start entryRuleParameter
    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:603:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:604:2: (iv_ruleParameter= ruleParameter EOF )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:605:2: iv_ruleParameter= ruleParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter732);
            iv_ruleParameter=ruleParameter();
            _fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter742); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleParameter


    // $ANTLR start ruleParameter
    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:612:1: ruleParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:617:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:618:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:618:1: ( (lv_name_0_0= RULE_ID ) )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:619:1: (lv_name_0_0= RULE_ID )
            {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:619:1: (lv_name_0_0= RULE_ID )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:620:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter783); 

            			createLeafNode(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getParameterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleParameter


    // $ANTLR start entryRuleParamRef
    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:650:1: entryRuleParamRef returns [EObject current=null] : iv_ruleParamRef= ruleParamRef EOF ;
    public final EObject entryRuleParamRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamRef = null;


        try {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:651:2: (iv_ruleParamRef= ruleParamRef EOF )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:652:2: iv_ruleParamRef= ruleParamRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParamRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleParamRef_in_entryRuleParamRef823);
            iv_ruleParamRef=ruleParamRef();
            _fsp--;

             current =iv_ruleParamRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParamRef833); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleParamRef


    // $ANTLR start ruleParamRef
    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:659:1: ruleParamRef returns [EObject current=null] : ( ( (lv_adornment_0_0= rulekAdornment ) ) ( ( RULE_ID ) ) ( (lv_isKey_2_0= rulekKEY ) )? ) ;
    public final EObject ruleParamRef() throws RecognitionException {
        EObject current = null;

        Enumerator lv_adornment_0_0 = null;

        Enumerator lv_isKey_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:664:6: ( ( ( (lv_adornment_0_0= rulekAdornment ) ) ( ( RULE_ID ) ) ( (lv_isKey_2_0= rulekKEY ) )? ) )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:665:1: ( ( (lv_adornment_0_0= rulekAdornment ) ) ( ( RULE_ID ) ) ( (lv_isKey_2_0= rulekKEY ) )? )
            {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:665:1: ( ( (lv_adornment_0_0= rulekAdornment ) ) ( ( RULE_ID ) ) ( (lv_isKey_2_0= rulekKEY ) )? )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:665:2: ( (lv_adornment_0_0= rulekAdornment ) ) ( ( RULE_ID ) ) ( (lv_isKey_2_0= rulekKEY ) )?
            {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:665:2: ( (lv_adornment_0_0= rulekAdornment ) )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:666:1: (lv_adornment_0_0= rulekAdornment )
            {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:666:1: (lv_adornment_0_0= rulekAdornment )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:667:3: lv_adornment_0_0= rulekAdornment
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getParamRefAccess().getAdornmentKAdornmentEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulekAdornment_in_ruleParamRef879);
            lv_adornment_0_0=rulekAdornment();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getParamRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"adornment",
            	        		lv_adornment_0_0, 
            	        		"kAdornment", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:689:2: ( ( RULE_ID ) )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:690:1: ( RULE_ID )
            {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:690:1: ( RULE_ID )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:691:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getParamRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParamRef897); 

            		createLeafNode(grammarAccess.getParamRefAccess().getParamParameterCrossReference_1_0(), "param"); 
            	

            }


            }

            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:703:2: ( (lv_isKey_2_0= rulekKEY ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:704:1: (lv_isKey_2_0= rulekKEY )
                    {
                    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:704:1: (lv_isKey_2_0= rulekKEY )
                    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:705:3: lv_isKey_2_0= rulekKEY
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getParamRefAccess().getIsKeyKKEYEnumRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulekKEY_in_ruleParamRef918);
                    lv_isKey_2_0=rulekKEY();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getParamRefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"isKey",
                    	        		true, 
                    	        		"kKEY", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleParamRef


    // $ANTLR start entryRuleMessage
    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:735:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:736:2: (iv_ruleMessage= ruleMessage EOF )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:737:2: iv_ruleMessage= ruleMessage EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMessageRule(), currentNode); 
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage955);
            iv_ruleMessage=ruleMessage();
            _fsp--;

             current =iv_ruleMessage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage965); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMessage


    // $ANTLR start ruleMessage
    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:744:1: ruleMessage returns [EObject current=null] : ( ( ( RULE_ID ) ) RULE_ARROW ( ( RULE_ID ) ) RULE_COLON ( (lv_name_4_0= RULE_ID ) ) RULE_LBRACKET ( (lv_params_6_0= ruleParamRef ) ) ( RULE_COMMA ( (lv_params_8_0= ruleParamRef ) ) )* RULE_RBRACKET ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token lv_name_4_0=null;
        EObject lv_params_6_0 = null;

        EObject lv_params_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:749:6: ( ( ( ( RULE_ID ) ) RULE_ARROW ( ( RULE_ID ) ) RULE_COLON ( (lv_name_4_0= RULE_ID ) ) RULE_LBRACKET ( (lv_params_6_0= ruleParamRef ) ) ( RULE_COMMA ( (lv_params_8_0= ruleParamRef ) ) )* RULE_RBRACKET ) )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:750:1: ( ( ( RULE_ID ) ) RULE_ARROW ( ( RULE_ID ) ) RULE_COLON ( (lv_name_4_0= RULE_ID ) ) RULE_LBRACKET ( (lv_params_6_0= ruleParamRef ) ) ( RULE_COMMA ( (lv_params_8_0= ruleParamRef ) ) )* RULE_RBRACKET )
            {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:750:1: ( ( ( RULE_ID ) ) RULE_ARROW ( ( RULE_ID ) ) RULE_COLON ( (lv_name_4_0= RULE_ID ) ) RULE_LBRACKET ( (lv_params_6_0= ruleParamRef ) ) ( RULE_COMMA ( (lv_params_8_0= ruleParamRef ) ) )* RULE_RBRACKET )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:750:2: ( ( RULE_ID ) ) RULE_ARROW ( ( RULE_ID ) ) RULE_COLON ( (lv_name_4_0= RULE_ID ) ) RULE_LBRACKET ( (lv_params_6_0= ruleParamRef ) ) ( RULE_COMMA ( (lv_params_8_0= ruleParamRef ) ) )* RULE_RBRACKET
            {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:750:2: ( ( RULE_ID ) )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:751:1: ( RULE_ID )
            {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:751:1: ( RULE_ID )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:752:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getMessageRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessage1008); 

            		createLeafNode(grammarAccess.getMessageAccess().getSenderRoleCrossReference_0_0(), "sender"); 
            	

            }


            }

            match(input,RULE_ARROW,FOLLOW_RULE_ARROW_in_ruleMessage1017); 
             
                createLeafNode(grammarAccess.getMessageAccess().getARROWTerminalRuleCall_1(), null); 
                
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:768:1: ( ( RULE_ID ) )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:769:1: ( RULE_ID )
            {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:769:1: ( RULE_ID )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:770:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getMessageRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessage1034); 

            		createLeafNode(grammarAccess.getMessageAccess().getReceiverRoleCrossReference_2_0(), "receiver"); 
            	

            }


            }

            match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleMessage1043); 
             
                createLeafNode(grammarAccess.getMessageAccess().getCOLONTerminalRuleCall_3(), null); 
                
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:786:1: ( (lv_name_4_0= RULE_ID ) )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:787:1: (lv_name_4_0= RULE_ID )
            {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:787:1: (lv_name_4_0= RULE_ID )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:788:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessage1059); 

            			createLeafNode(grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_4_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMessageRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_4_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_ruleMessage1073); 
             
                createLeafNode(grammarAccess.getMessageAccess().getLBRACKETTerminalRuleCall_5(), null); 
                
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:814:1: ( (lv_params_6_0= ruleParamRef ) )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:815:1: (lv_params_6_0= ruleParamRef )
            {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:815:1: (lv_params_6_0= ruleParamRef )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:816:3: lv_params_6_0= ruleParamRef
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMessageAccess().getParamsParamRefParserRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleParamRef_in_ruleMessage1093);
            lv_params_6_0=ruleParamRef();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMessageRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"params",
            	        		lv_params_6_0, 
            	        		"ParamRef", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:838:2: ( RULE_COMMA ( (lv_params_8_0= ruleParamRef ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_COMMA) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:838:3: RULE_COMMA ( (lv_params_8_0= ruleParamRef ) )
            	    {
            	    match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleMessage1103); 
            	     
            	        createLeafNode(grammarAccess.getMessageAccess().getCOMMATerminalRuleCall_7_0(), null); 
            	        
            	    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:842:1: ( (lv_params_8_0= ruleParamRef ) )
            	    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:843:1: (lv_params_8_0= ruleParamRef )
            	    {
            	    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:843:1: (lv_params_8_0= ruleParamRef )
            	    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:844:3: lv_params_8_0= ruleParamRef
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getMessageAccess().getParamsParamRefParserRuleCall_7_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleParamRef_in_ruleMessage1123);
            	    lv_params_8_0=ruleParamRef();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getMessageRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"params",
            	    	        		lv_params_8_0, 
            	    	        		"ParamRef", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match(input,RULE_RBRACKET,FOLLOW_RULE_RBRACKET_in_ruleMessage1134); 
             
                createLeafNode(grammarAccess.getMessageAccess().getRBRACKETTerminalRuleCall_8(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMessage


    // $ANTLR start entryRuleReference
    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:878:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:879:2: (iv_ruleReference= ruleReference EOF )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:880:2: iv_ruleReference= ruleReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference1169);
            iv_ruleReference=ruleReference();
            _fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference1179); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleReference


    // $ANTLR start ruleReference
    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:887:1: ruleReference returns [EObject current=null] : ( ( ( RULE_ID ) ) RULE_LPAREN ( ( ( RULE_ID ) ) RULE_COMMA )+ ( (lv_params_4_0= ruleParamRef ) ) ( RULE_COMMA ( (lv_params_6_0= ruleParamRef ) ) )* RULE_RPAREN ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        EObject lv_params_4_0 = null;

        EObject lv_params_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:892:6: ( ( ( ( RULE_ID ) ) RULE_LPAREN ( ( ( RULE_ID ) ) RULE_COMMA )+ ( (lv_params_4_0= ruleParamRef ) ) ( RULE_COMMA ( (lv_params_6_0= ruleParamRef ) ) )* RULE_RPAREN ) )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:893:1: ( ( ( RULE_ID ) ) RULE_LPAREN ( ( ( RULE_ID ) ) RULE_COMMA )+ ( (lv_params_4_0= ruleParamRef ) ) ( RULE_COMMA ( (lv_params_6_0= ruleParamRef ) ) )* RULE_RPAREN )
            {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:893:1: ( ( ( RULE_ID ) ) RULE_LPAREN ( ( ( RULE_ID ) ) RULE_COMMA )+ ( (lv_params_4_0= ruleParamRef ) ) ( RULE_COMMA ( (lv_params_6_0= ruleParamRef ) ) )* RULE_RPAREN )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:893:2: ( ( RULE_ID ) ) RULE_LPAREN ( ( ( RULE_ID ) ) RULE_COMMA )+ ( (lv_params_4_0= ruleParamRef ) ) ( RULE_COMMA ( (lv_params_6_0= ruleParamRef ) ) )* RULE_RPAREN
            {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:893:2: ( ( RULE_ID ) )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:894:1: ( RULE_ID )
            {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:894:1: ( RULE_ID )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:895:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference1222); 

            		createLeafNode(grammarAccess.getReferenceAccess().getRefBSPLCrossReference_0_0(), "ref"); 
            	

            }


            }

            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleReference1231); 
             
                createLeafNode(grammarAccess.getReferenceAccess().getLPARENTerminalRuleCall_1(), null); 
                
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:911:1: ( ( ( RULE_ID ) ) RULE_COMMA )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:911:2: ( ( RULE_ID ) ) RULE_COMMA
            	    {
            	    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:911:2: ( ( RULE_ID ) )
            	    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:912:1: ( RULE_ID )
            	    {
            	    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:912:1: ( RULE_ID )
            	    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:913:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getReferenceRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference1249); 

            	    		createLeafNode(grammarAccess.getReferenceAccess().getRolesRoleCrossReference_2_0_0(), "roles"); 
            	    	

            	    }


            	    }

            	    match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleReference1258); 
            	     
            	        createLeafNode(grammarAccess.getReferenceAccess().getCOMMATerminalRuleCall_2_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:929:3: ( (lv_params_4_0= ruleParamRef ) )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:930:1: (lv_params_4_0= ruleParamRef )
            {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:930:1: (lv_params_4_0= ruleParamRef )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:931:3: lv_params_4_0= ruleParamRef
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getReferenceAccess().getParamsParamRefParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleParamRef_in_ruleReference1280);
            lv_params_4_0=ruleParamRef();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"params",
            	        		lv_params_4_0, 
            	        		"ParamRef", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:953:2: ( RULE_COMMA ( (lv_params_6_0= ruleParamRef ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:953:3: RULE_COMMA ( (lv_params_6_0= ruleParamRef ) )
            	    {
            	    match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleReference1290); 
            	     
            	        createLeafNode(grammarAccess.getReferenceAccess().getCOMMATerminalRuleCall_4_0(), null); 
            	        
            	    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:957:1: ( (lv_params_6_0= ruleParamRef ) )
            	    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:958:1: (lv_params_6_0= ruleParamRef )
            	    {
            	    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:958:1: (lv_params_6_0= ruleParamRef )
            	    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:959:3: lv_params_6_0= ruleParamRef
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getReferenceAccess().getParamsParamRefParserRuleCall_4_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleParamRef_in_ruleReference1310);
            	    lv_params_6_0=ruleParamRef();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getReferenceRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"params",
            	    	        		lv_params_6_0, 
            	    	        		"ParamRef", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleReference1321); 
             
                createLeafNode(grammarAccess.getReferenceAccess().getRPARENTerminalRuleCall_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleReference


    // $ANTLR start rulekAdornment
    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:993:1: rulekAdornment returns [Enumerator current=null] : ( ( 'in' ) | ( 'out' ) | ( 'io' ) | ( 'nil' ) ) ;
    public final Enumerator rulekAdornment() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:997:6: ( ( ( 'in' ) | ( 'out' ) | ( 'io' ) | ( 'nil' ) ) )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:998:1: ( ( 'in' ) | ( 'out' ) | ( 'io' ) | ( 'nil' ) )
            {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:998:1: ( ( 'in' ) | ( 'out' ) | ( 'io' ) | ( 'nil' ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt13=1;
                }
                break;
            case 21:
                {
                alt13=2;
                }
                break;
            case 22:
                {
                alt13=3;
                }
                break;
            case 23:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("998:1: ( ( 'in' ) | ( 'out' ) | ( 'io' ) | ( 'nil' ) )", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:998:2: ( 'in' )
                    {
                    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:998:2: ( 'in' )
                    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:998:4: 'in'
                    {
                    match(input,20,FOLLOW_20_in_rulekAdornment1368); 

                            current = grammarAccess.getKAdornmentAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getKAdornmentAccess().getInEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:1004:6: ( 'out' )
                    {
                    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:1004:6: ( 'out' )
                    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:1004:8: 'out'
                    {
                    match(input,21,FOLLOW_21_in_rulekAdornment1383); 

                            current = grammarAccess.getKAdornmentAccess().getOutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getKAdornmentAccess().getOutEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:1010:6: ( 'io' )
                    {
                    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:1010:6: ( 'io' )
                    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:1010:8: 'io'
                    {
                    match(input,22,FOLLOW_22_in_rulekAdornment1398); 

                            current = grammarAccess.getKAdornmentAccess().getIoEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getKAdornmentAccess().getIoEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:1016:6: ( 'nil' )
                    {
                    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:1016:6: ( 'nil' )
                    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:1016:8: 'nil'
                    {
                    match(input,23,FOLLOW_23_in_rulekAdornment1413); 

                            current = grammarAccess.getKAdornmentAccess().getNilEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getKAdornmentAccess().getNilEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulekAdornment


    // $ANTLR start rulekPROTOCOL
    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:1026:1: rulekPROTOCOL returns [Enumerator current=null] : ( 'protocol' ) ;
    public final Enumerator rulekPROTOCOL() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:1030:6: ( ( 'protocol' ) )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:1031:1: ( 'protocol' )
            {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:1031:1: ( 'protocol' )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:1031:3: 'protocol'
            {
            match(input,24,FOLLOW_24_in_rulekPROTOCOL1455); 

                    current = grammarAccess.getKPROTOCOLAccess().getProtocolEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    createLeafNode(grammarAccess.getKPROTOCOLAccess().getProtocolEnumLiteralDeclaration(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulekPROTOCOL


    // $ANTLR start rulekROLE
    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:1041:1: rulekROLE returns [Enumerator current=null] : ( 'role' ) ;
    public final Enumerator rulekROLE() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:1045:6: ( ( 'role' ) )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:1046:1: ( 'role' )
            {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:1046:1: ( 'role' )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:1046:3: 'role'
            {
            match(input,25,FOLLOW_25_in_rulekROLE1496); 

                    current = grammarAccess.getKROLEAccess().getRoleEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    createLeafNode(grammarAccess.getKROLEAccess().getRoleEnumLiteralDeclaration(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulekROLE


    // $ANTLR start rulekPARAMETER
    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:1056:1: rulekPARAMETER returns [Enumerator current=null] : ( 'parameter' ) ;
    public final Enumerator rulekPARAMETER() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:1060:6: ( ( 'parameter' ) )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:1061:1: ( 'parameter' )
            {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:1061:1: ( 'parameter' )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:1061:3: 'parameter'
            {
            match(input,26,FOLLOW_26_in_rulekPARAMETER1537); 

                    current = grammarAccess.getKPARAMETERAccess().getParameterEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    createLeafNode(grammarAccess.getKPARAMETERAccess().getParameterEnumLiteralDeclaration(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulekPARAMETER


    // $ANTLR start rulekPRIVATE
    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:1071:1: rulekPRIVATE returns [Enumerator current=null] : ( 'private' ) ;
    public final Enumerator rulekPRIVATE() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:1075:6: ( ( 'private' ) )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:1076:1: ( 'private' )
            {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:1076:1: ( 'private' )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:1076:3: 'private'
            {
            match(input,27,FOLLOW_27_in_rulekPRIVATE1578); 

                    current = grammarAccess.getKPRIVATEAccess().getPrivateEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    createLeafNode(grammarAccess.getKPRIVATEAccess().getPrivateEnumLiteralDeclaration(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulekPRIVATE


    // $ANTLR start rulekKEY
    // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:1086:1: rulekKEY returns [Enumerator current=null] : ( 'key' ) ;
    public final Enumerator rulekKEY() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:1090:6: ( ( 'key' ) )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:1091:1: ( 'key' )
            {
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:1091:1: ( 'key' )
            // ../ooi.bspl/src-gen/ooi/bspl/parser/antlr/internal/InternalBSPL.g:1091:3: 'key'
            {
            match(input,28,FOLLOW_28_in_rulekKEY1619); 

                    current = grammarAccess.getKKEYAccess().getKeyEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    createLeafNode(grammarAccess.getKKEYAccess().getKeyEnumLiteralDeclaration(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulekKEY


 

    public static final BitSet FOLLOW_ruleProtocol_in_entryRuleProtocol75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtocol85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulekPROTOCOL_in_ruleProtocol131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProtocol149 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleProtocol163 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rulekROLE_in_ruleProtocol183 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRole_in_ruleProtocol204 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleProtocol213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRole_in_ruleProtocol233 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleProtocol243 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRole_in_ruleProtocol263 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_rulekPARAMETER_in_ruleProtocol286 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleParamDecl_in_ruleProtocol307 = new BitSet(new long[]{0x0000000008000050L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleProtocol317 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleParamDecl_in_ruleProtocol337 = new BitSet(new long[]{0x0000000008000050L});
    public static final BitSet FOLLOW_rulekPRIVATE_in_ruleProtocol361 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleProtocol382 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleProtocol392 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleProtocol412 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleReference_in_ruleProtocol439 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleProtocol458 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleProtocol471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRole557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamDecl_in_entryRuleParamDecl597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParamDecl607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulekAdornment_in_ruleParamDecl653 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParamDecl674 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rulekKEY_in_ruleParamDecl695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamRef_in_entryRuleParamRef823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParamRef833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulekAdornment_in_ruleParamRef879 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParamRef897 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rulekKEY_in_ruleParamRef918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessage1008 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ARROW_in_ruleMessage1017 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessage1034 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleMessage1043 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessage1059 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_ruleMessage1073 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleParamRef_in_ruleMessage1093 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleMessage1103 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleParamRef_in_ruleMessage1123 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_RULE_RBRACKET_in_ruleMessage1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference1169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference1222 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleReference1231 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference1249 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleReference1258 = new BitSet(new long[]{0x0000000000F00010L});
    public static final BitSet FOLLOW_ruleParamRef_in_ruleReference1280 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleReference1290 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleParamRef_in_ruleReference1310 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleReference1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulekAdornment1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulekAdornment1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulekAdornment1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulekAdornment1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulekPROTOCOL1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulekROLE1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulekPARAMETER1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulekPRIVATE1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulekKEY1619 = new BitSet(new long[]{0x0000000000000002L});

}