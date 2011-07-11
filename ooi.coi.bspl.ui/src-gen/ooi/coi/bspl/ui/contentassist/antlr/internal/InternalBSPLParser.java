package ooi.coi.bspl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import ooi.coi.bspl.services.BSPLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBSPLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LBRACE", "RULE_COMMA", "RULE_RBRACE", "RULE_ARROW", "RULE_COLON", "RULE_LBRACKET", "RULE_RBRACKET", "RULE_LPAREN", "RULE_RPAREN", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'protocol'", "'role'", "'parameter'", "'private'", "'key'", "'in'", "'out'", "'io'", "'nil'"
    };
    public static final int RULE_ID=13;
    public static final int T__28=28;
    public static final int RULE_RBRACE=6;
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
    public static final int RULE_SL_COMMENT=17;
    public static final int EOF=-1;
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


        public InternalBSPLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBSPLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBSPLParser.tokenNames; }
    public String getGrammarFileName() { return "../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g"; }


     
     	private BSPLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(BSPLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleProtocol"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:61:1: entryRuleProtocol : ruleProtocol EOF ;
    public final void entryRuleProtocol() throws RecognitionException {
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:62:1: ( ruleProtocol EOF )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:63:1: ruleProtocol EOF
            {
             before(grammarAccess.getProtocolRule()); 
            pushFollow(FOLLOW_ruleProtocol_in_entryRuleProtocol61);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getProtocolRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtocol68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProtocol"


    // $ANTLR start "ruleProtocol"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:70:1: ruleProtocol : ( ( rule__Protocol__Group__0 ) ) ;
    public final void ruleProtocol() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:74:2: ( ( ( rule__Protocol__Group__0 ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:75:1: ( ( rule__Protocol__Group__0 ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:75:1: ( ( rule__Protocol__Group__0 ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:76:1: ( rule__Protocol__Group__0 )
            {
             before(grammarAccess.getProtocolAccess().getGroup()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:77:1: ( rule__Protocol__Group__0 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:77:2: rule__Protocol__Group__0
            {
            pushFollow(FOLLOW_rule__Protocol__Group__0_in_ruleProtocol94);
            rule__Protocol__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "entryRuleRole"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:89:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:90:1: ( ruleRole EOF )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:91:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_ruleRole_in_entryRuleRole121);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRole128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:98:1: ruleRole : ( ( rule__Role__NameAssignment ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:102:2: ( ( ( rule__Role__NameAssignment ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:103:1: ( ( rule__Role__NameAssignment ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:103:1: ( ( rule__Role__NameAssignment ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:104:1: ( rule__Role__NameAssignment )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:105:1: ( rule__Role__NameAssignment )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:105:2: rule__Role__NameAssignment
            {
            pushFollow(FOLLOW_rule__Role__NameAssignment_in_ruleRole154);
            rule__Role__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleParamDecl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:117:1: entryRuleParamDecl : ruleParamDecl EOF ;
    public final void entryRuleParamDecl() throws RecognitionException {
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:118:1: ( ruleParamDecl EOF )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:119:1: ruleParamDecl EOF
            {
             before(grammarAccess.getParamDeclRule()); 
            pushFollow(FOLLOW_ruleParamDecl_in_entryRuleParamDecl181);
            ruleParamDecl();

            state._fsp--;

             after(grammarAccess.getParamDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParamDecl188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParamDecl"


    // $ANTLR start "ruleParamDecl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:126:1: ruleParamDecl : ( ( rule__ParamDecl__Group__0 ) ) ;
    public final void ruleParamDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:130:2: ( ( ( rule__ParamDecl__Group__0 ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:131:1: ( ( rule__ParamDecl__Group__0 ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:131:1: ( ( rule__ParamDecl__Group__0 ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:132:1: ( rule__ParamDecl__Group__0 )
            {
             before(grammarAccess.getParamDeclAccess().getGroup()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:133:1: ( rule__ParamDecl__Group__0 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:133:2: rule__ParamDecl__Group__0
            {
            pushFollow(FOLLOW_rule__ParamDecl__Group__0_in_ruleParamDecl214);
            rule__ParamDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParamDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParamDecl"


    // $ANTLR start "entryRuleParameter"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:145:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:146:1: ( ruleParameter EOF )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:147:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter241);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:154:1: ruleParameter : ( ( rule__Parameter__NameAssignment ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:158:2: ( ( ( rule__Parameter__NameAssignment ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:159:1: ( ( rule__Parameter__NameAssignment ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:159:1: ( ( rule__Parameter__NameAssignment ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:160:1: ( rule__Parameter__NameAssignment )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:161:1: ( rule__Parameter__NameAssignment )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:161:2: rule__Parameter__NameAssignment
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_in_ruleParameter274);
            rule__Parameter__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleParamRef"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:173:1: entryRuleParamRef : ruleParamRef EOF ;
    public final void entryRuleParamRef() throws RecognitionException {
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:174:1: ( ruleParamRef EOF )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:175:1: ruleParamRef EOF
            {
             before(grammarAccess.getParamRefRule()); 
            pushFollow(FOLLOW_ruleParamRef_in_entryRuleParamRef301);
            ruleParamRef();

            state._fsp--;

             after(grammarAccess.getParamRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParamRef308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParamRef"


    // $ANTLR start "ruleParamRef"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:182:1: ruleParamRef : ( ( rule__ParamRef__Group__0 ) ) ;
    public final void ruleParamRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:186:2: ( ( ( rule__ParamRef__Group__0 ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:187:1: ( ( rule__ParamRef__Group__0 ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:187:1: ( ( rule__ParamRef__Group__0 ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:188:1: ( rule__ParamRef__Group__0 )
            {
             before(grammarAccess.getParamRefAccess().getGroup()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:189:1: ( rule__ParamRef__Group__0 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:189:2: rule__ParamRef__Group__0
            {
            pushFollow(FOLLOW_rule__ParamRef__Group__0_in_ruleParamRef334);
            rule__ParamRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParamRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParamRef"


    // $ANTLR start "entryRuleMessage"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:201:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:202:1: ( ruleMessage EOF )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:203:1: ruleMessage EOF
            {
             before(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage361);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getMessageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:210:1: ruleMessage : ( ( rule__Message__Group__0 ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:214:2: ( ( ( rule__Message__Group__0 ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:215:1: ( ( rule__Message__Group__0 ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:215:1: ( ( rule__Message__Group__0 ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:216:1: ( rule__Message__Group__0 )
            {
             before(grammarAccess.getMessageAccess().getGroup()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:217:1: ( rule__Message__Group__0 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:217:2: rule__Message__Group__0
            {
            pushFollow(FOLLOW_rule__Message__Group__0_in_ruleMessage394);
            rule__Message__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleReference"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:229:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:230:1: ( ruleReference EOF )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:231:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference421);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:238:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:242:2: ( ( ( rule__Reference__Group__0 ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:243:1: ( ( rule__Reference__Group__0 ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:243:1: ( ( rule__Reference__Group__0 ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:244:1: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:245:1: ( rule__Reference__Group__0 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:245:2: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_rule__Reference__Group__0_in_ruleReference454);
            rule__Reference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "rulekAdornment"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:258:1: rulekAdornment : ( ( rule__KAdornment__Alternatives ) ) ;
    public final void rulekAdornment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:262:1: ( ( ( rule__KAdornment__Alternatives ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:263:1: ( ( rule__KAdornment__Alternatives ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:263:1: ( ( rule__KAdornment__Alternatives ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:264:1: ( rule__KAdornment__Alternatives )
            {
             before(grammarAccess.getKAdornmentAccess().getAlternatives()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:265:1: ( rule__KAdornment__Alternatives )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:265:2: rule__KAdornment__Alternatives
            {
            pushFollow(FOLLOW_rule__KAdornment__Alternatives_in_rulekAdornment491);
            rule__KAdornment__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getKAdornmentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulekAdornment"


    // $ANTLR start "rulekPROTOCOL"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:277:1: rulekPROTOCOL : ( ( 'protocol' ) ) ;
    public final void rulekPROTOCOL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:281:1: ( ( ( 'protocol' ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:282:1: ( ( 'protocol' ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:282:1: ( ( 'protocol' ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:283:1: ( 'protocol' )
            {
             before(grammarAccess.getKPROTOCOLAccess().getProtocolEnumLiteralDeclaration()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:284:1: ( 'protocol' )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:284:3: 'protocol'
            {
            match(input,20,FOLLOW_20_in_rulekPROTOCOL528); 

            }

             after(grammarAccess.getKPROTOCOLAccess().getProtocolEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulekPROTOCOL"


    // $ANTLR start "rulekROLE"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:297:1: rulekROLE : ( ( 'role' ) ) ;
    public final void rulekROLE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:301:1: ( ( ( 'role' ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:302:1: ( ( 'role' ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:302:1: ( ( 'role' ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:303:1: ( 'role' )
            {
             before(grammarAccess.getKROLEAccess().getRoleEnumLiteralDeclaration()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:304:1: ( 'role' )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:304:3: 'role'
            {
            match(input,21,FOLLOW_21_in_rulekROLE567); 

            }

             after(grammarAccess.getKROLEAccess().getRoleEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulekROLE"


    // $ANTLR start "rulekPARAMETER"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:317:1: rulekPARAMETER : ( ( 'parameter' ) ) ;
    public final void rulekPARAMETER() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:321:1: ( ( ( 'parameter' ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:322:1: ( ( 'parameter' ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:322:1: ( ( 'parameter' ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:323:1: ( 'parameter' )
            {
             before(grammarAccess.getKPARAMETERAccess().getParameterEnumLiteralDeclaration()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:324:1: ( 'parameter' )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:324:3: 'parameter'
            {
            match(input,22,FOLLOW_22_in_rulekPARAMETER606); 

            }

             after(grammarAccess.getKPARAMETERAccess().getParameterEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulekPARAMETER"


    // $ANTLR start "rulekPRIVATE"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:337:1: rulekPRIVATE : ( ( 'private' ) ) ;
    public final void rulekPRIVATE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:341:1: ( ( ( 'private' ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:342:1: ( ( 'private' ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:342:1: ( ( 'private' ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:343:1: ( 'private' )
            {
             before(grammarAccess.getKPRIVATEAccess().getPrivateEnumLiteralDeclaration()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:344:1: ( 'private' )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:344:3: 'private'
            {
            match(input,23,FOLLOW_23_in_rulekPRIVATE645); 

            }

             after(grammarAccess.getKPRIVATEAccess().getPrivateEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulekPRIVATE"


    // $ANTLR start "rulekKEY"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:357:1: rulekKEY : ( ( 'key' ) ) ;
    public final void rulekKEY() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:361:1: ( ( ( 'key' ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:362:1: ( ( 'key' ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:362:1: ( ( 'key' ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:363:1: ( 'key' )
            {
             before(grammarAccess.getKKEYAccess().getKeyEnumLiteralDeclaration()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:364:1: ( 'key' )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:364:3: 'key'
            {
            match(input,24,FOLLOW_24_in_rulekKEY684); 

            }

             after(grammarAccess.getKKEYAccess().getKeyEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulekKEY"


    // $ANTLR start "rule__Protocol__ReferencesAlternatives_12_0"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:376:1: rule__Protocol__ReferencesAlternatives_12_0 : ( ( ruleReference ) | ( ruleMessage ) );
    public final void rule__Protocol__ReferencesAlternatives_12_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:380:1: ( ( ruleReference ) | ( ruleMessage ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_LPAREN) ) {
                    alt1=1;
                }
                else if ( (LA1_1==RULE_ARROW) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:381:1: ( ruleReference )
                    {
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:381:1: ( ruleReference )
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:382:1: ruleReference
                    {
                     before(grammarAccess.getProtocolAccess().getReferencesReferenceParserRuleCall_12_0_0()); 
                    pushFollow(FOLLOW_ruleReference_in_rule__Protocol__ReferencesAlternatives_12_0721);
                    ruleReference();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getReferencesReferenceParserRuleCall_12_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:387:6: ( ruleMessage )
                    {
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:387:6: ( ruleMessage )
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:388:1: ruleMessage
                    {
                     before(grammarAccess.getProtocolAccess().getReferencesMessageParserRuleCall_12_0_1()); 
                    pushFollow(FOLLOW_ruleMessage_in_rule__Protocol__ReferencesAlternatives_12_0738);
                    ruleMessage();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getReferencesMessageParserRuleCall_12_0_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__ReferencesAlternatives_12_0"


    // $ANTLR start "rule__KAdornment__Alternatives"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:398:1: rule__KAdornment__Alternatives : ( ( ( 'in' ) ) | ( ( 'out' ) ) | ( ( 'io' ) ) | ( ( 'nil' ) ) );
    public final void rule__KAdornment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:402:1: ( ( ( 'in' ) ) | ( ( 'out' ) ) | ( ( 'io' ) ) | ( ( 'nil' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            case 27:
                {
                alt2=3;
                }
                break;
            case 28:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:403:1: ( ( 'in' ) )
                    {
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:403:1: ( ( 'in' ) )
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:404:1: ( 'in' )
                    {
                     before(grammarAccess.getKAdornmentAccess().getInEnumLiteralDeclaration_0()); 
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:405:1: ( 'in' )
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:405:3: 'in'
                    {
                    match(input,25,FOLLOW_25_in_rule__KAdornment__Alternatives771); 

                    }

                     after(grammarAccess.getKAdornmentAccess().getInEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:410:6: ( ( 'out' ) )
                    {
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:410:6: ( ( 'out' ) )
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:411:1: ( 'out' )
                    {
                     before(grammarAccess.getKAdornmentAccess().getOutEnumLiteralDeclaration_1()); 
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:412:1: ( 'out' )
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:412:3: 'out'
                    {
                    match(input,26,FOLLOW_26_in_rule__KAdornment__Alternatives792); 

                    }

                     after(grammarAccess.getKAdornmentAccess().getOutEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:417:6: ( ( 'io' ) )
                    {
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:417:6: ( ( 'io' ) )
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:418:1: ( 'io' )
                    {
                     before(grammarAccess.getKAdornmentAccess().getIoEnumLiteralDeclaration_2()); 
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:419:1: ( 'io' )
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:419:3: 'io'
                    {
                    match(input,27,FOLLOW_27_in_rule__KAdornment__Alternatives813); 

                    }

                     after(grammarAccess.getKAdornmentAccess().getIoEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:424:6: ( ( 'nil' ) )
                    {
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:424:6: ( ( 'nil' ) )
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:425:1: ( 'nil' )
                    {
                     before(grammarAccess.getKAdornmentAccess().getNilEnumLiteralDeclaration_3()); 
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:426:1: ( 'nil' )
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:426:3: 'nil'
                    {
                    match(input,28,FOLLOW_28_in_rule__KAdornment__Alternatives834); 

                    }

                     after(grammarAccess.getKAdornmentAccess().getNilEnumLiteralDeclaration_3()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KAdornment__Alternatives"


    // $ANTLR start "rule__Protocol__Group__0"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:438:1: rule__Protocol__Group__0 : rule__Protocol__Group__0__Impl rule__Protocol__Group__1 ;
    public final void rule__Protocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:442:1: ( rule__Protocol__Group__0__Impl rule__Protocol__Group__1 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:443:2: rule__Protocol__Group__0__Impl rule__Protocol__Group__1
            {
            pushFollow(FOLLOW_rule__Protocol__Group__0__Impl_in_rule__Protocol__Group__0867);
            rule__Protocol__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Protocol__Group__1_in_rule__Protocol__Group__0870);
            rule__Protocol__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__0"


    // $ANTLR start "rule__Protocol__Group__0__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:450:1: rule__Protocol__Group__0__Impl : ( ( rule__Protocol__JunkProtocolAssignment_0 )? ) ;
    public final void rule__Protocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:454:1: ( ( ( rule__Protocol__JunkProtocolAssignment_0 )? ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:455:1: ( ( rule__Protocol__JunkProtocolAssignment_0 )? )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:455:1: ( ( rule__Protocol__JunkProtocolAssignment_0 )? )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:456:1: ( rule__Protocol__JunkProtocolAssignment_0 )?
            {
             before(grammarAccess.getProtocolAccess().getJunkProtocolAssignment_0()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:457:1: ( rule__Protocol__JunkProtocolAssignment_0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:457:2: rule__Protocol__JunkProtocolAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Protocol__JunkProtocolAssignment_0_in_rule__Protocol__Group__0__Impl897);
                    rule__Protocol__JunkProtocolAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProtocolAccess().getJunkProtocolAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__0__Impl"


    // $ANTLR start "rule__Protocol__Group__1"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:467:1: rule__Protocol__Group__1 : rule__Protocol__Group__1__Impl rule__Protocol__Group__2 ;
    public final void rule__Protocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:471:1: ( rule__Protocol__Group__1__Impl rule__Protocol__Group__2 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:472:2: rule__Protocol__Group__1__Impl rule__Protocol__Group__2
            {
            pushFollow(FOLLOW_rule__Protocol__Group__1__Impl_in_rule__Protocol__Group__1928);
            rule__Protocol__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Protocol__Group__2_in_rule__Protocol__Group__1931);
            rule__Protocol__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__1"


    // $ANTLR start "rule__Protocol__Group__1__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:479:1: rule__Protocol__Group__1__Impl : ( ( rule__Protocol__NameAssignment_1 ) ) ;
    public final void rule__Protocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:483:1: ( ( ( rule__Protocol__NameAssignment_1 ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:484:1: ( ( rule__Protocol__NameAssignment_1 ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:484:1: ( ( rule__Protocol__NameAssignment_1 ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:485:1: ( rule__Protocol__NameAssignment_1 )
            {
             before(grammarAccess.getProtocolAccess().getNameAssignment_1()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:486:1: ( rule__Protocol__NameAssignment_1 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:486:2: rule__Protocol__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Protocol__NameAssignment_1_in_rule__Protocol__Group__1__Impl958);
            rule__Protocol__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__1__Impl"


    // $ANTLR start "rule__Protocol__Group__2"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:496:1: rule__Protocol__Group__2 : rule__Protocol__Group__2__Impl rule__Protocol__Group__3 ;
    public final void rule__Protocol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:500:1: ( rule__Protocol__Group__2__Impl rule__Protocol__Group__3 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:501:2: rule__Protocol__Group__2__Impl rule__Protocol__Group__3
            {
            pushFollow(FOLLOW_rule__Protocol__Group__2__Impl_in_rule__Protocol__Group__2988);
            rule__Protocol__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Protocol__Group__3_in_rule__Protocol__Group__2991);
            rule__Protocol__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__2"


    // $ANTLR start "rule__Protocol__Group__2__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:508:1: rule__Protocol__Group__2__Impl : ( RULE_LBRACE ) ;
    public final void rule__Protocol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:512:1: ( ( RULE_LBRACE ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:513:1: ( RULE_LBRACE )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:513:1: ( RULE_LBRACE )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:514:1: RULE_LBRACE
            {
             before(grammarAccess.getProtocolAccess().getLBRACETerminalRuleCall_2()); 
            match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_rule__Protocol__Group__2__Impl1018); 
             after(grammarAccess.getProtocolAccess().getLBRACETerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__2__Impl"


    // $ANTLR start "rule__Protocol__Group__3"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:525:1: rule__Protocol__Group__3 : rule__Protocol__Group__3__Impl rule__Protocol__Group__4 ;
    public final void rule__Protocol__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:529:1: ( rule__Protocol__Group__3__Impl rule__Protocol__Group__4 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:530:2: rule__Protocol__Group__3__Impl rule__Protocol__Group__4
            {
            pushFollow(FOLLOW_rule__Protocol__Group__3__Impl_in_rule__Protocol__Group__31047);
            rule__Protocol__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Protocol__Group__4_in_rule__Protocol__Group__31050);
            rule__Protocol__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__3"


    // $ANTLR start "rule__Protocol__Group__3__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:537:1: rule__Protocol__Group__3__Impl : ( ( rule__Protocol__JunkRoleAssignment_3 ) ) ;
    public final void rule__Protocol__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:541:1: ( ( ( rule__Protocol__JunkRoleAssignment_3 ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:542:1: ( ( rule__Protocol__JunkRoleAssignment_3 ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:542:1: ( ( rule__Protocol__JunkRoleAssignment_3 ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:543:1: ( rule__Protocol__JunkRoleAssignment_3 )
            {
             before(grammarAccess.getProtocolAccess().getJunkRoleAssignment_3()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:544:1: ( rule__Protocol__JunkRoleAssignment_3 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:544:2: rule__Protocol__JunkRoleAssignment_3
            {
            pushFollow(FOLLOW_rule__Protocol__JunkRoleAssignment_3_in_rule__Protocol__Group__3__Impl1077);
            rule__Protocol__JunkRoleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getJunkRoleAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__3__Impl"


    // $ANTLR start "rule__Protocol__Group__4"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:554:1: rule__Protocol__Group__4 : rule__Protocol__Group__4__Impl rule__Protocol__Group__5 ;
    public final void rule__Protocol__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:558:1: ( rule__Protocol__Group__4__Impl rule__Protocol__Group__5 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:559:2: rule__Protocol__Group__4__Impl rule__Protocol__Group__5
            {
            pushFollow(FOLLOW_rule__Protocol__Group__4__Impl_in_rule__Protocol__Group__41107);
            rule__Protocol__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Protocol__Group__5_in_rule__Protocol__Group__41110);
            rule__Protocol__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__4"


    // $ANTLR start "rule__Protocol__Group__4__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:566:1: rule__Protocol__Group__4__Impl : ( ( rule__Protocol__RolesAssignment_4 ) ) ;
    public final void rule__Protocol__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:570:1: ( ( ( rule__Protocol__RolesAssignment_4 ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:571:1: ( ( rule__Protocol__RolesAssignment_4 ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:571:1: ( ( rule__Protocol__RolesAssignment_4 ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:572:1: ( rule__Protocol__RolesAssignment_4 )
            {
             before(grammarAccess.getProtocolAccess().getRolesAssignment_4()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:573:1: ( rule__Protocol__RolesAssignment_4 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:573:2: rule__Protocol__RolesAssignment_4
            {
            pushFollow(FOLLOW_rule__Protocol__RolesAssignment_4_in_rule__Protocol__Group__4__Impl1137);
            rule__Protocol__RolesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getRolesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__4__Impl"


    // $ANTLR start "rule__Protocol__Group__5"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:583:1: rule__Protocol__Group__5 : rule__Protocol__Group__5__Impl rule__Protocol__Group__6 ;
    public final void rule__Protocol__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:587:1: ( rule__Protocol__Group__5__Impl rule__Protocol__Group__6 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:588:2: rule__Protocol__Group__5__Impl rule__Protocol__Group__6
            {
            pushFollow(FOLLOW_rule__Protocol__Group__5__Impl_in_rule__Protocol__Group__51167);
            rule__Protocol__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Protocol__Group__6_in_rule__Protocol__Group__51170);
            rule__Protocol__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__5"


    // $ANTLR start "rule__Protocol__Group__5__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:595:1: rule__Protocol__Group__5__Impl : ( RULE_COMMA ) ;
    public final void rule__Protocol__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:599:1: ( ( RULE_COMMA ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:600:1: ( RULE_COMMA )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:600:1: ( RULE_COMMA )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:601:1: RULE_COMMA
            {
             before(grammarAccess.getProtocolAccess().getCOMMATerminalRuleCall_5()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__Protocol__Group__5__Impl1197); 
             after(grammarAccess.getProtocolAccess().getCOMMATerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__5__Impl"


    // $ANTLR start "rule__Protocol__Group__6"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:612:1: rule__Protocol__Group__6 : rule__Protocol__Group__6__Impl rule__Protocol__Group__7 ;
    public final void rule__Protocol__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:616:1: ( rule__Protocol__Group__6__Impl rule__Protocol__Group__7 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:617:2: rule__Protocol__Group__6__Impl rule__Protocol__Group__7
            {
            pushFollow(FOLLOW_rule__Protocol__Group__6__Impl_in_rule__Protocol__Group__61226);
            rule__Protocol__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Protocol__Group__7_in_rule__Protocol__Group__61229);
            rule__Protocol__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__6"


    // $ANTLR start "rule__Protocol__Group__6__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:624:1: rule__Protocol__Group__6__Impl : ( ( rule__Protocol__RolesAssignment_6 ) ) ;
    public final void rule__Protocol__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:628:1: ( ( ( rule__Protocol__RolesAssignment_6 ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:629:1: ( ( rule__Protocol__RolesAssignment_6 ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:629:1: ( ( rule__Protocol__RolesAssignment_6 ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:630:1: ( rule__Protocol__RolesAssignment_6 )
            {
             before(grammarAccess.getProtocolAccess().getRolesAssignment_6()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:631:1: ( rule__Protocol__RolesAssignment_6 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:631:2: rule__Protocol__RolesAssignment_6
            {
            pushFollow(FOLLOW_rule__Protocol__RolesAssignment_6_in_rule__Protocol__Group__6__Impl1256);
            rule__Protocol__RolesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getRolesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__6__Impl"


    // $ANTLR start "rule__Protocol__Group__7"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:641:1: rule__Protocol__Group__7 : rule__Protocol__Group__7__Impl rule__Protocol__Group__8 ;
    public final void rule__Protocol__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:645:1: ( rule__Protocol__Group__7__Impl rule__Protocol__Group__8 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:646:2: rule__Protocol__Group__7__Impl rule__Protocol__Group__8
            {
            pushFollow(FOLLOW_rule__Protocol__Group__7__Impl_in_rule__Protocol__Group__71286);
            rule__Protocol__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Protocol__Group__8_in_rule__Protocol__Group__71289);
            rule__Protocol__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__7"


    // $ANTLR start "rule__Protocol__Group__7__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:653:1: rule__Protocol__Group__7__Impl : ( ( rule__Protocol__Group_7__0 )* ) ;
    public final void rule__Protocol__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:657:1: ( ( ( rule__Protocol__Group_7__0 )* ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:658:1: ( ( rule__Protocol__Group_7__0 )* )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:658:1: ( ( rule__Protocol__Group_7__0 )* )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:659:1: ( rule__Protocol__Group_7__0 )*
            {
             before(grammarAccess.getProtocolAccess().getGroup_7()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:660:1: ( rule__Protocol__Group_7__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_COMMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:660:2: rule__Protocol__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__Protocol__Group_7__0_in_rule__Protocol__Group__7__Impl1316);
            	    rule__Protocol__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getProtocolAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__7__Impl"


    // $ANTLR start "rule__Protocol__Group__8"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:670:1: rule__Protocol__Group__8 : rule__Protocol__Group__8__Impl rule__Protocol__Group__9 ;
    public final void rule__Protocol__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:674:1: ( rule__Protocol__Group__8__Impl rule__Protocol__Group__9 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:675:2: rule__Protocol__Group__8__Impl rule__Protocol__Group__9
            {
            pushFollow(FOLLOW_rule__Protocol__Group__8__Impl_in_rule__Protocol__Group__81347);
            rule__Protocol__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Protocol__Group__9_in_rule__Protocol__Group__81350);
            rule__Protocol__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__8"


    // $ANTLR start "rule__Protocol__Group__8__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:682:1: rule__Protocol__Group__8__Impl : ( ( rule__Protocol__JunkPubAssignment_8 ) ) ;
    public final void rule__Protocol__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:686:1: ( ( ( rule__Protocol__JunkPubAssignment_8 ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:687:1: ( ( rule__Protocol__JunkPubAssignment_8 ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:687:1: ( ( rule__Protocol__JunkPubAssignment_8 ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:688:1: ( rule__Protocol__JunkPubAssignment_8 )
            {
             before(grammarAccess.getProtocolAccess().getJunkPubAssignment_8()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:689:1: ( rule__Protocol__JunkPubAssignment_8 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:689:2: rule__Protocol__JunkPubAssignment_8
            {
            pushFollow(FOLLOW_rule__Protocol__JunkPubAssignment_8_in_rule__Protocol__Group__8__Impl1377);
            rule__Protocol__JunkPubAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getJunkPubAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__8__Impl"


    // $ANTLR start "rule__Protocol__Group__9"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:699:1: rule__Protocol__Group__9 : rule__Protocol__Group__9__Impl rule__Protocol__Group__10 ;
    public final void rule__Protocol__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:703:1: ( rule__Protocol__Group__9__Impl rule__Protocol__Group__10 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:704:2: rule__Protocol__Group__9__Impl rule__Protocol__Group__10
            {
            pushFollow(FOLLOW_rule__Protocol__Group__9__Impl_in_rule__Protocol__Group__91407);
            rule__Protocol__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Protocol__Group__10_in_rule__Protocol__Group__91410);
            rule__Protocol__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__9"


    // $ANTLR start "rule__Protocol__Group__9__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:711:1: rule__Protocol__Group__9__Impl : ( ( rule__Protocol__PublicParamsAssignment_9 ) ) ;
    public final void rule__Protocol__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:715:1: ( ( ( rule__Protocol__PublicParamsAssignment_9 ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:716:1: ( ( rule__Protocol__PublicParamsAssignment_9 ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:716:1: ( ( rule__Protocol__PublicParamsAssignment_9 ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:717:1: ( rule__Protocol__PublicParamsAssignment_9 )
            {
             before(grammarAccess.getProtocolAccess().getPublicParamsAssignment_9()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:718:1: ( rule__Protocol__PublicParamsAssignment_9 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:718:2: rule__Protocol__PublicParamsAssignment_9
            {
            pushFollow(FOLLOW_rule__Protocol__PublicParamsAssignment_9_in_rule__Protocol__Group__9__Impl1437);
            rule__Protocol__PublicParamsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getPublicParamsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__9__Impl"


    // $ANTLR start "rule__Protocol__Group__10"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:728:1: rule__Protocol__Group__10 : rule__Protocol__Group__10__Impl rule__Protocol__Group__11 ;
    public final void rule__Protocol__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:732:1: ( rule__Protocol__Group__10__Impl rule__Protocol__Group__11 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:733:2: rule__Protocol__Group__10__Impl rule__Protocol__Group__11
            {
            pushFollow(FOLLOW_rule__Protocol__Group__10__Impl_in_rule__Protocol__Group__101467);
            rule__Protocol__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Protocol__Group__11_in_rule__Protocol__Group__101470);
            rule__Protocol__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__10"


    // $ANTLR start "rule__Protocol__Group__10__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:740:1: rule__Protocol__Group__10__Impl : ( ( rule__Protocol__Group_10__0 )* ) ;
    public final void rule__Protocol__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:744:1: ( ( ( rule__Protocol__Group_10__0 )* ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:745:1: ( ( rule__Protocol__Group_10__0 )* )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:745:1: ( ( rule__Protocol__Group_10__0 )* )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:746:1: ( rule__Protocol__Group_10__0 )*
            {
             before(grammarAccess.getProtocolAccess().getGroup_10()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:747:1: ( rule__Protocol__Group_10__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:747:2: rule__Protocol__Group_10__0
            	    {
            	    pushFollow(FOLLOW_rule__Protocol__Group_10__0_in_rule__Protocol__Group__10__Impl1497);
            	    rule__Protocol__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getProtocolAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__10__Impl"


    // $ANTLR start "rule__Protocol__Group__11"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:757:1: rule__Protocol__Group__11 : rule__Protocol__Group__11__Impl rule__Protocol__Group__12 ;
    public final void rule__Protocol__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:761:1: ( rule__Protocol__Group__11__Impl rule__Protocol__Group__12 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:762:2: rule__Protocol__Group__11__Impl rule__Protocol__Group__12
            {
            pushFollow(FOLLOW_rule__Protocol__Group__11__Impl_in_rule__Protocol__Group__111528);
            rule__Protocol__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Protocol__Group__12_in_rule__Protocol__Group__111531);
            rule__Protocol__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__11"


    // $ANTLR start "rule__Protocol__Group__11__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:769:1: rule__Protocol__Group__11__Impl : ( ( rule__Protocol__Group_11__0 )? ) ;
    public final void rule__Protocol__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:773:1: ( ( ( rule__Protocol__Group_11__0 )? ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:774:1: ( ( rule__Protocol__Group_11__0 )? )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:774:1: ( ( rule__Protocol__Group_11__0 )? )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:775:1: ( rule__Protocol__Group_11__0 )?
            {
             before(grammarAccess.getProtocolAccess().getGroup_11()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:776:1: ( rule__Protocol__Group_11__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:776:2: rule__Protocol__Group_11__0
                    {
                    pushFollow(FOLLOW_rule__Protocol__Group_11__0_in_rule__Protocol__Group__11__Impl1558);
                    rule__Protocol__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProtocolAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__11__Impl"


    // $ANTLR start "rule__Protocol__Group__12"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:786:1: rule__Protocol__Group__12 : rule__Protocol__Group__12__Impl rule__Protocol__Group__13 ;
    public final void rule__Protocol__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:790:1: ( rule__Protocol__Group__12__Impl rule__Protocol__Group__13 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:791:2: rule__Protocol__Group__12__Impl rule__Protocol__Group__13
            {
            pushFollow(FOLLOW_rule__Protocol__Group__12__Impl_in_rule__Protocol__Group__121589);
            rule__Protocol__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Protocol__Group__13_in_rule__Protocol__Group__121592);
            rule__Protocol__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__12"


    // $ANTLR start "rule__Protocol__Group__12__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:798:1: rule__Protocol__Group__12__Impl : ( ( ( rule__Protocol__ReferencesAssignment_12 ) ) ( ( rule__Protocol__ReferencesAssignment_12 )* ) ) ;
    public final void rule__Protocol__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:802:1: ( ( ( ( rule__Protocol__ReferencesAssignment_12 ) ) ( ( rule__Protocol__ReferencesAssignment_12 )* ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:803:1: ( ( ( rule__Protocol__ReferencesAssignment_12 ) ) ( ( rule__Protocol__ReferencesAssignment_12 )* ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:803:1: ( ( ( rule__Protocol__ReferencesAssignment_12 ) ) ( ( rule__Protocol__ReferencesAssignment_12 )* ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:804:1: ( ( rule__Protocol__ReferencesAssignment_12 ) ) ( ( rule__Protocol__ReferencesAssignment_12 )* )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:804:1: ( ( rule__Protocol__ReferencesAssignment_12 ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:805:1: ( rule__Protocol__ReferencesAssignment_12 )
            {
             before(grammarAccess.getProtocolAccess().getReferencesAssignment_12()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:806:1: ( rule__Protocol__ReferencesAssignment_12 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:806:2: rule__Protocol__ReferencesAssignment_12
            {
            pushFollow(FOLLOW_rule__Protocol__ReferencesAssignment_12_in_rule__Protocol__Group__12__Impl1621);
            rule__Protocol__ReferencesAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getReferencesAssignment_12()); 

            }

            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:809:1: ( ( rule__Protocol__ReferencesAssignment_12 )* )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:810:1: ( rule__Protocol__ReferencesAssignment_12 )*
            {
             before(grammarAccess.getProtocolAccess().getReferencesAssignment_12()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:811:1: ( rule__Protocol__ReferencesAssignment_12 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:811:2: rule__Protocol__ReferencesAssignment_12
            	    {
            	    pushFollow(FOLLOW_rule__Protocol__ReferencesAssignment_12_in_rule__Protocol__Group__12__Impl1633);
            	    rule__Protocol__ReferencesAssignment_12();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getProtocolAccess().getReferencesAssignment_12()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__12__Impl"


    // $ANTLR start "rule__Protocol__Group__13"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:822:1: rule__Protocol__Group__13 : rule__Protocol__Group__13__Impl ;
    public final void rule__Protocol__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:826:1: ( rule__Protocol__Group__13__Impl )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:827:2: rule__Protocol__Group__13__Impl
            {
            pushFollow(FOLLOW_rule__Protocol__Group__13__Impl_in_rule__Protocol__Group__131666);
            rule__Protocol__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__13"


    // $ANTLR start "rule__Protocol__Group__13__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:833:1: rule__Protocol__Group__13__Impl : ( RULE_RBRACE ) ;
    public final void rule__Protocol__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:837:1: ( ( RULE_RBRACE ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:838:1: ( RULE_RBRACE )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:838:1: ( RULE_RBRACE )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:839:1: RULE_RBRACE
            {
             before(grammarAccess.getProtocolAccess().getRBRACETerminalRuleCall_13()); 
            match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_rule__Protocol__Group__13__Impl1693); 
             after(grammarAccess.getProtocolAccess().getRBRACETerminalRuleCall_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__13__Impl"


    // $ANTLR start "rule__Protocol__Group_7__0"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:878:1: rule__Protocol__Group_7__0 : rule__Protocol__Group_7__0__Impl rule__Protocol__Group_7__1 ;
    public final void rule__Protocol__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:882:1: ( rule__Protocol__Group_7__0__Impl rule__Protocol__Group_7__1 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:883:2: rule__Protocol__Group_7__0__Impl rule__Protocol__Group_7__1
            {
            pushFollow(FOLLOW_rule__Protocol__Group_7__0__Impl_in_rule__Protocol__Group_7__01750);
            rule__Protocol__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Protocol__Group_7__1_in_rule__Protocol__Group_7__01753);
            rule__Protocol__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group_7__0"


    // $ANTLR start "rule__Protocol__Group_7__0__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:890:1: rule__Protocol__Group_7__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Protocol__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:894:1: ( ( RULE_COMMA ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:895:1: ( RULE_COMMA )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:895:1: ( RULE_COMMA )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:896:1: RULE_COMMA
            {
             before(grammarAccess.getProtocolAccess().getCOMMATerminalRuleCall_7_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__Protocol__Group_7__0__Impl1780); 
             after(grammarAccess.getProtocolAccess().getCOMMATerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group_7__0__Impl"


    // $ANTLR start "rule__Protocol__Group_7__1"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:907:1: rule__Protocol__Group_7__1 : rule__Protocol__Group_7__1__Impl ;
    public final void rule__Protocol__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:911:1: ( rule__Protocol__Group_7__1__Impl )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:912:2: rule__Protocol__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Protocol__Group_7__1__Impl_in_rule__Protocol__Group_7__11809);
            rule__Protocol__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group_7__1"


    // $ANTLR start "rule__Protocol__Group_7__1__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:918:1: rule__Protocol__Group_7__1__Impl : ( ( rule__Protocol__RolesAssignment_7_1 ) ) ;
    public final void rule__Protocol__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:922:1: ( ( ( rule__Protocol__RolesAssignment_7_1 ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:923:1: ( ( rule__Protocol__RolesAssignment_7_1 ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:923:1: ( ( rule__Protocol__RolesAssignment_7_1 ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:924:1: ( rule__Protocol__RolesAssignment_7_1 )
            {
             before(grammarAccess.getProtocolAccess().getRolesAssignment_7_1()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:925:1: ( rule__Protocol__RolesAssignment_7_1 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:925:2: rule__Protocol__RolesAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Protocol__RolesAssignment_7_1_in_rule__Protocol__Group_7__1__Impl1836);
            rule__Protocol__RolesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getRolesAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group_7__1__Impl"


    // $ANTLR start "rule__Protocol__Group_10__0"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:939:1: rule__Protocol__Group_10__0 : rule__Protocol__Group_10__0__Impl rule__Protocol__Group_10__1 ;
    public final void rule__Protocol__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:943:1: ( rule__Protocol__Group_10__0__Impl rule__Protocol__Group_10__1 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:944:2: rule__Protocol__Group_10__0__Impl rule__Protocol__Group_10__1
            {
            pushFollow(FOLLOW_rule__Protocol__Group_10__0__Impl_in_rule__Protocol__Group_10__01870);
            rule__Protocol__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Protocol__Group_10__1_in_rule__Protocol__Group_10__01873);
            rule__Protocol__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group_10__0"


    // $ANTLR start "rule__Protocol__Group_10__0__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:951:1: rule__Protocol__Group_10__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Protocol__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:955:1: ( ( RULE_COMMA ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:956:1: ( RULE_COMMA )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:956:1: ( RULE_COMMA )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:957:1: RULE_COMMA
            {
             before(grammarAccess.getProtocolAccess().getCOMMATerminalRuleCall_10_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__Protocol__Group_10__0__Impl1900); 
             after(grammarAccess.getProtocolAccess().getCOMMATerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group_10__0__Impl"


    // $ANTLR start "rule__Protocol__Group_10__1"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:968:1: rule__Protocol__Group_10__1 : rule__Protocol__Group_10__1__Impl ;
    public final void rule__Protocol__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:972:1: ( rule__Protocol__Group_10__1__Impl )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:973:2: rule__Protocol__Group_10__1__Impl
            {
            pushFollow(FOLLOW_rule__Protocol__Group_10__1__Impl_in_rule__Protocol__Group_10__11929);
            rule__Protocol__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group_10__1"


    // $ANTLR start "rule__Protocol__Group_10__1__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:979:1: rule__Protocol__Group_10__1__Impl : ( ( rule__Protocol__PublicParamsAssignment_10_1 ) ) ;
    public final void rule__Protocol__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:983:1: ( ( ( rule__Protocol__PublicParamsAssignment_10_1 ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:984:1: ( ( rule__Protocol__PublicParamsAssignment_10_1 ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:984:1: ( ( rule__Protocol__PublicParamsAssignment_10_1 ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:985:1: ( rule__Protocol__PublicParamsAssignment_10_1 )
            {
             before(grammarAccess.getProtocolAccess().getPublicParamsAssignment_10_1()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:986:1: ( rule__Protocol__PublicParamsAssignment_10_1 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:986:2: rule__Protocol__PublicParamsAssignment_10_1
            {
            pushFollow(FOLLOW_rule__Protocol__PublicParamsAssignment_10_1_in_rule__Protocol__Group_10__1__Impl1956);
            rule__Protocol__PublicParamsAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getPublicParamsAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group_10__1__Impl"


    // $ANTLR start "rule__Protocol__Group_11__0"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1000:1: rule__Protocol__Group_11__0 : rule__Protocol__Group_11__0__Impl rule__Protocol__Group_11__1 ;
    public final void rule__Protocol__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1004:1: ( rule__Protocol__Group_11__0__Impl rule__Protocol__Group_11__1 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1005:2: rule__Protocol__Group_11__0__Impl rule__Protocol__Group_11__1
            {
            pushFollow(FOLLOW_rule__Protocol__Group_11__0__Impl_in_rule__Protocol__Group_11__01990);
            rule__Protocol__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Protocol__Group_11__1_in_rule__Protocol__Group_11__01993);
            rule__Protocol__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group_11__0"


    // $ANTLR start "rule__Protocol__Group_11__0__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1012:1: rule__Protocol__Group_11__0__Impl : ( ( rule__Protocol__JunkPrivAssignment_11_0 ) ) ;
    public final void rule__Protocol__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1016:1: ( ( ( rule__Protocol__JunkPrivAssignment_11_0 ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1017:1: ( ( rule__Protocol__JunkPrivAssignment_11_0 ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1017:1: ( ( rule__Protocol__JunkPrivAssignment_11_0 ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1018:1: ( rule__Protocol__JunkPrivAssignment_11_0 )
            {
             before(grammarAccess.getProtocolAccess().getJunkPrivAssignment_11_0()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1019:1: ( rule__Protocol__JunkPrivAssignment_11_0 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1019:2: rule__Protocol__JunkPrivAssignment_11_0
            {
            pushFollow(FOLLOW_rule__Protocol__JunkPrivAssignment_11_0_in_rule__Protocol__Group_11__0__Impl2020);
            rule__Protocol__JunkPrivAssignment_11_0();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getJunkPrivAssignment_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group_11__0__Impl"


    // $ANTLR start "rule__Protocol__Group_11__1"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1029:1: rule__Protocol__Group_11__1 : rule__Protocol__Group_11__1__Impl rule__Protocol__Group_11__2 ;
    public final void rule__Protocol__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1033:1: ( rule__Protocol__Group_11__1__Impl rule__Protocol__Group_11__2 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1034:2: rule__Protocol__Group_11__1__Impl rule__Protocol__Group_11__2
            {
            pushFollow(FOLLOW_rule__Protocol__Group_11__1__Impl_in_rule__Protocol__Group_11__12050);
            rule__Protocol__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Protocol__Group_11__2_in_rule__Protocol__Group_11__12053);
            rule__Protocol__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group_11__1"


    // $ANTLR start "rule__Protocol__Group_11__1__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1041:1: rule__Protocol__Group_11__1__Impl : ( ( rule__Protocol__PrivateParamsAssignment_11_1 ) ) ;
    public final void rule__Protocol__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1045:1: ( ( ( rule__Protocol__PrivateParamsAssignment_11_1 ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1046:1: ( ( rule__Protocol__PrivateParamsAssignment_11_1 ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1046:1: ( ( rule__Protocol__PrivateParamsAssignment_11_1 ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1047:1: ( rule__Protocol__PrivateParamsAssignment_11_1 )
            {
             before(grammarAccess.getProtocolAccess().getPrivateParamsAssignment_11_1()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1048:1: ( rule__Protocol__PrivateParamsAssignment_11_1 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1048:2: rule__Protocol__PrivateParamsAssignment_11_1
            {
            pushFollow(FOLLOW_rule__Protocol__PrivateParamsAssignment_11_1_in_rule__Protocol__Group_11__1__Impl2080);
            rule__Protocol__PrivateParamsAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getPrivateParamsAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group_11__1__Impl"


    // $ANTLR start "rule__Protocol__Group_11__2"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1058:1: rule__Protocol__Group_11__2 : rule__Protocol__Group_11__2__Impl ;
    public final void rule__Protocol__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1062:1: ( rule__Protocol__Group_11__2__Impl )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1063:2: rule__Protocol__Group_11__2__Impl
            {
            pushFollow(FOLLOW_rule__Protocol__Group_11__2__Impl_in_rule__Protocol__Group_11__22110);
            rule__Protocol__Group_11__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group_11__2"


    // $ANTLR start "rule__Protocol__Group_11__2__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1069:1: rule__Protocol__Group_11__2__Impl : ( ( rule__Protocol__Group_11_2__0 )* ) ;
    public final void rule__Protocol__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1073:1: ( ( ( rule__Protocol__Group_11_2__0 )* ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1074:1: ( ( rule__Protocol__Group_11_2__0 )* )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1074:1: ( ( rule__Protocol__Group_11_2__0 )* )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1075:1: ( rule__Protocol__Group_11_2__0 )*
            {
             before(grammarAccess.getProtocolAccess().getGroup_11_2()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1076:1: ( rule__Protocol__Group_11_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1076:2: rule__Protocol__Group_11_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Protocol__Group_11_2__0_in_rule__Protocol__Group_11__2__Impl2137);
            	    rule__Protocol__Group_11_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getProtocolAccess().getGroup_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group_11__2__Impl"


    // $ANTLR start "rule__Protocol__Group_11_2__0"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1092:1: rule__Protocol__Group_11_2__0 : rule__Protocol__Group_11_2__0__Impl rule__Protocol__Group_11_2__1 ;
    public final void rule__Protocol__Group_11_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1096:1: ( rule__Protocol__Group_11_2__0__Impl rule__Protocol__Group_11_2__1 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1097:2: rule__Protocol__Group_11_2__0__Impl rule__Protocol__Group_11_2__1
            {
            pushFollow(FOLLOW_rule__Protocol__Group_11_2__0__Impl_in_rule__Protocol__Group_11_2__02174);
            rule__Protocol__Group_11_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Protocol__Group_11_2__1_in_rule__Protocol__Group_11_2__02177);
            rule__Protocol__Group_11_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group_11_2__0"


    // $ANTLR start "rule__Protocol__Group_11_2__0__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1104:1: rule__Protocol__Group_11_2__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Protocol__Group_11_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1108:1: ( ( RULE_COMMA ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1109:1: ( RULE_COMMA )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1109:1: ( RULE_COMMA )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1110:1: RULE_COMMA
            {
             before(grammarAccess.getProtocolAccess().getCOMMATerminalRuleCall_11_2_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__Protocol__Group_11_2__0__Impl2204); 
             after(grammarAccess.getProtocolAccess().getCOMMATerminalRuleCall_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group_11_2__0__Impl"


    // $ANTLR start "rule__Protocol__Group_11_2__1"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1121:1: rule__Protocol__Group_11_2__1 : rule__Protocol__Group_11_2__1__Impl ;
    public final void rule__Protocol__Group_11_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1125:1: ( rule__Protocol__Group_11_2__1__Impl )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1126:2: rule__Protocol__Group_11_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Protocol__Group_11_2__1__Impl_in_rule__Protocol__Group_11_2__12233);
            rule__Protocol__Group_11_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group_11_2__1"


    // $ANTLR start "rule__Protocol__Group_11_2__1__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1132:1: rule__Protocol__Group_11_2__1__Impl : ( ( rule__Protocol__PrivateParamsAssignment_11_2_1 ) ) ;
    public final void rule__Protocol__Group_11_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1136:1: ( ( ( rule__Protocol__PrivateParamsAssignment_11_2_1 ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1137:1: ( ( rule__Protocol__PrivateParamsAssignment_11_2_1 ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1137:1: ( ( rule__Protocol__PrivateParamsAssignment_11_2_1 ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1138:1: ( rule__Protocol__PrivateParamsAssignment_11_2_1 )
            {
             before(grammarAccess.getProtocolAccess().getPrivateParamsAssignment_11_2_1()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1139:1: ( rule__Protocol__PrivateParamsAssignment_11_2_1 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1139:2: rule__Protocol__PrivateParamsAssignment_11_2_1
            {
            pushFollow(FOLLOW_rule__Protocol__PrivateParamsAssignment_11_2_1_in_rule__Protocol__Group_11_2__1__Impl2260);
            rule__Protocol__PrivateParamsAssignment_11_2_1();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getPrivateParamsAssignment_11_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group_11_2__1__Impl"


    // $ANTLR start "rule__ParamDecl__Group__0"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1153:1: rule__ParamDecl__Group__0 : rule__ParamDecl__Group__0__Impl rule__ParamDecl__Group__1 ;
    public final void rule__ParamDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1157:1: ( rule__ParamDecl__Group__0__Impl rule__ParamDecl__Group__1 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1158:2: rule__ParamDecl__Group__0__Impl rule__ParamDecl__Group__1
            {
            pushFollow(FOLLOW_rule__ParamDecl__Group__0__Impl_in_rule__ParamDecl__Group__02294);
            rule__ParamDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamDecl__Group__1_in_rule__ParamDecl__Group__02297);
            rule__ParamDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamDecl__Group__0"


    // $ANTLR start "rule__ParamDecl__Group__0__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1165:1: rule__ParamDecl__Group__0__Impl : ( ( rule__ParamDecl__AdornmentAssignment_0 ) ) ;
    public final void rule__ParamDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1169:1: ( ( ( rule__ParamDecl__AdornmentAssignment_0 ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1170:1: ( ( rule__ParamDecl__AdornmentAssignment_0 ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1170:1: ( ( rule__ParamDecl__AdornmentAssignment_0 ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1171:1: ( rule__ParamDecl__AdornmentAssignment_0 )
            {
             before(grammarAccess.getParamDeclAccess().getAdornmentAssignment_0()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1172:1: ( rule__ParamDecl__AdornmentAssignment_0 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1172:2: rule__ParamDecl__AdornmentAssignment_0
            {
            pushFollow(FOLLOW_rule__ParamDecl__AdornmentAssignment_0_in_rule__ParamDecl__Group__0__Impl2324);
            rule__ParamDecl__AdornmentAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParamDeclAccess().getAdornmentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamDecl__Group__0__Impl"


    // $ANTLR start "rule__ParamDecl__Group__1"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1182:1: rule__ParamDecl__Group__1 : rule__ParamDecl__Group__1__Impl rule__ParamDecl__Group__2 ;
    public final void rule__ParamDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1186:1: ( rule__ParamDecl__Group__1__Impl rule__ParamDecl__Group__2 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1187:2: rule__ParamDecl__Group__1__Impl rule__ParamDecl__Group__2
            {
            pushFollow(FOLLOW_rule__ParamDecl__Group__1__Impl_in_rule__ParamDecl__Group__12354);
            rule__ParamDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamDecl__Group__2_in_rule__ParamDecl__Group__12357);
            rule__ParamDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamDecl__Group__1"


    // $ANTLR start "rule__ParamDecl__Group__1__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1194:1: rule__ParamDecl__Group__1__Impl : ( ( rule__ParamDecl__ParamAssignment_1 ) ) ;
    public final void rule__ParamDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1198:1: ( ( ( rule__ParamDecl__ParamAssignment_1 ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1199:1: ( ( rule__ParamDecl__ParamAssignment_1 ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1199:1: ( ( rule__ParamDecl__ParamAssignment_1 ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1200:1: ( rule__ParamDecl__ParamAssignment_1 )
            {
             before(grammarAccess.getParamDeclAccess().getParamAssignment_1()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1201:1: ( rule__ParamDecl__ParamAssignment_1 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1201:2: rule__ParamDecl__ParamAssignment_1
            {
            pushFollow(FOLLOW_rule__ParamDecl__ParamAssignment_1_in_rule__ParamDecl__Group__1__Impl2384);
            rule__ParamDecl__ParamAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParamDeclAccess().getParamAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamDecl__Group__1__Impl"


    // $ANTLR start "rule__ParamDecl__Group__2"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1211:1: rule__ParamDecl__Group__2 : rule__ParamDecl__Group__2__Impl ;
    public final void rule__ParamDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1215:1: ( rule__ParamDecl__Group__2__Impl )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1216:2: rule__ParamDecl__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParamDecl__Group__2__Impl_in_rule__ParamDecl__Group__22414);
            rule__ParamDecl__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamDecl__Group__2"


    // $ANTLR start "rule__ParamDecl__Group__2__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1222:1: rule__ParamDecl__Group__2__Impl : ( ( rule__ParamDecl__IsKeyAssignment_2 )? ) ;
    public final void rule__ParamDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1226:1: ( ( ( rule__ParamDecl__IsKeyAssignment_2 )? ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1227:1: ( ( rule__ParamDecl__IsKeyAssignment_2 )? )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1227:1: ( ( rule__ParamDecl__IsKeyAssignment_2 )? )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1228:1: ( rule__ParamDecl__IsKeyAssignment_2 )?
            {
             before(grammarAccess.getParamDeclAccess().getIsKeyAssignment_2()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1229:1: ( rule__ParamDecl__IsKeyAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1229:2: rule__ParamDecl__IsKeyAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ParamDecl__IsKeyAssignment_2_in_rule__ParamDecl__Group__2__Impl2441);
                    rule__ParamDecl__IsKeyAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParamDeclAccess().getIsKeyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamDecl__Group__2__Impl"


    // $ANTLR start "rule__ParamRef__Group__0"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1245:1: rule__ParamRef__Group__0 : rule__ParamRef__Group__0__Impl rule__ParamRef__Group__1 ;
    public final void rule__ParamRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1249:1: ( rule__ParamRef__Group__0__Impl rule__ParamRef__Group__1 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1250:2: rule__ParamRef__Group__0__Impl rule__ParamRef__Group__1
            {
            pushFollow(FOLLOW_rule__ParamRef__Group__0__Impl_in_rule__ParamRef__Group__02478);
            rule__ParamRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamRef__Group__1_in_rule__ParamRef__Group__02481);
            rule__ParamRef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamRef__Group__0"


    // $ANTLR start "rule__ParamRef__Group__0__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1257:1: rule__ParamRef__Group__0__Impl : ( ( rule__ParamRef__AdornmentAssignment_0 ) ) ;
    public final void rule__ParamRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1261:1: ( ( ( rule__ParamRef__AdornmentAssignment_0 ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1262:1: ( ( rule__ParamRef__AdornmentAssignment_0 ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1262:1: ( ( rule__ParamRef__AdornmentAssignment_0 ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1263:1: ( rule__ParamRef__AdornmentAssignment_0 )
            {
             before(grammarAccess.getParamRefAccess().getAdornmentAssignment_0()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1264:1: ( rule__ParamRef__AdornmentAssignment_0 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1264:2: rule__ParamRef__AdornmentAssignment_0
            {
            pushFollow(FOLLOW_rule__ParamRef__AdornmentAssignment_0_in_rule__ParamRef__Group__0__Impl2508);
            rule__ParamRef__AdornmentAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParamRefAccess().getAdornmentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamRef__Group__0__Impl"


    // $ANTLR start "rule__ParamRef__Group__1"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1274:1: rule__ParamRef__Group__1 : rule__ParamRef__Group__1__Impl rule__ParamRef__Group__2 ;
    public final void rule__ParamRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1278:1: ( rule__ParamRef__Group__1__Impl rule__ParamRef__Group__2 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1279:2: rule__ParamRef__Group__1__Impl rule__ParamRef__Group__2
            {
            pushFollow(FOLLOW_rule__ParamRef__Group__1__Impl_in_rule__ParamRef__Group__12538);
            rule__ParamRef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamRef__Group__2_in_rule__ParamRef__Group__12541);
            rule__ParamRef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamRef__Group__1"


    // $ANTLR start "rule__ParamRef__Group__1__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1286:1: rule__ParamRef__Group__1__Impl : ( ( rule__ParamRef__ParamAssignment_1 ) ) ;
    public final void rule__ParamRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1290:1: ( ( ( rule__ParamRef__ParamAssignment_1 ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1291:1: ( ( rule__ParamRef__ParamAssignment_1 ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1291:1: ( ( rule__ParamRef__ParamAssignment_1 ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1292:1: ( rule__ParamRef__ParamAssignment_1 )
            {
             before(grammarAccess.getParamRefAccess().getParamAssignment_1()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1293:1: ( rule__ParamRef__ParamAssignment_1 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1293:2: rule__ParamRef__ParamAssignment_1
            {
            pushFollow(FOLLOW_rule__ParamRef__ParamAssignment_1_in_rule__ParamRef__Group__1__Impl2568);
            rule__ParamRef__ParamAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParamRefAccess().getParamAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamRef__Group__1__Impl"


    // $ANTLR start "rule__ParamRef__Group__2"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1303:1: rule__ParamRef__Group__2 : rule__ParamRef__Group__2__Impl ;
    public final void rule__ParamRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1307:1: ( rule__ParamRef__Group__2__Impl )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1308:2: rule__ParamRef__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParamRef__Group__2__Impl_in_rule__ParamRef__Group__22598);
            rule__ParamRef__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamRef__Group__2"


    // $ANTLR start "rule__ParamRef__Group__2__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1314:1: rule__ParamRef__Group__2__Impl : ( ( rule__ParamRef__IsKeyAssignment_2 )? ) ;
    public final void rule__ParamRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1318:1: ( ( ( rule__ParamRef__IsKeyAssignment_2 )? ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1319:1: ( ( rule__ParamRef__IsKeyAssignment_2 )? )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1319:1: ( ( rule__ParamRef__IsKeyAssignment_2 )? )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1320:1: ( rule__ParamRef__IsKeyAssignment_2 )?
            {
             before(grammarAccess.getParamRefAccess().getIsKeyAssignment_2()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1321:1: ( rule__ParamRef__IsKeyAssignment_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1321:2: rule__ParamRef__IsKeyAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ParamRef__IsKeyAssignment_2_in_rule__ParamRef__Group__2__Impl2625);
                    rule__ParamRef__IsKeyAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParamRefAccess().getIsKeyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamRef__Group__2__Impl"


    // $ANTLR start "rule__Message__Group__0"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1337:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1341:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1342:2: rule__Message__Group__0__Impl rule__Message__Group__1
            {
            pushFollow(FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__02662);
            rule__Message__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Message__Group__1_in_rule__Message__Group__02665);
            rule__Message__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__0"


    // $ANTLR start "rule__Message__Group__0__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1349:1: rule__Message__Group__0__Impl : ( ( rule__Message__SenderAssignment_0 ) ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1353:1: ( ( ( rule__Message__SenderAssignment_0 ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1354:1: ( ( rule__Message__SenderAssignment_0 ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1354:1: ( ( rule__Message__SenderAssignment_0 ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1355:1: ( rule__Message__SenderAssignment_0 )
            {
             before(grammarAccess.getMessageAccess().getSenderAssignment_0()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1356:1: ( rule__Message__SenderAssignment_0 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1356:2: rule__Message__SenderAssignment_0
            {
            pushFollow(FOLLOW_rule__Message__SenderAssignment_0_in_rule__Message__Group__0__Impl2692);
            rule__Message__SenderAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getSenderAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__0__Impl"


    // $ANTLR start "rule__Message__Group__1"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1366:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1370:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1371:2: rule__Message__Group__1__Impl rule__Message__Group__2
            {
            pushFollow(FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__12722);
            rule__Message__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Message__Group__2_in_rule__Message__Group__12725);
            rule__Message__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__1"


    // $ANTLR start "rule__Message__Group__1__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1378:1: rule__Message__Group__1__Impl : ( RULE_ARROW ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1382:1: ( ( RULE_ARROW ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1383:1: ( RULE_ARROW )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1383:1: ( RULE_ARROW )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1384:1: RULE_ARROW
            {
             before(grammarAccess.getMessageAccess().getARROWTerminalRuleCall_1()); 
            match(input,RULE_ARROW,FOLLOW_RULE_ARROW_in_rule__Message__Group__1__Impl2752); 
             after(grammarAccess.getMessageAccess().getARROWTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__1__Impl"


    // $ANTLR start "rule__Message__Group__2"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1395:1: rule__Message__Group__2 : rule__Message__Group__2__Impl rule__Message__Group__3 ;
    public final void rule__Message__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1399:1: ( rule__Message__Group__2__Impl rule__Message__Group__3 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1400:2: rule__Message__Group__2__Impl rule__Message__Group__3
            {
            pushFollow(FOLLOW_rule__Message__Group__2__Impl_in_rule__Message__Group__22781);
            rule__Message__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Message__Group__3_in_rule__Message__Group__22784);
            rule__Message__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__2"


    // $ANTLR start "rule__Message__Group__2__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1407:1: rule__Message__Group__2__Impl : ( ( rule__Message__ReceiverAssignment_2 ) ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1411:1: ( ( ( rule__Message__ReceiverAssignment_2 ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1412:1: ( ( rule__Message__ReceiverAssignment_2 ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1412:1: ( ( rule__Message__ReceiverAssignment_2 ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1413:1: ( rule__Message__ReceiverAssignment_2 )
            {
             before(grammarAccess.getMessageAccess().getReceiverAssignment_2()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1414:1: ( rule__Message__ReceiverAssignment_2 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1414:2: rule__Message__ReceiverAssignment_2
            {
            pushFollow(FOLLOW_rule__Message__ReceiverAssignment_2_in_rule__Message__Group__2__Impl2811);
            rule__Message__ReceiverAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getReceiverAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__2__Impl"


    // $ANTLR start "rule__Message__Group__3"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1424:1: rule__Message__Group__3 : rule__Message__Group__3__Impl rule__Message__Group__4 ;
    public final void rule__Message__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1428:1: ( rule__Message__Group__3__Impl rule__Message__Group__4 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1429:2: rule__Message__Group__3__Impl rule__Message__Group__4
            {
            pushFollow(FOLLOW_rule__Message__Group__3__Impl_in_rule__Message__Group__32841);
            rule__Message__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Message__Group__4_in_rule__Message__Group__32844);
            rule__Message__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__3"


    // $ANTLR start "rule__Message__Group__3__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1436:1: rule__Message__Group__3__Impl : ( RULE_COLON ) ;
    public final void rule__Message__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1440:1: ( ( RULE_COLON ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1441:1: ( RULE_COLON )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1441:1: ( RULE_COLON )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1442:1: RULE_COLON
            {
             before(grammarAccess.getMessageAccess().getCOLONTerminalRuleCall_3()); 
            match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rule__Message__Group__3__Impl2871); 
             after(grammarAccess.getMessageAccess().getCOLONTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__3__Impl"


    // $ANTLR start "rule__Message__Group__4"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1453:1: rule__Message__Group__4 : rule__Message__Group__4__Impl rule__Message__Group__5 ;
    public final void rule__Message__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1457:1: ( rule__Message__Group__4__Impl rule__Message__Group__5 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1458:2: rule__Message__Group__4__Impl rule__Message__Group__5
            {
            pushFollow(FOLLOW_rule__Message__Group__4__Impl_in_rule__Message__Group__42900);
            rule__Message__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Message__Group__5_in_rule__Message__Group__42903);
            rule__Message__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__4"


    // $ANTLR start "rule__Message__Group__4__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1465:1: rule__Message__Group__4__Impl : ( ( rule__Message__NameAssignment_4 ) ) ;
    public final void rule__Message__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1469:1: ( ( ( rule__Message__NameAssignment_4 ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1470:1: ( ( rule__Message__NameAssignment_4 ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1470:1: ( ( rule__Message__NameAssignment_4 ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1471:1: ( rule__Message__NameAssignment_4 )
            {
             before(grammarAccess.getMessageAccess().getNameAssignment_4()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1472:1: ( rule__Message__NameAssignment_4 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1472:2: rule__Message__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__Message__NameAssignment_4_in_rule__Message__Group__4__Impl2930);
            rule__Message__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__4__Impl"


    // $ANTLR start "rule__Message__Group__5"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1482:1: rule__Message__Group__5 : rule__Message__Group__5__Impl rule__Message__Group__6 ;
    public final void rule__Message__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1486:1: ( rule__Message__Group__5__Impl rule__Message__Group__6 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1487:2: rule__Message__Group__5__Impl rule__Message__Group__6
            {
            pushFollow(FOLLOW_rule__Message__Group__5__Impl_in_rule__Message__Group__52960);
            rule__Message__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Message__Group__6_in_rule__Message__Group__52963);
            rule__Message__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__5"


    // $ANTLR start "rule__Message__Group__5__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1494:1: rule__Message__Group__5__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Message__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1498:1: ( ( RULE_LBRACKET ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1499:1: ( RULE_LBRACKET )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1499:1: ( RULE_LBRACKET )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1500:1: RULE_LBRACKET
            {
             before(grammarAccess.getMessageAccess().getLBRACKETTerminalRuleCall_5()); 
            match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_rule__Message__Group__5__Impl2990); 
             after(grammarAccess.getMessageAccess().getLBRACKETTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__5__Impl"


    // $ANTLR start "rule__Message__Group__6"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1511:1: rule__Message__Group__6 : rule__Message__Group__6__Impl rule__Message__Group__7 ;
    public final void rule__Message__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1515:1: ( rule__Message__Group__6__Impl rule__Message__Group__7 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1516:2: rule__Message__Group__6__Impl rule__Message__Group__7
            {
            pushFollow(FOLLOW_rule__Message__Group__6__Impl_in_rule__Message__Group__63019);
            rule__Message__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Message__Group__7_in_rule__Message__Group__63022);
            rule__Message__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__6"


    // $ANTLR start "rule__Message__Group__6__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1523:1: rule__Message__Group__6__Impl : ( ( rule__Message__ParamsAssignment_6 ) ) ;
    public final void rule__Message__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1527:1: ( ( ( rule__Message__ParamsAssignment_6 ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1528:1: ( ( rule__Message__ParamsAssignment_6 ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1528:1: ( ( rule__Message__ParamsAssignment_6 ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1529:1: ( rule__Message__ParamsAssignment_6 )
            {
             before(grammarAccess.getMessageAccess().getParamsAssignment_6()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1530:1: ( rule__Message__ParamsAssignment_6 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1530:2: rule__Message__ParamsAssignment_6
            {
            pushFollow(FOLLOW_rule__Message__ParamsAssignment_6_in_rule__Message__Group__6__Impl3049);
            rule__Message__ParamsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getParamsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__6__Impl"


    // $ANTLR start "rule__Message__Group__7"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1540:1: rule__Message__Group__7 : rule__Message__Group__7__Impl rule__Message__Group__8 ;
    public final void rule__Message__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1544:1: ( rule__Message__Group__7__Impl rule__Message__Group__8 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1545:2: rule__Message__Group__7__Impl rule__Message__Group__8
            {
            pushFollow(FOLLOW_rule__Message__Group__7__Impl_in_rule__Message__Group__73079);
            rule__Message__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Message__Group__8_in_rule__Message__Group__73082);
            rule__Message__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__7"


    // $ANTLR start "rule__Message__Group__7__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1552:1: rule__Message__Group__7__Impl : ( ( rule__Message__Group_7__0 )* ) ;
    public final void rule__Message__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1556:1: ( ( ( rule__Message__Group_7__0 )* ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1557:1: ( ( rule__Message__Group_7__0 )* )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1557:1: ( ( rule__Message__Group_7__0 )* )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1558:1: ( rule__Message__Group_7__0 )*
            {
             before(grammarAccess.getMessageAccess().getGroup_7()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1559:1: ( rule__Message__Group_7__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_COMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1559:2: rule__Message__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__Message__Group_7__0_in_rule__Message__Group__7__Impl3109);
            	    rule__Message__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getMessageAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__7__Impl"


    // $ANTLR start "rule__Message__Group__8"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1569:1: rule__Message__Group__8 : rule__Message__Group__8__Impl ;
    public final void rule__Message__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1573:1: ( rule__Message__Group__8__Impl )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1574:2: rule__Message__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Message__Group__8__Impl_in_rule__Message__Group__83140);
            rule__Message__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__8"


    // $ANTLR start "rule__Message__Group__8__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1580:1: rule__Message__Group__8__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Message__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1584:1: ( ( RULE_RBRACKET ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1585:1: ( RULE_RBRACKET )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1585:1: ( RULE_RBRACKET )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1586:1: RULE_RBRACKET
            {
             before(grammarAccess.getMessageAccess().getRBRACKETTerminalRuleCall_8()); 
            match(input,RULE_RBRACKET,FOLLOW_RULE_RBRACKET_in_rule__Message__Group__8__Impl3167); 
             after(grammarAccess.getMessageAccess().getRBRACKETTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__8__Impl"


    // $ANTLR start "rule__Message__Group_7__0"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1615:1: rule__Message__Group_7__0 : rule__Message__Group_7__0__Impl rule__Message__Group_7__1 ;
    public final void rule__Message__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1619:1: ( rule__Message__Group_7__0__Impl rule__Message__Group_7__1 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1620:2: rule__Message__Group_7__0__Impl rule__Message__Group_7__1
            {
            pushFollow(FOLLOW_rule__Message__Group_7__0__Impl_in_rule__Message__Group_7__03214);
            rule__Message__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Message__Group_7__1_in_rule__Message__Group_7__03217);
            rule__Message__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_7__0"


    // $ANTLR start "rule__Message__Group_7__0__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1627:1: rule__Message__Group_7__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Message__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1631:1: ( ( RULE_COMMA ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1632:1: ( RULE_COMMA )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1632:1: ( RULE_COMMA )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1633:1: RULE_COMMA
            {
             before(grammarAccess.getMessageAccess().getCOMMATerminalRuleCall_7_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__Message__Group_7__0__Impl3244); 
             after(grammarAccess.getMessageAccess().getCOMMATerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_7__0__Impl"


    // $ANTLR start "rule__Message__Group_7__1"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1644:1: rule__Message__Group_7__1 : rule__Message__Group_7__1__Impl ;
    public final void rule__Message__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1648:1: ( rule__Message__Group_7__1__Impl )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1649:2: rule__Message__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Message__Group_7__1__Impl_in_rule__Message__Group_7__13273);
            rule__Message__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_7__1"


    // $ANTLR start "rule__Message__Group_7__1__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1655:1: rule__Message__Group_7__1__Impl : ( ( rule__Message__ParamsAssignment_7_1 ) ) ;
    public final void rule__Message__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1659:1: ( ( ( rule__Message__ParamsAssignment_7_1 ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1660:1: ( ( rule__Message__ParamsAssignment_7_1 ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1660:1: ( ( rule__Message__ParamsAssignment_7_1 ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1661:1: ( rule__Message__ParamsAssignment_7_1 )
            {
             before(grammarAccess.getMessageAccess().getParamsAssignment_7_1()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1662:1: ( rule__Message__ParamsAssignment_7_1 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1662:2: rule__Message__ParamsAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Message__ParamsAssignment_7_1_in_rule__Message__Group_7__1__Impl3300);
            rule__Message__ParamsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getParamsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_7__1__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1676:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1680:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1681:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__03334);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__03337);
            rule__Reference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0"


    // $ANTLR start "rule__Reference__Group__0__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1688:1: rule__Reference__Group__0__Impl : ( ( rule__Reference__RefAssignment_0 ) ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1692:1: ( ( ( rule__Reference__RefAssignment_0 ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1693:1: ( ( rule__Reference__RefAssignment_0 ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1693:1: ( ( rule__Reference__RefAssignment_0 ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1694:1: ( rule__Reference__RefAssignment_0 )
            {
             before(grammarAccess.getReferenceAccess().getRefAssignment_0()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1695:1: ( rule__Reference__RefAssignment_0 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1695:2: rule__Reference__RefAssignment_0
            {
            pushFollow(FOLLOW_rule__Reference__RefAssignment_0_in_rule__Reference__Group__0__Impl3364);
            rule__Reference__RefAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getRefAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference__Group__1"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1705:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1709:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1710:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__13394);
            rule__Reference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__13397);
            rule__Reference__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1"


    // $ANTLR start "rule__Reference__Group__1__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1717:1: rule__Reference__Group__1__Impl : ( RULE_LPAREN ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1721:1: ( ( RULE_LPAREN ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1722:1: ( RULE_LPAREN )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1722:1: ( RULE_LPAREN )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1723:1: RULE_LPAREN
            {
             before(grammarAccess.getReferenceAccess().getLPARENTerminalRuleCall_1()); 
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rule__Reference__Group__1__Impl3424); 
             after(grammarAccess.getReferenceAccess().getLPARENTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1__Impl"


    // $ANTLR start "rule__Reference__Group__2"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1734:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1738:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1739:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__23453);
            rule__Reference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__3_in_rule__Reference__Group__23456);
            rule__Reference__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__2"


    // $ANTLR start "rule__Reference__Group__2__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1746:1: rule__Reference__Group__2__Impl : ( ( ( rule__Reference__Group_2__0 ) ) ( ( rule__Reference__Group_2__0 )* ) ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1750:1: ( ( ( ( rule__Reference__Group_2__0 ) ) ( ( rule__Reference__Group_2__0 )* ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1751:1: ( ( ( rule__Reference__Group_2__0 ) ) ( ( rule__Reference__Group_2__0 )* ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1751:1: ( ( ( rule__Reference__Group_2__0 ) ) ( ( rule__Reference__Group_2__0 )* ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1752:1: ( ( rule__Reference__Group_2__0 ) ) ( ( rule__Reference__Group_2__0 )* )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1752:1: ( ( rule__Reference__Group_2__0 ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1753:1: ( rule__Reference__Group_2__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup_2()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1754:1: ( rule__Reference__Group_2__0 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1754:2: rule__Reference__Group_2__0
            {
            pushFollow(FOLLOW_rule__Reference__Group_2__0_in_rule__Reference__Group__2__Impl3485);
            rule__Reference__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getGroup_2()); 

            }

            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1757:1: ( ( rule__Reference__Group_2__0 )* )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1758:1: ( rule__Reference__Group_2__0 )*
            {
             before(grammarAccess.getReferenceAccess().getGroup_2()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1759:1: ( rule__Reference__Group_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1759:2: rule__Reference__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Reference__Group_2__0_in_rule__Reference__Group__2__Impl3497);
            	    rule__Reference__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getReferenceAccess().getGroup_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__2__Impl"


    // $ANTLR start "rule__Reference__Group__3"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1770:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl rule__Reference__Group__4 ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1774:1: ( rule__Reference__Group__3__Impl rule__Reference__Group__4 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1775:2: rule__Reference__Group__3__Impl rule__Reference__Group__4
            {
            pushFollow(FOLLOW_rule__Reference__Group__3__Impl_in_rule__Reference__Group__33530);
            rule__Reference__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__4_in_rule__Reference__Group__33533);
            rule__Reference__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__3"


    // $ANTLR start "rule__Reference__Group__3__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1782:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__ParamsAssignment_3 ) ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1786:1: ( ( ( rule__Reference__ParamsAssignment_3 ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1787:1: ( ( rule__Reference__ParamsAssignment_3 ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1787:1: ( ( rule__Reference__ParamsAssignment_3 ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1788:1: ( rule__Reference__ParamsAssignment_3 )
            {
             before(grammarAccess.getReferenceAccess().getParamsAssignment_3()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1789:1: ( rule__Reference__ParamsAssignment_3 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1789:2: rule__Reference__ParamsAssignment_3
            {
            pushFollow(FOLLOW_rule__Reference__ParamsAssignment_3_in_rule__Reference__Group__3__Impl3560);
            rule__Reference__ParamsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getParamsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__3__Impl"


    // $ANTLR start "rule__Reference__Group__4"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1799:1: rule__Reference__Group__4 : rule__Reference__Group__4__Impl rule__Reference__Group__5 ;
    public final void rule__Reference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1803:1: ( rule__Reference__Group__4__Impl rule__Reference__Group__5 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1804:2: rule__Reference__Group__4__Impl rule__Reference__Group__5
            {
            pushFollow(FOLLOW_rule__Reference__Group__4__Impl_in_rule__Reference__Group__43590);
            rule__Reference__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__5_in_rule__Reference__Group__43593);
            rule__Reference__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__4"


    // $ANTLR start "rule__Reference__Group__4__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1811:1: rule__Reference__Group__4__Impl : ( ( rule__Reference__Group_4__0 )* ) ;
    public final void rule__Reference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1815:1: ( ( ( rule__Reference__Group_4__0 )* ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1816:1: ( ( rule__Reference__Group_4__0 )* )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1816:1: ( ( rule__Reference__Group_4__0 )* )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1817:1: ( rule__Reference__Group_4__0 )*
            {
             before(grammarAccess.getReferenceAccess().getGroup_4()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1818:1: ( rule__Reference__Group_4__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_COMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1818:2: rule__Reference__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Reference__Group_4__0_in_rule__Reference__Group__4__Impl3620);
            	    rule__Reference__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getReferenceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__4__Impl"


    // $ANTLR start "rule__Reference__Group__5"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1828:1: rule__Reference__Group__5 : rule__Reference__Group__5__Impl ;
    public final void rule__Reference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1832:1: ( rule__Reference__Group__5__Impl )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1833:2: rule__Reference__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group__5__Impl_in_rule__Reference__Group__53651);
            rule__Reference__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__5"


    // $ANTLR start "rule__Reference__Group__5__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1839:1: rule__Reference__Group__5__Impl : ( RULE_RPAREN ) ;
    public final void rule__Reference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1843:1: ( ( RULE_RPAREN ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1844:1: ( RULE_RPAREN )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1844:1: ( RULE_RPAREN )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1845:1: RULE_RPAREN
            {
             before(grammarAccess.getReferenceAccess().getRPARENTerminalRuleCall_5()); 
            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rule__Reference__Group__5__Impl3678); 
             after(grammarAccess.getReferenceAccess().getRPARENTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__5__Impl"


    // $ANTLR start "rule__Reference__Group_2__0"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1868:1: rule__Reference__Group_2__0 : rule__Reference__Group_2__0__Impl rule__Reference__Group_2__1 ;
    public final void rule__Reference__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1872:1: ( rule__Reference__Group_2__0__Impl rule__Reference__Group_2__1 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1873:2: rule__Reference__Group_2__0__Impl rule__Reference__Group_2__1
            {
            pushFollow(FOLLOW_rule__Reference__Group_2__0__Impl_in_rule__Reference__Group_2__03719);
            rule__Reference__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group_2__1_in_rule__Reference__Group_2__03722);
            rule__Reference__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_2__0"


    // $ANTLR start "rule__Reference__Group_2__0__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1880:1: rule__Reference__Group_2__0__Impl : ( ( rule__Reference__RolesAssignment_2_0 ) ) ;
    public final void rule__Reference__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1884:1: ( ( ( rule__Reference__RolesAssignment_2_0 ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1885:1: ( ( rule__Reference__RolesAssignment_2_0 ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1885:1: ( ( rule__Reference__RolesAssignment_2_0 ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1886:1: ( rule__Reference__RolesAssignment_2_0 )
            {
             before(grammarAccess.getReferenceAccess().getRolesAssignment_2_0()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1887:1: ( rule__Reference__RolesAssignment_2_0 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1887:2: rule__Reference__RolesAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Reference__RolesAssignment_2_0_in_rule__Reference__Group_2__0__Impl3749);
            rule__Reference__RolesAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getRolesAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_2__0__Impl"


    // $ANTLR start "rule__Reference__Group_2__1"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1897:1: rule__Reference__Group_2__1 : rule__Reference__Group_2__1__Impl ;
    public final void rule__Reference__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1901:1: ( rule__Reference__Group_2__1__Impl )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1902:2: rule__Reference__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group_2__1__Impl_in_rule__Reference__Group_2__13779);
            rule__Reference__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_2__1"


    // $ANTLR start "rule__Reference__Group_2__1__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1908:1: rule__Reference__Group_2__1__Impl : ( RULE_COMMA ) ;
    public final void rule__Reference__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1912:1: ( ( RULE_COMMA ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1913:1: ( RULE_COMMA )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1913:1: ( RULE_COMMA )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1914:1: RULE_COMMA
            {
             before(grammarAccess.getReferenceAccess().getCOMMATerminalRuleCall_2_1()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__Reference__Group_2__1__Impl3806); 
             after(grammarAccess.getReferenceAccess().getCOMMATerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_2__1__Impl"


    // $ANTLR start "rule__Reference__Group_4__0"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1929:1: rule__Reference__Group_4__0 : rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1 ;
    public final void rule__Reference__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1933:1: ( rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1934:2: rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1
            {
            pushFollow(FOLLOW_rule__Reference__Group_4__0__Impl_in_rule__Reference__Group_4__03839);
            rule__Reference__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group_4__1_in_rule__Reference__Group_4__03842);
            rule__Reference__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4__0"


    // $ANTLR start "rule__Reference__Group_4__0__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1941:1: rule__Reference__Group_4__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Reference__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1945:1: ( ( RULE_COMMA ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1946:1: ( RULE_COMMA )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1946:1: ( RULE_COMMA )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1947:1: RULE_COMMA
            {
             before(grammarAccess.getReferenceAccess().getCOMMATerminalRuleCall_4_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__Reference__Group_4__0__Impl3869); 
             after(grammarAccess.getReferenceAccess().getCOMMATerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4__0__Impl"


    // $ANTLR start "rule__Reference__Group_4__1"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1958:1: rule__Reference__Group_4__1 : rule__Reference__Group_4__1__Impl ;
    public final void rule__Reference__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1962:1: ( rule__Reference__Group_4__1__Impl )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1963:2: rule__Reference__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group_4__1__Impl_in_rule__Reference__Group_4__13898);
            rule__Reference__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4__1"


    // $ANTLR start "rule__Reference__Group_4__1__Impl"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1969:1: rule__Reference__Group_4__1__Impl : ( ( rule__Reference__ParamsAssignment_4_1 ) ) ;
    public final void rule__Reference__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1973:1: ( ( ( rule__Reference__ParamsAssignment_4_1 ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1974:1: ( ( rule__Reference__ParamsAssignment_4_1 ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1974:1: ( ( rule__Reference__ParamsAssignment_4_1 ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1975:1: ( rule__Reference__ParamsAssignment_4_1 )
            {
             before(grammarAccess.getReferenceAccess().getParamsAssignment_4_1()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1976:1: ( rule__Reference__ParamsAssignment_4_1 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1976:2: rule__Reference__ParamsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Reference__ParamsAssignment_4_1_in_rule__Reference__Group_4__1__Impl3925);
            rule__Reference__ParamsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getParamsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4__1__Impl"


    // $ANTLR start "rule__Protocol__JunkProtocolAssignment_0"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1991:1: rule__Protocol__JunkProtocolAssignment_0 : ( rulekPROTOCOL ) ;
    public final void rule__Protocol__JunkProtocolAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1995:1: ( ( rulekPROTOCOL ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1996:1: ( rulekPROTOCOL )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1996:1: ( rulekPROTOCOL )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:1997:1: rulekPROTOCOL
            {
             before(grammarAccess.getProtocolAccess().getJunkProtocolKPROTOCOLEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_rulekPROTOCOL_in_rule__Protocol__JunkProtocolAssignment_03964);
            rulekPROTOCOL();

            state._fsp--;

             after(grammarAccess.getProtocolAccess().getJunkProtocolKPROTOCOLEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__JunkProtocolAssignment_0"


    // $ANTLR start "rule__Protocol__NameAssignment_1"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2006:1: rule__Protocol__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Protocol__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2010:1: ( ( RULE_ID ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2011:1: ( RULE_ID )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2011:1: ( RULE_ID )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2012:1: RULE_ID
            {
             before(grammarAccess.getProtocolAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Protocol__NameAssignment_13995); 
             after(grammarAccess.getProtocolAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__NameAssignment_1"


    // $ANTLR start "rule__Protocol__JunkRoleAssignment_3"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2021:1: rule__Protocol__JunkRoleAssignment_3 : ( rulekROLE ) ;
    public final void rule__Protocol__JunkRoleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2025:1: ( ( rulekROLE ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2026:1: ( rulekROLE )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2026:1: ( rulekROLE )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2027:1: rulekROLE
            {
             before(grammarAccess.getProtocolAccess().getJunkRoleKROLEEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_rulekROLE_in_rule__Protocol__JunkRoleAssignment_34026);
            rulekROLE();

            state._fsp--;

             after(grammarAccess.getProtocolAccess().getJunkRoleKROLEEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__JunkRoleAssignment_3"


    // $ANTLR start "rule__Protocol__RolesAssignment_4"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2036:1: rule__Protocol__RolesAssignment_4 : ( ruleRole ) ;
    public final void rule__Protocol__RolesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2040:1: ( ( ruleRole ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2041:1: ( ruleRole )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2041:1: ( ruleRole )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2042:1: ruleRole
            {
             before(grammarAccess.getProtocolAccess().getRolesRoleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleRole_in_rule__Protocol__RolesAssignment_44057);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getProtocolAccess().getRolesRoleParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__RolesAssignment_4"


    // $ANTLR start "rule__Protocol__RolesAssignment_6"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2051:1: rule__Protocol__RolesAssignment_6 : ( ruleRole ) ;
    public final void rule__Protocol__RolesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2055:1: ( ( ruleRole ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2056:1: ( ruleRole )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2056:1: ( ruleRole )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2057:1: ruleRole
            {
             before(grammarAccess.getProtocolAccess().getRolesRoleParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleRole_in_rule__Protocol__RolesAssignment_64088);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getProtocolAccess().getRolesRoleParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__RolesAssignment_6"


    // $ANTLR start "rule__Protocol__RolesAssignment_7_1"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2066:1: rule__Protocol__RolesAssignment_7_1 : ( ruleRole ) ;
    public final void rule__Protocol__RolesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2070:1: ( ( ruleRole ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2071:1: ( ruleRole )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2071:1: ( ruleRole )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2072:1: ruleRole
            {
             before(grammarAccess.getProtocolAccess().getRolesRoleParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleRole_in_rule__Protocol__RolesAssignment_7_14119);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getProtocolAccess().getRolesRoleParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__RolesAssignment_7_1"


    // $ANTLR start "rule__Protocol__JunkPubAssignment_8"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2081:1: rule__Protocol__JunkPubAssignment_8 : ( rulekPARAMETER ) ;
    public final void rule__Protocol__JunkPubAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2085:1: ( ( rulekPARAMETER ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2086:1: ( rulekPARAMETER )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2086:1: ( rulekPARAMETER )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2087:1: rulekPARAMETER
            {
             before(grammarAccess.getProtocolAccess().getJunkPubKPARAMETEREnumRuleCall_8_0()); 
            pushFollow(FOLLOW_rulekPARAMETER_in_rule__Protocol__JunkPubAssignment_84150);
            rulekPARAMETER();

            state._fsp--;

             after(grammarAccess.getProtocolAccess().getJunkPubKPARAMETEREnumRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__JunkPubAssignment_8"


    // $ANTLR start "rule__Protocol__PublicParamsAssignment_9"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2096:1: rule__Protocol__PublicParamsAssignment_9 : ( ruleParamDecl ) ;
    public final void rule__Protocol__PublicParamsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2100:1: ( ( ruleParamDecl ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2101:1: ( ruleParamDecl )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2101:1: ( ruleParamDecl )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2102:1: ruleParamDecl
            {
             before(grammarAccess.getProtocolAccess().getPublicParamsParamDeclParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleParamDecl_in_rule__Protocol__PublicParamsAssignment_94181);
            ruleParamDecl();

            state._fsp--;

             after(grammarAccess.getProtocolAccess().getPublicParamsParamDeclParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__PublicParamsAssignment_9"


    // $ANTLR start "rule__Protocol__PublicParamsAssignment_10_1"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2111:1: rule__Protocol__PublicParamsAssignment_10_1 : ( ruleParamDecl ) ;
    public final void rule__Protocol__PublicParamsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2115:1: ( ( ruleParamDecl ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2116:1: ( ruleParamDecl )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2116:1: ( ruleParamDecl )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2117:1: ruleParamDecl
            {
             before(grammarAccess.getProtocolAccess().getPublicParamsParamDeclParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_ruleParamDecl_in_rule__Protocol__PublicParamsAssignment_10_14212);
            ruleParamDecl();

            state._fsp--;

             after(grammarAccess.getProtocolAccess().getPublicParamsParamDeclParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__PublicParamsAssignment_10_1"


    // $ANTLR start "rule__Protocol__JunkPrivAssignment_11_0"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2126:1: rule__Protocol__JunkPrivAssignment_11_0 : ( rulekPRIVATE ) ;
    public final void rule__Protocol__JunkPrivAssignment_11_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2130:1: ( ( rulekPRIVATE ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2131:1: ( rulekPRIVATE )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2131:1: ( rulekPRIVATE )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2132:1: rulekPRIVATE
            {
             before(grammarAccess.getProtocolAccess().getJunkPrivKPRIVATEEnumRuleCall_11_0_0()); 
            pushFollow(FOLLOW_rulekPRIVATE_in_rule__Protocol__JunkPrivAssignment_11_04243);
            rulekPRIVATE();

            state._fsp--;

             after(grammarAccess.getProtocolAccess().getJunkPrivKPRIVATEEnumRuleCall_11_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__JunkPrivAssignment_11_0"


    // $ANTLR start "rule__Protocol__PrivateParamsAssignment_11_1"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2141:1: rule__Protocol__PrivateParamsAssignment_11_1 : ( ruleParameter ) ;
    public final void rule__Protocol__PrivateParamsAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2145:1: ( ( ruleParameter ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2146:1: ( ruleParameter )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2146:1: ( ruleParameter )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2147:1: ruleParameter
            {
             before(grammarAccess.getProtocolAccess().getPrivateParamsParameterParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Protocol__PrivateParamsAssignment_11_14274);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getProtocolAccess().getPrivateParamsParameterParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__PrivateParamsAssignment_11_1"


    // $ANTLR start "rule__Protocol__PrivateParamsAssignment_11_2_1"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2156:1: rule__Protocol__PrivateParamsAssignment_11_2_1 : ( ruleParameter ) ;
    public final void rule__Protocol__PrivateParamsAssignment_11_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2160:1: ( ( ruleParameter ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2161:1: ( ruleParameter )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2161:1: ( ruleParameter )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2162:1: ruleParameter
            {
             before(grammarAccess.getProtocolAccess().getPrivateParamsParameterParserRuleCall_11_2_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Protocol__PrivateParamsAssignment_11_2_14305);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getProtocolAccess().getPrivateParamsParameterParserRuleCall_11_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__PrivateParamsAssignment_11_2_1"


    // $ANTLR start "rule__Protocol__ReferencesAssignment_12"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2171:1: rule__Protocol__ReferencesAssignment_12 : ( ( rule__Protocol__ReferencesAlternatives_12_0 ) ) ;
    public final void rule__Protocol__ReferencesAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2175:1: ( ( ( rule__Protocol__ReferencesAlternatives_12_0 ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2176:1: ( ( rule__Protocol__ReferencesAlternatives_12_0 ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2176:1: ( ( rule__Protocol__ReferencesAlternatives_12_0 ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2177:1: ( rule__Protocol__ReferencesAlternatives_12_0 )
            {
             before(grammarAccess.getProtocolAccess().getReferencesAlternatives_12_0()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2178:1: ( rule__Protocol__ReferencesAlternatives_12_0 )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2178:2: rule__Protocol__ReferencesAlternatives_12_0
            {
            pushFollow(FOLLOW_rule__Protocol__ReferencesAlternatives_12_0_in_rule__Protocol__ReferencesAssignment_124336);
            rule__Protocol__ReferencesAlternatives_12_0();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getReferencesAlternatives_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__ReferencesAssignment_12"


    // $ANTLR start "rule__Role__NameAssignment"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2187:1: rule__Role__NameAssignment : ( RULE_ID ) ;
    public final void rule__Role__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2191:1: ( ( RULE_ID ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2192:1: ( RULE_ID )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2192:1: ( RULE_ID )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2193:1: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Role__NameAssignment4369); 
             after(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__NameAssignment"


    // $ANTLR start "rule__ParamDecl__AdornmentAssignment_0"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2202:1: rule__ParamDecl__AdornmentAssignment_0 : ( rulekAdornment ) ;
    public final void rule__ParamDecl__AdornmentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2206:1: ( ( rulekAdornment ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2207:1: ( rulekAdornment )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2207:1: ( rulekAdornment )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2208:1: rulekAdornment
            {
             before(grammarAccess.getParamDeclAccess().getAdornmentKAdornmentEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_rulekAdornment_in_rule__ParamDecl__AdornmentAssignment_04400);
            rulekAdornment();

            state._fsp--;

             after(grammarAccess.getParamDeclAccess().getAdornmentKAdornmentEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamDecl__AdornmentAssignment_0"


    // $ANTLR start "rule__ParamDecl__ParamAssignment_1"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2217:1: rule__ParamDecl__ParamAssignment_1 : ( ruleParameter ) ;
    public final void rule__ParamDecl__ParamAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2221:1: ( ( ruleParameter ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2222:1: ( ruleParameter )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2222:1: ( ruleParameter )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2223:1: ruleParameter
            {
             before(grammarAccess.getParamDeclAccess().getParamParameterParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__ParamDecl__ParamAssignment_14431);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParamDeclAccess().getParamParameterParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamDecl__ParamAssignment_1"


    // $ANTLR start "rule__ParamDecl__IsKeyAssignment_2"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2232:1: rule__ParamDecl__IsKeyAssignment_2 : ( rulekKEY ) ;
    public final void rule__ParamDecl__IsKeyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2236:1: ( ( rulekKEY ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2237:1: ( rulekKEY )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2237:1: ( rulekKEY )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2238:1: rulekKEY
            {
             before(grammarAccess.getParamDeclAccess().getIsKeyKKEYEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_rulekKEY_in_rule__ParamDecl__IsKeyAssignment_24462);
            rulekKEY();

            state._fsp--;

             after(grammarAccess.getParamDeclAccess().getIsKeyKKEYEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamDecl__IsKeyAssignment_2"


    // $ANTLR start "rule__Parameter__NameAssignment"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2247:1: rule__Parameter__NameAssignment : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2251:1: ( ( RULE_ID ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2252:1: ( RULE_ID )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2252:1: ( RULE_ID )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2253:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment4493); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment"


    // $ANTLR start "rule__ParamRef__AdornmentAssignment_0"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2262:1: rule__ParamRef__AdornmentAssignment_0 : ( rulekAdornment ) ;
    public final void rule__ParamRef__AdornmentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2266:1: ( ( rulekAdornment ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2267:1: ( rulekAdornment )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2267:1: ( rulekAdornment )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2268:1: rulekAdornment
            {
             before(grammarAccess.getParamRefAccess().getAdornmentKAdornmentEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_rulekAdornment_in_rule__ParamRef__AdornmentAssignment_04524);
            rulekAdornment();

            state._fsp--;

             after(grammarAccess.getParamRefAccess().getAdornmentKAdornmentEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamRef__AdornmentAssignment_0"


    // $ANTLR start "rule__ParamRef__ParamAssignment_1"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2277:1: rule__ParamRef__ParamAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ParamRef__ParamAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2281:1: ( ( ( RULE_ID ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2282:1: ( ( RULE_ID ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2282:1: ( ( RULE_ID ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2283:1: ( RULE_ID )
            {
             before(grammarAccess.getParamRefAccess().getParamParameterCrossReference_1_0()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2284:1: ( RULE_ID )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2285:1: RULE_ID
            {
             before(grammarAccess.getParamRefAccess().getParamParameterIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParamRef__ParamAssignment_14559); 
             after(grammarAccess.getParamRefAccess().getParamParameterIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getParamRefAccess().getParamParameterCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamRef__ParamAssignment_1"


    // $ANTLR start "rule__ParamRef__IsKeyAssignment_2"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2296:1: rule__ParamRef__IsKeyAssignment_2 : ( rulekKEY ) ;
    public final void rule__ParamRef__IsKeyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2300:1: ( ( rulekKEY ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2301:1: ( rulekKEY )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2301:1: ( rulekKEY )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2302:1: rulekKEY
            {
             before(grammarAccess.getParamRefAccess().getIsKeyKKEYEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_rulekKEY_in_rule__ParamRef__IsKeyAssignment_24594);
            rulekKEY();

            state._fsp--;

             after(grammarAccess.getParamRefAccess().getIsKeyKKEYEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamRef__IsKeyAssignment_2"


    // $ANTLR start "rule__Message__SenderAssignment_0"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2311:1: rule__Message__SenderAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Message__SenderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2315:1: ( ( ( RULE_ID ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2316:1: ( ( RULE_ID ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2316:1: ( ( RULE_ID ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2317:1: ( RULE_ID )
            {
             before(grammarAccess.getMessageAccess().getSenderRoleCrossReference_0_0()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2318:1: ( RULE_ID )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2319:1: RULE_ID
            {
             before(grammarAccess.getMessageAccess().getSenderRoleIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Message__SenderAssignment_04629); 
             after(grammarAccess.getMessageAccess().getSenderRoleIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getMessageAccess().getSenderRoleCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__SenderAssignment_0"


    // $ANTLR start "rule__Message__ReceiverAssignment_2"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2330:1: rule__Message__ReceiverAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Message__ReceiverAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2334:1: ( ( ( RULE_ID ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2335:1: ( ( RULE_ID ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2335:1: ( ( RULE_ID ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2336:1: ( RULE_ID )
            {
             before(grammarAccess.getMessageAccess().getReceiverRoleCrossReference_2_0()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2337:1: ( RULE_ID )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2338:1: RULE_ID
            {
             before(grammarAccess.getMessageAccess().getReceiverRoleIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Message__ReceiverAssignment_24668); 
             after(grammarAccess.getMessageAccess().getReceiverRoleIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMessageAccess().getReceiverRoleCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__ReceiverAssignment_2"


    // $ANTLR start "rule__Message__NameAssignment_4"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2349:1: rule__Message__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Message__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2353:1: ( ( RULE_ID ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2354:1: ( RULE_ID )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2354:1: ( RULE_ID )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2355:1: RULE_ID
            {
             before(grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Message__NameAssignment_44703); 
             after(grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__NameAssignment_4"


    // $ANTLR start "rule__Message__ParamsAssignment_6"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2364:1: rule__Message__ParamsAssignment_6 : ( ruleParamRef ) ;
    public final void rule__Message__ParamsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2368:1: ( ( ruleParamRef ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2369:1: ( ruleParamRef )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2369:1: ( ruleParamRef )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2370:1: ruleParamRef
            {
             before(grammarAccess.getMessageAccess().getParamsParamRefParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleParamRef_in_rule__Message__ParamsAssignment_64734);
            ruleParamRef();

            state._fsp--;

             after(grammarAccess.getMessageAccess().getParamsParamRefParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__ParamsAssignment_6"


    // $ANTLR start "rule__Message__ParamsAssignment_7_1"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2379:1: rule__Message__ParamsAssignment_7_1 : ( ruleParamRef ) ;
    public final void rule__Message__ParamsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2383:1: ( ( ruleParamRef ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2384:1: ( ruleParamRef )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2384:1: ( ruleParamRef )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2385:1: ruleParamRef
            {
             before(grammarAccess.getMessageAccess().getParamsParamRefParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleParamRef_in_rule__Message__ParamsAssignment_7_14765);
            ruleParamRef();

            state._fsp--;

             after(grammarAccess.getMessageAccess().getParamsParamRefParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__ParamsAssignment_7_1"


    // $ANTLR start "rule__Reference__RefAssignment_0"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2394:1: rule__Reference__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Reference__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2398:1: ( ( ( RULE_ID ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2399:1: ( ( RULE_ID ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2399:1: ( ( RULE_ID ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2400:1: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getRefBSPLCrossReference_0_0()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2401:1: ( RULE_ID )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2402:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getRefBSPLIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__RefAssignment_04800); 
             after(grammarAccess.getReferenceAccess().getRefBSPLIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getRefBSPLCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__RefAssignment_0"


    // $ANTLR start "rule__Reference__RolesAssignment_2_0"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2413:1: rule__Reference__RolesAssignment_2_0 : ( ( RULE_ID ) ) ;
    public final void rule__Reference__RolesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2417:1: ( ( ( RULE_ID ) ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2418:1: ( ( RULE_ID ) )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2418:1: ( ( RULE_ID ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2419:1: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getRolesRoleCrossReference_2_0_0()); 
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2420:1: ( RULE_ID )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2421:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getRolesRoleIDTerminalRuleCall_2_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__RolesAssignment_2_04839); 
             after(grammarAccess.getReferenceAccess().getRolesRoleIDTerminalRuleCall_2_0_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getRolesRoleCrossReference_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__RolesAssignment_2_0"


    // $ANTLR start "rule__Reference__ParamsAssignment_3"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2432:1: rule__Reference__ParamsAssignment_3 : ( ruleParamRef ) ;
    public final void rule__Reference__ParamsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2436:1: ( ( ruleParamRef ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2437:1: ( ruleParamRef )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2437:1: ( ruleParamRef )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2438:1: ruleParamRef
            {
             before(grammarAccess.getReferenceAccess().getParamsParamRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleParamRef_in_rule__Reference__ParamsAssignment_34874);
            ruleParamRef();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getParamsParamRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__ParamsAssignment_3"


    // $ANTLR start "rule__Reference__ParamsAssignment_4_1"
    // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2447:1: rule__Reference__ParamsAssignment_4_1 : ( ruleParamRef ) ;
    public final void rule__Reference__ParamsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2451:1: ( ( ruleParamRef ) )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2452:1: ( ruleParamRef )
            {
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2452:1: ( ruleParamRef )
            // ../ooi.coi.bspl.ui/src-gen/ooi/coi/bspl/ui/contentassist/antlr/internal/InternalBSPL.g:2453:1: ruleParamRef
            {
             before(grammarAccess.getReferenceAccess().getParamsParamRefParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleParamRef_in_rule__Reference__ParamsAssignment_4_14905);
            ruleParamRef();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getParamsParamRefParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__ParamsAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProtocol_in_entryRuleProtocol61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtocol68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__0_in_ruleProtocol94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__NameAssignment_in_ruleRole154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamDecl_in_entryRuleParamDecl181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParamDecl188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamDecl__Group__0_in_ruleParamDecl214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_in_ruleParameter274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamRef_in_entryRuleParamRef301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParamRef308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamRef__Group__0_in_ruleParamRef334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__0_in_ruleMessage394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0_in_ruleReference454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KAdornment__Alternatives_in_rulekAdornment491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulekPROTOCOL528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulekROLE567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulekPARAMETER606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulekPRIVATE645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulekKEY684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__Protocol__ReferencesAlternatives_12_0721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_rule__Protocol__ReferencesAlternatives_12_0738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__KAdornment__Alternatives771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__KAdornment__Alternatives792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__KAdornment__Alternatives813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__KAdornment__Alternatives834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__0__Impl_in_rule__Protocol__Group__0867 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Protocol__Group__1_in_rule__Protocol__Group__0870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__JunkProtocolAssignment_0_in_rule__Protocol__Group__0__Impl897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__1__Impl_in_rule__Protocol__Group__1928 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Protocol__Group__2_in_rule__Protocol__Group__1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__NameAssignment_1_in_rule__Protocol__Group__1__Impl958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__2__Impl_in_rule__Protocol__Group__2988 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Protocol__Group__3_in_rule__Protocol__Group__2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_rule__Protocol__Group__2__Impl1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__3__Impl_in_rule__Protocol__Group__31047 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Protocol__Group__4_in_rule__Protocol__Group__31050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__JunkRoleAssignment_3_in_rule__Protocol__Group__3__Impl1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__4__Impl_in_rule__Protocol__Group__41107 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Protocol__Group__5_in_rule__Protocol__Group__41110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__RolesAssignment_4_in_rule__Protocol__Group__4__Impl1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__5__Impl_in_rule__Protocol__Group__51167 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Protocol__Group__6_in_rule__Protocol__Group__51170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__Protocol__Group__5__Impl1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__6__Impl_in_rule__Protocol__Group__61226 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_rule__Protocol__Group__7_in_rule__Protocol__Group__61229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__RolesAssignment_6_in_rule__Protocol__Group__6__Impl1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__7__Impl_in_rule__Protocol__Group__71286 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_rule__Protocol__Group__8_in_rule__Protocol__Group__71289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group_7__0_in_rule__Protocol__Group__7__Impl1316 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Protocol__Group__8__Impl_in_rule__Protocol__Group__81347 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_rule__Protocol__Group__9_in_rule__Protocol__Group__81350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__JunkPubAssignment_8_in_rule__Protocol__Group__8__Impl1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__9__Impl_in_rule__Protocol__Group__91407 = new BitSet(new long[]{0x0000000000802020L});
    public static final BitSet FOLLOW_rule__Protocol__Group__10_in_rule__Protocol__Group__91410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__PublicParamsAssignment_9_in_rule__Protocol__Group__9__Impl1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__10__Impl_in_rule__Protocol__Group__101467 = new BitSet(new long[]{0x0000000000802020L});
    public static final BitSet FOLLOW_rule__Protocol__Group__11_in_rule__Protocol__Group__101470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group_10__0_in_rule__Protocol__Group__10__Impl1497 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Protocol__Group__11__Impl_in_rule__Protocol__Group__111528 = new BitSet(new long[]{0x0000000000802020L});
    public static final BitSet FOLLOW_rule__Protocol__Group__12_in_rule__Protocol__Group__111531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group_11__0_in_rule__Protocol__Group__11__Impl1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__12__Impl_in_rule__Protocol__Group__121589 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Protocol__Group__13_in_rule__Protocol__Group__121592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__ReferencesAssignment_12_in_rule__Protocol__Group__12__Impl1621 = new BitSet(new long[]{0x0000000000802022L});
    public static final BitSet FOLLOW_rule__Protocol__ReferencesAssignment_12_in_rule__Protocol__Group__12__Impl1633 = new BitSet(new long[]{0x0000000000802022L});
    public static final BitSet FOLLOW_rule__Protocol__Group__13__Impl_in_rule__Protocol__Group__131666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_rule__Protocol__Group__13__Impl1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group_7__0__Impl_in_rule__Protocol__Group_7__01750 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Protocol__Group_7__1_in_rule__Protocol__Group_7__01753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__Protocol__Group_7__0__Impl1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group_7__1__Impl_in_rule__Protocol__Group_7__11809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__RolesAssignment_7_1_in_rule__Protocol__Group_7__1__Impl1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group_10__0__Impl_in_rule__Protocol__Group_10__01870 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_rule__Protocol__Group_10__1_in_rule__Protocol__Group_10__01873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__Protocol__Group_10__0__Impl1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group_10__1__Impl_in_rule__Protocol__Group_10__11929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__PublicParamsAssignment_10_1_in_rule__Protocol__Group_10__1__Impl1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group_11__0__Impl_in_rule__Protocol__Group_11__01990 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Protocol__Group_11__1_in_rule__Protocol__Group_11__01993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__JunkPrivAssignment_11_0_in_rule__Protocol__Group_11__0__Impl2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group_11__1__Impl_in_rule__Protocol__Group_11__12050 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Protocol__Group_11__2_in_rule__Protocol__Group_11__12053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__PrivateParamsAssignment_11_1_in_rule__Protocol__Group_11__1__Impl2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group_11__2__Impl_in_rule__Protocol__Group_11__22110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group_11_2__0_in_rule__Protocol__Group_11__2__Impl2137 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Protocol__Group_11_2__0__Impl_in_rule__Protocol__Group_11_2__02174 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Protocol__Group_11_2__1_in_rule__Protocol__Group_11_2__02177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__Protocol__Group_11_2__0__Impl2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group_11_2__1__Impl_in_rule__Protocol__Group_11_2__12233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__PrivateParamsAssignment_11_2_1_in_rule__Protocol__Group_11_2__1__Impl2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamDecl__Group__0__Impl_in_rule__ParamDecl__Group__02294 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ParamDecl__Group__1_in_rule__ParamDecl__Group__02297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamDecl__AdornmentAssignment_0_in_rule__ParamDecl__Group__0__Impl2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamDecl__Group__1__Impl_in_rule__ParamDecl__Group__12354 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ParamDecl__Group__2_in_rule__ParamDecl__Group__12357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamDecl__ParamAssignment_1_in_rule__ParamDecl__Group__1__Impl2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamDecl__Group__2__Impl_in_rule__ParamDecl__Group__22414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamDecl__IsKeyAssignment_2_in_rule__ParamDecl__Group__2__Impl2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamRef__Group__0__Impl_in_rule__ParamRef__Group__02478 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ParamRef__Group__1_in_rule__ParamRef__Group__02481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamRef__AdornmentAssignment_0_in_rule__ParamRef__Group__0__Impl2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamRef__Group__1__Impl_in_rule__ParamRef__Group__12538 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ParamRef__Group__2_in_rule__ParamRef__Group__12541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamRef__ParamAssignment_1_in_rule__ParamRef__Group__1__Impl2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamRef__Group__2__Impl_in_rule__ParamRef__Group__22598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamRef__IsKeyAssignment_2_in_rule__ParamRef__Group__2__Impl2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__02662 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Message__Group__1_in_rule__Message__Group__02665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__SenderAssignment_0_in_rule__Message__Group__0__Impl2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__12722 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Message__Group__2_in_rule__Message__Group__12725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ARROW_in_rule__Message__Group__1__Impl2752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__2__Impl_in_rule__Message__Group__22781 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Message__Group__3_in_rule__Message__Group__22784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__ReceiverAssignment_2_in_rule__Message__Group__2__Impl2811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__3__Impl_in_rule__Message__Group__32841 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Message__Group__4_in_rule__Message__Group__32844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_rule__Message__Group__3__Impl2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__4__Impl_in_rule__Message__Group__42900 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Message__Group__5_in_rule__Message__Group__42903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__NameAssignment_4_in_rule__Message__Group__4__Impl2930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__5__Impl_in_rule__Message__Group__52960 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_rule__Message__Group__6_in_rule__Message__Group__52963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_rule__Message__Group__5__Impl2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__6__Impl_in_rule__Message__Group__63019 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_rule__Message__Group__7_in_rule__Message__Group__63022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__ParamsAssignment_6_in_rule__Message__Group__6__Impl3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__7__Impl_in_rule__Message__Group__73079 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_rule__Message__Group__8_in_rule__Message__Group__73082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group_7__0_in_rule__Message__Group__7__Impl3109 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Message__Group__8__Impl_in_rule__Message__Group__83140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RBRACKET_in_rule__Message__Group__8__Impl3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group_7__0__Impl_in_rule__Message__Group_7__03214 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_rule__Message__Group_7__1_in_rule__Message__Group_7__03217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__Message__Group_7__0__Impl3244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group_7__1__Impl_in_rule__Message__Group_7__13273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__ParamsAssignment_7_1_in_rule__Message__Group_7__1__Impl3300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__03334 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__03337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__RefAssignment_0_in_rule__Reference__Group__0__Impl3364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__13394 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__13397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rule__Reference__Group__1__Impl3424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__23453 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_rule__Reference__Group__3_in_rule__Reference__Group__23456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_2__0_in_rule__Reference__Group__2__Impl3485 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Reference__Group_2__0_in_rule__Reference__Group__2__Impl3497 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Reference__Group__3__Impl_in_rule__Reference__Group__33530 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_rule__Reference__Group__4_in_rule__Reference__Group__33533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__ParamsAssignment_3_in_rule__Reference__Group__3__Impl3560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__4__Impl_in_rule__Reference__Group__43590 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_rule__Reference__Group__5_in_rule__Reference__Group__43593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_4__0_in_rule__Reference__Group__4__Impl3620 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Reference__Group__5__Impl_in_rule__Reference__Group__53651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rule__Reference__Group__5__Impl3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_2__0__Impl_in_rule__Reference__Group_2__03719 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Reference__Group_2__1_in_rule__Reference__Group_2__03722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__RolesAssignment_2_0_in_rule__Reference__Group_2__0__Impl3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_2__1__Impl_in_rule__Reference__Group_2__13779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__Reference__Group_2__1__Impl3806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_4__0__Impl_in_rule__Reference__Group_4__03839 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_rule__Reference__Group_4__1_in_rule__Reference__Group_4__03842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__Reference__Group_4__0__Impl3869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_4__1__Impl_in_rule__Reference__Group_4__13898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__ParamsAssignment_4_1_in_rule__Reference__Group_4__1__Impl3925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulekPROTOCOL_in_rule__Protocol__JunkProtocolAssignment_03964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Protocol__NameAssignment_13995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulekROLE_in_rule__Protocol__JunkRoleAssignment_34026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_rule__Protocol__RolesAssignment_44057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_rule__Protocol__RolesAssignment_64088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_rule__Protocol__RolesAssignment_7_14119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulekPARAMETER_in_rule__Protocol__JunkPubAssignment_84150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamDecl_in_rule__Protocol__PublicParamsAssignment_94181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamDecl_in_rule__Protocol__PublicParamsAssignment_10_14212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulekPRIVATE_in_rule__Protocol__JunkPrivAssignment_11_04243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Protocol__PrivateParamsAssignment_11_14274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Protocol__PrivateParamsAssignment_11_2_14305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__ReferencesAlternatives_12_0_in_rule__Protocol__ReferencesAssignment_124336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Role__NameAssignment4369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulekAdornment_in_rule__ParamDecl__AdornmentAssignment_04400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__ParamDecl__ParamAssignment_14431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulekKEY_in_rule__ParamDecl__IsKeyAssignment_24462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulekAdornment_in_rule__ParamRef__AdornmentAssignment_04524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParamRef__ParamAssignment_14559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulekKEY_in_rule__ParamRef__IsKeyAssignment_24594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Message__SenderAssignment_04629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Message__ReceiverAssignment_24668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Message__NameAssignment_44703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamRef_in_rule__Message__ParamsAssignment_64734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamRef_in_rule__Message__ParamsAssignment_7_14765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__RefAssignment_04800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__RolesAssignment_2_04839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamRef_in_rule__Reference__ParamsAssignment_34874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamRef_in_rule__Reference__ParamsAssignment_4_14905 = new BitSet(new long[]{0x0000000000000002L});

}