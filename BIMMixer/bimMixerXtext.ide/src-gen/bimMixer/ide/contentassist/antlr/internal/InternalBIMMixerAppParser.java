package bimMixer.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import bimMixer.services.BIMMixerAppGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBIMMixerAppParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'BIMMixerApp'", "':'", "'BreeamCertification'", "'{'", "'}'", "','", "'connectedCertification:'", "'LEEDCertification'", "'Category'", "'text:'", "'points:'", "'obtainedPoints:'", "'connection:'", "'-'", "'.'", "'required'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalBIMMixerAppParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBIMMixerAppParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBIMMixerAppParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBIMMixerApp.g"; }


    	private BIMMixerAppGrammarAccess grammarAccess;

    	public void setGrammarAccess(BIMMixerAppGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleBIMMixerApp"
    // InternalBIMMixerApp.g:53:1: entryRuleBIMMixerApp : ruleBIMMixerApp EOF ;
    public final void entryRuleBIMMixerApp() throws RecognitionException {
        try {
            // InternalBIMMixerApp.g:54:1: ( ruleBIMMixerApp EOF )
            // InternalBIMMixerApp.g:55:1: ruleBIMMixerApp EOF
            {
             before(grammarAccess.getBIMMixerAppRule()); 
            pushFollow(FOLLOW_1);
            ruleBIMMixerApp();

            state._fsp--;

             after(grammarAccess.getBIMMixerAppRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBIMMixerApp"


    // $ANTLR start "ruleBIMMixerApp"
    // InternalBIMMixerApp.g:62:1: ruleBIMMixerApp : ( ( rule__BIMMixerApp__Group__0 ) ) ;
    public final void ruleBIMMixerApp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:66:2: ( ( ( rule__BIMMixerApp__Group__0 ) ) )
            // InternalBIMMixerApp.g:67:2: ( ( rule__BIMMixerApp__Group__0 ) )
            {
            // InternalBIMMixerApp.g:67:2: ( ( rule__BIMMixerApp__Group__0 ) )
            // InternalBIMMixerApp.g:68:3: ( rule__BIMMixerApp__Group__0 )
            {
             before(grammarAccess.getBIMMixerAppAccess().getGroup()); 
            // InternalBIMMixerApp.g:69:3: ( rule__BIMMixerApp__Group__0 )
            // InternalBIMMixerApp.g:69:4: rule__BIMMixerApp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BIMMixerApp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBIMMixerAppAccess().getGroup()); 

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
    // $ANTLR end "ruleBIMMixerApp"


    // $ANTLR start "entryRuleBIMCertification"
    // InternalBIMMixerApp.g:78:1: entryRuleBIMCertification : ruleBIMCertification EOF ;
    public final void entryRuleBIMCertification() throws RecognitionException {
        try {
            // InternalBIMMixerApp.g:79:1: ( ruleBIMCertification EOF )
            // InternalBIMMixerApp.g:80:1: ruleBIMCertification EOF
            {
             before(grammarAccess.getBIMCertificationRule()); 
            pushFollow(FOLLOW_1);
            ruleBIMCertification();

            state._fsp--;

             after(grammarAccess.getBIMCertificationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBIMCertification"


    // $ANTLR start "ruleBIMCertification"
    // InternalBIMMixerApp.g:87:1: ruleBIMCertification : ( ( rule__BIMCertification__Alternatives ) ) ;
    public final void ruleBIMCertification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:91:2: ( ( ( rule__BIMCertification__Alternatives ) ) )
            // InternalBIMMixerApp.g:92:2: ( ( rule__BIMCertification__Alternatives ) )
            {
            // InternalBIMMixerApp.g:92:2: ( ( rule__BIMCertification__Alternatives ) )
            // InternalBIMMixerApp.g:93:3: ( rule__BIMCertification__Alternatives )
            {
             before(grammarAccess.getBIMCertificationAccess().getAlternatives()); 
            // InternalBIMMixerApp.g:94:3: ( rule__BIMCertification__Alternatives )
            // InternalBIMMixerApp.g:94:4: rule__BIMCertification__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BIMCertification__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBIMCertificationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBIMCertification"


    // $ANTLR start "entryRuleBreeamCertification"
    // InternalBIMMixerApp.g:103:1: entryRuleBreeamCertification : ruleBreeamCertification EOF ;
    public final void entryRuleBreeamCertification() throws RecognitionException {
        try {
            // InternalBIMMixerApp.g:104:1: ( ruleBreeamCertification EOF )
            // InternalBIMMixerApp.g:105:1: ruleBreeamCertification EOF
            {
             before(grammarAccess.getBreeamCertificationRule()); 
            pushFollow(FOLLOW_1);
            ruleBreeamCertification();

            state._fsp--;

             after(grammarAccess.getBreeamCertificationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBreeamCertification"


    // $ANTLR start "ruleBreeamCertification"
    // InternalBIMMixerApp.g:112:1: ruleBreeamCertification : ( ( rule__BreeamCertification__Group__0 ) ) ;
    public final void ruleBreeamCertification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:116:2: ( ( ( rule__BreeamCertification__Group__0 ) ) )
            // InternalBIMMixerApp.g:117:2: ( ( rule__BreeamCertification__Group__0 ) )
            {
            // InternalBIMMixerApp.g:117:2: ( ( rule__BreeamCertification__Group__0 ) )
            // InternalBIMMixerApp.g:118:3: ( rule__BreeamCertification__Group__0 )
            {
             before(grammarAccess.getBreeamCertificationAccess().getGroup()); 
            // InternalBIMMixerApp.g:119:3: ( rule__BreeamCertification__Group__0 )
            // InternalBIMMixerApp.g:119:4: rule__BreeamCertification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BreeamCertification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBreeamCertificationAccess().getGroup()); 

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
    // $ANTLR end "ruleBreeamCertification"


    // $ANTLR start "entryRuleLEEDCertification"
    // InternalBIMMixerApp.g:128:1: entryRuleLEEDCertification : ruleLEEDCertification EOF ;
    public final void entryRuleLEEDCertification() throws RecognitionException {
        try {
            // InternalBIMMixerApp.g:129:1: ( ruleLEEDCertification EOF )
            // InternalBIMMixerApp.g:130:1: ruleLEEDCertification EOF
            {
             before(grammarAccess.getLEEDCertificationRule()); 
            pushFollow(FOLLOW_1);
            ruleLEEDCertification();

            state._fsp--;

             after(grammarAccess.getLEEDCertificationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLEEDCertification"


    // $ANTLR start "ruleLEEDCertification"
    // InternalBIMMixerApp.g:137:1: ruleLEEDCertification : ( ( rule__LEEDCertification__Group__0 ) ) ;
    public final void ruleLEEDCertification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:141:2: ( ( ( rule__LEEDCertification__Group__0 ) ) )
            // InternalBIMMixerApp.g:142:2: ( ( rule__LEEDCertification__Group__0 ) )
            {
            // InternalBIMMixerApp.g:142:2: ( ( rule__LEEDCertification__Group__0 ) )
            // InternalBIMMixerApp.g:143:3: ( rule__LEEDCertification__Group__0 )
            {
             before(grammarAccess.getLEEDCertificationAccess().getGroup()); 
            // InternalBIMMixerApp.g:144:3: ( rule__LEEDCertification__Group__0 )
            // InternalBIMMixerApp.g:144:4: rule__LEEDCertification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LEEDCertification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLEEDCertificationAccess().getGroup()); 

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
    // $ANTLR end "ruleLEEDCertification"


    // $ANTLR start "entryRuleCategory"
    // InternalBIMMixerApp.g:153:1: entryRuleCategory : ruleCategory EOF ;
    public final void entryRuleCategory() throws RecognitionException {
        try {
            // InternalBIMMixerApp.g:154:1: ( ruleCategory EOF )
            // InternalBIMMixerApp.g:155:1: ruleCategory EOF
            {
             before(grammarAccess.getCategoryRule()); 
            pushFollow(FOLLOW_1);
            ruleCategory();

            state._fsp--;

             after(grammarAccess.getCategoryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCategory"


    // $ANTLR start "ruleCategory"
    // InternalBIMMixerApp.g:162:1: ruleCategory : ( ( rule__Category__Group__0 ) ) ;
    public final void ruleCategory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:166:2: ( ( ( rule__Category__Group__0 ) ) )
            // InternalBIMMixerApp.g:167:2: ( ( rule__Category__Group__0 ) )
            {
            // InternalBIMMixerApp.g:167:2: ( ( rule__Category__Group__0 ) )
            // InternalBIMMixerApp.g:168:3: ( rule__Category__Group__0 )
            {
             before(grammarAccess.getCategoryAccess().getGroup()); 
            // InternalBIMMixerApp.g:169:3: ( rule__Category__Group__0 )
            // InternalBIMMixerApp.g:169:4: rule__Category__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Category__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getGroup()); 

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
    // $ANTLR end "ruleCategory"


    // $ANTLR start "entryRuleSubcategory"
    // InternalBIMMixerApp.g:178:1: entryRuleSubcategory : ruleSubcategory EOF ;
    public final void entryRuleSubcategory() throws RecognitionException {
        try {
            // InternalBIMMixerApp.g:179:1: ( ruleSubcategory EOF )
            // InternalBIMMixerApp.g:180:1: ruleSubcategory EOF
            {
             before(grammarAccess.getSubcategoryRule()); 
            pushFollow(FOLLOW_1);
            ruleSubcategory();

            state._fsp--;

             after(grammarAccess.getSubcategoryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSubcategory"


    // $ANTLR start "ruleSubcategory"
    // InternalBIMMixerApp.g:187:1: ruleSubcategory : ( ( rule__Subcategory__Group__0 ) ) ;
    public final void ruleSubcategory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:191:2: ( ( ( rule__Subcategory__Group__0 ) ) )
            // InternalBIMMixerApp.g:192:2: ( ( rule__Subcategory__Group__0 ) )
            {
            // InternalBIMMixerApp.g:192:2: ( ( rule__Subcategory__Group__0 ) )
            // InternalBIMMixerApp.g:193:3: ( rule__Subcategory__Group__0 )
            {
             before(grammarAccess.getSubcategoryAccess().getGroup()); 
            // InternalBIMMixerApp.g:194:3: ( rule__Subcategory__Group__0 )
            // InternalBIMMixerApp.g:194:4: rule__Subcategory__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Subcategory__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubcategoryAccess().getGroup()); 

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
    // $ANTLR end "ruleSubcategory"


    // $ANTLR start "entryRuleEString"
    // InternalBIMMixerApp.g:203:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalBIMMixerApp.g:204:1: ( ruleEString EOF )
            // InternalBIMMixerApp.g:205:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalBIMMixerApp.g:212:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:216:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalBIMMixerApp.g:217:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalBIMMixerApp.g:217:2: ( ( rule__EString__Alternatives ) )
            // InternalBIMMixerApp.g:218:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalBIMMixerApp.g:219:3: ( rule__EString__Alternatives )
            // InternalBIMMixerApp.g:219:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEFloat"
    // InternalBIMMixerApp.g:228:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalBIMMixerApp.g:229:1: ( ruleEFloat EOF )
            // InternalBIMMixerApp.g:230:1: ruleEFloat EOF
            {
             before(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getEFloatRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalBIMMixerApp.g:237:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:241:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalBIMMixerApp.g:242:2: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalBIMMixerApp.g:242:2: ( ( rule__EFloat__Group__0 ) )
            // InternalBIMMixerApp.g:243:3: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // InternalBIMMixerApp.g:244:3: ( rule__EFloat__Group__0 )
            // InternalBIMMixerApp.g:244:4: rule__EFloat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getGroup()); 

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
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "rule__BIMCertification__Alternatives"
    // InternalBIMMixerApp.g:252:1: rule__BIMCertification__Alternatives : ( ( ruleBreeamCertification ) | ( ruleLEEDCertification ) );
    public final void rule__BIMCertification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:256:1: ( ( ruleBreeamCertification ) | ( ruleLEEDCertification ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            else if ( (LA1_0==20) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalBIMMixerApp.g:257:2: ( ruleBreeamCertification )
                    {
                    // InternalBIMMixerApp.g:257:2: ( ruleBreeamCertification )
                    // InternalBIMMixerApp.g:258:3: ruleBreeamCertification
                    {
                     before(grammarAccess.getBIMCertificationAccess().getBreeamCertificationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBreeamCertification();

                    state._fsp--;

                     after(grammarAccess.getBIMCertificationAccess().getBreeamCertificationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBIMMixerApp.g:263:2: ( ruleLEEDCertification )
                    {
                    // InternalBIMMixerApp.g:263:2: ( ruleLEEDCertification )
                    // InternalBIMMixerApp.g:264:3: ruleLEEDCertification
                    {
                     before(grammarAccess.getBIMCertificationAccess().getLEEDCertificationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLEEDCertification();

                    state._fsp--;

                     after(grammarAccess.getBIMCertificationAccess().getLEEDCertificationParserRuleCall_1()); 

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
    // $ANTLR end "rule__BIMCertification__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalBIMMixerApp.g:273:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:277:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBIMMixerApp.g:278:2: ( RULE_STRING )
                    {
                    // InternalBIMMixerApp.g:278:2: ( RULE_STRING )
                    // InternalBIMMixerApp.g:279:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBIMMixerApp.g:284:2: ( RULE_ID )
                    {
                    // InternalBIMMixerApp.g:284:2: ( RULE_ID )
                    // InternalBIMMixerApp.g:285:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EFloat__Alternatives_4_0"
    // InternalBIMMixerApp.g:294:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:298:1: ( ( 'E' ) | ( 'e' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBIMMixerApp.g:299:2: ( 'E' )
                    {
                    // InternalBIMMixerApp.g:299:2: ( 'E' )
                    // InternalBIMMixerApp.g:300:3: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBIMMixerApp.g:305:2: ( 'e' )
                    {
                    // InternalBIMMixerApp.g:305:2: ( 'e' )
                    // InternalBIMMixerApp.g:306:3: 'e'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 

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
    // $ANTLR end "rule__EFloat__Alternatives_4_0"


    // $ANTLR start "rule__BIMMixerApp__Group__0"
    // InternalBIMMixerApp.g:315:1: rule__BIMMixerApp__Group__0 : rule__BIMMixerApp__Group__0__Impl rule__BIMMixerApp__Group__1 ;
    public final void rule__BIMMixerApp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:319:1: ( rule__BIMMixerApp__Group__0__Impl rule__BIMMixerApp__Group__1 )
            // InternalBIMMixerApp.g:320:2: rule__BIMMixerApp__Group__0__Impl rule__BIMMixerApp__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__BIMMixerApp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BIMMixerApp__Group__1();

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
    // $ANTLR end "rule__BIMMixerApp__Group__0"


    // $ANTLR start "rule__BIMMixerApp__Group__0__Impl"
    // InternalBIMMixerApp.g:327:1: rule__BIMMixerApp__Group__0__Impl : ( () ) ;
    public final void rule__BIMMixerApp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:331:1: ( ( () ) )
            // InternalBIMMixerApp.g:332:1: ( () )
            {
            // InternalBIMMixerApp.g:332:1: ( () )
            // InternalBIMMixerApp.g:333:2: ()
            {
             before(grammarAccess.getBIMMixerAppAccess().getBIMMixerAppAction_0()); 
            // InternalBIMMixerApp.g:334:2: ()
            // InternalBIMMixerApp.g:334:3: 
            {
            }

             after(grammarAccess.getBIMMixerAppAccess().getBIMMixerAppAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMMixerApp__Group__0__Impl"


    // $ANTLR start "rule__BIMMixerApp__Group__1"
    // InternalBIMMixerApp.g:342:1: rule__BIMMixerApp__Group__1 : rule__BIMMixerApp__Group__1__Impl rule__BIMMixerApp__Group__2 ;
    public final void rule__BIMMixerApp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:346:1: ( rule__BIMMixerApp__Group__1__Impl rule__BIMMixerApp__Group__2 )
            // InternalBIMMixerApp.g:347:2: rule__BIMMixerApp__Group__1__Impl rule__BIMMixerApp__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__BIMMixerApp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BIMMixerApp__Group__2();

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
    // $ANTLR end "rule__BIMMixerApp__Group__1"


    // $ANTLR start "rule__BIMMixerApp__Group__1__Impl"
    // InternalBIMMixerApp.g:354:1: rule__BIMMixerApp__Group__1__Impl : ( 'BIMMixerApp' ) ;
    public final void rule__BIMMixerApp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:358:1: ( ( 'BIMMixerApp' ) )
            // InternalBIMMixerApp.g:359:1: ( 'BIMMixerApp' )
            {
            // InternalBIMMixerApp.g:359:1: ( 'BIMMixerApp' )
            // InternalBIMMixerApp.g:360:2: 'BIMMixerApp'
            {
             before(grammarAccess.getBIMMixerAppAccess().getBIMMixerAppKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getBIMMixerAppAccess().getBIMMixerAppKeyword_1()); 

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
    // $ANTLR end "rule__BIMMixerApp__Group__1__Impl"


    // $ANTLR start "rule__BIMMixerApp__Group__2"
    // InternalBIMMixerApp.g:369:1: rule__BIMMixerApp__Group__2 : rule__BIMMixerApp__Group__2__Impl rule__BIMMixerApp__Group__3 ;
    public final void rule__BIMMixerApp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:373:1: ( rule__BIMMixerApp__Group__2__Impl rule__BIMMixerApp__Group__3 )
            // InternalBIMMixerApp.g:374:2: rule__BIMMixerApp__Group__2__Impl rule__BIMMixerApp__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__BIMMixerApp__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BIMMixerApp__Group__3();

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
    // $ANTLR end "rule__BIMMixerApp__Group__2"


    // $ANTLR start "rule__BIMMixerApp__Group__2__Impl"
    // InternalBIMMixerApp.g:381:1: rule__BIMMixerApp__Group__2__Impl : ( ( rule__BIMMixerApp__NameAssignment_2 ) ) ;
    public final void rule__BIMMixerApp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:385:1: ( ( ( rule__BIMMixerApp__NameAssignment_2 ) ) )
            // InternalBIMMixerApp.g:386:1: ( ( rule__BIMMixerApp__NameAssignment_2 ) )
            {
            // InternalBIMMixerApp.g:386:1: ( ( rule__BIMMixerApp__NameAssignment_2 ) )
            // InternalBIMMixerApp.g:387:2: ( rule__BIMMixerApp__NameAssignment_2 )
            {
             before(grammarAccess.getBIMMixerAppAccess().getNameAssignment_2()); 
            // InternalBIMMixerApp.g:388:2: ( rule__BIMMixerApp__NameAssignment_2 )
            // InternalBIMMixerApp.g:388:3: rule__BIMMixerApp__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BIMMixerApp__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBIMMixerAppAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__BIMMixerApp__Group__2__Impl"


    // $ANTLR start "rule__BIMMixerApp__Group__3"
    // InternalBIMMixerApp.g:396:1: rule__BIMMixerApp__Group__3 : rule__BIMMixerApp__Group__3__Impl rule__BIMMixerApp__Group__4 ;
    public final void rule__BIMMixerApp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:400:1: ( rule__BIMMixerApp__Group__3__Impl rule__BIMMixerApp__Group__4 )
            // InternalBIMMixerApp.g:401:2: rule__BIMMixerApp__Group__3__Impl rule__BIMMixerApp__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__BIMMixerApp__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BIMMixerApp__Group__4();

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
    // $ANTLR end "rule__BIMMixerApp__Group__3"


    // $ANTLR start "rule__BIMMixerApp__Group__3__Impl"
    // InternalBIMMixerApp.g:408:1: rule__BIMMixerApp__Group__3__Impl : ( ':' ) ;
    public final void rule__BIMMixerApp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:412:1: ( ( ':' ) )
            // InternalBIMMixerApp.g:413:1: ( ':' )
            {
            // InternalBIMMixerApp.g:413:1: ( ':' )
            // InternalBIMMixerApp.g:414:2: ':'
            {
             before(grammarAccess.getBIMMixerAppAccess().getColonKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBIMMixerAppAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__BIMMixerApp__Group__3__Impl"


    // $ANTLR start "rule__BIMMixerApp__Group__4"
    // InternalBIMMixerApp.g:423:1: rule__BIMMixerApp__Group__4 : rule__BIMMixerApp__Group__4__Impl ;
    public final void rule__BIMMixerApp__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:427:1: ( rule__BIMMixerApp__Group__4__Impl )
            // InternalBIMMixerApp.g:428:2: rule__BIMMixerApp__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BIMMixerApp__Group__4__Impl();

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
    // $ANTLR end "rule__BIMMixerApp__Group__4"


    // $ANTLR start "rule__BIMMixerApp__Group__4__Impl"
    // InternalBIMMixerApp.g:434:1: rule__BIMMixerApp__Group__4__Impl : ( ( rule__BIMMixerApp__Group_4__0 )? ) ;
    public final void rule__BIMMixerApp__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:438:1: ( ( ( rule__BIMMixerApp__Group_4__0 )? ) )
            // InternalBIMMixerApp.g:439:1: ( ( rule__BIMMixerApp__Group_4__0 )? )
            {
            // InternalBIMMixerApp.g:439:1: ( ( rule__BIMMixerApp__Group_4__0 )? )
            // InternalBIMMixerApp.g:440:2: ( rule__BIMMixerApp__Group_4__0 )?
            {
             before(grammarAccess.getBIMMixerAppAccess().getGroup_4()); 
            // InternalBIMMixerApp.g:441:2: ( rule__BIMMixerApp__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15||LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalBIMMixerApp.g:441:3: rule__BIMMixerApp__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BIMMixerApp__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBIMMixerAppAccess().getGroup_4()); 

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
    // $ANTLR end "rule__BIMMixerApp__Group__4__Impl"


    // $ANTLR start "rule__BIMMixerApp__Group_4__0"
    // InternalBIMMixerApp.g:450:1: rule__BIMMixerApp__Group_4__0 : rule__BIMMixerApp__Group_4__0__Impl rule__BIMMixerApp__Group_4__1 ;
    public final void rule__BIMMixerApp__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:454:1: ( rule__BIMMixerApp__Group_4__0__Impl rule__BIMMixerApp__Group_4__1 )
            // InternalBIMMixerApp.g:455:2: rule__BIMMixerApp__Group_4__0__Impl rule__BIMMixerApp__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__BIMMixerApp__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BIMMixerApp__Group_4__1();

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
    // $ANTLR end "rule__BIMMixerApp__Group_4__0"


    // $ANTLR start "rule__BIMMixerApp__Group_4__0__Impl"
    // InternalBIMMixerApp.g:462:1: rule__BIMMixerApp__Group_4__0__Impl : ( ( rule__BIMMixerApp__CertificationsAssignment_4_0 ) ) ;
    public final void rule__BIMMixerApp__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:466:1: ( ( ( rule__BIMMixerApp__CertificationsAssignment_4_0 ) ) )
            // InternalBIMMixerApp.g:467:1: ( ( rule__BIMMixerApp__CertificationsAssignment_4_0 ) )
            {
            // InternalBIMMixerApp.g:467:1: ( ( rule__BIMMixerApp__CertificationsAssignment_4_0 ) )
            // InternalBIMMixerApp.g:468:2: ( rule__BIMMixerApp__CertificationsAssignment_4_0 )
            {
             before(grammarAccess.getBIMMixerAppAccess().getCertificationsAssignment_4_0()); 
            // InternalBIMMixerApp.g:469:2: ( rule__BIMMixerApp__CertificationsAssignment_4_0 )
            // InternalBIMMixerApp.g:469:3: rule__BIMMixerApp__CertificationsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__BIMMixerApp__CertificationsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getBIMMixerAppAccess().getCertificationsAssignment_4_0()); 

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
    // $ANTLR end "rule__BIMMixerApp__Group_4__0__Impl"


    // $ANTLR start "rule__BIMMixerApp__Group_4__1"
    // InternalBIMMixerApp.g:477:1: rule__BIMMixerApp__Group_4__1 : rule__BIMMixerApp__Group_4__1__Impl ;
    public final void rule__BIMMixerApp__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:481:1: ( rule__BIMMixerApp__Group_4__1__Impl )
            // InternalBIMMixerApp.g:482:2: rule__BIMMixerApp__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BIMMixerApp__Group_4__1__Impl();

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
    // $ANTLR end "rule__BIMMixerApp__Group_4__1"


    // $ANTLR start "rule__BIMMixerApp__Group_4__1__Impl"
    // InternalBIMMixerApp.g:488:1: rule__BIMMixerApp__Group_4__1__Impl : ( ( rule__BIMMixerApp__CertificationsAssignment_4_1 )* ) ;
    public final void rule__BIMMixerApp__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:492:1: ( ( ( rule__BIMMixerApp__CertificationsAssignment_4_1 )* ) )
            // InternalBIMMixerApp.g:493:1: ( ( rule__BIMMixerApp__CertificationsAssignment_4_1 )* )
            {
            // InternalBIMMixerApp.g:493:1: ( ( rule__BIMMixerApp__CertificationsAssignment_4_1 )* )
            // InternalBIMMixerApp.g:494:2: ( rule__BIMMixerApp__CertificationsAssignment_4_1 )*
            {
             before(grammarAccess.getBIMMixerAppAccess().getCertificationsAssignment_4_1()); 
            // InternalBIMMixerApp.g:495:2: ( rule__BIMMixerApp__CertificationsAssignment_4_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15||LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBIMMixerApp.g:495:3: rule__BIMMixerApp__CertificationsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BIMMixerApp__CertificationsAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getBIMMixerAppAccess().getCertificationsAssignment_4_1()); 

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
    // $ANTLR end "rule__BIMMixerApp__Group_4__1__Impl"


    // $ANTLR start "rule__BreeamCertification__Group__0"
    // InternalBIMMixerApp.g:504:1: rule__BreeamCertification__Group__0 : rule__BreeamCertification__Group__0__Impl rule__BreeamCertification__Group__1 ;
    public final void rule__BreeamCertification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:508:1: ( rule__BreeamCertification__Group__0__Impl rule__BreeamCertification__Group__1 )
            // InternalBIMMixerApp.g:509:2: rule__BreeamCertification__Group__0__Impl rule__BreeamCertification__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__BreeamCertification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BreeamCertification__Group__1();

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
    // $ANTLR end "rule__BreeamCertification__Group__0"


    // $ANTLR start "rule__BreeamCertification__Group__0__Impl"
    // InternalBIMMixerApp.g:516:1: rule__BreeamCertification__Group__0__Impl : ( 'BreeamCertification' ) ;
    public final void rule__BreeamCertification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:520:1: ( ( 'BreeamCertification' ) )
            // InternalBIMMixerApp.g:521:1: ( 'BreeamCertification' )
            {
            // InternalBIMMixerApp.g:521:1: ( 'BreeamCertification' )
            // InternalBIMMixerApp.g:522:2: 'BreeamCertification'
            {
             before(grammarAccess.getBreeamCertificationAccess().getBreeamCertificationKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getBreeamCertificationAccess().getBreeamCertificationKeyword_0()); 

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
    // $ANTLR end "rule__BreeamCertification__Group__0__Impl"


    // $ANTLR start "rule__BreeamCertification__Group__1"
    // InternalBIMMixerApp.g:531:1: rule__BreeamCertification__Group__1 : rule__BreeamCertification__Group__1__Impl rule__BreeamCertification__Group__2 ;
    public final void rule__BreeamCertification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:535:1: ( rule__BreeamCertification__Group__1__Impl rule__BreeamCertification__Group__2 )
            // InternalBIMMixerApp.g:536:2: rule__BreeamCertification__Group__1__Impl rule__BreeamCertification__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__BreeamCertification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BreeamCertification__Group__2();

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
    // $ANTLR end "rule__BreeamCertification__Group__1"


    // $ANTLR start "rule__BreeamCertification__Group__1__Impl"
    // InternalBIMMixerApp.g:543:1: rule__BreeamCertification__Group__1__Impl : ( ( rule__BreeamCertification__NameAssignment_1 ) ) ;
    public final void rule__BreeamCertification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:547:1: ( ( ( rule__BreeamCertification__NameAssignment_1 ) ) )
            // InternalBIMMixerApp.g:548:1: ( ( rule__BreeamCertification__NameAssignment_1 ) )
            {
            // InternalBIMMixerApp.g:548:1: ( ( rule__BreeamCertification__NameAssignment_1 ) )
            // InternalBIMMixerApp.g:549:2: ( rule__BreeamCertification__NameAssignment_1 )
            {
             before(grammarAccess.getBreeamCertificationAccess().getNameAssignment_1()); 
            // InternalBIMMixerApp.g:550:2: ( rule__BreeamCertification__NameAssignment_1 )
            // InternalBIMMixerApp.g:550:3: rule__BreeamCertification__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BreeamCertification__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBreeamCertificationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__BreeamCertification__Group__1__Impl"


    // $ANTLR start "rule__BreeamCertification__Group__2"
    // InternalBIMMixerApp.g:558:1: rule__BreeamCertification__Group__2 : rule__BreeamCertification__Group__2__Impl rule__BreeamCertification__Group__3 ;
    public final void rule__BreeamCertification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:562:1: ( rule__BreeamCertification__Group__2__Impl rule__BreeamCertification__Group__3 )
            // InternalBIMMixerApp.g:563:2: rule__BreeamCertification__Group__2__Impl rule__BreeamCertification__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__BreeamCertification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BreeamCertification__Group__3();

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
    // $ANTLR end "rule__BreeamCertification__Group__2"


    // $ANTLR start "rule__BreeamCertification__Group__2__Impl"
    // InternalBIMMixerApp.g:570:1: rule__BreeamCertification__Group__2__Impl : ( '{' ) ;
    public final void rule__BreeamCertification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:574:1: ( ( '{' ) )
            // InternalBIMMixerApp.g:575:1: ( '{' )
            {
            // InternalBIMMixerApp.g:575:1: ( '{' )
            // InternalBIMMixerApp.g:576:2: '{'
            {
             before(grammarAccess.getBreeamCertificationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getBreeamCertificationAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__BreeamCertification__Group__2__Impl"


    // $ANTLR start "rule__BreeamCertification__Group__3"
    // InternalBIMMixerApp.g:585:1: rule__BreeamCertification__Group__3 : rule__BreeamCertification__Group__3__Impl rule__BreeamCertification__Group__4 ;
    public final void rule__BreeamCertification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:589:1: ( rule__BreeamCertification__Group__3__Impl rule__BreeamCertification__Group__4 )
            // InternalBIMMixerApp.g:590:2: rule__BreeamCertification__Group__3__Impl rule__BreeamCertification__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__BreeamCertification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BreeamCertification__Group__4();

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
    // $ANTLR end "rule__BreeamCertification__Group__3"


    // $ANTLR start "rule__BreeamCertification__Group__3__Impl"
    // InternalBIMMixerApp.g:597:1: rule__BreeamCertification__Group__3__Impl : ( ( rule__BreeamCertification__CategoriesAssignment_3 ) ) ;
    public final void rule__BreeamCertification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:601:1: ( ( ( rule__BreeamCertification__CategoriesAssignment_3 ) ) )
            // InternalBIMMixerApp.g:602:1: ( ( rule__BreeamCertification__CategoriesAssignment_3 ) )
            {
            // InternalBIMMixerApp.g:602:1: ( ( rule__BreeamCertification__CategoriesAssignment_3 ) )
            // InternalBIMMixerApp.g:603:2: ( rule__BreeamCertification__CategoriesAssignment_3 )
            {
             before(grammarAccess.getBreeamCertificationAccess().getCategoriesAssignment_3()); 
            // InternalBIMMixerApp.g:604:2: ( rule__BreeamCertification__CategoriesAssignment_3 )
            // InternalBIMMixerApp.g:604:3: rule__BreeamCertification__CategoriesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BreeamCertification__CategoriesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBreeamCertificationAccess().getCategoriesAssignment_3()); 

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
    // $ANTLR end "rule__BreeamCertification__Group__3__Impl"


    // $ANTLR start "rule__BreeamCertification__Group__4"
    // InternalBIMMixerApp.g:612:1: rule__BreeamCertification__Group__4 : rule__BreeamCertification__Group__4__Impl rule__BreeamCertification__Group__5 ;
    public final void rule__BreeamCertification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:616:1: ( rule__BreeamCertification__Group__4__Impl rule__BreeamCertification__Group__5 )
            // InternalBIMMixerApp.g:617:2: rule__BreeamCertification__Group__4__Impl rule__BreeamCertification__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__BreeamCertification__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BreeamCertification__Group__5();

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
    // $ANTLR end "rule__BreeamCertification__Group__4"


    // $ANTLR start "rule__BreeamCertification__Group__4__Impl"
    // InternalBIMMixerApp.g:624:1: rule__BreeamCertification__Group__4__Impl : ( ( rule__BreeamCertification__Group_4__0 )* ) ;
    public final void rule__BreeamCertification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:628:1: ( ( ( rule__BreeamCertification__Group_4__0 )* ) )
            // InternalBIMMixerApp.g:629:1: ( ( rule__BreeamCertification__Group_4__0 )* )
            {
            // InternalBIMMixerApp.g:629:1: ( ( rule__BreeamCertification__Group_4__0 )* )
            // InternalBIMMixerApp.g:630:2: ( rule__BreeamCertification__Group_4__0 )*
            {
             before(grammarAccess.getBreeamCertificationAccess().getGroup_4()); 
            // InternalBIMMixerApp.g:631:2: ( rule__BreeamCertification__Group_4__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBIMMixerApp.g:631:3: rule__BreeamCertification__Group_4__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__BreeamCertification__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getBreeamCertificationAccess().getGroup_4()); 

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
    // $ANTLR end "rule__BreeamCertification__Group__4__Impl"


    // $ANTLR start "rule__BreeamCertification__Group__5"
    // InternalBIMMixerApp.g:639:1: rule__BreeamCertification__Group__5 : rule__BreeamCertification__Group__5__Impl rule__BreeamCertification__Group__6 ;
    public final void rule__BreeamCertification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:643:1: ( rule__BreeamCertification__Group__5__Impl rule__BreeamCertification__Group__6 )
            // InternalBIMMixerApp.g:644:2: rule__BreeamCertification__Group__5__Impl rule__BreeamCertification__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__BreeamCertification__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BreeamCertification__Group__6();

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
    // $ANTLR end "rule__BreeamCertification__Group__5"


    // $ANTLR start "rule__BreeamCertification__Group__5__Impl"
    // InternalBIMMixerApp.g:651:1: rule__BreeamCertification__Group__5__Impl : ( ( rule__BreeamCertification__Group_5__0 )? ) ;
    public final void rule__BreeamCertification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:655:1: ( ( ( rule__BreeamCertification__Group_5__0 )? ) )
            // InternalBIMMixerApp.g:656:1: ( ( rule__BreeamCertification__Group_5__0 )? )
            {
            // InternalBIMMixerApp.g:656:1: ( ( rule__BreeamCertification__Group_5__0 )? )
            // InternalBIMMixerApp.g:657:2: ( rule__BreeamCertification__Group_5__0 )?
            {
             before(grammarAccess.getBreeamCertificationAccess().getGroup_5()); 
            // InternalBIMMixerApp.g:658:2: ( rule__BreeamCertification__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBIMMixerApp.g:658:3: rule__BreeamCertification__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BreeamCertification__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBreeamCertificationAccess().getGroup_5()); 

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
    // $ANTLR end "rule__BreeamCertification__Group__5__Impl"


    // $ANTLR start "rule__BreeamCertification__Group__6"
    // InternalBIMMixerApp.g:666:1: rule__BreeamCertification__Group__6 : rule__BreeamCertification__Group__6__Impl ;
    public final void rule__BreeamCertification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:670:1: ( rule__BreeamCertification__Group__6__Impl )
            // InternalBIMMixerApp.g:671:2: rule__BreeamCertification__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BreeamCertification__Group__6__Impl();

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
    // $ANTLR end "rule__BreeamCertification__Group__6"


    // $ANTLR start "rule__BreeamCertification__Group__6__Impl"
    // InternalBIMMixerApp.g:677:1: rule__BreeamCertification__Group__6__Impl : ( '}' ) ;
    public final void rule__BreeamCertification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:681:1: ( ( '}' ) )
            // InternalBIMMixerApp.g:682:1: ( '}' )
            {
            // InternalBIMMixerApp.g:682:1: ( '}' )
            // InternalBIMMixerApp.g:683:2: '}'
            {
             before(grammarAccess.getBreeamCertificationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBreeamCertificationAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__BreeamCertification__Group__6__Impl"


    // $ANTLR start "rule__BreeamCertification__Group_4__0"
    // InternalBIMMixerApp.g:693:1: rule__BreeamCertification__Group_4__0 : rule__BreeamCertification__Group_4__0__Impl rule__BreeamCertification__Group_4__1 ;
    public final void rule__BreeamCertification__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:697:1: ( rule__BreeamCertification__Group_4__0__Impl rule__BreeamCertification__Group_4__1 )
            // InternalBIMMixerApp.g:698:2: rule__BreeamCertification__Group_4__0__Impl rule__BreeamCertification__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__BreeamCertification__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BreeamCertification__Group_4__1();

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
    // $ANTLR end "rule__BreeamCertification__Group_4__0"


    // $ANTLR start "rule__BreeamCertification__Group_4__0__Impl"
    // InternalBIMMixerApp.g:705:1: rule__BreeamCertification__Group_4__0__Impl : ( ',' ) ;
    public final void rule__BreeamCertification__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:709:1: ( ( ',' ) )
            // InternalBIMMixerApp.g:710:1: ( ',' )
            {
            // InternalBIMMixerApp.g:710:1: ( ',' )
            // InternalBIMMixerApp.g:711:2: ','
            {
             before(grammarAccess.getBreeamCertificationAccess().getCommaKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBreeamCertificationAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__BreeamCertification__Group_4__0__Impl"


    // $ANTLR start "rule__BreeamCertification__Group_4__1"
    // InternalBIMMixerApp.g:720:1: rule__BreeamCertification__Group_4__1 : rule__BreeamCertification__Group_4__1__Impl ;
    public final void rule__BreeamCertification__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:724:1: ( rule__BreeamCertification__Group_4__1__Impl )
            // InternalBIMMixerApp.g:725:2: rule__BreeamCertification__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BreeamCertification__Group_4__1__Impl();

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
    // $ANTLR end "rule__BreeamCertification__Group_4__1"


    // $ANTLR start "rule__BreeamCertification__Group_4__1__Impl"
    // InternalBIMMixerApp.g:731:1: rule__BreeamCertification__Group_4__1__Impl : ( ( rule__BreeamCertification__CategoriesAssignment_4_1 ) ) ;
    public final void rule__BreeamCertification__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:735:1: ( ( ( rule__BreeamCertification__CategoriesAssignment_4_1 ) ) )
            // InternalBIMMixerApp.g:736:1: ( ( rule__BreeamCertification__CategoriesAssignment_4_1 ) )
            {
            // InternalBIMMixerApp.g:736:1: ( ( rule__BreeamCertification__CategoriesAssignment_4_1 ) )
            // InternalBIMMixerApp.g:737:2: ( rule__BreeamCertification__CategoriesAssignment_4_1 )
            {
             before(grammarAccess.getBreeamCertificationAccess().getCategoriesAssignment_4_1()); 
            // InternalBIMMixerApp.g:738:2: ( rule__BreeamCertification__CategoriesAssignment_4_1 )
            // InternalBIMMixerApp.g:738:3: rule__BreeamCertification__CategoriesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__BreeamCertification__CategoriesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBreeamCertificationAccess().getCategoriesAssignment_4_1()); 

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
    // $ANTLR end "rule__BreeamCertification__Group_4__1__Impl"


    // $ANTLR start "rule__BreeamCertification__Group_5__0"
    // InternalBIMMixerApp.g:747:1: rule__BreeamCertification__Group_5__0 : rule__BreeamCertification__Group_5__0__Impl rule__BreeamCertification__Group_5__1 ;
    public final void rule__BreeamCertification__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:751:1: ( rule__BreeamCertification__Group_5__0__Impl rule__BreeamCertification__Group_5__1 )
            // InternalBIMMixerApp.g:752:2: rule__BreeamCertification__Group_5__0__Impl rule__BreeamCertification__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__BreeamCertification__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BreeamCertification__Group_5__1();

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
    // $ANTLR end "rule__BreeamCertification__Group_5__0"


    // $ANTLR start "rule__BreeamCertification__Group_5__0__Impl"
    // InternalBIMMixerApp.g:759:1: rule__BreeamCertification__Group_5__0__Impl : ( 'connectedCertification:' ) ;
    public final void rule__BreeamCertification__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:763:1: ( ( 'connectedCertification:' ) )
            // InternalBIMMixerApp.g:764:1: ( 'connectedCertification:' )
            {
            // InternalBIMMixerApp.g:764:1: ( 'connectedCertification:' )
            // InternalBIMMixerApp.g:765:2: 'connectedCertification:'
            {
             before(grammarAccess.getBreeamCertificationAccess().getConnectedCertificationKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBreeamCertificationAccess().getConnectedCertificationKeyword_5_0()); 

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
    // $ANTLR end "rule__BreeamCertification__Group_5__0__Impl"


    // $ANTLR start "rule__BreeamCertification__Group_5__1"
    // InternalBIMMixerApp.g:774:1: rule__BreeamCertification__Group_5__1 : rule__BreeamCertification__Group_5__1__Impl ;
    public final void rule__BreeamCertification__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:778:1: ( rule__BreeamCertification__Group_5__1__Impl )
            // InternalBIMMixerApp.g:779:2: rule__BreeamCertification__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BreeamCertification__Group_5__1__Impl();

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
    // $ANTLR end "rule__BreeamCertification__Group_5__1"


    // $ANTLR start "rule__BreeamCertification__Group_5__1__Impl"
    // InternalBIMMixerApp.g:785:1: rule__BreeamCertification__Group_5__1__Impl : ( ( rule__BreeamCertification__ConnectedCertificationAssignment_5_1 ) ) ;
    public final void rule__BreeamCertification__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:789:1: ( ( ( rule__BreeamCertification__ConnectedCertificationAssignment_5_1 ) ) )
            // InternalBIMMixerApp.g:790:1: ( ( rule__BreeamCertification__ConnectedCertificationAssignment_5_1 ) )
            {
            // InternalBIMMixerApp.g:790:1: ( ( rule__BreeamCertification__ConnectedCertificationAssignment_5_1 ) )
            // InternalBIMMixerApp.g:791:2: ( rule__BreeamCertification__ConnectedCertificationAssignment_5_1 )
            {
             before(grammarAccess.getBreeamCertificationAccess().getConnectedCertificationAssignment_5_1()); 
            // InternalBIMMixerApp.g:792:2: ( rule__BreeamCertification__ConnectedCertificationAssignment_5_1 )
            // InternalBIMMixerApp.g:792:3: rule__BreeamCertification__ConnectedCertificationAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__BreeamCertification__ConnectedCertificationAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getBreeamCertificationAccess().getConnectedCertificationAssignment_5_1()); 

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
    // $ANTLR end "rule__BreeamCertification__Group_5__1__Impl"


    // $ANTLR start "rule__LEEDCertification__Group__0"
    // InternalBIMMixerApp.g:801:1: rule__LEEDCertification__Group__0 : rule__LEEDCertification__Group__0__Impl rule__LEEDCertification__Group__1 ;
    public final void rule__LEEDCertification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:805:1: ( rule__LEEDCertification__Group__0__Impl rule__LEEDCertification__Group__1 )
            // InternalBIMMixerApp.g:806:2: rule__LEEDCertification__Group__0__Impl rule__LEEDCertification__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__LEEDCertification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LEEDCertification__Group__1();

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
    // $ANTLR end "rule__LEEDCertification__Group__0"


    // $ANTLR start "rule__LEEDCertification__Group__0__Impl"
    // InternalBIMMixerApp.g:813:1: rule__LEEDCertification__Group__0__Impl : ( 'LEEDCertification' ) ;
    public final void rule__LEEDCertification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:817:1: ( ( 'LEEDCertification' ) )
            // InternalBIMMixerApp.g:818:1: ( 'LEEDCertification' )
            {
            // InternalBIMMixerApp.g:818:1: ( 'LEEDCertification' )
            // InternalBIMMixerApp.g:819:2: 'LEEDCertification'
            {
             before(grammarAccess.getLEEDCertificationAccess().getLEEDCertificationKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLEEDCertificationAccess().getLEEDCertificationKeyword_0()); 

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
    // $ANTLR end "rule__LEEDCertification__Group__0__Impl"


    // $ANTLR start "rule__LEEDCertification__Group__1"
    // InternalBIMMixerApp.g:828:1: rule__LEEDCertification__Group__1 : rule__LEEDCertification__Group__1__Impl rule__LEEDCertification__Group__2 ;
    public final void rule__LEEDCertification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:832:1: ( rule__LEEDCertification__Group__1__Impl rule__LEEDCertification__Group__2 )
            // InternalBIMMixerApp.g:833:2: rule__LEEDCertification__Group__1__Impl rule__LEEDCertification__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__LEEDCertification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LEEDCertification__Group__2();

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
    // $ANTLR end "rule__LEEDCertification__Group__1"


    // $ANTLR start "rule__LEEDCertification__Group__1__Impl"
    // InternalBIMMixerApp.g:840:1: rule__LEEDCertification__Group__1__Impl : ( ( rule__LEEDCertification__NameAssignment_1 ) ) ;
    public final void rule__LEEDCertification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:844:1: ( ( ( rule__LEEDCertification__NameAssignment_1 ) ) )
            // InternalBIMMixerApp.g:845:1: ( ( rule__LEEDCertification__NameAssignment_1 ) )
            {
            // InternalBIMMixerApp.g:845:1: ( ( rule__LEEDCertification__NameAssignment_1 ) )
            // InternalBIMMixerApp.g:846:2: ( rule__LEEDCertification__NameAssignment_1 )
            {
             before(grammarAccess.getLEEDCertificationAccess().getNameAssignment_1()); 
            // InternalBIMMixerApp.g:847:2: ( rule__LEEDCertification__NameAssignment_1 )
            // InternalBIMMixerApp.g:847:3: rule__LEEDCertification__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LEEDCertification__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLEEDCertificationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__LEEDCertification__Group__1__Impl"


    // $ANTLR start "rule__LEEDCertification__Group__2"
    // InternalBIMMixerApp.g:855:1: rule__LEEDCertification__Group__2 : rule__LEEDCertification__Group__2__Impl rule__LEEDCertification__Group__3 ;
    public final void rule__LEEDCertification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:859:1: ( rule__LEEDCertification__Group__2__Impl rule__LEEDCertification__Group__3 )
            // InternalBIMMixerApp.g:860:2: rule__LEEDCertification__Group__2__Impl rule__LEEDCertification__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__LEEDCertification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LEEDCertification__Group__3();

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
    // $ANTLR end "rule__LEEDCertification__Group__2"


    // $ANTLR start "rule__LEEDCertification__Group__2__Impl"
    // InternalBIMMixerApp.g:867:1: rule__LEEDCertification__Group__2__Impl : ( '{' ) ;
    public final void rule__LEEDCertification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:871:1: ( ( '{' ) )
            // InternalBIMMixerApp.g:872:1: ( '{' )
            {
            // InternalBIMMixerApp.g:872:1: ( '{' )
            // InternalBIMMixerApp.g:873:2: '{'
            {
             before(grammarAccess.getLEEDCertificationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLEEDCertificationAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__LEEDCertification__Group__2__Impl"


    // $ANTLR start "rule__LEEDCertification__Group__3"
    // InternalBIMMixerApp.g:882:1: rule__LEEDCertification__Group__3 : rule__LEEDCertification__Group__3__Impl rule__LEEDCertification__Group__4 ;
    public final void rule__LEEDCertification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:886:1: ( rule__LEEDCertification__Group__3__Impl rule__LEEDCertification__Group__4 )
            // InternalBIMMixerApp.g:887:2: rule__LEEDCertification__Group__3__Impl rule__LEEDCertification__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__LEEDCertification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LEEDCertification__Group__4();

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
    // $ANTLR end "rule__LEEDCertification__Group__3"


    // $ANTLR start "rule__LEEDCertification__Group__3__Impl"
    // InternalBIMMixerApp.g:894:1: rule__LEEDCertification__Group__3__Impl : ( ( rule__LEEDCertification__CategoriesAssignment_3 ) ) ;
    public final void rule__LEEDCertification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:898:1: ( ( ( rule__LEEDCertification__CategoriesAssignment_3 ) ) )
            // InternalBIMMixerApp.g:899:1: ( ( rule__LEEDCertification__CategoriesAssignment_3 ) )
            {
            // InternalBIMMixerApp.g:899:1: ( ( rule__LEEDCertification__CategoriesAssignment_3 ) )
            // InternalBIMMixerApp.g:900:2: ( rule__LEEDCertification__CategoriesAssignment_3 )
            {
             before(grammarAccess.getLEEDCertificationAccess().getCategoriesAssignment_3()); 
            // InternalBIMMixerApp.g:901:2: ( rule__LEEDCertification__CategoriesAssignment_3 )
            // InternalBIMMixerApp.g:901:3: rule__LEEDCertification__CategoriesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LEEDCertification__CategoriesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLEEDCertificationAccess().getCategoriesAssignment_3()); 

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
    // $ANTLR end "rule__LEEDCertification__Group__3__Impl"


    // $ANTLR start "rule__LEEDCertification__Group__4"
    // InternalBIMMixerApp.g:909:1: rule__LEEDCertification__Group__4 : rule__LEEDCertification__Group__4__Impl rule__LEEDCertification__Group__5 ;
    public final void rule__LEEDCertification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:913:1: ( rule__LEEDCertification__Group__4__Impl rule__LEEDCertification__Group__5 )
            // InternalBIMMixerApp.g:914:2: rule__LEEDCertification__Group__4__Impl rule__LEEDCertification__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__LEEDCertification__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LEEDCertification__Group__5();

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
    // $ANTLR end "rule__LEEDCertification__Group__4"


    // $ANTLR start "rule__LEEDCertification__Group__4__Impl"
    // InternalBIMMixerApp.g:921:1: rule__LEEDCertification__Group__4__Impl : ( ( rule__LEEDCertification__Group_4__0 )* ) ;
    public final void rule__LEEDCertification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:925:1: ( ( ( rule__LEEDCertification__Group_4__0 )* ) )
            // InternalBIMMixerApp.g:926:1: ( ( rule__LEEDCertification__Group_4__0 )* )
            {
            // InternalBIMMixerApp.g:926:1: ( ( rule__LEEDCertification__Group_4__0 )* )
            // InternalBIMMixerApp.g:927:2: ( rule__LEEDCertification__Group_4__0 )*
            {
             before(grammarAccess.getLEEDCertificationAccess().getGroup_4()); 
            // InternalBIMMixerApp.g:928:2: ( rule__LEEDCertification__Group_4__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBIMMixerApp.g:928:3: rule__LEEDCertification__Group_4__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__LEEDCertification__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getLEEDCertificationAccess().getGroup_4()); 

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
    // $ANTLR end "rule__LEEDCertification__Group__4__Impl"


    // $ANTLR start "rule__LEEDCertification__Group__5"
    // InternalBIMMixerApp.g:936:1: rule__LEEDCertification__Group__5 : rule__LEEDCertification__Group__5__Impl rule__LEEDCertification__Group__6 ;
    public final void rule__LEEDCertification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:940:1: ( rule__LEEDCertification__Group__5__Impl rule__LEEDCertification__Group__6 )
            // InternalBIMMixerApp.g:941:2: rule__LEEDCertification__Group__5__Impl rule__LEEDCertification__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__LEEDCertification__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LEEDCertification__Group__6();

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
    // $ANTLR end "rule__LEEDCertification__Group__5"


    // $ANTLR start "rule__LEEDCertification__Group__5__Impl"
    // InternalBIMMixerApp.g:948:1: rule__LEEDCertification__Group__5__Impl : ( ( rule__LEEDCertification__Group_5__0 )? ) ;
    public final void rule__LEEDCertification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:952:1: ( ( ( rule__LEEDCertification__Group_5__0 )? ) )
            // InternalBIMMixerApp.g:953:1: ( ( rule__LEEDCertification__Group_5__0 )? )
            {
            // InternalBIMMixerApp.g:953:1: ( ( rule__LEEDCertification__Group_5__0 )? )
            // InternalBIMMixerApp.g:954:2: ( rule__LEEDCertification__Group_5__0 )?
            {
             before(grammarAccess.getLEEDCertificationAccess().getGroup_5()); 
            // InternalBIMMixerApp.g:955:2: ( rule__LEEDCertification__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBIMMixerApp.g:955:3: rule__LEEDCertification__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LEEDCertification__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLEEDCertificationAccess().getGroup_5()); 

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
    // $ANTLR end "rule__LEEDCertification__Group__5__Impl"


    // $ANTLR start "rule__LEEDCertification__Group__6"
    // InternalBIMMixerApp.g:963:1: rule__LEEDCertification__Group__6 : rule__LEEDCertification__Group__6__Impl ;
    public final void rule__LEEDCertification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:967:1: ( rule__LEEDCertification__Group__6__Impl )
            // InternalBIMMixerApp.g:968:2: rule__LEEDCertification__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LEEDCertification__Group__6__Impl();

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
    // $ANTLR end "rule__LEEDCertification__Group__6"


    // $ANTLR start "rule__LEEDCertification__Group__6__Impl"
    // InternalBIMMixerApp.g:974:1: rule__LEEDCertification__Group__6__Impl : ( '}' ) ;
    public final void rule__LEEDCertification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:978:1: ( ( '}' ) )
            // InternalBIMMixerApp.g:979:1: ( '}' )
            {
            // InternalBIMMixerApp.g:979:1: ( '}' )
            // InternalBIMMixerApp.g:980:2: '}'
            {
             before(grammarAccess.getLEEDCertificationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLEEDCertificationAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__LEEDCertification__Group__6__Impl"


    // $ANTLR start "rule__LEEDCertification__Group_4__0"
    // InternalBIMMixerApp.g:990:1: rule__LEEDCertification__Group_4__0 : rule__LEEDCertification__Group_4__0__Impl rule__LEEDCertification__Group_4__1 ;
    public final void rule__LEEDCertification__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:994:1: ( rule__LEEDCertification__Group_4__0__Impl rule__LEEDCertification__Group_4__1 )
            // InternalBIMMixerApp.g:995:2: rule__LEEDCertification__Group_4__0__Impl rule__LEEDCertification__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__LEEDCertification__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LEEDCertification__Group_4__1();

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
    // $ANTLR end "rule__LEEDCertification__Group_4__0"


    // $ANTLR start "rule__LEEDCertification__Group_4__0__Impl"
    // InternalBIMMixerApp.g:1002:1: rule__LEEDCertification__Group_4__0__Impl : ( ',' ) ;
    public final void rule__LEEDCertification__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1006:1: ( ( ',' ) )
            // InternalBIMMixerApp.g:1007:1: ( ',' )
            {
            // InternalBIMMixerApp.g:1007:1: ( ',' )
            // InternalBIMMixerApp.g:1008:2: ','
            {
             before(grammarAccess.getLEEDCertificationAccess().getCommaKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLEEDCertificationAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__LEEDCertification__Group_4__0__Impl"


    // $ANTLR start "rule__LEEDCertification__Group_4__1"
    // InternalBIMMixerApp.g:1017:1: rule__LEEDCertification__Group_4__1 : rule__LEEDCertification__Group_4__1__Impl ;
    public final void rule__LEEDCertification__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1021:1: ( rule__LEEDCertification__Group_4__1__Impl )
            // InternalBIMMixerApp.g:1022:2: rule__LEEDCertification__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LEEDCertification__Group_4__1__Impl();

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
    // $ANTLR end "rule__LEEDCertification__Group_4__1"


    // $ANTLR start "rule__LEEDCertification__Group_4__1__Impl"
    // InternalBIMMixerApp.g:1028:1: rule__LEEDCertification__Group_4__1__Impl : ( ( rule__LEEDCertification__CategoriesAssignment_4_1 ) ) ;
    public final void rule__LEEDCertification__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1032:1: ( ( ( rule__LEEDCertification__CategoriesAssignment_4_1 ) ) )
            // InternalBIMMixerApp.g:1033:1: ( ( rule__LEEDCertification__CategoriesAssignment_4_1 ) )
            {
            // InternalBIMMixerApp.g:1033:1: ( ( rule__LEEDCertification__CategoriesAssignment_4_1 ) )
            // InternalBIMMixerApp.g:1034:2: ( rule__LEEDCertification__CategoriesAssignment_4_1 )
            {
             before(grammarAccess.getLEEDCertificationAccess().getCategoriesAssignment_4_1()); 
            // InternalBIMMixerApp.g:1035:2: ( rule__LEEDCertification__CategoriesAssignment_4_1 )
            // InternalBIMMixerApp.g:1035:3: rule__LEEDCertification__CategoriesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__LEEDCertification__CategoriesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLEEDCertificationAccess().getCategoriesAssignment_4_1()); 

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
    // $ANTLR end "rule__LEEDCertification__Group_4__1__Impl"


    // $ANTLR start "rule__LEEDCertification__Group_5__0"
    // InternalBIMMixerApp.g:1044:1: rule__LEEDCertification__Group_5__0 : rule__LEEDCertification__Group_5__0__Impl rule__LEEDCertification__Group_5__1 ;
    public final void rule__LEEDCertification__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1048:1: ( rule__LEEDCertification__Group_5__0__Impl rule__LEEDCertification__Group_5__1 )
            // InternalBIMMixerApp.g:1049:2: rule__LEEDCertification__Group_5__0__Impl rule__LEEDCertification__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__LEEDCertification__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LEEDCertification__Group_5__1();

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
    // $ANTLR end "rule__LEEDCertification__Group_5__0"


    // $ANTLR start "rule__LEEDCertification__Group_5__0__Impl"
    // InternalBIMMixerApp.g:1056:1: rule__LEEDCertification__Group_5__0__Impl : ( 'connectedCertification:' ) ;
    public final void rule__LEEDCertification__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1060:1: ( ( 'connectedCertification:' ) )
            // InternalBIMMixerApp.g:1061:1: ( 'connectedCertification:' )
            {
            // InternalBIMMixerApp.g:1061:1: ( 'connectedCertification:' )
            // InternalBIMMixerApp.g:1062:2: 'connectedCertification:'
            {
             before(grammarAccess.getLEEDCertificationAccess().getConnectedCertificationKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLEEDCertificationAccess().getConnectedCertificationKeyword_5_0()); 

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
    // $ANTLR end "rule__LEEDCertification__Group_5__0__Impl"


    // $ANTLR start "rule__LEEDCertification__Group_5__1"
    // InternalBIMMixerApp.g:1071:1: rule__LEEDCertification__Group_5__1 : rule__LEEDCertification__Group_5__1__Impl ;
    public final void rule__LEEDCertification__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1075:1: ( rule__LEEDCertification__Group_5__1__Impl )
            // InternalBIMMixerApp.g:1076:2: rule__LEEDCertification__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LEEDCertification__Group_5__1__Impl();

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
    // $ANTLR end "rule__LEEDCertification__Group_5__1"


    // $ANTLR start "rule__LEEDCertification__Group_5__1__Impl"
    // InternalBIMMixerApp.g:1082:1: rule__LEEDCertification__Group_5__1__Impl : ( ( rule__LEEDCertification__ConnectedCertificationAssignment_5_1 ) ) ;
    public final void rule__LEEDCertification__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1086:1: ( ( ( rule__LEEDCertification__ConnectedCertificationAssignment_5_1 ) ) )
            // InternalBIMMixerApp.g:1087:1: ( ( rule__LEEDCertification__ConnectedCertificationAssignment_5_1 ) )
            {
            // InternalBIMMixerApp.g:1087:1: ( ( rule__LEEDCertification__ConnectedCertificationAssignment_5_1 ) )
            // InternalBIMMixerApp.g:1088:2: ( rule__LEEDCertification__ConnectedCertificationAssignment_5_1 )
            {
             before(grammarAccess.getLEEDCertificationAccess().getConnectedCertificationAssignment_5_1()); 
            // InternalBIMMixerApp.g:1089:2: ( rule__LEEDCertification__ConnectedCertificationAssignment_5_1 )
            // InternalBIMMixerApp.g:1089:3: rule__LEEDCertification__ConnectedCertificationAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__LEEDCertification__ConnectedCertificationAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLEEDCertificationAccess().getConnectedCertificationAssignment_5_1()); 

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
    // $ANTLR end "rule__LEEDCertification__Group_5__1__Impl"


    // $ANTLR start "rule__Category__Group__0"
    // InternalBIMMixerApp.g:1098:1: rule__Category__Group__0 : rule__Category__Group__0__Impl rule__Category__Group__1 ;
    public final void rule__Category__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1102:1: ( rule__Category__Group__0__Impl rule__Category__Group__1 )
            // InternalBIMMixerApp.g:1103:2: rule__Category__Group__0__Impl rule__Category__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Category__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group__1();

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
    // $ANTLR end "rule__Category__Group__0"


    // $ANTLR start "rule__Category__Group__0__Impl"
    // InternalBIMMixerApp.g:1110:1: rule__Category__Group__0__Impl : ( 'Category' ) ;
    public final void rule__Category__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1114:1: ( ( 'Category' ) )
            // InternalBIMMixerApp.g:1115:1: ( 'Category' )
            {
            // InternalBIMMixerApp.g:1115:1: ( 'Category' )
            // InternalBIMMixerApp.g:1116:2: 'Category'
            {
             before(grammarAccess.getCategoryAccess().getCategoryKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCategoryAccess().getCategoryKeyword_0()); 

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
    // $ANTLR end "rule__Category__Group__0__Impl"


    // $ANTLR start "rule__Category__Group__1"
    // InternalBIMMixerApp.g:1125:1: rule__Category__Group__1 : rule__Category__Group__1__Impl rule__Category__Group__2 ;
    public final void rule__Category__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1129:1: ( rule__Category__Group__1__Impl rule__Category__Group__2 )
            // InternalBIMMixerApp.g:1130:2: rule__Category__Group__1__Impl rule__Category__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Category__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group__2();

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
    // $ANTLR end "rule__Category__Group__1"


    // $ANTLR start "rule__Category__Group__1__Impl"
    // InternalBIMMixerApp.g:1137:1: rule__Category__Group__1__Impl : ( ( rule__Category__NameAssignment_1 ) ) ;
    public final void rule__Category__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1141:1: ( ( ( rule__Category__NameAssignment_1 ) ) )
            // InternalBIMMixerApp.g:1142:1: ( ( rule__Category__NameAssignment_1 ) )
            {
            // InternalBIMMixerApp.g:1142:1: ( ( rule__Category__NameAssignment_1 ) )
            // InternalBIMMixerApp.g:1143:2: ( rule__Category__NameAssignment_1 )
            {
             before(grammarAccess.getCategoryAccess().getNameAssignment_1()); 
            // InternalBIMMixerApp.g:1144:2: ( rule__Category__NameAssignment_1 )
            // InternalBIMMixerApp.g:1144:3: rule__Category__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Category__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Category__Group__1__Impl"


    // $ANTLR start "rule__Category__Group__2"
    // InternalBIMMixerApp.g:1152:1: rule__Category__Group__2 : rule__Category__Group__2__Impl rule__Category__Group__3 ;
    public final void rule__Category__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1156:1: ( rule__Category__Group__2__Impl rule__Category__Group__3 )
            // InternalBIMMixerApp.g:1157:2: rule__Category__Group__2__Impl rule__Category__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Category__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group__3();

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
    // $ANTLR end "rule__Category__Group__2"


    // $ANTLR start "rule__Category__Group__2__Impl"
    // InternalBIMMixerApp.g:1164:1: rule__Category__Group__2__Impl : ( '{' ) ;
    public final void rule__Category__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1168:1: ( ( '{' ) )
            // InternalBIMMixerApp.g:1169:1: ( '{' )
            {
            // InternalBIMMixerApp.g:1169:1: ( '{' )
            // InternalBIMMixerApp.g:1170:2: '{'
            {
             before(grammarAccess.getCategoryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCategoryAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Category__Group__2__Impl"


    // $ANTLR start "rule__Category__Group__3"
    // InternalBIMMixerApp.g:1179:1: rule__Category__Group__3 : rule__Category__Group__3__Impl rule__Category__Group__4 ;
    public final void rule__Category__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1183:1: ( rule__Category__Group__3__Impl rule__Category__Group__4 )
            // InternalBIMMixerApp.g:1184:2: rule__Category__Group__3__Impl rule__Category__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Category__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group__4();

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
    // $ANTLR end "rule__Category__Group__3"


    // $ANTLR start "rule__Category__Group__3__Impl"
    // InternalBIMMixerApp.g:1191:1: rule__Category__Group__3__Impl : ( ( rule__Category__SubCategoriesAssignment_3 ) ) ;
    public final void rule__Category__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1195:1: ( ( ( rule__Category__SubCategoriesAssignment_3 ) ) )
            // InternalBIMMixerApp.g:1196:1: ( ( rule__Category__SubCategoriesAssignment_3 ) )
            {
            // InternalBIMMixerApp.g:1196:1: ( ( rule__Category__SubCategoriesAssignment_3 ) )
            // InternalBIMMixerApp.g:1197:2: ( rule__Category__SubCategoriesAssignment_3 )
            {
             before(grammarAccess.getCategoryAccess().getSubCategoriesAssignment_3()); 
            // InternalBIMMixerApp.g:1198:2: ( rule__Category__SubCategoriesAssignment_3 )
            // InternalBIMMixerApp.g:1198:3: rule__Category__SubCategoriesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Category__SubCategoriesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getSubCategoriesAssignment_3()); 

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
    // $ANTLR end "rule__Category__Group__3__Impl"


    // $ANTLR start "rule__Category__Group__4"
    // InternalBIMMixerApp.g:1206:1: rule__Category__Group__4 : rule__Category__Group__4__Impl rule__Category__Group__5 ;
    public final void rule__Category__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1210:1: ( rule__Category__Group__4__Impl rule__Category__Group__5 )
            // InternalBIMMixerApp.g:1211:2: rule__Category__Group__4__Impl rule__Category__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Category__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group__5();

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
    // $ANTLR end "rule__Category__Group__4"


    // $ANTLR start "rule__Category__Group__4__Impl"
    // InternalBIMMixerApp.g:1218:1: rule__Category__Group__4__Impl : ( ( rule__Category__Group_4__0 )* ) ;
    public final void rule__Category__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1222:1: ( ( ( rule__Category__Group_4__0 )* ) )
            // InternalBIMMixerApp.g:1223:1: ( ( rule__Category__Group_4__0 )* )
            {
            // InternalBIMMixerApp.g:1223:1: ( ( rule__Category__Group_4__0 )* )
            // InternalBIMMixerApp.g:1224:2: ( rule__Category__Group_4__0 )*
            {
             before(grammarAccess.getCategoryAccess().getGroup_4()); 
            // InternalBIMMixerApp.g:1225:2: ( rule__Category__Group_4__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBIMMixerApp.g:1225:3: rule__Category__Group_4__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Category__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getCategoryAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Category__Group__4__Impl"


    // $ANTLR start "rule__Category__Group__5"
    // InternalBIMMixerApp.g:1233:1: rule__Category__Group__5 : rule__Category__Group__5__Impl ;
    public final void rule__Category__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1237:1: ( rule__Category__Group__5__Impl )
            // InternalBIMMixerApp.g:1238:2: rule__Category__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Category__Group__5__Impl();

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
    // $ANTLR end "rule__Category__Group__5"


    // $ANTLR start "rule__Category__Group__5__Impl"
    // InternalBIMMixerApp.g:1244:1: rule__Category__Group__5__Impl : ( '}' ) ;
    public final void rule__Category__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1248:1: ( ( '}' ) )
            // InternalBIMMixerApp.g:1249:1: ( '}' )
            {
            // InternalBIMMixerApp.g:1249:1: ( '}' )
            // InternalBIMMixerApp.g:1250:2: '}'
            {
             before(grammarAccess.getCategoryAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCategoryAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Category__Group__5__Impl"


    // $ANTLR start "rule__Category__Group_4__0"
    // InternalBIMMixerApp.g:1260:1: rule__Category__Group_4__0 : rule__Category__Group_4__0__Impl rule__Category__Group_4__1 ;
    public final void rule__Category__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1264:1: ( rule__Category__Group_4__0__Impl rule__Category__Group_4__1 )
            // InternalBIMMixerApp.g:1265:2: rule__Category__Group_4__0__Impl rule__Category__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Category__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group_4__1();

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
    // $ANTLR end "rule__Category__Group_4__0"


    // $ANTLR start "rule__Category__Group_4__0__Impl"
    // InternalBIMMixerApp.g:1272:1: rule__Category__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Category__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1276:1: ( ( ',' ) )
            // InternalBIMMixerApp.g:1277:1: ( ',' )
            {
            // InternalBIMMixerApp.g:1277:1: ( ',' )
            // InternalBIMMixerApp.g:1278:2: ','
            {
             before(grammarAccess.getCategoryAccess().getCommaKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCategoryAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__Category__Group_4__0__Impl"


    // $ANTLR start "rule__Category__Group_4__1"
    // InternalBIMMixerApp.g:1287:1: rule__Category__Group_4__1 : rule__Category__Group_4__1__Impl ;
    public final void rule__Category__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1291:1: ( rule__Category__Group_4__1__Impl )
            // InternalBIMMixerApp.g:1292:2: rule__Category__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Category__Group_4__1__Impl();

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
    // $ANTLR end "rule__Category__Group_4__1"


    // $ANTLR start "rule__Category__Group_4__1__Impl"
    // InternalBIMMixerApp.g:1298:1: rule__Category__Group_4__1__Impl : ( ( rule__Category__SubCategoriesAssignment_4_1 ) ) ;
    public final void rule__Category__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1302:1: ( ( ( rule__Category__SubCategoriesAssignment_4_1 ) ) )
            // InternalBIMMixerApp.g:1303:1: ( ( rule__Category__SubCategoriesAssignment_4_1 ) )
            {
            // InternalBIMMixerApp.g:1303:1: ( ( rule__Category__SubCategoriesAssignment_4_1 ) )
            // InternalBIMMixerApp.g:1304:2: ( rule__Category__SubCategoriesAssignment_4_1 )
            {
             before(grammarAccess.getCategoryAccess().getSubCategoriesAssignment_4_1()); 
            // InternalBIMMixerApp.g:1305:2: ( rule__Category__SubCategoriesAssignment_4_1 )
            // InternalBIMMixerApp.g:1305:3: rule__Category__SubCategoriesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Category__SubCategoriesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getSubCategoriesAssignment_4_1()); 

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
    // $ANTLR end "rule__Category__Group_4__1__Impl"


    // $ANTLR start "rule__Subcategory__Group__0"
    // InternalBIMMixerApp.g:1314:1: rule__Subcategory__Group__0 : rule__Subcategory__Group__0__Impl rule__Subcategory__Group__1 ;
    public final void rule__Subcategory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1318:1: ( rule__Subcategory__Group__0__Impl rule__Subcategory__Group__1 )
            // InternalBIMMixerApp.g:1319:2: rule__Subcategory__Group__0__Impl rule__Subcategory__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Subcategory__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subcategory__Group__1();

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
    // $ANTLR end "rule__Subcategory__Group__0"


    // $ANTLR start "rule__Subcategory__Group__0__Impl"
    // InternalBIMMixerApp.g:1326:1: rule__Subcategory__Group__0__Impl : ( () ) ;
    public final void rule__Subcategory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1330:1: ( ( () ) )
            // InternalBIMMixerApp.g:1331:1: ( () )
            {
            // InternalBIMMixerApp.g:1331:1: ( () )
            // InternalBIMMixerApp.g:1332:2: ()
            {
             before(grammarAccess.getSubcategoryAccess().getSubcategoryAction_0()); 
            // InternalBIMMixerApp.g:1333:2: ()
            // InternalBIMMixerApp.g:1333:3: 
            {
            }

             after(grammarAccess.getSubcategoryAccess().getSubcategoryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subcategory__Group__0__Impl"


    // $ANTLR start "rule__Subcategory__Group__1"
    // InternalBIMMixerApp.g:1341:1: rule__Subcategory__Group__1 : rule__Subcategory__Group__1__Impl rule__Subcategory__Group__2 ;
    public final void rule__Subcategory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1345:1: ( rule__Subcategory__Group__1__Impl rule__Subcategory__Group__2 )
            // InternalBIMMixerApp.g:1346:2: rule__Subcategory__Group__1__Impl rule__Subcategory__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Subcategory__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subcategory__Group__2();

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
    // $ANTLR end "rule__Subcategory__Group__1"


    // $ANTLR start "rule__Subcategory__Group__1__Impl"
    // InternalBIMMixerApp.g:1353:1: rule__Subcategory__Group__1__Impl : ( ( rule__Subcategory__NameAssignment_1 ) ) ;
    public final void rule__Subcategory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1357:1: ( ( ( rule__Subcategory__NameAssignment_1 ) ) )
            // InternalBIMMixerApp.g:1358:1: ( ( rule__Subcategory__NameAssignment_1 ) )
            {
            // InternalBIMMixerApp.g:1358:1: ( ( rule__Subcategory__NameAssignment_1 ) )
            // InternalBIMMixerApp.g:1359:2: ( rule__Subcategory__NameAssignment_1 )
            {
             before(grammarAccess.getSubcategoryAccess().getNameAssignment_1()); 
            // InternalBIMMixerApp.g:1360:2: ( rule__Subcategory__NameAssignment_1 )
            // InternalBIMMixerApp.g:1360:3: rule__Subcategory__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Subcategory__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubcategoryAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Subcategory__Group__1__Impl"


    // $ANTLR start "rule__Subcategory__Group__2"
    // InternalBIMMixerApp.g:1368:1: rule__Subcategory__Group__2 : rule__Subcategory__Group__2__Impl rule__Subcategory__Group__3 ;
    public final void rule__Subcategory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1372:1: ( rule__Subcategory__Group__2__Impl rule__Subcategory__Group__3 )
            // InternalBIMMixerApp.g:1373:2: rule__Subcategory__Group__2__Impl rule__Subcategory__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Subcategory__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subcategory__Group__3();

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
    // $ANTLR end "rule__Subcategory__Group__2"


    // $ANTLR start "rule__Subcategory__Group__2__Impl"
    // InternalBIMMixerApp.g:1380:1: rule__Subcategory__Group__2__Impl : ( '{' ) ;
    public final void rule__Subcategory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1384:1: ( ( '{' ) )
            // InternalBIMMixerApp.g:1385:1: ( '{' )
            {
            // InternalBIMMixerApp.g:1385:1: ( '{' )
            // InternalBIMMixerApp.g:1386:2: '{'
            {
             before(grammarAccess.getSubcategoryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSubcategoryAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Subcategory__Group__2__Impl"


    // $ANTLR start "rule__Subcategory__Group__3"
    // InternalBIMMixerApp.g:1395:1: rule__Subcategory__Group__3 : rule__Subcategory__Group__3__Impl rule__Subcategory__Group__4 ;
    public final void rule__Subcategory__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1399:1: ( rule__Subcategory__Group__3__Impl rule__Subcategory__Group__4 )
            // InternalBIMMixerApp.g:1400:2: rule__Subcategory__Group__3__Impl rule__Subcategory__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Subcategory__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subcategory__Group__4();

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
    // $ANTLR end "rule__Subcategory__Group__3"


    // $ANTLR start "rule__Subcategory__Group__3__Impl"
    // InternalBIMMixerApp.g:1407:1: rule__Subcategory__Group__3__Impl : ( ( rule__Subcategory__Group_3__0 )? ) ;
    public final void rule__Subcategory__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1411:1: ( ( ( rule__Subcategory__Group_3__0 )? ) )
            // InternalBIMMixerApp.g:1412:1: ( ( rule__Subcategory__Group_3__0 )? )
            {
            // InternalBIMMixerApp.g:1412:1: ( ( rule__Subcategory__Group_3__0 )? )
            // InternalBIMMixerApp.g:1413:2: ( rule__Subcategory__Group_3__0 )?
            {
             before(grammarAccess.getSubcategoryAccess().getGroup_3()); 
            // InternalBIMMixerApp.g:1414:2: ( rule__Subcategory__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBIMMixerApp.g:1414:3: rule__Subcategory__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subcategory__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubcategoryAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Subcategory__Group__3__Impl"


    // $ANTLR start "rule__Subcategory__Group__4"
    // InternalBIMMixerApp.g:1422:1: rule__Subcategory__Group__4 : rule__Subcategory__Group__4__Impl rule__Subcategory__Group__5 ;
    public final void rule__Subcategory__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1426:1: ( rule__Subcategory__Group__4__Impl rule__Subcategory__Group__5 )
            // InternalBIMMixerApp.g:1427:2: rule__Subcategory__Group__4__Impl rule__Subcategory__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Subcategory__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subcategory__Group__5();

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
    // $ANTLR end "rule__Subcategory__Group__4"


    // $ANTLR start "rule__Subcategory__Group__4__Impl"
    // InternalBIMMixerApp.g:1434:1: rule__Subcategory__Group__4__Impl : ( ( rule__Subcategory__Group_4__0 )? ) ;
    public final void rule__Subcategory__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1438:1: ( ( ( rule__Subcategory__Group_4__0 )? ) )
            // InternalBIMMixerApp.g:1439:1: ( ( rule__Subcategory__Group_4__0 )? )
            {
            // InternalBIMMixerApp.g:1439:1: ( ( rule__Subcategory__Group_4__0 )? )
            // InternalBIMMixerApp.g:1440:2: ( rule__Subcategory__Group_4__0 )?
            {
             before(grammarAccess.getSubcategoryAccess().getGroup_4()); 
            // InternalBIMMixerApp.g:1441:2: ( rule__Subcategory__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBIMMixerApp.g:1441:3: rule__Subcategory__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subcategory__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubcategoryAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Subcategory__Group__4__Impl"


    // $ANTLR start "rule__Subcategory__Group__5"
    // InternalBIMMixerApp.g:1449:1: rule__Subcategory__Group__5 : rule__Subcategory__Group__5__Impl rule__Subcategory__Group__6 ;
    public final void rule__Subcategory__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1453:1: ( rule__Subcategory__Group__5__Impl rule__Subcategory__Group__6 )
            // InternalBIMMixerApp.g:1454:2: rule__Subcategory__Group__5__Impl rule__Subcategory__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Subcategory__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subcategory__Group__6();

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
    // $ANTLR end "rule__Subcategory__Group__5"


    // $ANTLR start "rule__Subcategory__Group__5__Impl"
    // InternalBIMMixerApp.g:1461:1: rule__Subcategory__Group__5__Impl : ( ( rule__Subcategory__Group_5__0 )? ) ;
    public final void rule__Subcategory__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1465:1: ( ( ( rule__Subcategory__Group_5__0 )? ) )
            // InternalBIMMixerApp.g:1466:1: ( ( rule__Subcategory__Group_5__0 )? )
            {
            // InternalBIMMixerApp.g:1466:1: ( ( rule__Subcategory__Group_5__0 )? )
            // InternalBIMMixerApp.g:1467:2: ( rule__Subcategory__Group_5__0 )?
            {
             before(grammarAccess.getSubcategoryAccess().getGroup_5()); 
            // InternalBIMMixerApp.g:1468:2: ( rule__Subcategory__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBIMMixerApp.g:1468:3: rule__Subcategory__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subcategory__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubcategoryAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Subcategory__Group__5__Impl"


    // $ANTLR start "rule__Subcategory__Group__6"
    // InternalBIMMixerApp.g:1476:1: rule__Subcategory__Group__6 : rule__Subcategory__Group__6__Impl rule__Subcategory__Group__7 ;
    public final void rule__Subcategory__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1480:1: ( rule__Subcategory__Group__6__Impl rule__Subcategory__Group__7 )
            // InternalBIMMixerApp.g:1481:2: rule__Subcategory__Group__6__Impl rule__Subcategory__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__Subcategory__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subcategory__Group__7();

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
    // $ANTLR end "rule__Subcategory__Group__6"


    // $ANTLR start "rule__Subcategory__Group__6__Impl"
    // InternalBIMMixerApp.g:1488:1: rule__Subcategory__Group__6__Impl : ( ( rule__Subcategory__Group_6__0 )? ) ;
    public final void rule__Subcategory__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1492:1: ( ( ( rule__Subcategory__Group_6__0 )? ) )
            // InternalBIMMixerApp.g:1493:1: ( ( rule__Subcategory__Group_6__0 )? )
            {
            // InternalBIMMixerApp.g:1493:1: ( ( rule__Subcategory__Group_6__0 )? )
            // InternalBIMMixerApp.g:1494:2: ( rule__Subcategory__Group_6__0 )?
            {
             before(grammarAccess.getSubcategoryAccess().getGroup_6()); 
            // InternalBIMMixerApp.g:1495:2: ( rule__Subcategory__Group_6__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBIMMixerApp.g:1495:3: rule__Subcategory__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subcategory__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubcategoryAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Subcategory__Group__6__Impl"


    // $ANTLR start "rule__Subcategory__Group__7"
    // InternalBIMMixerApp.g:1503:1: rule__Subcategory__Group__7 : rule__Subcategory__Group__7__Impl rule__Subcategory__Group__8 ;
    public final void rule__Subcategory__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1507:1: ( rule__Subcategory__Group__7__Impl rule__Subcategory__Group__8 )
            // InternalBIMMixerApp.g:1508:2: rule__Subcategory__Group__7__Impl rule__Subcategory__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__Subcategory__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subcategory__Group__8();

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
    // $ANTLR end "rule__Subcategory__Group__7"


    // $ANTLR start "rule__Subcategory__Group__7__Impl"
    // InternalBIMMixerApp.g:1515:1: rule__Subcategory__Group__7__Impl : ( ( rule__Subcategory__RequiredAssignment_7 )? ) ;
    public final void rule__Subcategory__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1519:1: ( ( ( rule__Subcategory__RequiredAssignment_7 )? ) )
            // InternalBIMMixerApp.g:1520:1: ( ( rule__Subcategory__RequiredAssignment_7 )? )
            {
            // InternalBIMMixerApp.g:1520:1: ( ( rule__Subcategory__RequiredAssignment_7 )? )
            // InternalBIMMixerApp.g:1521:2: ( rule__Subcategory__RequiredAssignment_7 )?
            {
             before(grammarAccess.getSubcategoryAccess().getRequiredAssignment_7()); 
            // InternalBIMMixerApp.g:1522:2: ( rule__Subcategory__RequiredAssignment_7 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBIMMixerApp.g:1522:3: rule__Subcategory__RequiredAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subcategory__RequiredAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubcategoryAccess().getRequiredAssignment_7()); 

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
    // $ANTLR end "rule__Subcategory__Group__7__Impl"


    // $ANTLR start "rule__Subcategory__Group__8"
    // InternalBIMMixerApp.g:1530:1: rule__Subcategory__Group__8 : rule__Subcategory__Group__8__Impl ;
    public final void rule__Subcategory__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1534:1: ( rule__Subcategory__Group__8__Impl )
            // InternalBIMMixerApp.g:1535:2: rule__Subcategory__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subcategory__Group__8__Impl();

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
    // $ANTLR end "rule__Subcategory__Group__8"


    // $ANTLR start "rule__Subcategory__Group__8__Impl"
    // InternalBIMMixerApp.g:1541:1: rule__Subcategory__Group__8__Impl : ( '}' ) ;
    public final void rule__Subcategory__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1545:1: ( ( '}' ) )
            // InternalBIMMixerApp.g:1546:1: ( '}' )
            {
            // InternalBIMMixerApp.g:1546:1: ( '}' )
            // InternalBIMMixerApp.g:1547:2: '}'
            {
             before(grammarAccess.getSubcategoryAccess().getRightCurlyBracketKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSubcategoryAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Subcategory__Group__8__Impl"


    // $ANTLR start "rule__Subcategory__Group_3__0"
    // InternalBIMMixerApp.g:1557:1: rule__Subcategory__Group_3__0 : rule__Subcategory__Group_3__0__Impl rule__Subcategory__Group_3__1 ;
    public final void rule__Subcategory__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1561:1: ( rule__Subcategory__Group_3__0__Impl rule__Subcategory__Group_3__1 )
            // InternalBIMMixerApp.g:1562:2: rule__Subcategory__Group_3__0__Impl rule__Subcategory__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Subcategory__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subcategory__Group_3__1();

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
    // $ANTLR end "rule__Subcategory__Group_3__0"


    // $ANTLR start "rule__Subcategory__Group_3__0__Impl"
    // InternalBIMMixerApp.g:1569:1: rule__Subcategory__Group_3__0__Impl : ( 'text:' ) ;
    public final void rule__Subcategory__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1573:1: ( ( 'text:' ) )
            // InternalBIMMixerApp.g:1574:1: ( 'text:' )
            {
            // InternalBIMMixerApp.g:1574:1: ( 'text:' )
            // InternalBIMMixerApp.g:1575:2: 'text:'
            {
             before(grammarAccess.getSubcategoryAccess().getTextKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSubcategoryAccess().getTextKeyword_3_0()); 

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
    // $ANTLR end "rule__Subcategory__Group_3__0__Impl"


    // $ANTLR start "rule__Subcategory__Group_3__1"
    // InternalBIMMixerApp.g:1584:1: rule__Subcategory__Group_3__1 : rule__Subcategory__Group_3__1__Impl ;
    public final void rule__Subcategory__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1588:1: ( rule__Subcategory__Group_3__1__Impl )
            // InternalBIMMixerApp.g:1589:2: rule__Subcategory__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subcategory__Group_3__1__Impl();

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
    // $ANTLR end "rule__Subcategory__Group_3__1"


    // $ANTLR start "rule__Subcategory__Group_3__1__Impl"
    // InternalBIMMixerApp.g:1595:1: rule__Subcategory__Group_3__1__Impl : ( ( rule__Subcategory__TextAssignment_3_1 ) ) ;
    public final void rule__Subcategory__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1599:1: ( ( ( rule__Subcategory__TextAssignment_3_1 ) ) )
            // InternalBIMMixerApp.g:1600:1: ( ( rule__Subcategory__TextAssignment_3_1 ) )
            {
            // InternalBIMMixerApp.g:1600:1: ( ( rule__Subcategory__TextAssignment_3_1 ) )
            // InternalBIMMixerApp.g:1601:2: ( rule__Subcategory__TextAssignment_3_1 )
            {
             before(grammarAccess.getSubcategoryAccess().getTextAssignment_3_1()); 
            // InternalBIMMixerApp.g:1602:2: ( rule__Subcategory__TextAssignment_3_1 )
            // InternalBIMMixerApp.g:1602:3: rule__Subcategory__TextAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Subcategory__TextAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSubcategoryAccess().getTextAssignment_3_1()); 

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
    // $ANTLR end "rule__Subcategory__Group_3__1__Impl"


    // $ANTLR start "rule__Subcategory__Group_4__0"
    // InternalBIMMixerApp.g:1611:1: rule__Subcategory__Group_4__0 : rule__Subcategory__Group_4__0__Impl rule__Subcategory__Group_4__1 ;
    public final void rule__Subcategory__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1615:1: ( rule__Subcategory__Group_4__0__Impl rule__Subcategory__Group_4__1 )
            // InternalBIMMixerApp.g:1616:2: rule__Subcategory__Group_4__0__Impl rule__Subcategory__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__Subcategory__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subcategory__Group_4__1();

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
    // $ANTLR end "rule__Subcategory__Group_4__0"


    // $ANTLR start "rule__Subcategory__Group_4__0__Impl"
    // InternalBIMMixerApp.g:1623:1: rule__Subcategory__Group_4__0__Impl : ( 'points:' ) ;
    public final void rule__Subcategory__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1627:1: ( ( 'points:' ) )
            // InternalBIMMixerApp.g:1628:1: ( 'points:' )
            {
            // InternalBIMMixerApp.g:1628:1: ( 'points:' )
            // InternalBIMMixerApp.g:1629:2: 'points:'
            {
             before(grammarAccess.getSubcategoryAccess().getPointsKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSubcategoryAccess().getPointsKeyword_4_0()); 

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
    // $ANTLR end "rule__Subcategory__Group_4__0__Impl"


    // $ANTLR start "rule__Subcategory__Group_4__1"
    // InternalBIMMixerApp.g:1638:1: rule__Subcategory__Group_4__1 : rule__Subcategory__Group_4__1__Impl ;
    public final void rule__Subcategory__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1642:1: ( rule__Subcategory__Group_4__1__Impl )
            // InternalBIMMixerApp.g:1643:2: rule__Subcategory__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subcategory__Group_4__1__Impl();

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
    // $ANTLR end "rule__Subcategory__Group_4__1"


    // $ANTLR start "rule__Subcategory__Group_4__1__Impl"
    // InternalBIMMixerApp.g:1649:1: rule__Subcategory__Group_4__1__Impl : ( ( rule__Subcategory__PointsAssignment_4_1 ) ) ;
    public final void rule__Subcategory__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1653:1: ( ( ( rule__Subcategory__PointsAssignment_4_1 ) ) )
            // InternalBIMMixerApp.g:1654:1: ( ( rule__Subcategory__PointsAssignment_4_1 ) )
            {
            // InternalBIMMixerApp.g:1654:1: ( ( rule__Subcategory__PointsAssignment_4_1 ) )
            // InternalBIMMixerApp.g:1655:2: ( rule__Subcategory__PointsAssignment_4_1 )
            {
             before(grammarAccess.getSubcategoryAccess().getPointsAssignment_4_1()); 
            // InternalBIMMixerApp.g:1656:2: ( rule__Subcategory__PointsAssignment_4_1 )
            // InternalBIMMixerApp.g:1656:3: rule__Subcategory__PointsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Subcategory__PointsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSubcategoryAccess().getPointsAssignment_4_1()); 

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
    // $ANTLR end "rule__Subcategory__Group_4__1__Impl"


    // $ANTLR start "rule__Subcategory__Group_5__0"
    // InternalBIMMixerApp.g:1665:1: rule__Subcategory__Group_5__0 : rule__Subcategory__Group_5__0__Impl rule__Subcategory__Group_5__1 ;
    public final void rule__Subcategory__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1669:1: ( rule__Subcategory__Group_5__0__Impl rule__Subcategory__Group_5__1 )
            // InternalBIMMixerApp.g:1670:2: rule__Subcategory__Group_5__0__Impl rule__Subcategory__Group_5__1
            {
            pushFollow(FOLLOW_14);
            rule__Subcategory__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subcategory__Group_5__1();

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
    // $ANTLR end "rule__Subcategory__Group_5__0"


    // $ANTLR start "rule__Subcategory__Group_5__0__Impl"
    // InternalBIMMixerApp.g:1677:1: rule__Subcategory__Group_5__0__Impl : ( 'obtainedPoints:' ) ;
    public final void rule__Subcategory__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1681:1: ( ( 'obtainedPoints:' ) )
            // InternalBIMMixerApp.g:1682:1: ( 'obtainedPoints:' )
            {
            // InternalBIMMixerApp.g:1682:1: ( 'obtainedPoints:' )
            // InternalBIMMixerApp.g:1683:2: 'obtainedPoints:'
            {
             before(grammarAccess.getSubcategoryAccess().getObtainedPointsKeyword_5_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSubcategoryAccess().getObtainedPointsKeyword_5_0()); 

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
    // $ANTLR end "rule__Subcategory__Group_5__0__Impl"


    // $ANTLR start "rule__Subcategory__Group_5__1"
    // InternalBIMMixerApp.g:1692:1: rule__Subcategory__Group_5__1 : rule__Subcategory__Group_5__1__Impl ;
    public final void rule__Subcategory__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1696:1: ( rule__Subcategory__Group_5__1__Impl )
            // InternalBIMMixerApp.g:1697:2: rule__Subcategory__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subcategory__Group_5__1__Impl();

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
    // $ANTLR end "rule__Subcategory__Group_5__1"


    // $ANTLR start "rule__Subcategory__Group_5__1__Impl"
    // InternalBIMMixerApp.g:1703:1: rule__Subcategory__Group_5__1__Impl : ( ( rule__Subcategory__ObtainedPointsAssignment_5_1 ) ) ;
    public final void rule__Subcategory__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1707:1: ( ( ( rule__Subcategory__ObtainedPointsAssignment_5_1 ) ) )
            // InternalBIMMixerApp.g:1708:1: ( ( rule__Subcategory__ObtainedPointsAssignment_5_1 ) )
            {
            // InternalBIMMixerApp.g:1708:1: ( ( rule__Subcategory__ObtainedPointsAssignment_5_1 ) )
            // InternalBIMMixerApp.g:1709:2: ( rule__Subcategory__ObtainedPointsAssignment_5_1 )
            {
             before(grammarAccess.getSubcategoryAccess().getObtainedPointsAssignment_5_1()); 
            // InternalBIMMixerApp.g:1710:2: ( rule__Subcategory__ObtainedPointsAssignment_5_1 )
            // InternalBIMMixerApp.g:1710:3: rule__Subcategory__ObtainedPointsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Subcategory__ObtainedPointsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSubcategoryAccess().getObtainedPointsAssignment_5_1()); 

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
    // $ANTLR end "rule__Subcategory__Group_5__1__Impl"


    // $ANTLR start "rule__Subcategory__Group_6__0"
    // InternalBIMMixerApp.g:1719:1: rule__Subcategory__Group_6__0 : rule__Subcategory__Group_6__0__Impl rule__Subcategory__Group_6__1 ;
    public final void rule__Subcategory__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1723:1: ( rule__Subcategory__Group_6__0__Impl rule__Subcategory__Group_6__1 )
            // InternalBIMMixerApp.g:1724:2: rule__Subcategory__Group_6__0__Impl rule__Subcategory__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Subcategory__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subcategory__Group_6__1();

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
    // $ANTLR end "rule__Subcategory__Group_6__0"


    // $ANTLR start "rule__Subcategory__Group_6__0__Impl"
    // InternalBIMMixerApp.g:1731:1: rule__Subcategory__Group_6__0__Impl : ( 'connection:' ) ;
    public final void rule__Subcategory__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1735:1: ( ( 'connection:' ) )
            // InternalBIMMixerApp.g:1736:1: ( 'connection:' )
            {
            // InternalBIMMixerApp.g:1736:1: ( 'connection:' )
            // InternalBIMMixerApp.g:1737:2: 'connection:'
            {
             before(grammarAccess.getSubcategoryAccess().getConnectionKeyword_6_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSubcategoryAccess().getConnectionKeyword_6_0()); 

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
    // $ANTLR end "rule__Subcategory__Group_6__0__Impl"


    // $ANTLR start "rule__Subcategory__Group_6__1"
    // InternalBIMMixerApp.g:1746:1: rule__Subcategory__Group_6__1 : rule__Subcategory__Group_6__1__Impl ;
    public final void rule__Subcategory__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1750:1: ( rule__Subcategory__Group_6__1__Impl )
            // InternalBIMMixerApp.g:1751:2: rule__Subcategory__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subcategory__Group_6__1__Impl();

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
    // $ANTLR end "rule__Subcategory__Group_6__1"


    // $ANTLR start "rule__Subcategory__Group_6__1__Impl"
    // InternalBIMMixerApp.g:1757:1: rule__Subcategory__Group_6__1__Impl : ( ( rule__Subcategory__ConnectionAssignment_6_1 ) ) ;
    public final void rule__Subcategory__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1761:1: ( ( ( rule__Subcategory__ConnectionAssignment_6_1 ) ) )
            // InternalBIMMixerApp.g:1762:1: ( ( rule__Subcategory__ConnectionAssignment_6_1 ) )
            {
            // InternalBIMMixerApp.g:1762:1: ( ( rule__Subcategory__ConnectionAssignment_6_1 ) )
            // InternalBIMMixerApp.g:1763:2: ( rule__Subcategory__ConnectionAssignment_6_1 )
            {
             before(grammarAccess.getSubcategoryAccess().getConnectionAssignment_6_1()); 
            // InternalBIMMixerApp.g:1764:2: ( rule__Subcategory__ConnectionAssignment_6_1 )
            // InternalBIMMixerApp.g:1764:3: rule__Subcategory__ConnectionAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Subcategory__ConnectionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getSubcategoryAccess().getConnectionAssignment_6_1()); 

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
    // $ANTLR end "rule__Subcategory__Group_6__1__Impl"


    // $ANTLR start "rule__EFloat__Group__0"
    // InternalBIMMixerApp.g:1773:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1777:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalBIMMixerApp.g:1778:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__EFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__1();

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
    // $ANTLR end "rule__EFloat__Group__0"


    // $ANTLR start "rule__EFloat__Group__0__Impl"
    // InternalBIMMixerApp.g:1785:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1789:1: ( ( ( '-' )? ) )
            // InternalBIMMixerApp.g:1790:1: ( ( '-' )? )
            {
            // InternalBIMMixerApp.g:1790:1: ( ( '-' )? )
            // InternalBIMMixerApp.g:1791:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalBIMMixerApp.g:1792:2: ( '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBIMMixerApp.g:1792:3: '-'
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EFloat__Group__0__Impl"


    // $ANTLR start "rule__EFloat__Group__1"
    // InternalBIMMixerApp.g:1800:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1804:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalBIMMixerApp.g:1805:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__EFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__2();

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
    // $ANTLR end "rule__EFloat__Group__1"


    // $ANTLR start "rule__EFloat__Group__1__Impl"
    // InternalBIMMixerApp.g:1812:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1816:1: ( ( ( RULE_INT )? ) )
            // InternalBIMMixerApp.g:1817:1: ( ( RULE_INT )? )
            {
            // InternalBIMMixerApp.g:1817:1: ( ( RULE_INT )? )
            // InternalBIMMixerApp.g:1818:2: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // InternalBIMMixerApp.g:1819:2: ( RULE_INT )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBIMMixerApp.g:1819:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EFloat__Group__1__Impl"


    // $ANTLR start "rule__EFloat__Group__2"
    // InternalBIMMixerApp.g:1827:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1831:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // InternalBIMMixerApp.g:1832:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__EFloat__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__3();

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
    // $ANTLR end "rule__EFloat__Group__2"


    // $ANTLR start "rule__EFloat__Group__2__Impl"
    // InternalBIMMixerApp.g:1839:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1843:1: ( ( '.' ) )
            // InternalBIMMixerApp.g:1844:1: ( '.' )
            {
            // InternalBIMMixerApp.g:1844:1: ( '.' )
            // InternalBIMMixerApp.g:1845:2: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__EFloat__Group__2__Impl"


    // $ANTLR start "rule__EFloat__Group__3"
    // InternalBIMMixerApp.g:1854:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1858:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // InternalBIMMixerApp.g:1859:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__EFloat__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4();

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
    // $ANTLR end "rule__EFloat__Group__3"


    // $ANTLR start "rule__EFloat__Group__3__Impl"
    // InternalBIMMixerApp.g:1866:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1870:1: ( ( RULE_INT ) )
            // InternalBIMMixerApp.g:1871:1: ( RULE_INT )
            {
            // InternalBIMMixerApp.g:1871:1: ( RULE_INT )
            // InternalBIMMixerApp.g:1872:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__EFloat__Group__3__Impl"


    // $ANTLR start "rule__EFloat__Group__4"
    // InternalBIMMixerApp.g:1881:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1885:1: ( rule__EFloat__Group__4__Impl )
            // InternalBIMMixerApp.g:1886:2: rule__EFloat__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4__Impl();

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
    // $ANTLR end "rule__EFloat__Group__4"


    // $ANTLR start "rule__EFloat__Group__4__Impl"
    // InternalBIMMixerApp.g:1892:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1896:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // InternalBIMMixerApp.g:1897:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // InternalBIMMixerApp.g:1897:1: ( ( rule__EFloat__Group_4__0 )? )
            // InternalBIMMixerApp.g:1898:2: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // InternalBIMMixerApp.g:1899:2: ( rule__EFloat__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=11 && LA18_0<=12)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBIMMixerApp.g:1899:3: rule__EFloat__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EFloat__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getGroup_4()); 

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
    // $ANTLR end "rule__EFloat__Group__4__Impl"


    // $ANTLR start "rule__EFloat__Group_4__0"
    // InternalBIMMixerApp.g:1908:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1912:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // InternalBIMMixerApp.g:1913:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__EFloat__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__1();

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
    // $ANTLR end "rule__EFloat__Group_4__0"


    // $ANTLR start "rule__EFloat__Group_4__0__Impl"
    // InternalBIMMixerApp.g:1920:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1924:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // InternalBIMMixerApp.g:1925:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // InternalBIMMixerApp.g:1925:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // InternalBIMMixerApp.g:1926:2: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // InternalBIMMixerApp.g:1927:2: ( rule__EFloat__Alternatives_4_0 )
            // InternalBIMMixerApp.g:1927:3: rule__EFloat__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 

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
    // $ANTLR end "rule__EFloat__Group_4__0__Impl"


    // $ANTLR start "rule__EFloat__Group_4__1"
    // InternalBIMMixerApp.g:1935:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1939:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // InternalBIMMixerApp.g:1940:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FOLLOW_17);
            rule__EFloat__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2();

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
    // $ANTLR end "rule__EFloat__Group_4__1"


    // $ANTLR start "rule__EFloat__Group_4__1__Impl"
    // InternalBIMMixerApp.g:1947:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1951:1: ( ( ( '-' )? ) )
            // InternalBIMMixerApp.g:1952:1: ( ( '-' )? )
            {
            // InternalBIMMixerApp.g:1952:1: ( ( '-' )? )
            // InternalBIMMixerApp.g:1953:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // InternalBIMMixerApp.g:1954:2: ( '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBIMMixerApp.g:1954:3: '-'
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 

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
    // $ANTLR end "rule__EFloat__Group_4__1__Impl"


    // $ANTLR start "rule__EFloat__Group_4__2"
    // InternalBIMMixerApp.g:1962:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1966:1: ( rule__EFloat__Group_4__2__Impl )
            // InternalBIMMixerApp.g:1967:2: rule__EFloat__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2__Impl();

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
    // $ANTLR end "rule__EFloat__Group_4__2"


    // $ANTLR start "rule__EFloat__Group_4__2__Impl"
    // InternalBIMMixerApp.g:1973:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1977:1: ( ( RULE_INT ) )
            // InternalBIMMixerApp.g:1978:1: ( RULE_INT )
            {
            // InternalBIMMixerApp.g:1978:1: ( RULE_INT )
            // InternalBIMMixerApp.g:1979:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 

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
    // $ANTLR end "rule__EFloat__Group_4__2__Impl"


    // $ANTLR start "rule__BIMMixerApp__NameAssignment_2"
    // InternalBIMMixerApp.g:1989:1: rule__BIMMixerApp__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__BIMMixerApp__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:1993:1: ( ( ruleEString ) )
            // InternalBIMMixerApp.g:1994:2: ( ruleEString )
            {
            // InternalBIMMixerApp.g:1994:2: ( ruleEString )
            // InternalBIMMixerApp.g:1995:3: ruleEString
            {
             before(grammarAccess.getBIMMixerAppAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBIMMixerAppAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__BIMMixerApp__NameAssignment_2"


    // $ANTLR start "rule__BIMMixerApp__CertificationsAssignment_4_0"
    // InternalBIMMixerApp.g:2004:1: rule__BIMMixerApp__CertificationsAssignment_4_0 : ( ruleBIMCertification ) ;
    public final void rule__BIMMixerApp__CertificationsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:2008:1: ( ( ruleBIMCertification ) )
            // InternalBIMMixerApp.g:2009:2: ( ruleBIMCertification )
            {
            // InternalBIMMixerApp.g:2009:2: ( ruleBIMCertification )
            // InternalBIMMixerApp.g:2010:3: ruleBIMCertification
            {
             before(grammarAccess.getBIMMixerAppAccess().getCertificationsBIMCertificationParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBIMCertification();

            state._fsp--;

             after(grammarAccess.getBIMMixerAppAccess().getCertificationsBIMCertificationParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__BIMMixerApp__CertificationsAssignment_4_0"


    // $ANTLR start "rule__BIMMixerApp__CertificationsAssignment_4_1"
    // InternalBIMMixerApp.g:2019:1: rule__BIMMixerApp__CertificationsAssignment_4_1 : ( ruleBIMCertification ) ;
    public final void rule__BIMMixerApp__CertificationsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:2023:1: ( ( ruleBIMCertification ) )
            // InternalBIMMixerApp.g:2024:2: ( ruleBIMCertification )
            {
            // InternalBIMMixerApp.g:2024:2: ( ruleBIMCertification )
            // InternalBIMMixerApp.g:2025:3: ruleBIMCertification
            {
             before(grammarAccess.getBIMMixerAppAccess().getCertificationsBIMCertificationParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBIMCertification();

            state._fsp--;

             after(grammarAccess.getBIMMixerAppAccess().getCertificationsBIMCertificationParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__BIMMixerApp__CertificationsAssignment_4_1"


    // $ANTLR start "rule__BreeamCertification__NameAssignment_1"
    // InternalBIMMixerApp.g:2034:1: rule__BreeamCertification__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__BreeamCertification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:2038:1: ( ( ruleEString ) )
            // InternalBIMMixerApp.g:2039:2: ( ruleEString )
            {
            // InternalBIMMixerApp.g:2039:2: ( ruleEString )
            // InternalBIMMixerApp.g:2040:3: ruleEString
            {
             before(grammarAccess.getBreeamCertificationAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBreeamCertificationAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__BreeamCertification__NameAssignment_1"


    // $ANTLR start "rule__BreeamCertification__CategoriesAssignment_3"
    // InternalBIMMixerApp.g:2049:1: rule__BreeamCertification__CategoriesAssignment_3 : ( ruleCategory ) ;
    public final void rule__BreeamCertification__CategoriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:2053:1: ( ( ruleCategory ) )
            // InternalBIMMixerApp.g:2054:2: ( ruleCategory )
            {
            // InternalBIMMixerApp.g:2054:2: ( ruleCategory )
            // InternalBIMMixerApp.g:2055:3: ruleCategory
            {
             before(grammarAccess.getBreeamCertificationAccess().getCategoriesCategoryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCategory();

            state._fsp--;

             after(grammarAccess.getBreeamCertificationAccess().getCategoriesCategoryParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__BreeamCertification__CategoriesAssignment_3"


    // $ANTLR start "rule__BreeamCertification__CategoriesAssignment_4_1"
    // InternalBIMMixerApp.g:2064:1: rule__BreeamCertification__CategoriesAssignment_4_1 : ( ruleCategory ) ;
    public final void rule__BreeamCertification__CategoriesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:2068:1: ( ( ruleCategory ) )
            // InternalBIMMixerApp.g:2069:2: ( ruleCategory )
            {
            // InternalBIMMixerApp.g:2069:2: ( ruleCategory )
            // InternalBIMMixerApp.g:2070:3: ruleCategory
            {
             before(grammarAccess.getBreeamCertificationAccess().getCategoriesCategoryParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCategory();

            state._fsp--;

             after(grammarAccess.getBreeamCertificationAccess().getCategoriesCategoryParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__BreeamCertification__CategoriesAssignment_4_1"


    // $ANTLR start "rule__BreeamCertification__ConnectedCertificationAssignment_5_1"
    // InternalBIMMixerApp.g:2079:1: rule__BreeamCertification__ConnectedCertificationAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__BreeamCertification__ConnectedCertificationAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:2083:1: ( ( ( ruleEString ) ) )
            // InternalBIMMixerApp.g:2084:2: ( ( ruleEString ) )
            {
            // InternalBIMMixerApp.g:2084:2: ( ( ruleEString ) )
            // InternalBIMMixerApp.g:2085:3: ( ruleEString )
            {
             before(grammarAccess.getBreeamCertificationAccess().getConnectedCertificationBIMCertificationCrossReference_5_1_0()); 
            // InternalBIMMixerApp.g:2086:3: ( ruleEString )
            // InternalBIMMixerApp.g:2087:4: ruleEString
            {
             before(grammarAccess.getBreeamCertificationAccess().getConnectedCertificationBIMCertificationEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBreeamCertificationAccess().getConnectedCertificationBIMCertificationEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getBreeamCertificationAccess().getConnectedCertificationBIMCertificationCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__BreeamCertification__ConnectedCertificationAssignment_5_1"


    // $ANTLR start "rule__LEEDCertification__NameAssignment_1"
    // InternalBIMMixerApp.g:2098:1: rule__LEEDCertification__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__LEEDCertification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:2102:1: ( ( ruleEString ) )
            // InternalBIMMixerApp.g:2103:2: ( ruleEString )
            {
            // InternalBIMMixerApp.g:2103:2: ( ruleEString )
            // InternalBIMMixerApp.g:2104:3: ruleEString
            {
             before(grammarAccess.getLEEDCertificationAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLEEDCertificationAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__LEEDCertification__NameAssignment_1"


    // $ANTLR start "rule__LEEDCertification__CategoriesAssignment_3"
    // InternalBIMMixerApp.g:2113:1: rule__LEEDCertification__CategoriesAssignment_3 : ( ruleCategory ) ;
    public final void rule__LEEDCertification__CategoriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:2117:1: ( ( ruleCategory ) )
            // InternalBIMMixerApp.g:2118:2: ( ruleCategory )
            {
            // InternalBIMMixerApp.g:2118:2: ( ruleCategory )
            // InternalBIMMixerApp.g:2119:3: ruleCategory
            {
             before(grammarAccess.getLEEDCertificationAccess().getCategoriesCategoryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCategory();

            state._fsp--;

             after(grammarAccess.getLEEDCertificationAccess().getCategoriesCategoryParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__LEEDCertification__CategoriesAssignment_3"


    // $ANTLR start "rule__LEEDCertification__CategoriesAssignment_4_1"
    // InternalBIMMixerApp.g:2128:1: rule__LEEDCertification__CategoriesAssignment_4_1 : ( ruleCategory ) ;
    public final void rule__LEEDCertification__CategoriesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:2132:1: ( ( ruleCategory ) )
            // InternalBIMMixerApp.g:2133:2: ( ruleCategory )
            {
            // InternalBIMMixerApp.g:2133:2: ( ruleCategory )
            // InternalBIMMixerApp.g:2134:3: ruleCategory
            {
             before(grammarAccess.getLEEDCertificationAccess().getCategoriesCategoryParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCategory();

            state._fsp--;

             after(grammarAccess.getLEEDCertificationAccess().getCategoriesCategoryParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__LEEDCertification__CategoriesAssignment_4_1"


    // $ANTLR start "rule__LEEDCertification__ConnectedCertificationAssignment_5_1"
    // InternalBIMMixerApp.g:2143:1: rule__LEEDCertification__ConnectedCertificationAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__LEEDCertification__ConnectedCertificationAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:2147:1: ( ( ( ruleEString ) ) )
            // InternalBIMMixerApp.g:2148:2: ( ( ruleEString ) )
            {
            // InternalBIMMixerApp.g:2148:2: ( ( ruleEString ) )
            // InternalBIMMixerApp.g:2149:3: ( ruleEString )
            {
             before(grammarAccess.getLEEDCertificationAccess().getConnectedCertificationBIMCertificationCrossReference_5_1_0()); 
            // InternalBIMMixerApp.g:2150:3: ( ruleEString )
            // InternalBIMMixerApp.g:2151:4: ruleEString
            {
             before(grammarAccess.getLEEDCertificationAccess().getConnectedCertificationBIMCertificationEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLEEDCertificationAccess().getConnectedCertificationBIMCertificationEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getLEEDCertificationAccess().getConnectedCertificationBIMCertificationCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__LEEDCertification__ConnectedCertificationAssignment_5_1"


    // $ANTLR start "rule__Category__NameAssignment_1"
    // InternalBIMMixerApp.g:2162:1: rule__Category__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Category__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:2166:1: ( ( ruleEString ) )
            // InternalBIMMixerApp.g:2167:2: ( ruleEString )
            {
            // InternalBIMMixerApp.g:2167:2: ( ruleEString )
            // InternalBIMMixerApp.g:2168:3: ruleEString
            {
             before(grammarAccess.getCategoryAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCategoryAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Category__NameAssignment_1"


    // $ANTLR start "rule__Category__SubCategoriesAssignment_3"
    // InternalBIMMixerApp.g:2177:1: rule__Category__SubCategoriesAssignment_3 : ( ruleSubcategory ) ;
    public final void rule__Category__SubCategoriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:2181:1: ( ( ruleSubcategory ) )
            // InternalBIMMixerApp.g:2182:2: ( ruleSubcategory )
            {
            // InternalBIMMixerApp.g:2182:2: ( ruleSubcategory )
            // InternalBIMMixerApp.g:2183:3: ruleSubcategory
            {
             before(grammarAccess.getCategoryAccess().getSubCategoriesSubcategoryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSubcategory();

            state._fsp--;

             after(grammarAccess.getCategoryAccess().getSubCategoriesSubcategoryParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Category__SubCategoriesAssignment_3"


    // $ANTLR start "rule__Category__SubCategoriesAssignment_4_1"
    // InternalBIMMixerApp.g:2192:1: rule__Category__SubCategoriesAssignment_4_1 : ( ruleSubcategory ) ;
    public final void rule__Category__SubCategoriesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:2196:1: ( ( ruleSubcategory ) )
            // InternalBIMMixerApp.g:2197:2: ( ruleSubcategory )
            {
            // InternalBIMMixerApp.g:2197:2: ( ruleSubcategory )
            // InternalBIMMixerApp.g:2198:3: ruleSubcategory
            {
             before(grammarAccess.getCategoryAccess().getSubCategoriesSubcategoryParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSubcategory();

            state._fsp--;

             after(grammarAccess.getCategoryAccess().getSubCategoriesSubcategoryParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Category__SubCategoriesAssignment_4_1"


    // $ANTLR start "rule__Subcategory__NameAssignment_1"
    // InternalBIMMixerApp.g:2207:1: rule__Subcategory__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Subcategory__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:2211:1: ( ( ruleEString ) )
            // InternalBIMMixerApp.g:2212:2: ( ruleEString )
            {
            // InternalBIMMixerApp.g:2212:2: ( ruleEString )
            // InternalBIMMixerApp.g:2213:3: ruleEString
            {
             before(grammarAccess.getSubcategoryAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubcategoryAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Subcategory__NameAssignment_1"


    // $ANTLR start "rule__Subcategory__TextAssignment_3_1"
    // InternalBIMMixerApp.g:2222:1: rule__Subcategory__TextAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Subcategory__TextAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:2226:1: ( ( ruleEString ) )
            // InternalBIMMixerApp.g:2227:2: ( ruleEString )
            {
            // InternalBIMMixerApp.g:2227:2: ( ruleEString )
            // InternalBIMMixerApp.g:2228:3: ruleEString
            {
             before(grammarAccess.getSubcategoryAccess().getTextEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubcategoryAccess().getTextEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Subcategory__TextAssignment_3_1"


    // $ANTLR start "rule__Subcategory__PointsAssignment_4_1"
    // InternalBIMMixerApp.g:2237:1: rule__Subcategory__PointsAssignment_4_1 : ( ruleEFloat ) ;
    public final void rule__Subcategory__PointsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:2241:1: ( ( ruleEFloat ) )
            // InternalBIMMixerApp.g:2242:2: ( ruleEFloat )
            {
            // InternalBIMMixerApp.g:2242:2: ( ruleEFloat )
            // InternalBIMMixerApp.g:2243:3: ruleEFloat
            {
             before(grammarAccess.getSubcategoryAccess().getPointsEFloatParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getSubcategoryAccess().getPointsEFloatParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Subcategory__PointsAssignment_4_1"


    // $ANTLR start "rule__Subcategory__ObtainedPointsAssignment_5_1"
    // InternalBIMMixerApp.g:2252:1: rule__Subcategory__ObtainedPointsAssignment_5_1 : ( ruleEFloat ) ;
    public final void rule__Subcategory__ObtainedPointsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:2256:1: ( ( ruleEFloat ) )
            // InternalBIMMixerApp.g:2257:2: ( ruleEFloat )
            {
            // InternalBIMMixerApp.g:2257:2: ( ruleEFloat )
            // InternalBIMMixerApp.g:2258:3: ruleEFloat
            {
             before(grammarAccess.getSubcategoryAccess().getObtainedPointsEFloatParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getSubcategoryAccess().getObtainedPointsEFloatParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Subcategory__ObtainedPointsAssignment_5_1"


    // $ANTLR start "rule__Subcategory__ConnectionAssignment_6_1"
    // InternalBIMMixerApp.g:2267:1: rule__Subcategory__ConnectionAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Subcategory__ConnectionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:2271:1: ( ( ( ruleEString ) ) )
            // InternalBIMMixerApp.g:2272:2: ( ( ruleEString ) )
            {
            // InternalBIMMixerApp.g:2272:2: ( ( ruleEString ) )
            // InternalBIMMixerApp.g:2273:3: ( ruleEString )
            {
             before(grammarAccess.getSubcategoryAccess().getConnectionSubcategoryCrossReference_6_1_0()); 
            // InternalBIMMixerApp.g:2274:3: ( ruleEString )
            // InternalBIMMixerApp.g:2275:4: ruleEString
            {
             before(grammarAccess.getSubcategoryAccess().getConnectionSubcategoryEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubcategoryAccess().getConnectionSubcategoryEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getSubcategoryAccess().getConnectionSubcategoryCrossReference_6_1_0()); 

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
    // $ANTLR end "rule__Subcategory__ConnectionAssignment_6_1"


    // $ANTLR start "rule__Subcategory__RequiredAssignment_7"
    // InternalBIMMixerApp.g:2286:1: rule__Subcategory__RequiredAssignment_7 : ( ( 'required' ) ) ;
    public final void rule__Subcategory__RequiredAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBIMMixerApp.g:2290:1: ( ( ( 'required' ) ) )
            // InternalBIMMixerApp.g:2291:2: ( ( 'required' ) )
            {
            // InternalBIMMixerApp.g:2291:2: ( ( 'required' ) )
            // InternalBIMMixerApp.g:2292:3: ( 'required' )
            {
             before(grammarAccess.getSubcategoryAccess().getRequiredRequiredKeyword_7_0()); 
            // InternalBIMMixerApp.g:2293:3: ( 'required' )
            // InternalBIMMixerApp.g:2294:4: 'required'
            {
             before(grammarAccess.getSubcategoryAccess().getRequiredRequiredKeyword_7_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSubcategoryAccess().getRequiredRequiredKeyword_7_0()); 

            }

             after(grammarAccess.getSubcategoryAccess().getRequiredRequiredKeyword_7_0()); 

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
    // $ANTLR end "rule__Subcategory__RequiredAssignment_7"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000108002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000013C20000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000C000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000040L});

}