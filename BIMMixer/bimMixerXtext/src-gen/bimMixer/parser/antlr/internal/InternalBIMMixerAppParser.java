package bimMixer.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import bimMixer.services.BIMMixerAppGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBIMMixerAppParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BIMMixerApp'", "':'", "'BreeamCertification'", "'{'", "','", "'connectedCertification:'", "'}'", "'LEEDCertification'", "'Category'", "'text:'", "'points:'", "'obtainedPoints:'", "'connection:'", "'required'", "'-'", "'.'", "'E'", "'e'"
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

        public InternalBIMMixerAppParser(TokenStream input, BIMMixerAppGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "BIMMixerApp";
       	}

       	@Override
       	protected BIMMixerAppGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleBIMMixerApp"
    // InternalBIMMixerApp.g:64:1: entryRuleBIMMixerApp returns [EObject current=null] : iv_ruleBIMMixerApp= ruleBIMMixerApp EOF ;
    public final EObject entryRuleBIMMixerApp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBIMMixerApp = null;


        try {
            // InternalBIMMixerApp.g:64:52: (iv_ruleBIMMixerApp= ruleBIMMixerApp EOF )
            // InternalBIMMixerApp.g:65:2: iv_ruleBIMMixerApp= ruleBIMMixerApp EOF
            {
             newCompositeNode(grammarAccess.getBIMMixerAppRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBIMMixerApp=ruleBIMMixerApp();

            state._fsp--;

             current =iv_ruleBIMMixerApp; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBIMMixerApp"


    // $ANTLR start "ruleBIMMixerApp"
    // InternalBIMMixerApp.g:71:1: ruleBIMMixerApp returns [EObject current=null] : ( () otherlv_1= 'BIMMixerApp' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( (lv_certifications_4_0= ruleBIMCertification ) ) ( (lv_certifications_5_0= ruleBIMCertification ) )* )? ) ;
    public final EObject ruleBIMMixerApp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_certifications_4_0 = null;

        EObject lv_certifications_5_0 = null;



        	enterRule();

        try {
            // InternalBIMMixerApp.g:77:2: ( ( () otherlv_1= 'BIMMixerApp' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( (lv_certifications_4_0= ruleBIMCertification ) ) ( (lv_certifications_5_0= ruleBIMCertification ) )* )? ) )
            // InternalBIMMixerApp.g:78:2: ( () otherlv_1= 'BIMMixerApp' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( (lv_certifications_4_0= ruleBIMCertification ) ) ( (lv_certifications_5_0= ruleBIMCertification ) )* )? )
            {
            // InternalBIMMixerApp.g:78:2: ( () otherlv_1= 'BIMMixerApp' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( (lv_certifications_4_0= ruleBIMCertification ) ) ( (lv_certifications_5_0= ruleBIMCertification ) )* )? )
            // InternalBIMMixerApp.g:79:3: () otherlv_1= 'BIMMixerApp' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( (lv_certifications_4_0= ruleBIMCertification ) ) ( (lv_certifications_5_0= ruleBIMCertification ) )* )?
            {
            // InternalBIMMixerApp.g:79:3: ()
            // InternalBIMMixerApp.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBIMMixerAppAccess().getBIMMixerAppAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBIMMixerAppAccess().getBIMMixerAppKeyword_1());
            		
            // InternalBIMMixerApp.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBIMMixerApp.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalBIMMixerApp.g:91:4: (lv_name_2_0= ruleEString )
            // InternalBIMMixerApp.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBIMMixerAppAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBIMMixerAppRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"bimMixer.BIMMixerApp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getBIMMixerAppAccess().getColonKeyword_3());
            		
            // InternalBIMMixerApp.g:113:3: ( ( (lv_certifications_4_0= ruleBIMCertification ) ) ( (lv_certifications_5_0= ruleBIMCertification ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13||LA2_0==18) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBIMMixerApp.g:114:4: ( (lv_certifications_4_0= ruleBIMCertification ) ) ( (lv_certifications_5_0= ruleBIMCertification ) )*
                    {
                    // InternalBIMMixerApp.g:114:4: ( (lv_certifications_4_0= ruleBIMCertification ) )
                    // InternalBIMMixerApp.g:115:5: (lv_certifications_4_0= ruleBIMCertification )
                    {
                    // InternalBIMMixerApp.g:115:5: (lv_certifications_4_0= ruleBIMCertification )
                    // InternalBIMMixerApp.g:116:6: lv_certifications_4_0= ruleBIMCertification
                    {

                    						newCompositeNode(grammarAccess.getBIMMixerAppAccess().getCertificationsBIMCertificationParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_certifications_4_0=ruleBIMCertification();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBIMMixerAppRule());
                    						}
                    						add(
                    							current,
                    							"certifications",
                    							lv_certifications_4_0,
                    							"bimMixer.BIMMixerApp.BIMCertification");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBIMMixerApp.g:133:4: ( (lv_certifications_5_0= ruleBIMCertification ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13||LA1_0==18) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalBIMMixerApp.g:134:5: (lv_certifications_5_0= ruleBIMCertification )
                    	    {
                    	    // InternalBIMMixerApp.g:134:5: (lv_certifications_5_0= ruleBIMCertification )
                    	    // InternalBIMMixerApp.g:135:6: lv_certifications_5_0= ruleBIMCertification
                    	    {

                    	    						newCompositeNode(grammarAccess.getBIMMixerAppAccess().getCertificationsBIMCertificationParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_5);
                    	    lv_certifications_5_0=ruleBIMCertification();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getBIMMixerAppRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"certifications",
                    	    							lv_certifications_5_0,
                    	    							"bimMixer.BIMMixerApp.BIMCertification");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBIMMixerApp"


    // $ANTLR start "entryRuleBIMCertification"
    // InternalBIMMixerApp.g:157:1: entryRuleBIMCertification returns [EObject current=null] : iv_ruleBIMCertification= ruleBIMCertification EOF ;
    public final EObject entryRuleBIMCertification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBIMCertification = null;


        try {
            // InternalBIMMixerApp.g:157:57: (iv_ruleBIMCertification= ruleBIMCertification EOF )
            // InternalBIMMixerApp.g:158:2: iv_ruleBIMCertification= ruleBIMCertification EOF
            {
             newCompositeNode(grammarAccess.getBIMCertificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBIMCertification=ruleBIMCertification();

            state._fsp--;

             current =iv_ruleBIMCertification; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBIMCertification"


    // $ANTLR start "ruleBIMCertification"
    // InternalBIMMixerApp.g:164:1: ruleBIMCertification returns [EObject current=null] : (this_BreeamCertification_0= ruleBreeamCertification | this_LEEDCertification_1= ruleLEEDCertification ) ;
    public final EObject ruleBIMCertification() throws RecognitionException {
        EObject current = null;

        EObject this_BreeamCertification_0 = null;

        EObject this_LEEDCertification_1 = null;



        	enterRule();

        try {
            // InternalBIMMixerApp.g:170:2: ( (this_BreeamCertification_0= ruleBreeamCertification | this_LEEDCertification_1= ruleLEEDCertification ) )
            // InternalBIMMixerApp.g:171:2: (this_BreeamCertification_0= ruleBreeamCertification | this_LEEDCertification_1= ruleLEEDCertification )
            {
            // InternalBIMMixerApp.g:171:2: (this_BreeamCertification_0= ruleBreeamCertification | this_LEEDCertification_1= ruleLEEDCertification )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBIMMixerApp.g:172:3: this_BreeamCertification_0= ruleBreeamCertification
                    {

                    			newCompositeNode(grammarAccess.getBIMCertificationAccess().getBreeamCertificationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BreeamCertification_0=ruleBreeamCertification();

                    state._fsp--;


                    			current = this_BreeamCertification_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBIMMixerApp.g:181:3: this_LEEDCertification_1= ruleLEEDCertification
                    {

                    			newCompositeNode(grammarAccess.getBIMCertificationAccess().getLEEDCertificationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LEEDCertification_1=ruleLEEDCertification();

                    state._fsp--;


                    			current = this_LEEDCertification_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBIMCertification"


    // $ANTLR start "entryRuleBreeamCertification"
    // InternalBIMMixerApp.g:193:1: entryRuleBreeamCertification returns [EObject current=null] : iv_ruleBreeamCertification= ruleBreeamCertification EOF ;
    public final EObject entryRuleBreeamCertification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreeamCertification = null;


        try {
            // InternalBIMMixerApp.g:193:60: (iv_ruleBreeamCertification= ruleBreeamCertification EOF )
            // InternalBIMMixerApp.g:194:2: iv_ruleBreeamCertification= ruleBreeamCertification EOF
            {
             newCompositeNode(grammarAccess.getBreeamCertificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBreeamCertification=ruleBreeamCertification();

            state._fsp--;

             current =iv_ruleBreeamCertification; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBreeamCertification"


    // $ANTLR start "ruleBreeamCertification"
    // InternalBIMMixerApp.g:200:1: ruleBreeamCertification returns [EObject current=null] : (otherlv_0= 'BreeamCertification' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_Categories_3_0= ruleCategory ) ) (otherlv_4= ',' ( (lv_Categories_5_0= ruleCategory ) ) )* (otherlv_6= 'connectedCertification:' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleBreeamCertification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_Categories_3_0 = null;

        EObject lv_Categories_5_0 = null;



        	enterRule();

        try {
            // InternalBIMMixerApp.g:206:2: ( (otherlv_0= 'BreeamCertification' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_Categories_3_0= ruleCategory ) ) (otherlv_4= ',' ( (lv_Categories_5_0= ruleCategory ) ) )* (otherlv_6= 'connectedCertification:' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalBIMMixerApp.g:207:2: (otherlv_0= 'BreeamCertification' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_Categories_3_0= ruleCategory ) ) (otherlv_4= ',' ( (lv_Categories_5_0= ruleCategory ) ) )* (otherlv_6= 'connectedCertification:' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalBIMMixerApp.g:207:2: (otherlv_0= 'BreeamCertification' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_Categories_3_0= ruleCategory ) ) (otherlv_4= ',' ( (lv_Categories_5_0= ruleCategory ) ) )* (otherlv_6= 'connectedCertification:' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalBIMMixerApp.g:208:3: otherlv_0= 'BreeamCertification' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_Categories_3_0= ruleCategory ) ) (otherlv_4= ',' ( (lv_Categories_5_0= ruleCategory ) ) )* (otherlv_6= 'connectedCertification:' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBreeamCertificationAccess().getBreeamCertificationKeyword_0());
            		
            // InternalBIMMixerApp.g:212:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBIMMixerApp.g:213:4: (lv_name_1_0= ruleEString )
            {
            // InternalBIMMixerApp.g:213:4: (lv_name_1_0= ruleEString )
            // InternalBIMMixerApp.g:214:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBreeamCertificationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBreeamCertificationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"bimMixer.BIMMixerApp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getBreeamCertificationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBIMMixerApp.g:235:3: ( (lv_Categories_3_0= ruleCategory ) )
            // InternalBIMMixerApp.g:236:4: (lv_Categories_3_0= ruleCategory )
            {
            // InternalBIMMixerApp.g:236:4: (lv_Categories_3_0= ruleCategory )
            // InternalBIMMixerApp.g:237:5: lv_Categories_3_0= ruleCategory
            {

            					newCompositeNode(grammarAccess.getBreeamCertificationAccess().getCategoriesCategoryParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_Categories_3_0=ruleCategory();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBreeamCertificationRule());
            					}
            					add(
            						current,
            						"Categories",
            						lv_Categories_3_0,
            						"bimMixer.BIMMixerApp.Category");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBIMMixerApp.g:254:3: (otherlv_4= ',' ( (lv_Categories_5_0= ruleCategory ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBIMMixerApp.g:255:4: otherlv_4= ',' ( (lv_Categories_5_0= ruleCategory ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_7); 

            	    				newLeafNode(otherlv_4, grammarAccess.getBreeamCertificationAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalBIMMixerApp.g:259:4: ( (lv_Categories_5_0= ruleCategory ) )
            	    // InternalBIMMixerApp.g:260:5: (lv_Categories_5_0= ruleCategory )
            	    {
            	    // InternalBIMMixerApp.g:260:5: (lv_Categories_5_0= ruleCategory )
            	    // InternalBIMMixerApp.g:261:6: lv_Categories_5_0= ruleCategory
            	    {

            	    						newCompositeNode(grammarAccess.getBreeamCertificationAccess().getCategoriesCategoryParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_Categories_5_0=ruleCategory();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBreeamCertificationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Categories",
            	    							lv_Categories_5_0,
            	    							"bimMixer.BIMMixerApp.Category");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalBIMMixerApp.g:279:3: (otherlv_6= 'connectedCertification:' ( ( ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBIMMixerApp.g:280:4: otherlv_6= 'connectedCertification:' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getBreeamCertificationAccess().getConnectedCertificationKeyword_5_0());
                    			
                    // InternalBIMMixerApp.g:284:4: ( ( ruleEString ) )
                    // InternalBIMMixerApp.g:285:5: ( ruleEString )
                    {
                    // InternalBIMMixerApp.g:285:5: ( ruleEString )
                    // InternalBIMMixerApp.g:286:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBreeamCertificationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBreeamCertificationAccess().getConnectedCertificationBIMCertificationCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getBreeamCertificationAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBreeamCertification"


    // $ANTLR start "entryRuleLEEDCertification"
    // InternalBIMMixerApp.g:309:1: entryRuleLEEDCertification returns [EObject current=null] : iv_ruleLEEDCertification= ruleLEEDCertification EOF ;
    public final EObject entryRuleLEEDCertification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLEEDCertification = null;


        try {
            // InternalBIMMixerApp.g:309:58: (iv_ruleLEEDCertification= ruleLEEDCertification EOF )
            // InternalBIMMixerApp.g:310:2: iv_ruleLEEDCertification= ruleLEEDCertification EOF
            {
             newCompositeNode(grammarAccess.getLEEDCertificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLEEDCertification=ruleLEEDCertification();

            state._fsp--;

             current =iv_ruleLEEDCertification; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLEEDCertification"


    // $ANTLR start "ruleLEEDCertification"
    // InternalBIMMixerApp.g:316:1: ruleLEEDCertification returns [EObject current=null] : (otherlv_0= 'LEEDCertification' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_Categories_3_0= ruleCategory ) ) (otherlv_4= ',' ( (lv_Categories_5_0= ruleCategory ) ) )* (otherlv_6= 'connectedCertification:' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleLEEDCertification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_Categories_3_0 = null;

        EObject lv_Categories_5_0 = null;



        	enterRule();

        try {
            // InternalBIMMixerApp.g:322:2: ( (otherlv_0= 'LEEDCertification' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_Categories_3_0= ruleCategory ) ) (otherlv_4= ',' ( (lv_Categories_5_0= ruleCategory ) ) )* (otherlv_6= 'connectedCertification:' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalBIMMixerApp.g:323:2: (otherlv_0= 'LEEDCertification' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_Categories_3_0= ruleCategory ) ) (otherlv_4= ',' ( (lv_Categories_5_0= ruleCategory ) ) )* (otherlv_6= 'connectedCertification:' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalBIMMixerApp.g:323:2: (otherlv_0= 'LEEDCertification' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_Categories_3_0= ruleCategory ) ) (otherlv_4= ',' ( (lv_Categories_5_0= ruleCategory ) ) )* (otherlv_6= 'connectedCertification:' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalBIMMixerApp.g:324:3: otherlv_0= 'LEEDCertification' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_Categories_3_0= ruleCategory ) ) (otherlv_4= ',' ( (lv_Categories_5_0= ruleCategory ) ) )* (otherlv_6= 'connectedCertification:' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLEEDCertificationAccess().getLEEDCertificationKeyword_0());
            		
            // InternalBIMMixerApp.g:328:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBIMMixerApp.g:329:4: (lv_name_1_0= ruleEString )
            {
            // InternalBIMMixerApp.g:329:4: (lv_name_1_0= ruleEString )
            // InternalBIMMixerApp.g:330:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLEEDCertificationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLEEDCertificationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"bimMixer.BIMMixerApp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getLEEDCertificationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBIMMixerApp.g:351:3: ( (lv_Categories_3_0= ruleCategory ) )
            // InternalBIMMixerApp.g:352:4: (lv_Categories_3_0= ruleCategory )
            {
            // InternalBIMMixerApp.g:352:4: (lv_Categories_3_0= ruleCategory )
            // InternalBIMMixerApp.g:353:5: lv_Categories_3_0= ruleCategory
            {

            					newCompositeNode(grammarAccess.getLEEDCertificationAccess().getCategoriesCategoryParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_Categories_3_0=ruleCategory();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLEEDCertificationRule());
            					}
            					add(
            						current,
            						"Categories",
            						lv_Categories_3_0,
            						"bimMixer.BIMMixerApp.Category");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBIMMixerApp.g:370:3: (otherlv_4= ',' ( (lv_Categories_5_0= ruleCategory ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBIMMixerApp.g:371:4: otherlv_4= ',' ( (lv_Categories_5_0= ruleCategory ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_7); 

            	    				newLeafNode(otherlv_4, grammarAccess.getLEEDCertificationAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalBIMMixerApp.g:375:4: ( (lv_Categories_5_0= ruleCategory ) )
            	    // InternalBIMMixerApp.g:376:5: (lv_Categories_5_0= ruleCategory )
            	    {
            	    // InternalBIMMixerApp.g:376:5: (lv_Categories_5_0= ruleCategory )
            	    // InternalBIMMixerApp.g:377:6: lv_Categories_5_0= ruleCategory
            	    {

            	    						newCompositeNode(grammarAccess.getLEEDCertificationAccess().getCategoriesCategoryParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_Categories_5_0=ruleCategory();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLEEDCertificationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Categories",
            	    							lv_Categories_5_0,
            	    							"bimMixer.BIMMixerApp.Category");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalBIMMixerApp.g:395:3: (otherlv_6= 'connectedCertification:' ( ( ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBIMMixerApp.g:396:4: otherlv_6= 'connectedCertification:' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getLEEDCertificationAccess().getConnectedCertificationKeyword_5_0());
                    			
                    // InternalBIMMixerApp.g:400:4: ( ( ruleEString ) )
                    // InternalBIMMixerApp.g:401:5: ( ruleEString )
                    {
                    // InternalBIMMixerApp.g:401:5: ( ruleEString )
                    // InternalBIMMixerApp.g:402:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLEEDCertificationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLEEDCertificationAccess().getConnectedCertificationBIMCertificationCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getLEEDCertificationAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLEEDCertification"


    // $ANTLR start "entryRuleCategory"
    // InternalBIMMixerApp.g:425:1: entryRuleCategory returns [EObject current=null] : iv_ruleCategory= ruleCategory EOF ;
    public final EObject entryRuleCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategory = null;


        try {
            // InternalBIMMixerApp.g:425:49: (iv_ruleCategory= ruleCategory EOF )
            // InternalBIMMixerApp.g:426:2: iv_ruleCategory= ruleCategory EOF
            {
             newCompositeNode(grammarAccess.getCategoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCategory=ruleCategory();

            state._fsp--;

             current =iv_ruleCategory; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCategory"


    // $ANTLR start "ruleCategory"
    // InternalBIMMixerApp.g:432:1: ruleCategory returns [EObject current=null] : (otherlv_0= 'Category' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_subCategories_3_0= ruleSubcategory ) ) (otherlv_4= ',' ( (lv_subCategories_5_0= ruleSubcategory ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleCategory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_subCategories_3_0 = null;

        EObject lv_subCategories_5_0 = null;



        	enterRule();

        try {
            // InternalBIMMixerApp.g:438:2: ( (otherlv_0= 'Category' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_subCategories_3_0= ruleSubcategory ) ) (otherlv_4= ',' ( (lv_subCategories_5_0= ruleSubcategory ) ) )* otherlv_6= '}' ) )
            // InternalBIMMixerApp.g:439:2: (otherlv_0= 'Category' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_subCategories_3_0= ruleSubcategory ) ) (otherlv_4= ',' ( (lv_subCategories_5_0= ruleSubcategory ) ) )* otherlv_6= '}' )
            {
            // InternalBIMMixerApp.g:439:2: (otherlv_0= 'Category' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_subCategories_3_0= ruleSubcategory ) ) (otherlv_4= ',' ( (lv_subCategories_5_0= ruleSubcategory ) ) )* otherlv_6= '}' )
            // InternalBIMMixerApp.g:440:3: otherlv_0= 'Category' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_subCategories_3_0= ruleSubcategory ) ) (otherlv_4= ',' ( (lv_subCategories_5_0= ruleSubcategory ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCategoryAccess().getCategoryKeyword_0());
            		
            // InternalBIMMixerApp.g:444:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBIMMixerApp.g:445:4: (lv_name_1_0= ruleEString )
            {
            // InternalBIMMixerApp.g:445:4: (lv_name_1_0= ruleEString )
            // InternalBIMMixerApp.g:446:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCategoryAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCategoryRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"bimMixer.BIMMixerApp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCategoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBIMMixerApp.g:467:3: ( (lv_subCategories_3_0= ruleSubcategory ) )
            // InternalBIMMixerApp.g:468:4: (lv_subCategories_3_0= ruleSubcategory )
            {
            // InternalBIMMixerApp.g:468:4: (lv_subCategories_3_0= ruleSubcategory )
            // InternalBIMMixerApp.g:469:5: lv_subCategories_3_0= ruleSubcategory
            {

            					newCompositeNode(grammarAccess.getCategoryAccess().getSubCategoriesSubcategoryParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_subCategories_3_0=ruleSubcategory();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCategoryRule());
            					}
            					add(
            						current,
            						"subCategories",
            						lv_subCategories_3_0,
            						"bimMixer.BIMMixerApp.Subcategory");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBIMMixerApp.g:486:3: (otherlv_4= ',' ( (lv_subCategories_5_0= ruleSubcategory ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBIMMixerApp.g:487:4: otherlv_4= ',' ( (lv_subCategories_5_0= ruleSubcategory ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getCategoryAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalBIMMixerApp.g:491:4: ( (lv_subCategories_5_0= ruleSubcategory ) )
            	    // InternalBIMMixerApp.g:492:5: (lv_subCategories_5_0= ruleSubcategory )
            	    {
            	    // InternalBIMMixerApp.g:492:5: (lv_subCategories_5_0= ruleSubcategory )
            	    // InternalBIMMixerApp.g:493:6: lv_subCategories_5_0= ruleSubcategory
            	    {

            	    						newCompositeNode(grammarAccess.getCategoryAccess().getSubCategoriesSubcategoryParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_subCategories_5_0=ruleSubcategory();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCategoryRule());
            	    						}
            	    						add(
            	    							current,
            	    							"subCategories",
            	    							lv_subCategories_5_0,
            	    							"bimMixer.BIMMixerApp.Subcategory");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCategoryAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCategory"


    // $ANTLR start "entryRuleSubcategory"
    // InternalBIMMixerApp.g:519:1: entryRuleSubcategory returns [EObject current=null] : iv_ruleSubcategory= ruleSubcategory EOF ;
    public final EObject entryRuleSubcategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubcategory = null;


        try {
            // InternalBIMMixerApp.g:519:52: (iv_ruleSubcategory= ruleSubcategory EOF )
            // InternalBIMMixerApp.g:520:2: iv_ruleSubcategory= ruleSubcategory EOF
            {
             newCompositeNode(grammarAccess.getSubcategoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubcategory=ruleSubcategory();

            state._fsp--;

             current =iv_ruleSubcategory; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSubcategory"


    // $ANTLR start "ruleSubcategory"
    // InternalBIMMixerApp.g:526:1: ruleSubcategory returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )? (otherlv_5= 'points:' ( (lv_points_6_0= ruleEFloat ) ) )? (otherlv_7= 'obtainedPoints:' ( (lv_obtainedPoints_8_0= ruleEFloat ) ) )? (otherlv_9= 'connection:' ( ( ruleEString ) ) )? ( (lv_required_11_0= 'required' ) )? otherlv_12= '}' ) ;
    public final EObject ruleSubcategory() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_required_11_0=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_text_4_0 = null;

        AntlrDatatypeRuleToken lv_points_6_0 = null;

        AntlrDatatypeRuleToken lv_obtainedPoints_8_0 = null;



        	enterRule();

        try {
            // InternalBIMMixerApp.g:532:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )? (otherlv_5= 'points:' ( (lv_points_6_0= ruleEFloat ) ) )? (otherlv_7= 'obtainedPoints:' ( (lv_obtainedPoints_8_0= ruleEFloat ) ) )? (otherlv_9= 'connection:' ( ( ruleEString ) ) )? ( (lv_required_11_0= 'required' ) )? otherlv_12= '}' ) )
            // InternalBIMMixerApp.g:533:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )? (otherlv_5= 'points:' ( (lv_points_6_0= ruleEFloat ) ) )? (otherlv_7= 'obtainedPoints:' ( (lv_obtainedPoints_8_0= ruleEFloat ) ) )? (otherlv_9= 'connection:' ( ( ruleEString ) ) )? ( (lv_required_11_0= 'required' ) )? otherlv_12= '}' )
            {
            // InternalBIMMixerApp.g:533:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )? (otherlv_5= 'points:' ( (lv_points_6_0= ruleEFloat ) ) )? (otherlv_7= 'obtainedPoints:' ( (lv_obtainedPoints_8_0= ruleEFloat ) ) )? (otherlv_9= 'connection:' ( ( ruleEString ) ) )? ( (lv_required_11_0= 'required' ) )? otherlv_12= '}' )
            // InternalBIMMixerApp.g:534:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )? (otherlv_5= 'points:' ( (lv_points_6_0= ruleEFloat ) ) )? (otherlv_7= 'obtainedPoints:' ( (lv_obtainedPoints_8_0= ruleEFloat ) ) )? (otherlv_9= 'connection:' ( ( ruleEString ) ) )? ( (lv_required_11_0= 'required' ) )? otherlv_12= '}'
            {
            // InternalBIMMixerApp.g:534:3: ()
            // InternalBIMMixerApp.g:535:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSubcategoryAccess().getSubcategoryAction_0(),
            					current);
            			

            }

            // InternalBIMMixerApp.g:541:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBIMMixerApp.g:542:4: (lv_name_1_0= ruleEString )
            {
            // InternalBIMMixerApp.g:542:4: (lv_name_1_0= ruleEString )
            // InternalBIMMixerApp.g:543:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSubcategoryAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubcategoryRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"bimMixer.BIMMixerApp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getSubcategoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBIMMixerApp.g:564:3: (otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBIMMixerApp.g:565:4: otherlv_3= 'text:' ( (lv_text_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSubcategoryAccess().getTextKeyword_3_0());
                    			
                    // InternalBIMMixerApp.g:569:4: ( (lv_text_4_0= ruleEString ) )
                    // InternalBIMMixerApp.g:570:5: (lv_text_4_0= ruleEString )
                    {
                    // InternalBIMMixerApp.g:570:5: (lv_text_4_0= ruleEString )
                    // InternalBIMMixerApp.g:571:6: lv_text_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSubcategoryAccess().getTextEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_text_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubcategoryRule());
                    						}
                    						set(
                    							current,
                    							"text",
                    							lv_text_4_0,
                    							"bimMixer.BIMMixerApp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBIMMixerApp.g:589:3: (otherlv_5= 'points:' ( (lv_points_6_0= ruleEFloat ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBIMMixerApp.g:590:4: otherlv_5= 'points:' ( (lv_points_6_0= ruleEFloat ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getSubcategoryAccess().getPointsKeyword_4_0());
                    			
                    // InternalBIMMixerApp.g:594:4: ( (lv_points_6_0= ruleEFloat ) )
                    // InternalBIMMixerApp.g:595:5: (lv_points_6_0= ruleEFloat )
                    {
                    // InternalBIMMixerApp.g:595:5: (lv_points_6_0= ruleEFloat )
                    // InternalBIMMixerApp.g:596:6: lv_points_6_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getSubcategoryAccess().getPointsEFloatParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_points_6_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubcategoryRule());
                    						}
                    						set(
                    							current,
                    							"points",
                    							lv_points_6_0,
                    							"bimMixer.BIMMixerApp.EFloat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBIMMixerApp.g:614:3: (otherlv_7= 'obtainedPoints:' ( (lv_obtainedPoints_8_0= ruleEFloat ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBIMMixerApp.g:615:4: otherlv_7= 'obtainedPoints:' ( (lv_obtainedPoints_8_0= ruleEFloat ) )
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getSubcategoryAccess().getObtainedPointsKeyword_5_0());
                    			
                    // InternalBIMMixerApp.g:619:4: ( (lv_obtainedPoints_8_0= ruleEFloat ) )
                    // InternalBIMMixerApp.g:620:5: (lv_obtainedPoints_8_0= ruleEFloat )
                    {
                    // InternalBIMMixerApp.g:620:5: (lv_obtainedPoints_8_0= ruleEFloat )
                    // InternalBIMMixerApp.g:621:6: lv_obtainedPoints_8_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getSubcategoryAccess().getObtainedPointsEFloatParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_obtainedPoints_8_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubcategoryRule());
                    						}
                    						set(
                    							current,
                    							"obtainedPoints",
                    							lv_obtainedPoints_8_0,
                    							"bimMixer.BIMMixerApp.EFloat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBIMMixerApp.g:639:3: (otherlv_9= 'connection:' ( ( ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBIMMixerApp.g:640:4: otherlv_9= 'connection:' ( ( ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getSubcategoryAccess().getConnectionKeyword_6_0());
                    			
                    // InternalBIMMixerApp.g:644:4: ( ( ruleEString ) )
                    // InternalBIMMixerApp.g:645:5: ( ruleEString )
                    {
                    // InternalBIMMixerApp.g:645:5: ( ruleEString )
                    // InternalBIMMixerApp.g:646:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSubcategoryRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSubcategoryAccess().getConnectionSubcategoryCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBIMMixerApp.g:661:3: ( (lv_required_11_0= 'required' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBIMMixerApp.g:662:4: (lv_required_11_0= 'required' )
                    {
                    // InternalBIMMixerApp.g:662:4: (lv_required_11_0= 'required' )
                    // InternalBIMMixerApp.g:663:5: lv_required_11_0= 'required'
                    {
                    lv_required_11_0=(Token)match(input,24,FOLLOW_9); 

                    					newLeafNode(lv_required_11_0, grammarAccess.getSubcategoryAccess().getRequiredRequiredKeyword_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSubcategoryRule());
                    					}
                    					setWithLastConsumed(current, "required", lv_required_11_0 != null, "required");
                    				

                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getSubcategoryAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubcategory"


    // $ANTLR start "entryRuleEString"
    // InternalBIMMixerApp.g:683:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalBIMMixerApp.g:683:47: (iv_ruleEString= ruleEString EOF )
            // InternalBIMMixerApp.g:684:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalBIMMixerApp.g:690:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBIMMixerApp.g:696:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalBIMMixerApp.g:697:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalBIMMixerApp.g:697:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalBIMMixerApp.g:698:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBIMMixerApp.g:706:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEFloat"
    // InternalBIMMixerApp.g:717:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalBIMMixerApp.g:717:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalBIMMixerApp.g:718:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalBIMMixerApp.g:724:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalBIMMixerApp.g:730:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalBIMMixerApp.g:731:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalBIMMixerApp.g:731:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalBIMMixerApp.g:732:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalBIMMixerApp.g:732:3: (kw= '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBIMMixerApp.g:733:4: kw= '-'
                    {
                    kw=(Token)match(input,25,FOLLOW_17); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalBIMMixerApp.g:739:3: (this_INT_1= RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBIMMixerApp.g:740:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_18); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,26,FOLLOW_19); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_20); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalBIMMixerApp.g:760:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=27 && LA19_0<=28)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBIMMixerApp.g:761:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalBIMMixerApp.g:761:4: (kw= 'E' | kw= 'e' )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==27) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==28) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalBIMMixerApp.g:762:5: kw= 'E'
                            {
                            kw=(Token)match(input,27,FOLLOW_21); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalBIMMixerApp.g:768:5: kw= 'e'
                            {
                            kw=(Token)match(input,28,FOLLOW_21); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalBIMMixerApp.g:774:4: (kw= '-' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==25) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalBIMMixerApp.g:775:5: kw= '-'
                            {
                            kw=(Token)match(input,25,FOLLOW_19); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEFloat"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000042002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001F20000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001E20000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000006000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001C20000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001820000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000040L});

}