package org.example.dm.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.example.dm.xtext.services.TextualDataModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTextualDataModelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DataModel'", "'{'", "'@description'", "'('", "')'", "'@locales'", "'}'", "'Entity'", "'['", "']'", "'::'", "'..'", "'[id]'", "'defaultValue'", "'Relationship'", "'BooleanType'", "'StringType'", "'length'", "'minLength'", "'maxLength'", "'pattern'", "'NumericType'", "'size'", "'totalDigits'", "'fractionDigits'", "'minInclusive'", "'minExclusive'", "'maxInclusive'", "'maxExclusive'", "'measurementUnit'", "'DateType'", "'DateTimeType'", "'UuidType'", "'@localization'", "'*'", "'-'", "'.'", "'E'", "'e'", "'MASTER_DATA'", "'REFERENCE_DATA'", "'ABSTRACT_ENTITY'", "'ATTRIBUTE_SET'", "'ASSOCIATION'", "'COMPOSITION'", "'AGGREGATION'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalTextualDataModelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTextualDataModelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTextualDataModelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTextualDataModel.g"; }



     	private TextualDataModelGrammarAccess grammarAccess;

        public InternalTextualDataModelParser(TokenStream input, TextualDataModelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DataModel";
       	}

       	@Override
       	protected TextualDataModelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDataModel"
    // InternalTextualDataModel.g:65:1: entryRuleDataModel returns [EObject current=null] : iv_ruleDataModel= ruleDataModel EOF ;
    public final EObject entryRuleDataModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataModel = null;


        try {
            // InternalTextualDataModel.g:65:50: (iv_ruleDataModel= ruleDataModel EOF )
            // InternalTextualDataModel.g:66:2: iv_ruleDataModel= ruleDataModel EOF
            {
             newCompositeNode(grammarAccess.getDataModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataModel=ruleDataModel();

            state._fsp--;

             current =iv_ruleDataModel; 
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
    // $ANTLR end "entryRuleDataModel"


    // $ANTLR start "ruleDataModel"
    // InternalTextualDataModel.g:72:1: ruleDataModel returns [EObject current=null] : (otherlv_0= 'DataModel' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? (otherlv_7= '@locales' otherlv_8= '(' ( (lv_locales_9_0= RULE_ID ) )* otherlv_10= ')' )? ( (lv_localizations_11_0= ruleLocalization ) )* ( (lv_entities_12_0= ruleEntity ) )* ( (lv_relationships_13_0= ruleRelationship ) )* ( (lv_dataTypes_14_0= ruleDataType ) )* otherlv_15= '}' )? ) ;
    public final EObject ruleDataModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_locales_9_0=null;
        Token otherlv_10=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        EObject lv_localizations_11_0 = null;

        EObject lv_entities_12_0 = null;

        EObject lv_relationships_13_0 = null;

        EObject lv_dataTypes_14_0 = null;



        	enterRule();

        try {
            // InternalTextualDataModel.g:78:2: ( (otherlv_0= 'DataModel' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? (otherlv_7= '@locales' otherlv_8= '(' ( (lv_locales_9_0= RULE_ID ) )* otherlv_10= ')' )? ( (lv_localizations_11_0= ruleLocalization ) )* ( (lv_entities_12_0= ruleEntity ) )* ( (lv_relationships_13_0= ruleRelationship ) )* ( (lv_dataTypes_14_0= ruleDataType ) )* otherlv_15= '}' )? ) )
            // InternalTextualDataModel.g:79:2: (otherlv_0= 'DataModel' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? (otherlv_7= '@locales' otherlv_8= '(' ( (lv_locales_9_0= RULE_ID ) )* otherlv_10= ')' )? ( (lv_localizations_11_0= ruleLocalization ) )* ( (lv_entities_12_0= ruleEntity ) )* ( (lv_relationships_13_0= ruleRelationship ) )* ( (lv_dataTypes_14_0= ruleDataType ) )* otherlv_15= '}' )? )
            {
            // InternalTextualDataModel.g:79:2: (otherlv_0= 'DataModel' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? (otherlv_7= '@locales' otherlv_8= '(' ( (lv_locales_9_0= RULE_ID ) )* otherlv_10= ')' )? ( (lv_localizations_11_0= ruleLocalization ) )* ( (lv_entities_12_0= ruleEntity ) )* ( (lv_relationships_13_0= ruleRelationship ) )* ( (lv_dataTypes_14_0= ruleDataType ) )* otherlv_15= '}' )? )
            // InternalTextualDataModel.g:80:3: otherlv_0= 'DataModel' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? (otherlv_7= '@locales' otherlv_8= '(' ( (lv_locales_9_0= RULE_ID ) )* otherlv_10= ')' )? ( (lv_localizations_11_0= ruleLocalization ) )* ( (lv_entities_12_0= ruleEntity ) )* ( (lv_relationships_13_0= ruleRelationship ) )* ( (lv_dataTypes_14_0= ruleDataType ) )* otherlv_15= '}' )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDataModelAccess().getDataModelKeyword_0());
            		
            // InternalTextualDataModel.g:84:3: ( (lv_name_1_0= ruleElementName ) )
            // InternalTextualDataModel.g:85:4: (lv_name_1_0= ruleElementName )
            {
            // InternalTextualDataModel.g:85:4: (lv_name_1_0= ruleElementName )
            // InternalTextualDataModel.g:86:5: lv_name_1_0= ruleElementName
            {

            					newCompositeNode(grammarAccess.getDataModelAccess().getNameElementNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleElementName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.example.dm.xtext.TextualDataModel.ElementName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTextualDataModel.g:103:3: (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? (otherlv_7= '@locales' otherlv_8= '(' ( (lv_locales_9_0= RULE_ID ) )* otherlv_10= ')' )? ( (lv_localizations_11_0= ruleLocalization ) )* ( (lv_entities_12_0= ruleEntity ) )* ( (lv_relationships_13_0= ruleRelationship ) )* ( (lv_dataTypes_14_0= ruleDataType ) )* otherlv_15= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTextualDataModel.g:104:4: otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? (otherlv_7= '@locales' otherlv_8= '(' ( (lv_locales_9_0= RULE_ID ) )* otherlv_10= ')' )? ( (lv_localizations_11_0= ruleLocalization ) )* ( (lv_entities_12_0= ruleEntity ) )* ( (lv_relationships_13_0= ruleRelationship ) )* ( (lv_dataTypes_14_0= ruleDataType ) )* otherlv_15= '}'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalTextualDataModel.g:108:4: (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==13) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalTextualDataModel.g:109:5: otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')'
                            {
                            otherlv_3=(Token)match(input,13,FOLLOW_6); 

                            					newLeafNode(otherlv_3, grammarAccess.getDataModelAccess().getDescriptionKeyword_2_1_0());
                            				
                            otherlv_4=(Token)match(input,14,FOLLOW_3); 

                            					newLeafNode(otherlv_4, grammarAccess.getDataModelAccess().getLeftParenthesisKeyword_2_1_1());
                            				
                            // InternalTextualDataModel.g:117:5: ( (lv_description_5_0= ruleText ) )
                            // InternalTextualDataModel.g:118:6: (lv_description_5_0= ruleText )
                            {
                            // InternalTextualDataModel.g:118:6: (lv_description_5_0= ruleText )
                            // InternalTextualDataModel.g:119:7: lv_description_5_0= ruleText
                            {

                            							newCompositeNode(grammarAccess.getDataModelAccess().getDescriptionTextParserRuleCall_2_1_2_0());
                            						
                            pushFollow(FOLLOW_7);
                            lv_description_5_0=ruleText();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getDataModelRule());
                            							}
                            							set(
                            								current,
                            								"description",
                            								lv_description_5_0,
                            								"org.example.dm.xtext.TextualDataModel.Text");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_6=(Token)match(input,15,FOLLOW_8); 

                            					newLeafNode(otherlv_6, grammarAccess.getDataModelAccess().getRightParenthesisKeyword_2_1_3());
                            				

                            }
                            break;

                    }

                    // InternalTextualDataModel.g:141:4: (otherlv_7= '@locales' otherlv_8= '(' ( (lv_locales_9_0= RULE_ID ) )* otherlv_10= ')' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==16) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalTextualDataModel.g:142:5: otherlv_7= '@locales' otherlv_8= '(' ( (lv_locales_9_0= RULE_ID ) )* otherlv_10= ')'
                            {
                            otherlv_7=(Token)match(input,16,FOLLOW_6); 

                            					newLeafNode(otherlv_7, grammarAccess.getDataModelAccess().getLocalesKeyword_2_2_0());
                            				
                            otherlv_8=(Token)match(input,14,FOLLOW_9); 

                            					newLeafNode(otherlv_8, grammarAccess.getDataModelAccess().getLeftParenthesisKeyword_2_2_1());
                            				
                            // InternalTextualDataModel.g:150:5: ( (lv_locales_9_0= RULE_ID ) )*
                            loop2:
                            do {
                                int alt2=2;
                                int LA2_0 = input.LA(1);

                                if ( (LA2_0==RULE_ID) ) {
                                    alt2=1;
                                }


                                switch (alt2) {
                            	case 1 :
                            	    // InternalTextualDataModel.g:151:6: (lv_locales_9_0= RULE_ID )
                            	    {
                            	    // InternalTextualDataModel.g:151:6: (lv_locales_9_0= RULE_ID )
                            	    // InternalTextualDataModel.g:152:7: lv_locales_9_0= RULE_ID
                            	    {
                            	    lv_locales_9_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                            	    							newLeafNode(lv_locales_9_0, grammarAccess.getDataModelAccess().getLocalesIDTerminalRuleCall_2_2_2_0());
                            	    						

                            	    							if (current==null) {
                            	    								current = createModelElement(grammarAccess.getDataModelRule());
                            	    							}
                            	    							addWithLastConsumed(
                            	    								current,
                            	    								"locales",
                            	    								lv_locales_9_0,
                            	    								"org.eclipse.xtext.common.Terminals.ID");
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop2;
                                }
                            } while (true);

                            otherlv_10=(Token)match(input,15,FOLLOW_10); 

                            					newLeafNode(otherlv_10, grammarAccess.getDataModelAccess().getRightParenthesisKeyword_2_2_3());
                            				

                            }
                            break;

                    }

                    // InternalTextualDataModel.g:173:4: ( (lv_localizations_11_0= ruleLocalization ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==44) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalTextualDataModel.g:174:5: (lv_localizations_11_0= ruleLocalization )
                    	    {
                    	    // InternalTextualDataModel.g:174:5: (lv_localizations_11_0= ruleLocalization )
                    	    // InternalTextualDataModel.g:175:6: lv_localizations_11_0= ruleLocalization
                    	    {

                    	    						newCompositeNode(grammarAccess.getDataModelAccess().getLocalizationsLocalizationParserRuleCall_2_3_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_localizations_11_0=ruleLocalization();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDataModelRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"localizations",
                    	    							lv_localizations_11_0,
                    	    							"org.example.dm.xtext.TextualDataModel.Localization");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    // InternalTextualDataModel.g:192:4: ( (lv_entities_12_0= ruleEntity ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==18) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalTextualDataModel.g:193:5: (lv_entities_12_0= ruleEntity )
                    	    {
                    	    // InternalTextualDataModel.g:193:5: (lv_entities_12_0= ruleEntity )
                    	    // InternalTextualDataModel.g:194:6: lv_entities_12_0= ruleEntity
                    	    {

                    	    						newCompositeNode(grammarAccess.getDataModelAccess().getEntitiesEntityParserRuleCall_2_4_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_entities_12_0=ruleEntity();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDataModelRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"entities",
                    	    							lv_entities_12_0,
                    	    							"org.example.dm.xtext.TextualDataModel.Entity");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // InternalTextualDataModel.g:211:4: ( (lv_relationships_13_0= ruleRelationship ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==25) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalTextualDataModel.g:212:5: (lv_relationships_13_0= ruleRelationship )
                    	    {
                    	    // InternalTextualDataModel.g:212:5: (lv_relationships_13_0= ruleRelationship )
                    	    // InternalTextualDataModel.g:213:6: lv_relationships_13_0= ruleRelationship
                    	    {

                    	    						newCompositeNode(grammarAccess.getDataModelAccess().getRelationshipsRelationshipParserRuleCall_2_5_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
                    	    lv_relationships_13_0=ruleRelationship();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDataModelRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"relationships",
                    	    							lv_relationships_13_0,
                    	    							"org.example.dm.xtext.TextualDataModel.Relationship");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    // InternalTextualDataModel.g:230:4: ( (lv_dataTypes_14_0= ruleDataType ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=26 && LA7_0<=27)||LA7_0==32||(LA7_0>=41 && LA7_0<=43)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalTextualDataModel.g:231:5: (lv_dataTypes_14_0= ruleDataType )
                    	    {
                    	    // InternalTextualDataModel.g:231:5: (lv_dataTypes_14_0= ruleDataType )
                    	    // InternalTextualDataModel.g:232:6: lv_dataTypes_14_0= ruleDataType
                    	    {

                    	    						newCompositeNode(grammarAccess.getDataModelAccess().getDataTypesDataTypeParserRuleCall_2_6_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_dataTypes_14_0=ruleDataType();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDataModelRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"dataTypes",
                    	    							lv_dataTypes_14_0,
                    	    							"org.example.dm.xtext.TextualDataModel.DataType");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_2_7());
                    			

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
    // $ANTLR end "ruleDataModel"


    // $ANTLR start "entryRuleEntity"
    // InternalTextualDataModel.g:258:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalTextualDataModel.g:258:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalTextualDataModel.g:259:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalTextualDataModel.g:265:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'Entity' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '[' ( (lv_kind_3_0= ruleEntityKind ) ) otherlv_4= ']' )? (otherlv_5= '::' ( ( ruleElementName ) )+ )? (otherlv_7= '{' (otherlv_8= '@description' otherlv_9= '(' ( (lv_description_10_0= ruleText ) ) otherlv_11= ')' )? ( (lv_localizations_12_0= ruleLocalization ) )* ( (lv_attributes_13_0= ruleAttribute ) )* otherlv_14= '}' )? ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_kind_3_0 = null;

        AntlrDatatypeRuleToken lv_description_10_0 = null;

        EObject lv_localizations_12_0 = null;

        EObject lv_attributes_13_0 = null;



        	enterRule();

        try {
            // InternalTextualDataModel.g:271:2: ( (otherlv_0= 'Entity' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '[' ( (lv_kind_3_0= ruleEntityKind ) ) otherlv_4= ']' )? (otherlv_5= '::' ( ( ruleElementName ) )+ )? (otherlv_7= '{' (otherlv_8= '@description' otherlv_9= '(' ( (lv_description_10_0= ruleText ) ) otherlv_11= ')' )? ( (lv_localizations_12_0= ruleLocalization ) )* ( (lv_attributes_13_0= ruleAttribute ) )* otherlv_14= '}' )? ) )
            // InternalTextualDataModel.g:272:2: (otherlv_0= 'Entity' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '[' ( (lv_kind_3_0= ruleEntityKind ) ) otherlv_4= ']' )? (otherlv_5= '::' ( ( ruleElementName ) )+ )? (otherlv_7= '{' (otherlv_8= '@description' otherlv_9= '(' ( (lv_description_10_0= ruleText ) ) otherlv_11= ')' )? ( (lv_localizations_12_0= ruleLocalization ) )* ( (lv_attributes_13_0= ruleAttribute ) )* otherlv_14= '}' )? )
            {
            // InternalTextualDataModel.g:272:2: (otherlv_0= 'Entity' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '[' ( (lv_kind_3_0= ruleEntityKind ) ) otherlv_4= ']' )? (otherlv_5= '::' ( ( ruleElementName ) )+ )? (otherlv_7= '{' (otherlv_8= '@description' otherlv_9= '(' ( (lv_description_10_0= ruleText ) ) otherlv_11= ')' )? ( (lv_localizations_12_0= ruleLocalization ) )* ( (lv_attributes_13_0= ruleAttribute ) )* otherlv_14= '}' )? )
            // InternalTextualDataModel.g:273:3: otherlv_0= 'Entity' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '[' ( (lv_kind_3_0= ruleEntityKind ) ) otherlv_4= ']' )? (otherlv_5= '::' ( ( ruleElementName ) )+ )? (otherlv_7= '{' (otherlv_8= '@description' otherlv_9= '(' ( (lv_description_10_0= ruleText ) ) otherlv_11= ')' )? ( (lv_localizations_12_0= ruleLocalization ) )* ( (lv_attributes_13_0= ruleAttribute ) )* otherlv_14= '}' )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalTextualDataModel.g:277:3: ( (lv_name_1_0= ruleElementName ) )
            // InternalTextualDataModel.g:278:4: (lv_name_1_0= ruleElementName )
            {
            // InternalTextualDataModel.g:278:4: (lv_name_1_0= ruleElementName )
            // InternalTextualDataModel.g:279:5: lv_name_1_0= ruleElementName
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getNameElementNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_1_0=ruleElementName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.example.dm.xtext.TextualDataModel.ElementName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTextualDataModel.g:296:3: (otherlv_2= '[' ( (lv_kind_3_0= ruleEntityKind ) ) otherlv_4= ']' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTextualDataModel.g:297:4: otherlv_2= '[' ( (lv_kind_3_0= ruleEntityKind ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalTextualDataModel.g:301:4: ( (lv_kind_3_0= ruleEntityKind ) )
                    // InternalTextualDataModel.g:302:5: (lv_kind_3_0= ruleEntityKind )
                    {
                    // InternalTextualDataModel.g:302:5: (lv_kind_3_0= ruleEntityKind )
                    // InternalTextualDataModel.g:303:6: lv_kind_3_0= ruleEntityKind
                    {

                    						newCompositeNode(grammarAccess.getEntityAccess().getKindEntityKindEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_kind_3_0=ruleEntityKind();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_3_0,
                    							"org.example.dm.xtext.TextualDataModel.EntityKind");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getRightSquareBracketKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalTextualDataModel.g:325:3: (otherlv_5= '::' ( ( ruleElementName ) )+ )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTextualDataModel.g:326:4: otherlv_5= '::' ( ( ruleElementName ) )+
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getColonColonKeyword_3_0());
                    			
                    // InternalTextualDataModel.g:330:4: ( ( ruleElementName ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_STRING) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalTextualDataModel.g:331:5: ( ruleElementName )
                    	    {
                    	    // InternalTextualDataModel.g:331:5: ( ruleElementName )
                    	    // InternalTextualDataModel.g:332:6: ruleElementName
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getEntityRule());
                    	    						}
                    	    					

                    	    						newCompositeNode(grammarAccess.getEntityAccess().getGeneralsEntityCrossReference_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_18);
                    	    ruleElementName();

                    	    state._fsp--;


                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);


                    }
                    break;

            }

            // InternalTextualDataModel.g:347:3: (otherlv_7= '{' (otherlv_8= '@description' otherlv_9= '(' ( (lv_description_10_0= ruleText ) ) otherlv_11= ')' )? ( (lv_localizations_12_0= ruleLocalization ) )* ( (lv_attributes_13_0= ruleAttribute ) )* otherlv_14= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==12) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTextualDataModel.g:348:4: otherlv_7= '{' (otherlv_8= '@description' otherlv_9= '(' ( (lv_description_10_0= ruleText ) ) otherlv_11= ')' )? ( (lv_localizations_12_0= ruleLocalization ) )* ( (lv_attributes_13_0= ruleAttribute ) )* otherlv_14= '}'
                    {
                    otherlv_7=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalTextualDataModel.g:352:4: (otherlv_8= '@description' otherlv_9= '(' ( (lv_description_10_0= ruleText ) ) otherlv_11= ')' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==13) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalTextualDataModel.g:353:5: otherlv_8= '@description' otherlv_9= '(' ( (lv_description_10_0= ruleText ) ) otherlv_11= ')'
                            {
                            otherlv_8=(Token)match(input,13,FOLLOW_6); 

                            					newLeafNode(otherlv_8, grammarAccess.getEntityAccess().getDescriptionKeyword_4_1_0());
                            				
                            otherlv_9=(Token)match(input,14,FOLLOW_3); 

                            					newLeafNode(otherlv_9, grammarAccess.getEntityAccess().getLeftParenthesisKeyword_4_1_1());
                            				
                            // InternalTextualDataModel.g:361:5: ( (lv_description_10_0= ruleText ) )
                            // InternalTextualDataModel.g:362:6: (lv_description_10_0= ruleText )
                            {
                            // InternalTextualDataModel.g:362:6: (lv_description_10_0= ruleText )
                            // InternalTextualDataModel.g:363:7: lv_description_10_0= ruleText
                            {

                            							newCompositeNode(grammarAccess.getEntityAccess().getDescriptionTextParserRuleCall_4_1_2_0());
                            						
                            pushFollow(FOLLOW_7);
                            lv_description_10_0=ruleText();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getEntityRule());
                            							}
                            							set(
                            								current,
                            								"description",
                            								lv_description_10_0,
                            								"org.example.dm.xtext.TextualDataModel.Text");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_11=(Token)match(input,15,FOLLOW_20); 

                            					newLeafNode(otherlv_11, grammarAccess.getEntityAccess().getRightParenthesisKeyword_4_1_3());
                            				

                            }
                            break;

                    }

                    // InternalTextualDataModel.g:385:4: ( (lv_localizations_12_0= ruleLocalization ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==44) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalTextualDataModel.g:386:5: (lv_localizations_12_0= ruleLocalization )
                    	    {
                    	    // InternalTextualDataModel.g:386:5: (lv_localizations_12_0= ruleLocalization )
                    	    // InternalTextualDataModel.g:387:6: lv_localizations_12_0= ruleLocalization
                    	    {

                    	    						newCompositeNode(grammarAccess.getEntityAccess().getLocalizationsLocalizationParserRuleCall_4_2_0());
                    	    					
                    	    pushFollow(FOLLOW_20);
                    	    lv_localizations_12_0=ruleLocalization();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"localizations",
                    	    							lv_localizations_12_0,
                    	    							"org.example.dm.xtext.TextualDataModel.Localization");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    // InternalTextualDataModel.g:404:4: ( (lv_attributes_13_0= ruleAttribute ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_STRING) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalTextualDataModel.g:405:5: (lv_attributes_13_0= ruleAttribute )
                    	    {
                    	    // InternalTextualDataModel.g:405:5: (lv_attributes_13_0= ruleAttribute )
                    	    // InternalTextualDataModel.g:406:6: lv_attributes_13_0= ruleAttribute
                    	    {

                    	    						newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_3_0());
                    	    					
                    	    pushFollow(FOLLOW_21);
                    	    lv_attributes_13_0=ruleAttribute();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"attributes",
                    	    							lv_attributes_13_0,
                    	    							"org.example.dm.xtext.TextualDataModel.Attribute");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4_4());
                    			

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // InternalTextualDataModel.g:432:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalTextualDataModel.g:432:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalTextualDataModel.g:433:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalTextualDataModel.g:439:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= ruleElementName ) ) ( ( ruleElementName ) ) ( (lv_lower_2_0= RULE_INT ) ) otherlv_3= '..' ( (lv_upper_4_0= ruleUnlimitedNatural ) ) ( (lv_identity_5_0= '[id]' ) )? (otherlv_6= 'defaultValue' otherlv_7= '(' ( (lv_defaultValue_8_0= ruleText ) ) otherlv_9= ')' )? (otherlv_10= '{' (otherlv_11= '@description' otherlv_12= '(' ( (lv_description_13_0= ruleText ) ) otherlv_14= ')' )? ( (lv_localizations_15_0= ruleLocalization ) )* otherlv_16= '}' )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_lower_2_0=null;
        Token otherlv_3=null;
        Token lv_identity_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_upper_4_0 = null;

        AntlrDatatypeRuleToken lv_defaultValue_8_0 = null;

        AntlrDatatypeRuleToken lv_description_13_0 = null;

        EObject lv_localizations_15_0 = null;



        	enterRule();

        try {
            // InternalTextualDataModel.g:445:2: ( ( ( (lv_name_0_0= ruleElementName ) ) ( ( ruleElementName ) ) ( (lv_lower_2_0= RULE_INT ) ) otherlv_3= '..' ( (lv_upper_4_0= ruleUnlimitedNatural ) ) ( (lv_identity_5_0= '[id]' ) )? (otherlv_6= 'defaultValue' otherlv_7= '(' ( (lv_defaultValue_8_0= ruleText ) ) otherlv_9= ')' )? (otherlv_10= '{' (otherlv_11= '@description' otherlv_12= '(' ( (lv_description_13_0= ruleText ) ) otherlv_14= ')' )? ( (lv_localizations_15_0= ruleLocalization ) )* otherlv_16= '}' )? ) )
            // InternalTextualDataModel.g:446:2: ( ( (lv_name_0_0= ruleElementName ) ) ( ( ruleElementName ) ) ( (lv_lower_2_0= RULE_INT ) ) otherlv_3= '..' ( (lv_upper_4_0= ruleUnlimitedNatural ) ) ( (lv_identity_5_0= '[id]' ) )? (otherlv_6= 'defaultValue' otherlv_7= '(' ( (lv_defaultValue_8_0= ruleText ) ) otherlv_9= ')' )? (otherlv_10= '{' (otherlv_11= '@description' otherlv_12= '(' ( (lv_description_13_0= ruleText ) ) otherlv_14= ')' )? ( (lv_localizations_15_0= ruleLocalization ) )* otherlv_16= '}' )? )
            {
            // InternalTextualDataModel.g:446:2: ( ( (lv_name_0_0= ruleElementName ) ) ( ( ruleElementName ) ) ( (lv_lower_2_0= RULE_INT ) ) otherlv_3= '..' ( (lv_upper_4_0= ruleUnlimitedNatural ) ) ( (lv_identity_5_0= '[id]' ) )? (otherlv_6= 'defaultValue' otherlv_7= '(' ( (lv_defaultValue_8_0= ruleText ) ) otherlv_9= ')' )? (otherlv_10= '{' (otherlv_11= '@description' otherlv_12= '(' ( (lv_description_13_0= ruleText ) ) otherlv_14= ')' )? ( (lv_localizations_15_0= ruleLocalization ) )* otherlv_16= '}' )? )
            // InternalTextualDataModel.g:447:3: ( (lv_name_0_0= ruleElementName ) ) ( ( ruleElementName ) ) ( (lv_lower_2_0= RULE_INT ) ) otherlv_3= '..' ( (lv_upper_4_0= ruleUnlimitedNatural ) ) ( (lv_identity_5_0= '[id]' ) )? (otherlv_6= 'defaultValue' otherlv_7= '(' ( (lv_defaultValue_8_0= ruleText ) ) otherlv_9= ')' )? (otherlv_10= '{' (otherlv_11= '@description' otherlv_12= '(' ( (lv_description_13_0= ruleText ) ) otherlv_14= ')' )? ( (lv_localizations_15_0= ruleLocalization ) )* otherlv_16= '}' )?
            {
            // InternalTextualDataModel.g:447:3: ( (lv_name_0_0= ruleElementName ) )
            // InternalTextualDataModel.g:448:4: (lv_name_0_0= ruleElementName )
            {
            // InternalTextualDataModel.g:448:4: (lv_name_0_0= ruleElementName )
            // InternalTextualDataModel.g:449:5: lv_name_0_0= ruleElementName
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameElementNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_0_0=ruleElementName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.example.dm.xtext.TextualDataModel.ElementName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTextualDataModel.g:466:3: ( ( ruleElementName ) )
            // InternalTextualDataModel.g:467:4: ( ruleElementName )
            {
            // InternalTextualDataModel.g:467:4: ( ruleElementName )
            // InternalTextualDataModel.g:468:5: ruleElementName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAttributeAccess().getDataTypeDataTypeCrossReference_1_0());
            				
            pushFollow(FOLLOW_22);
            ruleElementName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTextualDataModel.g:482:3: ( (lv_lower_2_0= RULE_INT ) )
            // InternalTextualDataModel.g:483:4: (lv_lower_2_0= RULE_INT )
            {
            // InternalTextualDataModel.g:483:4: (lv_lower_2_0= RULE_INT )
            // InternalTextualDataModel.g:484:5: lv_lower_2_0= RULE_INT
            {
            lv_lower_2_0=(Token)match(input,RULE_INT,FOLLOW_23); 

            					newLeafNode(lv_lower_2_0, grammarAccess.getAttributeAccess().getLowerINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lower",
            						lv_lower_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getFullStopFullStopKeyword_3());
            		
            // InternalTextualDataModel.g:504:3: ( (lv_upper_4_0= ruleUnlimitedNatural ) )
            // InternalTextualDataModel.g:505:4: (lv_upper_4_0= ruleUnlimitedNatural )
            {
            // InternalTextualDataModel.g:505:4: (lv_upper_4_0= ruleUnlimitedNatural )
            // InternalTextualDataModel.g:506:5: lv_upper_4_0= ruleUnlimitedNatural
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getUpperUnlimitedNaturalParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_25);
            lv_upper_4_0=ruleUnlimitedNatural();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"upper",
            						lv_upper_4_0,
            						"org.example.dm.xtext.TextualDataModel.UnlimitedNatural");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTextualDataModel.g:523:3: ( (lv_identity_5_0= '[id]' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTextualDataModel.g:524:4: (lv_identity_5_0= '[id]' )
                    {
                    // InternalTextualDataModel.g:524:4: (lv_identity_5_0= '[id]' )
                    // InternalTextualDataModel.g:525:5: lv_identity_5_0= '[id]'
                    {
                    lv_identity_5_0=(Token)match(input,23,FOLLOW_26); 

                    					newLeafNode(lv_identity_5_0, grammarAccess.getAttributeAccess().getIdentityIdKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "identity", lv_identity_5_0 != null, "[id]");
                    				

                    }


                    }
                    break;

            }

            // InternalTextualDataModel.g:537:3: (otherlv_6= 'defaultValue' otherlv_7= '(' ( (lv_defaultValue_8_0= ruleText ) ) otherlv_9= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTextualDataModel.g:538:4: otherlv_6= 'defaultValue' otherlv_7= '(' ( (lv_defaultValue_8_0= ruleText ) ) otherlv_9= ')'
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getDefaultValueKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalTextualDataModel.g:546:4: ( (lv_defaultValue_8_0= ruleText ) )
                    // InternalTextualDataModel.g:547:5: (lv_defaultValue_8_0= ruleText )
                    {
                    // InternalTextualDataModel.g:547:5: (lv_defaultValue_8_0= ruleText )
                    // InternalTextualDataModel.g:548:6: lv_defaultValue_8_0= ruleText
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getDefaultValueTextParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_defaultValue_8_0=ruleText();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"defaultValue",
                    							lv_defaultValue_8_0,
                    							"org.example.dm.xtext.TextualDataModel.Text");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getAttributeAccess().getRightParenthesisKeyword_6_3());
                    			

                    }
                    break;

            }

            // InternalTextualDataModel.g:570:3: (otherlv_10= '{' (otherlv_11= '@description' otherlv_12= '(' ( (lv_description_13_0= ruleText ) ) otherlv_14= ')' )? ( (lv_localizations_15_0= ruleLocalization ) )* otherlv_16= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==12) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTextualDataModel.g:571:4: otherlv_10= '{' (otherlv_11= '@description' otherlv_12= '(' ( (lv_description_13_0= ruleText ) ) otherlv_14= ')' )? ( (lv_localizations_15_0= ruleLocalization ) )* otherlv_16= '}'
                    {
                    otherlv_10=(Token)match(input,12,FOLLOW_27); 

                    				newLeafNode(otherlv_10, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_7_0());
                    			
                    // InternalTextualDataModel.g:575:4: (otherlv_11= '@description' otherlv_12= '(' ( (lv_description_13_0= ruleText ) ) otherlv_14= ')' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==13) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalTextualDataModel.g:576:5: otherlv_11= '@description' otherlv_12= '(' ( (lv_description_13_0= ruleText ) ) otherlv_14= ')'
                            {
                            otherlv_11=(Token)match(input,13,FOLLOW_6); 

                            					newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getDescriptionKeyword_7_1_0());
                            				
                            otherlv_12=(Token)match(input,14,FOLLOW_3); 

                            					newLeafNode(otherlv_12, grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_7_1_1());
                            				
                            // InternalTextualDataModel.g:584:5: ( (lv_description_13_0= ruleText ) )
                            // InternalTextualDataModel.g:585:6: (lv_description_13_0= ruleText )
                            {
                            // InternalTextualDataModel.g:585:6: (lv_description_13_0= ruleText )
                            // InternalTextualDataModel.g:586:7: lv_description_13_0= ruleText
                            {

                            							newCompositeNode(grammarAccess.getAttributeAccess().getDescriptionTextParserRuleCall_7_1_2_0());
                            						
                            pushFollow(FOLLOW_7);
                            lv_description_13_0=ruleText();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAttributeRule());
                            							}
                            							set(
                            								current,
                            								"description",
                            								lv_description_13_0,
                            								"org.example.dm.xtext.TextualDataModel.Text");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_14=(Token)match(input,15,FOLLOW_28); 

                            					newLeafNode(otherlv_14, grammarAccess.getAttributeAccess().getRightParenthesisKeyword_7_1_3());
                            				

                            }
                            break;

                    }

                    // InternalTextualDataModel.g:608:4: ( (lv_localizations_15_0= ruleLocalization ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==44) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalTextualDataModel.g:609:5: (lv_localizations_15_0= ruleLocalization )
                    	    {
                    	    // InternalTextualDataModel.g:609:5: (lv_localizations_15_0= ruleLocalization )
                    	    // InternalTextualDataModel.g:610:6: lv_localizations_15_0= ruleLocalization
                    	    {

                    	    						newCompositeNode(grammarAccess.getAttributeAccess().getLocalizationsLocalizationParserRuleCall_7_2_0());
                    	    					
                    	    pushFollow(FOLLOW_28);
                    	    lv_localizations_15_0=ruleLocalization();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"localizations",
                    	    							lv_localizations_15_0,
                    	    							"org.example.dm.xtext.TextualDataModel.Localization");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_7_3());
                    			

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRelationship"
    // InternalTextualDataModel.g:636:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalTextualDataModel.g:636:53: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalTextualDataModel.g:637:2: iv_ruleRelationship= ruleRelationship EOF
            {
             newCompositeNode(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;

             current =iv_ruleRelationship; 
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
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // InternalTextualDataModel.g:643:1: ruleRelationship returns [EObject current=null] : ( () otherlv_1= 'Relationship' ( (lv_name_2_0= ruleElementName ) )? (otherlv_3= '[' ( (lv_kind_4_0= ruleRelationshipKind ) ) otherlv_5= ']' )? (otherlv_6= '{' (otherlv_7= '@description' otherlv_8= '(' ( (lv_description_9_0= ruleText ) ) otherlv_10= ')' )? ( (lv_localizations_11_0= ruleLocalization ) )* ( (lv_ends_12_0= ruleRelationshipEnd ) )* otherlv_13= '}' )? ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_kind_4_0 = null;

        AntlrDatatypeRuleToken lv_description_9_0 = null;

        EObject lv_localizations_11_0 = null;

        EObject lv_ends_12_0 = null;



        	enterRule();

        try {
            // InternalTextualDataModel.g:649:2: ( ( () otherlv_1= 'Relationship' ( (lv_name_2_0= ruleElementName ) )? (otherlv_3= '[' ( (lv_kind_4_0= ruleRelationshipKind ) ) otherlv_5= ']' )? (otherlv_6= '{' (otherlv_7= '@description' otherlv_8= '(' ( (lv_description_9_0= ruleText ) ) otherlv_10= ')' )? ( (lv_localizations_11_0= ruleLocalization ) )* ( (lv_ends_12_0= ruleRelationshipEnd ) )* otherlv_13= '}' )? ) )
            // InternalTextualDataModel.g:650:2: ( () otherlv_1= 'Relationship' ( (lv_name_2_0= ruleElementName ) )? (otherlv_3= '[' ( (lv_kind_4_0= ruleRelationshipKind ) ) otherlv_5= ']' )? (otherlv_6= '{' (otherlv_7= '@description' otherlv_8= '(' ( (lv_description_9_0= ruleText ) ) otherlv_10= ')' )? ( (lv_localizations_11_0= ruleLocalization ) )* ( (lv_ends_12_0= ruleRelationshipEnd ) )* otherlv_13= '}' )? )
            {
            // InternalTextualDataModel.g:650:2: ( () otherlv_1= 'Relationship' ( (lv_name_2_0= ruleElementName ) )? (otherlv_3= '[' ( (lv_kind_4_0= ruleRelationshipKind ) ) otherlv_5= ']' )? (otherlv_6= '{' (otherlv_7= '@description' otherlv_8= '(' ( (lv_description_9_0= ruleText ) ) otherlv_10= ')' )? ( (lv_localizations_11_0= ruleLocalization ) )* ( (lv_ends_12_0= ruleRelationshipEnd ) )* otherlv_13= '}' )? )
            // InternalTextualDataModel.g:651:3: () otherlv_1= 'Relationship' ( (lv_name_2_0= ruleElementName ) )? (otherlv_3= '[' ( (lv_kind_4_0= ruleRelationshipKind ) ) otherlv_5= ']' )? (otherlv_6= '{' (otherlv_7= '@description' otherlv_8= '(' ( (lv_description_9_0= ruleText ) ) otherlv_10= ')' )? ( (lv_localizations_11_0= ruleLocalization ) )* ( (lv_ends_12_0= ruleRelationshipEnd ) )* otherlv_13= '}' )?
            {
            // InternalTextualDataModel.g:651:3: ()
            // InternalTextualDataModel.g:652:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelationshipAccess().getRelationshipAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getRelationshipAccess().getRelationshipKeyword_1());
            		
            // InternalTextualDataModel.g:662:3: ( (lv_name_2_0= ruleElementName ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTextualDataModel.g:663:4: (lv_name_2_0= ruleElementName )
                    {
                    // InternalTextualDataModel.g:663:4: (lv_name_2_0= ruleElementName )
                    // InternalTextualDataModel.g:664:5: lv_name_2_0= ruleElementName
                    {

                    					newCompositeNode(grammarAccess.getRelationshipAccess().getNameElementNameParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_30);
                    lv_name_2_0=ruleElementName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRelationshipRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.example.dm.xtext.TextualDataModel.ElementName");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalTextualDataModel.g:681:3: (otherlv_3= '[' ( (lv_kind_4_0= ruleRelationshipKind ) ) otherlv_5= ']' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==19) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTextualDataModel.g:682:4: otherlv_3= '[' ( (lv_kind_4_0= ruleRelationshipKind ) ) otherlv_5= ']'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_31); 

                    				newLeafNode(otherlv_3, grammarAccess.getRelationshipAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalTextualDataModel.g:686:4: ( (lv_kind_4_0= ruleRelationshipKind ) )
                    // InternalTextualDataModel.g:687:5: (lv_kind_4_0= ruleRelationshipKind )
                    {
                    // InternalTextualDataModel.g:687:5: (lv_kind_4_0= ruleRelationshipKind )
                    // InternalTextualDataModel.g:688:6: lv_kind_4_0= ruleRelationshipKind
                    {

                    						newCompositeNode(grammarAccess.getRelationshipAccess().getKindRelationshipKindEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_kind_4_0=ruleRelationshipKind();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationshipRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_4_0,
                    							"org.example.dm.xtext.TextualDataModel.RelationshipKind");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getRelationshipAccess().getRightSquareBracketKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalTextualDataModel.g:710:3: (otherlv_6= '{' (otherlv_7= '@description' otherlv_8= '(' ( (lv_description_9_0= ruleText ) ) otherlv_10= ')' )? ( (lv_localizations_11_0= ruleLocalization ) )* ( (lv_ends_12_0= ruleRelationshipEnd ) )* otherlv_13= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==12) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTextualDataModel.g:711:4: otherlv_6= '{' (otherlv_7= '@description' otherlv_8= '(' ( (lv_description_9_0= ruleText ) ) otherlv_10= ')' )? ( (lv_localizations_11_0= ruleLocalization ) )* ( (lv_ends_12_0= ruleRelationshipEnd ) )* otherlv_13= '}'
                    {
                    otherlv_6=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalTextualDataModel.g:715:4: (otherlv_7= '@description' otherlv_8= '(' ( (lv_description_9_0= ruleText ) ) otherlv_10= ')' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==13) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalTextualDataModel.g:716:5: otherlv_7= '@description' otherlv_8= '(' ( (lv_description_9_0= ruleText ) ) otherlv_10= ')'
                            {
                            otherlv_7=(Token)match(input,13,FOLLOW_6); 

                            					newLeafNode(otherlv_7, grammarAccess.getRelationshipAccess().getDescriptionKeyword_4_1_0());
                            				
                            otherlv_8=(Token)match(input,14,FOLLOW_3); 

                            					newLeafNode(otherlv_8, grammarAccess.getRelationshipAccess().getLeftParenthesisKeyword_4_1_1());
                            				
                            // InternalTextualDataModel.g:724:5: ( (lv_description_9_0= ruleText ) )
                            // InternalTextualDataModel.g:725:6: (lv_description_9_0= ruleText )
                            {
                            // InternalTextualDataModel.g:725:6: (lv_description_9_0= ruleText )
                            // InternalTextualDataModel.g:726:7: lv_description_9_0= ruleText
                            {

                            							newCompositeNode(grammarAccess.getRelationshipAccess().getDescriptionTextParserRuleCall_4_1_2_0());
                            						
                            pushFollow(FOLLOW_7);
                            lv_description_9_0=ruleText();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getRelationshipRule());
                            							}
                            							set(
                            								current,
                            								"description",
                            								lv_description_9_0,
                            								"org.example.dm.xtext.TextualDataModel.Text");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_10=(Token)match(input,15,FOLLOW_20); 

                            					newLeafNode(otherlv_10, grammarAccess.getRelationshipAccess().getRightParenthesisKeyword_4_1_3());
                            				

                            }
                            break;

                    }

                    // InternalTextualDataModel.g:748:4: ( (lv_localizations_11_0= ruleLocalization ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==44) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalTextualDataModel.g:749:5: (lv_localizations_11_0= ruleLocalization )
                    	    {
                    	    // InternalTextualDataModel.g:749:5: (lv_localizations_11_0= ruleLocalization )
                    	    // InternalTextualDataModel.g:750:6: lv_localizations_11_0= ruleLocalization
                    	    {

                    	    						newCompositeNode(grammarAccess.getRelationshipAccess().getLocalizationsLocalizationParserRuleCall_4_2_0());
                    	    					
                    	    pushFollow(FOLLOW_20);
                    	    lv_localizations_11_0=ruleLocalization();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRelationshipRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"localizations",
                    	    							lv_localizations_11_0,
                    	    							"org.example.dm.xtext.TextualDataModel.Localization");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    // InternalTextualDataModel.g:767:4: ( (lv_ends_12_0= ruleRelationshipEnd ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==RULE_STRING) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalTextualDataModel.g:768:5: (lv_ends_12_0= ruleRelationshipEnd )
                    	    {
                    	    // InternalTextualDataModel.g:768:5: (lv_ends_12_0= ruleRelationshipEnd )
                    	    // InternalTextualDataModel.g:769:6: lv_ends_12_0= ruleRelationshipEnd
                    	    {

                    	    						newCompositeNode(grammarAccess.getRelationshipAccess().getEndsRelationshipEndParserRuleCall_4_3_0());
                    	    					
                    	    pushFollow(FOLLOW_21);
                    	    lv_ends_12_0=ruleRelationshipEnd();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRelationshipRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"ends",
                    	    							lv_ends_12_0,
                    	    							"org.example.dm.xtext.TextualDataModel.RelationshipEnd");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_4_4());
                    			

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
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleRelationshipEnd"
    // InternalTextualDataModel.g:795:1: entryRuleRelationshipEnd returns [EObject current=null] : iv_ruleRelationshipEnd= ruleRelationshipEnd EOF ;
    public final EObject entryRuleRelationshipEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationshipEnd = null;


        try {
            // InternalTextualDataModel.g:795:56: (iv_ruleRelationshipEnd= ruleRelationshipEnd EOF )
            // InternalTextualDataModel.g:796:2: iv_ruleRelationshipEnd= ruleRelationshipEnd EOF
            {
             newCompositeNode(grammarAccess.getRelationshipEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationshipEnd=ruleRelationshipEnd();

            state._fsp--;

             current =iv_ruleRelationshipEnd; 
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
    // $ANTLR end "entryRuleRelationshipEnd"


    // $ANTLR start "ruleRelationshipEnd"
    // InternalTextualDataModel.g:802:1: ruleRelationshipEnd returns [EObject current=null] : ( ( (lv_name_0_0= ruleElementName ) )? ( ( ruleElementName ) ) ( (lv_lower_2_0= RULE_INT ) ) otherlv_3= '..' ( (lv_upper_4_0= ruleUnlimitedNatural ) ) (otherlv_5= '{' (otherlv_6= '@description' otherlv_7= '(' ( (lv_description_8_0= ruleText ) ) otherlv_9= ')' )? ( (lv_localizations_10_0= ruleLocalization ) )* otherlv_11= '}' )? ) ;
    public final EObject ruleRelationshipEnd() throws RecognitionException {
        EObject current = null;

        Token lv_lower_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_upper_4_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        EObject lv_localizations_10_0 = null;



        	enterRule();

        try {
            // InternalTextualDataModel.g:808:2: ( ( ( (lv_name_0_0= ruleElementName ) )? ( ( ruleElementName ) ) ( (lv_lower_2_0= RULE_INT ) ) otherlv_3= '..' ( (lv_upper_4_0= ruleUnlimitedNatural ) ) (otherlv_5= '{' (otherlv_6= '@description' otherlv_7= '(' ( (lv_description_8_0= ruleText ) ) otherlv_9= ')' )? ( (lv_localizations_10_0= ruleLocalization ) )* otherlv_11= '}' )? ) )
            // InternalTextualDataModel.g:809:2: ( ( (lv_name_0_0= ruleElementName ) )? ( ( ruleElementName ) ) ( (lv_lower_2_0= RULE_INT ) ) otherlv_3= '..' ( (lv_upper_4_0= ruleUnlimitedNatural ) ) (otherlv_5= '{' (otherlv_6= '@description' otherlv_7= '(' ( (lv_description_8_0= ruleText ) ) otherlv_9= ')' )? ( (lv_localizations_10_0= ruleLocalization ) )* otherlv_11= '}' )? )
            {
            // InternalTextualDataModel.g:809:2: ( ( (lv_name_0_0= ruleElementName ) )? ( ( ruleElementName ) ) ( (lv_lower_2_0= RULE_INT ) ) otherlv_3= '..' ( (lv_upper_4_0= ruleUnlimitedNatural ) ) (otherlv_5= '{' (otherlv_6= '@description' otherlv_7= '(' ( (lv_description_8_0= ruleText ) ) otherlv_9= ')' )? ( (lv_localizations_10_0= ruleLocalization ) )* otherlv_11= '}' )? )
            // InternalTextualDataModel.g:810:3: ( (lv_name_0_0= ruleElementName ) )? ( ( ruleElementName ) ) ( (lv_lower_2_0= RULE_INT ) ) otherlv_3= '..' ( (lv_upper_4_0= ruleUnlimitedNatural ) ) (otherlv_5= '{' (otherlv_6= '@description' otherlv_7= '(' ( (lv_description_8_0= ruleText ) ) otherlv_9= ')' )? ( (lv_localizations_10_0= ruleLocalization ) )* otherlv_11= '}' )?
            {
            // InternalTextualDataModel.g:810:3: ( (lv_name_0_0= ruleElementName ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==RULE_STRING) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // InternalTextualDataModel.g:811:4: (lv_name_0_0= ruleElementName )
                    {
                    // InternalTextualDataModel.g:811:4: (lv_name_0_0= ruleElementName )
                    // InternalTextualDataModel.g:812:5: lv_name_0_0= ruleElementName
                    {

                    					newCompositeNode(grammarAccess.getRelationshipEndAccess().getNameElementNameParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_name_0_0=ruleElementName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRelationshipEndRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"org.example.dm.xtext.TextualDataModel.ElementName");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalTextualDataModel.g:829:3: ( ( ruleElementName ) )
            // InternalTextualDataModel.g:830:4: ( ruleElementName )
            {
            // InternalTextualDataModel.g:830:4: ( ruleElementName )
            // InternalTextualDataModel.g:831:5: ruleElementName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationshipEndRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRelationshipEndAccess().getEntityEntityCrossReference_1_0());
            				
            pushFollow(FOLLOW_22);
            ruleElementName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTextualDataModel.g:845:3: ( (lv_lower_2_0= RULE_INT ) )
            // InternalTextualDataModel.g:846:4: (lv_lower_2_0= RULE_INT )
            {
            // InternalTextualDataModel.g:846:4: (lv_lower_2_0= RULE_INT )
            // InternalTextualDataModel.g:847:5: lv_lower_2_0= RULE_INT
            {
            lv_lower_2_0=(Token)match(input,RULE_INT,FOLLOW_23); 

            					newLeafNode(lv_lower_2_0, grammarAccess.getRelationshipEndAccess().getLowerINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationshipEndRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lower",
            						lv_lower_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getRelationshipEndAccess().getFullStopFullStopKeyword_3());
            		
            // InternalTextualDataModel.g:867:3: ( (lv_upper_4_0= ruleUnlimitedNatural ) )
            // InternalTextualDataModel.g:868:4: (lv_upper_4_0= ruleUnlimitedNatural )
            {
            // InternalTextualDataModel.g:868:4: (lv_upper_4_0= ruleUnlimitedNatural )
            // InternalTextualDataModel.g:869:5: lv_upper_4_0= ruleUnlimitedNatural
            {

            					newCompositeNode(grammarAccess.getRelationshipEndAccess().getUpperUnlimitedNaturalParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_4);
            lv_upper_4_0=ruleUnlimitedNatural();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationshipEndRule());
            					}
            					set(
            						current,
            						"upper",
            						lv_upper_4_0,
            						"org.example.dm.xtext.TextualDataModel.UnlimitedNatural");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTextualDataModel.g:886:3: (otherlv_5= '{' (otherlv_6= '@description' otherlv_7= '(' ( (lv_description_8_0= ruleText ) ) otherlv_9= ')' )? ( (lv_localizations_10_0= ruleLocalization ) )* otherlv_11= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==12) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalTextualDataModel.g:887:4: otherlv_5= '{' (otherlv_6= '@description' otherlv_7= '(' ( (lv_description_8_0= ruleText ) ) otherlv_9= ')' )? ( (lv_localizations_10_0= ruleLocalization ) )* otherlv_11= '}'
                    {
                    otherlv_5=(Token)match(input,12,FOLLOW_27); 

                    				newLeafNode(otherlv_5, grammarAccess.getRelationshipEndAccess().getLeftCurlyBracketKeyword_5_0());
                    			
                    // InternalTextualDataModel.g:891:4: (otherlv_6= '@description' otherlv_7= '(' ( (lv_description_8_0= ruleText ) ) otherlv_9= ')' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==13) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalTextualDataModel.g:892:5: otherlv_6= '@description' otherlv_7= '(' ( (lv_description_8_0= ruleText ) ) otherlv_9= ')'
                            {
                            otherlv_6=(Token)match(input,13,FOLLOW_6); 

                            					newLeafNode(otherlv_6, grammarAccess.getRelationshipEndAccess().getDescriptionKeyword_5_1_0());
                            				
                            otherlv_7=(Token)match(input,14,FOLLOW_3); 

                            					newLeafNode(otherlv_7, grammarAccess.getRelationshipEndAccess().getLeftParenthesisKeyword_5_1_1());
                            				
                            // InternalTextualDataModel.g:900:5: ( (lv_description_8_0= ruleText ) )
                            // InternalTextualDataModel.g:901:6: (lv_description_8_0= ruleText )
                            {
                            // InternalTextualDataModel.g:901:6: (lv_description_8_0= ruleText )
                            // InternalTextualDataModel.g:902:7: lv_description_8_0= ruleText
                            {

                            							newCompositeNode(grammarAccess.getRelationshipEndAccess().getDescriptionTextParserRuleCall_5_1_2_0());
                            						
                            pushFollow(FOLLOW_7);
                            lv_description_8_0=ruleText();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getRelationshipEndRule());
                            							}
                            							set(
                            								current,
                            								"description",
                            								lv_description_8_0,
                            								"org.example.dm.xtext.TextualDataModel.Text");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_9=(Token)match(input,15,FOLLOW_28); 

                            					newLeafNode(otherlv_9, grammarAccess.getRelationshipEndAccess().getRightParenthesisKeyword_5_1_3());
                            				

                            }
                            break;

                    }

                    // InternalTextualDataModel.g:924:4: ( (lv_localizations_10_0= ruleLocalization ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==44) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalTextualDataModel.g:925:5: (lv_localizations_10_0= ruleLocalization )
                    	    {
                    	    // InternalTextualDataModel.g:925:5: (lv_localizations_10_0= ruleLocalization )
                    	    // InternalTextualDataModel.g:926:6: lv_localizations_10_0= ruleLocalization
                    	    {

                    	    						newCompositeNode(grammarAccess.getRelationshipEndAccess().getLocalizationsLocalizationParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_28);
                    	    lv_localizations_10_0=ruleLocalization();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRelationshipEndRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"localizations",
                    	    							lv_localizations_10_0,
                    	    							"org.example.dm.xtext.TextualDataModel.Localization");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getRelationshipEndAccess().getRightCurlyBracketKeyword_5_3());
                    			

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
    // $ANTLR end "ruleRelationshipEnd"


    // $ANTLR start "entryRuleDataType"
    // InternalTextualDataModel.g:952:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalTextualDataModel.g:952:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalTextualDataModel.g:953:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalTextualDataModel.g:959:1: ruleDataType returns [EObject current=null] : (this_BooleanType_0= ruleBooleanType | this_StringType_1= ruleStringType | this_NumericType_2= ruleNumericType | this_DateType_3= ruleDateType | this_DateTimeType_4= ruleDateTimeType | this_UuidType_5= ruleUuidType ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanType_0 = null;

        EObject this_StringType_1 = null;

        EObject this_NumericType_2 = null;

        EObject this_DateType_3 = null;

        EObject this_DateTimeType_4 = null;

        EObject this_UuidType_5 = null;



        	enterRule();

        try {
            // InternalTextualDataModel.g:965:2: ( (this_BooleanType_0= ruleBooleanType | this_StringType_1= ruleStringType | this_NumericType_2= ruleNumericType | this_DateType_3= ruleDateType | this_DateTimeType_4= ruleDateTimeType | this_UuidType_5= ruleUuidType ) )
            // InternalTextualDataModel.g:966:2: (this_BooleanType_0= ruleBooleanType | this_StringType_1= ruleStringType | this_NumericType_2= ruleNumericType | this_DateType_3= ruleDateType | this_DateTimeType_4= ruleDateTimeType | this_UuidType_5= ruleUuidType )
            {
            // InternalTextualDataModel.g:966:2: (this_BooleanType_0= ruleBooleanType | this_StringType_1= ruleStringType | this_NumericType_2= ruleNumericType | this_DateType_3= ruleDateType | this_DateTimeType_4= ruleDateTimeType | this_UuidType_5= ruleUuidType )
            int alt31=6;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt31=1;
                }
                break;
            case 27:
                {
                alt31=2;
                }
                break;
            case 32:
                {
                alt31=3;
                }
                break;
            case 41:
                {
                alt31=4;
                }
                break;
            case 42:
                {
                alt31=5;
                }
                break;
            case 43:
                {
                alt31=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalTextualDataModel.g:967:3: this_BooleanType_0= ruleBooleanType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getBooleanTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanType_0=ruleBooleanType();

                    state._fsp--;


                    			current = this_BooleanType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTextualDataModel.g:976:3: this_StringType_1= ruleStringType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getStringTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringType_1=ruleStringType();

                    state._fsp--;


                    			current = this_StringType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTextualDataModel.g:985:3: this_NumericType_2= ruleNumericType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getNumericTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumericType_2=ruleNumericType();

                    state._fsp--;


                    			current = this_NumericType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTextualDataModel.g:994:3: this_DateType_3= ruleDateType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getDateTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DateType_3=ruleDateType();

                    state._fsp--;


                    			current = this_DateType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalTextualDataModel.g:1003:3: this_DateTimeType_4= ruleDateTimeType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getDateTimeTypeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DateTimeType_4=ruleDateTimeType();

                    state._fsp--;


                    			current = this_DateTimeType_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalTextualDataModel.g:1012:3: this_UuidType_5= ruleUuidType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getUuidTypeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_UuidType_5=ruleUuidType();

                    state._fsp--;


                    			current = this_UuidType_5;
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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleBooleanType"
    // InternalTextualDataModel.g:1024:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // InternalTextualDataModel.g:1024:52: (iv_ruleBooleanType= ruleBooleanType EOF )
            // InternalTextualDataModel.g:1025:2: iv_ruleBooleanType= ruleBooleanType EOF
            {
             newCompositeNode(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanType=ruleBooleanType();

            state._fsp--;

             current =iv_ruleBooleanType; 
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
    // $ANTLR end "entryRuleBooleanType"


    // $ANTLR start "ruleBooleanType"
    // InternalTextualDataModel.g:1031:1: ruleBooleanType returns [EObject current=null] : (otherlv_0= 'BooleanType' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* otherlv_8= '}' )? ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        EObject lv_localizations_7_0 = null;



        	enterRule();

        try {
            // InternalTextualDataModel.g:1037:2: ( (otherlv_0= 'BooleanType' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* otherlv_8= '}' )? ) )
            // InternalTextualDataModel.g:1038:2: (otherlv_0= 'BooleanType' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* otherlv_8= '}' )? )
            {
            // InternalTextualDataModel.g:1038:2: (otherlv_0= 'BooleanType' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* otherlv_8= '}' )? )
            // InternalTextualDataModel.g:1039:3: otherlv_0= 'BooleanType' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* otherlv_8= '}' )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBooleanTypeAccess().getBooleanTypeKeyword_0());
            		
            // InternalTextualDataModel.g:1043:3: ( (lv_name_1_0= ruleElementName ) )
            // InternalTextualDataModel.g:1044:4: (lv_name_1_0= ruleElementName )
            {
            // InternalTextualDataModel.g:1044:4: (lv_name_1_0= ruleElementName )
            // InternalTextualDataModel.g:1045:5: lv_name_1_0= ruleElementName
            {

            					newCompositeNode(grammarAccess.getBooleanTypeAccess().getNameElementNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleElementName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.example.dm.xtext.TextualDataModel.ElementName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTextualDataModel.g:1062:3: (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* otherlv_8= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==12) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalTextualDataModel.g:1063:4: otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* otherlv_8= '}'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_27); 

                    				newLeafNode(otherlv_2, grammarAccess.getBooleanTypeAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalTextualDataModel.g:1067:4: (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==13) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalTextualDataModel.g:1068:5: otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')'
                            {
                            otherlv_3=(Token)match(input,13,FOLLOW_6); 

                            					newLeafNode(otherlv_3, grammarAccess.getBooleanTypeAccess().getDescriptionKeyword_2_1_0());
                            				
                            otherlv_4=(Token)match(input,14,FOLLOW_3); 

                            					newLeafNode(otherlv_4, grammarAccess.getBooleanTypeAccess().getLeftParenthesisKeyword_2_1_1());
                            				
                            // InternalTextualDataModel.g:1076:5: ( (lv_description_5_0= ruleText ) )
                            // InternalTextualDataModel.g:1077:6: (lv_description_5_0= ruleText )
                            {
                            // InternalTextualDataModel.g:1077:6: (lv_description_5_0= ruleText )
                            // InternalTextualDataModel.g:1078:7: lv_description_5_0= ruleText
                            {

                            							newCompositeNode(grammarAccess.getBooleanTypeAccess().getDescriptionTextParserRuleCall_2_1_2_0());
                            						
                            pushFollow(FOLLOW_7);
                            lv_description_5_0=ruleText();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getBooleanTypeRule());
                            							}
                            							set(
                            								current,
                            								"description",
                            								lv_description_5_0,
                            								"org.example.dm.xtext.TextualDataModel.Text");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_6=(Token)match(input,15,FOLLOW_28); 

                            					newLeafNode(otherlv_6, grammarAccess.getBooleanTypeAccess().getRightParenthesisKeyword_2_1_3());
                            				

                            }
                            break;

                    }

                    // InternalTextualDataModel.g:1100:4: ( (lv_localizations_7_0= ruleLocalization ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==44) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalTextualDataModel.g:1101:5: (lv_localizations_7_0= ruleLocalization )
                    	    {
                    	    // InternalTextualDataModel.g:1101:5: (lv_localizations_7_0= ruleLocalization )
                    	    // InternalTextualDataModel.g:1102:6: lv_localizations_7_0= ruleLocalization
                    	    {

                    	    						newCompositeNode(grammarAccess.getBooleanTypeAccess().getLocalizationsLocalizationParserRuleCall_2_2_0());
                    	    					
                    	    pushFollow(FOLLOW_28);
                    	    lv_localizations_7_0=ruleLocalization();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getBooleanTypeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"localizations",
                    	    							lv_localizations_7_0,
                    	    							"org.example.dm.xtext.TextualDataModel.Localization");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getBooleanTypeAccess().getRightCurlyBracketKeyword_2_3());
                    			

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
    // $ANTLR end "ruleBooleanType"


    // $ANTLR start "entryRuleStringType"
    // InternalTextualDataModel.g:1128:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // InternalTextualDataModel.g:1128:51: (iv_ruleStringType= ruleStringType EOF )
            // InternalTextualDataModel.g:1129:2: iv_ruleStringType= ruleStringType EOF
            {
             newCompositeNode(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringType=ruleStringType();

            state._fsp--;

             current =iv_ruleStringType; 
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
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // InternalTextualDataModel.g:1135:1: ruleStringType returns [EObject current=null] : (otherlv_0= 'StringType' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* (otherlv_8= 'length' ( (lv_length_9_0= RULE_INT ) ) )? (otherlv_10= 'minLength' ( (lv_minLength_11_0= RULE_INT ) ) )? (otherlv_12= 'maxLength' ( (lv_maxLength_13_0= RULE_INT ) ) )? (otherlv_14= 'pattern' ( (lv_pattern_15_0= ruleText ) ) )? otherlv_16= '}' )? ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_length_9_0=null;
        Token otherlv_10=null;
        Token lv_minLength_11_0=null;
        Token otherlv_12=null;
        Token lv_maxLength_13_0=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        EObject lv_localizations_7_0 = null;

        AntlrDatatypeRuleToken lv_pattern_15_0 = null;



        	enterRule();

        try {
            // InternalTextualDataModel.g:1141:2: ( (otherlv_0= 'StringType' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* (otherlv_8= 'length' ( (lv_length_9_0= RULE_INT ) ) )? (otherlv_10= 'minLength' ( (lv_minLength_11_0= RULE_INT ) ) )? (otherlv_12= 'maxLength' ( (lv_maxLength_13_0= RULE_INT ) ) )? (otherlv_14= 'pattern' ( (lv_pattern_15_0= ruleText ) ) )? otherlv_16= '}' )? ) )
            // InternalTextualDataModel.g:1142:2: (otherlv_0= 'StringType' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* (otherlv_8= 'length' ( (lv_length_9_0= RULE_INT ) ) )? (otherlv_10= 'minLength' ( (lv_minLength_11_0= RULE_INT ) ) )? (otherlv_12= 'maxLength' ( (lv_maxLength_13_0= RULE_INT ) ) )? (otherlv_14= 'pattern' ( (lv_pattern_15_0= ruleText ) ) )? otherlv_16= '}' )? )
            {
            // InternalTextualDataModel.g:1142:2: (otherlv_0= 'StringType' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* (otherlv_8= 'length' ( (lv_length_9_0= RULE_INT ) ) )? (otherlv_10= 'minLength' ( (lv_minLength_11_0= RULE_INT ) ) )? (otherlv_12= 'maxLength' ( (lv_maxLength_13_0= RULE_INT ) ) )? (otherlv_14= 'pattern' ( (lv_pattern_15_0= ruleText ) ) )? otherlv_16= '}' )? )
            // InternalTextualDataModel.g:1143:3: otherlv_0= 'StringType' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* (otherlv_8= 'length' ( (lv_length_9_0= RULE_INT ) ) )? (otherlv_10= 'minLength' ( (lv_minLength_11_0= RULE_INT ) ) )? (otherlv_12= 'maxLength' ( (lv_maxLength_13_0= RULE_INT ) ) )? (otherlv_14= 'pattern' ( (lv_pattern_15_0= ruleText ) ) )? otherlv_16= '}' )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStringTypeAccess().getStringTypeKeyword_0());
            		
            // InternalTextualDataModel.g:1147:3: ( (lv_name_1_0= ruleElementName ) )
            // InternalTextualDataModel.g:1148:4: (lv_name_1_0= ruleElementName )
            {
            // InternalTextualDataModel.g:1148:4: (lv_name_1_0= ruleElementName )
            // InternalTextualDataModel.g:1149:5: lv_name_1_0= ruleElementName
            {

            					newCompositeNode(grammarAccess.getStringTypeAccess().getNameElementNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleElementName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.example.dm.xtext.TextualDataModel.ElementName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTextualDataModel.g:1166:3: (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* (otherlv_8= 'length' ( (lv_length_9_0= RULE_INT ) ) )? (otherlv_10= 'minLength' ( (lv_minLength_11_0= RULE_INT ) ) )? (otherlv_12= 'maxLength' ( (lv_maxLength_13_0= RULE_INT ) ) )? (otherlv_14= 'pattern' ( (lv_pattern_15_0= ruleText ) ) )? otherlv_16= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==12) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalTextualDataModel.g:1167:4: otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* (otherlv_8= 'length' ( (lv_length_9_0= RULE_INT ) ) )? (otherlv_10= 'minLength' ( (lv_minLength_11_0= RULE_INT ) ) )? (otherlv_12= 'maxLength' ( (lv_maxLength_13_0= RULE_INT ) ) )? (otherlv_14= 'pattern' ( (lv_pattern_15_0= ruleText ) ) )? otherlv_16= '}'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_32); 

                    				newLeafNode(otherlv_2, grammarAccess.getStringTypeAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalTextualDataModel.g:1171:4: (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==13) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalTextualDataModel.g:1172:5: otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')'
                            {
                            otherlv_3=(Token)match(input,13,FOLLOW_6); 

                            					newLeafNode(otherlv_3, grammarAccess.getStringTypeAccess().getDescriptionKeyword_2_1_0());
                            				
                            otherlv_4=(Token)match(input,14,FOLLOW_3); 

                            					newLeafNode(otherlv_4, grammarAccess.getStringTypeAccess().getLeftParenthesisKeyword_2_1_1());
                            				
                            // InternalTextualDataModel.g:1180:5: ( (lv_description_5_0= ruleText ) )
                            // InternalTextualDataModel.g:1181:6: (lv_description_5_0= ruleText )
                            {
                            // InternalTextualDataModel.g:1181:6: (lv_description_5_0= ruleText )
                            // InternalTextualDataModel.g:1182:7: lv_description_5_0= ruleText
                            {

                            							newCompositeNode(grammarAccess.getStringTypeAccess().getDescriptionTextParserRuleCall_2_1_2_0());
                            						
                            pushFollow(FOLLOW_7);
                            lv_description_5_0=ruleText();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getStringTypeRule());
                            							}
                            							set(
                            								current,
                            								"description",
                            								lv_description_5_0,
                            								"org.example.dm.xtext.TextualDataModel.Text");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_6=(Token)match(input,15,FOLLOW_33); 

                            					newLeafNode(otherlv_6, grammarAccess.getStringTypeAccess().getRightParenthesisKeyword_2_1_3());
                            				

                            }
                            break;

                    }

                    // InternalTextualDataModel.g:1204:4: ( (lv_localizations_7_0= ruleLocalization ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==44) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalTextualDataModel.g:1205:5: (lv_localizations_7_0= ruleLocalization )
                    	    {
                    	    // InternalTextualDataModel.g:1205:5: (lv_localizations_7_0= ruleLocalization )
                    	    // InternalTextualDataModel.g:1206:6: lv_localizations_7_0= ruleLocalization
                    	    {

                    	    						newCompositeNode(grammarAccess.getStringTypeAccess().getLocalizationsLocalizationParserRuleCall_2_2_0());
                    	    					
                    	    pushFollow(FOLLOW_33);
                    	    lv_localizations_7_0=ruleLocalization();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getStringTypeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"localizations",
                    	    							lv_localizations_7_0,
                    	    							"org.example.dm.xtext.TextualDataModel.Localization");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    // InternalTextualDataModel.g:1223:4: (otherlv_8= 'length' ( (lv_length_9_0= RULE_INT ) ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==28) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalTextualDataModel.g:1224:5: otherlv_8= 'length' ( (lv_length_9_0= RULE_INT ) )
                            {
                            otherlv_8=(Token)match(input,28,FOLLOW_22); 

                            					newLeafNode(otherlv_8, grammarAccess.getStringTypeAccess().getLengthKeyword_2_3_0());
                            				
                            // InternalTextualDataModel.g:1228:5: ( (lv_length_9_0= RULE_INT ) )
                            // InternalTextualDataModel.g:1229:6: (lv_length_9_0= RULE_INT )
                            {
                            // InternalTextualDataModel.g:1229:6: (lv_length_9_0= RULE_INT )
                            // InternalTextualDataModel.g:1230:7: lv_length_9_0= RULE_INT
                            {
                            lv_length_9_0=(Token)match(input,RULE_INT,FOLLOW_34); 

                            							newLeafNode(lv_length_9_0, grammarAccess.getStringTypeAccess().getLengthINTTerminalRuleCall_2_3_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getStringTypeRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"length",
                            								lv_length_9_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalTextualDataModel.g:1247:4: (otherlv_10= 'minLength' ( (lv_minLength_11_0= RULE_INT ) ) )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==29) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalTextualDataModel.g:1248:5: otherlv_10= 'minLength' ( (lv_minLength_11_0= RULE_INT ) )
                            {
                            otherlv_10=(Token)match(input,29,FOLLOW_22); 

                            					newLeafNode(otherlv_10, grammarAccess.getStringTypeAccess().getMinLengthKeyword_2_4_0());
                            				
                            // InternalTextualDataModel.g:1252:5: ( (lv_minLength_11_0= RULE_INT ) )
                            // InternalTextualDataModel.g:1253:6: (lv_minLength_11_0= RULE_INT )
                            {
                            // InternalTextualDataModel.g:1253:6: (lv_minLength_11_0= RULE_INT )
                            // InternalTextualDataModel.g:1254:7: lv_minLength_11_0= RULE_INT
                            {
                            lv_minLength_11_0=(Token)match(input,RULE_INT,FOLLOW_35); 

                            							newLeafNode(lv_minLength_11_0, grammarAccess.getStringTypeAccess().getMinLengthINTTerminalRuleCall_2_4_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getStringTypeRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"minLength",
                            								lv_minLength_11_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalTextualDataModel.g:1271:4: (otherlv_12= 'maxLength' ( (lv_maxLength_13_0= RULE_INT ) ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==30) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalTextualDataModel.g:1272:5: otherlv_12= 'maxLength' ( (lv_maxLength_13_0= RULE_INT ) )
                            {
                            otherlv_12=(Token)match(input,30,FOLLOW_22); 

                            					newLeafNode(otherlv_12, grammarAccess.getStringTypeAccess().getMaxLengthKeyword_2_5_0());
                            				
                            // InternalTextualDataModel.g:1276:5: ( (lv_maxLength_13_0= RULE_INT ) )
                            // InternalTextualDataModel.g:1277:6: (lv_maxLength_13_0= RULE_INT )
                            {
                            // InternalTextualDataModel.g:1277:6: (lv_maxLength_13_0= RULE_INT )
                            // InternalTextualDataModel.g:1278:7: lv_maxLength_13_0= RULE_INT
                            {
                            lv_maxLength_13_0=(Token)match(input,RULE_INT,FOLLOW_36); 

                            							newLeafNode(lv_maxLength_13_0, grammarAccess.getStringTypeAccess().getMaxLengthINTTerminalRuleCall_2_5_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getStringTypeRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"maxLength",
                            								lv_maxLength_13_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalTextualDataModel.g:1295:4: (otherlv_14= 'pattern' ( (lv_pattern_15_0= ruleText ) ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==31) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalTextualDataModel.g:1296:5: otherlv_14= 'pattern' ( (lv_pattern_15_0= ruleText ) )
                            {
                            otherlv_14=(Token)match(input,31,FOLLOW_3); 

                            					newLeafNode(otherlv_14, grammarAccess.getStringTypeAccess().getPatternKeyword_2_6_0());
                            				
                            // InternalTextualDataModel.g:1300:5: ( (lv_pattern_15_0= ruleText ) )
                            // InternalTextualDataModel.g:1301:6: (lv_pattern_15_0= ruleText )
                            {
                            // InternalTextualDataModel.g:1301:6: (lv_pattern_15_0= ruleText )
                            // InternalTextualDataModel.g:1302:7: lv_pattern_15_0= ruleText
                            {

                            							newCompositeNode(grammarAccess.getStringTypeAccess().getPatternTextParserRuleCall_2_6_1_0());
                            						
                            pushFollow(FOLLOW_37);
                            lv_pattern_15_0=ruleText();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getStringTypeRule());
                            							}
                            							set(
                            								current,
                            								"pattern",
                            								lv_pattern_15_0,
                            								"org.example.dm.xtext.TextualDataModel.Text");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_16=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getStringTypeAccess().getRightCurlyBracketKeyword_2_7());
                    			

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
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleNumericType"
    // InternalTextualDataModel.g:1329:1: entryRuleNumericType returns [EObject current=null] : iv_ruleNumericType= ruleNumericType EOF ;
    public final EObject entryRuleNumericType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericType = null;


        try {
            // InternalTextualDataModel.g:1329:52: (iv_ruleNumericType= ruleNumericType EOF )
            // InternalTextualDataModel.g:1330:2: iv_ruleNumericType= ruleNumericType EOF
            {
             newCompositeNode(grammarAccess.getNumericTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumericType=ruleNumericType();

            state._fsp--;

             current =iv_ruleNumericType; 
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
    // $ANTLR end "entryRuleNumericType"


    // $ANTLR start "ruleNumericType"
    // InternalTextualDataModel.g:1336:1: ruleNumericType returns [EObject current=null] : (otherlv_0= 'NumericType' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* (otherlv_8= 'size' ( (lv_size_9_0= rulePositiveShort ) ) )? (otherlv_10= 'totalDigits' ( (lv_totalDigits_11_0= rulePositiveShort ) ) )? (otherlv_12= 'fractionDigits' ( (lv_fractionDigits_13_0= rulePositiveShort ) ) )? (otherlv_14= 'minInclusive' ( (lv_minInclusive_15_0= ruleDouble ) ) )? (otherlv_16= 'minExclusive' ( (lv_minExclusive_17_0= ruleDouble ) ) )? (otherlv_18= 'maxInclusive' ( (lv_maxInclusive_19_0= ruleDouble ) ) )? (otherlv_20= 'maxExclusive' ( (lv_maxExclusive_21_0= ruleDouble ) ) )? (otherlv_22= 'measurementUnit' ( (lv_measurementUnit_23_0= ruleText ) ) )? otherlv_24= '}' )? ) ;
    public final EObject ruleNumericType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        EObject lv_localizations_7_0 = null;

        AntlrDatatypeRuleToken lv_size_9_0 = null;

        AntlrDatatypeRuleToken lv_totalDigits_11_0 = null;

        AntlrDatatypeRuleToken lv_fractionDigits_13_0 = null;

        AntlrDatatypeRuleToken lv_minInclusive_15_0 = null;

        AntlrDatatypeRuleToken lv_minExclusive_17_0 = null;

        AntlrDatatypeRuleToken lv_maxInclusive_19_0 = null;

        AntlrDatatypeRuleToken lv_maxExclusive_21_0 = null;

        AntlrDatatypeRuleToken lv_measurementUnit_23_0 = null;



        	enterRule();

        try {
            // InternalTextualDataModel.g:1342:2: ( (otherlv_0= 'NumericType' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* (otherlv_8= 'size' ( (lv_size_9_0= rulePositiveShort ) ) )? (otherlv_10= 'totalDigits' ( (lv_totalDigits_11_0= rulePositiveShort ) ) )? (otherlv_12= 'fractionDigits' ( (lv_fractionDigits_13_0= rulePositiveShort ) ) )? (otherlv_14= 'minInclusive' ( (lv_minInclusive_15_0= ruleDouble ) ) )? (otherlv_16= 'minExclusive' ( (lv_minExclusive_17_0= ruleDouble ) ) )? (otherlv_18= 'maxInclusive' ( (lv_maxInclusive_19_0= ruleDouble ) ) )? (otherlv_20= 'maxExclusive' ( (lv_maxExclusive_21_0= ruleDouble ) ) )? (otherlv_22= 'measurementUnit' ( (lv_measurementUnit_23_0= ruleText ) ) )? otherlv_24= '}' )? ) )
            // InternalTextualDataModel.g:1343:2: (otherlv_0= 'NumericType' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* (otherlv_8= 'size' ( (lv_size_9_0= rulePositiveShort ) ) )? (otherlv_10= 'totalDigits' ( (lv_totalDigits_11_0= rulePositiveShort ) ) )? (otherlv_12= 'fractionDigits' ( (lv_fractionDigits_13_0= rulePositiveShort ) ) )? (otherlv_14= 'minInclusive' ( (lv_minInclusive_15_0= ruleDouble ) ) )? (otherlv_16= 'minExclusive' ( (lv_minExclusive_17_0= ruleDouble ) ) )? (otherlv_18= 'maxInclusive' ( (lv_maxInclusive_19_0= ruleDouble ) ) )? (otherlv_20= 'maxExclusive' ( (lv_maxExclusive_21_0= ruleDouble ) ) )? (otherlv_22= 'measurementUnit' ( (lv_measurementUnit_23_0= ruleText ) ) )? otherlv_24= '}' )? )
            {
            // InternalTextualDataModel.g:1343:2: (otherlv_0= 'NumericType' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* (otherlv_8= 'size' ( (lv_size_9_0= rulePositiveShort ) ) )? (otherlv_10= 'totalDigits' ( (lv_totalDigits_11_0= rulePositiveShort ) ) )? (otherlv_12= 'fractionDigits' ( (lv_fractionDigits_13_0= rulePositiveShort ) ) )? (otherlv_14= 'minInclusive' ( (lv_minInclusive_15_0= ruleDouble ) ) )? (otherlv_16= 'minExclusive' ( (lv_minExclusive_17_0= ruleDouble ) ) )? (otherlv_18= 'maxInclusive' ( (lv_maxInclusive_19_0= ruleDouble ) ) )? (otherlv_20= 'maxExclusive' ( (lv_maxExclusive_21_0= ruleDouble ) ) )? (otherlv_22= 'measurementUnit' ( (lv_measurementUnit_23_0= ruleText ) ) )? otherlv_24= '}' )? )
            // InternalTextualDataModel.g:1344:3: otherlv_0= 'NumericType' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* (otherlv_8= 'size' ( (lv_size_9_0= rulePositiveShort ) ) )? (otherlv_10= 'totalDigits' ( (lv_totalDigits_11_0= rulePositiveShort ) ) )? (otherlv_12= 'fractionDigits' ( (lv_fractionDigits_13_0= rulePositiveShort ) ) )? (otherlv_14= 'minInclusive' ( (lv_minInclusive_15_0= ruleDouble ) ) )? (otherlv_16= 'minExclusive' ( (lv_minExclusive_17_0= ruleDouble ) ) )? (otherlv_18= 'maxInclusive' ( (lv_maxInclusive_19_0= ruleDouble ) ) )? (otherlv_20= 'maxExclusive' ( (lv_maxExclusive_21_0= ruleDouble ) ) )? (otherlv_22= 'measurementUnit' ( (lv_measurementUnit_23_0= ruleText ) ) )? otherlv_24= '}' )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNumericTypeAccess().getNumericTypeKeyword_0());
            		
            // InternalTextualDataModel.g:1348:3: ( (lv_name_1_0= ruleElementName ) )
            // InternalTextualDataModel.g:1349:4: (lv_name_1_0= ruleElementName )
            {
            // InternalTextualDataModel.g:1349:4: (lv_name_1_0= ruleElementName )
            // InternalTextualDataModel.g:1350:5: lv_name_1_0= ruleElementName
            {

            					newCompositeNode(grammarAccess.getNumericTypeAccess().getNameElementNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleElementName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumericTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.example.dm.xtext.TextualDataModel.ElementName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTextualDataModel.g:1367:3: (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* (otherlv_8= 'size' ( (lv_size_9_0= rulePositiveShort ) ) )? (otherlv_10= 'totalDigits' ( (lv_totalDigits_11_0= rulePositiveShort ) ) )? (otherlv_12= 'fractionDigits' ( (lv_fractionDigits_13_0= rulePositiveShort ) ) )? (otherlv_14= 'minInclusive' ( (lv_minInclusive_15_0= ruleDouble ) ) )? (otherlv_16= 'minExclusive' ( (lv_minExclusive_17_0= ruleDouble ) ) )? (otherlv_18= 'maxInclusive' ( (lv_maxInclusive_19_0= ruleDouble ) ) )? (otherlv_20= 'maxExclusive' ( (lv_maxExclusive_21_0= ruleDouble ) ) )? (otherlv_22= 'measurementUnit' ( (lv_measurementUnit_23_0= ruleText ) ) )? otherlv_24= '}' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==12) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalTextualDataModel.g:1368:4: otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* (otherlv_8= 'size' ( (lv_size_9_0= rulePositiveShort ) ) )? (otherlv_10= 'totalDigits' ( (lv_totalDigits_11_0= rulePositiveShort ) ) )? (otherlv_12= 'fractionDigits' ( (lv_fractionDigits_13_0= rulePositiveShort ) ) )? (otherlv_14= 'minInclusive' ( (lv_minInclusive_15_0= ruleDouble ) ) )? (otherlv_16= 'minExclusive' ( (lv_minExclusive_17_0= ruleDouble ) ) )? (otherlv_18= 'maxInclusive' ( (lv_maxInclusive_19_0= ruleDouble ) ) )? (otherlv_20= 'maxExclusive' ( (lv_maxExclusive_21_0= ruleDouble ) ) )? (otherlv_22= 'measurementUnit' ( (lv_measurementUnit_23_0= ruleText ) ) )? otherlv_24= '}'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_38); 

                    				newLeafNode(otherlv_2, grammarAccess.getNumericTypeAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalTextualDataModel.g:1372:4: (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==13) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalTextualDataModel.g:1373:5: otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')'
                            {
                            otherlv_3=(Token)match(input,13,FOLLOW_6); 

                            					newLeafNode(otherlv_3, grammarAccess.getNumericTypeAccess().getDescriptionKeyword_2_1_0());
                            				
                            otherlv_4=(Token)match(input,14,FOLLOW_3); 

                            					newLeafNode(otherlv_4, grammarAccess.getNumericTypeAccess().getLeftParenthesisKeyword_2_1_1());
                            				
                            // InternalTextualDataModel.g:1381:5: ( (lv_description_5_0= ruleText ) )
                            // InternalTextualDataModel.g:1382:6: (lv_description_5_0= ruleText )
                            {
                            // InternalTextualDataModel.g:1382:6: (lv_description_5_0= ruleText )
                            // InternalTextualDataModel.g:1383:7: lv_description_5_0= ruleText
                            {

                            							newCompositeNode(grammarAccess.getNumericTypeAccess().getDescriptionTextParserRuleCall_2_1_2_0());
                            						
                            pushFollow(FOLLOW_7);
                            lv_description_5_0=ruleText();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getNumericTypeRule());
                            							}
                            							set(
                            								current,
                            								"description",
                            								lv_description_5_0,
                            								"org.example.dm.xtext.TextualDataModel.Text");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_6=(Token)match(input,15,FOLLOW_39); 

                            					newLeafNode(otherlv_6, grammarAccess.getNumericTypeAccess().getRightParenthesisKeyword_2_1_3());
                            				

                            }
                            break;

                    }

                    // InternalTextualDataModel.g:1405:4: ( (lv_localizations_7_0= ruleLocalization ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==44) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalTextualDataModel.g:1406:5: (lv_localizations_7_0= ruleLocalization )
                    	    {
                    	    // InternalTextualDataModel.g:1406:5: (lv_localizations_7_0= ruleLocalization )
                    	    // InternalTextualDataModel.g:1407:6: lv_localizations_7_0= ruleLocalization
                    	    {

                    	    						newCompositeNode(grammarAccess.getNumericTypeAccess().getLocalizationsLocalizationParserRuleCall_2_2_0());
                    	    					
                    	    pushFollow(FOLLOW_39);
                    	    lv_localizations_7_0=ruleLocalization();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getNumericTypeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"localizations",
                    	    							lv_localizations_7_0,
                    	    							"org.example.dm.xtext.TextualDataModel.Localization");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    // InternalTextualDataModel.g:1424:4: (otherlv_8= 'size' ( (lv_size_9_0= rulePositiveShort ) ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==33) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalTextualDataModel.g:1425:5: otherlv_8= 'size' ( (lv_size_9_0= rulePositiveShort ) )
                            {
                            otherlv_8=(Token)match(input,33,FOLLOW_22); 

                            					newLeafNode(otherlv_8, grammarAccess.getNumericTypeAccess().getSizeKeyword_2_3_0());
                            				
                            // InternalTextualDataModel.g:1429:5: ( (lv_size_9_0= rulePositiveShort ) )
                            // InternalTextualDataModel.g:1430:6: (lv_size_9_0= rulePositiveShort )
                            {
                            // InternalTextualDataModel.g:1430:6: (lv_size_9_0= rulePositiveShort )
                            // InternalTextualDataModel.g:1431:7: lv_size_9_0= rulePositiveShort
                            {

                            							newCompositeNode(grammarAccess.getNumericTypeAccess().getSizePositiveShortParserRuleCall_2_3_1_0());
                            						
                            pushFollow(FOLLOW_40);
                            lv_size_9_0=rulePositiveShort();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getNumericTypeRule());
                            							}
                            							set(
                            								current,
                            								"size",
                            								lv_size_9_0,
                            								"org.example.dm.xtext.TextualDataModel.PositiveShort");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalTextualDataModel.g:1449:4: (otherlv_10= 'totalDigits' ( (lv_totalDigits_11_0= rulePositiveShort ) ) )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==34) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalTextualDataModel.g:1450:5: otherlv_10= 'totalDigits' ( (lv_totalDigits_11_0= rulePositiveShort ) )
                            {
                            otherlv_10=(Token)match(input,34,FOLLOW_22); 

                            					newLeafNode(otherlv_10, grammarAccess.getNumericTypeAccess().getTotalDigitsKeyword_2_4_0());
                            				
                            // InternalTextualDataModel.g:1454:5: ( (lv_totalDigits_11_0= rulePositiveShort ) )
                            // InternalTextualDataModel.g:1455:6: (lv_totalDigits_11_0= rulePositiveShort )
                            {
                            // InternalTextualDataModel.g:1455:6: (lv_totalDigits_11_0= rulePositiveShort )
                            // InternalTextualDataModel.g:1456:7: lv_totalDigits_11_0= rulePositiveShort
                            {

                            							newCompositeNode(grammarAccess.getNumericTypeAccess().getTotalDigitsPositiveShortParserRuleCall_2_4_1_0());
                            						
                            pushFollow(FOLLOW_41);
                            lv_totalDigits_11_0=rulePositiveShort();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getNumericTypeRule());
                            							}
                            							set(
                            								current,
                            								"totalDigits",
                            								lv_totalDigits_11_0,
                            								"org.example.dm.xtext.TextualDataModel.PositiveShort");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalTextualDataModel.g:1474:4: (otherlv_12= 'fractionDigits' ( (lv_fractionDigits_13_0= rulePositiveShort ) ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==35) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalTextualDataModel.g:1475:5: otherlv_12= 'fractionDigits' ( (lv_fractionDigits_13_0= rulePositiveShort ) )
                            {
                            otherlv_12=(Token)match(input,35,FOLLOW_22); 

                            					newLeafNode(otherlv_12, grammarAccess.getNumericTypeAccess().getFractionDigitsKeyword_2_5_0());
                            				
                            // InternalTextualDataModel.g:1479:5: ( (lv_fractionDigits_13_0= rulePositiveShort ) )
                            // InternalTextualDataModel.g:1480:6: (lv_fractionDigits_13_0= rulePositiveShort )
                            {
                            // InternalTextualDataModel.g:1480:6: (lv_fractionDigits_13_0= rulePositiveShort )
                            // InternalTextualDataModel.g:1481:7: lv_fractionDigits_13_0= rulePositiveShort
                            {

                            							newCompositeNode(grammarAccess.getNumericTypeAccess().getFractionDigitsPositiveShortParserRuleCall_2_5_1_0());
                            						
                            pushFollow(FOLLOW_42);
                            lv_fractionDigits_13_0=rulePositiveShort();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getNumericTypeRule());
                            							}
                            							set(
                            								current,
                            								"fractionDigits",
                            								lv_fractionDigits_13_0,
                            								"org.example.dm.xtext.TextualDataModel.PositiveShort");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalTextualDataModel.g:1499:4: (otherlv_14= 'minInclusive' ( (lv_minInclusive_15_0= ruleDouble ) ) )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==36) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalTextualDataModel.g:1500:5: otherlv_14= 'minInclusive' ( (lv_minInclusive_15_0= ruleDouble ) )
                            {
                            otherlv_14=(Token)match(input,36,FOLLOW_43); 

                            					newLeafNode(otherlv_14, grammarAccess.getNumericTypeAccess().getMinInclusiveKeyword_2_6_0());
                            				
                            // InternalTextualDataModel.g:1504:5: ( (lv_minInclusive_15_0= ruleDouble ) )
                            // InternalTextualDataModel.g:1505:6: (lv_minInclusive_15_0= ruleDouble )
                            {
                            // InternalTextualDataModel.g:1505:6: (lv_minInclusive_15_0= ruleDouble )
                            // InternalTextualDataModel.g:1506:7: lv_minInclusive_15_0= ruleDouble
                            {

                            							newCompositeNode(grammarAccess.getNumericTypeAccess().getMinInclusiveDoubleParserRuleCall_2_6_1_0());
                            						
                            pushFollow(FOLLOW_44);
                            lv_minInclusive_15_0=ruleDouble();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getNumericTypeRule());
                            							}
                            							set(
                            								current,
                            								"minInclusive",
                            								lv_minInclusive_15_0,
                            								"org.example.dm.xtext.TextualDataModel.Double");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalTextualDataModel.g:1524:4: (otherlv_16= 'minExclusive' ( (lv_minExclusive_17_0= ruleDouble ) ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==37) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalTextualDataModel.g:1525:5: otherlv_16= 'minExclusive' ( (lv_minExclusive_17_0= ruleDouble ) )
                            {
                            otherlv_16=(Token)match(input,37,FOLLOW_43); 

                            					newLeafNode(otherlv_16, grammarAccess.getNumericTypeAccess().getMinExclusiveKeyword_2_7_0());
                            				
                            // InternalTextualDataModel.g:1529:5: ( (lv_minExclusive_17_0= ruleDouble ) )
                            // InternalTextualDataModel.g:1530:6: (lv_minExclusive_17_0= ruleDouble )
                            {
                            // InternalTextualDataModel.g:1530:6: (lv_minExclusive_17_0= ruleDouble )
                            // InternalTextualDataModel.g:1531:7: lv_minExclusive_17_0= ruleDouble
                            {

                            							newCompositeNode(grammarAccess.getNumericTypeAccess().getMinExclusiveDoubleParserRuleCall_2_7_1_0());
                            						
                            pushFollow(FOLLOW_45);
                            lv_minExclusive_17_0=ruleDouble();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getNumericTypeRule());
                            							}
                            							set(
                            								current,
                            								"minExclusive",
                            								lv_minExclusive_17_0,
                            								"org.example.dm.xtext.TextualDataModel.Double");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalTextualDataModel.g:1549:4: (otherlv_18= 'maxInclusive' ( (lv_maxInclusive_19_0= ruleDouble ) ) )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==38) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalTextualDataModel.g:1550:5: otherlv_18= 'maxInclusive' ( (lv_maxInclusive_19_0= ruleDouble ) )
                            {
                            otherlv_18=(Token)match(input,38,FOLLOW_43); 

                            					newLeafNode(otherlv_18, grammarAccess.getNumericTypeAccess().getMaxInclusiveKeyword_2_8_0());
                            				
                            // InternalTextualDataModel.g:1554:5: ( (lv_maxInclusive_19_0= ruleDouble ) )
                            // InternalTextualDataModel.g:1555:6: (lv_maxInclusive_19_0= ruleDouble )
                            {
                            // InternalTextualDataModel.g:1555:6: (lv_maxInclusive_19_0= ruleDouble )
                            // InternalTextualDataModel.g:1556:7: lv_maxInclusive_19_0= ruleDouble
                            {

                            							newCompositeNode(grammarAccess.getNumericTypeAccess().getMaxInclusiveDoubleParserRuleCall_2_8_1_0());
                            						
                            pushFollow(FOLLOW_46);
                            lv_maxInclusive_19_0=ruleDouble();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getNumericTypeRule());
                            							}
                            							set(
                            								current,
                            								"maxInclusive",
                            								lv_maxInclusive_19_0,
                            								"org.example.dm.xtext.TextualDataModel.Double");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalTextualDataModel.g:1574:4: (otherlv_20= 'maxExclusive' ( (lv_maxExclusive_21_0= ruleDouble ) ) )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==39) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalTextualDataModel.g:1575:5: otherlv_20= 'maxExclusive' ( (lv_maxExclusive_21_0= ruleDouble ) )
                            {
                            otherlv_20=(Token)match(input,39,FOLLOW_43); 

                            					newLeafNode(otherlv_20, grammarAccess.getNumericTypeAccess().getMaxExclusiveKeyword_2_9_0());
                            				
                            // InternalTextualDataModel.g:1579:5: ( (lv_maxExclusive_21_0= ruleDouble ) )
                            // InternalTextualDataModel.g:1580:6: (lv_maxExclusive_21_0= ruleDouble )
                            {
                            // InternalTextualDataModel.g:1580:6: (lv_maxExclusive_21_0= ruleDouble )
                            // InternalTextualDataModel.g:1581:7: lv_maxExclusive_21_0= ruleDouble
                            {

                            							newCompositeNode(grammarAccess.getNumericTypeAccess().getMaxExclusiveDoubleParserRuleCall_2_9_1_0());
                            						
                            pushFollow(FOLLOW_47);
                            lv_maxExclusive_21_0=ruleDouble();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getNumericTypeRule());
                            							}
                            							set(
                            								current,
                            								"maxExclusive",
                            								lv_maxExclusive_21_0,
                            								"org.example.dm.xtext.TextualDataModel.Double");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalTextualDataModel.g:1599:4: (otherlv_22= 'measurementUnit' ( (lv_measurementUnit_23_0= ruleText ) ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==40) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalTextualDataModel.g:1600:5: otherlv_22= 'measurementUnit' ( (lv_measurementUnit_23_0= ruleText ) )
                            {
                            otherlv_22=(Token)match(input,40,FOLLOW_3); 

                            					newLeafNode(otherlv_22, grammarAccess.getNumericTypeAccess().getMeasurementUnitKeyword_2_10_0());
                            				
                            // InternalTextualDataModel.g:1604:5: ( (lv_measurementUnit_23_0= ruleText ) )
                            // InternalTextualDataModel.g:1605:6: (lv_measurementUnit_23_0= ruleText )
                            {
                            // InternalTextualDataModel.g:1605:6: (lv_measurementUnit_23_0= ruleText )
                            // InternalTextualDataModel.g:1606:7: lv_measurementUnit_23_0= ruleText
                            {

                            							newCompositeNode(grammarAccess.getNumericTypeAccess().getMeasurementUnitTextParserRuleCall_2_10_1_0());
                            						
                            pushFollow(FOLLOW_37);
                            lv_measurementUnit_23_0=ruleText();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getNumericTypeRule());
                            							}
                            							set(
                            								current,
                            								"measurementUnit",
                            								lv_measurementUnit_23_0,
                            								"org.example.dm.xtext.TextualDataModel.Text");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_24=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_24, grammarAccess.getNumericTypeAccess().getRightCurlyBracketKeyword_2_11());
                    			

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
    // $ANTLR end "ruleNumericType"


    // $ANTLR start "entryRuleDateType"
    // InternalTextualDataModel.g:1633:1: entryRuleDateType returns [EObject current=null] : iv_ruleDateType= ruleDateType EOF ;
    public final EObject entryRuleDateType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateType = null;


        try {
            // InternalTextualDataModel.g:1633:49: (iv_ruleDateType= ruleDateType EOF )
            // InternalTextualDataModel.g:1634:2: iv_ruleDateType= ruleDateType EOF
            {
             newCompositeNode(grammarAccess.getDateTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDateType=ruleDateType();

            state._fsp--;

             current =iv_ruleDateType; 
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
    // $ANTLR end "entryRuleDateType"


    // $ANTLR start "ruleDateType"
    // InternalTextualDataModel.g:1640:1: ruleDateType returns [EObject current=null] : (otherlv_0= 'DateType' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* otherlv_8= '}' )? ) ;
    public final EObject ruleDateType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        EObject lv_localizations_7_0 = null;



        	enterRule();

        try {
            // InternalTextualDataModel.g:1646:2: ( (otherlv_0= 'DateType' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* otherlv_8= '}' )? ) )
            // InternalTextualDataModel.g:1647:2: (otherlv_0= 'DateType' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* otherlv_8= '}' )? )
            {
            // InternalTextualDataModel.g:1647:2: (otherlv_0= 'DateType' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* otherlv_8= '}' )? )
            // InternalTextualDataModel.g:1648:3: otherlv_0= 'DateType' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* otherlv_8= '}' )?
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDateTypeAccess().getDateTypeKeyword_0());
            		
            // InternalTextualDataModel.g:1652:3: ( (lv_name_1_0= ruleElementName ) )
            // InternalTextualDataModel.g:1653:4: (lv_name_1_0= ruleElementName )
            {
            // InternalTextualDataModel.g:1653:4: (lv_name_1_0= ruleElementName )
            // InternalTextualDataModel.g:1654:5: lv_name_1_0= ruleElementName
            {

            					newCompositeNode(grammarAccess.getDateTypeAccess().getNameElementNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleElementName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDateTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.example.dm.xtext.TextualDataModel.ElementName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTextualDataModel.g:1671:3: (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* otherlv_8= '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==12) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalTextualDataModel.g:1672:4: otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* otherlv_8= '}'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_27); 

                    				newLeafNode(otherlv_2, grammarAccess.getDateTypeAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalTextualDataModel.g:1676:4: (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==13) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalTextualDataModel.g:1677:5: otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')'
                            {
                            otherlv_3=(Token)match(input,13,FOLLOW_6); 

                            					newLeafNode(otherlv_3, grammarAccess.getDateTypeAccess().getDescriptionKeyword_2_1_0());
                            				
                            otherlv_4=(Token)match(input,14,FOLLOW_3); 

                            					newLeafNode(otherlv_4, grammarAccess.getDateTypeAccess().getLeftParenthesisKeyword_2_1_1());
                            				
                            // InternalTextualDataModel.g:1685:5: ( (lv_description_5_0= ruleText ) )
                            // InternalTextualDataModel.g:1686:6: (lv_description_5_0= ruleText )
                            {
                            // InternalTextualDataModel.g:1686:6: (lv_description_5_0= ruleText )
                            // InternalTextualDataModel.g:1687:7: lv_description_5_0= ruleText
                            {

                            							newCompositeNode(grammarAccess.getDateTypeAccess().getDescriptionTextParserRuleCall_2_1_2_0());
                            						
                            pushFollow(FOLLOW_7);
                            lv_description_5_0=ruleText();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getDateTypeRule());
                            							}
                            							set(
                            								current,
                            								"description",
                            								lv_description_5_0,
                            								"org.example.dm.xtext.TextualDataModel.Text");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_6=(Token)match(input,15,FOLLOW_28); 

                            					newLeafNode(otherlv_6, grammarAccess.getDateTypeAccess().getRightParenthesisKeyword_2_1_3());
                            				

                            }
                            break;

                    }

                    // InternalTextualDataModel.g:1709:4: ( (lv_localizations_7_0= ruleLocalization ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==44) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalTextualDataModel.g:1710:5: (lv_localizations_7_0= ruleLocalization )
                    	    {
                    	    // InternalTextualDataModel.g:1710:5: (lv_localizations_7_0= ruleLocalization )
                    	    // InternalTextualDataModel.g:1711:6: lv_localizations_7_0= ruleLocalization
                    	    {

                    	    						newCompositeNode(grammarAccess.getDateTypeAccess().getLocalizationsLocalizationParserRuleCall_2_2_0());
                    	    					
                    	    pushFollow(FOLLOW_28);
                    	    lv_localizations_7_0=ruleLocalization();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDateTypeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"localizations",
                    	    							lv_localizations_7_0,
                    	    							"org.example.dm.xtext.TextualDataModel.Localization");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getDateTypeAccess().getRightCurlyBracketKeyword_2_3());
                    			

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
    // $ANTLR end "ruleDateType"


    // $ANTLR start "entryRuleDateTimeType"
    // InternalTextualDataModel.g:1737:1: entryRuleDateTimeType returns [EObject current=null] : iv_ruleDateTimeType= ruleDateTimeType EOF ;
    public final EObject entryRuleDateTimeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateTimeType = null;


        try {
            // InternalTextualDataModel.g:1737:53: (iv_ruleDateTimeType= ruleDateTimeType EOF )
            // InternalTextualDataModel.g:1738:2: iv_ruleDateTimeType= ruleDateTimeType EOF
            {
             newCompositeNode(grammarAccess.getDateTimeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDateTimeType=ruleDateTimeType();

            state._fsp--;

             current =iv_ruleDateTimeType; 
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
    // $ANTLR end "entryRuleDateTimeType"


    // $ANTLR start "ruleDateTimeType"
    // InternalTextualDataModel.g:1744:1: ruleDateTimeType returns [EObject current=null] : (otherlv_0= 'DateTimeType' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* otherlv_8= '}' )? ) ;
    public final EObject ruleDateTimeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        EObject lv_localizations_7_0 = null;



        	enterRule();

        try {
            // InternalTextualDataModel.g:1750:2: ( (otherlv_0= 'DateTimeType' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* otherlv_8= '}' )? ) )
            // InternalTextualDataModel.g:1751:2: (otherlv_0= 'DateTimeType' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* otherlv_8= '}' )? )
            {
            // InternalTextualDataModel.g:1751:2: (otherlv_0= 'DateTimeType' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* otherlv_8= '}' )? )
            // InternalTextualDataModel.g:1752:3: otherlv_0= 'DateTimeType' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* otherlv_8= '}' )?
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDateTimeTypeAccess().getDateTimeTypeKeyword_0());
            		
            // InternalTextualDataModel.g:1756:3: ( (lv_name_1_0= ruleElementName ) )
            // InternalTextualDataModel.g:1757:4: (lv_name_1_0= ruleElementName )
            {
            // InternalTextualDataModel.g:1757:4: (lv_name_1_0= ruleElementName )
            // InternalTextualDataModel.g:1758:5: lv_name_1_0= ruleElementName
            {

            					newCompositeNode(grammarAccess.getDateTimeTypeAccess().getNameElementNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleElementName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDateTimeTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.example.dm.xtext.TextualDataModel.ElementName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTextualDataModel.g:1775:3: (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* otherlv_8= '}' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==12) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalTextualDataModel.g:1776:4: otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* otherlv_8= '}'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_27); 

                    				newLeafNode(otherlv_2, grammarAccess.getDateTimeTypeAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalTextualDataModel.g:1780:4: (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==13) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalTextualDataModel.g:1781:5: otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')'
                            {
                            otherlv_3=(Token)match(input,13,FOLLOW_6); 

                            					newLeafNode(otherlv_3, grammarAccess.getDateTimeTypeAccess().getDescriptionKeyword_2_1_0());
                            				
                            otherlv_4=(Token)match(input,14,FOLLOW_3); 

                            					newLeafNode(otherlv_4, grammarAccess.getDateTimeTypeAccess().getLeftParenthesisKeyword_2_1_1());
                            				
                            // InternalTextualDataModel.g:1789:5: ( (lv_description_5_0= ruleText ) )
                            // InternalTextualDataModel.g:1790:6: (lv_description_5_0= ruleText )
                            {
                            // InternalTextualDataModel.g:1790:6: (lv_description_5_0= ruleText )
                            // InternalTextualDataModel.g:1791:7: lv_description_5_0= ruleText
                            {

                            							newCompositeNode(grammarAccess.getDateTimeTypeAccess().getDescriptionTextParserRuleCall_2_1_2_0());
                            						
                            pushFollow(FOLLOW_7);
                            lv_description_5_0=ruleText();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getDateTimeTypeRule());
                            							}
                            							set(
                            								current,
                            								"description",
                            								lv_description_5_0,
                            								"org.example.dm.xtext.TextualDataModel.Text");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_6=(Token)match(input,15,FOLLOW_28); 

                            					newLeafNode(otherlv_6, grammarAccess.getDateTimeTypeAccess().getRightParenthesisKeyword_2_1_3());
                            				

                            }
                            break;

                    }

                    // InternalTextualDataModel.g:1813:4: ( (lv_localizations_7_0= ruleLocalization ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==44) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalTextualDataModel.g:1814:5: (lv_localizations_7_0= ruleLocalization )
                    	    {
                    	    // InternalTextualDataModel.g:1814:5: (lv_localizations_7_0= ruleLocalization )
                    	    // InternalTextualDataModel.g:1815:6: lv_localizations_7_0= ruleLocalization
                    	    {

                    	    						newCompositeNode(grammarAccess.getDateTimeTypeAccess().getLocalizationsLocalizationParserRuleCall_2_2_0());
                    	    					
                    	    pushFollow(FOLLOW_28);
                    	    lv_localizations_7_0=ruleLocalization();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDateTimeTypeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"localizations",
                    	    							lv_localizations_7_0,
                    	    							"org.example.dm.xtext.TextualDataModel.Localization");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getDateTimeTypeAccess().getRightCurlyBracketKeyword_2_3());
                    			

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
    // $ANTLR end "ruleDateTimeType"


    // $ANTLR start "entryRuleUuidType"
    // InternalTextualDataModel.g:1841:1: entryRuleUuidType returns [EObject current=null] : iv_ruleUuidType= ruleUuidType EOF ;
    public final EObject entryRuleUuidType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUuidType = null;


        try {
            // InternalTextualDataModel.g:1841:49: (iv_ruleUuidType= ruleUuidType EOF )
            // InternalTextualDataModel.g:1842:2: iv_ruleUuidType= ruleUuidType EOF
            {
             newCompositeNode(grammarAccess.getUuidTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUuidType=ruleUuidType();

            state._fsp--;

             current =iv_ruleUuidType; 
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
    // $ANTLR end "entryRuleUuidType"


    // $ANTLR start "ruleUuidType"
    // InternalTextualDataModel.g:1848:1: ruleUuidType returns [EObject current=null] : (otherlv_0= 'UuidType' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* otherlv_8= '}' )? ) ;
    public final EObject ruleUuidType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        EObject lv_localizations_7_0 = null;



        	enterRule();

        try {
            // InternalTextualDataModel.g:1854:2: ( (otherlv_0= 'UuidType' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* otherlv_8= '}' )? ) )
            // InternalTextualDataModel.g:1855:2: (otherlv_0= 'UuidType' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* otherlv_8= '}' )? )
            {
            // InternalTextualDataModel.g:1855:2: (otherlv_0= 'UuidType' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* otherlv_8= '}' )? )
            // InternalTextualDataModel.g:1856:3: otherlv_0= 'UuidType' ( (lv_name_1_0= ruleElementName ) ) (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* otherlv_8= '}' )?
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUuidTypeAccess().getUuidTypeKeyword_0());
            		
            // InternalTextualDataModel.g:1860:3: ( (lv_name_1_0= ruleElementName ) )
            // InternalTextualDataModel.g:1861:4: (lv_name_1_0= ruleElementName )
            {
            // InternalTextualDataModel.g:1861:4: (lv_name_1_0= ruleElementName )
            // InternalTextualDataModel.g:1862:5: lv_name_1_0= ruleElementName
            {

            					newCompositeNode(grammarAccess.getUuidTypeAccess().getNameElementNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleElementName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUuidTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.example.dm.xtext.TextualDataModel.ElementName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTextualDataModel.g:1879:3: (otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* otherlv_8= '}' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==12) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalTextualDataModel.g:1880:4: otherlv_2= '{' (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )? ( (lv_localizations_7_0= ruleLocalization ) )* otherlv_8= '}'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_27); 

                    				newLeafNode(otherlv_2, grammarAccess.getUuidTypeAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalTextualDataModel.g:1884:4: (otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')' )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==13) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalTextualDataModel.g:1885:5: otherlv_3= '@description' otherlv_4= '(' ( (lv_description_5_0= ruleText ) ) otherlv_6= ')'
                            {
                            otherlv_3=(Token)match(input,13,FOLLOW_6); 

                            					newLeafNode(otherlv_3, grammarAccess.getUuidTypeAccess().getDescriptionKeyword_2_1_0());
                            				
                            otherlv_4=(Token)match(input,14,FOLLOW_3); 

                            					newLeafNode(otherlv_4, grammarAccess.getUuidTypeAccess().getLeftParenthesisKeyword_2_1_1());
                            				
                            // InternalTextualDataModel.g:1893:5: ( (lv_description_5_0= ruleText ) )
                            // InternalTextualDataModel.g:1894:6: (lv_description_5_0= ruleText )
                            {
                            // InternalTextualDataModel.g:1894:6: (lv_description_5_0= ruleText )
                            // InternalTextualDataModel.g:1895:7: lv_description_5_0= ruleText
                            {

                            							newCompositeNode(grammarAccess.getUuidTypeAccess().getDescriptionTextParserRuleCall_2_1_2_0());
                            						
                            pushFollow(FOLLOW_7);
                            lv_description_5_0=ruleText();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getUuidTypeRule());
                            							}
                            							set(
                            								current,
                            								"description",
                            								lv_description_5_0,
                            								"org.example.dm.xtext.TextualDataModel.Text");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_6=(Token)match(input,15,FOLLOW_28); 

                            					newLeafNode(otherlv_6, grammarAccess.getUuidTypeAccess().getRightParenthesisKeyword_2_1_3());
                            				

                            }
                            break;

                    }

                    // InternalTextualDataModel.g:1917:4: ( (lv_localizations_7_0= ruleLocalization ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==44) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalTextualDataModel.g:1918:5: (lv_localizations_7_0= ruleLocalization )
                    	    {
                    	    // InternalTextualDataModel.g:1918:5: (lv_localizations_7_0= ruleLocalization )
                    	    // InternalTextualDataModel.g:1919:6: lv_localizations_7_0= ruleLocalization
                    	    {

                    	    						newCompositeNode(grammarAccess.getUuidTypeAccess().getLocalizationsLocalizationParserRuleCall_2_2_0());
                    	    					
                    	    pushFollow(FOLLOW_28);
                    	    lv_localizations_7_0=ruleLocalization();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getUuidTypeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"localizations",
                    	    							lv_localizations_7_0,
                    	    							"org.example.dm.xtext.TextualDataModel.Localization");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getUuidTypeAccess().getRightCurlyBracketKeyword_2_3());
                    			

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
    // $ANTLR end "ruleUuidType"


    // $ANTLR start "entryRuleLocalization"
    // InternalTextualDataModel.g:1945:1: entryRuleLocalization returns [EObject current=null] : iv_ruleLocalization= ruleLocalization EOF ;
    public final EObject entryRuleLocalization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalization = null;


        try {
            // InternalTextualDataModel.g:1945:53: (iv_ruleLocalization= ruleLocalization EOF )
            // InternalTextualDataModel.g:1946:2: iv_ruleLocalization= ruleLocalization EOF
            {
             newCompositeNode(grammarAccess.getLocalizationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocalization=ruleLocalization();

            state._fsp--;

             current =iv_ruleLocalization; 
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
    // $ANTLR end "entryRuleLocalization"


    // $ANTLR start "ruleLocalization"
    // InternalTextualDataModel.g:1952:1: ruleLocalization returns [EObject current=null] : (otherlv_0= '@localization' ( (lv_locale_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_name_3_0= ruleText ) ) ( (lv_description_4_0= ruleText ) )? )? otherlv_5= ')' ) ;
    public final EObject ruleLocalization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_locale_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalTextualDataModel.g:1958:2: ( (otherlv_0= '@localization' ( (lv_locale_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_name_3_0= ruleText ) ) ( (lv_description_4_0= ruleText ) )? )? otherlv_5= ')' ) )
            // InternalTextualDataModel.g:1959:2: (otherlv_0= '@localization' ( (lv_locale_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_name_3_0= ruleText ) ) ( (lv_description_4_0= ruleText ) )? )? otherlv_5= ')' )
            {
            // InternalTextualDataModel.g:1959:2: (otherlv_0= '@localization' ( (lv_locale_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_name_3_0= ruleText ) ) ( (lv_description_4_0= ruleText ) )? )? otherlv_5= ')' )
            // InternalTextualDataModel.g:1960:3: otherlv_0= '@localization' ( (lv_locale_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_name_3_0= ruleText ) ) ( (lv_description_4_0= ruleText ) )? )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_48); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalizationAccess().getLocalizationKeyword_0());
            		
            // InternalTextualDataModel.g:1964:3: ( (lv_locale_1_0= RULE_ID ) )
            // InternalTextualDataModel.g:1965:4: (lv_locale_1_0= RULE_ID )
            {
            // InternalTextualDataModel.g:1965:4: (lv_locale_1_0= RULE_ID )
            // InternalTextualDataModel.g:1966:5: lv_locale_1_0= RULE_ID
            {
            lv_locale_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_locale_1_0, grammarAccess.getLocalizationAccess().getLocaleIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocalizationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"locale",
            						lv_locale_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_49); 

            			newLeafNode(otherlv_2, grammarAccess.getLocalizationAccess().getLeftParenthesisKeyword_2());
            		
            // InternalTextualDataModel.g:1986:3: ( ( (lv_name_3_0= ruleText ) ) ( (lv_description_4_0= ruleText ) )? )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_STRING) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalTextualDataModel.g:1987:4: ( (lv_name_3_0= ruleText ) ) ( (lv_description_4_0= ruleText ) )?
                    {
                    // InternalTextualDataModel.g:1987:4: ( (lv_name_3_0= ruleText ) )
                    // InternalTextualDataModel.g:1988:5: (lv_name_3_0= ruleText )
                    {
                    // InternalTextualDataModel.g:1988:5: (lv_name_3_0= ruleText )
                    // InternalTextualDataModel.g:1989:6: lv_name_3_0= ruleText
                    {

                    						newCompositeNode(grammarAccess.getLocalizationAccess().getNameTextParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_name_3_0=ruleText();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocalizationRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"org.example.dm.xtext.TextualDataModel.Text");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTextualDataModel.g:2006:4: ( (lv_description_4_0= ruleText ) )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==RULE_STRING) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalTextualDataModel.g:2007:5: (lv_description_4_0= ruleText )
                            {
                            // InternalTextualDataModel.g:2007:5: (lv_description_4_0= ruleText )
                            // InternalTextualDataModel.g:2008:6: lv_description_4_0= ruleText
                            {

                            						newCompositeNode(grammarAccess.getLocalizationAccess().getDescriptionTextParserRuleCall_3_1_0());
                            					
                            pushFollow(FOLLOW_7);
                            lv_description_4_0=ruleText();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getLocalizationRule());
                            						}
                            						set(
                            							current,
                            							"description",
                            							lv_description_4_0,
                            							"org.example.dm.xtext.TextualDataModel.Text");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLocalizationAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleLocalization"


    // $ANTLR start "entryRuleElementName"
    // InternalTextualDataModel.g:2034:1: entryRuleElementName returns [String current=null] : iv_ruleElementName= ruleElementName EOF ;
    public final String entryRuleElementName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleElementName = null;


        try {
            // InternalTextualDataModel.g:2034:51: (iv_ruleElementName= ruleElementName EOF )
            // InternalTextualDataModel.g:2035:2: iv_ruleElementName= ruleElementName EOF
            {
             newCompositeNode(grammarAccess.getElementNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementName=ruleElementName();

            state._fsp--;

             current =iv_ruleElementName.getText(); 
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
    // $ANTLR end "entryRuleElementName"


    // $ANTLR start "ruleElementName"
    // InternalTextualDataModel.g:2041:1: ruleElementName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleElementName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalTextualDataModel.g:2047:2: (this_STRING_0= RULE_STRING )
            // InternalTextualDataModel.g:2048:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getElementNameAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleElementName"


    // $ANTLR start "entryRuleText"
    // InternalTextualDataModel.g:2058:1: entryRuleText returns [String current=null] : iv_ruleText= ruleText EOF ;
    public final String entryRuleText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleText = null;


        try {
            // InternalTextualDataModel.g:2058:44: (iv_ruleText= ruleText EOF )
            // InternalTextualDataModel.g:2059:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText.getText(); 
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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalTextualDataModel.g:2065:1: ruleText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalTextualDataModel.g:2071:2: (this_STRING_0= RULE_STRING )
            // InternalTextualDataModel.g:2072:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getTextAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleUnlimitedNatural"
    // InternalTextualDataModel.g:2082:1: entryRuleUnlimitedNatural returns [String current=null] : iv_ruleUnlimitedNatural= ruleUnlimitedNatural EOF ;
    public final String entryRuleUnlimitedNatural() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnlimitedNatural = null;


        try {
            // InternalTextualDataModel.g:2082:56: (iv_ruleUnlimitedNatural= ruleUnlimitedNatural EOF )
            // InternalTextualDataModel.g:2083:2: iv_ruleUnlimitedNatural= ruleUnlimitedNatural EOF
            {
             newCompositeNode(grammarAccess.getUnlimitedNaturalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnlimitedNatural=ruleUnlimitedNatural();

            state._fsp--;

             current =iv_ruleUnlimitedNatural.getText(); 
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
    // $ANTLR end "entryRuleUnlimitedNatural"


    // $ANTLR start "ruleUnlimitedNatural"
    // InternalTextualDataModel.g:2089:1: ruleUnlimitedNatural returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleUnlimitedNatural() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalTextualDataModel.g:2095:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalTextualDataModel.g:2096:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalTextualDataModel.g:2096:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_INT) ) {
                alt64=1;
            }
            else if ( (LA64_0==45) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalTextualDataModel.g:2097:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getUnlimitedNaturalAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTextualDataModel.g:2105:3: kw= '*'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnlimitedNaturalAccess().getAsteriskKeyword_1());
                    		

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
    // $ANTLR end "ruleUnlimitedNatural"


    // $ANTLR start "entryRulePositiveShort"
    // InternalTextualDataModel.g:2114:1: entryRulePositiveShort returns [String current=null] : iv_rulePositiveShort= rulePositiveShort EOF ;
    public final String entryRulePositiveShort() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePositiveShort = null;


        try {
            // InternalTextualDataModel.g:2114:53: (iv_rulePositiveShort= rulePositiveShort EOF )
            // InternalTextualDataModel.g:2115:2: iv_rulePositiveShort= rulePositiveShort EOF
            {
             newCompositeNode(grammarAccess.getPositiveShortRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePositiveShort=rulePositiveShort();

            state._fsp--;

             current =iv_rulePositiveShort.getText(); 
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
    // $ANTLR end "entryRulePositiveShort"


    // $ANTLR start "rulePositiveShort"
    // InternalTextualDataModel.g:2121:1: rulePositiveShort returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken rulePositiveShort() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalTextualDataModel.g:2127:2: (this_INT_0= RULE_INT )
            // InternalTextualDataModel.g:2128:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getPositiveShortAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "rulePositiveShort"


    // $ANTLR start "entryRuleDouble"
    // InternalTextualDataModel.g:2138:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // InternalTextualDataModel.g:2138:46: (iv_ruleDouble= ruleDouble EOF )
            // InternalTextualDataModel.g:2139:2: iv_ruleDouble= ruleDouble EOF
            {
             newCompositeNode(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDouble=ruleDouble();

            state._fsp--;

             current =iv_ruleDouble.getText(); 
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
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // InternalTextualDataModel.g:2145:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalTextualDataModel.g:2151:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalTextualDataModel.g:2152:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalTextualDataModel.g:2152:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalTextualDataModel.g:2153:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalTextualDataModel.g:2153:3: (kw= '-' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==46) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalTextualDataModel.g:2154:4: kw= '-'
                    {
                    kw=(Token)match(input,46,FOLLOW_50); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalTextualDataModel.g:2160:3: (this_INT_1= RULE_INT )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_INT) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalTextualDataModel.g:2161:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_51); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,47,FOLLOW_22); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_52); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalTextualDataModel.g:2181:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=48 && LA69_0<=49)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalTextualDataModel.g:2182:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalTextualDataModel.g:2182:4: (kw= 'E' | kw= 'e' )
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==48) ) {
                        alt67=1;
                    }
                    else if ( (LA67_0==49) ) {
                        alt67=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 0, input);

                        throw nvae;
                    }
                    switch (alt67) {
                        case 1 :
                            // InternalTextualDataModel.g:2183:5: kw= 'E'
                            {
                            kw=(Token)match(input,48,FOLLOW_53); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalTextualDataModel.g:2189:5: kw= 'e'
                            {
                            kw=(Token)match(input,49,FOLLOW_53); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalTextualDataModel.g:2195:4: (kw= '-' )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==46) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // InternalTextualDataModel.g:2196:5: kw= '-'
                            {
                            kw=(Token)match(input,46,FOLLOW_22); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

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
    // $ANTLR end "ruleDouble"


    // $ANTLR start "ruleEntityKind"
    // InternalTextualDataModel.g:2214:1: ruleEntityKind returns [Enumerator current=null] : ( (enumLiteral_0= 'MASTER_DATA' ) | (enumLiteral_1= 'REFERENCE_DATA' ) | (enumLiteral_2= 'ABSTRACT_ENTITY' ) | (enumLiteral_3= 'ATTRIBUTE_SET' ) ) ;
    public final Enumerator ruleEntityKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalTextualDataModel.g:2220:2: ( ( (enumLiteral_0= 'MASTER_DATA' ) | (enumLiteral_1= 'REFERENCE_DATA' ) | (enumLiteral_2= 'ABSTRACT_ENTITY' ) | (enumLiteral_3= 'ATTRIBUTE_SET' ) ) )
            // InternalTextualDataModel.g:2221:2: ( (enumLiteral_0= 'MASTER_DATA' ) | (enumLiteral_1= 'REFERENCE_DATA' ) | (enumLiteral_2= 'ABSTRACT_ENTITY' ) | (enumLiteral_3= 'ATTRIBUTE_SET' ) )
            {
            // InternalTextualDataModel.g:2221:2: ( (enumLiteral_0= 'MASTER_DATA' ) | (enumLiteral_1= 'REFERENCE_DATA' ) | (enumLiteral_2= 'ABSTRACT_ENTITY' ) | (enumLiteral_3= 'ATTRIBUTE_SET' ) )
            int alt70=4;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt70=1;
                }
                break;
            case 51:
                {
                alt70=2;
                }
                break;
            case 52:
                {
                alt70=3;
                }
                break;
            case 53:
                {
                alt70=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // InternalTextualDataModel.g:2222:3: (enumLiteral_0= 'MASTER_DATA' )
                    {
                    // InternalTextualDataModel.g:2222:3: (enumLiteral_0= 'MASTER_DATA' )
                    // InternalTextualDataModel.g:2223:4: enumLiteral_0= 'MASTER_DATA'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getEntityKindAccess().getMASTER_DATAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEntityKindAccess().getMASTER_DATAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTextualDataModel.g:2230:3: (enumLiteral_1= 'REFERENCE_DATA' )
                    {
                    // InternalTextualDataModel.g:2230:3: (enumLiteral_1= 'REFERENCE_DATA' )
                    // InternalTextualDataModel.g:2231:4: enumLiteral_1= 'REFERENCE_DATA'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getEntityKindAccess().getREFERENCE_DATAEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEntityKindAccess().getREFERENCE_DATAEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTextualDataModel.g:2238:3: (enumLiteral_2= 'ABSTRACT_ENTITY' )
                    {
                    // InternalTextualDataModel.g:2238:3: (enumLiteral_2= 'ABSTRACT_ENTITY' )
                    // InternalTextualDataModel.g:2239:4: enumLiteral_2= 'ABSTRACT_ENTITY'
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getEntityKindAccess().getABSTRACT_ENTITYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEntityKindAccess().getABSTRACT_ENTITYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTextualDataModel.g:2246:3: (enumLiteral_3= 'ATTRIBUTE_SET' )
                    {
                    // InternalTextualDataModel.g:2246:3: (enumLiteral_3= 'ATTRIBUTE_SET' )
                    // InternalTextualDataModel.g:2247:4: enumLiteral_3= 'ATTRIBUTE_SET'
                    {
                    enumLiteral_3=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getEntityKindAccess().getATTRIBUTE_SETEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEntityKindAccess().getATTRIBUTE_SETEnumLiteralDeclaration_3());
                    			

                    }


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
    // $ANTLR end "ruleEntityKind"


    // $ANTLR start "ruleRelationshipKind"
    // InternalTextualDataModel.g:2257:1: ruleRelationshipKind returns [Enumerator current=null] : ( (enumLiteral_0= 'ASSOCIATION' ) | (enumLiteral_1= 'COMPOSITION' ) | (enumLiteral_2= 'AGGREGATION' ) ) ;
    public final Enumerator ruleRelationshipKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalTextualDataModel.g:2263:2: ( ( (enumLiteral_0= 'ASSOCIATION' ) | (enumLiteral_1= 'COMPOSITION' ) | (enumLiteral_2= 'AGGREGATION' ) ) )
            // InternalTextualDataModel.g:2264:2: ( (enumLiteral_0= 'ASSOCIATION' ) | (enumLiteral_1= 'COMPOSITION' ) | (enumLiteral_2= 'AGGREGATION' ) )
            {
            // InternalTextualDataModel.g:2264:2: ( (enumLiteral_0= 'ASSOCIATION' ) | (enumLiteral_1= 'COMPOSITION' ) | (enumLiteral_2= 'AGGREGATION' ) )
            int alt71=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt71=1;
                }
                break;
            case 55:
                {
                alt71=2;
                }
                break;
            case 56:
                {
                alt71=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // InternalTextualDataModel.g:2265:3: (enumLiteral_0= 'ASSOCIATION' )
                    {
                    // InternalTextualDataModel.g:2265:3: (enumLiteral_0= 'ASSOCIATION' )
                    // InternalTextualDataModel.g:2266:4: enumLiteral_0= 'ASSOCIATION'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getRelationshipKindAccess().getASSOCIATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRelationshipKindAccess().getASSOCIATIONEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTextualDataModel.g:2273:3: (enumLiteral_1= 'COMPOSITION' )
                    {
                    // InternalTextualDataModel.g:2273:3: (enumLiteral_1= 'COMPOSITION' )
                    // InternalTextualDataModel.g:2274:4: enumLiteral_1= 'COMPOSITION'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getRelationshipKindAccess().getCOMPOSITIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRelationshipKindAccess().getCOMPOSITIONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTextualDataModel.g:2281:3: (enumLiteral_2= 'AGGREGATION' )
                    {
                    // InternalTextualDataModel.g:2281:3: (enumLiteral_2= 'AGGREGATION' )
                    // InternalTextualDataModel.g:2282:4: enumLiteral_2= 'AGGREGATION'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getRelationshipKindAccess().getAGGREGATIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRelationshipKindAccess().getAGGREGATIONEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleRelationshipKind"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00001E010E072000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00001E010E070000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00001E010E060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000E010E060000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000E010E020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000E010C020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000281002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x003C000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000201002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001042L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000100000022040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000100000020040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001801002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000001001002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000100000022000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000100000020000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000081042L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000081002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x01C0000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00001000F0022000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00001000F0020000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000000E0020000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000000C0020000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000011FE00022000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000011FE00020000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000001FC00020000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x000001F800020000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x000001F000020000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000C00000000020L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x000001E000020000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x000001C000020000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000018000020000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000010000020000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000800000000020L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000400000000020L});

}