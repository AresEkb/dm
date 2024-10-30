package org.example.dm.xtext.ide.contentassist.antlr.internal;

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
import org.example.dm.xtext.services.TextualDataModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTextualDataModelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'E'", "'e'", "'MASTER_DATA'", "'REFERENCE_DATA'", "'ABSTRACT_ENTITY'", "'ATTRIBUTE_SET'", "'ASSOCIATION'", "'COMPOSITION'", "'AGGREGATION'", "'DataModel'", "'{'", "'}'", "'@description'", "'('", "')'", "'@locales'", "'Entity'", "'['", "']'", "'::'", "'..'", "'defaultValue'", "'Relationship'", "'BooleanType'", "'StringType'", "'length'", "'minLength'", "'maxLength'", "'pattern'", "'NumericType'", "'size'", "'totalDigits'", "'fractionDigits'", "'minInclusive'", "'minExclusive'", "'maxInclusive'", "'maxExclusive'", "'measurementUnit'", "'DateType'", "'DateTimeType'", "'UuidType'", "'@localization'", "'-'", "'.'", "'[id]'"
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
    public static final int RULE_ID=6;
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
    public static final int RULE_STRING=4;
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

    	public void setGrammarAccess(TextualDataModelGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDataModel"
    // InternalTextualDataModel.g:53:1: entryRuleDataModel : ruleDataModel EOF ;
    public final void entryRuleDataModel() throws RecognitionException {
        try {
            // InternalTextualDataModel.g:54:1: ( ruleDataModel EOF )
            // InternalTextualDataModel.g:55:1: ruleDataModel EOF
            {
             before(grammarAccess.getDataModelRule()); 
            pushFollow(FOLLOW_1);
            ruleDataModel();

            state._fsp--;

             after(grammarAccess.getDataModelRule()); 
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
    // $ANTLR end "entryRuleDataModel"


    // $ANTLR start "ruleDataModel"
    // InternalTextualDataModel.g:62:1: ruleDataModel : ( ( rule__DataModel__Group__0 ) ) ;
    public final void ruleDataModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:66:2: ( ( ( rule__DataModel__Group__0 ) ) )
            // InternalTextualDataModel.g:67:2: ( ( rule__DataModel__Group__0 ) )
            {
            // InternalTextualDataModel.g:67:2: ( ( rule__DataModel__Group__0 ) )
            // InternalTextualDataModel.g:68:3: ( rule__DataModel__Group__0 )
            {
             before(grammarAccess.getDataModelAccess().getGroup()); 
            // InternalTextualDataModel.g:69:3: ( rule__DataModel__Group__0 )
            // InternalTextualDataModel.g:69:4: rule__DataModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getGroup()); 

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
    // $ANTLR end "ruleDataModel"


    // $ANTLR start "entryRuleEntity"
    // InternalTextualDataModel.g:78:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalTextualDataModel.g:79:1: ( ruleEntity EOF )
            // InternalTextualDataModel.g:80:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalTextualDataModel.g:87:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:91:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalTextualDataModel.g:92:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalTextualDataModel.g:92:2: ( ( rule__Entity__Group__0 ) )
            // InternalTextualDataModel.g:93:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalTextualDataModel.g:94:3: ( rule__Entity__Group__0 )
            // InternalTextualDataModel.g:94:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // InternalTextualDataModel.g:103:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalTextualDataModel.g:104:1: ( ruleAttribute EOF )
            // InternalTextualDataModel.g:105:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalTextualDataModel.g:112:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:116:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalTextualDataModel.g:117:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalTextualDataModel.g:117:2: ( ( rule__Attribute__Group__0 ) )
            // InternalTextualDataModel.g:118:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalTextualDataModel.g:119:3: ( rule__Attribute__Group__0 )
            // InternalTextualDataModel.g:119:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRelationship"
    // InternalTextualDataModel.g:128:1: entryRuleRelationship : ruleRelationship EOF ;
    public final void entryRuleRelationship() throws RecognitionException {
        try {
            // InternalTextualDataModel.g:129:1: ( ruleRelationship EOF )
            // InternalTextualDataModel.g:130:1: ruleRelationship EOF
            {
             before(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationship();

            state._fsp--;

             after(grammarAccess.getRelationshipRule()); 
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
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // InternalTextualDataModel.g:137:1: ruleRelationship : ( ( rule__Relationship__Group__0 ) ) ;
    public final void ruleRelationship() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:141:2: ( ( ( rule__Relationship__Group__0 ) ) )
            // InternalTextualDataModel.g:142:2: ( ( rule__Relationship__Group__0 ) )
            {
            // InternalTextualDataModel.g:142:2: ( ( rule__Relationship__Group__0 ) )
            // InternalTextualDataModel.g:143:3: ( rule__Relationship__Group__0 )
            {
             before(grammarAccess.getRelationshipAccess().getGroup()); 
            // InternalTextualDataModel.g:144:3: ( rule__Relationship__Group__0 )
            // InternalTextualDataModel.g:144:4: rule__Relationship__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getGroup()); 

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
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleRelationshipEnd"
    // InternalTextualDataModel.g:153:1: entryRuleRelationshipEnd : ruleRelationshipEnd EOF ;
    public final void entryRuleRelationshipEnd() throws RecognitionException {
        try {
            // InternalTextualDataModel.g:154:1: ( ruleRelationshipEnd EOF )
            // InternalTextualDataModel.g:155:1: ruleRelationshipEnd EOF
            {
             before(grammarAccess.getRelationshipEndRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationshipEnd();

            state._fsp--;

             after(grammarAccess.getRelationshipEndRule()); 
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
    // $ANTLR end "entryRuleRelationshipEnd"


    // $ANTLR start "ruleRelationshipEnd"
    // InternalTextualDataModel.g:162:1: ruleRelationshipEnd : ( ( rule__RelationshipEnd__Group__0 ) ) ;
    public final void ruleRelationshipEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:166:2: ( ( ( rule__RelationshipEnd__Group__0 ) ) )
            // InternalTextualDataModel.g:167:2: ( ( rule__RelationshipEnd__Group__0 ) )
            {
            // InternalTextualDataModel.g:167:2: ( ( rule__RelationshipEnd__Group__0 ) )
            // InternalTextualDataModel.g:168:3: ( rule__RelationshipEnd__Group__0 )
            {
             before(grammarAccess.getRelationshipEndAccess().getGroup()); 
            // InternalTextualDataModel.g:169:3: ( rule__RelationshipEnd__Group__0 )
            // InternalTextualDataModel.g:169:4: rule__RelationshipEnd__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelationshipEnd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipEndAccess().getGroup()); 

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
    // $ANTLR end "ruleRelationshipEnd"


    // $ANTLR start "entryRuleDataType"
    // InternalTextualDataModel.g:178:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalTextualDataModel.g:179:1: ( ruleDataType EOF )
            // InternalTextualDataModel.g:180:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalTextualDataModel.g:187:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:191:2: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalTextualDataModel.g:192:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalTextualDataModel.g:192:2: ( ( rule__DataType__Alternatives ) )
            // InternalTextualDataModel.g:193:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalTextualDataModel.g:194:3: ( rule__DataType__Alternatives )
            // InternalTextualDataModel.g:194:4: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleBooleanType"
    // InternalTextualDataModel.g:203:1: entryRuleBooleanType : ruleBooleanType EOF ;
    public final void entryRuleBooleanType() throws RecognitionException {
        try {
            // InternalTextualDataModel.g:204:1: ( ruleBooleanType EOF )
            // InternalTextualDataModel.g:205:1: ruleBooleanType EOF
            {
             before(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanType();

            state._fsp--;

             after(grammarAccess.getBooleanTypeRule()); 
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
    // $ANTLR end "entryRuleBooleanType"


    // $ANTLR start "ruleBooleanType"
    // InternalTextualDataModel.g:212:1: ruleBooleanType : ( ( rule__BooleanType__Group__0 ) ) ;
    public final void ruleBooleanType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:216:2: ( ( ( rule__BooleanType__Group__0 ) ) )
            // InternalTextualDataModel.g:217:2: ( ( rule__BooleanType__Group__0 ) )
            {
            // InternalTextualDataModel.g:217:2: ( ( rule__BooleanType__Group__0 ) )
            // InternalTextualDataModel.g:218:3: ( rule__BooleanType__Group__0 )
            {
             before(grammarAccess.getBooleanTypeAccess().getGroup()); 
            // InternalTextualDataModel.g:219:3: ( rule__BooleanType__Group__0 )
            // InternalTextualDataModel.g:219:4: rule__BooleanType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleBooleanType"


    // $ANTLR start "entryRuleStringType"
    // InternalTextualDataModel.g:228:1: entryRuleStringType : ruleStringType EOF ;
    public final void entryRuleStringType() throws RecognitionException {
        try {
            // InternalTextualDataModel.g:229:1: ( ruleStringType EOF )
            // InternalTextualDataModel.g:230:1: ruleStringType EOF
            {
             before(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleStringType();

            state._fsp--;

             after(grammarAccess.getStringTypeRule()); 
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
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // InternalTextualDataModel.g:237:1: ruleStringType : ( ( rule__StringType__Group__0 ) ) ;
    public final void ruleStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:241:2: ( ( ( rule__StringType__Group__0 ) ) )
            // InternalTextualDataModel.g:242:2: ( ( rule__StringType__Group__0 ) )
            {
            // InternalTextualDataModel.g:242:2: ( ( rule__StringType__Group__0 ) )
            // InternalTextualDataModel.g:243:3: ( rule__StringType__Group__0 )
            {
             before(grammarAccess.getStringTypeAccess().getGroup()); 
            // InternalTextualDataModel.g:244:3: ( rule__StringType__Group__0 )
            // InternalTextualDataModel.g:244:4: rule__StringType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleNumericType"
    // InternalTextualDataModel.g:253:1: entryRuleNumericType : ruleNumericType EOF ;
    public final void entryRuleNumericType() throws RecognitionException {
        try {
            // InternalTextualDataModel.g:254:1: ( ruleNumericType EOF )
            // InternalTextualDataModel.g:255:1: ruleNumericType EOF
            {
             before(grammarAccess.getNumericTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleNumericType();

            state._fsp--;

             after(grammarAccess.getNumericTypeRule()); 
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
    // $ANTLR end "entryRuleNumericType"


    // $ANTLR start "ruleNumericType"
    // InternalTextualDataModel.g:262:1: ruleNumericType : ( ( rule__NumericType__Group__0 ) ) ;
    public final void ruleNumericType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:266:2: ( ( ( rule__NumericType__Group__0 ) ) )
            // InternalTextualDataModel.g:267:2: ( ( rule__NumericType__Group__0 ) )
            {
            // InternalTextualDataModel.g:267:2: ( ( rule__NumericType__Group__0 ) )
            // InternalTextualDataModel.g:268:3: ( rule__NumericType__Group__0 )
            {
             before(grammarAccess.getNumericTypeAccess().getGroup()); 
            // InternalTextualDataModel.g:269:3: ( rule__NumericType__Group__0 )
            // InternalTextualDataModel.g:269:4: rule__NumericType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleNumericType"


    // $ANTLR start "entryRuleDateType"
    // InternalTextualDataModel.g:278:1: entryRuleDateType : ruleDateType EOF ;
    public final void entryRuleDateType() throws RecognitionException {
        try {
            // InternalTextualDataModel.g:279:1: ( ruleDateType EOF )
            // InternalTextualDataModel.g:280:1: ruleDateType EOF
            {
             before(grammarAccess.getDateTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDateType();

            state._fsp--;

             after(grammarAccess.getDateTypeRule()); 
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
    // $ANTLR end "entryRuleDateType"


    // $ANTLR start "ruleDateType"
    // InternalTextualDataModel.g:287:1: ruleDateType : ( ( rule__DateType__Group__0 ) ) ;
    public final void ruleDateType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:291:2: ( ( ( rule__DateType__Group__0 ) ) )
            // InternalTextualDataModel.g:292:2: ( ( rule__DateType__Group__0 ) )
            {
            // InternalTextualDataModel.g:292:2: ( ( rule__DateType__Group__0 ) )
            // InternalTextualDataModel.g:293:3: ( rule__DateType__Group__0 )
            {
             before(grammarAccess.getDateTypeAccess().getGroup()); 
            // InternalTextualDataModel.g:294:3: ( rule__DateType__Group__0 )
            // InternalTextualDataModel.g:294:4: rule__DateType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DateType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDateTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleDateType"


    // $ANTLR start "entryRuleDateTimeType"
    // InternalTextualDataModel.g:303:1: entryRuleDateTimeType : ruleDateTimeType EOF ;
    public final void entryRuleDateTimeType() throws RecognitionException {
        try {
            // InternalTextualDataModel.g:304:1: ( ruleDateTimeType EOF )
            // InternalTextualDataModel.g:305:1: ruleDateTimeType EOF
            {
             before(grammarAccess.getDateTimeTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDateTimeType();

            state._fsp--;

             after(grammarAccess.getDateTimeTypeRule()); 
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
    // $ANTLR end "entryRuleDateTimeType"


    // $ANTLR start "ruleDateTimeType"
    // InternalTextualDataModel.g:312:1: ruleDateTimeType : ( ( rule__DateTimeType__Group__0 ) ) ;
    public final void ruleDateTimeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:316:2: ( ( ( rule__DateTimeType__Group__0 ) ) )
            // InternalTextualDataModel.g:317:2: ( ( rule__DateTimeType__Group__0 ) )
            {
            // InternalTextualDataModel.g:317:2: ( ( rule__DateTimeType__Group__0 ) )
            // InternalTextualDataModel.g:318:3: ( rule__DateTimeType__Group__0 )
            {
             before(grammarAccess.getDateTimeTypeAccess().getGroup()); 
            // InternalTextualDataModel.g:319:3: ( rule__DateTimeType__Group__0 )
            // InternalTextualDataModel.g:319:4: rule__DateTimeType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DateTimeType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDateTimeTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleDateTimeType"


    // $ANTLR start "entryRuleUuidType"
    // InternalTextualDataModel.g:328:1: entryRuleUuidType : ruleUuidType EOF ;
    public final void entryRuleUuidType() throws RecognitionException {
        try {
            // InternalTextualDataModel.g:329:1: ( ruleUuidType EOF )
            // InternalTextualDataModel.g:330:1: ruleUuidType EOF
            {
             before(grammarAccess.getUuidTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleUuidType();

            state._fsp--;

             after(grammarAccess.getUuidTypeRule()); 
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
    // $ANTLR end "entryRuleUuidType"


    // $ANTLR start "ruleUuidType"
    // InternalTextualDataModel.g:337:1: ruleUuidType : ( ( rule__UuidType__Group__0 ) ) ;
    public final void ruleUuidType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:341:2: ( ( ( rule__UuidType__Group__0 ) ) )
            // InternalTextualDataModel.g:342:2: ( ( rule__UuidType__Group__0 ) )
            {
            // InternalTextualDataModel.g:342:2: ( ( rule__UuidType__Group__0 ) )
            // InternalTextualDataModel.g:343:3: ( rule__UuidType__Group__0 )
            {
             before(grammarAccess.getUuidTypeAccess().getGroup()); 
            // InternalTextualDataModel.g:344:3: ( rule__UuidType__Group__0 )
            // InternalTextualDataModel.g:344:4: rule__UuidType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UuidType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUuidTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleUuidType"


    // $ANTLR start "entryRuleLocalization"
    // InternalTextualDataModel.g:353:1: entryRuleLocalization : ruleLocalization EOF ;
    public final void entryRuleLocalization() throws RecognitionException {
        try {
            // InternalTextualDataModel.g:354:1: ( ruleLocalization EOF )
            // InternalTextualDataModel.g:355:1: ruleLocalization EOF
            {
             before(grammarAccess.getLocalizationRule()); 
            pushFollow(FOLLOW_1);
            ruleLocalization();

            state._fsp--;

             after(grammarAccess.getLocalizationRule()); 
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
    // $ANTLR end "entryRuleLocalization"


    // $ANTLR start "ruleLocalization"
    // InternalTextualDataModel.g:362:1: ruleLocalization : ( ( rule__Localization__Group__0 ) ) ;
    public final void ruleLocalization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:366:2: ( ( ( rule__Localization__Group__0 ) ) )
            // InternalTextualDataModel.g:367:2: ( ( rule__Localization__Group__0 ) )
            {
            // InternalTextualDataModel.g:367:2: ( ( rule__Localization__Group__0 ) )
            // InternalTextualDataModel.g:368:3: ( rule__Localization__Group__0 )
            {
             before(grammarAccess.getLocalizationAccess().getGroup()); 
            // InternalTextualDataModel.g:369:3: ( rule__Localization__Group__0 )
            // InternalTextualDataModel.g:369:4: rule__Localization__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Localization__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocalizationAccess().getGroup()); 

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
    // $ANTLR end "ruleLocalization"


    // $ANTLR start "entryRuleElementName"
    // InternalTextualDataModel.g:378:1: entryRuleElementName : ruleElementName EOF ;
    public final void entryRuleElementName() throws RecognitionException {
        try {
            // InternalTextualDataModel.g:379:1: ( ruleElementName EOF )
            // InternalTextualDataModel.g:380:1: ruleElementName EOF
            {
             before(grammarAccess.getElementNameRule()); 
            pushFollow(FOLLOW_1);
            ruleElementName();

            state._fsp--;

             after(grammarAccess.getElementNameRule()); 
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
    // $ANTLR end "entryRuleElementName"


    // $ANTLR start "ruleElementName"
    // InternalTextualDataModel.g:387:1: ruleElementName : ( RULE_STRING ) ;
    public final void ruleElementName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:391:2: ( ( RULE_STRING ) )
            // InternalTextualDataModel.g:392:2: ( RULE_STRING )
            {
            // InternalTextualDataModel.g:392:2: ( RULE_STRING )
            // InternalTextualDataModel.g:393:3: RULE_STRING
            {
             before(grammarAccess.getElementNameAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getElementNameAccess().getSTRINGTerminalRuleCall()); 

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
    // $ANTLR end "ruleElementName"


    // $ANTLR start "entryRuleText"
    // InternalTextualDataModel.g:403:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalTextualDataModel.g:404:1: ( ruleText EOF )
            // InternalTextualDataModel.g:405:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTextRule()); 
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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalTextualDataModel.g:412:1: ruleText : ( RULE_STRING ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:416:2: ( ( RULE_STRING ) )
            // InternalTextualDataModel.g:417:2: ( RULE_STRING )
            {
            // InternalTextualDataModel.g:417:2: ( RULE_STRING )
            // InternalTextualDataModel.g:418:3: RULE_STRING
            {
             before(grammarAccess.getTextAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getSTRINGTerminalRuleCall()); 

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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleUnlimitedNatural"
    // InternalTextualDataModel.g:428:1: entryRuleUnlimitedNatural : ruleUnlimitedNatural EOF ;
    public final void entryRuleUnlimitedNatural() throws RecognitionException {
        try {
            // InternalTextualDataModel.g:429:1: ( ruleUnlimitedNatural EOF )
            // InternalTextualDataModel.g:430:1: ruleUnlimitedNatural EOF
            {
             before(grammarAccess.getUnlimitedNaturalRule()); 
            pushFollow(FOLLOW_1);
            ruleUnlimitedNatural();

            state._fsp--;

             after(grammarAccess.getUnlimitedNaturalRule()); 
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
    // $ANTLR end "entryRuleUnlimitedNatural"


    // $ANTLR start "ruleUnlimitedNatural"
    // InternalTextualDataModel.g:437:1: ruleUnlimitedNatural : ( ( rule__UnlimitedNatural__Alternatives ) ) ;
    public final void ruleUnlimitedNatural() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:441:2: ( ( ( rule__UnlimitedNatural__Alternatives ) ) )
            // InternalTextualDataModel.g:442:2: ( ( rule__UnlimitedNatural__Alternatives ) )
            {
            // InternalTextualDataModel.g:442:2: ( ( rule__UnlimitedNatural__Alternatives ) )
            // InternalTextualDataModel.g:443:3: ( rule__UnlimitedNatural__Alternatives )
            {
             before(grammarAccess.getUnlimitedNaturalAccess().getAlternatives()); 
            // InternalTextualDataModel.g:444:3: ( rule__UnlimitedNatural__Alternatives )
            // InternalTextualDataModel.g:444:4: rule__UnlimitedNatural__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnlimitedNatural__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnlimitedNaturalAccess().getAlternatives()); 

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
    // $ANTLR end "ruleUnlimitedNatural"


    // $ANTLR start "entryRulePositiveShort"
    // InternalTextualDataModel.g:453:1: entryRulePositiveShort : rulePositiveShort EOF ;
    public final void entryRulePositiveShort() throws RecognitionException {
        try {
            // InternalTextualDataModel.g:454:1: ( rulePositiveShort EOF )
            // InternalTextualDataModel.g:455:1: rulePositiveShort EOF
            {
             before(grammarAccess.getPositiveShortRule()); 
            pushFollow(FOLLOW_1);
            rulePositiveShort();

            state._fsp--;

             after(grammarAccess.getPositiveShortRule()); 
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
    // $ANTLR end "entryRulePositiveShort"


    // $ANTLR start "rulePositiveShort"
    // InternalTextualDataModel.g:462:1: rulePositiveShort : ( RULE_INT ) ;
    public final void rulePositiveShort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:466:2: ( ( RULE_INT ) )
            // InternalTextualDataModel.g:467:2: ( RULE_INT )
            {
            // InternalTextualDataModel.g:467:2: ( RULE_INT )
            // InternalTextualDataModel.g:468:3: RULE_INT
            {
             before(grammarAccess.getPositiveShortAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPositiveShortAccess().getINTTerminalRuleCall()); 

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
    // $ANTLR end "rulePositiveShort"


    // $ANTLR start "entryRuleDouble"
    // InternalTextualDataModel.g:478:1: entryRuleDouble : ruleDouble EOF ;
    public final void entryRuleDouble() throws RecognitionException {
        try {
            // InternalTextualDataModel.g:479:1: ( ruleDouble EOF )
            // InternalTextualDataModel.g:480:1: ruleDouble EOF
            {
             before(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getDoubleRule()); 
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
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // InternalTextualDataModel.g:487:1: ruleDouble : ( ( rule__Double__Group__0 ) ) ;
    public final void ruleDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:491:2: ( ( ( rule__Double__Group__0 ) ) )
            // InternalTextualDataModel.g:492:2: ( ( rule__Double__Group__0 ) )
            {
            // InternalTextualDataModel.g:492:2: ( ( rule__Double__Group__0 ) )
            // InternalTextualDataModel.g:493:3: ( rule__Double__Group__0 )
            {
             before(grammarAccess.getDoubleAccess().getGroup()); 
            // InternalTextualDataModel.g:494:3: ( rule__Double__Group__0 )
            // InternalTextualDataModel.g:494:4: rule__Double__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Double__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoubleAccess().getGroup()); 

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
    // $ANTLR end "ruleDouble"


    // $ANTLR start "ruleEntityKind"
    // InternalTextualDataModel.g:503:1: ruleEntityKind : ( ( rule__EntityKind__Alternatives ) ) ;
    public final void ruleEntityKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:507:1: ( ( ( rule__EntityKind__Alternatives ) ) )
            // InternalTextualDataModel.g:508:2: ( ( rule__EntityKind__Alternatives ) )
            {
            // InternalTextualDataModel.g:508:2: ( ( rule__EntityKind__Alternatives ) )
            // InternalTextualDataModel.g:509:3: ( rule__EntityKind__Alternatives )
            {
             before(grammarAccess.getEntityKindAccess().getAlternatives()); 
            // InternalTextualDataModel.g:510:3: ( rule__EntityKind__Alternatives )
            // InternalTextualDataModel.g:510:4: rule__EntityKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EntityKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEntityKindAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEntityKind"


    // $ANTLR start "ruleRelationshipKind"
    // InternalTextualDataModel.g:519:1: ruleRelationshipKind : ( ( rule__RelationshipKind__Alternatives ) ) ;
    public final void ruleRelationshipKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:523:1: ( ( ( rule__RelationshipKind__Alternatives ) ) )
            // InternalTextualDataModel.g:524:2: ( ( rule__RelationshipKind__Alternatives ) )
            {
            // InternalTextualDataModel.g:524:2: ( ( rule__RelationshipKind__Alternatives ) )
            // InternalTextualDataModel.g:525:3: ( rule__RelationshipKind__Alternatives )
            {
             before(grammarAccess.getRelationshipKindAccess().getAlternatives()); 
            // InternalTextualDataModel.g:526:3: ( rule__RelationshipKind__Alternatives )
            // InternalTextualDataModel.g:526:4: rule__RelationshipKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RelationshipKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipKindAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRelationshipKind"


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalTextualDataModel.g:534:1: rule__DataType__Alternatives : ( ( ruleBooleanType ) | ( ruleStringType ) | ( ruleNumericType ) | ( ruleDateType ) | ( ruleDateTimeType ) | ( ruleUuidType ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:538:1: ( ( ruleBooleanType ) | ( ruleStringType ) | ( ruleNumericType ) | ( ruleDateType ) | ( ruleDateTimeType ) | ( ruleUuidType ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt1=1;
                }
                break;
            case 36:
                {
                alt1=2;
                }
                break;
            case 41:
                {
                alt1=3;
                }
                break;
            case 50:
                {
                alt1=4;
                }
                break;
            case 51:
                {
                alt1=5;
                }
                break;
            case 52:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalTextualDataModel.g:539:2: ( ruleBooleanType )
                    {
                    // InternalTextualDataModel.g:539:2: ( ruleBooleanType )
                    // InternalTextualDataModel.g:540:3: ruleBooleanType
                    {
                     before(grammarAccess.getDataTypeAccess().getBooleanTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanType();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getBooleanTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTextualDataModel.g:545:2: ( ruleStringType )
                    {
                    // InternalTextualDataModel.g:545:2: ( ruleStringType )
                    // InternalTextualDataModel.g:546:3: ruleStringType
                    {
                     before(grammarAccess.getDataTypeAccess().getStringTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringType();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getStringTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTextualDataModel.g:551:2: ( ruleNumericType )
                    {
                    // InternalTextualDataModel.g:551:2: ( ruleNumericType )
                    // InternalTextualDataModel.g:552:3: ruleNumericType
                    {
                     before(grammarAccess.getDataTypeAccess().getNumericTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleNumericType();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getNumericTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTextualDataModel.g:557:2: ( ruleDateType )
                    {
                    // InternalTextualDataModel.g:557:2: ( ruleDateType )
                    // InternalTextualDataModel.g:558:3: ruleDateType
                    {
                     before(grammarAccess.getDataTypeAccess().getDateTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDateType();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getDateTypeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTextualDataModel.g:563:2: ( ruleDateTimeType )
                    {
                    // InternalTextualDataModel.g:563:2: ( ruleDateTimeType )
                    // InternalTextualDataModel.g:564:3: ruleDateTimeType
                    {
                     before(grammarAccess.getDataTypeAccess().getDateTimeTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleDateTimeType();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getDateTimeTypeParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalTextualDataModel.g:569:2: ( ruleUuidType )
                    {
                    // InternalTextualDataModel.g:569:2: ( ruleUuidType )
                    // InternalTextualDataModel.g:570:3: ruleUuidType
                    {
                     before(grammarAccess.getDataTypeAccess().getUuidTypeParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleUuidType();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getUuidTypeParserRuleCall_5()); 

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
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__UnlimitedNatural__Alternatives"
    // InternalTextualDataModel.g:579:1: rule__UnlimitedNatural__Alternatives : ( ( RULE_INT ) | ( '*' ) );
    public final void rule__UnlimitedNatural__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:583:1: ( ( RULE_INT ) | ( '*' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTextualDataModel.g:584:2: ( RULE_INT )
                    {
                    // InternalTextualDataModel.g:584:2: ( RULE_INT )
                    // InternalTextualDataModel.g:585:3: RULE_INT
                    {
                     before(grammarAccess.getUnlimitedNaturalAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getUnlimitedNaturalAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTextualDataModel.g:590:2: ( '*' )
                    {
                    // InternalTextualDataModel.g:590:2: ( '*' )
                    // InternalTextualDataModel.g:591:3: '*'
                    {
                     before(grammarAccess.getUnlimitedNaturalAccess().getAsteriskKeyword_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getUnlimitedNaturalAccess().getAsteriskKeyword_1()); 

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
    // $ANTLR end "rule__UnlimitedNatural__Alternatives"


    // $ANTLR start "rule__Double__Alternatives_4_0"
    // InternalTextualDataModel.g:600:1: rule__Double__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__Double__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:604:1: ( ( 'E' ) | ( 'e' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTextualDataModel.g:605:2: ( 'E' )
                    {
                    // InternalTextualDataModel.g:605:2: ( 'E' )
                    // InternalTextualDataModel.g:606:3: 'E'
                    {
                     before(grammarAccess.getDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTextualDataModel.g:611:2: ( 'e' )
                    {
                    // InternalTextualDataModel.g:611:2: ( 'e' )
                    // InternalTextualDataModel.g:612:3: 'e'
                    {
                     before(grammarAccess.getDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getDoubleAccess().getEKeyword_4_0_1()); 

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
    // $ANTLR end "rule__Double__Alternatives_4_0"


    // $ANTLR start "rule__EntityKind__Alternatives"
    // InternalTextualDataModel.g:621:1: rule__EntityKind__Alternatives : ( ( ( 'MASTER_DATA' ) ) | ( ( 'REFERENCE_DATA' ) ) | ( ( 'ABSTRACT_ENTITY' ) ) | ( ( 'ATTRIBUTE_SET' ) ) );
    public final void rule__EntityKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:625:1: ( ( ( 'MASTER_DATA' ) ) | ( ( 'REFERENCE_DATA' ) ) | ( ( 'ABSTRACT_ENTITY' ) ) | ( ( 'ATTRIBUTE_SET' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            case 17:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalTextualDataModel.g:626:2: ( ( 'MASTER_DATA' ) )
                    {
                    // InternalTextualDataModel.g:626:2: ( ( 'MASTER_DATA' ) )
                    // InternalTextualDataModel.g:627:3: ( 'MASTER_DATA' )
                    {
                     before(grammarAccess.getEntityKindAccess().getMASTER_DATAEnumLiteralDeclaration_0()); 
                    // InternalTextualDataModel.g:628:3: ( 'MASTER_DATA' )
                    // InternalTextualDataModel.g:628:4: 'MASTER_DATA'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getEntityKindAccess().getMASTER_DATAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTextualDataModel.g:632:2: ( ( 'REFERENCE_DATA' ) )
                    {
                    // InternalTextualDataModel.g:632:2: ( ( 'REFERENCE_DATA' ) )
                    // InternalTextualDataModel.g:633:3: ( 'REFERENCE_DATA' )
                    {
                     before(grammarAccess.getEntityKindAccess().getREFERENCE_DATAEnumLiteralDeclaration_1()); 
                    // InternalTextualDataModel.g:634:3: ( 'REFERENCE_DATA' )
                    // InternalTextualDataModel.g:634:4: 'REFERENCE_DATA'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getEntityKindAccess().getREFERENCE_DATAEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTextualDataModel.g:638:2: ( ( 'ABSTRACT_ENTITY' ) )
                    {
                    // InternalTextualDataModel.g:638:2: ( ( 'ABSTRACT_ENTITY' ) )
                    // InternalTextualDataModel.g:639:3: ( 'ABSTRACT_ENTITY' )
                    {
                     before(grammarAccess.getEntityKindAccess().getABSTRACT_ENTITYEnumLiteralDeclaration_2()); 
                    // InternalTextualDataModel.g:640:3: ( 'ABSTRACT_ENTITY' )
                    // InternalTextualDataModel.g:640:4: 'ABSTRACT_ENTITY'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getEntityKindAccess().getABSTRACT_ENTITYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTextualDataModel.g:644:2: ( ( 'ATTRIBUTE_SET' ) )
                    {
                    // InternalTextualDataModel.g:644:2: ( ( 'ATTRIBUTE_SET' ) )
                    // InternalTextualDataModel.g:645:3: ( 'ATTRIBUTE_SET' )
                    {
                     before(grammarAccess.getEntityKindAccess().getATTRIBUTE_SETEnumLiteralDeclaration_3()); 
                    // InternalTextualDataModel.g:646:3: ( 'ATTRIBUTE_SET' )
                    // InternalTextualDataModel.g:646:4: 'ATTRIBUTE_SET'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getEntityKindAccess().getATTRIBUTE_SETEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__EntityKind__Alternatives"


    // $ANTLR start "rule__RelationshipKind__Alternatives"
    // InternalTextualDataModel.g:654:1: rule__RelationshipKind__Alternatives : ( ( ( 'ASSOCIATION' ) ) | ( ( 'COMPOSITION' ) ) | ( ( 'AGGREGATION' ) ) );
    public final void rule__RelationshipKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:658:1: ( ( ( 'ASSOCIATION' ) ) | ( ( 'COMPOSITION' ) ) | ( ( 'AGGREGATION' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt5=1;
                }
                break;
            case 19:
                {
                alt5=2;
                }
                break;
            case 20:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTextualDataModel.g:659:2: ( ( 'ASSOCIATION' ) )
                    {
                    // InternalTextualDataModel.g:659:2: ( ( 'ASSOCIATION' ) )
                    // InternalTextualDataModel.g:660:3: ( 'ASSOCIATION' )
                    {
                     before(grammarAccess.getRelationshipKindAccess().getASSOCIATIONEnumLiteralDeclaration_0()); 
                    // InternalTextualDataModel.g:661:3: ( 'ASSOCIATION' )
                    // InternalTextualDataModel.g:661:4: 'ASSOCIATION'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationshipKindAccess().getASSOCIATIONEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTextualDataModel.g:665:2: ( ( 'COMPOSITION' ) )
                    {
                    // InternalTextualDataModel.g:665:2: ( ( 'COMPOSITION' ) )
                    // InternalTextualDataModel.g:666:3: ( 'COMPOSITION' )
                    {
                     before(grammarAccess.getRelationshipKindAccess().getCOMPOSITIONEnumLiteralDeclaration_1()); 
                    // InternalTextualDataModel.g:667:3: ( 'COMPOSITION' )
                    // InternalTextualDataModel.g:667:4: 'COMPOSITION'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationshipKindAccess().getCOMPOSITIONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTextualDataModel.g:671:2: ( ( 'AGGREGATION' ) )
                    {
                    // InternalTextualDataModel.g:671:2: ( ( 'AGGREGATION' ) )
                    // InternalTextualDataModel.g:672:3: ( 'AGGREGATION' )
                    {
                     before(grammarAccess.getRelationshipKindAccess().getAGGREGATIONEnumLiteralDeclaration_2()); 
                    // InternalTextualDataModel.g:673:3: ( 'AGGREGATION' )
                    // InternalTextualDataModel.g:673:4: 'AGGREGATION'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationshipKindAccess().getAGGREGATIONEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__RelationshipKind__Alternatives"


    // $ANTLR start "rule__DataModel__Group__0"
    // InternalTextualDataModel.g:681:1: rule__DataModel__Group__0 : rule__DataModel__Group__0__Impl rule__DataModel__Group__1 ;
    public final void rule__DataModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:685:1: ( rule__DataModel__Group__0__Impl rule__DataModel__Group__1 )
            // InternalTextualDataModel.g:686:2: rule__DataModel__Group__0__Impl rule__DataModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DataModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group__1();

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
    // $ANTLR end "rule__DataModel__Group__0"


    // $ANTLR start "rule__DataModel__Group__0__Impl"
    // InternalTextualDataModel.g:693:1: rule__DataModel__Group__0__Impl : ( 'DataModel' ) ;
    public final void rule__DataModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:697:1: ( ( 'DataModel' ) )
            // InternalTextualDataModel.g:698:1: ( 'DataModel' )
            {
            // InternalTextualDataModel.g:698:1: ( 'DataModel' )
            // InternalTextualDataModel.g:699:2: 'DataModel'
            {
             before(grammarAccess.getDataModelAccess().getDataModelKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getDataModelKeyword_0()); 

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
    // $ANTLR end "rule__DataModel__Group__0__Impl"


    // $ANTLR start "rule__DataModel__Group__1"
    // InternalTextualDataModel.g:708:1: rule__DataModel__Group__1 : rule__DataModel__Group__1__Impl rule__DataModel__Group__2 ;
    public final void rule__DataModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:712:1: ( rule__DataModel__Group__1__Impl rule__DataModel__Group__2 )
            // InternalTextualDataModel.g:713:2: rule__DataModel__Group__1__Impl rule__DataModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DataModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group__2();

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
    // $ANTLR end "rule__DataModel__Group__1"


    // $ANTLR start "rule__DataModel__Group__1__Impl"
    // InternalTextualDataModel.g:720:1: rule__DataModel__Group__1__Impl : ( ( rule__DataModel__NameAssignment_1 ) ) ;
    public final void rule__DataModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:724:1: ( ( ( rule__DataModel__NameAssignment_1 ) ) )
            // InternalTextualDataModel.g:725:1: ( ( rule__DataModel__NameAssignment_1 ) )
            {
            // InternalTextualDataModel.g:725:1: ( ( rule__DataModel__NameAssignment_1 ) )
            // InternalTextualDataModel.g:726:2: ( rule__DataModel__NameAssignment_1 )
            {
             before(grammarAccess.getDataModelAccess().getNameAssignment_1()); 
            // InternalTextualDataModel.g:727:2: ( rule__DataModel__NameAssignment_1 )
            // InternalTextualDataModel.g:727:3: rule__DataModel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DataModel__Group__1__Impl"


    // $ANTLR start "rule__DataModel__Group__2"
    // InternalTextualDataModel.g:735:1: rule__DataModel__Group__2 : rule__DataModel__Group__2__Impl ;
    public final void rule__DataModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:739:1: ( rule__DataModel__Group__2__Impl )
            // InternalTextualDataModel.g:740:2: rule__DataModel__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__Group__2__Impl();

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
    // $ANTLR end "rule__DataModel__Group__2"


    // $ANTLR start "rule__DataModel__Group__2__Impl"
    // InternalTextualDataModel.g:746:1: rule__DataModel__Group__2__Impl : ( ( rule__DataModel__Group_2__0 )? ) ;
    public final void rule__DataModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:750:1: ( ( ( rule__DataModel__Group_2__0 )? ) )
            // InternalTextualDataModel.g:751:1: ( ( rule__DataModel__Group_2__0 )? )
            {
            // InternalTextualDataModel.g:751:1: ( ( rule__DataModel__Group_2__0 )? )
            // InternalTextualDataModel.g:752:2: ( rule__DataModel__Group_2__0 )?
            {
             before(grammarAccess.getDataModelAccess().getGroup_2()); 
            // InternalTextualDataModel.g:753:2: ( rule__DataModel__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTextualDataModel.g:753:3: rule__DataModel__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataModel__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataModelAccess().getGroup_2()); 

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
    // $ANTLR end "rule__DataModel__Group__2__Impl"


    // $ANTLR start "rule__DataModel__Group_2__0"
    // InternalTextualDataModel.g:762:1: rule__DataModel__Group_2__0 : rule__DataModel__Group_2__0__Impl rule__DataModel__Group_2__1 ;
    public final void rule__DataModel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:766:1: ( rule__DataModel__Group_2__0__Impl rule__DataModel__Group_2__1 )
            // InternalTextualDataModel.g:767:2: rule__DataModel__Group_2__0__Impl rule__DataModel__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__DataModel__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group_2__1();

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
    // $ANTLR end "rule__DataModel__Group_2__0"


    // $ANTLR start "rule__DataModel__Group_2__0__Impl"
    // InternalTextualDataModel.g:774:1: rule__DataModel__Group_2__0__Impl : ( '{' ) ;
    public final void rule__DataModel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:778:1: ( ( '{' ) )
            // InternalTextualDataModel.g:779:1: ( '{' )
            {
            // InternalTextualDataModel.g:779:1: ( '{' )
            // InternalTextualDataModel.g:780:2: '{'
            {
             before(grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_2_0()); 

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
    // $ANTLR end "rule__DataModel__Group_2__0__Impl"


    // $ANTLR start "rule__DataModel__Group_2__1"
    // InternalTextualDataModel.g:789:1: rule__DataModel__Group_2__1 : rule__DataModel__Group_2__1__Impl rule__DataModel__Group_2__2 ;
    public final void rule__DataModel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:793:1: ( rule__DataModel__Group_2__1__Impl rule__DataModel__Group_2__2 )
            // InternalTextualDataModel.g:794:2: rule__DataModel__Group_2__1__Impl rule__DataModel__Group_2__2
            {
            pushFollow(FOLLOW_5);
            rule__DataModel__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group_2__2();

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
    // $ANTLR end "rule__DataModel__Group_2__1"


    // $ANTLR start "rule__DataModel__Group_2__1__Impl"
    // InternalTextualDataModel.g:801:1: rule__DataModel__Group_2__1__Impl : ( ( rule__DataModel__Group_2_1__0 )? ) ;
    public final void rule__DataModel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:805:1: ( ( ( rule__DataModel__Group_2_1__0 )? ) )
            // InternalTextualDataModel.g:806:1: ( ( rule__DataModel__Group_2_1__0 )? )
            {
            // InternalTextualDataModel.g:806:1: ( ( rule__DataModel__Group_2_1__0 )? )
            // InternalTextualDataModel.g:807:2: ( rule__DataModel__Group_2_1__0 )?
            {
             before(grammarAccess.getDataModelAccess().getGroup_2_1()); 
            // InternalTextualDataModel.g:808:2: ( rule__DataModel__Group_2_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTextualDataModel.g:808:3: rule__DataModel__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataModel__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataModelAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__DataModel__Group_2__1__Impl"


    // $ANTLR start "rule__DataModel__Group_2__2"
    // InternalTextualDataModel.g:816:1: rule__DataModel__Group_2__2 : rule__DataModel__Group_2__2__Impl rule__DataModel__Group_2__3 ;
    public final void rule__DataModel__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:820:1: ( rule__DataModel__Group_2__2__Impl rule__DataModel__Group_2__3 )
            // InternalTextualDataModel.g:821:2: rule__DataModel__Group_2__2__Impl rule__DataModel__Group_2__3
            {
            pushFollow(FOLLOW_5);
            rule__DataModel__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group_2__3();

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
    // $ANTLR end "rule__DataModel__Group_2__2"


    // $ANTLR start "rule__DataModel__Group_2__2__Impl"
    // InternalTextualDataModel.g:828:1: rule__DataModel__Group_2__2__Impl : ( ( rule__DataModel__Group_2_2__0 )? ) ;
    public final void rule__DataModel__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:832:1: ( ( ( rule__DataModel__Group_2_2__0 )? ) )
            // InternalTextualDataModel.g:833:1: ( ( rule__DataModel__Group_2_2__0 )? )
            {
            // InternalTextualDataModel.g:833:1: ( ( rule__DataModel__Group_2_2__0 )? )
            // InternalTextualDataModel.g:834:2: ( rule__DataModel__Group_2_2__0 )?
            {
             before(grammarAccess.getDataModelAccess().getGroup_2_2()); 
            // InternalTextualDataModel.g:835:2: ( rule__DataModel__Group_2_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTextualDataModel.g:835:3: rule__DataModel__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataModel__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataModelAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__DataModel__Group_2__2__Impl"


    // $ANTLR start "rule__DataModel__Group_2__3"
    // InternalTextualDataModel.g:843:1: rule__DataModel__Group_2__3 : rule__DataModel__Group_2__3__Impl rule__DataModel__Group_2__4 ;
    public final void rule__DataModel__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:847:1: ( rule__DataModel__Group_2__3__Impl rule__DataModel__Group_2__4 )
            // InternalTextualDataModel.g:848:2: rule__DataModel__Group_2__3__Impl rule__DataModel__Group_2__4
            {
            pushFollow(FOLLOW_5);
            rule__DataModel__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group_2__4();

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
    // $ANTLR end "rule__DataModel__Group_2__3"


    // $ANTLR start "rule__DataModel__Group_2__3__Impl"
    // InternalTextualDataModel.g:855:1: rule__DataModel__Group_2__3__Impl : ( ( rule__DataModel__LocalizationsAssignment_2_3 )* ) ;
    public final void rule__DataModel__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:859:1: ( ( ( rule__DataModel__LocalizationsAssignment_2_3 )* ) )
            // InternalTextualDataModel.g:860:1: ( ( rule__DataModel__LocalizationsAssignment_2_3 )* )
            {
            // InternalTextualDataModel.g:860:1: ( ( rule__DataModel__LocalizationsAssignment_2_3 )* )
            // InternalTextualDataModel.g:861:2: ( rule__DataModel__LocalizationsAssignment_2_3 )*
            {
             before(grammarAccess.getDataModelAccess().getLocalizationsAssignment_2_3()); 
            // InternalTextualDataModel.g:862:2: ( rule__DataModel__LocalizationsAssignment_2_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==53) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTextualDataModel.g:862:3: rule__DataModel__LocalizationsAssignment_2_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__DataModel__LocalizationsAssignment_2_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getDataModelAccess().getLocalizationsAssignment_2_3()); 

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
    // $ANTLR end "rule__DataModel__Group_2__3__Impl"


    // $ANTLR start "rule__DataModel__Group_2__4"
    // InternalTextualDataModel.g:870:1: rule__DataModel__Group_2__4 : rule__DataModel__Group_2__4__Impl rule__DataModel__Group_2__5 ;
    public final void rule__DataModel__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:874:1: ( rule__DataModel__Group_2__4__Impl rule__DataModel__Group_2__5 )
            // InternalTextualDataModel.g:875:2: rule__DataModel__Group_2__4__Impl rule__DataModel__Group_2__5
            {
            pushFollow(FOLLOW_5);
            rule__DataModel__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group_2__5();

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
    // $ANTLR end "rule__DataModel__Group_2__4"


    // $ANTLR start "rule__DataModel__Group_2__4__Impl"
    // InternalTextualDataModel.g:882:1: rule__DataModel__Group_2__4__Impl : ( ( rule__DataModel__EntitiesAssignment_2_4 )* ) ;
    public final void rule__DataModel__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:886:1: ( ( ( rule__DataModel__EntitiesAssignment_2_4 )* ) )
            // InternalTextualDataModel.g:887:1: ( ( rule__DataModel__EntitiesAssignment_2_4 )* )
            {
            // InternalTextualDataModel.g:887:1: ( ( rule__DataModel__EntitiesAssignment_2_4 )* )
            // InternalTextualDataModel.g:888:2: ( rule__DataModel__EntitiesAssignment_2_4 )*
            {
             before(grammarAccess.getDataModelAccess().getEntitiesAssignment_2_4()); 
            // InternalTextualDataModel.g:889:2: ( rule__DataModel__EntitiesAssignment_2_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTextualDataModel.g:889:3: rule__DataModel__EntitiesAssignment_2_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__DataModel__EntitiesAssignment_2_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getDataModelAccess().getEntitiesAssignment_2_4()); 

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
    // $ANTLR end "rule__DataModel__Group_2__4__Impl"


    // $ANTLR start "rule__DataModel__Group_2__5"
    // InternalTextualDataModel.g:897:1: rule__DataModel__Group_2__5 : rule__DataModel__Group_2__5__Impl rule__DataModel__Group_2__6 ;
    public final void rule__DataModel__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:901:1: ( rule__DataModel__Group_2__5__Impl rule__DataModel__Group_2__6 )
            // InternalTextualDataModel.g:902:2: rule__DataModel__Group_2__5__Impl rule__DataModel__Group_2__6
            {
            pushFollow(FOLLOW_5);
            rule__DataModel__Group_2__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group_2__6();

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
    // $ANTLR end "rule__DataModel__Group_2__5"


    // $ANTLR start "rule__DataModel__Group_2__5__Impl"
    // InternalTextualDataModel.g:909:1: rule__DataModel__Group_2__5__Impl : ( ( rule__DataModel__RelationshipsAssignment_2_5 )* ) ;
    public final void rule__DataModel__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:913:1: ( ( ( rule__DataModel__RelationshipsAssignment_2_5 )* ) )
            // InternalTextualDataModel.g:914:1: ( ( rule__DataModel__RelationshipsAssignment_2_5 )* )
            {
            // InternalTextualDataModel.g:914:1: ( ( rule__DataModel__RelationshipsAssignment_2_5 )* )
            // InternalTextualDataModel.g:915:2: ( rule__DataModel__RelationshipsAssignment_2_5 )*
            {
             before(grammarAccess.getDataModelAccess().getRelationshipsAssignment_2_5()); 
            // InternalTextualDataModel.g:916:2: ( rule__DataModel__RelationshipsAssignment_2_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==34) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTextualDataModel.g:916:3: rule__DataModel__RelationshipsAssignment_2_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__DataModel__RelationshipsAssignment_2_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getDataModelAccess().getRelationshipsAssignment_2_5()); 

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
    // $ANTLR end "rule__DataModel__Group_2__5__Impl"


    // $ANTLR start "rule__DataModel__Group_2__6"
    // InternalTextualDataModel.g:924:1: rule__DataModel__Group_2__6 : rule__DataModel__Group_2__6__Impl rule__DataModel__Group_2__7 ;
    public final void rule__DataModel__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:928:1: ( rule__DataModel__Group_2__6__Impl rule__DataModel__Group_2__7 )
            // InternalTextualDataModel.g:929:2: rule__DataModel__Group_2__6__Impl rule__DataModel__Group_2__7
            {
            pushFollow(FOLLOW_5);
            rule__DataModel__Group_2__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group_2__7();

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
    // $ANTLR end "rule__DataModel__Group_2__6"


    // $ANTLR start "rule__DataModel__Group_2__6__Impl"
    // InternalTextualDataModel.g:936:1: rule__DataModel__Group_2__6__Impl : ( ( rule__DataModel__DataTypesAssignment_2_6 )* ) ;
    public final void rule__DataModel__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:940:1: ( ( ( rule__DataModel__DataTypesAssignment_2_6 )* ) )
            // InternalTextualDataModel.g:941:1: ( ( rule__DataModel__DataTypesAssignment_2_6 )* )
            {
            // InternalTextualDataModel.g:941:1: ( ( rule__DataModel__DataTypesAssignment_2_6 )* )
            // InternalTextualDataModel.g:942:2: ( rule__DataModel__DataTypesAssignment_2_6 )*
            {
             before(grammarAccess.getDataModelAccess().getDataTypesAssignment_2_6()); 
            // InternalTextualDataModel.g:943:2: ( rule__DataModel__DataTypesAssignment_2_6 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=35 && LA12_0<=36)||LA12_0==41||(LA12_0>=50 && LA12_0<=52)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTextualDataModel.g:943:3: rule__DataModel__DataTypesAssignment_2_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__DataModel__DataTypesAssignment_2_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getDataModelAccess().getDataTypesAssignment_2_6()); 

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
    // $ANTLR end "rule__DataModel__Group_2__6__Impl"


    // $ANTLR start "rule__DataModel__Group_2__7"
    // InternalTextualDataModel.g:951:1: rule__DataModel__Group_2__7 : rule__DataModel__Group_2__7__Impl ;
    public final void rule__DataModel__Group_2__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:955:1: ( rule__DataModel__Group_2__7__Impl )
            // InternalTextualDataModel.g:956:2: rule__DataModel__Group_2__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__Group_2__7__Impl();

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
    // $ANTLR end "rule__DataModel__Group_2__7"


    // $ANTLR start "rule__DataModel__Group_2__7__Impl"
    // InternalTextualDataModel.g:962:1: rule__DataModel__Group_2__7__Impl : ( '}' ) ;
    public final void rule__DataModel__Group_2__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:966:1: ( ( '}' ) )
            // InternalTextualDataModel.g:967:1: ( '}' )
            {
            // InternalTextualDataModel.g:967:1: ( '}' )
            // InternalTextualDataModel.g:968:2: '}'
            {
             before(grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_2_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_2_7()); 

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
    // $ANTLR end "rule__DataModel__Group_2__7__Impl"


    // $ANTLR start "rule__DataModel__Group_2_1__0"
    // InternalTextualDataModel.g:978:1: rule__DataModel__Group_2_1__0 : rule__DataModel__Group_2_1__0__Impl rule__DataModel__Group_2_1__1 ;
    public final void rule__DataModel__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:982:1: ( rule__DataModel__Group_2_1__0__Impl rule__DataModel__Group_2_1__1 )
            // InternalTextualDataModel.g:983:2: rule__DataModel__Group_2_1__0__Impl rule__DataModel__Group_2_1__1
            {
            pushFollow(FOLLOW_10);
            rule__DataModel__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group_2_1__1();

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
    // $ANTLR end "rule__DataModel__Group_2_1__0"


    // $ANTLR start "rule__DataModel__Group_2_1__0__Impl"
    // InternalTextualDataModel.g:990:1: rule__DataModel__Group_2_1__0__Impl : ( '@description' ) ;
    public final void rule__DataModel__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:994:1: ( ( '@description' ) )
            // InternalTextualDataModel.g:995:1: ( '@description' )
            {
            // InternalTextualDataModel.g:995:1: ( '@description' )
            // InternalTextualDataModel.g:996:2: '@description'
            {
             before(grammarAccess.getDataModelAccess().getDescriptionKeyword_2_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getDescriptionKeyword_2_1_0()); 

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
    // $ANTLR end "rule__DataModel__Group_2_1__0__Impl"


    // $ANTLR start "rule__DataModel__Group_2_1__1"
    // InternalTextualDataModel.g:1005:1: rule__DataModel__Group_2_1__1 : rule__DataModel__Group_2_1__1__Impl rule__DataModel__Group_2_1__2 ;
    public final void rule__DataModel__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1009:1: ( rule__DataModel__Group_2_1__1__Impl rule__DataModel__Group_2_1__2 )
            // InternalTextualDataModel.g:1010:2: rule__DataModel__Group_2_1__1__Impl rule__DataModel__Group_2_1__2
            {
            pushFollow(FOLLOW_3);
            rule__DataModel__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group_2_1__2();

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
    // $ANTLR end "rule__DataModel__Group_2_1__1"


    // $ANTLR start "rule__DataModel__Group_2_1__1__Impl"
    // InternalTextualDataModel.g:1017:1: rule__DataModel__Group_2_1__1__Impl : ( '(' ) ;
    public final void rule__DataModel__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1021:1: ( ( '(' ) )
            // InternalTextualDataModel.g:1022:1: ( '(' )
            {
            // InternalTextualDataModel.g:1022:1: ( '(' )
            // InternalTextualDataModel.g:1023:2: '('
            {
             before(grammarAccess.getDataModelAccess().getLeftParenthesisKeyword_2_1_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getLeftParenthesisKeyword_2_1_1()); 

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
    // $ANTLR end "rule__DataModel__Group_2_1__1__Impl"


    // $ANTLR start "rule__DataModel__Group_2_1__2"
    // InternalTextualDataModel.g:1032:1: rule__DataModel__Group_2_1__2 : rule__DataModel__Group_2_1__2__Impl rule__DataModel__Group_2_1__3 ;
    public final void rule__DataModel__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1036:1: ( rule__DataModel__Group_2_1__2__Impl rule__DataModel__Group_2_1__3 )
            // InternalTextualDataModel.g:1037:2: rule__DataModel__Group_2_1__2__Impl rule__DataModel__Group_2_1__3
            {
            pushFollow(FOLLOW_11);
            rule__DataModel__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group_2_1__3();

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
    // $ANTLR end "rule__DataModel__Group_2_1__2"


    // $ANTLR start "rule__DataModel__Group_2_1__2__Impl"
    // InternalTextualDataModel.g:1044:1: rule__DataModel__Group_2_1__2__Impl : ( ( rule__DataModel__DescriptionAssignment_2_1_2 ) ) ;
    public final void rule__DataModel__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1048:1: ( ( ( rule__DataModel__DescriptionAssignment_2_1_2 ) ) )
            // InternalTextualDataModel.g:1049:1: ( ( rule__DataModel__DescriptionAssignment_2_1_2 ) )
            {
            // InternalTextualDataModel.g:1049:1: ( ( rule__DataModel__DescriptionAssignment_2_1_2 ) )
            // InternalTextualDataModel.g:1050:2: ( rule__DataModel__DescriptionAssignment_2_1_2 )
            {
             before(grammarAccess.getDataModelAccess().getDescriptionAssignment_2_1_2()); 
            // InternalTextualDataModel.g:1051:2: ( rule__DataModel__DescriptionAssignment_2_1_2 )
            // InternalTextualDataModel.g:1051:3: rule__DataModel__DescriptionAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__DescriptionAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getDescriptionAssignment_2_1_2()); 

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
    // $ANTLR end "rule__DataModel__Group_2_1__2__Impl"


    // $ANTLR start "rule__DataModel__Group_2_1__3"
    // InternalTextualDataModel.g:1059:1: rule__DataModel__Group_2_1__3 : rule__DataModel__Group_2_1__3__Impl ;
    public final void rule__DataModel__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1063:1: ( rule__DataModel__Group_2_1__3__Impl )
            // InternalTextualDataModel.g:1064:2: rule__DataModel__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__Group_2_1__3__Impl();

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
    // $ANTLR end "rule__DataModel__Group_2_1__3"


    // $ANTLR start "rule__DataModel__Group_2_1__3__Impl"
    // InternalTextualDataModel.g:1070:1: rule__DataModel__Group_2_1__3__Impl : ( ')' ) ;
    public final void rule__DataModel__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1074:1: ( ( ')' ) )
            // InternalTextualDataModel.g:1075:1: ( ')' )
            {
            // InternalTextualDataModel.g:1075:1: ( ')' )
            // InternalTextualDataModel.g:1076:2: ')'
            {
             before(grammarAccess.getDataModelAccess().getRightParenthesisKeyword_2_1_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getRightParenthesisKeyword_2_1_3()); 

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
    // $ANTLR end "rule__DataModel__Group_2_1__3__Impl"


    // $ANTLR start "rule__DataModel__Group_2_2__0"
    // InternalTextualDataModel.g:1086:1: rule__DataModel__Group_2_2__0 : rule__DataModel__Group_2_2__0__Impl rule__DataModel__Group_2_2__1 ;
    public final void rule__DataModel__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1090:1: ( rule__DataModel__Group_2_2__0__Impl rule__DataModel__Group_2_2__1 )
            // InternalTextualDataModel.g:1091:2: rule__DataModel__Group_2_2__0__Impl rule__DataModel__Group_2_2__1
            {
            pushFollow(FOLLOW_10);
            rule__DataModel__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group_2_2__1();

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
    // $ANTLR end "rule__DataModel__Group_2_2__0"


    // $ANTLR start "rule__DataModel__Group_2_2__0__Impl"
    // InternalTextualDataModel.g:1098:1: rule__DataModel__Group_2_2__0__Impl : ( '@locales' ) ;
    public final void rule__DataModel__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1102:1: ( ( '@locales' ) )
            // InternalTextualDataModel.g:1103:1: ( '@locales' )
            {
            // InternalTextualDataModel.g:1103:1: ( '@locales' )
            // InternalTextualDataModel.g:1104:2: '@locales'
            {
             before(grammarAccess.getDataModelAccess().getLocalesKeyword_2_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getLocalesKeyword_2_2_0()); 

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
    // $ANTLR end "rule__DataModel__Group_2_2__0__Impl"


    // $ANTLR start "rule__DataModel__Group_2_2__1"
    // InternalTextualDataModel.g:1113:1: rule__DataModel__Group_2_2__1 : rule__DataModel__Group_2_2__1__Impl rule__DataModel__Group_2_2__2 ;
    public final void rule__DataModel__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1117:1: ( rule__DataModel__Group_2_2__1__Impl rule__DataModel__Group_2_2__2 )
            // InternalTextualDataModel.g:1118:2: rule__DataModel__Group_2_2__1__Impl rule__DataModel__Group_2_2__2
            {
            pushFollow(FOLLOW_12);
            rule__DataModel__Group_2_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group_2_2__2();

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
    // $ANTLR end "rule__DataModel__Group_2_2__1"


    // $ANTLR start "rule__DataModel__Group_2_2__1__Impl"
    // InternalTextualDataModel.g:1125:1: rule__DataModel__Group_2_2__1__Impl : ( '(' ) ;
    public final void rule__DataModel__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1129:1: ( ( '(' ) )
            // InternalTextualDataModel.g:1130:1: ( '(' )
            {
            // InternalTextualDataModel.g:1130:1: ( '(' )
            // InternalTextualDataModel.g:1131:2: '('
            {
             before(grammarAccess.getDataModelAccess().getLeftParenthesisKeyword_2_2_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getLeftParenthesisKeyword_2_2_1()); 

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
    // $ANTLR end "rule__DataModel__Group_2_2__1__Impl"


    // $ANTLR start "rule__DataModel__Group_2_2__2"
    // InternalTextualDataModel.g:1140:1: rule__DataModel__Group_2_2__2 : rule__DataModel__Group_2_2__2__Impl rule__DataModel__Group_2_2__3 ;
    public final void rule__DataModel__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1144:1: ( rule__DataModel__Group_2_2__2__Impl rule__DataModel__Group_2_2__3 )
            // InternalTextualDataModel.g:1145:2: rule__DataModel__Group_2_2__2__Impl rule__DataModel__Group_2_2__3
            {
            pushFollow(FOLLOW_12);
            rule__DataModel__Group_2_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group_2_2__3();

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
    // $ANTLR end "rule__DataModel__Group_2_2__2"


    // $ANTLR start "rule__DataModel__Group_2_2__2__Impl"
    // InternalTextualDataModel.g:1152:1: rule__DataModel__Group_2_2__2__Impl : ( ( rule__DataModel__LocalesAssignment_2_2_2 )* ) ;
    public final void rule__DataModel__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1156:1: ( ( ( rule__DataModel__LocalesAssignment_2_2_2 )* ) )
            // InternalTextualDataModel.g:1157:1: ( ( rule__DataModel__LocalesAssignment_2_2_2 )* )
            {
            // InternalTextualDataModel.g:1157:1: ( ( rule__DataModel__LocalesAssignment_2_2_2 )* )
            // InternalTextualDataModel.g:1158:2: ( rule__DataModel__LocalesAssignment_2_2_2 )*
            {
             before(grammarAccess.getDataModelAccess().getLocalesAssignment_2_2_2()); 
            // InternalTextualDataModel.g:1159:2: ( rule__DataModel__LocalesAssignment_2_2_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTextualDataModel.g:1159:3: rule__DataModel__LocalesAssignment_2_2_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__DataModel__LocalesAssignment_2_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getDataModelAccess().getLocalesAssignment_2_2_2()); 

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
    // $ANTLR end "rule__DataModel__Group_2_2__2__Impl"


    // $ANTLR start "rule__DataModel__Group_2_2__3"
    // InternalTextualDataModel.g:1167:1: rule__DataModel__Group_2_2__3 : rule__DataModel__Group_2_2__3__Impl ;
    public final void rule__DataModel__Group_2_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1171:1: ( rule__DataModel__Group_2_2__3__Impl )
            // InternalTextualDataModel.g:1172:2: rule__DataModel__Group_2_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__Group_2_2__3__Impl();

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
    // $ANTLR end "rule__DataModel__Group_2_2__3"


    // $ANTLR start "rule__DataModel__Group_2_2__3__Impl"
    // InternalTextualDataModel.g:1178:1: rule__DataModel__Group_2_2__3__Impl : ( ')' ) ;
    public final void rule__DataModel__Group_2_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1182:1: ( ( ')' ) )
            // InternalTextualDataModel.g:1183:1: ( ')' )
            {
            // InternalTextualDataModel.g:1183:1: ( ')' )
            // InternalTextualDataModel.g:1184:2: ')'
            {
             before(grammarAccess.getDataModelAccess().getRightParenthesisKeyword_2_2_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getRightParenthesisKeyword_2_2_3()); 

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
    // $ANTLR end "rule__DataModel__Group_2_2__3__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalTextualDataModel.g:1194:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1198:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalTextualDataModel.g:1199:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalTextualDataModel.g:1206:1: rule__Entity__Group__0__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1210:1: ( ( 'Entity' ) )
            // InternalTextualDataModel.g:1211:1: ( 'Entity' )
            {
            // InternalTextualDataModel.g:1211:1: ( 'Entity' )
            // InternalTextualDataModel.g:1212:2: 'Entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalTextualDataModel.g:1221:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1225:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalTextualDataModel.g:1226:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalTextualDataModel.g:1233:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1237:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalTextualDataModel.g:1238:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalTextualDataModel.g:1238:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalTextualDataModel.g:1239:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalTextualDataModel.g:1240:2: ( rule__Entity__NameAssignment_1 )
            // InternalTextualDataModel.g:1240:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalTextualDataModel.g:1248:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1252:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalTextualDataModel.g:1253:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalTextualDataModel.g:1260:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1264:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalTextualDataModel.g:1265:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalTextualDataModel.g:1265:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalTextualDataModel.g:1266:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalTextualDataModel.g:1267:2: ( rule__Entity__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTextualDataModel.g:1267:3: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalTextualDataModel.g:1275:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1279:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalTextualDataModel.g:1280:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalTextualDataModel.g:1287:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Group_3__0 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1291:1: ( ( ( rule__Entity__Group_3__0 )? ) )
            // InternalTextualDataModel.g:1292:1: ( ( rule__Entity__Group_3__0 )? )
            {
            // InternalTextualDataModel.g:1292:1: ( ( rule__Entity__Group_3__0 )? )
            // InternalTextualDataModel.g:1293:2: ( rule__Entity__Group_3__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3()); 
            // InternalTextualDataModel.g:1294:2: ( rule__Entity__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTextualDataModel.g:1294:3: rule__Entity__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalTextualDataModel.g:1302:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1306:1: ( rule__Entity__Group__4__Impl )
            // InternalTextualDataModel.g:1307:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__4__Impl();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalTextualDataModel.g:1313:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__Group_4__0 )? ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1317:1: ( ( ( rule__Entity__Group_4__0 )? ) )
            // InternalTextualDataModel.g:1318:1: ( ( rule__Entity__Group_4__0 )? )
            {
            // InternalTextualDataModel.g:1318:1: ( ( rule__Entity__Group_4__0 )? )
            // InternalTextualDataModel.g:1319:2: ( rule__Entity__Group_4__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_4()); 
            // InternalTextualDataModel.g:1320:2: ( rule__Entity__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTextualDataModel.g:1320:3: rule__Entity__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // InternalTextualDataModel.g:1329:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1333:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalTextualDataModel.g:1334:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_15);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1();

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
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // InternalTextualDataModel.g:1341:1: rule__Entity__Group_2__0__Impl : ( '[' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1345:1: ( ( '[' ) )
            // InternalTextualDataModel.g:1346:1: ( '[' )
            {
            // InternalTextualDataModel.g:1346:1: ( '[' )
            // InternalTextualDataModel.g:1347:2: '['
            {
             before(grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_2_0()); 

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
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // InternalTextualDataModel.g:1356:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1360:1: ( rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 )
            // InternalTextualDataModel.g:1361:2: rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2
            {
            pushFollow(FOLLOW_16);
            rule__Entity__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__2();

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
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // InternalTextualDataModel.g:1368:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__KindAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1372:1: ( ( ( rule__Entity__KindAssignment_2_1 ) ) )
            // InternalTextualDataModel.g:1373:1: ( ( rule__Entity__KindAssignment_2_1 ) )
            {
            // InternalTextualDataModel.g:1373:1: ( ( rule__Entity__KindAssignment_2_1 ) )
            // InternalTextualDataModel.g:1374:2: ( rule__Entity__KindAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getKindAssignment_2_1()); 
            // InternalTextualDataModel.g:1375:2: ( rule__Entity__KindAssignment_2_1 )
            // InternalTextualDataModel.g:1375:3: rule__Entity__KindAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__KindAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getKindAssignment_2_1()); 

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
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__Entity__Group_2__2"
    // InternalTextualDataModel.g:1383:1: rule__Entity__Group_2__2 : rule__Entity__Group_2__2__Impl ;
    public final void rule__Entity__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1387:1: ( rule__Entity__Group_2__2__Impl )
            // InternalTextualDataModel.g:1388:2: rule__Entity__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__2__Impl();

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
    // $ANTLR end "rule__Entity__Group_2__2"


    // $ANTLR start "rule__Entity__Group_2__2__Impl"
    // InternalTextualDataModel.g:1394:1: rule__Entity__Group_2__2__Impl : ( ']' ) ;
    public final void rule__Entity__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1398:1: ( ( ']' ) )
            // InternalTextualDataModel.g:1399:1: ( ']' )
            {
            // InternalTextualDataModel.g:1399:1: ( ']' )
            // InternalTextualDataModel.g:1400:2: ']'
            {
             before(grammarAccess.getEntityAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightSquareBracketKeyword_2_2()); 

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
    // $ANTLR end "rule__Entity__Group_2__2__Impl"


    // $ANTLR start "rule__Entity__Group_3__0"
    // InternalTextualDataModel.g:1410:1: rule__Entity__Group_3__0 : rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 ;
    public final void rule__Entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1414:1: ( rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 )
            // InternalTextualDataModel.g:1415:2: rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_3__1();

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
    // $ANTLR end "rule__Entity__Group_3__0"


    // $ANTLR start "rule__Entity__Group_3__0__Impl"
    // InternalTextualDataModel.g:1422:1: rule__Entity__Group_3__0__Impl : ( '::' ) ;
    public final void rule__Entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1426:1: ( ( '::' ) )
            // InternalTextualDataModel.g:1427:1: ( '::' )
            {
            // InternalTextualDataModel.g:1427:1: ( '::' )
            // InternalTextualDataModel.g:1428:2: '::'
            {
             before(grammarAccess.getEntityAccess().getColonColonKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getColonColonKeyword_3_0()); 

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
    // $ANTLR end "rule__Entity__Group_3__0__Impl"


    // $ANTLR start "rule__Entity__Group_3__1"
    // InternalTextualDataModel.g:1437:1: rule__Entity__Group_3__1 : rule__Entity__Group_3__1__Impl ;
    public final void rule__Entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1441:1: ( rule__Entity__Group_3__1__Impl )
            // InternalTextualDataModel.g:1442:2: rule__Entity__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_3__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_3__1"


    // $ANTLR start "rule__Entity__Group_3__1__Impl"
    // InternalTextualDataModel.g:1448:1: rule__Entity__Group_3__1__Impl : ( ( ( rule__Entity__GeneralsAssignment_3_1 ) ) ( ( rule__Entity__GeneralsAssignment_3_1 )* ) ) ;
    public final void rule__Entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1452:1: ( ( ( ( rule__Entity__GeneralsAssignment_3_1 ) ) ( ( rule__Entity__GeneralsAssignment_3_1 )* ) ) )
            // InternalTextualDataModel.g:1453:1: ( ( ( rule__Entity__GeneralsAssignment_3_1 ) ) ( ( rule__Entity__GeneralsAssignment_3_1 )* ) )
            {
            // InternalTextualDataModel.g:1453:1: ( ( ( rule__Entity__GeneralsAssignment_3_1 ) ) ( ( rule__Entity__GeneralsAssignment_3_1 )* ) )
            // InternalTextualDataModel.g:1454:2: ( ( rule__Entity__GeneralsAssignment_3_1 ) ) ( ( rule__Entity__GeneralsAssignment_3_1 )* )
            {
            // InternalTextualDataModel.g:1454:2: ( ( rule__Entity__GeneralsAssignment_3_1 ) )
            // InternalTextualDataModel.g:1455:3: ( rule__Entity__GeneralsAssignment_3_1 )
            {
             before(grammarAccess.getEntityAccess().getGeneralsAssignment_3_1()); 
            // InternalTextualDataModel.g:1456:3: ( rule__Entity__GeneralsAssignment_3_1 )
            // InternalTextualDataModel.g:1456:4: rule__Entity__GeneralsAssignment_3_1
            {
            pushFollow(FOLLOW_17);
            rule__Entity__GeneralsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGeneralsAssignment_3_1()); 

            }

            // InternalTextualDataModel.g:1459:2: ( ( rule__Entity__GeneralsAssignment_3_1 )* )
            // InternalTextualDataModel.g:1460:3: ( rule__Entity__GeneralsAssignment_3_1 )*
            {
             before(grammarAccess.getEntityAccess().getGeneralsAssignment_3_1()); 
            // InternalTextualDataModel.g:1461:3: ( rule__Entity__GeneralsAssignment_3_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_STRING) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTextualDataModel.g:1461:4: rule__Entity__GeneralsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Entity__GeneralsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getGeneralsAssignment_3_1()); 

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
    // $ANTLR end "rule__Entity__Group_3__1__Impl"


    // $ANTLR start "rule__Entity__Group_4__0"
    // InternalTextualDataModel.g:1471:1: rule__Entity__Group_4__0 : rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1 ;
    public final void rule__Entity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1475:1: ( rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1 )
            // InternalTextualDataModel.g:1476:2: rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1
            {
            pushFollow(FOLLOW_18);
            rule__Entity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_4__1();

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
    // $ANTLR end "rule__Entity__Group_4__0"


    // $ANTLR start "rule__Entity__Group_4__0__Impl"
    // InternalTextualDataModel.g:1483:1: rule__Entity__Group_4__0__Impl : ( '{' ) ;
    public final void rule__Entity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1487:1: ( ( '{' ) )
            // InternalTextualDataModel.g:1488:1: ( '{' )
            {
            // InternalTextualDataModel.g:1488:1: ( '{' )
            // InternalTextualDataModel.g:1489:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4_0()); 

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
    // $ANTLR end "rule__Entity__Group_4__0__Impl"


    // $ANTLR start "rule__Entity__Group_4__1"
    // InternalTextualDataModel.g:1498:1: rule__Entity__Group_4__1 : rule__Entity__Group_4__1__Impl rule__Entity__Group_4__2 ;
    public final void rule__Entity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1502:1: ( rule__Entity__Group_4__1__Impl rule__Entity__Group_4__2 )
            // InternalTextualDataModel.g:1503:2: rule__Entity__Group_4__1__Impl rule__Entity__Group_4__2
            {
            pushFollow(FOLLOW_18);
            rule__Entity__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_4__2();

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
    // $ANTLR end "rule__Entity__Group_4__1"


    // $ANTLR start "rule__Entity__Group_4__1__Impl"
    // InternalTextualDataModel.g:1510:1: rule__Entity__Group_4__1__Impl : ( ( rule__Entity__Group_4_1__0 )? ) ;
    public final void rule__Entity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1514:1: ( ( ( rule__Entity__Group_4_1__0 )? ) )
            // InternalTextualDataModel.g:1515:1: ( ( rule__Entity__Group_4_1__0 )? )
            {
            // InternalTextualDataModel.g:1515:1: ( ( rule__Entity__Group_4_1__0 )? )
            // InternalTextualDataModel.g:1516:2: ( rule__Entity__Group_4_1__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_4_1()); 
            // InternalTextualDataModel.g:1517:2: ( rule__Entity__Group_4_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTextualDataModel.g:1517:3: rule__Entity__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_4_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_4_1()); 

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
    // $ANTLR end "rule__Entity__Group_4__1__Impl"


    // $ANTLR start "rule__Entity__Group_4__2"
    // InternalTextualDataModel.g:1525:1: rule__Entity__Group_4__2 : rule__Entity__Group_4__2__Impl rule__Entity__Group_4__3 ;
    public final void rule__Entity__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1529:1: ( rule__Entity__Group_4__2__Impl rule__Entity__Group_4__3 )
            // InternalTextualDataModel.g:1530:2: rule__Entity__Group_4__2__Impl rule__Entity__Group_4__3
            {
            pushFollow(FOLLOW_18);
            rule__Entity__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_4__3();

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
    // $ANTLR end "rule__Entity__Group_4__2"


    // $ANTLR start "rule__Entity__Group_4__2__Impl"
    // InternalTextualDataModel.g:1537:1: rule__Entity__Group_4__2__Impl : ( ( rule__Entity__LocalizationsAssignment_4_2 )* ) ;
    public final void rule__Entity__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1541:1: ( ( ( rule__Entity__LocalizationsAssignment_4_2 )* ) )
            // InternalTextualDataModel.g:1542:1: ( ( rule__Entity__LocalizationsAssignment_4_2 )* )
            {
            // InternalTextualDataModel.g:1542:1: ( ( rule__Entity__LocalizationsAssignment_4_2 )* )
            // InternalTextualDataModel.g:1543:2: ( rule__Entity__LocalizationsAssignment_4_2 )*
            {
             before(grammarAccess.getEntityAccess().getLocalizationsAssignment_4_2()); 
            // InternalTextualDataModel.g:1544:2: ( rule__Entity__LocalizationsAssignment_4_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==53) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalTextualDataModel.g:1544:3: rule__Entity__LocalizationsAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Entity__LocalizationsAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getLocalizationsAssignment_4_2()); 

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
    // $ANTLR end "rule__Entity__Group_4__2__Impl"


    // $ANTLR start "rule__Entity__Group_4__3"
    // InternalTextualDataModel.g:1552:1: rule__Entity__Group_4__3 : rule__Entity__Group_4__3__Impl rule__Entity__Group_4__4 ;
    public final void rule__Entity__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1556:1: ( rule__Entity__Group_4__3__Impl rule__Entity__Group_4__4 )
            // InternalTextualDataModel.g:1557:2: rule__Entity__Group_4__3__Impl rule__Entity__Group_4__4
            {
            pushFollow(FOLLOW_18);
            rule__Entity__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_4__4();

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
    // $ANTLR end "rule__Entity__Group_4__3"


    // $ANTLR start "rule__Entity__Group_4__3__Impl"
    // InternalTextualDataModel.g:1564:1: rule__Entity__Group_4__3__Impl : ( ( rule__Entity__AttributesAssignment_4_3 )* ) ;
    public final void rule__Entity__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1568:1: ( ( ( rule__Entity__AttributesAssignment_4_3 )* ) )
            // InternalTextualDataModel.g:1569:1: ( ( rule__Entity__AttributesAssignment_4_3 )* )
            {
            // InternalTextualDataModel.g:1569:1: ( ( rule__Entity__AttributesAssignment_4_3 )* )
            // InternalTextualDataModel.g:1570:2: ( rule__Entity__AttributesAssignment_4_3 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_4_3()); 
            // InternalTextualDataModel.g:1571:2: ( rule__Entity__AttributesAssignment_4_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_STRING) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalTextualDataModel.g:1571:3: rule__Entity__AttributesAssignment_4_3
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Entity__AttributesAssignment_4_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttributesAssignment_4_3()); 

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
    // $ANTLR end "rule__Entity__Group_4__3__Impl"


    // $ANTLR start "rule__Entity__Group_4__4"
    // InternalTextualDataModel.g:1579:1: rule__Entity__Group_4__4 : rule__Entity__Group_4__4__Impl ;
    public final void rule__Entity__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1583:1: ( rule__Entity__Group_4__4__Impl )
            // InternalTextualDataModel.g:1584:2: rule__Entity__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_4__4__Impl();

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
    // $ANTLR end "rule__Entity__Group_4__4"


    // $ANTLR start "rule__Entity__Group_4__4__Impl"
    // InternalTextualDataModel.g:1590:1: rule__Entity__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1594:1: ( ( '}' ) )
            // InternalTextualDataModel.g:1595:1: ( '}' )
            {
            // InternalTextualDataModel.g:1595:1: ( '}' )
            // InternalTextualDataModel.g:1596:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__Entity__Group_4__4__Impl"


    // $ANTLR start "rule__Entity__Group_4_1__0"
    // InternalTextualDataModel.g:1606:1: rule__Entity__Group_4_1__0 : rule__Entity__Group_4_1__0__Impl rule__Entity__Group_4_1__1 ;
    public final void rule__Entity__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1610:1: ( rule__Entity__Group_4_1__0__Impl rule__Entity__Group_4_1__1 )
            // InternalTextualDataModel.g:1611:2: rule__Entity__Group_4_1__0__Impl rule__Entity__Group_4_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Entity__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_4_1__1();

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
    // $ANTLR end "rule__Entity__Group_4_1__0"


    // $ANTLR start "rule__Entity__Group_4_1__0__Impl"
    // InternalTextualDataModel.g:1618:1: rule__Entity__Group_4_1__0__Impl : ( '@description' ) ;
    public final void rule__Entity__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1622:1: ( ( '@description' ) )
            // InternalTextualDataModel.g:1623:1: ( '@description' )
            {
            // InternalTextualDataModel.g:1623:1: ( '@description' )
            // InternalTextualDataModel.g:1624:2: '@description'
            {
             before(grammarAccess.getEntityAccess().getDescriptionKeyword_4_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getDescriptionKeyword_4_1_0()); 

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
    // $ANTLR end "rule__Entity__Group_4_1__0__Impl"


    // $ANTLR start "rule__Entity__Group_4_1__1"
    // InternalTextualDataModel.g:1633:1: rule__Entity__Group_4_1__1 : rule__Entity__Group_4_1__1__Impl rule__Entity__Group_4_1__2 ;
    public final void rule__Entity__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1637:1: ( rule__Entity__Group_4_1__1__Impl rule__Entity__Group_4_1__2 )
            // InternalTextualDataModel.g:1638:2: rule__Entity__Group_4_1__1__Impl rule__Entity__Group_4_1__2
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group_4_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_4_1__2();

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
    // $ANTLR end "rule__Entity__Group_4_1__1"


    // $ANTLR start "rule__Entity__Group_4_1__1__Impl"
    // InternalTextualDataModel.g:1645:1: rule__Entity__Group_4_1__1__Impl : ( '(' ) ;
    public final void rule__Entity__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1649:1: ( ( '(' ) )
            // InternalTextualDataModel.g:1650:1: ( '(' )
            {
            // InternalTextualDataModel.g:1650:1: ( '(' )
            // InternalTextualDataModel.g:1651:2: '('
            {
             before(grammarAccess.getEntityAccess().getLeftParenthesisKeyword_4_1_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftParenthesisKeyword_4_1_1()); 

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
    // $ANTLR end "rule__Entity__Group_4_1__1__Impl"


    // $ANTLR start "rule__Entity__Group_4_1__2"
    // InternalTextualDataModel.g:1660:1: rule__Entity__Group_4_1__2 : rule__Entity__Group_4_1__2__Impl rule__Entity__Group_4_1__3 ;
    public final void rule__Entity__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1664:1: ( rule__Entity__Group_4_1__2__Impl rule__Entity__Group_4_1__3 )
            // InternalTextualDataModel.g:1665:2: rule__Entity__Group_4_1__2__Impl rule__Entity__Group_4_1__3
            {
            pushFollow(FOLLOW_11);
            rule__Entity__Group_4_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_4_1__3();

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
    // $ANTLR end "rule__Entity__Group_4_1__2"


    // $ANTLR start "rule__Entity__Group_4_1__2__Impl"
    // InternalTextualDataModel.g:1672:1: rule__Entity__Group_4_1__2__Impl : ( ( rule__Entity__DescriptionAssignment_4_1_2 ) ) ;
    public final void rule__Entity__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1676:1: ( ( ( rule__Entity__DescriptionAssignment_4_1_2 ) ) )
            // InternalTextualDataModel.g:1677:1: ( ( rule__Entity__DescriptionAssignment_4_1_2 ) )
            {
            // InternalTextualDataModel.g:1677:1: ( ( rule__Entity__DescriptionAssignment_4_1_2 ) )
            // InternalTextualDataModel.g:1678:2: ( rule__Entity__DescriptionAssignment_4_1_2 )
            {
             before(grammarAccess.getEntityAccess().getDescriptionAssignment_4_1_2()); 
            // InternalTextualDataModel.g:1679:2: ( rule__Entity__DescriptionAssignment_4_1_2 )
            // InternalTextualDataModel.g:1679:3: rule__Entity__DescriptionAssignment_4_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Entity__DescriptionAssignment_4_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getDescriptionAssignment_4_1_2()); 

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
    // $ANTLR end "rule__Entity__Group_4_1__2__Impl"


    // $ANTLR start "rule__Entity__Group_4_1__3"
    // InternalTextualDataModel.g:1687:1: rule__Entity__Group_4_1__3 : rule__Entity__Group_4_1__3__Impl ;
    public final void rule__Entity__Group_4_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1691:1: ( rule__Entity__Group_4_1__3__Impl )
            // InternalTextualDataModel.g:1692:2: rule__Entity__Group_4_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_4_1__3__Impl();

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
    // $ANTLR end "rule__Entity__Group_4_1__3"


    // $ANTLR start "rule__Entity__Group_4_1__3__Impl"
    // InternalTextualDataModel.g:1698:1: rule__Entity__Group_4_1__3__Impl : ( ')' ) ;
    public final void rule__Entity__Group_4_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1702:1: ( ( ')' ) )
            // InternalTextualDataModel.g:1703:1: ( ')' )
            {
            // InternalTextualDataModel.g:1703:1: ( ')' )
            // InternalTextualDataModel.g:1704:2: ')'
            {
             before(grammarAccess.getEntityAccess().getRightParenthesisKeyword_4_1_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightParenthesisKeyword_4_1_3()); 

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
    // $ANTLR end "rule__Entity__Group_4_1__3__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalTextualDataModel.g:1714:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1718:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalTextualDataModel.g:1719:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalTextualDataModel.g:1726:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1730:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalTextualDataModel.g:1731:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalTextualDataModel.g:1731:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalTextualDataModel.g:1732:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalTextualDataModel.g:1733:2: ( rule__Attribute__NameAssignment_0 )
            // InternalTextualDataModel.g:1733:3: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalTextualDataModel.g:1741:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1745:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalTextualDataModel.g:1746:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalTextualDataModel.g:1753:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__DataTypeAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1757:1: ( ( ( rule__Attribute__DataTypeAssignment_1 ) ) )
            // InternalTextualDataModel.g:1758:1: ( ( rule__Attribute__DataTypeAssignment_1 ) )
            {
            // InternalTextualDataModel.g:1758:1: ( ( rule__Attribute__DataTypeAssignment_1 ) )
            // InternalTextualDataModel.g:1759:2: ( rule__Attribute__DataTypeAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getDataTypeAssignment_1()); 
            // InternalTextualDataModel.g:1760:2: ( rule__Attribute__DataTypeAssignment_1 )
            // InternalTextualDataModel.g:1760:3: rule__Attribute__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__DataTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getDataTypeAssignment_1()); 

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
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalTextualDataModel.g:1768:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1772:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalTextualDataModel.g:1773:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalTextualDataModel.g:1780:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__LowerAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1784:1: ( ( ( rule__Attribute__LowerAssignment_2 ) ) )
            // InternalTextualDataModel.g:1785:1: ( ( rule__Attribute__LowerAssignment_2 ) )
            {
            // InternalTextualDataModel.g:1785:1: ( ( rule__Attribute__LowerAssignment_2 ) )
            // InternalTextualDataModel.g:1786:2: ( rule__Attribute__LowerAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getLowerAssignment_2()); 
            // InternalTextualDataModel.g:1787:2: ( rule__Attribute__LowerAssignment_2 )
            // InternalTextualDataModel.g:1787:3: rule__Attribute__LowerAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__LowerAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getLowerAssignment_2()); 

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
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalTextualDataModel.g:1795:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1799:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalTextualDataModel.g:1800:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__4();

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
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalTextualDataModel.g:1807:1: rule__Attribute__Group__3__Impl : ( '..' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1811:1: ( ( '..' ) )
            // InternalTextualDataModel.g:1812:1: ( '..' )
            {
            // InternalTextualDataModel.g:1812:1: ( '..' )
            // InternalTextualDataModel.g:1813:2: '..'
            {
             before(grammarAccess.getAttributeAccess().getFullStopFullStopKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getFullStopFullStopKeyword_3()); 

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
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // InternalTextualDataModel.g:1822:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1826:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalTextualDataModel.g:1827:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Attribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__5();

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
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // InternalTextualDataModel.g:1834:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__UpperAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1838:1: ( ( ( rule__Attribute__UpperAssignment_4 ) ) )
            // InternalTextualDataModel.g:1839:1: ( ( rule__Attribute__UpperAssignment_4 ) )
            {
            // InternalTextualDataModel.g:1839:1: ( ( rule__Attribute__UpperAssignment_4 ) )
            // InternalTextualDataModel.g:1840:2: ( rule__Attribute__UpperAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getUpperAssignment_4()); 
            // InternalTextualDataModel.g:1841:2: ( rule__Attribute__UpperAssignment_4 )
            // InternalTextualDataModel.g:1841:3: rule__Attribute__UpperAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__UpperAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getUpperAssignment_4()); 

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
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__5"
    // InternalTextualDataModel.g:1849:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1853:1: ( rule__Attribute__Group__5__Impl rule__Attribute__Group__6 )
            // InternalTextualDataModel.g:1854:2: rule__Attribute__Group__5__Impl rule__Attribute__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__Attribute__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__6();

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
    // $ANTLR end "rule__Attribute__Group__5"


    // $ANTLR start "rule__Attribute__Group__5__Impl"
    // InternalTextualDataModel.g:1861:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__IdentityAssignment_5 )? ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1865:1: ( ( ( rule__Attribute__IdentityAssignment_5 )? ) )
            // InternalTextualDataModel.g:1866:1: ( ( rule__Attribute__IdentityAssignment_5 )? )
            {
            // InternalTextualDataModel.g:1866:1: ( ( rule__Attribute__IdentityAssignment_5 )? )
            // InternalTextualDataModel.g:1867:2: ( rule__Attribute__IdentityAssignment_5 )?
            {
             before(grammarAccess.getAttributeAccess().getIdentityAssignment_5()); 
            // InternalTextualDataModel.g:1868:2: ( rule__Attribute__IdentityAssignment_5 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==56) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTextualDataModel.g:1868:3: rule__Attribute__IdentityAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__IdentityAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getIdentityAssignment_5()); 

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
    // $ANTLR end "rule__Attribute__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group__6"
    // InternalTextualDataModel.g:1876:1: rule__Attribute__Group__6 : rule__Attribute__Group__6__Impl rule__Attribute__Group__7 ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1880:1: ( rule__Attribute__Group__6__Impl rule__Attribute__Group__7 )
            // InternalTextualDataModel.g:1881:2: rule__Attribute__Group__6__Impl rule__Attribute__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__Attribute__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__7();

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
    // $ANTLR end "rule__Attribute__Group__6"


    // $ANTLR start "rule__Attribute__Group__6__Impl"
    // InternalTextualDataModel.g:1888:1: rule__Attribute__Group__6__Impl : ( ( rule__Attribute__Group_6__0 )? ) ;
    public final void rule__Attribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1892:1: ( ( ( rule__Attribute__Group_6__0 )? ) )
            // InternalTextualDataModel.g:1893:1: ( ( rule__Attribute__Group_6__0 )? )
            {
            // InternalTextualDataModel.g:1893:1: ( ( rule__Attribute__Group_6__0 )? )
            // InternalTextualDataModel.g:1894:2: ( rule__Attribute__Group_6__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_6()); 
            // InternalTextualDataModel.g:1895:2: ( rule__Attribute__Group_6__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTextualDataModel.g:1895:3: rule__Attribute__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Attribute__Group__6__Impl"


    // $ANTLR start "rule__Attribute__Group__7"
    // InternalTextualDataModel.g:1903:1: rule__Attribute__Group__7 : rule__Attribute__Group__7__Impl ;
    public final void rule__Attribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1907:1: ( rule__Attribute__Group__7__Impl )
            // InternalTextualDataModel.g:1908:2: rule__Attribute__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__7__Impl();

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
    // $ANTLR end "rule__Attribute__Group__7"


    // $ANTLR start "rule__Attribute__Group__7__Impl"
    // InternalTextualDataModel.g:1914:1: rule__Attribute__Group__7__Impl : ( ( rule__Attribute__Group_7__0 )? ) ;
    public final void rule__Attribute__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1918:1: ( ( ( rule__Attribute__Group_7__0 )? ) )
            // InternalTextualDataModel.g:1919:1: ( ( rule__Attribute__Group_7__0 )? )
            {
            // InternalTextualDataModel.g:1919:1: ( ( rule__Attribute__Group_7__0 )? )
            // InternalTextualDataModel.g:1920:2: ( rule__Attribute__Group_7__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_7()); 
            // InternalTextualDataModel.g:1921:2: ( rule__Attribute__Group_7__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==22) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTextualDataModel.g:1921:3: rule__Attribute__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Attribute__Group__7__Impl"


    // $ANTLR start "rule__Attribute__Group_6__0"
    // InternalTextualDataModel.g:1930:1: rule__Attribute__Group_6__0 : rule__Attribute__Group_6__0__Impl rule__Attribute__Group_6__1 ;
    public final void rule__Attribute__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1934:1: ( rule__Attribute__Group_6__0__Impl rule__Attribute__Group_6__1 )
            // InternalTextualDataModel.g:1935:2: rule__Attribute__Group_6__0__Impl rule__Attribute__Group_6__1
            {
            pushFollow(FOLLOW_10);
            rule__Attribute__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_6__1();

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
    // $ANTLR end "rule__Attribute__Group_6__0"


    // $ANTLR start "rule__Attribute__Group_6__0__Impl"
    // InternalTextualDataModel.g:1942:1: rule__Attribute__Group_6__0__Impl : ( 'defaultValue' ) ;
    public final void rule__Attribute__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1946:1: ( ( 'defaultValue' ) )
            // InternalTextualDataModel.g:1947:1: ( 'defaultValue' )
            {
            // InternalTextualDataModel.g:1947:1: ( 'defaultValue' )
            // InternalTextualDataModel.g:1948:2: 'defaultValue'
            {
             before(grammarAccess.getAttributeAccess().getDefaultValueKeyword_6_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getDefaultValueKeyword_6_0()); 

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
    // $ANTLR end "rule__Attribute__Group_6__0__Impl"


    // $ANTLR start "rule__Attribute__Group_6__1"
    // InternalTextualDataModel.g:1957:1: rule__Attribute__Group_6__1 : rule__Attribute__Group_6__1__Impl rule__Attribute__Group_6__2 ;
    public final void rule__Attribute__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1961:1: ( rule__Attribute__Group_6__1__Impl rule__Attribute__Group_6__2 )
            // InternalTextualDataModel.g:1962:2: rule__Attribute__Group_6__1__Impl rule__Attribute__Group_6__2
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_6__2();

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
    // $ANTLR end "rule__Attribute__Group_6__1"


    // $ANTLR start "rule__Attribute__Group_6__1__Impl"
    // InternalTextualDataModel.g:1969:1: rule__Attribute__Group_6__1__Impl : ( '(' ) ;
    public final void rule__Attribute__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1973:1: ( ( '(' ) )
            // InternalTextualDataModel.g:1974:1: ( '(' )
            {
            // InternalTextualDataModel.g:1974:1: ( '(' )
            // InternalTextualDataModel.g:1975:2: '('
            {
             before(grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_6_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_6_1()); 

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
    // $ANTLR end "rule__Attribute__Group_6__1__Impl"


    // $ANTLR start "rule__Attribute__Group_6__2"
    // InternalTextualDataModel.g:1984:1: rule__Attribute__Group_6__2 : rule__Attribute__Group_6__2__Impl rule__Attribute__Group_6__3 ;
    public final void rule__Attribute__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:1988:1: ( rule__Attribute__Group_6__2__Impl rule__Attribute__Group_6__3 )
            // InternalTextualDataModel.g:1989:2: rule__Attribute__Group_6__2__Impl rule__Attribute__Group_6__3
            {
            pushFollow(FOLLOW_11);
            rule__Attribute__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_6__3();

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
    // $ANTLR end "rule__Attribute__Group_6__2"


    // $ANTLR start "rule__Attribute__Group_6__2__Impl"
    // InternalTextualDataModel.g:1996:1: rule__Attribute__Group_6__2__Impl : ( ( rule__Attribute__DefaultValueAssignment_6_2 ) ) ;
    public final void rule__Attribute__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2000:1: ( ( ( rule__Attribute__DefaultValueAssignment_6_2 ) ) )
            // InternalTextualDataModel.g:2001:1: ( ( rule__Attribute__DefaultValueAssignment_6_2 ) )
            {
            // InternalTextualDataModel.g:2001:1: ( ( rule__Attribute__DefaultValueAssignment_6_2 ) )
            // InternalTextualDataModel.g:2002:2: ( rule__Attribute__DefaultValueAssignment_6_2 )
            {
             before(grammarAccess.getAttributeAccess().getDefaultValueAssignment_6_2()); 
            // InternalTextualDataModel.g:2003:2: ( rule__Attribute__DefaultValueAssignment_6_2 )
            // InternalTextualDataModel.g:2003:3: rule__Attribute__DefaultValueAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__DefaultValueAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getDefaultValueAssignment_6_2()); 

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
    // $ANTLR end "rule__Attribute__Group_6__2__Impl"


    // $ANTLR start "rule__Attribute__Group_6__3"
    // InternalTextualDataModel.g:2011:1: rule__Attribute__Group_6__3 : rule__Attribute__Group_6__3__Impl ;
    public final void rule__Attribute__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2015:1: ( rule__Attribute__Group_6__3__Impl )
            // InternalTextualDataModel.g:2016:2: rule__Attribute__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_6__3__Impl();

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
    // $ANTLR end "rule__Attribute__Group_6__3"


    // $ANTLR start "rule__Attribute__Group_6__3__Impl"
    // InternalTextualDataModel.g:2022:1: rule__Attribute__Group_6__3__Impl : ( ')' ) ;
    public final void rule__Attribute__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2026:1: ( ( ')' ) )
            // InternalTextualDataModel.g:2027:1: ( ')' )
            {
            // InternalTextualDataModel.g:2027:1: ( ')' )
            // InternalTextualDataModel.g:2028:2: ')'
            {
             before(grammarAccess.getAttributeAccess().getRightParenthesisKeyword_6_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getRightParenthesisKeyword_6_3()); 

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
    // $ANTLR end "rule__Attribute__Group_6__3__Impl"


    // $ANTLR start "rule__Attribute__Group_7__0"
    // InternalTextualDataModel.g:2038:1: rule__Attribute__Group_7__0 : rule__Attribute__Group_7__0__Impl rule__Attribute__Group_7__1 ;
    public final void rule__Attribute__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2042:1: ( rule__Attribute__Group_7__0__Impl rule__Attribute__Group_7__1 )
            // InternalTextualDataModel.g:2043:2: rule__Attribute__Group_7__0__Impl rule__Attribute__Group_7__1
            {
            pushFollow(FOLLOW_23);
            rule__Attribute__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_7__1();

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
    // $ANTLR end "rule__Attribute__Group_7__0"


    // $ANTLR start "rule__Attribute__Group_7__0__Impl"
    // InternalTextualDataModel.g:2050:1: rule__Attribute__Group_7__0__Impl : ( '{' ) ;
    public final void rule__Attribute__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2054:1: ( ( '{' ) )
            // InternalTextualDataModel.g:2055:1: ( '{' )
            {
            // InternalTextualDataModel.g:2055:1: ( '{' )
            // InternalTextualDataModel.g:2056:2: '{'
            {
             before(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_7_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_7_0()); 

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
    // $ANTLR end "rule__Attribute__Group_7__0__Impl"


    // $ANTLR start "rule__Attribute__Group_7__1"
    // InternalTextualDataModel.g:2065:1: rule__Attribute__Group_7__1 : rule__Attribute__Group_7__1__Impl rule__Attribute__Group_7__2 ;
    public final void rule__Attribute__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2069:1: ( rule__Attribute__Group_7__1__Impl rule__Attribute__Group_7__2 )
            // InternalTextualDataModel.g:2070:2: rule__Attribute__Group_7__1__Impl rule__Attribute__Group_7__2
            {
            pushFollow(FOLLOW_23);
            rule__Attribute__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_7__2();

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
    // $ANTLR end "rule__Attribute__Group_7__1"


    // $ANTLR start "rule__Attribute__Group_7__1__Impl"
    // InternalTextualDataModel.g:2077:1: rule__Attribute__Group_7__1__Impl : ( ( rule__Attribute__Group_7_1__0 )? ) ;
    public final void rule__Attribute__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2081:1: ( ( ( rule__Attribute__Group_7_1__0 )? ) )
            // InternalTextualDataModel.g:2082:1: ( ( rule__Attribute__Group_7_1__0 )? )
            {
            // InternalTextualDataModel.g:2082:1: ( ( rule__Attribute__Group_7_1__0 )? )
            // InternalTextualDataModel.g:2083:2: ( rule__Attribute__Group_7_1__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_7_1()); 
            // InternalTextualDataModel.g:2084:2: ( rule__Attribute__Group_7_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==24) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalTextualDataModel.g:2084:3: rule__Attribute__Group_7_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_7_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_7_1()); 

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
    // $ANTLR end "rule__Attribute__Group_7__1__Impl"


    // $ANTLR start "rule__Attribute__Group_7__2"
    // InternalTextualDataModel.g:2092:1: rule__Attribute__Group_7__2 : rule__Attribute__Group_7__2__Impl rule__Attribute__Group_7__3 ;
    public final void rule__Attribute__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2096:1: ( rule__Attribute__Group_7__2__Impl rule__Attribute__Group_7__3 )
            // InternalTextualDataModel.g:2097:2: rule__Attribute__Group_7__2__Impl rule__Attribute__Group_7__3
            {
            pushFollow(FOLLOW_23);
            rule__Attribute__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_7__3();

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
    // $ANTLR end "rule__Attribute__Group_7__2"


    // $ANTLR start "rule__Attribute__Group_7__2__Impl"
    // InternalTextualDataModel.g:2104:1: rule__Attribute__Group_7__2__Impl : ( ( rule__Attribute__LocalizationsAssignment_7_2 )* ) ;
    public final void rule__Attribute__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2108:1: ( ( ( rule__Attribute__LocalizationsAssignment_7_2 )* ) )
            // InternalTextualDataModel.g:2109:1: ( ( rule__Attribute__LocalizationsAssignment_7_2 )* )
            {
            // InternalTextualDataModel.g:2109:1: ( ( rule__Attribute__LocalizationsAssignment_7_2 )* )
            // InternalTextualDataModel.g:2110:2: ( rule__Attribute__LocalizationsAssignment_7_2 )*
            {
             before(grammarAccess.getAttributeAccess().getLocalizationsAssignment_7_2()); 
            // InternalTextualDataModel.g:2111:2: ( rule__Attribute__LocalizationsAssignment_7_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==53) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalTextualDataModel.g:2111:3: rule__Attribute__LocalizationsAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Attribute__LocalizationsAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getAttributeAccess().getLocalizationsAssignment_7_2()); 

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
    // $ANTLR end "rule__Attribute__Group_7__2__Impl"


    // $ANTLR start "rule__Attribute__Group_7__3"
    // InternalTextualDataModel.g:2119:1: rule__Attribute__Group_7__3 : rule__Attribute__Group_7__3__Impl ;
    public final void rule__Attribute__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2123:1: ( rule__Attribute__Group_7__3__Impl )
            // InternalTextualDataModel.g:2124:2: rule__Attribute__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_7__3__Impl();

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
    // $ANTLR end "rule__Attribute__Group_7__3"


    // $ANTLR start "rule__Attribute__Group_7__3__Impl"
    // InternalTextualDataModel.g:2130:1: rule__Attribute__Group_7__3__Impl : ( '}' ) ;
    public final void rule__Attribute__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2134:1: ( ( '}' ) )
            // InternalTextualDataModel.g:2135:1: ( '}' )
            {
            // InternalTextualDataModel.g:2135:1: ( '}' )
            // InternalTextualDataModel.g:2136:2: '}'
            {
             before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_7_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_7_3()); 

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
    // $ANTLR end "rule__Attribute__Group_7__3__Impl"


    // $ANTLR start "rule__Attribute__Group_7_1__0"
    // InternalTextualDataModel.g:2146:1: rule__Attribute__Group_7_1__0 : rule__Attribute__Group_7_1__0__Impl rule__Attribute__Group_7_1__1 ;
    public final void rule__Attribute__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2150:1: ( rule__Attribute__Group_7_1__0__Impl rule__Attribute__Group_7_1__1 )
            // InternalTextualDataModel.g:2151:2: rule__Attribute__Group_7_1__0__Impl rule__Attribute__Group_7_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Attribute__Group_7_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_7_1__1();

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
    // $ANTLR end "rule__Attribute__Group_7_1__0"


    // $ANTLR start "rule__Attribute__Group_7_1__0__Impl"
    // InternalTextualDataModel.g:2158:1: rule__Attribute__Group_7_1__0__Impl : ( '@description' ) ;
    public final void rule__Attribute__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2162:1: ( ( '@description' ) )
            // InternalTextualDataModel.g:2163:1: ( '@description' )
            {
            // InternalTextualDataModel.g:2163:1: ( '@description' )
            // InternalTextualDataModel.g:2164:2: '@description'
            {
             before(grammarAccess.getAttributeAccess().getDescriptionKeyword_7_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getDescriptionKeyword_7_1_0()); 

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
    // $ANTLR end "rule__Attribute__Group_7_1__0__Impl"


    // $ANTLR start "rule__Attribute__Group_7_1__1"
    // InternalTextualDataModel.g:2173:1: rule__Attribute__Group_7_1__1 : rule__Attribute__Group_7_1__1__Impl rule__Attribute__Group_7_1__2 ;
    public final void rule__Attribute__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2177:1: ( rule__Attribute__Group_7_1__1__Impl rule__Attribute__Group_7_1__2 )
            // InternalTextualDataModel.g:2178:2: rule__Attribute__Group_7_1__1__Impl rule__Attribute__Group_7_1__2
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group_7_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_7_1__2();

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
    // $ANTLR end "rule__Attribute__Group_7_1__1"


    // $ANTLR start "rule__Attribute__Group_7_1__1__Impl"
    // InternalTextualDataModel.g:2185:1: rule__Attribute__Group_7_1__1__Impl : ( '(' ) ;
    public final void rule__Attribute__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2189:1: ( ( '(' ) )
            // InternalTextualDataModel.g:2190:1: ( '(' )
            {
            // InternalTextualDataModel.g:2190:1: ( '(' )
            // InternalTextualDataModel.g:2191:2: '('
            {
             before(grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_7_1_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_7_1_1()); 

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
    // $ANTLR end "rule__Attribute__Group_7_1__1__Impl"


    // $ANTLR start "rule__Attribute__Group_7_1__2"
    // InternalTextualDataModel.g:2200:1: rule__Attribute__Group_7_1__2 : rule__Attribute__Group_7_1__2__Impl rule__Attribute__Group_7_1__3 ;
    public final void rule__Attribute__Group_7_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2204:1: ( rule__Attribute__Group_7_1__2__Impl rule__Attribute__Group_7_1__3 )
            // InternalTextualDataModel.g:2205:2: rule__Attribute__Group_7_1__2__Impl rule__Attribute__Group_7_1__3
            {
            pushFollow(FOLLOW_11);
            rule__Attribute__Group_7_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_7_1__3();

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
    // $ANTLR end "rule__Attribute__Group_7_1__2"


    // $ANTLR start "rule__Attribute__Group_7_1__2__Impl"
    // InternalTextualDataModel.g:2212:1: rule__Attribute__Group_7_1__2__Impl : ( ( rule__Attribute__DescriptionAssignment_7_1_2 ) ) ;
    public final void rule__Attribute__Group_7_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2216:1: ( ( ( rule__Attribute__DescriptionAssignment_7_1_2 ) ) )
            // InternalTextualDataModel.g:2217:1: ( ( rule__Attribute__DescriptionAssignment_7_1_2 ) )
            {
            // InternalTextualDataModel.g:2217:1: ( ( rule__Attribute__DescriptionAssignment_7_1_2 ) )
            // InternalTextualDataModel.g:2218:2: ( rule__Attribute__DescriptionAssignment_7_1_2 )
            {
             before(grammarAccess.getAttributeAccess().getDescriptionAssignment_7_1_2()); 
            // InternalTextualDataModel.g:2219:2: ( rule__Attribute__DescriptionAssignment_7_1_2 )
            // InternalTextualDataModel.g:2219:3: rule__Attribute__DescriptionAssignment_7_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__DescriptionAssignment_7_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getDescriptionAssignment_7_1_2()); 

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
    // $ANTLR end "rule__Attribute__Group_7_1__2__Impl"


    // $ANTLR start "rule__Attribute__Group_7_1__3"
    // InternalTextualDataModel.g:2227:1: rule__Attribute__Group_7_1__3 : rule__Attribute__Group_7_1__3__Impl ;
    public final void rule__Attribute__Group_7_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2231:1: ( rule__Attribute__Group_7_1__3__Impl )
            // InternalTextualDataModel.g:2232:2: rule__Attribute__Group_7_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_7_1__3__Impl();

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
    // $ANTLR end "rule__Attribute__Group_7_1__3"


    // $ANTLR start "rule__Attribute__Group_7_1__3__Impl"
    // InternalTextualDataModel.g:2238:1: rule__Attribute__Group_7_1__3__Impl : ( ')' ) ;
    public final void rule__Attribute__Group_7_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2242:1: ( ( ')' ) )
            // InternalTextualDataModel.g:2243:1: ( ')' )
            {
            // InternalTextualDataModel.g:2243:1: ( ')' )
            // InternalTextualDataModel.g:2244:2: ')'
            {
             before(grammarAccess.getAttributeAccess().getRightParenthesisKeyword_7_1_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getRightParenthesisKeyword_7_1_3()); 

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
    // $ANTLR end "rule__Attribute__Group_7_1__3__Impl"


    // $ANTLR start "rule__Relationship__Group__0"
    // InternalTextualDataModel.g:2254:1: rule__Relationship__Group__0 : rule__Relationship__Group__0__Impl rule__Relationship__Group__1 ;
    public final void rule__Relationship__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2258:1: ( rule__Relationship__Group__0__Impl rule__Relationship__Group__1 )
            // InternalTextualDataModel.g:2259:2: rule__Relationship__Group__0__Impl rule__Relationship__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Relationship__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group__1();

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
    // $ANTLR end "rule__Relationship__Group__0"


    // $ANTLR start "rule__Relationship__Group__0__Impl"
    // InternalTextualDataModel.g:2266:1: rule__Relationship__Group__0__Impl : ( () ) ;
    public final void rule__Relationship__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2270:1: ( ( () ) )
            // InternalTextualDataModel.g:2271:1: ( () )
            {
            // InternalTextualDataModel.g:2271:1: ( () )
            // InternalTextualDataModel.g:2272:2: ()
            {
             before(grammarAccess.getRelationshipAccess().getRelationshipAction_0()); 
            // InternalTextualDataModel.g:2273:2: ()
            // InternalTextualDataModel.g:2273:3: 
            {
            }

             after(grammarAccess.getRelationshipAccess().getRelationshipAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__0__Impl"


    // $ANTLR start "rule__Relationship__Group__1"
    // InternalTextualDataModel.g:2281:1: rule__Relationship__Group__1 : rule__Relationship__Group__1__Impl rule__Relationship__Group__2 ;
    public final void rule__Relationship__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2285:1: ( rule__Relationship__Group__1__Impl rule__Relationship__Group__2 )
            // InternalTextualDataModel.g:2286:2: rule__Relationship__Group__1__Impl rule__Relationship__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Relationship__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group__2();

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
    // $ANTLR end "rule__Relationship__Group__1"


    // $ANTLR start "rule__Relationship__Group__1__Impl"
    // InternalTextualDataModel.g:2293:1: rule__Relationship__Group__1__Impl : ( 'Relationship' ) ;
    public final void rule__Relationship__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2297:1: ( ( 'Relationship' ) )
            // InternalTextualDataModel.g:2298:1: ( 'Relationship' )
            {
            // InternalTextualDataModel.g:2298:1: ( 'Relationship' )
            // InternalTextualDataModel.g:2299:2: 'Relationship'
            {
             before(grammarAccess.getRelationshipAccess().getRelationshipKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getRelationshipKeyword_1()); 

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
    // $ANTLR end "rule__Relationship__Group__1__Impl"


    // $ANTLR start "rule__Relationship__Group__2"
    // InternalTextualDataModel.g:2308:1: rule__Relationship__Group__2 : rule__Relationship__Group__2__Impl rule__Relationship__Group__3 ;
    public final void rule__Relationship__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2312:1: ( rule__Relationship__Group__2__Impl rule__Relationship__Group__3 )
            // InternalTextualDataModel.g:2313:2: rule__Relationship__Group__2__Impl rule__Relationship__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Relationship__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group__3();

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
    // $ANTLR end "rule__Relationship__Group__2"


    // $ANTLR start "rule__Relationship__Group__2__Impl"
    // InternalTextualDataModel.g:2320:1: rule__Relationship__Group__2__Impl : ( ( rule__Relationship__NameAssignment_2 )? ) ;
    public final void rule__Relationship__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2324:1: ( ( ( rule__Relationship__NameAssignment_2 )? ) )
            // InternalTextualDataModel.g:2325:1: ( ( rule__Relationship__NameAssignment_2 )? )
            {
            // InternalTextualDataModel.g:2325:1: ( ( rule__Relationship__NameAssignment_2 )? )
            // InternalTextualDataModel.g:2326:2: ( rule__Relationship__NameAssignment_2 )?
            {
             before(grammarAccess.getRelationshipAccess().getNameAssignment_2()); 
            // InternalTextualDataModel.g:2327:2: ( rule__Relationship__NameAssignment_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTextualDataModel.g:2327:3: rule__Relationship__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relationship__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationshipAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Relationship__Group__2__Impl"


    // $ANTLR start "rule__Relationship__Group__3"
    // InternalTextualDataModel.g:2335:1: rule__Relationship__Group__3 : rule__Relationship__Group__3__Impl rule__Relationship__Group__4 ;
    public final void rule__Relationship__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2339:1: ( rule__Relationship__Group__3__Impl rule__Relationship__Group__4 )
            // InternalTextualDataModel.g:2340:2: rule__Relationship__Group__3__Impl rule__Relationship__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Relationship__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group__4();

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
    // $ANTLR end "rule__Relationship__Group__3"


    // $ANTLR start "rule__Relationship__Group__3__Impl"
    // InternalTextualDataModel.g:2347:1: rule__Relationship__Group__3__Impl : ( ( rule__Relationship__Group_3__0 )? ) ;
    public final void rule__Relationship__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2351:1: ( ( ( rule__Relationship__Group_3__0 )? ) )
            // InternalTextualDataModel.g:2352:1: ( ( rule__Relationship__Group_3__0 )? )
            {
            // InternalTextualDataModel.g:2352:1: ( ( rule__Relationship__Group_3__0 )? )
            // InternalTextualDataModel.g:2353:2: ( rule__Relationship__Group_3__0 )?
            {
             before(grammarAccess.getRelationshipAccess().getGroup_3()); 
            // InternalTextualDataModel.g:2354:2: ( rule__Relationship__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==29) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalTextualDataModel.g:2354:3: rule__Relationship__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relationship__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationshipAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Relationship__Group__3__Impl"


    // $ANTLR start "rule__Relationship__Group__4"
    // InternalTextualDataModel.g:2362:1: rule__Relationship__Group__4 : rule__Relationship__Group__4__Impl ;
    public final void rule__Relationship__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2366:1: ( rule__Relationship__Group__4__Impl )
            // InternalTextualDataModel.g:2367:2: rule__Relationship__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Group__4__Impl();

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
    // $ANTLR end "rule__Relationship__Group__4"


    // $ANTLR start "rule__Relationship__Group__4__Impl"
    // InternalTextualDataModel.g:2373:1: rule__Relationship__Group__4__Impl : ( ( rule__Relationship__Group_4__0 )? ) ;
    public final void rule__Relationship__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2377:1: ( ( ( rule__Relationship__Group_4__0 )? ) )
            // InternalTextualDataModel.g:2378:1: ( ( rule__Relationship__Group_4__0 )? )
            {
            // InternalTextualDataModel.g:2378:1: ( ( rule__Relationship__Group_4__0 )? )
            // InternalTextualDataModel.g:2379:2: ( rule__Relationship__Group_4__0 )?
            {
             before(grammarAccess.getRelationshipAccess().getGroup_4()); 
            // InternalTextualDataModel.g:2380:2: ( rule__Relationship__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==22) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalTextualDataModel.g:2380:3: rule__Relationship__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relationship__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationshipAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Relationship__Group__4__Impl"


    // $ANTLR start "rule__Relationship__Group_3__0"
    // InternalTextualDataModel.g:2389:1: rule__Relationship__Group_3__0 : rule__Relationship__Group_3__0__Impl rule__Relationship__Group_3__1 ;
    public final void rule__Relationship__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2393:1: ( rule__Relationship__Group_3__0__Impl rule__Relationship__Group_3__1 )
            // InternalTextualDataModel.g:2394:2: rule__Relationship__Group_3__0__Impl rule__Relationship__Group_3__1
            {
            pushFollow(FOLLOW_26);
            rule__Relationship__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_3__1();

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
    // $ANTLR end "rule__Relationship__Group_3__0"


    // $ANTLR start "rule__Relationship__Group_3__0__Impl"
    // InternalTextualDataModel.g:2401:1: rule__Relationship__Group_3__0__Impl : ( '[' ) ;
    public final void rule__Relationship__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2405:1: ( ( '[' ) )
            // InternalTextualDataModel.g:2406:1: ( '[' )
            {
            // InternalTextualDataModel.g:2406:1: ( '[' )
            // InternalTextualDataModel.g:2407:2: '['
            {
             before(grammarAccess.getRelationshipAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getLeftSquareBracketKeyword_3_0()); 

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
    // $ANTLR end "rule__Relationship__Group_3__0__Impl"


    // $ANTLR start "rule__Relationship__Group_3__1"
    // InternalTextualDataModel.g:2416:1: rule__Relationship__Group_3__1 : rule__Relationship__Group_3__1__Impl rule__Relationship__Group_3__2 ;
    public final void rule__Relationship__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2420:1: ( rule__Relationship__Group_3__1__Impl rule__Relationship__Group_3__2 )
            // InternalTextualDataModel.g:2421:2: rule__Relationship__Group_3__1__Impl rule__Relationship__Group_3__2
            {
            pushFollow(FOLLOW_16);
            rule__Relationship__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_3__2();

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
    // $ANTLR end "rule__Relationship__Group_3__1"


    // $ANTLR start "rule__Relationship__Group_3__1__Impl"
    // InternalTextualDataModel.g:2428:1: rule__Relationship__Group_3__1__Impl : ( ( rule__Relationship__KindAssignment_3_1 ) ) ;
    public final void rule__Relationship__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2432:1: ( ( ( rule__Relationship__KindAssignment_3_1 ) ) )
            // InternalTextualDataModel.g:2433:1: ( ( rule__Relationship__KindAssignment_3_1 ) )
            {
            // InternalTextualDataModel.g:2433:1: ( ( rule__Relationship__KindAssignment_3_1 ) )
            // InternalTextualDataModel.g:2434:2: ( rule__Relationship__KindAssignment_3_1 )
            {
             before(grammarAccess.getRelationshipAccess().getKindAssignment_3_1()); 
            // InternalTextualDataModel.g:2435:2: ( rule__Relationship__KindAssignment_3_1 )
            // InternalTextualDataModel.g:2435:3: rule__Relationship__KindAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__KindAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getKindAssignment_3_1()); 

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
    // $ANTLR end "rule__Relationship__Group_3__1__Impl"


    // $ANTLR start "rule__Relationship__Group_3__2"
    // InternalTextualDataModel.g:2443:1: rule__Relationship__Group_3__2 : rule__Relationship__Group_3__2__Impl ;
    public final void rule__Relationship__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2447:1: ( rule__Relationship__Group_3__2__Impl )
            // InternalTextualDataModel.g:2448:2: rule__Relationship__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Group_3__2__Impl();

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
    // $ANTLR end "rule__Relationship__Group_3__2"


    // $ANTLR start "rule__Relationship__Group_3__2__Impl"
    // InternalTextualDataModel.g:2454:1: rule__Relationship__Group_3__2__Impl : ( ']' ) ;
    public final void rule__Relationship__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2458:1: ( ( ']' ) )
            // InternalTextualDataModel.g:2459:1: ( ']' )
            {
            // InternalTextualDataModel.g:2459:1: ( ']' )
            // InternalTextualDataModel.g:2460:2: ']'
            {
             before(grammarAccess.getRelationshipAccess().getRightSquareBracketKeyword_3_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getRightSquareBracketKeyword_3_2()); 

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
    // $ANTLR end "rule__Relationship__Group_3__2__Impl"


    // $ANTLR start "rule__Relationship__Group_4__0"
    // InternalTextualDataModel.g:2470:1: rule__Relationship__Group_4__0 : rule__Relationship__Group_4__0__Impl rule__Relationship__Group_4__1 ;
    public final void rule__Relationship__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2474:1: ( rule__Relationship__Group_4__0__Impl rule__Relationship__Group_4__1 )
            // InternalTextualDataModel.g:2475:2: rule__Relationship__Group_4__0__Impl rule__Relationship__Group_4__1
            {
            pushFollow(FOLLOW_18);
            rule__Relationship__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_4__1();

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
    // $ANTLR end "rule__Relationship__Group_4__0"


    // $ANTLR start "rule__Relationship__Group_4__0__Impl"
    // InternalTextualDataModel.g:2482:1: rule__Relationship__Group_4__0__Impl : ( '{' ) ;
    public final void rule__Relationship__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2486:1: ( ( '{' ) )
            // InternalTextualDataModel.g:2487:1: ( '{' )
            {
            // InternalTextualDataModel.g:2487:1: ( '{' )
            // InternalTextualDataModel.g:2488:2: '{'
            {
             before(grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_4_0()); 

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
    // $ANTLR end "rule__Relationship__Group_4__0__Impl"


    // $ANTLR start "rule__Relationship__Group_4__1"
    // InternalTextualDataModel.g:2497:1: rule__Relationship__Group_4__1 : rule__Relationship__Group_4__1__Impl rule__Relationship__Group_4__2 ;
    public final void rule__Relationship__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2501:1: ( rule__Relationship__Group_4__1__Impl rule__Relationship__Group_4__2 )
            // InternalTextualDataModel.g:2502:2: rule__Relationship__Group_4__1__Impl rule__Relationship__Group_4__2
            {
            pushFollow(FOLLOW_18);
            rule__Relationship__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_4__2();

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
    // $ANTLR end "rule__Relationship__Group_4__1"


    // $ANTLR start "rule__Relationship__Group_4__1__Impl"
    // InternalTextualDataModel.g:2509:1: rule__Relationship__Group_4__1__Impl : ( ( rule__Relationship__Group_4_1__0 )? ) ;
    public final void rule__Relationship__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2513:1: ( ( ( rule__Relationship__Group_4_1__0 )? ) )
            // InternalTextualDataModel.g:2514:1: ( ( rule__Relationship__Group_4_1__0 )? )
            {
            // InternalTextualDataModel.g:2514:1: ( ( rule__Relationship__Group_4_1__0 )? )
            // InternalTextualDataModel.g:2515:2: ( rule__Relationship__Group_4_1__0 )?
            {
             before(grammarAccess.getRelationshipAccess().getGroup_4_1()); 
            // InternalTextualDataModel.g:2516:2: ( rule__Relationship__Group_4_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==24) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalTextualDataModel.g:2516:3: rule__Relationship__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relationship__Group_4_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationshipAccess().getGroup_4_1()); 

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
    // $ANTLR end "rule__Relationship__Group_4__1__Impl"


    // $ANTLR start "rule__Relationship__Group_4__2"
    // InternalTextualDataModel.g:2524:1: rule__Relationship__Group_4__2 : rule__Relationship__Group_4__2__Impl rule__Relationship__Group_4__3 ;
    public final void rule__Relationship__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2528:1: ( rule__Relationship__Group_4__2__Impl rule__Relationship__Group_4__3 )
            // InternalTextualDataModel.g:2529:2: rule__Relationship__Group_4__2__Impl rule__Relationship__Group_4__3
            {
            pushFollow(FOLLOW_18);
            rule__Relationship__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_4__3();

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
    // $ANTLR end "rule__Relationship__Group_4__2"


    // $ANTLR start "rule__Relationship__Group_4__2__Impl"
    // InternalTextualDataModel.g:2536:1: rule__Relationship__Group_4__2__Impl : ( ( rule__Relationship__LocalizationsAssignment_4_2 )* ) ;
    public final void rule__Relationship__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2540:1: ( ( ( rule__Relationship__LocalizationsAssignment_4_2 )* ) )
            // InternalTextualDataModel.g:2541:1: ( ( rule__Relationship__LocalizationsAssignment_4_2 )* )
            {
            // InternalTextualDataModel.g:2541:1: ( ( rule__Relationship__LocalizationsAssignment_4_2 )* )
            // InternalTextualDataModel.g:2542:2: ( rule__Relationship__LocalizationsAssignment_4_2 )*
            {
             before(grammarAccess.getRelationshipAccess().getLocalizationsAssignment_4_2()); 
            // InternalTextualDataModel.g:2543:2: ( rule__Relationship__LocalizationsAssignment_4_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==53) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalTextualDataModel.g:2543:3: rule__Relationship__LocalizationsAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Relationship__LocalizationsAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getRelationshipAccess().getLocalizationsAssignment_4_2()); 

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
    // $ANTLR end "rule__Relationship__Group_4__2__Impl"


    // $ANTLR start "rule__Relationship__Group_4__3"
    // InternalTextualDataModel.g:2551:1: rule__Relationship__Group_4__3 : rule__Relationship__Group_4__3__Impl rule__Relationship__Group_4__4 ;
    public final void rule__Relationship__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2555:1: ( rule__Relationship__Group_4__3__Impl rule__Relationship__Group_4__4 )
            // InternalTextualDataModel.g:2556:2: rule__Relationship__Group_4__3__Impl rule__Relationship__Group_4__4
            {
            pushFollow(FOLLOW_18);
            rule__Relationship__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_4__4();

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
    // $ANTLR end "rule__Relationship__Group_4__3"


    // $ANTLR start "rule__Relationship__Group_4__3__Impl"
    // InternalTextualDataModel.g:2563:1: rule__Relationship__Group_4__3__Impl : ( ( rule__Relationship__EndsAssignment_4_3 )* ) ;
    public final void rule__Relationship__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2567:1: ( ( ( rule__Relationship__EndsAssignment_4_3 )* ) )
            // InternalTextualDataModel.g:2568:1: ( ( rule__Relationship__EndsAssignment_4_3 )* )
            {
            // InternalTextualDataModel.g:2568:1: ( ( rule__Relationship__EndsAssignment_4_3 )* )
            // InternalTextualDataModel.g:2569:2: ( rule__Relationship__EndsAssignment_4_3 )*
            {
             before(grammarAccess.getRelationshipAccess().getEndsAssignment_4_3()); 
            // InternalTextualDataModel.g:2570:2: ( rule__Relationship__EndsAssignment_4_3 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_STRING) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalTextualDataModel.g:2570:3: rule__Relationship__EndsAssignment_4_3
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Relationship__EndsAssignment_4_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getRelationshipAccess().getEndsAssignment_4_3()); 

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
    // $ANTLR end "rule__Relationship__Group_4__3__Impl"


    // $ANTLR start "rule__Relationship__Group_4__4"
    // InternalTextualDataModel.g:2578:1: rule__Relationship__Group_4__4 : rule__Relationship__Group_4__4__Impl ;
    public final void rule__Relationship__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2582:1: ( rule__Relationship__Group_4__4__Impl )
            // InternalTextualDataModel.g:2583:2: rule__Relationship__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Group_4__4__Impl();

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
    // $ANTLR end "rule__Relationship__Group_4__4"


    // $ANTLR start "rule__Relationship__Group_4__4__Impl"
    // InternalTextualDataModel.g:2589:1: rule__Relationship__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Relationship__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2593:1: ( ( '}' ) )
            // InternalTextualDataModel.g:2594:1: ( '}' )
            {
            // InternalTextualDataModel.g:2594:1: ( '}' )
            // InternalTextualDataModel.g:2595:2: '}'
            {
             before(grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__Relationship__Group_4__4__Impl"


    // $ANTLR start "rule__Relationship__Group_4_1__0"
    // InternalTextualDataModel.g:2605:1: rule__Relationship__Group_4_1__0 : rule__Relationship__Group_4_1__0__Impl rule__Relationship__Group_4_1__1 ;
    public final void rule__Relationship__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2609:1: ( rule__Relationship__Group_4_1__0__Impl rule__Relationship__Group_4_1__1 )
            // InternalTextualDataModel.g:2610:2: rule__Relationship__Group_4_1__0__Impl rule__Relationship__Group_4_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Relationship__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_4_1__1();

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
    // $ANTLR end "rule__Relationship__Group_4_1__0"


    // $ANTLR start "rule__Relationship__Group_4_1__0__Impl"
    // InternalTextualDataModel.g:2617:1: rule__Relationship__Group_4_1__0__Impl : ( '@description' ) ;
    public final void rule__Relationship__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2621:1: ( ( '@description' ) )
            // InternalTextualDataModel.g:2622:1: ( '@description' )
            {
            // InternalTextualDataModel.g:2622:1: ( '@description' )
            // InternalTextualDataModel.g:2623:2: '@description'
            {
             before(grammarAccess.getRelationshipAccess().getDescriptionKeyword_4_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getDescriptionKeyword_4_1_0()); 

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
    // $ANTLR end "rule__Relationship__Group_4_1__0__Impl"


    // $ANTLR start "rule__Relationship__Group_4_1__1"
    // InternalTextualDataModel.g:2632:1: rule__Relationship__Group_4_1__1 : rule__Relationship__Group_4_1__1__Impl rule__Relationship__Group_4_1__2 ;
    public final void rule__Relationship__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2636:1: ( rule__Relationship__Group_4_1__1__Impl rule__Relationship__Group_4_1__2 )
            // InternalTextualDataModel.g:2637:2: rule__Relationship__Group_4_1__1__Impl rule__Relationship__Group_4_1__2
            {
            pushFollow(FOLLOW_3);
            rule__Relationship__Group_4_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_4_1__2();

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
    // $ANTLR end "rule__Relationship__Group_4_1__1"


    // $ANTLR start "rule__Relationship__Group_4_1__1__Impl"
    // InternalTextualDataModel.g:2644:1: rule__Relationship__Group_4_1__1__Impl : ( '(' ) ;
    public final void rule__Relationship__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2648:1: ( ( '(' ) )
            // InternalTextualDataModel.g:2649:1: ( '(' )
            {
            // InternalTextualDataModel.g:2649:1: ( '(' )
            // InternalTextualDataModel.g:2650:2: '('
            {
             before(grammarAccess.getRelationshipAccess().getLeftParenthesisKeyword_4_1_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getLeftParenthesisKeyword_4_1_1()); 

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
    // $ANTLR end "rule__Relationship__Group_4_1__1__Impl"


    // $ANTLR start "rule__Relationship__Group_4_1__2"
    // InternalTextualDataModel.g:2659:1: rule__Relationship__Group_4_1__2 : rule__Relationship__Group_4_1__2__Impl rule__Relationship__Group_4_1__3 ;
    public final void rule__Relationship__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2663:1: ( rule__Relationship__Group_4_1__2__Impl rule__Relationship__Group_4_1__3 )
            // InternalTextualDataModel.g:2664:2: rule__Relationship__Group_4_1__2__Impl rule__Relationship__Group_4_1__3
            {
            pushFollow(FOLLOW_11);
            rule__Relationship__Group_4_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_4_1__3();

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
    // $ANTLR end "rule__Relationship__Group_4_1__2"


    // $ANTLR start "rule__Relationship__Group_4_1__2__Impl"
    // InternalTextualDataModel.g:2671:1: rule__Relationship__Group_4_1__2__Impl : ( ( rule__Relationship__DescriptionAssignment_4_1_2 ) ) ;
    public final void rule__Relationship__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2675:1: ( ( ( rule__Relationship__DescriptionAssignment_4_1_2 ) ) )
            // InternalTextualDataModel.g:2676:1: ( ( rule__Relationship__DescriptionAssignment_4_1_2 ) )
            {
            // InternalTextualDataModel.g:2676:1: ( ( rule__Relationship__DescriptionAssignment_4_1_2 ) )
            // InternalTextualDataModel.g:2677:2: ( rule__Relationship__DescriptionAssignment_4_1_2 )
            {
             before(grammarAccess.getRelationshipAccess().getDescriptionAssignment_4_1_2()); 
            // InternalTextualDataModel.g:2678:2: ( rule__Relationship__DescriptionAssignment_4_1_2 )
            // InternalTextualDataModel.g:2678:3: rule__Relationship__DescriptionAssignment_4_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__DescriptionAssignment_4_1_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getDescriptionAssignment_4_1_2()); 

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
    // $ANTLR end "rule__Relationship__Group_4_1__2__Impl"


    // $ANTLR start "rule__Relationship__Group_4_1__3"
    // InternalTextualDataModel.g:2686:1: rule__Relationship__Group_4_1__3 : rule__Relationship__Group_4_1__3__Impl ;
    public final void rule__Relationship__Group_4_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2690:1: ( rule__Relationship__Group_4_1__3__Impl )
            // InternalTextualDataModel.g:2691:2: rule__Relationship__Group_4_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Group_4_1__3__Impl();

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
    // $ANTLR end "rule__Relationship__Group_4_1__3"


    // $ANTLR start "rule__Relationship__Group_4_1__3__Impl"
    // InternalTextualDataModel.g:2697:1: rule__Relationship__Group_4_1__3__Impl : ( ')' ) ;
    public final void rule__Relationship__Group_4_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2701:1: ( ( ')' ) )
            // InternalTextualDataModel.g:2702:1: ( ')' )
            {
            // InternalTextualDataModel.g:2702:1: ( ')' )
            // InternalTextualDataModel.g:2703:2: ')'
            {
             before(grammarAccess.getRelationshipAccess().getRightParenthesisKeyword_4_1_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getRightParenthesisKeyword_4_1_3()); 

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
    // $ANTLR end "rule__Relationship__Group_4_1__3__Impl"


    // $ANTLR start "rule__RelationshipEnd__Group__0"
    // InternalTextualDataModel.g:2713:1: rule__RelationshipEnd__Group__0 : rule__RelationshipEnd__Group__0__Impl rule__RelationshipEnd__Group__1 ;
    public final void rule__RelationshipEnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2717:1: ( rule__RelationshipEnd__Group__0__Impl rule__RelationshipEnd__Group__1 )
            // InternalTextualDataModel.g:2718:2: rule__RelationshipEnd__Group__0__Impl rule__RelationshipEnd__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RelationshipEnd__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationshipEnd__Group__1();

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
    // $ANTLR end "rule__RelationshipEnd__Group__0"


    // $ANTLR start "rule__RelationshipEnd__Group__0__Impl"
    // InternalTextualDataModel.g:2725:1: rule__RelationshipEnd__Group__0__Impl : ( ( rule__RelationshipEnd__NameAssignment_0 )? ) ;
    public final void rule__RelationshipEnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2729:1: ( ( ( rule__RelationshipEnd__NameAssignment_0 )? ) )
            // InternalTextualDataModel.g:2730:1: ( ( rule__RelationshipEnd__NameAssignment_0 )? )
            {
            // InternalTextualDataModel.g:2730:1: ( ( rule__RelationshipEnd__NameAssignment_0 )? )
            // InternalTextualDataModel.g:2731:2: ( rule__RelationshipEnd__NameAssignment_0 )?
            {
             before(grammarAccess.getRelationshipEndAccess().getNameAssignment_0()); 
            // InternalTextualDataModel.g:2732:2: ( rule__RelationshipEnd__NameAssignment_0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==RULE_STRING) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // InternalTextualDataModel.g:2732:3: rule__RelationshipEnd__NameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelationshipEnd__NameAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationshipEndAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__RelationshipEnd__Group__0__Impl"


    // $ANTLR start "rule__RelationshipEnd__Group__1"
    // InternalTextualDataModel.g:2740:1: rule__RelationshipEnd__Group__1 : rule__RelationshipEnd__Group__1__Impl rule__RelationshipEnd__Group__2 ;
    public final void rule__RelationshipEnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2744:1: ( rule__RelationshipEnd__Group__1__Impl rule__RelationshipEnd__Group__2 )
            // InternalTextualDataModel.g:2745:2: rule__RelationshipEnd__Group__1__Impl rule__RelationshipEnd__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__RelationshipEnd__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationshipEnd__Group__2();

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
    // $ANTLR end "rule__RelationshipEnd__Group__1"


    // $ANTLR start "rule__RelationshipEnd__Group__1__Impl"
    // InternalTextualDataModel.g:2752:1: rule__RelationshipEnd__Group__1__Impl : ( ( rule__RelationshipEnd__EntityAssignment_1 ) ) ;
    public final void rule__RelationshipEnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2756:1: ( ( ( rule__RelationshipEnd__EntityAssignment_1 ) ) )
            // InternalTextualDataModel.g:2757:1: ( ( rule__RelationshipEnd__EntityAssignment_1 ) )
            {
            // InternalTextualDataModel.g:2757:1: ( ( rule__RelationshipEnd__EntityAssignment_1 ) )
            // InternalTextualDataModel.g:2758:2: ( rule__RelationshipEnd__EntityAssignment_1 )
            {
             before(grammarAccess.getRelationshipEndAccess().getEntityAssignment_1()); 
            // InternalTextualDataModel.g:2759:2: ( rule__RelationshipEnd__EntityAssignment_1 )
            // InternalTextualDataModel.g:2759:3: rule__RelationshipEnd__EntityAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RelationshipEnd__EntityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipEndAccess().getEntityAssignment_1()); 

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
    // $ANTLR end "rule__RelationshipEnd__Group__1__Impl"


    // $ANTLR start "rule__RelationshipEnd__Group__2"
    // InternalTextualDataModel.g:2767:1: rule__RelationshipEnd__Group__2 : rule__RelationshipEnd__Group__2__Impl rule__RelationshipEnd__Group__3 ;
    public final void rule__RelationshipEnd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2771:1: ( rule__RelationshipEnd__Group__2__Impl rule__RelationshipEnd__Group__3 )
            // InternalTextualDataModel.g:2772:2: rule__RelationshipEnd__Group__2__Impl rule__RelationshipEnd__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__RelationshipEnd__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationshipEnd__Group__3();

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
    // $ANTLR end "rule__RelationshipEnd__Group__2"


    // $ANTLR start "rule__RelationshipEnd__Group__2__Impl"
    // InternalTextualDataModel.g:2779:1: rule__RelationshipEnd__Group__2__Impl : ( ( rule__RelationshipEnd__LowerAssignment_2 ) ) ;
    public final void rule__RelationshipEnd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2783:1: ( ( ( rule__RelationshipEnd__LowerAssignment_2 ) ) )
            // InternalTextualDataModel.g:2784:1: ( ( rule__RelationshipEnd__LowerAssignment_2 ) )
            {
            // InternalTextualDataModel.g:2784:1: ( ( rule__RelationshipEnd__LowerAssignment_2 ) )
            // InternalTextualDataModel.g:2785:2: ( rule__RelationshipEnd__LowerAssignment_2 )
            {
             before(grammarAccess.getRelationshipEndAccess().getLowerAssignment_2()); 
            // InternalTextualDataModel.g:2786:2: ( rule__RelationshipEnd__LowerAssignment_2 )
            // InternalTextualDataModel.g:2786:3: rule__RelationshipEnd__LowerAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RelationshipEnd__LowerAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipEndAccess().getLowerAssignment_2()); 

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
    // $ANTLR end "rule__RelationshipEnd__Group__2__Impl"


    // $ANTLR start "rule__RelationshipEnd__Group__3"
    // InternalTextualDataModel.g:2794:1: rule__RelationshipEnd__Group__3 : rule__RelationshipEnd__Group__3__Impl rule__RelationshipEnd__Group__4 ;
    public final void rule__RelationshipEnd__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2798:1: ( rule__RelationshipEnd__Group__3__Impl rule__RelationshipEnd__Group__4 )
            // InternalTextualDataModel.g:2799:2: rule__RelationshipEnd__Group__3__Impl rule__RelationshipEnd__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__RelationshipEnd__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationshipEnd__Group__4();

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
    // $ANTLR end "rule__RelationshipEnd__Group__3"


    // $ANTLR start "rule__RelationshipEnd__Group__3__Impl"
    // InternalTextualDataModel.g:2806:1: rule__RelationshipEnd__Group__3__Impl : ( '..' ) ;
    public final void rule__RelationshipEnd__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2810:1: ( ( '..' ) )
            // InternalTextualDataModel.g:2811:1: ( '..' )
            {
            // InternalTextualDataModel.g:2811:1: ( '..' )
            // InternalTextualDataModel.g:2812:2: '..'
            {
             before(grammarAccess.getRelationshipEndAccess().getFullStopFullStopKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRelationshipEndAccess().getFullStopFullStopKeyword_3()); 

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
    // $ANTLR end "rule__RelationshipEnd__Group__3__Impl"


    // $ANTLR start "rule__RelationshipEnd__Group__4"
    // InternalTextualDataModel.g:2821:1: rule__RelationshipEnd__Group__4 : rule__RelationshipEnd__Group__4__Impl rule__RelationshipEnd__Group__5 ;
    public final void rule__RelationshipEnd__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2825:1: ( rule__RelationshipEnd__Group__4__Impl rule__RelationshipEnd__Group__5 )
            // InternalTextualDataModel.g:2826:2: rule__RelationshipEnd__Group__4__Impl rule__RelationshipEnd__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__RelationshipEnd__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationshipEnd__Group__5();

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
    // $ANTLR end "rule__RelationshipEnd__Group__4"


    // $ANTLR start "rule__RelationshipEnd__Group__4__Impl"
    // InternalTextualDataModel.g:2833:1: rule__RelationshipEnd__Group__4__Impl : ( ( rule__RelationshipEnd__UpperAssignment_4 ) ) ;
    public final void rule__RelationshipEnd__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2837:1: ( ( ( rule__RelationshipEnd__UpperAssignment_4 ) ) )
            // InternalTextualDataModel.g:2838:1: ( ( rule__RelationshipEnd__UpperAssignment_4 ) )
            {
            // InternalTextualDataModel.g:2838:1: ( ( rule__RelationshipEnd__UpperAssignment_4 ) )
            // InternalTextualDataModel.g:2839:2: ( rule__RelationshipEnd__UpperAssignment_4 )
            {
             before(grammarAccess.getRelationshipEndAccess().getUpperAssignment_4()); 
            // InternalTextualDataModel.g:2840:2: ( rule__RelationshipEnd__UpperAssignment_4 )
            // InternalTextualDataModel.g:2840:3: rule__RelationshipEnd__UpperAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RelationshipEnd__UpperAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipEndAccess().getUpperAssignment_4()); 

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
    // $ANTLR end "rule__RelationshipEnd__Group__4__Impl"


    // $ANTLR start "rule__RelationshipEnd__Group__5"
    // InternalTextualDataModel.g:2848:1: rule__RelationshipEnd__Group__5 : rule__RelationshipEnd__Group__5__Impl ;
    public final void rule__RelationshipEnd__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2852:1: ( rule__RelationshipEnd__Group__5__Impl )
            // InternalTextualDataModel.g:2853:2: rule__RelationshipEnd__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationshipEnd__Group__5__Impl();

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
    // $ANTLR end "rule__RelationshipEnd__Group__5"


    // $ANTLR start "rule__RelationshipEnd__Group__5__Impl"
    // InternalTextualDataModel.g:2859:1: rule__RelationshipEnd__Group__5__Impl : ( ( rule__RelationshipEnd__Group_5__0 )? ) ;
    public final void rule__RelationshipEnd__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2863:1: ( ( ( rule__RelationshipEnd__Group_5__0 )? ) )
            // InternalTextualDataModel.g:2864:1: ( ( rule__RelationshipEnd__Group_5__0 )? )
            {
            // InternalTextualDataModel.g:2864:1: ( ( rule__RelationshipEnd__Group_5__0 )? )
            // InternalTextualDataModel.g:2865:2: ( rule__RelationshipEnd__Group_5__0 )?
            {
             before(grammarAccess.getRelationshipEndAccess().getGroup_5()); 
            // InternalTextualDataModel.g:2866:2: ( rule__RelationshipEnd__Group_5__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==22) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalTextualDataModel.g:2866:3: rule__RelationshipEnd__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelationshipEnd__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationshipEndAccess().getGroup_5()); 

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
    // $ANTLR end "rule__RelationshipEnd__Group__5__Impl"


    // $ANTLR start "rule__RelationshipEnd__Group_5__0"
    // InternalTextualDataModel.g:2875:1: rule__RelationshipEnd__Group_5__0 : rule__RelationshipEnd__Group_5__0__Impl rule__RelationshipEnd__Group_5__1 ;
    public final void rule__RelationshipEnd__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2879:1: ( rule__RelationshipEnd__Group_5__0__Impl rule__RelationshipEnd__Group_5__1 )
            // InternalTextualDataModel.g:2880:2: rule__RelationshipEnd__Group_5__0__Impl rule__RelationshipEnd__Group_5__1
            {
            pushFollow(FOLLOW_23);
            rule__RelationshipEnd__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationshipEnd__Group_5__1();

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
    // $ANTLR end "rule__RelationshipEnd__Group_5__0"


    // $ANTLR start "rule__RelationshipEnd__Group_5__0__Impl"
    // InternalTextualDataModel.g:2887:1: rule__RelationshipEnd__Group_5__0__Impl : ( '{' ) ;
    public final void rule__RelationshipEnd__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2891:1: ( ( '{' ) )
            // InternalTextualDataModel.g:2892:1: ( '{' )
            {
            // InternalTextualDataModel.g:2892:1: ( '{' )
            // InternalTextualDataModel.g:2893:2: '{'
            {
             before(grammarAccess.getRelationshipEndAccess().getLeftCurlyBracketKeyword_5_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRelationshipEndAccess().getLeftCurlyBracketKeyword_5_0()); 

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
    // $ANTLR end "rule__RelationshipEnd__Group_5__0__Impl"


    // $ANTLR start "rule__RelationshipEnd__Group_5__1"
    // InternalTextualDataModel.g:2902:1: rule__RelationshipEnd__Group_5__1 : rule__RelationshipEnd__Group_5__1__Impl rule__RelationshipEnd__Group_5__2 ;
    public final void rule__RelationshipEnd__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2906:1: ( rule__RelationshipEnd__Group_5__1__Impl rule__RelationshipEnd__Group_5__2 )
            // InternalTextualDataModel.g:2907:2: rule__RelationshipEnd__Group_5__1__Impl rule__RelationshipEnd__Group_5__2
            {
            pushFollow(FOLLOW_23);
            rule__RelationshipEnd__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationshipEnd__Group_5__2();

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
    // $ANTLR end "rule__RelationshipEnd__Group_5__1"


    // $ANTLR start "rule__RelationshipEnd__Group_5__1__Impl"
    // InternalTextualDataModel.g:2914:1: rule__RelationshipEnd__Group_5__1__Impl : ( ( rule__RelationshipEnd__Group_5_1__0 )? ) ;
    public final void rule__RelationshipEnd__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2918:1: ( ( ( rule__RelationshipEnd__Group_5_1__0 )? ) )
            // InternalTextualDataModel.g:2919:1: ( ( rule__RelationshipEnd__Group_5_1__0 )? )
            {
            // InternalTextualDataModel.g:2919:1: ( ( rule__RelationshipEnd__Group_5_1__0 )? )
            // InternalTextualDataModel.g:2920:2: ( rule__RelationshipEnd__Group_5_1__0 )?
            {
             before(grammarAccess.getRelationshipEndAccess().getGroup_5_1()); 
            // InternalTextualDataModel.g:2921:2: ( rule__RelationshipEnd__Group_5_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==24) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalTextualDataModel.g:2921:3: rule__RelationshipEnd__Group_5_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelationshipEnd__Group_5_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationshipEndAccess().getGroup_5_1()); 

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
    // $ANTLR end "rule__RelationshipEnd__Group_5__1__Impl"


    // $ANTLR start "rule__RelationshipEnd__Group_5__2"
    // InternalTextualDataModel.g:2929:1: rule__RelationshipEnd__Group_5__2 : rule__RelationshipEnd__Group_5__2__Impl rule__RelationshipEnd__Group_5__3 ;
    public final void rule__RelationshipEnd__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2933:1: ( rule__RelationshipEnd__Group_5__2__Impl rule__RelationshipEnd__Group_5__3 )
            // InternalTextualDataModel.g:2934:2: rule__RelationshipEnd__Group_5__2__Impl rule__RelationshipEnd__Group_5__3
            {
            pushFollow(FOLLOW_23);
            rule__RelationshipEnd__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationshipEnd__Group_5__3();

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
    // $ANTLR end "rule__RelationshipEnd__Group_5__2"


    // $ANTLR start "rule__RelationshipEnd__Group_5__2__Impl"
    // InternalTextualDataModel.g:2941:1: rule__RelationshipEnd__Group_5__2__Impl : ( ( rule__RelationshipEnd__LocalizationsAssignment_5_2 )* ) ;
    public final void rule__RelationshipEnd__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2945:1: ( ( ( rule__RelationshipEnd__LocalizationsAssignment_5_2 )* ) )
            // InternalTextualDataModel.g:2946:1: ( ( rule__RelationshipEnd__LocalizationsAssignment_5_2 )* )
            {
            // InternalTextualDataModel.g:2946:1: ( ( rule__RelationshipEnd__LocalizationsAssignment_5_2 )* )
            // InternalTextualDataModel.g:2947:2: ( rule__RelationshipEnd__LocalizationsAssignment_5_2 )*
            {
             before(grammarAccess.getRelationshipEndAccess().getLocalizationsAssignment_5_2()); 
            // InternalTextualDataModel.g:2948:2: ( rule__RelationshipEnd__LocalizationsAssignment_5_2 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==53) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalTextualDataModel.g:2948:3: rule__RelationshipEnd__LocalizationsAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__RelationshipEnd__LocalizationsAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getRelationshipEndAccess().getLocalizationsAssignment_5_2()); 

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
    // $ANTLR end "rule__RelationshipEnd__Group_5__2__Impl"


    // $ANTLR start "rule__RelationshipEnd__Group_5__3"
    // InternalTextualDataModel.g:2956:1: rule__RelationshipEnd__Group_5__3 : rule__RelationshipEnd__Group_5__3__Impl ;
    public final void rule__RelationshipEnd__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2960:1: ( rule__RelationshipEnd__Group_5__3__Impl )
            // InternalTextualDataModel.g:2961:2: rule__RelationshipEnd__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationshipEnd__Group_5__3__Impl();

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
    // $ANTLR end "rule__RelationshipEnd__Group_5__3"


    // $ANTLR start "rule__RelationshipEnd__Group_5__3__Impl"
    // InternalTextualDataModel.g:2967:1: rule__RelationshipEnd__Group_5__3__Impl : ( '}' ) ;
    public final void rule__RelationshipEnd__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2971:1: ( ( '}' ) )
            // InternalTextualDataModel.g:2972:1: ( '}' )
            {
            // InternalTextualDataModel.g:2972:1: ( '}' )
            // InternalTextualDataModel.g:2973:2: '}'
            {
             before(grammarAccess.getRelationshipEndAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRelationshipEndAccess().getRightCurlyBracketKeyword_5_3()); 

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
    // $ANTLR end "rule__RelationshipEnd__Group_5__3__Impl"


    // $ANTLR start "rule__RelationshipEnd__Group_5_1__0"
    // InternalTextualDataModel.g:2983:1: rule__RelationshipEnd__Group_5_1__0 : rule__RelationshipEnd__Group_5_1__0__Impl rule__RelationshipEnd__Group_5_1__1 ;
    public final void rule__RelationshipEnd__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2987:1: ( rule__RelationshipEnd__Group_5_1__0__Impl rule__RelationshipEnd__Group_5_1__1 )
            // InternalTextualDataModel.g:2988:2: rule__RelationshipEnd__Group_5_1__0__Impl rule__RelationshipEnd__Group_5_1__1
            {
            pushFollow(FOLLOW_10);
            rule__RelationshipEnd__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationshipEnd__Group_5_1__1();

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
    // $ANTLR end "rule__RelationshipEnd__Group_5_1__0"


    // $ANTLR start "rule__RelationshipEnd__Group_5_1__0__Impl"
    // InternalTextualDataModel.g:2995:1: rule__RelationshipEnd__Group_5_1__0__Impl : ( '@description' ) ;
    public final void rule__RelationshipEnd__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:2999:1: ( ( '@description' ) )
            // InternalTextualDataModel.g:3000:1: ( '@description' )
            {
            // InternalTextualDataModel.g:3000:1: ( '@description' )
            // InternalTextualDataModel.g:3001:2: '@description'
            {
             before(grammarAccess.getRelationshipEndAccess().getDescriptionKeyword_5_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRelationshipEndAccess().getDescriptionKeyword_5_1_0()); 

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
    // $ANTLR end "rule__RelationshipEnd__Group_5_1__0__Impl"


    // $ANTLR start "rule__RelationshipEnd__Group_5_1__1"
    // InternalTextualDataModel.g:3010:1: rule__RelationshipEnd__Group_5_1__1 : rule__RelationshipEnd__Group_5_1__1__Impl rule__RelationshipEnd__Group_5_1__2 ;
    public final void rule__RelationshipEnd__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3014:1: ( rule__RelationshipEnd__Group_5_1__1__Impl rule__RelationshipEnd__Group_5_1__2 )
            // InternalTextualDataModel.g:3015:2: rule__RelationshipEnd__Group_5_1__1__Impl rule__RelationshipEnd__Group_5_1__2
            {
            pushFollow(FOLLOW_3);
            rule__RelationshipEnd__Group_5_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationshipEnd__Group_5_1__2();

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
    // $ANTLR end "rule__RelationshipEnd__Group_5_1__1"


    // $ANTLR start "rule__RelationshipEnd__Group_5_1__1__Impl"
    // InternalTextualDataModel.g:3022:1: rule__RelationshipEnd__Group_5_1__1__Impl : ( '(' ) ;
    public final void rule__RelationshipEnd__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3026:1: ( ( '(' ) )
            // InternalTextualDataModel.g:3027:1: ( '(' )
            {
            // InternalTextualDataModel.g:3027:1: ( '(' )
            // InternalTextualDataModel.g:3028:2: '('
            {
             before(grammarAccess.getRelationshipEndAccess().getLeftParenthesisKeyword_5_1_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRelationshipEndAccess().getLeftParenthesisKeyword_5_1_1()); 

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
    // $ANTLR end "rule__RelationshipEnd__Group_5_1__1__Impl"


    // $ANTLR start "rule__RelationshipEnd__Group_5_1__2"
    // InternalTextualDataModel.g:3037:1: rule__RelationshipEnd__Group_5_1__2 : rule__RelationshipEnd__Group_5_1__2__Impl rule__RelationshipEnd__Group_5_1__3 ;
    public final void rule__RelationshipEnd__Group_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3041:1: ( rule__RelationshipEnd__Group_5_1__2__Impl rule__RelationshipEnd__Group_5_1__3 )
            // InternalTextualDataModel.g:3042:2: rule__RelationshipEnd__Group_5_1__2__Impl rule__RelationshipEnd__Group_5_1__3
            {
            pushFollow(FOLLOW_11);
            rule__RelationshipEnd__Group_5_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationshipEnd__Group_5_1__3();

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
    // $ANTLR end "rule__RelationshipEnd__Group_5_1__2"


    // $ANTLR start "rule__RelationshipEnd__Group_5_1__2__Impl"
    // InternalTextualDataModel.g:3049:1: rule__RelationshipEnd__Group_5_1__2__Impl : ( ( rule__RelationshipEnd__DescriptionAssignment_5_1_2 ) ) ;
    public final void rule__RelationshipEnd__Group_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3053:1: ( ( ( rule__RelationshipEnd__DescriptionAssignment_5_1_2 ) ) )
            // InternalTextualDataModel.g:3054:1: ( ( rule__RelationshipEnd__DescriptionAssignment_5_1_2 ) )
            {
            // InternalTextualDataModel.g:3054:1: ( ( rule__RelationshipEnd__DescriptionAssignment_5_1_2 ) )
            // InternalTextualDataModel.g:3055:2: ( rule__RelationshipEnd__DescriptionAssignment_5_1_2 )
            {
             before(grammarAccess.getRelationshipEndAccess().getDescriptionAssignment_5_1_2()); 
            // InternalTextualDataModel.g:3056:2: ( rule__RelationshipEnd__DescriptionAssignment_5_1_2 )
            // InternalTextualDataModel.g:3056:3: rule__RelationshipEnd__DescriptionAssignment_5_1_2
            {
            pushFollow(FOLLOW_2);
            rule__RelationshipEnd__DescriptionAssignment_5_1_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipEndAccess().getDescriptionAssignment_5_1_2()); 

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
    // $ANTLR end "rule__RelationshipEnd__Group_5_1__2__Impl"


    // $ANTLR start "rule__RelationshipEnd__Group_5_1__3"
    // InternalTextualDataModel.g:3064:1: rule__RelationshipEnd__Group_5_1__3 : rule__RelationshipEnd__Group_5_1__3__Impl ;
    public final void rule__RelationshipEnd__Group_5_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3068:1: ( rule__RelationshipEnd__Group_5_1__3__Impl )
            // InternalTextualDataModel.g:3069:2: rule__RelationshipEnd__Group_5_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationshipEnd__Group_5_1__3__Impl();

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
    // $ANTLR end "rule__RelationshipEnd__Group_5_1__3"


    // $ANTLR start "rule__RelationshipEnd__Group_5_1__3__Impl"
    // InternalTextualDataModel.g:3075:1: rule__RelationshipEnd__Group_5_1__3__Impl : ( ')' ) ;
    public final void rule__RelationshipEnd__Group_5_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3079:1: ( ( ')' ) )
            // InternalTextualDataModel.g:3080:1: ( ')' )
            {
            // InternalTextualDataModel.g:3080:1: ( ')' )
            // InternalTextualDataModel.g:3081:2: ')'
            {
             before(grammarAccess.getRelationshipEndAccess().getRightParenthesisKeyword_5_1_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRelationshipEndAccess().getRightParenthesisKeyword_5_1_3()); 

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
    // $ANTLR end "rule__RelationshipEnd__Group_5_1__3__Impl"


    // $ANTLR start "rule__BooleanType__Group__0"
    // InternalTextualDataModel.g:3091:1: rule__BooleanType__Group__0 : rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1 ;
    public final void rule__BooleanType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3095:1: ( rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1 )
            // InternalTextualDataModel.g:3096:2: rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__BooleanType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanType__Group__1();

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
    // $ANTLR end "rule__BooleanType__Group__0"


    // $ANTLR start "rule__BooleanType__Group__0__Impl"
    // InternalTextualDataModel.g:3103:1: rule__BooleanType__Group__0__Impl : ( 'BooleanType' ) ;
    public final void rule__BooleanType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3107:1: ( ( 'BooleanType' ) )
            // InternalTextualDataModel.g:3108:1: ( 'BooleanType' )
            {
            // InternalTextualDataModel.g:3108:1: ( 'BooleanType' )
            // InternalTextualDataModel.g:3109:2: 'BooleanType'
            {
             before(grammarAccess.getBooleanTypeAccess().getBooleanTypeKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getBooleanTypeAccess().getBooleanTypeKeyword_0()); 

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
    // $ANTLR end "rule__BooleanType__Group__0__Impl"


    // $ANTLR start "rule__BooleanType__Group__1"
    // InternalTextualDataModel.g:3118:1: rule__BooleanType__Group__1 : rule__BooleanType__Group__1__Impl rule__BooleanType__Group__2 ;
    public final void rule__BooleanType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3122:1: ( rule__BooleanType__Group__1__Impl rule__BooleanType__Group__2 )
            // InternalTextualDataModel.g:3123:2: rule__BooleanType__Group__1__Impl rule__BooleanType__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__BooleanType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanType__Group__2();

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
    // $ANTLR end "rule__BooleanType__Group__1"


    // $ANTLR start "rule__BooleanType__Group__1__Impl"
    // InternalTextualDataModel.g:3130:1: rule__BooleanType__Group__1__Impl : ( ( rule__BooleanType__NameAssignment_1 ) ) ;
    public final void rule__BooleanType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3134:1: ( ( ( rule__BooleanType__NameAssignment_1 ) ) )
            // InternalTextualDataModel.g:3135:1: ( ( rule__BooleanType__NameAssignment_1 ) )
            {
            // InternalTextualDataModel.g:3135:1: ( ( rule__BooleanType__NameAssignment_1 ) )
            // InternalTextualDataModel.g:3136:2: ( rule__BooleanType__NameAssignment_1 )
            {
             before(grammarAccess.getBooleanTypeAccess().getNameAssignment_1()); 
            // InternalTextualDataModel.g:3137:2: ( rule__BooleanType__NameAssignment_1 )
            // InternalTextualDataModel.g:3137:3: rule__BooleanType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanTypeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__BooleanType__Group__1__Impl"


    // $ANTLR start "rule__BooleanType__Group__2"
    // InternalTextualDataModel.g:3145:1: rule__BooleanType__Group__2 : rule__BooleanType__Group__2__Impl ;
    public final void rule__BooleanType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3149:1: ( rule__BooleanType__Group__2__Impl )
            // InternalTextualDataModel.g:3150:2: rule__BooleanType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanType__Group__2__Impl();

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
    // $ANTLR end "rule__BooleanType__Group__2"


    // $ANTLR start "rule__BooleanType__Group__2__Impl"
    // InternalTextualDataModel.g:3156:1: rule__BooleanType__Group__2__Impl : ( ( rule__BooleanType__Group_2__0 )? ) ;
    public final void rule__BooleanType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3160:1: ( ( ( rule__BooleanType__Group_2__0 )? ) )
            // InternalTextualDataModel.g:3161:1: ( ( rule__BooleanType__Group_2__0 )? )
            {
            // InternalTextualDataModel.g:3161:1: ( ( rule__BooleanType__Group_2__0 )? )
            // InternalTextualDataModel.g:3162:2: ( rule__BooleanType__Group_2__0 )?
            {
             before(grammarAccess.getBooleanTypeAccess().getGroup_2()); 
            // InternalTextualDataModel.g:3163:2: ( rule__BooleanType__Group_2__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==22) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalTextualDataModel.g:3163:3: rule__BooleanType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBooleanTypeAccess().getGroup_2()); 

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
    // $ANTLR end "rule__BooleanType__Group__2__Impl"


    // $ANTLR start "rule__BooleanType__Group_2__0"
    // InternalTextualDataModel.g:3172:1: rule__BooleanType__Group_2__0 : rule__BooleanType__Group_2__0__Impl rule__BooleanType__Group_2__1 ;
    public final void rule__BooleanType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3176:1: ( rule__BooleanType__Group_2__0__Impl rule__BooleanType__Group_2__1 )
            // InternalTextualDataModel.g:3177:2: rule__BooleanType__Group_2__0__Impl rule__BooleanType__Group_2__1
            {
            pushFollow(FOLLOW_23);
            rule__BooleanType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanType__Group_2__1();

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
    // $ANTLR end "rule__BooleanType__Group_2__0"


    // $ANTLR start "rule__BooleanType__Group_2__0__Impl"
    // InternalTextualDataModel.g:3184:1: rule__BooleanType__Group_2__0__Impl : ( '{' ) ;
    public final void rule__BooleanType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3188:1: ( ( '{' ) )
            // InternalTextualDataModel.g:3189:1: ( '{' )
            {
            // InternalTextualDataModel.g:3189:1: ( '{' )
            // InternalTextualDataModel.g:3190:2: '{'
            {
             before(grammarAccess.getBooleanTypeAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBooleanTypeAccess().getLeftCurlyBracketKeyword_2_0()); 

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
    // $ANTLR end "rule__BooleanType__Group_2__0__Impl"


    // $ANTLR start "rule__BooleanType__Group_2__1"
    // InternalTextualDataModel.g:3199:1: rule__BooleanType__Group_2__1 : rule__BooleanType__Group_2__1__Impl rule__BooleanType__Group_2__2 ;
    public final void rule__BooleanType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3203:1: ( rule__BooleanType__Group_2__1__Impl rule__BooleanType__Group_2__2 )
            // InternalTextualDataModel.g:3204:2: rule__BooleanType__Group_2__1__Impl rule__BooleanType__Group_2__2
            {
            pushFollow(FOLLOW_23);
            rule__BooleanType__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanType__Group_2__2();

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
    // $ANTLR end "rule__BooleanType__Group_2__1"


    // $ANTLR start "rule__BooleanType__Group_2__1__Impl"
    // InternalTextualDataModel.g:3211:1: rule__BooleanType__Group_2__1__Impl : ( ( rule__BooleanType__Group_2_1__0 )? ) ;
    public final void rule__BooleanType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3215:1: ( ( ( rule__BooleanType__Group_2_1__0 )? ) )
            // InternalTextualDataModel.g:3216:1: ( ( rule__BooleanType__Group_2_1__0 )? )
            {
            // InternalTextualDataModel.g:3216:1: ( ( rule__BooleanType__Group_2_1__0 )? )
            // InternalTextualDataModel.g:3217:2: ( rule__BooleanType__Group_2_1__0 )?
            {
             before(grammarAccess.getBooleanTypeAccess().getGroup_2_1()); 
            // InternalTextualDataModel.g:3218:2: ( rule__BooleanType__Group_2_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==24) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalTextualDataModel.g:3218:3: rule__BooleanType__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanType__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBooleanTypeAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__BooleanType__Group_2__1__Impl"


    // $ANTLR start "rule__BooleanType__Group_2__2"
    // InternalTextualDataModel.g:3226:1: rule__BooleanType__Group_2__2 : rule__BooleanType__Group_2__2__Impl rule__BooleanType__Group_2__3 ;
    public final void rule__BooleanType__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3230:1: ( rule__BooleanType__Group_2__2__Impl rule__BooleanType__Group_2__3 )
            // InternalTextualDataModel.g:3231:2: rule__BooleanType__Group_2__2__Impl rule__BooleanType__Group_2__3
            {
            pushFollow(FOLLOW_23);
            rule__BooleanType__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanType__Group_2__3();

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
    // $ANTLR end "rule__BooleanType__Group_2__2"


    // $ANTLR start "rule__BooleanType__Group_2__2__Impl"
    // InternalTextualDataModel.g:3238:1: rule__BooleanType__Group_2__2__Impl : ( ( rule__BooleanType__LocalizationsAssignment_2_2 )* ) ;
    public final void rule__BooleanType__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3242:1: ( ( ( rule__BooleanType__LocalizationsAssignment_2_2 )* ) )
            // InternalTextualDataModel.g:3243:1: ( ( rule__BooleanType__LocalizationsAssignment_2_2 )* )
            {
            // InternalTextualDataModel.g:3243:1: ( ( rule__BooleanType__LocalizationsAssignment_2_2 )* )
            // InternalTextualDataModel.g:3244:2: ( rule__BooleanType__LocalizationsAssignment_2_2 )*
            {
             before(grammarAccess.getBooleanTypeAccess().getLocalizationsAssignment_2_2()); 
            // InternalTextualDataModel.g:3245:2: ( rule__BooleanType__LocalizationsAssignment_2_2 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==53) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalTextualDataModel.g:3245:3: rule__BooleanType__LocalizationsAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__BooleanType__LocalizationsAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getBooleanTypeAccess().getLocalizationsAssignment_2_2()); 

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
    // $ANTLR end "rule__BooleanType__Group_2__2__Impl"


    // $ANTLR start "rule__BooleanType__Group_2__3"
    // InternalTextualDataModel.g:3253:1: rule__BooleanType__Group_2__3 : rule__BooleanType__Group_2__3__Impl ;
    public final void rule__BooleanType__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3257:1: ( rule__BooleanType__Group_2__3__Impl )
            // InternalTextualDataModel.g:3258:2: rule__BooleanType__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanType__Group_2__3__Impl();

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
    // $ANTLR end "rule__BooleanType__Group_2__3"


    // $ANTLR start "rule__BooleanType__Group_2__3__Impl"
    // InternalTextualDataModel.g:3264:1: rule__BooleanType__Group_2__3__Impl : ( '}' ) ;
    public final void rule__BooleanType__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3268:1: ( ( '}' ) )
            // InternalTextualDataModel.g:3269:1: ( '}' )
            {
            // InternalTextualDataModel.g:3269:1: ( '}' )
            // InternalTextualDataModel.g:3270:2: '}'
            {
             before(grammarAccess.getBooleanTypeAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBooleanTypeAccess().getRightCurlyBracketKeyword_2_3()); 

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
    // $ANTLR end "rule__BooleanType__Group_2__3__Impl"


    // $ANTLR start "rule__BooleanType__Group_2_1__0"
    // InternalTextualDataModel.g:3280:1: rule__BooleanType__Group_2_1__0 : rule__BooleanType__Group_2_1__0__Impl rule__BooleanType__Group_2_1__1 ;
    public final void rule__BooleanType__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3284:1: ( rule__BooleanType__Group_2_1__0__Impl rule__BooleanType__Group_2_1__1 )
            // InternalTextualDataModel.g:3285:2: rule__BooleanType__Group_2_1__0__Impl rule__BooleanType__Group_2_1__1
            {
            pushFollow(FOLLOW_10);
            rule__BooleanType__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanType__Group_2_1__1();

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
    // $ANTLR end "rule__BooleanType__Group_2_1__0"


    // $ANTLR start "rule__BooleanType__Group_2_1__0__Impl"
    // InternalTextualDataModel.g:3292:1: rule__BooleanType__Group_2_1__0__Impl : ( '@description' ) ;
    public final void rule__BooleanType__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3296:1: ( ( '@description' ) )
            // InternalTextualDataModel.g:3297:1: ( '@description' )
            {
            // InternalTextualDataModel.g:3297:1: ( '@description' )
            // InternalTextualDataModel.g:3298:2: '@description'
            {
             before(grammarAccess.getBooleanTypeAccess().getDescriptionKeyword_2_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBooleanTypeAccess().getDescriptionKeyword_2_1_0()); 

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
    // $ANTLR end "rule__BooleanType__Group_2_1__0__Impl"


    // $ANTLR start "rule__BooleanType__Group_2_1__1"
    // InternalTextualDataModel.g:3307:1: rule__BooleanType__Group_2_1__1 : rule__BooleanType__Group_2_1__1__Impl rule__BooleanType__Group_2_1__2 ;
    public final void rule__BooleanType__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3311:1: ( rule__BooleanType__Group_2_1__1__Impl rule__BooleanType__Group_2_1__2 )
            // InternalTextualDataModel.g:3312:2: rule__BooleanType__Group_2_1__1__Impl rule__BooleanType__Group_2_1__2
            {
            pushFollow(FOLLOW_3);
            rule__BooleanType__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanType__Group_2_1__2();

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
    // $ANTLR end "rule__BooleanType__Group_2_1__1"


    // $ANTLR start "rule__BooleanType__Group_2_1__1__Impl"
    // InternalTextualDataModel.g:3319:1: rule__BooleanType__Group_2_1__1__Impl : ( '(' ) ;
    public final void rule__BooleanType__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3323:1: ( ( '(' ) )
            // InternalTextualDataModel.g:3324:1: ( '(' )
            {
            // InternalTextualDataModel.g:3324:1: ( '(' )
            // InternalTextualDataModel.g:3325:2: '('
            {
             before(grammarAccess.getBooleanTypeAccess().getLeftParenthesisKeyword_2_1_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getBooleanTypeAccess().getLeftParenthesisKeyword_2_1_1()); 

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
    // $ANTLR end "rule__BooleanType__Group_2_1__1__Impl"


    // $ANTLR start "rule__BooleanType__Group_2_1__2"
    // InternalTextualDataModel.g:3334:1: rule__BooleanType__Group_2_1__2 : rule__BooleanType__Group_2_1__2__Impl rule__BooleanType__Group_2_1__3 ;
    public final void rule__BooleanType__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3338:1: ( rule__BooleanType__Group_2_1__2__Impl rule__BooleanType__Group_2_1__3 )
            // InternalTextualDataModel.g:3339:2: rule__BooleanType__Group_2_1__2__Impl rule__BooleanType__Group_2_1__3
            {
            pushFollow(FOLLOW_11);
            rule__BooleanType__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanType__Group_2_1__3();

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
    // $ANTLR end "rule__BooleanType__Group_2_1__2"


    // $ANTLR start "rule__BooleanType__Group_2_1__2__Impl"
    // InternalTextualDataModel.g:3346:1: rule__BooleanType__Group_2_1__2__Impl : ( ( rule__BooleanType__DescriptionAssignment_2_1_2 ) ) ;
    public final void rule__BooleanType__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3350:1: ( ( ( rule__BooleanType__DescriptionAssignment_2_1_2 ) ) )
            // InternalTextualDataModel.g:3351:1: ( ( rule__BooleanType__DescriptionAssignment_2_1_2 ) )
            {
            // InternalTextualDataModel.g:3351:1: ( ( rule__BooleanType__DescriptionAssignment_2_1_2 ) )
            // InternalTextualDataModel.g:3352:2: ( rule__BooleanType__DescriptionAssignment_2_1_2 )
            {
             before(grammarAccess.getBooleanTypeAccess().getDescriptionAssignment_2_1_2()); 
            // InternalTextualDataModel.g:3353:2: ( rule__BooleanType__DescriptionAssignment_2_1_2 )
            // InternalTextualDataModel.g:3353:3: rule__BooleanType__DescriptionAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__BooleanType__DescriptionAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getBooleanTypeAccess().getDescriptionAssignment_2_1_2()); 

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
    // $ANTLR end "rule__BooleanType__Group_2_1__2__Impl"


    // $ANTLR start "rule__BooleanType__Group_2_1__3"
    // InternalTextualDataModel.g:3361:1: rule__BooleanType__Group_2_1__3 : rule__BooleanType__Group_2_1__3__Impl ;
    public final void rule__BooleanType__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3365:1: ( rule__BooleanType__Group_2_1__3__Impl )
            // InternalTextualDataModel.g:3366:2: rule__BooleanType__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanType__Group_2_1__3__Impl();

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
    // $ANTLR end "rule__BooleanType__Group_2_1__3"


    // $ANTLR start "rule__BooleanType__Group_2_1__3__Impl"
    // InternalTextualDataModel.g:3372:1: rule__BooleanType__Group_2_1__3__Impl : ( ')' ) ;
    public final void rule__BooleanType__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3376:1: ( ( ')' ) )
            // InternalTextualDataModel.g:3377:1: ( ')' )
            {
            // InternalTextualDataModel.g:3377:1: ( ')' )
            // InternalTextualDataModel.g:3378:2: ')'
            {
             before(grammarAccess.getBooleanTypeAccess().getRightParenthesisKeyword_2_1_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBooleanTypeAccess().getRightParenthesisKeyword_2_1_3()); 

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
    // $ANTLR end "rule__BooleanType__Group_2_1__3__Impl"


    // $ANTLR start "rule__StringType__Group__0"
    // InternalTextualDataModel.g:3388:1: rule__StringType__Group__0 : rule__StringType__Group__0__Impl rule__StringType__Group__1 ;
    public final void rule__StringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3392:1: ( rule__StringType__Group__0__Impl rule__StringType__Group__1 )
            // InternalTextualDataModel.g:3393:2: rule__StringType__Group__0__Impl rule__StringType__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__StringType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group__1();

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
    // $ANTLR end "rule__StringType__Group__0"


    // $ANTLR start "rule__StringType__Group__0__Impl"
    // InternalTextualDataModel.g:3400:1: rule__StringType__Group__0__Impl : ( 'StringType' ) ;
    public final void rule__StringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3404:1: ( ( 'StringType' ) )
            // InternalTextualDataModel.g:3405:1: ( 'StringType' )
            {
            // InternalTextualDataModel.g:3405:1: ( 'StringType' )
            // InternalTextualDataModel.g:3406:2: 'StringType'
            {
             before(grammarAccess.getStringTypeAccess().getStringTypeKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getStringTypeKeyword_0()); 

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
    // $ANTLR end "rule__StringType__Group__0__Impl"


    // $ANTLR start "rule__StringType__Group__1"
    // InternalTextualDataModel.g:3415:1: rule__StringType__Group__1 : rule__StringType__Group__1__Impl rule__StringType__Group__2 ;
    public final void rule__StringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3419:1: ( rule__StringType__Group__1__Impl rule__StringType__Group__2 )
            // InternalTextualDataModel.g:3420:2: rule__StringType__Group__1__Impl rule__StringType__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__StringType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group__2();

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
    // $ANTLR end "rule__StringType__Group__1"


    // $ANTLR start "rule__StringType__Group__1__Impl"
    // InternalTextualDataModel.g:3427:1: rule__StringType__Group__1__Impl : ( ( rule__StringType__NameAssignment_1 ) ) ;
    public final void rule__StringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3431:1: ( ( ( rule__StringType__NameAssignment_1 ) ) )
            // InternalTextualDataModel.g:3432:1: ( ( rule__StringType__NameAssignment_1 ) )
            {
            // InternalTextualDataModel.g:3432:1: ( ( rule__StringType__NameAssignment_1 ) )
            // InternalTextualDataModel.g:3433:2: ( rule__StringType__NameAssignment_1 )
            {
             before(grammarAccess.getStringTypeAccess().getNameAssignment_1()); 
            // InternalTextualDataModel.g:3434:2: ( rule__StringType__NameAssignment_1 )
            // InternalTextualDataModel.g:3434:3: rule__StringType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StringType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__StringType__Group__1__Impl"


    // $ANTLR start "rule__StringType__Group__2"
    // InternalTextualDataModel.g:3442:1: rule__StringType__Group__2 : rule__StringType__Group__2__Impl ;
    public final void rule__StringType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3446:1: ( rule__StringType__Group__2__Impl )
            // InternalTextualDataModel.g:3447:2: rule__StringType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringType__Group__2__Impl();

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
    // $ANTLR end "rule__StringType__Group__2"


    // $ANTLR start "rule__StringType__Group__2__Impl"
    // InternalTextualDataModel.g:3453:1: rule__StringType__Group__2__Impl : ( ( rule__StringType__Group_2__0 )? ) ;
    public final void rule__StringType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3457:1: ( ( ( rule__StringType__Group_2__0 )? ) )
            // InternalTextualDataModel.g:3458:1: ( ( rule__StringType__Group_2__0 )? )
            {
            // InternalTextualDataModel.g:3458:1: ( ( rule__StringType__Group_2__0 )? )
            // InternalTextualDataModel.g:3459:2: ( rule__StringType__Group_2__0 )?
            {
             before(grammarAccess.getStringTypeAccess().getGroup_2()); 
            // InternalTextualDataModel.g:3460:2: ( rule__StringType__Group_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==22) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalTextualDataModel.g:3460:3: rule__StringType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringTypeAccess().getGroup_2()); 

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
    // $ANTLR end "rule__StringType__Group__2__Impl"


    // $ANTLR start "rule__StringType__Group_2__0"
    // InternalTextualDataModel.g:3469:1: rule__StringType__Group_2__0 : rule__StringType__Group_2__0__Impl rule__StringType__Group_2__1 ;
    public final void rule__StringType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3473:1: ( rule__StringType__Group_2__0__Impl rule__StringType__Group_2__1 )
            // InternalTextualDataModel.g:3474:2: rule__StringType__Group_2__0__Impl rule__StringType__Group_2__1
            {
            pushFollow(FOLLOW_27);
            rule__StringType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group_2__1();

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
    // $ANTLR end "rule__StringType__Group_2__0"


    // $ANTLR start "rule__StringType__Group_2__0__Impl"
    // InternalTextualDataModel.g:3481:1: rule__StringType__Group_2__0__Impl : ( '{' ) ;
    public final void rule__StringType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3485:1: ( ( '{' ) )
            // InternalTextualDataModel.g:3486:1: ( '{' )
            {
            // InternalTextualDataModel.g:3486:1: ( '{' )
            // InternalTextualDataModel.g:3487:2: '{'
            {
             before(grammarAccess.getStringTypeAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getLeftCurlyBracketKeyword_2_0()); 

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
    // $ANTLR end "rule__StringType__Group_2__0__Impl"


    // $ANTLR start "rule__StringType__Group_2__1"
    // InternalTextualDataModel.g:3496:1: rule__StringType__Group_2__1 : rule__StringType__Group_2__1__Impl rule__StringType__Group_2__2 ;
    public final void rule__StringType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3500:1: ( rule__StringType__Group_2__1__Impl rule__StringType__Group_2__2 )
            // InternalTextualDataModel.g:3501:2: rule__StringType__Group_2__1__Impl rule__StringType__Group_2__2
            {
            pushFollow(FOLLOW_27);
            rule__StringType__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group_2__2();

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
    // $ANTLR end "rule__StringType__Group_2__1"


    // $ANTLR start "rule__StringType__Group_2__1__Impl"
    // InternalTextualDataModel.g:3508:1: rule__StringType__Group_2__1__Impl : ( ( rule__StringType__Group_2_1__0 )? ) ;
    public final void rule__StringType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3512:1: ( ( ( rule__StringType__Group_2_1__0 )? ) )
            // InternalTextualDataModel.g:3513:1: ( ( rule__StringType__Group_2_1__0 )? )
            {
            // InternalTextualDataModel.g:3513:1: ( ( rule__StringType__Group_2_1__0 )? )
            // InternalTextualDataModel.g:3514:2: ( rule__StringType__Group_2_1__0 )?
            {
             before(grammarAccess.getStringTypeAccess().getGroup_2_1()); 
            // InternalTextualDataModel.g:3515:2: ( rule__StringType__Group_2_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==24) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalTextualDataModel.g:3515:3: rule__StringType__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringType__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringTypeAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__StringType__Group_2__1__Impl"


    // $ANTLR start "rule__StringType__Group_2__2"
    // InternalTextualDataModel.g:3523:1: rule__StringType__Group_2__2 : rule__StringType__Group_2__2__Impl rule__StringType__Group_2__3 ;
    public final void rule__StringType__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3527:1: ( rule__StringType__Group_2__2__Impl rule__StringType__Group_2__3 )
            // InternalTextualDataModel.g:3528:2: rule__StringType__Group_2__2__Impl rule__StringType__Group_2__3
            {
            pushFollow(FOLLOW_27);
            rule__StringType__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group_2__3();

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
    // $ANTLR end "rule__StringType__Group_2__2"


    // $ANTLR start "rule__StringType__Group_2__2__Impl"
    // InternalTextualDataModel.g:3535:1: rule__StringType__Group_2__2__Impl : ( ( rule__StringType__LocalizationsAssignment_2_2 )* ) ;
    public final void rule__StringType__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3539:1: ( ( ( rule__StringType__LocalizationsAssignment_2_2 )* ) )
            // InternalTextualDataModel.g:3540:1: ( ( rule__StringType__LocalizationsAssignment_2_2 )* )
            {
            // InternalTextualDataModel.g:3540:1: ( ( rule__StringType__LocalizationsAssignment_2_2 )* )
            // InternalTextualDataModel.g:3541:2: ( rule__StringType__LocalizationsAssignment_2_2 )*
            {
             before(grammarAccess.getStringTypeAccess().getLocalizationsAssignment_2_2()); 
            // InternalTextualDataModel.g:3542:2: ( rule__StringType__LocalizationsAssignment_2_2 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==53) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalTextualDataModel.g:3542:3: rule__StringType__LocalizationsAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__StringType__LocalizationsAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getStringTypeAccess().getLocalizationsAssignment_2_2()); 

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
    // $ANTLR end "rule__StringType__Group_2__2__Impl"


    // $ANTLR start "rule__StringType__Group_2__3"
    // InternalTextualDataModel.g:3550:1: rule__StringType__Group_2__3 : rule__StringType__Group_2__3__Impl rule__StringType__Group_2__4 ;
    public final void rule__StringType__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3554:1: ( rule__StringType__Group_2__3__Impl rule__StringType__Group_2__4 )
            // InternalTextualDataModel.g:3555:2: rule__StringType__Group_2__3__Impl rule__StringType__Group_2__4
            {
            pushFollow(FOLLOW_27);
            rule__StringType__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group_2__4();

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
    // $ANTLR end "rule__StringType__Group_2__3"


    // $ANTLR start "rule__StringType__Group_2__3__Impl"
    // InternalTextualDataModel.g:3562:1: rule__StringType__Group_2__3__Impl : ( ( rule__StringType__Group_2_3__0 )? ) ;
    public final void rule__StringType__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3566:1: ( ( ( rule__StringType__Group_2_3__0 )? ) )
            // InternalTextualDataModel.g:3567:1: ( ( rule__StringType__Group_2_3__0 )? )
            {
            // InternalTextualDataModel.g:3567:1: ( ( rule__StringType__Group_2_3__0 )? )
            // InternalTextualDataModel.g:3568:2: ( rule__StringType__Group_2_3__0 )?
            {
             before(grammarAccess.getStringTypeAccess().getGroup_2_3()); 
            // InternalTextualDataModel.g:3569:2: ( rule__StringType__Group_2_3__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==37) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalTextualDataModel.g:3569:3: rule__StringType__Group_2_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringType__Group_2_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringTypeAccess().getGroup_2_3()); 

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
    // $ANTLR end "rule__StringType__Group_2__3__Impl"


    // $ANTLR start "rule__StringType__Group_2__4"
    // InternalTextualDataModel.g:3577:1: rule__StringType__Group_2__4 : rule__StringType__Group_2__4__Impl rule__StringType__Group_2__5 ;
    public final void rule__StringType__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3581:1: ( rule__StringType__Group_2__4__Impl rule__StringType__Group_2__5 )
            // InternalTextualDataModel.g:3582:2: rule__StringType__Group_2__4__Impl rule__StringType__Group_2__5
            {
            pushFollow(FOLLOW_27);
            rule__StringType__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group_2__5();

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
    // $ANTLR end "rule__StringType__Group_2__4"


    // $ANTLR start "rule__StringType__Group_2__4__Impl"
    // InternalTextualDataModel.g:3589:1: rule__StringType__Group_2__4__Impl : ( ( rule__StringType__Group_2_4__0 )? ) ;
    public final void rule__StringType__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3593:1: ( ( ( rule__StringType__Group_2_4__0 )? ) )
            // InternalTextualDataModel.g:3594:1: ( ( rule__StringType__Group_2_4__0 )? )
            {
            // InternalTextualDataModel.g:3594:1: ( ( rule__StringType__Group_2_4__0 )? )
            // InternalTextualDataModel.g:3595:2: ( rule__StringType__Group_2_4__0 )?
            {
             before(grammarAccess.getStringTypeAccess().getGroup_2_4()); 
            // InternalTextualDataModel.g:3596:2: ( rule__StringType__Group_2_4__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==38) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalTextualDataModel.g:3596:3: rule__StringType__Group_2_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringType__Group_2_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringTypeAccess().getGroup_2_4()); 

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
    // $ANTLR end "rule__StringType__Group_2__4__Impl"


    // $ANTLR start "rule__StringType__Group_2__5"
    // InternalTextualDataModel.g:3604:1: rule__StringType__Group_2__5 : rule__StringType__Group_2__5__Impl rule__StringType__Group_2__6 ;
    public final void rule__StringType__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3608:1: ( rule__StringType__Group_2__5__Impl rule__StringType__Group_2__6 )
            // InternalTextualDataModel.g:3609:2: rule__StringType__Group_2__5__Impl rule__StringType__Group_2__6
            {
            pushFollow(FOLLOW_27);
            rule__StringType__Group_2__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group_2__6();

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
    // $ANTLR end "rule__StringType__Group_2__5"


    // $ANTLR start "rule__StringType__Group_2__5__Impl"
    // InternalTextualDataModel.g:3616:1: rule__StringType__Group_2__5__Impl : ( ( rule__StringType__Group_2_5__0 )? ) ;
    public final void rule__StringType__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3620:1: ( ( ( rule__StringType__Group_2_5__0 )? ) )
            // InternalTextualDataModel.g:3621:1: ( ( rule__StringType__Group_2_5__0 )? )
            {
            // InternalTextualDataModel.g:3621:1: ( ( rule__StringType__Group_2_5__0 )? )
            // InternalTextualDataModel.g:3622:2: ( rule__StringType__Group_2_5__0 )?
            {
             before(grammarAccess.getStringTypeAccess().getGroup_2_5()); 
            // InternalTextualDataModel.g:3623:2: ( rule__StringType__Group_2_5__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==39) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalTextualDataModel.g:3623:3: rule__StringType__Group_2_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringType__Group_2_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringTypeAccess().getGroup_2_5()); 

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
    // $ANTLR end "rule__StringType__Group_2__5__Impl"


    // $ANTLR start "rule__StringType__Group_2__6"
    // InternalTextualDataModel.g:3631:1: rule__StringType__Group_2__6 : rule__StringType__Group_2__6__Impl rule__StringType__Group_2__7 ;
    public final void rule__StringType__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3635:1: ( rule__StringType__Group_2__6__Impl rule__StringType__Group_2__7 )
            // InternalTextualDataModel.g:3636:2: rule__StringType__Group_2__6__Impl rule__StringType__Group_2__7
            {
            pushFollow(FOLLOW_27);
            rule__StringType__Group_2__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group_2__7();

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
    // $ANTLR end "rule__StringType__Group_2__6"


    // $ANTLR start "rule__StringType__Group_2__6__Impl"
    // InternalTextualDataModel.g:3643:1: rule__StringType__Group_2__6__Impl : ( ( rule__StringType__Group_2_6__0 )? ) ;
    public final void rule__StringType__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3647:1: ( ( ( rule__StringType__Group_2_6__0 )? ) )
            // InternalTextualDataModel.g:3648:1: ( ( rule__StringType__Group_2_6__0 )? )
            {
            // InternalTextualDataModel.g:3648:1: ( ( rule__StringType__Group_2_6__0 )? )
            // InternalTextualDataModel.g:3649:2: ( rule__StringType__Group_2_6__0 )?
            {
             before(grammarAccess.getStringTypeAccess().getGroup_2_6()); 
            // InternalTextualDataModel.g:3650:2: ( rule__StringType__Group_2_6__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==40) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalTextualDataModel.g:3650:3: rule__StringType__Group_2_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringType__Group_2_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringTypeAccess().getGroup_2_6()); 

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
    // $ANTLR end "rule__StringType__Group_2__6__Impl"


    // $ANTLR start "rule__StringType__Group_2__7"
    // InternalTextualDataModel.g:3658:1: rule__StringType__Group_2__7 : rule__StringType__Group_2__7__Impl ;
    public final void rule__StringType__Group_2__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3662:1: ( rule__StringType__Group_2__7__Impl )
            // InternalTextualDataModel.g:3663:2: rule__StringType__Group_2__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringType__Group_2__7__Impl();

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
    // $ANTLR end "rule__StringType__Group_2__7"


    // $ANTLR start "rule__StringType__Group_2__7__Impl"
    // InternalTextualDataModel.g:3669:1: rule__StringType__Group_2__7__Impl : ( '}' ) ;
    public final void rule__StringType__Group_2__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3673:1: ( ( '}' ) )
            // InternalTextualDataModel.g:3674:1: ( '}' )
            {
            // InternalTextualDataModel.g:3674:1: ( '}' )
            // InternalTextualDataModel.g:3675:2: '}'
            {
             before(grammarAccess.getStringTypeAccess().getRightCurlyBracketKeyword_2_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getRightCurlyBracketKeyword_2_7()); 

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
    // $ANTLR end "rule__StringType__Group_2__7__Impl"


    // $ANTLR start "rule__StringType__Group_2_1__0"
    // InternalTextualDataModel.g:3685:1: rule__StringType__Group_2_1__0 : rule__StringType__Group_2_1__0__Impl rule__StringType__Group_2_1__1 ;
    public final void rule__StringType__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3689:1: ( rule__StringType__Group_2_1__0__Impl rule__StringType__Group_2_1__1 )
            // InternalTextualDataModel.g:3690:2: rule__StringType__Group_2_1__0__Impl rule__StringType__Group_2_1__1
            {
            pushFollow(FOLLOW_10);
            rule__StringType__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group_2_1__1();

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
    // $ANTLR end "rule__StringType__Group_2_1__0"


    // $ANTLR start "rule__StringType__Group_2_1__0__Impl"
    // InternalTextualDataModel.g:3697:1: rule__StringType__Group_2_1__0__Impl : ( '@description' ) ;
    public final void rule__StringType__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3701:1: ( ( '@description' ) )
            // InternalTextualDataModel.g:3702:1: ( '@description' )
            {
            // InternalTextualDataModel.g:3702:1: ( '@description' )
            // InternalTextualDataModel.g:3703:2: '@description'
            {
             before(grammarAccess.getStringTypeAccess().getDescriptionKeyword_2_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getDescriptionKeyword_2_1_0()); 

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
    // $ANTLR end "rule__StringType__Group_2_1__0__Impl"


    // $ANTLR start "rule__StringType__Group_2_1__1"
    // InternalTextualDataModel.g:3712:1: rule__StringType__Group_2_1__1 : rule__StringType__Group_2_1__1__Impl rule__StringType__Group_2_1__2 ;
    public final void rule__StringType__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3716:1: ( rule__StringType__Group_2_1__1__Impl rule__StringType__Group_2_1__2 )
            // InternalTextualDataModel.g:3717:2: rule__StringType__Group_2_1__1__Impl rule__StringType__Group_2_1__2
            {
            pushFollow(FOLLOW_3);
            rule__StringType__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group_2_1__2();

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
    // $ANTLR end "rule__StringType__Group_2_1__1"


    // $ANTLR start "rule__StringType__Group_2_1__1__Impl"
    // InternalTextualDataModel.g:3724:1: rule__StringType__Group_2_1__1__Impl : ( '(' ) ;
    public final void rule__StringType__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3728:1: ( ( '(' ) )
            // InternalTextualDataModel.g:3729:1: ( '(' )
            {
            // InternalTextualDataModel.g:3729:1: ( '(' )
            // InternalTextualDataModel.g:3730:2: '('
            {
             before(grammarAccess.getStringTypeAccess().getLeftParenthesisKeyword_2_1_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getLeftParenthesisKeyword_2_1_1()); 

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
    // $ANTLR end "rule__StringType__Group_2_1__1__Impl"


    // $ANTLR start "rule__StringType__Group_2_1__2"
    // InternalTextualDataModel.g:3739:1: rule__StringType__Group_2_1__2 : rule__StringType__Group_2_1__2__Impl rule__StringType__Group_2_1__3 ;
    public final void rule__StringType__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3743:1: ( rule__StringType__Group_2_1__2__Impl rule__StringType__Group_2_1__3 )
            // InternalTextualDataModel.g:3744:2: rule__StringType__Group_2_1__2__Impl rule__StringType__Group_2_1__3
            {
            pushFollow(FOLLOW_11);
            rule__StringType__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group_2_1__3();

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
    // $ANTLR end "rule__StringType__Group_2_1__2"


    // $ANTLR start "rule__StringType__Group_2_1__2__Impl"
    // InternalTextualDataModel.g:3751:1: rule__StringType__Group_2_1__2__Impl : ( ( rule__StringType__DescriptionAssignment_2_1_2 ) ) ;
    public final void rule__StringType__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3755:1: ( ( ( rule__StringType__DescriptionAssignment_2_1_2 ) ) )
            // InternalTextualDataModel.g:3756:1: ( ( rule__StringType__DescriptionAssignment_2_1_2 ) )
            {
            // InternalTextualDataModel.g:3756:1: ( ( rule__StringType__DescriptionAssignment_2_1_2 ) )
            // InternalTextualDataModel.g:3757:2: ( rule__StringType__DescriptionAssignment_2_1_2 )
            {
             before(grammarAccess.getStringTypeAccess().getDescriptionAssignment_2_1_2()); 
            // InternalTextualDataModel.g:3758:2: ( rule__StringType__DescriptionAssignment_2_1_2 )
            // InternalTextualDataModel.g:3758:3: rule__StringType__DescriptionAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__StringType__DescriptionAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getDescriptionAssignment_2_1_2()); 

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
    // $ANTLR end "rule__StringType__Group_2_1__2__Impl"


    // $ANTLR start "rule__StringType__Group_2_1__3"
    // InternalTextualDataModel.g:3766:1: rule__StringType__Group_2_1__3 : rule__StringType__Group_2_1__3__Impl ;
    public final void rule__StringType__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3770:1: ( rule__StringType__Group_2_1__3__Impl )
            // InternalTextualDataModel.g:3771:2: rule__StringType__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringType__Group_2_1__3__Impl();

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
    // $ANTLR end "rule__StringType__Group_2_1__3"


    // $ANTLR start "rule__StringType__Group_2_1__3__Impl"
    // InternalTextualDataModel.g:3777:1: rule__StringType__Group_2_1__3__Impl : ( ')' ) ;
    public final void rule__StringType__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3781:1: ( ( ')' ) )
            // InternalTextualDataModel.g:3782:1: ( ')' )
            {
            // InternalTextualDataModel.g:3782:1: ( ')' )
            // InternalTextualDataModel.g:3783:2: ')'
            {
             before(grammarAccess.getStringTypeAccess().getRightParenthesisKeyword_2_1_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getRightParenthesisKeyword_2_1_3()); 

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
    // $ANTLR end "rule__StringType__Group_2_1__3__Impl"


    // $ANTLR start "rule__StringType__Group_2_3__0"
    // InternalTextualDataModel.g:3793:1: rule__StringType__Group_2_3__0 : rule__StringType__Group_2_3__0__Impl rule__StringType__Group_2_3__1 ;
    public final void rule__StringType__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3797:1: ( rule__StringType__Group_2_3__0__Impl rule__StringType__Group_2_3__1 )
            // InternalTextualDataModel.g:3798:2: rule__StringType__Group_2_3__0__Impl rule__StringType__Group_2_3__1
            {
            pushFollow(FOLLOW_19);
            rule__StringType__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group_2_3__1();

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
    // $ANTLR end "rule__StringType__Group_2_3__0"


    // $ANTLR start "rule__StringType__Group_2_3__0__Impl"
    // InternalTextualDataModel.g:3805:1: rule__StringType__Group_2_3__0__Impl : ( 'length' ) ;
    public final void rule__StringType__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3809:1: ( ( 'length' ) )
            // InternalTextualDataModel.g:3810:1: ( 'length' )
            {
            // InternalTextualDataModel.g:3810:1: ( 'length' )
            // InternalTextualDataModel.g:3811:2: 'length'
            {
             before(grammarAccess.getStringTypeAccess().getLengthKeyword_2_3_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getLengthKeyword_2_3_0()); 

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
    // $ANTLR end "rule__StringType__Group_2_3__0__Impl"


    // $ANTLR start "rule__StringType__Group_2_3__1"
    // InternalTextualDataModel.g:3820:1: rule__StringType__Group_2_3__1 : rule__StringType__Group_2_3__1__Impl ;
    public final void rule__StringType__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3824:1: ( rule__StringType__Group_2_3__1__Impl )
            // InternalTextualDataModel.g:3825:2: rule__StringType__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringType__Group_2_3__1__Impl();

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
    // $ANTLR end "rule__StringType__Group_2_3__1"


    // $ANTLR start "rule__StringType__Group_2_3__1__Impl"
    // InternalTextualDataModel.g:3831:1: rule__StringType__Group_2_3__1__Impl : ( ( rule__StringType__LengthAssignment_2_3_1 ) ) ;
    public final void rule__StringType__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3835:1: ( ( ( rule__StringType__LengthAssignment_2_3_1 ) ) )
            // InternalTextualDataModel.g:3836:1: ( ( rule__StringType__LengthAssignment_2_3_1 ) )
            {
            // InternalTextualDataModel.g:3836:1: ( ( rule__StringType__LengthAssignment_2_3_1 ) )
            // InternalTextualDataModel.g:3837:2: ( rule__StringType__LengthAssignment_2_3_1 )
            {
             before(grammarAccess.getStringTypeAccess().getLengthAssignment_2_3_1()); 
            // InternalTextualDataModel.g:3838:2: ( rule__StringType__LengthAssignment_2_3_1 )
            // InternalTextualDataModel.g:3838:3: rule__StringType__LengthAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__StringType__LengthAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getLengthAssignment_2_3_1()); 

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
    // $ANTLR end "rule__StringType__Group_2_3__1__Impl"


    // $ANTLR start "rule__StringType__Group_2_4__0"
    // InternalTextualDataModel.g:3847:1: rule__StringType__Group_2_4__0 : rule__StringType__Group_2_4__0__Impl rule__StringType__Group_2_4__1 ;
    public final void rule__StringType__Group_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3851:1: ( rule__StringType__Group_2_4__0__Impl rule__StringType__Group_2_4__1 )
            // InternalTextualDataModel.g:3852:2: rule__StringType__Group_2_4__0__Impl rule__StringType__Group_2_4__1
            {
            pushFollow(FOLLOW_19);
            rule__StringType__Group_2_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group_2_4__1();

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
    // $ANTLR end "rule__StringType__Group_2_4__0"


    // $ANTLR start "rule__StringType__Group_2_4__0__Impl"
    // InternalTextualDataModel.g:3859:1: rule__StringType__Group_2_4__0__Impl : ( 'minLength' ) ;
    public final void rule__StringType__Group_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3863:1: ( ( 'minLength' ) )
            // InternalTextualDataModel.g:3864:1: ( 'minLength' )
            {
            // InternalTextualDataModel.g:3864:1: ( 'minLength' )
            // InternalTextualDataModel.g:3865:2: 'minLength'
            {
             before(grammarAccess.getStringTypeAccess().getMinLengthKeyword_2_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getMinLengthKeyword_2_4_0()); 

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
    // $ANTLR end "rule__StringType__Group_2_4__0__Impl"


    // $ANTLR start "rule__StringType__Group_2_4__1"
    // InternalTextualDataModel.g:3874:1: rule__StringType__Group_2_4__1 : rule__StringType__Group_2_4__1__Impl ;
    public final void rule__StringType__Group_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3878:1: ( rule__StringType__Group_2_4__1__Impl )
            // InternalTextualDataModel.g:3879:2: rule__StringType__Group_2_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringType__Group_2_4__1__Impl();

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
    // $ANTLR end "rule__StringType__Group_2_4__1"


    // $ANTLR start "rule__StringType__Group_2_4__1__Impl"
    // InternalTextualDataModel.g:3885:1: rule__StringType__Group_2_4__1__Impl : ( ( rule__StringType__MinLengthAssignment_2_4_1 ) ) ;
    public final void rule__StringType__Group_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3889:1: ( ( ( rule__StringType__MinLengthAssignment_2_4_1 ) ) )
            // InternalTextualDataModel.g:3890:1: ( ( rule__StringType__MinLengthAssignment_2_4_1 ) )
            {
            // InternalTextualDataModel.g:3890:1: ( ( rule__StringType__MinLengthAssignment_2_4_1 ) )
            // InternalTextualDataModel.g:3891:2: ( rule__StringType__MinLengthAssignment_2_4_1 )
            {
             before(grammarAccess.getStringTypeAccess().getMinLengthAssignment_2_4_1()); 
            // InternalTextualDataModel.g:3892:2: ( rule__StringType__MinLengthAssignment_2_4_1 )
            // InternalTextualDataModel.g:3892:3: rule__StringType__MinLengthAssignment_2_4_1
            {
            pushFollow(FOLLOW_2);
            rule__StringType__MinLengthAssignment_2_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getMinLengthAssignment_2_4_1()); 

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
    // $ANTLR end "rule__StringType__Group_2_4__1__Impl"


    // $ANTLR start "rule__StringType__Group_2_5__0"
    // InternalTextualDataModel.g:3901:1: rule__StringType__Group_2_5__0 : rule__StringType__Group_2_5__0__Impl rule__StringType__Group_2_5__1 ;
    public final void rule__StringType__Group_2_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3905:1: ( rule__StringType__Group_2_5__0__Impl rule__StringType__Group_2_5__1 )
            // InternalTextualDataModel.g:3906:2: rule__StringType__Group_2_5__0__Impl rule__StringType__Group_2_5__1
            {
            pushFollow(FOLLOW_19);
            rule__StringType__Group_2_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group_2_5__1();

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
    // $ANTLR end "rule__StringType__Group_2_5__0"


    // $ANTLR start "rule__StringType__Group_2_5__0__Impl"
    // InternalTextualDataModel.g:3913:1: rule__StringType__Group_2_5__0__Impl : ( 'maxLength' ) ;
    public final void rule__StringType__Group_2_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3917:1: ( ( 'maxLength' ) )
            // InternalTextualDataModel.g:3918:1: ( 'maxLength' )
            {
            // InternalTextualDataModel.g:3918:1: ( 'maxLength' )
            // InternalTextualDataModel.g:3919:2: 'maxLength'
            {
             before(grammarAccess.getStringTypeAccess().getMaxLengthKeyword_2_5_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getMaxLengthKeyword_2_5_0()); 

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
    // $ANTLR end "rule__StringType__Group_2_5__0__Impl"


    // $ANTLR start "rule__StringType__Group_2_5__1"
    // InternalTextualDataModel.g:3928:1: rule__StringType__Group_2_5__1 : rule__StringType__Group_2_5__1__Impl ;
    public final void rule__StringType__Group_2_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3932:1: ( rule__StringType__Group_2_5__1__Impl )
            // InternalTextualDataModel.g:3933:2: rule__StringType__Group_2_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringType__Group_2_5__1__Impl();

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
    // $ANTLR end "rule__StringType__Group_2_5__1"


    // $ANTLR start "rule__StringType__Group_2_5__1__Impl"
    // InternalTextualDataModel.g:3939:1: rule__StringType__Group_2_5__1__Impl : ( ( rule__StringType__MaxLengthAssignment_2_5_1 ) ) ;
    public final void rule__StringType__Group_2_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3943:1: ( ( ( rule__StringType__MaxLengthAssignment_2_5_1 ) ) )
            // InternalTextualDataModel.g:3944:1: ( ( rule__StringType__MaxLengthAssignment_2_5_1 ) )
            {
            // InternalTextualDataModel.g:3944:1: ( ( rule__StringType__MaxLengthAssignment_2_5_1 ) )
            // InternalTextualDataModel.g:3945:2: ( rule__StringType__MaxLengthAssignment_2_5_1 )
            {
             before(grammarAccess.getStringTypeAccess().getMaxLengthAssignment_2_5_1()); 
            // InternalTextualDataModel.g:3946:2: ( rule__StringType__MaxLengthAssignment_2_5_1 )
            // InternalTextualDataModel.g:3946:3: rule__StringType__MaxLengthAssignment_2_5_1
            {
            pushFollow(FOLLOW_2);
            rule__StringType__MaxLengthAssignment_2_5_1();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getMaxLengthAssignment_2_5_1()); 

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
    // $ANTLR end "rule__StringType__Group_2_5__1__Impl"


    // $ANTLR start "rule__StringType__Group_2_6__0"
    // InternalTextualDataModel.g:3955:1: rule__StringType__Group_2_6__0 : rule__StringType__Group_2_6__0__Impl rule__StringType__Group_2_6__1 ;
    public final void rule__StringType__Group_2_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3959:1: ( rule__StringType__Group_2_6__0__Impl rule__StringType__Group_2_6__1 )
            // InternalTextualDataModel.g:3960:2: rule__StringType__Group_2_6__0__Impl rule__StringType__Group_2_6__1
            {
            pushFollow(FOLLOW_3);
            rule__StringType__Group_2_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group_2_6__1();

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
    // $ANTLR end "rule__StringType__Group_2_6__0"


    // $ANTLR start "rule__StringType__Group_2_6__0__Impl"
    // InternalTextualDataModel.g:3967:1: rule__StringType__Group_2_6__0__Impl : ( 'pattern' ) ;
    public final void rule__StringType__Group_2_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3971:1: ( ( 'pattern' ) )
            // InternalTextualDataModel.g:3972:1: ( 'pattern' )
            {
            // InternalTextualDataModel.g:3972:1: ( 'pattern' )
            // InternalTextualDataModel.g:3973:2: 'pattern'
            {
             before(grammarAccess.getStringTypeAccess().getPatternKeyword_2_6_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getPatternKeyword_2_6_0()); 

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
    // $ANTLR end "rule__StringType__Group_2_6__0__Impl"


    // $ANTLR start "rule__StringType__Group_2_6__1"
    // InternalTextualDataModel.g:3982:1: rule__StringType__Group_2_6__1 : rule__StringType__Group_2_6__1__Impl ;
    public final void rule__StringType__Group_2_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3986:1: ( rule__StringType__Group_2_6__1__Impl )
            // InternalTextualDataModel.g:3987:2: rule__StringType__Group_2_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringType__Group_2_6__1__Impl();

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
    // $ANTLR end "rule__StringType__Group_2_6__1"


    // $ANTLR start "rule__StringType__Group_2_6__1__Impl"
    // InternalTextualDataModel.g:3993:1: rule__StringType__Group_2_6__1__Impl : ( ( rule__StringType__PatternAssignment_2_6_1 ) ) ;
    public final void rule__StringType__Group_2_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:3997:1: ( ( ( rule__StringType__PatternAssignment_2_6_1 ) ) )
            // InternalTextualDataModel.g:3998:1: ( ( rule__StringType__PatternAssignment_2_6_1 ) )
            {
            // InternalTextualDataModel.g:3998:1: ( ( rule__StringType__PatternAssignment_2_6_1 ) )
            // InternalTextualDataModel.g:3999:2: ( rule__StringType__PatternAssignment_2_6_1 )
            {
             before(grammarAccess.getStringTypeAccess().getPatternAssignment_2_6_1()); 
            // InternalTextualDataModel.g:4000:2: ( rule__StringType__PatternAssignment_2_6_1 )
            // InternalTextualDataModel.g:4000:3: rule__StringType__PatternAssignment_2_6_1
            {
            pushFollow(FOLLOW_2);
            rule__StringType__PatternAssignment_2_6_1();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getPatternAssignment_2_6_1()); 

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
    // $ANTLR end "rule__StringType__Group_2_6__1__Impl"


    // $ANTLR start "rule__NumericType__Group__0"
    // InternalTextualDataModel.g:4009:1: rule__NumericType__Group__0 : rule__NumericType__Group__0__Impl rule__NumericType__Group__1 ;
    public final void rule__NumericType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4013:1: ( rule__NumericType__Group__0__Impl rule__NumericType__Group__1 )
            // InternalTextualDataModel.g:4014:2: rule__NumericType__Group__0__Impl rule__NumericType__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__NumericType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group__1();

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
    // $ANTLR end "rule__NumericType__Group__0"


    // $ANTLR start "rule__NumericType__Group__0__Impl"
    // InternalTextualDataModel.g:4021:1: rule__NumericType__Group__0__Impl : ( 'NumericType' ) ;
    public final void rule__NumericType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4025:1: ( ( 'NumericType' ) )
            // InternalTextualDataModel.g:4026:1: ( 'NumericType' )
            {
            // InternalTextualDataModel.g:4026:1: ( 'NumericType' )
            // InternalTextualDataModel.g:4027:2: 'NumericType'
            {
             before(grammarAccess.getNumericTypeAccess().getNumericTypeKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getNumericTypeKeyword_0()); 

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
    // $ANTLR end "rule__NumericType__Group__0__Impl"


    // $ANTLR start "rule__NumericType__Group__1"
    // InternalTextualDataModel.g:4036:1: rule__NumericType__Group__1 : rule__NumericType__Group__1__Impl rule__NumericType__Group__2 ;
    public final void rule__NumericType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4040:1: ( rule__NumericType__Group__1__Impl rule__NumericType__Group__2 )
            // InternalTextualDataModel.g:4041:2: rule__NumericType__Group__1__Impl rule__NumericType__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__NumericType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group__2();

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
    // $ANTLR end "rule__NumericType__Group__1"


    // $ANTLR start "rule__NumericType__Group__1__Impl"
    // InternalTextualDataModel.g:4048:1: rule__NumericType__Group__1__Impl : ( ( rule__NumericType__NameAssignment_1 ) ) ;
    public final void rule__NumericType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4052:1: ( ( ( rule__NumericType__NameAssignment_1 ) ) )
            // InternalTextualDataModel.g:4053:1: ( ( rule__NumericType__NameAssignment_1 ) )
            {
            // InternalTextualDataModel.g:4053:1: ( ( rule__NumericType__NameAssignment_1 ) )
            // InternalTextualDataModel.g:4054:2: ( rule__NumericType__NameAssignment_1 )
            {
             before(grammarAccess.getNumericTypeAccess().getNameAssignment_1()); 
            // InternalTextualDataModel.g:4055:2: ( rule__NumericType__NameAssignment_1 )
            // InternalTextualDataModel.g:4055:3: rule__NumericType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__NumericType__Group__1__Impl"


    // $ANTLR start "rule__NumericType__Group__2"
    // InternalTextualDataModel.g:4063:1: rule__NumericType__Group__2 : rule__NumericType__Group__2__Impl ;
    public final void rule__NumericType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4067:1: ( rule__NumericType__Group__2__Impl )
            // InternalTextualDataModel.g:4068:2: rule__NumericType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__Group__2__Impl();

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
    // $ANTLR end "rule__NumericType__Group__2"


    // $ANTLR start "rule__NumericType__Group__2__Impl"
    // InternalTextualDataModel.g:4074:1: rule__NumericType__Group__2__Impl : ( ( rule__NumericType__Group_2__0 )? ) ;
    public final void rule__NumericType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4078:1: ( ( ( rule__NumericType__Group_2__0 )? ) )
            // InternalTextualDataModel.g:4079:1: ( ( rule__NumericType__Group_2__0 )? )
            {
            // InternalTextualDataModel.g:4079:1: ( ( rule__NumericType__Group_2__0 )? )
            // InternalTextualDataModel.g:4080:2: ( rule__NumericType__Group_2__0 )?
            {
             before(grammarAccess.getNumericTypeAccess().getGroup_2()); 
            // InternalTextualDataModel.g:4081:2: ( rule__NumericType__Group_2__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==22) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalTextualDataModel.g:4081:3: rule__NumericType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumericType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumericTypeAccess().getGroup_2()); 

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
    // $ANTLR end "rule__NumericType__Group__2__Impl"


    // $ANTLR start "rule__NumericType__Group_2__0"
    // InternalTextualDataModel.g:4090:1: rule__NumericType__Group_2__0 : rule__NumericType__Group_2__0__Impl rule__NumericType__Group_2__1 ;
    public final void rule__NumericType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4094:1: ( rule__NumericType__Group_2__0__Impl rule__NumericType__Group_2__1 )
            // InternalTextualDataModel.g:4095:2: rule__NumericType__Group_2__0__Impl rule__NumericType__Group_2__1
            {
            pushFollow(FOLLOW_28);
            rule__NumericType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group_2__1();

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
    // $ANTLR end "rule__NumericType__Group_2__0"


    // $ANTLR start "rule__NumericType__Group_2__0__Impl"
    // InternalTextualDataModel.g:4102:1: rule__NumericType__Group_2__0__Impl : ( '{' ) ;
    public final void rule__NumericType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4106:1: ( ( '{' ) )
            // InternalTextualDataModel.g:4107:1: ( '{' )
            {
            // InternalTextualDataModel.g:4107:1: ( '{' )
            // InternalTextualDataModel.g:4108:2: '{'
            {
             before(grammarAccess.getNumericTypeAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getLeftCurlyBracketKeyword_2_0()); 

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
    // $ANTLR end "rule__NumericType__Group_2__0__Impl"


    // $ANTLR start "rule__NumericType__Group_2__1"
    // InternalTextualDataModel.g:4117:1: rule__NumericType__Group_2__1 : rule__NumericType__Group_2__1__Impl rule__NumericType__Group_2__2 ;
    public final void rule__NumericType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4121:1: ( rule__NumericType__Group_2__1__Impl rule__NumericType__Group_2__2 )
            // InternalTextualDataModel.g:4122:2: rule__NumericType__Group_2__1__Impl rule__NumericType__Group_2__2
            {
            pushFollow(FOLLOW_28);
            rule__NumericType__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group_2__2();

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
    // $ANTLR end "rule__NumericType__Group_2__1"


    // $ANTLR start "rule__NumericType__Group_2__1__Impl"
    // InternalTextualDataModel.g:4129:1: rule__NumericType__Group_2__1__Impl : ( ( rule__NumericType__Group_2_1__0 )? ) ;
    public final void rule__NumericType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4133:1: ( ( ( rule__NumericType__Group_2_1__0 )? ) )
            // InternalTextualDataModel.g:4134:1: ( ( rule__NumericType__Group_2_1__0 )? )
            {
            // InternalTextualDataModel.g:4134:1: ( ( rule__NumericType__Group_2_1__0 )? )
            // InternalTextualDataModel.g:4135:2: ( rule__NumericType__Group_2_1__0 )?
            {
             before(grammarAccess.getNumericTypeAccess().getGroup_2_1()); 
            // InternalTextualDataModel.g:4136:2: ( rule__NumericType__Group_2_1__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==24) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalTextualDataModel.g:4136:3: rule__NumericType__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumericType__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumericTypeAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__NumericType__Group_2__1__Impl"


    // $ANTLR start "rule__NumericType__Group_2__2"
    // InternalTextualDataModel.g:4144:1: rule__NumericType__Group_2__2 : rule__NumericType__Group_2__2__Impl rule__NumericType__Group_2__3 ;
    public final void rule__NumericType__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4148:1: ( rule__NumericType__Group_2__2__Impl rule__NumericType__Group_2__3 )
            // InternalTextualDataModel.g:4149:2: rule__NumericType__Group_2__2__Impl rule__NumericType__Group_2__3
            {
            pushFollow(FOLLOW_28);
            rule__NumericType__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group_2__3();

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
    // $ANTLR end "rule__NumericType__Group_2__2"


    // $ANTLR start "rule__NumericType__Group_2__2__Impl"
    // InternalTextualDataModel.g:4156:1: rule__NumericType__Group_2__2__Impl : ( ( rule__NumericType__LocalizationsAssignment_2_2 )* ) ;
    public final void rule__NumericType__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4160:1: ( ( ( rule__NumericType__LocalizationsAssignment_2_2 )* ) )
            // InternalTextualDataModel.g:4161:1: ( ( rule__NumericType__LocalizationsAssignment_2_2 )* )
            {
            // InternalTextualDataModel.g:4161:1: ( ( rule__NumericType__LocalizationsAssignment_2_2 )* )
            // InternalTextualDataModel.g:4162:2: ( rule__NumericType__LocalizationsAssignment_2_2 )*
            {
             before(grammarAccess.getNumericTypeAccess().getLocalizationsAssignment_2_2()); 
            // InternalTextualDataModel.g:4163:2: ( rule__NumericType__LocalizationsAssignment_2_2 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==53) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalTextualDataModel.g:4163:3: rule__NumericType__LocalizationsAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__NumericType__LocalizationsAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getNumericTypeAccess().getLocalizationsAssignment_2_2()); 

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
    // $ANTLR end "rule__NumericType__Group_2__2__Impl"


    // $ANTLR start "rule__NumericType__Group_2__3"
    // InternalTextualDataModel.g:4171:1: rule__NumericType__Group_2__3 : rule__NumericType__Group_2__3__Impl rule__NumericType__Group_2__4 ;
    public final void rule__NumericType__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4175:1: ( rule__NumericType__Group_2__3__Impl rule__NumericType__Group_2__4 )
            // InternalTextualDataModel.g:4176:2: rule__NumericType__Group_2__3__Impl rule__NumericType__Group_2__4
            {
            pushFollow(FOLLOW_28);
            rule__NumericType__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group_2__4();

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
    // $ANTLR end "rule__NumericType__Group_2__3"


    // $ANTLR start "rule__NumericType__Group_2__3__Impl"
    // InternalTextualDataModel.g:4183:1: rule__NumericType__Group_2__3__Impl : ( ( rule__NumericType__Group_2_3__0 )? ) ;
    public final void rule__NumericType__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4187:1: ( ( ( rule__NumericType__Group_2_3__0 )? ) )
            // InternalTextualDataModel.g:4188:1: ( ( rule__NumericType__Group_2_3__0 )? )
            {
            // InternalTextualDataModel.g:4188:1: ( ( rule__NumericType__Group_2_3__0 )? )
            // InternalTextualDataModel.g:4189:2: ( rule__NumericType__Group_2_3__0 )?
            {
             before(grammarAccess.getNumericTypeAccess().getGroup_2_3()); 
            // InternalTextualDataModel.g:4190:2: ( rule__NumericType__Group_2_3__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==42) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalTextualDataModel.g:4190:3: rule__NumericType__Group_2_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumericType__Group_2_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumericTypeAccess().getGroup_2_3()); 

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
    // $ANTLR end "rule__NumericType__Group_2__3__Impl"


    // $ANTLR start "rule__NumericType__Group_2__4"
    // InternalTextualDataModel.g:4198:1: rule__NumericType__Group_2__4 : rule__NumericType__Group_2__4__Impl rule__NumericType__Group_2__5 ;
    public final void rule__NumericType__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4202:1: ( rule__NumericType__Group_2__4__Impl rule__NumericType__Group_2__5 )
            // InternalTextualDataModel.g:4203:2: rule__NumericType__Group_2__4__Impl rule__NumericType__Group_2__5
            {
            pushFollow(FOLLOW_28);
            rule__NumericType__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group_2__5();

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
    // $ANTLR end "rule__NumericType__Group_2__4"


    // $ANTLR start "rule__NumericType__Group_2__4__Impl"
    // InternalTextualDataModel.g:4210:1: rule__NumericType__Group_2__4__Impl : ( ( rule__NumericType__Group_2_4__0 )? ) ;
    public final void rule__NumericType__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4214:1: ( ( ( rule__NumericType__Group_2_4__0 )? ) )
            // InternalTextualDataModel.g:4215:1: ( ( rule__NumericType__Group_2_4__0 )? )
            {
            // InternalTextualDataModel.g:4215:1: ( ( rule__NumericType__Group_2_4__0 )? )
            // InternalTextualDataModel.g:4216:2: ( rule__NumericType__Group_2_4__0 )?
            {
             before(grammarAccess.getNumericTypeAccess().getGroup_2_4()); 
            // InternalTextualDataModel.g:4217:2: ( rule__NumericType__Group_2_4__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==43) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalTextualDataModel.g:4217:3: rule__NumericType__Group_2_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumericType__Group_2_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumericTypeAccess().getGroup_2_4()); 

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
    // $ANTLR end "rule__NumericType__Group_2__4__Impl"


    // $ANTLR start "rule__NumericType__Group_2__5"
    // InternalTextualDataModel.g:4225:1: rule__NumericType__Group_2__5 : rule__NumericType__Group_2__5__Impl rule__NumericType__Group_2__6 ;
    public final void rule__NumericType__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4229:1: ( rule__NumericType__Group_2__5__Impl rule__NumericType__Group_2__6 )
            // InternalTextualDataModel.g:4230:2: rule__NumericType__Group_2__5__Impl rule__NumericType__Group_2__6
            {
            pushFollow(FOLLOW_28);
            rule__NumericType__Group_2__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group_2__6();

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
    // $ANTLR end "rule__NumericType__Group_2__5"


    // $ANTLR start "rule__NumericType__Group_2__5__Impl"
    // InternalTextualDataModel.g:4237:1: rule__NumericType__Group_2__5__Impl : ( ( rule__NumericType__Group_2_5__0 )? ) ;
    public final void rule__NumericType__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4241:1: ( ( ( rule__NumericType__Group_2_5__0 )? ) )
            // InternalTextualDataModel.g:4242:1: ( ( rule__NumericType__Group_2_5__0 )? )
            {
            // InternalTextualDataModel.g:4242:1: ( ( rule__NumericType__Group_2_5__0 )? )
            // InternalTextualDataModel.g:4243:2: ( rule__NumericType__Group_2_5__0 )?
            {
             before(grammarAccess.getNumericTypeAccess().getGroup_2_5()); 
            // InternalTextualDataModel.g:4244:2: ( rule__NumericType__Group_2_5__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==44) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalTextualDataModel.g:4244:3: rule__NumericType__Group_2_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumericType__Group_2_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumericTypeAccess().getGroup_2_5()); 

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
    // $ANTLR end "rule__NumericType__Group_2__5__Impl"


    // $ANTLR start "rule__NumericType__Group_2__6"
    // InternalTextualDataModel.g:4252:1: rule__NumericType__Group_2__6 : rule__NumericType__Group_2__6__Impl rule__NumericType__Group_2__7 ;
    public final void rule__NumericType__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4256:1: ( rule__NumericType__Group_2__6__Impl rule__NumericType__Group_2__7 )
            // InternalTextualDataModel.g:4257:2: rule__NumericType__Group_2__6__Impl rule__NumericType__Group_2__7
            {
            pushFollow(FOLLOW_28);
            rule__NumericType__Group_2__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group_2__7();

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
    // $ANTLR end "rule__NumericType__Group_2__6"


    // $ANTLR start "rule__NumericType__Group_2__6__Impl"
    // InternalTextualDataModel.g:4264:1: rule__NumericType__Group_2__6__Impl : ( ( rule__NumericType__Group_2_6__0 )? ) ;
    public final void rule__NumericType__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4268:1: ( ( ( rule__NumericType__Group_2_6__0 )? ) )
            // InternalTextualDataModel.g:4269:1: ( ( rule__NumericType__Group_2_6__0 )? )
            {
            // InternalTextualDataModel.g:4269:1: ( ( rule__NumericType__Group_2_6__0 )? )
            // InternalTextualDataModel.g:4270:2: ( rule__NumericType__Group_2_6__0 )?
            {
             before(grammarAccess.getNumericTypeAccess().getGroup_2_6()); 
            // InternalTextualDataModel.g:4271:2: ( rule__NumericType__Group_2_6__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==45) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalTextualDataModel.g:4271:3: rule__NumericType__Group_2_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumericType__Group_2_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumericTypeAccess().getGroup_2_6()); 

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
    // $ANTLR end "rule__NumericType__Group_2__6__Impl"


    // $ANTLR start "rule__NumericType__Group_2__7"
    // InternalTextualDataModel.g:4279:1: rule__NumericType__Group_2__7 : rule__NumericType__Group_2__7__Impl rule__NumericType__Group_2__8 ;
    public final void rule__NumericType__Group_2__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4283:1: ( rule__NumericType__Group_2__7__Impl rule__NumericType__Group_2__8 )
            // InternalTextualDataModel.g:4284:2: rule__NumericType__Group_2__7__Impl rule__NumericType__Group_2__8
            {
            pushFollow(FOLLOW_28);
            rule__NumericType__Group_2__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group_2__8();

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
    // $ANTLR end "rule__NumericType__Group_2__7"


    // $ANTLR start "rule__NumericType__Group_2__7__Impl"
    // InternalTextualDataModel.g:4291:1: rule__NumericType__Group_2__7__Impl : ( ( rule__NumericType__Group_2_7__0 )? ) ;
    public final void rule__NumericType__Group_2__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4295:1: ( ( ( rule__NumericType__Group_2_7__0 )? ) )
            // InternalTextualDataModel.g:4296:1: ( ( rule__NumericType__Group_2_7__0 )? )
            {
            // InternalTextualDataModel.g:4296:1: ( ( rule__NumericType__Group_2_7__0 )? )
            // InternalTextualDataModel.g:4297:2: ( rule__NumericType__Group_2_7__0 )?
            {
             before(grammarAccess.getNumericTypeAccess().getGroup_2_7()); 
            // InternalTextualDataModel.g:4298:2: ( rule__NumericType__Group_2_7__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==46) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalTextualDataModel.g:4298:3: rule__NumericType__Group_2_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumericType__Group_2_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumericTypeAccess().getGroup_2_7()); 

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
    // $ANTLR end "rule__NumericType__Group_2__7__Impl"


    // $ANTLR start "rule__NumericType__Group_2__8"
    // InternalTextualDataModel.g:4306:1: rule__NumericType__Group_2__8 : rule__NumericType__Group_2__8__Impl rule__NumericType__Group_2__9 ;
    public final void rule__NumericType__Group_2__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4310:1: ( rule__NumericType__Group_2__8__Impl rule__NumericType__Group_2__9 )
            // InternalTextualDataModel.g:4311:2: rule__NumericType__Group_2__8__Impl rule__NumericType__Group_2__9
            {
            pushFollow(FOLLOW_28);
            rule__NumericType__Group_2__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group_2__9();

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
    // $ANTLR end "rule__NumericType__Group_2__8"


    // $ANTLR start "rule__NumericType__Group_2__8__Impl"
    // InternalTextualDataModel.g:4318:1: rule__NumericType__Group_2__8__Impl : ( ( rule__NumericType__Group_2_8__0 )? ) ;
    public final void rule__NumericType__Group_2__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4322:1: ( ( ( rule__NumericType__Group_2_8__0 )? ) )
            // InternalTextualDataModel.g:4323:1: ( ( rule__NumericType__Group_2_8__0 )? )
            {
            // InternalTextualDataModel.g:4323:1: ( ( rule__NumericType__Group_2_8__0 )? )
            // InternalTextualDataModel.g:4324:2: ( rule__NumericType__Group_2_8__0 )?
            {
             before(grammarAccess.getNumericTypeAccess().getGroup_2_8()); 
            // InternalTextualDataModel.g:4325:2: ( rule__NumericType__Group_2_8__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==47) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalTextualDataModel.g:4325:3: rule__NumericType__Group_2_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumericType__Group_2_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumericTypeAccess().getGroup_2_8()); 

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
    // $ANTLR end "rule__NumericType__Group_2__8__Impl"


    // $ANTLR start "rule__NumericType__Group_2__9"
    // InternalTextualDataModel.g:4333:1: rule__NumericType__Group_2__9 : rule__NumericType__Group_2__9__Impl rule__NumericType__Group_2__10 ;
    public final void rule__NumericType__Group_2__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4337:1: ( rule__NumericType__Group_2__9__Impl rule__NumericType__Group_2__10 )
            // InternalTextualDataModel.g:4338:2: rule__NumericType__Group_2__9__Impl rule__NumericType__Group_2__10
            {
            pushFollow(FOLLOW_28);
            rule__NumericType__Group_2__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group_2__10();

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
    // $ANTLR end "rule__NumericType__Group_2__9"


    // $ANTLR start "rule__NumericType__Group_2__9__Impl"
    // InternalTextualDataModel.g:4345:1: rule__NumericType__Group_2__9__Impl : ( ( rule__NumericType__Group_2_9__0 )? ) ;
    public final void rule__NumericType__Group_2__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4349:1: ( ( ( rule__NumericType__Group_2_9__0 )? ) )
            // InternalTextualDataModel.g:4350:1: ( ( rule__NumericType__Group_2_9__0 )? )
            {
            // InternalTextualDataModel.g:4350:1: ( ( rule__NumericType__Group_2_9__0 )? )
            // InternalTextualDataModel.g:4351:2: ( rule__NumericType__Group_2_9__0 )?
            {
             before(grammarAccess.getNumericTypeAccess().getGroup_2_9()); 
            // InternalTextualDataModel.g:4352:2: ( rule__NumericType__Group_2_9__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==48) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalTextualDataModel.g:4352:3: rule__NumericType__Group_2_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumericType__Group_2_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumericTypeAccess().getGroup_2_9()); 

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
    // $ANTLR end "rule__NumericType__Group_2__9__Impl"


    // $ANTLR start "rule__NumericType__Group_2__10"
    // InternalTextualDataModel.g:4360:1: rule__NumericType__Group_2__10 : rule__NumericType__Group_2__10__Impl rule__NumericType__Group_2__11 ;
    public final void rule__NumericType__Group_2__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4364:1: ( rule__NumericType__Group_2__10__Impl rule__NumericType__Group_2__11 )
            // InternalTextualDataModel.g:4365:2: rule__NumericType__Group_2__10__Impl rule__NumericType__Group_2__11
            {
            pushFollow(FOLLOW_28);
            rule__NumericType__Group_2__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group_2__11();

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
    // $ANTLR end "rule__NumericType__Group_2__10"


    // $ANTLR start "rule__NumericType__Group_2__10__Impl"
    // InternalTextualDataModel.g:4372:1: rule__NumericType__Group_2__10__Impl : ( ( rule__NumericType__Group_2_10__0 )? ) ;
    public final void rule__NumericType__Group_2__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4376:1: ( ( ( rule__NumericType__Group_2_10__0 )? ) )
            // InternalTextualDataModel.g:4377:1: ( ( rule__NumericType__Group_2_10__0 )? )
            {
            // InternalTextualDataModel.g:4377:1: ( ( rule__NumericType__Group_2_10__0 )? )
            // InternalTextualDataModel.g:4378:2: ( rule__NumericType__Group_2_10__0 )?
            {
             before(grammarAccess.getNumericTypeAccess().getGroup_2_10()); 
            // InternalTextualDataModel.g:4379:2: ( rule__NumericType__Group_2_10__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==49) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalTextualDataModel.g:4379:3: rule__NumericType__Group_2_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumericType__Group_2_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumericTypeAccess().getGroup_2_10()); 

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
    // $ANTLR end "rule__NumericType__Group_2__10__Impl"


    // $ANTLR start "rule__NumericType__Group_2__11"
    // InternalTextualDataModel.g:4387:1: rule__NumericType__Group_2__11 : rule__NumericType__Group_2__11__Impl ;
    public final void rule__NumericType__Group_2__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4391:1: ( rule__NumericType__Group_2__11__Impl )
            // InternalTextualDataModel.g:4392:2: rule__NumericType__Group_2__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__Group_2__11__Impl();

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
    // $ANTLR end "rule__NumericType__Group_2__11"


    // $ANTLR start "rule__NumericType__Group_2__11__Impl"
    // InternalTextualDataModel.g:4398:1: rule__NumericType__Group_2__11__Impl : ( '}' ) ;
    public final void rule__NumericType__Group_2__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4402:1: ( ( '}' ) )
            // InternalTextualDataModel.g:4403:1: ( '}' )
            {
            // InternalTextualDataModel.g:4403:1: ( '}' )
            // InternalTextualDataModel.g:4404:2: '}'
            {
             before(grammarAccess.getNumericTypeAccess().getRightCurlyBracketKeyword_2_11()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getRightCurlyBracketKeyword_2_11()); 

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
    // $ANTLR end "rule__NumericType__Group_2__11__Impl"


    // $ANTLR start "rule__NumericType__Group_2_1__0"
    // InternalTextualDataModel.g:4414:1: rule__NumericType__Group_2_1__0 : rule__NumericType__Group_2_1__0__Impl rule__NumericType__Group_2_1__1 ;
    public final void rule__NumericType__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4418:1: ( rule__NumericType__Group_2_1__0__Impl rule__NumericType__Group_2_1__1 )
            // InternalTextualDataModel.g:4419:2: rule__NumericType__Group_2_1__0__Impl rule__NumericType__Group_2_1__1
            {
            pushFollow(FOLLOW_10);
            rule__NumericType__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group_2_1__1();

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
    // $ANTLR end "rule__NumericType__Group_2_1__0"


    // $ANTLR start "rule__NumericType__Group_2_1__0__Impl"
    // InternalTextualDataModel.g:4426:1: rule__NumericType__Group_2_1__0__Impl : ( '@description' ) ;
    public final void rule__NumericType__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4430:1: ( ( '@description' ) )
            // InternalTextualDataModel.g:4431:1: ( '@description' )
            {
            // InternalTextualDataModel.g:4431:1: ( '@description' )
            // InternalTextualDataModel.g:4432:2: '@description'
            {
             before(grammarAccess.getNumericTypeAccess().getDescriptionKeyword_2_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getDescriptionKeyword_2_1_0()); 

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
    // $ANTLR end "rule__NumericType__Group_2_1__0__Impl"


    // $ANTLR start "rule__NumericType__Group_2_1__1"
    // InternalTextualDataModel.g:4441:1: rule__NumericType__Group_2_1__1 : rule__NumericType__Group_2_1__1__Impl rule__NumericType__Group_2_1__2 ;
    public final void rule__NumericType__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4445:1: ( rule__NumericType__Group_2_1__1__Impl rule__NumericType__Group_2_1__2 )
            // InternalTextualDataModel.g:4446:2: rule__NumericType__Group_2_1__1__Impl rule__NumericType__Group_2_1__2
            {
            pushFollow(FOLLOW_3);
            rule__NumericType__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group_2_1__2();

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
    // $ANTLR end "rule__NumericType__Group_2_1__1"


    // $ANTLR start "rule__NumericType__Group_2_1__1__Impl"
    // InternalTextualDataModel.g:4453:1: rule__NumericType__Group_2_1__1__Impl : ( '(' ) ;
    public final void rule__NumericType__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4457:1: ( ( '(' ) )
            // InternalTextualDataModel.g:4458:1: ( '(' )
            {
            // InternalTextualDataModel.g:4458:1: ( '(' )
            // InternalTextualDataModel.g:4459:2: '('
            {
             before(grammarAccess.getNumericTypeAccess().getLeftParenthesisKeyword_2_1_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getLeftParenthesisKeyword_2_1_1()); 

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
    // $ANTLR end "rule__NumericType__Group_2_1__1__Impl"


    // $ANTLR start "rule__NumericType__Group_2_1__2"
    // InternalTextualDataModel.g:4468:1: rule__NumericType__Group_2_1__2 : rule__NumericType__Group_2_1__2__Impl rule__NumericType__Group_2_1__3 ;
    public final void rule__NumericType__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4472:1: ( rule__NumericType__Group_2_1__2__Impl rule__NumericType__Group_2_1__3 )
            // InternalTextualDataModel.g:4473:2: rule__NumericType__Group_2_1__2__Impl rule__NumericType__Group_2_1__3
            {
            pushFollow(FOLLOW_11);
            rule__NumericType__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group_2_1__3();

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
    // $ANTLR end "rule__NumericType__Group_2_1__2"


    // $ANTLR start "rule__NumericType__Group_2_1__2__Impl"
    // InternalTextualDataModel.g:4480:1: rule__NumericType__Group_2_1__2__Impl : ( ( rule__NumericType__DescriptionAssignment_2_1_2 ) ) ;
    public final void rule__NumericType__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4484:1: ( ( ( rule__NumericType__DescriptionAssignment_2_1_2 ) ) )
            // InternalTextualDataModel.g:4485:1: ( ( rule__NumericType__DescriptionAssignment_2_1_2 ) )
            {
            // InternalTextualDataModel.g:4485:1: ( ( rule__NumericType__DescriptionAssignment_2_1_2 ) )
            // InternalTextualDataModel.g:4486:2: ( rule__NumericType__DescriptionAssignment_2_1_2 )
            {
             before(grammarAccess.getNumericTypeAccess().getDescriptionAssignment_2_1_2()); 
            // InternalTextualDataModel.g:4487:2: ( rule__NumericType__DescriptionAssignment_2_1_2 )
            // InternalTextualDataModel.g:4487:3: rule__NumericType__DescriptionAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__DescriptionAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypeAccess().getDescriptionAssignment_2_1_2()); 

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
    // $ANTLR end "rule__NumericType__Group_2_1__2__Impl"


    // $ANTLR start "rule__NumericType__Group_2_1__3"
    // InternalTextualDataModel.g:4495:1: rule__NumericType__Group_2_1__3 : rule__NumericType__Group_2_1__3__Impl ;
    public final void rule__NumericType__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4499:1: ( rule__NumericType__Group_2_1__3__Impl )
            // InternalTextualDataModel.g:4500:2: rule__NumericType__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__Group_2_1__3__Impl();

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
    // $ANTLR end "rule__NumericType__Group_2_1__3"


    // $ANTLR start "rule__NumericType__Group_2_1__3__Impl"
    // InternalTextualDataModel.g:4506:1: rule__NumericType__Group_2_1__3__Impl : ( ')' ) ;
    public final void rule__NumericType__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4510:1: ( ( ')' ) )
            // InternalTextualDataModel.g:4511:1: ( ')' )
            {
            // InternalTextualDataModel.g:4511:1: ( ')' )
            // InternalTextualDataModel.g:4512:2: ')'
            {
             before(grammarAccess.getNumericTypeAccess().getRightParenthesisKeyword_2_1_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getRightParenthesisKeyword_2_1_3()); 

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
    // $ANTLR end "rule__NumericType__Group_2_1__3__Impl"


    // $ANTLR start "rule__NumericType__Group_2_3__0"
    // InternalTextualDataModel.g:4522:1: rule__NumericType__Group_2_3__0 : rule__NumericType__Group_2_3__0__Impl rule__NumericType__Group_2_3__1 ;
    public final void rule__NumericType__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4526:1: ( rule__NumericType__Group_2_3__0__Impl rule__NumericType__Group_2_3__1 )
            // InternalTextualDataModel.g:4527:2: rule__NumericType__Group_2_3__0__Impl rule__NumericType__Group_2_3__1
            {
            pushFollow(FOLLOW_19);
            rule__NumericType__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group_2_3__1();

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
    // $ANTLR end "rule__NumericType__Group_2_3__0"


    // $ANTLR start "rule__NumericType__Group_2_3__0__Impl"
    // InternalTextualDataModel.g:4534:1: rule__NumericType__Group_2_3__0__Impl : ( 'size' ) ;
    public final void rule__NumericType__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4538:1: ( ( 'size' ) )
            // InternalTextualDataModel.g:4539:1: ( 'size' )
            {
            // InternalTextualDataModel.g:4539:1: ( 'size' )
            // InternalTextualDataModel.g:4540:2: 'size'
            {
             before(grammarAccess.getNumericTypeAccess().getSizeKeyword_2_3_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getSizeKeyword_2_3_0()); 

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
    // $ANTLR end "rule__NumericType__Group_2_3__0__Impl"


    // $ANTLR start "rule__NumericType__Group_2_3__1"
    // InternalTextualDataModel.g:4549:1: rule__NumericType__Group_2_3__1 : rule__NumericType__Group_2_3__1__Impl ;
    public final void rule__NumericType__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4553:1: ( rule__NumericType__Group_2_3__1__Impl )
            // InternalTextualDataModel.g:4554:2: rule__NumericType__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__Group_2_3__1__Impl();

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
    // $ANTLR end "rule__NumericType__Group_2_3__1"


    // $ANTLR start "rule__NumericType__Group_2_3__1__Impl"
    // InternalTextualDataModel.g:4560:1: rule__NumericType__Group_2_3__1__Impl : ( ( rule__NumericType__SizeAssignment_2_3_1 ) ) ;
    public final void rule__NumericType__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4564:1: ( ( ( rule__NumericType__SizeAssignment_2_3_1 ) ) )
            // InternalTextualDataModel.g:4565:1: ( ( rule__NumericType__SizeAssignment_2_3_1 ) )
            {
            // InternalTextualDataModel.g:4565:1: ( ( rule__NumericType__SizeAssignment_2_3_1 ) )
            // InternalTextualDataModel.g:4566:2: ( rule__NumericType__SizeAssignment_2_3_1 )
            {
             before(grammarAccess.getNumericTypeAccess().getSizeAssignment_2_3_1()); 
            // InternalTextualDataModel.g:4567:2: ( rule__NumericType__SizeAssignment_2_3_1 )
            // InternalTextualDataModel.g:4567:3: rule__NumericType__SizeAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__SizeAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypeAccess().getSizeAssignment_2_3_1()); 

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
    // $ANTLR end "rule__NumericType__Group_2_3__1__Impl"


    // $ANTLR start "rule__NumericType__Group_2_4__0"
    // InternalTextualDataModel.g:4576:1: rule__NumericType__Group_2_4__0 : rule__NumericType__Group_2_4__0__Impl rule__NumericType__Group_2_4__1 ;
    public final void rule__NumericType__Group_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4580:1: ( rule__NumericType__Group_2_4__0__Impl rule__NumericType__Group_2_4__1 )
            // InternalTextualDataModel.g:4581:2: rule__NumericType__Group_2_4__0__Impl rule__NumericType__Group_2_4__1
            {
            pushFollow(FOLLOW_19);
            rule__NumericType__Group_2_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group_2_4__1();

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
    // $ANTLR end "rule__NumericType__Group_2_4__0"


    // $ANTLR start "rule__NumericType__Group_2_4__0__Impl"
    // InternalTextualDataModel.g:4588:1: rule__NumericType__Group_2_4__0__Impl : ( 'totalDigits' ) ;
    public final void rule__NumericType__Group_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4592:1: ( ( 'totalDigits' ) )
            // InternalTextualDataModel.g:4593:1: ( 'totalDigits' )
            {
            // InternalTextualDataModel.g:4593:1: ( 'totalDigits' )
            // InternalTextualDataModel.g:4594:2: 'totalDigits'
            {
             before(grammarAccess.getNumericTypeAccess().getTotalDigitsKeyword_2_4_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getTotalDigitsKeyword_2_4_0()); 

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
    // $ANTLR end "rule__NumericType__Group_2_4__0__Impl"


    // $ANTLR start "rule__NumericType__Group_2_4__1"
    // InternalTextualDataModel.g:4603:1: rule__NumericType__Group_2_4__1 : rule__NumericType__Group_2_4__1__Impl ;
    public final void rule__NumericType__Group_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4607:1: ( rule__NumericType__Group_2_4__1__Impl )
            // InternalTextualDataModel.g:4608:2: rule__NumericType__Group_2_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__Group_2_4__1__Impl();

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
    // $ANTLR end "rule__NumericType__Group_2_4__1"


    // $ANTLR start "rule__NumericType__Group_2_4__1__Impl"
    // InternalTextualDataModel.g:4614:1: rule__NumericType__Group_2_4__1__Impl : ( ( rule__NumericType__TotalDigitsAssignment_2_4_1 ) ) ;
    public final void rule__NumericType__Group_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4618:1: ( ( ( rule__NumericType__TotalDigitsAssignment_2_4_1 ) ) )
            // InternalTextualDataModel.g:4619:1: ( ( rule__NumericType__TotalDigitsAssignment_2_4_1 ) )
            {
            // InternalTextualDataModel.g:4619:1: ( ( rule__NumericType__TotalDigitsAssignment_2_4_1 ) )
            // InternalTextualDataModel.g:4620:2: ( rule__NumericType__TotalDigitsAssignment_2_4_1 )
            {
             before(grammarAccess.getNumericTypeAccess().getTotalDigitsAssignment_2_4_1()); 
            // InternalTextualDataModel.g:4621:2: ( rule__NumericType__TotalDigitsAssignment_2_4_1 )
            // InternalTextualDataModel.g:4621:3: rule__NumericType__TotalDigitsAssignment_2_4_1
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__TotalDigitsAssignment_2_4_1();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypeAccess().getTotalDigitsAssignment_2_4_1()); 

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
    // $ANTLR end "rule__NumericType__Group_2_4__1__Impl"


    // $ANTLR start "rule__NumericType__Group_2_5__0"
    // InternalTextualDataModel.g:4630:1: rule__NumericType__Group_2_5__0 : rule__NumericType__Group_2_5__0__Impl rule__NumericType__Group_2_5__1 ;
    public final void rule__NumericType__Group_2_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4634:1: ( rule__NumericType__Group_2_5__0__Impl rule__NumericType__Group_2_5__1 )
            // InternalTextualDataModel.g:4635:2: rule__NumericType__Group_2_5__0__Impl rule__NumericType__Group_2_5__1
            {
            pushFollow(FOLLOW_19);
            rule__NumericType__Group_2_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group_2_5__1();

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
    // $ANTLR end "rule__NumericType__Group_2_5__0"


    // $ANTLR start "rule__NumericType__Group_2_5__0__Impl"
    // InternalTextualDataModel.g:4642:1: rule__NumericType__Group_2_5__0__Impl : ( 'fractionDigits' ) ;
    public final void rule__NumericType__Group_2_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4646:1: ( ( 'fractionDigits' ) )
            // InternalTextualDataModel.g:4647:1: ( 'fractionDigits' )
            {
            // InternalTextualDataModel.g:4647:1: ( 'fractionDigits' )
            // InternalTextualDataModel.g:4648:2: 'fractionDigits'
            {
             before(grammarAccess.getNumericTypeAccess().getFractionDigitsKeyword_2_5_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getFractionDigitsKeyword_2_5_0()); 

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
    // $ANTLR end "rule__NumericType__Group_2_5__0__Impl"


    // $ANTLR start "rule__NumericType__Group_2_5__1"
    // InternalTextualDataModel.g:4657:1: rule__NumericType__Group_2_5__1 : rule__NumericType__Group_2_5__1__Impl ;
    public final void rule__NumericType__Group_2_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4661:1: ( rule__NumericType__Group_2_5__1__Impl )
            // InternalTextualDataModel.g:4662:2: rule__NumericType__Group_2_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__Group_2_5__1__Impl();

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
    // $ANTLR end "rule__NumericType__Group_2_5__1"


    // $ANTLR start "rule__NumericType__Group_2_5__1__Impl"
    // InternalTextualDataModel.g:4668:1: rule__NumericType__Group_2_5__1__Impl : ( ( rule__NumericType__FractionDigitsAssignment_2_5_1 ) ) ;
    public final void rule__NumericType__Group_2_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4672:1: ( ( ( rule__NumericType__FractionDigitsAssignment_2_5_1 ) ) )
            // InternalTextualDataModel.g:4673:1: ( ( rule__NumericType__FractionDigitsAssignment_2_5_1 ) )
            {
            // InternalTextualDataModel.g:4673:1: ( ( rule__NumericType__FractionDigitsAssignment_2_5_1 ) )
            // InternalTextualDataModel.g:4674:2: ( rule__NumericType__FractionDigitsAssignment_2_5_1 )
            {
             before(grammarAccess.getNumericTypeAccess().getFractionDigitsAssignment_2_5_1()); 
            // InternalTextualDataModel.g:4675:2: ( rule__NumericType__FractionDigitsAssignment_2_5_1 )
            // InternalTextualDataModel.g:4675:3: rule__NumericType__FractionDigitsAssignment_2_5_1
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__FractionDigitsAssignment_2_5_1();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypeAccess().getFractionDigitsAssignment_2_5_1()); 

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
    // $ANTLR end "rule__NumericType__Group_2_5__1__Impl"


    // $ANTLR start "rule__NumericType__Group_2_6__0"
    // InternalTextualDataModel.g:4684:1: rule__NumericType__Group_2_6__0 : rule__NumericType__Group_2_6__0__Impl rule__NumericType__Group_2_6__1 ;
    public final void rule__NumericType__Group_2_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4688:1: ( rule__NumericType__Group_2_6__0__Impl rule__NumericType__Group_2_6__1 )
            // InternalTextualDataModel.g:4689:2: rule__NumericType__Group_2_6__0__Impl rule__NumericType__Group_2_6__1
            {
            pushFollow(FOLLOW_29);
            rule__NumericType__Group_2_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group_2_6__1();

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
    // $ANTLR end "rule__NumericType__Group_2_6__0"


    // $ANTLR start "rule__NumericType__Group_2_6__0__Impl"
    // InternalTextualDataModel.g:4696:1: rule__NumericType__Group_2_6__0__Impl : ( 'minInclusive' ) ;
    public final void rule__NumericType__Group_2_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4700:1: ( ( 'minInclusive' ) )
            // InternalTextualDataModel.g:4701:1: ( 'minInclusive' )
            {
            // InternalTextualDataModel.g:4701:1: ( 'minInclusive' )
            // InternalTextualDataModel.g:4702:2: 'minInclusive'
            {
             before(grammarAccess.getNumericTypeAccess().getMinInclusiveKeyword_2_6_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getMinInclusiveKeyword_2_6_0()); 

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
    // $ANTLR end "rule__NumericType__Group_2_6__0__Impl"


    // $ANTLR start "rule__NumericType__Group_2_6__1"
    // InternalTextualDataModel.g:4711:1: rule__NumericType__Group_2_6__1 : rule__NumericType__Group_2_6__1__Impl ;
    public final void rule__NumericType__Group_2_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4715:1: ( rule__NumericType__Group_2_6__1__Impl )
            // InternalTextualDataModel.g:4716:2: rule__NumericType__Group_2_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__Group_2_6__1__Impl();

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
    // $ANTLR end "rule__NumericType__Group_2_6__1"


    // $ANTLR start "rule__NumericType__Group_2_6__1__Impl"
    // InternalTextualDataModel.g:4722:1: rule__NumericType__Group_2_6__1__Impl : ( ( rule__NumericType__MinInclusiveAssignment_2_6_1 ) ) ;
    public final void rule__NumericType__Group_2_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4726:1: ( ( ( rule__NumericType__MinInclusiveAssignment_2_6_1 ) ) )
            // InternalTextualDataModel.g:4727:1: ( ( rule__NumericType__MinInclusiveAssignment_2_6_1 ) )
            {
            // InternalTextualDataModel.g:4727:1: ( ( rule__NumericType__MinInclusiveAssignment_2_6_1 ) )
            // InternalTextualDataModel.g:4728:2: ( rule__NumericType__MinInclusiveAssignment_2_6_1 )
            {
             before(grammarAccess.getNumericTypeAccess().getMinInclusiveAssignment_2_6_1()); 
            // InternalTextualDataModel.g:4729:2: ( rule__NumericType__MinInclusiveAssignment_2_6_1 )
            // InternalTextualDataModel.g:4729:3: rule__NumericType__MinInclusiveAssignment_2_6_1
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__MinInclusiveAssignment_2_6_1();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypeAccess().getMinInclusiveAssignment_2_6_1()); 

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
    // $ANTLR end "rule__NumericType__Group_2_6__1__Impl"


    // $ANTLR start "rule__NumericType__Group_2_7__0"
    // InternalTextualDataModel.g:4738:1: rule__NumericType__Group_2_7__0 : rule__NumericType__Group_2_7__0__Impl rule__NumericType__Group_2_7__1 ;
    public final void rule__NumericType__Group_2_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4742:1: ( rule__NumericType__Group_2_7__0__Impl rule__NumericType__Group_2_7__1 )
            // InternalTextualDataModel.g:4743:2: rule__NumericType__Group_2_7__0__Impl rule__NumericType__Group_2_7__1
            {
            pushFollow(FOLLOW_29);
            rule__NumericType__Group_2_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group_2_7__1();

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
    // $ANTLR end "rule__NumericType__Group_2_7__0"


    // $ANTLR start "rule__NumericType__Group_2_7__0__Impl"
    // InternalTextualDataModel.g:4750:1: rule__NumericType__Group_2_7__0__Impl : ( 'minExclusive' ) ;
    public final void rule__NumericType__Group_2_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4754:1: ( ( 'minExclusive' ) )
            // InternalTextualDataModel.g:4755:1: ( 'minExclusive' )
            {
            // InternalTextualDataModel.g:4755:1: ( 'minExclusive' )
            // InternalTextualDataModel.g:4756:2: 'minExclusive'
            {
             before(grammarAccess.getNumericTypeAccess().getMinExclusiveKeyword_2_7_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getMinExclusiveKeyword_2_7_0()); 

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
    // $ANTLR end "rule__NumericType__Group_2_7__0__Impl"


    // $ANTLR start "rule__NumericType__Group_2_7__1"
    // InternalTextualDataModel.g:4765:1: rule__NumericType__Group_2_7__1 : rule__NumericType__Group_2_7__1__Impl ;
    public final void rule__NumericType__Group_2_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4769:1: ( rule__NumericType__Group_2_7__1__Impl )
            // InternalTextualDataModel.g:4770:2: rule__NumericType__Group_2_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__Group_2_7__1__Impl();

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
    // $ANTLR end "rule__NumericType__Group_2_7__1"


    // $ANTLR start "rule__NumericType__Group_2_7__1__Impl"
    // InternalTextualDataModel.g:4776:1: rule__NumericType__Group_2_7__1__Impl : ( ( rule__NumericType__MinExclusiveAssignment_2_7_1 ) ) ;
    public final void rule__NumericType__Group_2_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4780:1: ( ( ( rule__NumericType__MinExclusiveAssignment_2_7_1 ) ) )
            // InternalTextualDataModel.g:4781:1: ( ( rule__NumericType__MinExclusiveAssignment_2_7_1 ) )
            {
            // InternalTextualDataModel.g:4781:1: ( ( rule__NumericType__MinExclusiveAssignment_2_7_1 ) )
            // InternalTextualDataModel.g:4782:2: ( rule__NumericType__MinExclusiveAssignment_2_7_1 )
            {
             before(grammarAccess.getNumericTypeAccess().getMinExclusiveAssignment_2_7_1()); 
            // InternalTextualDataModel.g:4783:2: ( rule__NumericType__MinExclusiveAssignment_2_7_1 )
            // InternalTextualDataModel.g:4783:3: rule__NumericType__MinExclusiveAssignment_2_7_1
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__MinExclusiveAssignment_2_7_1();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypeAccess().getMinExclusiveAssignment_2_7_1()); 

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
    // $ANTLR end "rule__NumericType__Group_2_7__1__Impl"


    // $ANTLR start "rule__NumericType__Group_2_8__0"
    // InternalTextualDataModel.g:4792:1: rule__NumericType__Group_2_8__0 : rule__NumericType__Group_2_8__0__Impl rule__NumericType__Group_2_8__1 ;
    public final void rule__NumericType__Group_2_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4796:1: ( rule__NumericType__Group_2_8__0__Impl rule__NumericType__Group_2_8__1 )
            // InternalTextualDataModel.g:4797:2: rule__NumericType__Group_2_8__0__Impl rule__NumericType__Group_2_8__1
            {
            pushFollow(FOLLOW_29);
            rule__NumericType__Group_2_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group_2_8__1();

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
    // $ANTLR end "rule__NumericType__Group_2_8__0"


    // $ANTLR start "rule__NumericType__Group_2_8__0__Impl"
    // InternalTextualDataModel.g:4804:1: rule__NumericType__Group_2_8__0__Impl : ( 'maxInclusive' ) ;
    public final void rule__NumericType__Group_2_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4808:1: ( ( 'maxInclusive' ) )
            // InternalTextualDataModel.g:4809:1: ( 'maxInclusive' )
            {
            // InternalTextualDataModel.g:4809:1: ( 'maxInclusive' )
            // InternalTextualDataModel.g:4810:2: 'maxInclusive'
            {
             before(grammarAccess.getNumericTypeAccess().getMaxInclusiveKeyword_2_8_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getMaxInclusiveKeyword_2_8_0()); 

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
    // $ANTLR end "rule__NumericType__Group_2_8__0__Impl"


    // $ANTLR start "rule__NumericType__Group_2_8__1"
    // InternalTextualDataModel.g:4819:1: rule__NumericType__Group_2_8__1 : rule__NumericType__Group_2_8__1__Impl ;
    public final void rule__NumericType__Group_2_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4823:1: ( rule__NumericType__Group_2_8__1__Impl )
            // InternalTextualDataModel.g:4824:2: rule__NumericType__Group_2_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__Group_2_8__1__Impl();

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
    // $ANTLR end "rule__NumericType__Group_2_8__1"


    // $ANTLR start "rule__NumericType__Group_2_8__1__Impl"
    // InternalTextualDataModel.g:4830:1: rule__NumericType__Group_2_8__1__Impl : ( ( rule__NumericType__MaxInclusiveAssignment_2_8_1 ) ) ;
    public final void rule__NumericType__Group_2_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4834:1: ( ( ( rule__NumericType__MaxInclusiveAssignment_2_8_1 ) ) )
            // InternalTextualDataModel.g:4835:1: ( ( rule__NumericType__MaxInclusiveAssignment_2_8_1 ) )
            {
            // InternalTextualDataModel.g:4835:1: ( ( rule__NumericType__MaxInclusiveAssignment_2_8_1 ) )
            // InternalTextualDataModel.g:4836:2: ( rule__NumericType__MaxInclusiveAssignment_2_8_1 )
            {
             before(grammarAccess.getNumericTypeAccess().getMaxInclusiveAssignment_2_8_1()); 
            // InternalTextualDataModel.g:4837:2: ( rule__NumericType__MaxInclusiveAssignment_2_8_1 )
            // InternalTextualDataModel.g:4837:3: rule__NumericType__MaxInclusiveAssignment_2_8_1
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__MaxInclusiveAssignment_2_8_1();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypeAccess().getMaxInclusiveAssignment_2_8_1()); 

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
    // $ANTLR end "rule__NumericType__Group_2_8__1__Impl"


    // $ANTLR start "rule__NumericType__Group_2_9__0"
    // InternalTextualDataModel.g:4846:1: rule__NumericType__Group_2_9__0 : rule__NumericType__Group_2_9__0__Impl rule__NumericType__Group_2_9__1 ;
    public final void rule__NumericType__Group_2_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4850:1: ( rule__NumericType__Group_2_9__0__Impl rule__NumericType__Group_2_9__1 )
            // InternalTextualDataModel.g:4851:2: rule__NumericType__Group_2_9__0__Impl rule__NumericType__Group_2_9__1
            {
            pushFollow(FOLLOW_29);
            rule__NumericType__Group_2_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group_2_9__1();

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
    // $ANTLR end "rule__NumericType__Group_2_9__0"


    // $ANTLR start "rule__NumericType__Group_2_9__0__Impl"
    // InternalTextualDataModel.g:4858:1: rule__NumericType__Group_2_9__0__Impl : ( 'maxExclusive' ) ;
    public final void rule__NumericType__Group_2_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4862:1: ( ( 'maxExclusive' ) )
            // InternalTextualDataModel.g:4863:1: ( 'maxExclusive' )
            {
            // InternalTextualDataModel.g:4863:1: ( 'maxExclusive' )
            // InternalTextualDataModel.g:4864:2: 'maxExclusive'
            {
             before(grammarAccess.getNumericTypeAccess().getMaxExclusiveKeyword_2_9_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getMaxExclusiveKeyword_2_9_0()); 

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
    // $ANTLR end "rule__NumericType__Group_2_9__0__Impl"


    // $ANTLR start "rule__NumericType__Group_2_9__1"
    // InternalTextualDataModel.g:4873:1: rule__NumericType__Group_2_9__1 : rule__NumericType__Group_2_9__1__Impl ;
    public final void rule__NumericType__Group_2_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4877:1: ( rule__NumericType__Group_2_9__1__Impl )
            // InternalTextualDataModel.g:4878:2: rule__NumericType__Group_2_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__Group_2_9__1__Impl();

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
    // $ANTLR end "rule__NumericType__Group_2_9__1"


    // $ANTLR start "rule__NumericType__Group_2_9__1__Impl"
    // InternalTextualDataModel.g:4884:1: rule__NumericType__Group_2_9__1__Impl : ( ( rule__NumericType__MaxExclusiveAssignment_2_9_1 ) ) ;
    public final void rule__NumericType__Group_2_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4888:1: ( ( ( rule__NumericType__MaxExclusiveAssignment_2_9_1 ) ) )
            // InternalTextualDataModel.g:4889:1: ( ( rule__NumericType__MaxExclusiveAssignment_2_9_1 ) )
            {
            // InternalTextualDataModel.g:4889:1: ( ( rule__NumericType__MaxExclusiveAssignment_2_9_1 ) )
            // InternalTextualDataModel.g:4890:2: ( rule__NumericType__MaxExclusiveAssignment_2_9_1 )
            {
             before(grammarAccess.getNumericTypeAccess().getMaxExclusiveAssignment_2_9_1()); 
            // InternalTextualDataModel.g:4891:2: ( rule__NumericType__MaxExclusiveAssignment_2_9_1 )
            // InternalTextualDataModel.g:4891:3: rule__NumericType__MaxExclusiveAssignment_2_9_1
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__MaxExclusiveAssignment_2_9_1();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypeAccess().getMaxExclusiveAssignment_2_9_1()); 

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
    // $ANTLR end "rule__NumericType__Group_2_9__1__Impl"


    // $ANTLR start "rule__NumericType__Group_2_10__0"
    // InternalTextualDataModel.g:4900:1: rule__NumericType__Group_2_10__0 : rule__NumericType__Group_2_10__0__Impl rule__NumericType__Group_2_10__1 ;
    public final void rule__NumericType__Group_2_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4904:1: ( rule__NumericType__Group_2_10__0__Impl rule__NumericType__Group_2_10__1 )
            // InternalTextualDataModel.g:4905:2: rule__NumericType__Group_2_10__0__Impl rule__NumericType__Group_2_10__1
            {
            pushFollow(FOLLOW_3);
            rule__NumericType__Group_2_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group_2_10__1();

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
    // $ANTLR end "rule__NumericType__Group_2_10__0"


    // $ANTLR start "rule__NumericType__Group_2_10__0__Impl"
    // InternalTextualDataModel.g:4912:1: rule__NumericType__Group_2_10__0__Impl : ( 'measurementUnit' ) ;
    public final void rule__NumericType__Group_2_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4916:1: ( ( 'measurementUnit' ) )
            // InternalTextualDataModel.g:4917:1: ( 'measurementUnit' )
            {
            // InternalTextualDataModel.g:4917:1: ( 'measurementUnit' )
            // InternalTextualDataModel.g:4918:2: 'measurementUnit'
            {
             before(grammarAccess.getNumericTypeAccess().getMeasurementUnitKeyword_2_10_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getMeasurementUnitKeyword_2_10_0()); 

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
    // $ANTLR end "rule__NumericType__Group_2_10__0__Impl"


    // $ANTLR start "rule__NumericType__Group_2_10__1"
    // InternalTextualDataModel.g:4927:1: rule__NumericType__Group_2_10__1 : rule__NumericType__Group_2_10__1__Impl ;
    public final void rule__NumericType__Group_2_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4931:1: ( rule__NumericType__Group_2_10__1__Impl )
            // InternalTextualDataModel.g:4932:2: rule__NumericType__Group_2_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__Group_2_10__1__Impl();

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
    // $ANTLR end "rule__NumericType__Group_2_10__1"


    // $ANTLR start "rule__NumericType__Group_2_10__1__Impl"
    // InternalTextualDataModel.g:4938:1: rule__NumericType__Group_2_10__1__Impl : ( ( rule__NumericType__MeasurementUnitAssignment_2_10_1 ) ) ;
    public final void rule__NumericType__Group_2_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4942:1: ( ( ( rule__NumericType__MeasurementUnitAssignment_2_10_1 ) ) )
            // InternalTextualDataModel.g:4943:1: ( ( rule__NumericType__MeasurementUnitAssignment_2_10_1 ) )
            {
            // InternalTextualDataModel.g:4943:1: ( ( rule__NumericType__MeasurementUnitAssignment_2_10_1 ) )
            // InternalTextualDataModel.g:4944:2: ( rule__NumericType__MeasurementUnitAssignment_2_10_1 )
            {
             before(grammarAccess.getNumericTypeAccess().getMeasurementUnitAssignment_2_10_1()); 
            // InternalTextualDataModel.g:4945:2: ( rule__NumericType__MeasurementUnitAssignment_2_10_1 )
            // InternalTextualDataModel.g:4945:3: rule__NumericType__MeasurementUnitAssignment_2_10_1
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__MeasurementUnitAssignment_2_10_1();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypeAccess().getMeasurementUnitAssignment_2_10_1()); 

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
    // $ANTLR end "rule__NumericType__Group_2_10__1__Impl"


    // $ANTLR start "rule__DateType__Group__0"
    // InternalTextualDataModel.g:4954:1: rule__DateType__Group__0 : rule__DateType__Group__0__Impl rule__DateType__Group__1 ;
    public final void rule__DateType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4958:1: ( rule__DateType__Group__0__Impl rule__DateType__Group__1 )
            // InternalTextualDataModel.g:4959:2: rule__DateType__Group__0__Impl rule__DateType__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DateType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateType__Group__1();

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
    // $ANTLR end "rule__DateType__Group__0"


    // $ANTLR start "rule__DateType__Group__0__Impl"
    // InternalTextualDataModel.g:4966:1: rule__DateType__Group__0__Impl : ( 'DateType' ) ;
    public final void rule__DateType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4970:1: ( ( 'DateType' ) )
            // InternalTextualDataModel.g:4971:1: ( 'DateType' )
            {
            // InternalTextualDataModel.g:4971:1: ( 'DateType' )
            // InternalTextualDataModel.g:4972:2: 'DateType'
            {
             before(grammarAccess.getDateTypeAccess().getDateTypeKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getDateTypeAccess().getDateTypeKeyword_0()); 

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
    // $ANTLR end "rule__DateType__Group__0__Impl"


    // $ANTLR start "rule__DateType__Group__1"
    // InternalTextualDataModel.g:4981:1: rule__DateType__Group__1 : rule__DateType__Group__1__Impl rule__DateType__Group__2 ;
    public final void rule__DateType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4985:1: ( rule__DateType__Group__1__Impl rule__DateType__Group__2 )
            // InternalTextualDataModel.g:4986:2: rule__DateType__Group__1__Impl rule__DateType__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DateType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateType__Group__2();

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
    // $ANTLR end "rule__DateType__Group__1"


    // $ANTLR start "rule__DateType__Group__1__Impl"
    // InternalTextualDataModel.g:4993:1: rule__DateType__Group__1__Impl : ( ( rule__DateType__NameAssignment_1 ) ) ;
    public final void rule__DateType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:4997:1: ( ( ( rule__DateType__NameAssignment_1 ) ) )
            // InternalTextualDataModel.g:4998:1: ( ( rule__DateType__NameAssignment_1 ) )
            {
            // InternalTextualDataModel.g:4998:1: ( ( rule__DateType__NameAssignment_1 ) )
            // InternalTextualDataModel.g:4999:2: ( rule__DateType__NameAssignment_1 )
            {
             before(grammarAccess.getDateTypeAccess().getNameAssignment_1()); 
            // InternalTextualDataModel.g:5000:2: ( rule__DateType__NameAssignment_1 )
            // InternalTextualDataModel.g:5000:3: rule__DateType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DateType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDateTypeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DateType__Group__1__Impl"


    // $ANTLR start "rule__DateType__Group__2"
    // InternalTextualDataModel.g:5008:1: rule__DateType__Group__2 : rule__DateType__Group__2__Impl ;
    public final void rule__DateType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5012:1: ( rule__DateType__Group__2__Impl )
            // InternalTextualDataModel.g:5013:2: rule__DateType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DateType__Group__2__Impl();

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
    // $ANTLR end "rule__DateType__Group__2"


    // $ANTLR start "rule__DateType__Group__2__Impl"
    // InternalTextualDataModel.g:5019:1: rule__DateType__Group__2__Impl : ( ( rule__DateType__Group_2__0 )? ) ;
    public final void rule__DateType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5023:1: ( ( ( rule__DateType__Group_2__0 )? ) )
            // InternalTextualDataModel.g:5024:1: ( ( rule__DateType__Group_2__0 )? )
            {
            // InternalTextualDataModel.g:5024:1: ( ( rule__DateType__Group_2__0 )? )
            // InternalTextualDataModel.g:5025:2: ( rule__DateType__Group_2__0 )?
            {
             before(grammarAccess.getDateTypeAccess().getGroup_2()); 
            // InternalTextualDataModel.g:5026:2: ( rule__DateType__Group_2__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==22) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalTextualDataModel.g:5026:3: rule__DateType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DateType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDateTypeAccess().getGroup_2()); 

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
    // $ANTLR end "rule__DateType__Group__2__Impl"


    // $ANTLR start "rule__DateType__Group_2__0"
    // InternalTextualDataModel.g:5035:1: rule__DateType__Group_2__0 : rule__DateType__Group_2__0__Impl rule__DateType__Group_2__1 ;
    public final void rule__DateType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5039:1: ( rule__DateType__Group_2__0__Impl rule__DateType__Group_2__1 )
            // InternalTextualDataModel.g:5040:2: rule__DateType__Group_2__0__Impl rule__DateType__Group_2__1
            {
            pushFollow(FOLLOW_23);
            rule__DateType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateType__Group_2__1();

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
    // $ANTLR end "rule__DateType__Group_2__0"


    // $ANTLR start "rule__DateType__Group_2__0__Impl"
    // InternalTextualDataModel.g:5047:1: rule__DateType__Group_2__0__Impl : ( '{' ) ;
    public final void rule__DateType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5051:1: ( ( '{' ) )
            // InternalTextualDataModel.g:5052:1: ( '{' )
            {
            // InternalTextualDataModel.g:5052:1: ( '{' )
            // InternalTextualDataModel.g:5053:2: '{'
            {
             before(grammarAccess.getDateTypeAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDateTypeAccess().getLeftCurlyBracketKeyword_2_0()); 

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
    // $ANTLR end "rule__DateType__Group_2__0__Impl"


    // $ANTLR start "rule__DateType__Group_2__1"
    // InternalTextualDataModel.g:5062:1: rule__DateType__Group_2__1 : rule__DateType__Group_2__1__Impl rule__DateType__Group_2__2 ;
    public final void rule__DateType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5066:1: ( rule__DateType__Group_2__1__Impl rule__DateType__Group_2__2 )
            // InternalTextualDataModel.g:5067:2: rule__DateType__Group_2__1__Impl rule__DateType__Group_2__2
            {
            pushFollow(FOLLOW_23);
            rule__DateType__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateType__Group_2__2();

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
    // $ANTLR end "rule__DateType__Group_2__1"


    // $ANTLR start "rule__DateType__Group_2__1__Impl"
    // InternalTextualDataModel.g:5074:1: rule__DateType__Group_2__1__Impl : ( ( rule__DateType__Group_2_1__0 )? ) ;
    public final void rule__DateType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5078:1: ( ( ( rule__DateType__Group_2_1__0 )? ) )
            // InternalTextualDataModel.g:5079:1: ( ( rule__DateType__Group_2_1__0 )? )
            {
            // InternalTextualDataModel.g:5079:1: ( ( rule__DateType__Group_2_1__0 )? )
            // InternalTextualDataModel.g:5080:2: ( rule__DateType__Group_2_1__0 )?
            {
             before(grammarAccess.getDateTypeAccess().getGroup_2_1()); 
            // InternalTextualDataModel.g:5081:2: ( rule__DateType__Group_2_1__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==24) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalTextualDataModel.g:5081:3: rule__DateType__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DateType__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDateTypeAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__DateType__Group_2__1__Impl"


    // $ANTLR start "rule__DateType__Group_2__2"
    // InternalTextualDataModel.g:5089:1: rule__DateType__Group_2__2 : rule__DateType__Group_2__2__Impl rule__DateType__Group_2__3 ;
    public final void rule__DateType__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5093:1: ( rule__DateType__Group_2__2__Impl rule__DateType__Group_2__3 )
            // InternalTextualDataModel.g:5094:2: rule__DateType__Group_2__2__Impl rule__DateType__Group_2__3
            {
            pushFollow(FOLLOW_23);
            rule__DateType__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateType__Group_2__3();

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
    // $ANTLR end "rule__DateType__Group_2__2"


    // $ANTLR start "rule__DateType__Group_2__2__Impl"
    // InternalTextualDataModel.g:5101:1: rule__DateType__Group_2__2__Impl : ( ( rule__DateType__LocalizationsAssignment_2_2 )* ) ;
    public final void rule__DateType__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5105:1: ( ( ( rule__DateType__LocalizationsAssignment_2_2 )* ) )
            // InternalTextualDataModel.g:5106:1: ( ( rule__DateType__LocalizationsAssignment_2_2 )* )
            {
            // InternalTextualDataModel.g:5106:1: ( ( rule__DateType__LocalizationsAssignment_2_2 )* )
            // InternalTextualDataModel.g:5107:2: ( rule__DateType__LocalizationsAssignment_2_2 )*
            {
             before(grammarAccess.getDateTypeAccess().getLocalizationsAssignment_2_2()); 
            // InternalTextualDataModel.g:5108:2: ( rule__DateType__LocalizationsAssignment_2_2 )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==53) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalTextualDataModel.g:5108:3: rule__DateType__LocalizationsAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__DateType__LocalizationsAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

             after(grammarAccess.getDateTypeAccess().getLocalizationsAssignment_2_2()); 

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
    // $ANTLR end "rule__DateType__Group_2__2__Impl"


    // $ANTLR start "rule__DateType__Group_2__3"
    // InternalTextualDataModel.g:5116:1: rule__DateType__Group_2__3 : rule__DateType__Group_2__3__Impl ;
    public final void rule__DateType__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5120:1: ( rule__DateType__Group_2__3__Impl )
            // InternalTextualDataModel.g:5121:2: rule__DateType__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DateType__Group_2__3__Impl();

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
    // $ANTLR end "rule__DateType__Group_2__3"


    // $ANTLR start "rule__DateType__Group_2__3__Impl"
    // InternalTextualDataModel.g:5127:1: rule__DateType__Group_2__3__Impl : ( '}' ) ;
    public final void rule__DateType__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5131:1: ( ( '}' ) )
            // InternalTextualDataModel.g:5132:1: ( '}' )
            {
            // InternalTextualDataModel.g:5132:1: ( '}' )
            // InternalTextualDataModel.g:5133:2: '}'
            {
             before(grammarAccess.getDateTypeAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDateTypeAccess().getRightCurlyBracketKeyword_2_3()); 

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
    // $ANTLR end "rule__DateType__Group_2__3__Impl"


    // $ANTLR start "rule__DateType__Group_2_1__0"
    // InternalTextualDataModel.g:5143:1: rule__DateType__Group_2_1__0 : rule__DateType__Group_2_1__0__Impl rule__DateType__Group_2_1__1 ;
    public final void rule__DateType__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5147:1: ( rule__DateType__Group_2_1__0__Impl rule__DateType__Group_2_1__1 )
            // InternalTextualDataModel.g:5148:2: rule__DateType__Group_2_1__0__Impl rule__DateType__Group_2_1__1
            {
            pushFollow(FOLLOW_10);
            rule__DateType__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateType__Group_2_1__1();

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
    // $ANTLR end "rule__DateType__Group_2_1__0"


    // $ANTLR start "rule__DateType__Group_2_1__0__Impl"
    // InternalTextualDataModel.g:5155:1: rule__DateType__Group_2_1__0__Impl : ( '@description' ) ;
    public final void rule__DateType__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5159:1: ( ( '@description' ) )
            // InternalTextualDataModel.g:5160:1: ( '@description' )
            {
            // InternalTextualDataModel.g:5160:1: ( '@description' )
            // InternalTextualDataModel.g:5161:2: '@description'
            {
             before(grammarAccess.getDateTypeAccess().getDescriptionKeyword_2_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDateTypeAccess().getDescriptionKeyword_2_1_0()); 

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
    // $ANTLR end "rule__DateType__Group_2_1__0__Impl"


    // $ANTLR start "rule__DateType__Group_2_1__1"
    // InternalTextualDataModel.g:5170:1: rule__DateType__Group_2_1__1 : rule__DateType__Group_2_1__1__Impl rule__DateType__Group_2_1__2 ;
    public final void rule__DateType__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5174:1: ( rule__DateType__Group_2_1__1__Impl rule__DateType__Group_2_1__2 )
            // InternalTextualDataModel.g:5175:2: rule__DateType__Group_2_1__1__Impl rule__DateType__Group_2_1__2
            {
            pushFollow(FOLLOW_3);
            rule__DateType__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateType__Group_2_1__2();

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
    // $ANTLR end "rule__DateType__Group_2_1__1"


    // $ANTLR start "rule__DateType__Group_2_1__1__Impl"
    // InternalTextualDataModel.g:5182:1: rule__DateType__Group_2_1__1__Impl : ( '(' ) ;
    public final void rule__DateType__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5186:1: ( ( '(' ) )
            // InternalTextualDataModel.g:5187:1: ( '(' )
            {
            // InternalTextualDataModel.g:5187:1: ( '(' )
            // InternalTextualDataModel.g:5188:2: '('
            {
             before(grammarAccess.getDateTypeAccess().getLeftParenthesisKeyword_2_1_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDateTypeAccess().getLeftParenthesisKeyword_2_1_1()); 

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
    // $ANTLR end "rule__DateType__Group_2_1__1__Impl"


    // $ANTLR start "rule__DateType__Group_2_1__2"
    // InternalTextualDataModel.g:5197:1: rule__DateType__Group_2_1__2 : rule__DateType__Group_2_1__2__Impl rule__DateType__Group_2_1__3 ;
    public final void rule__DateType__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5201:1: ( rule__DateType__Group_2_1__2__Impl rule__DateType__Group_2_1__3 )
            // InternalTextualDataModel.g:5202:2: rule__DateType__Group_2_1__2__Impl rule__DateType__Group_2_1__3
            {
            pushFollow(FOLLOW_11);
            rule__DateType__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateType__Group_2_1__3();

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
    // $ANTLR end "rule__DateType__Group_2_1__2"


    // $ANTLR start "rule__DateType__Group_2_1__2__Impl"
    // InternalTextualDataModel.g:5209:1: rule__DateType__Group_2_1__2__Impl : ( ( rule__DateType__DescriptionAssignment_2_1_2 ) ) ;
    public final void rule__DateType__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5213:1: ( ( ( rule__DateType__DescriptionAssignment_2_1_2 ) ) )
            // InternalTextualDataModel.g:5214:1: ( ( rule__DateType__DescriptionAssignment_2_1_2 ) )
            {
            // InternalTextualDataModel.g:5214:1: ( ( rule__DateType__DescriptionAssignment_2_1_2 ) )
            // InternalTextualDataModel.g:5215:2: ( rule__DateType__DescriptionAssignment_2_1_2 )
            {
             before(grammarAccess.getDateTypeAccess().getDescriptionAssignment_2_1_2()); 
            // InternalTextualDataModel.g:5216:2: ( rule__DateType__DescriptionAssignment_2_1_2 )
            // InternalTextualDataModel.g:5216:3: rule__DateType__DescriptionAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__DateType__DescriptionAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDateTypeAccess().getDescriptionAssignment_2_1_2()); 

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
    // $ANTLR end "rule__DateType__Group_2_1__2__Impl"


    // $ANTLR start "rule__DateType__Group_2_1__3"
    // InternalTextualDataModel.g:5224:1: rule__DateType__Group_2_1__3 : rule__DateType__Group_2_1__3__Impl ;
    public final void rule__DateType__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5228:1: ( rule__DateType__Group_2_1__3__Impl )
            // InternalTextualDataModel.g:5229:2: rule__DateType__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DateType__Group_2_1__3__Impl();

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
    // $ANTLR end "rule__DateType__Group_2_1__3"


    // $ANTLR start "rule__DateType__Group_2_1__3__Impl"
    // InternalTextualDataModel.g:5235:1: rule__DateType__Group_2_1__3__Impl : ( ')' ) ;
    public final void rule__DateType__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5239:1: ( ( ')' ) )
            // InternalTextualDataModel.g:5240:1: ( ')' )
            {
            // InternalTextualDataModel.g:5240:1: ( ')' )
            // InternalTextualDataModel.g:5241:2: ')'
            {
             before(grammarAccess.getDateTypeAccess().getRightParenthesisKeyword_2_1_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDateTypeAccess().getRightParenthesisKeyword_2_1_3()); 

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
    // $ANTLR end "rule__DateType__Group_2_1__3__Impl"


    // $ANTLR start "rule__DateTimeType__Group__0"
    // InternalTextualDataModel.g:5251:1: rule__DateTimeType__Group__0 : rule__DateTimeType__Group__0__Impl rule__DateTimeType__Group__1 ;
    public final void rule__DateTimeType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5255:1: ( rule__DateTimeType__Group__0__Impl rule__DateTimeType__Group__1 )
            // InternalTextualDataModel.g:5256:2: rule__DateTimeType__Group__0__Impl rule__DateTimeType__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DateTimeType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateTimeType__Group__1();

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
    // $ANTLR end "rule__DateTimeType__Group__0"


    // $ANTLR start "rule__DateTimeType__Group__0__Impl"
    // InternalTextualDataModel.g:5263:1: rule__DateTimeType__Group__0__Impl : ( 'DateTimeType' ) ;
    public final void rule__DateTimeType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5267:1: ( ( 'DateTimeType' ) )
            // InternalTextualDataModel.g:5268:1: ( 'DateTimeType' )
            {
            // InternalTextualDataModel.g:5268:1: ( 'DateTimeType' )
            // InternalTextualDataModel.g:5269:2: 'DateTimeType'
            {
             before(grammarAccess.getDateTimeTypeAccess().getDateTimeTypeKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getDateTimeTypeAccess().getDateTimeTypeKeyword_0()); 

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
    // $ANTLR end "rule__DateTimeType__Group__0__Impl"


    // $ANTLR start "rule__DateTimeType__Group__1"
    // InternalTextualDataModel.g:5278:1: rule__DateTimeType__Group__1 : rule__DateTimeType__Group__1__Impl rule__DateTimeType__Group__2 ;
    public final void rule__DateTimeType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5282:1: ( rule__DateTimeType__Group__1__Impl rule__DateTimeType__Group__2 )
            // InternalTextualDataModel.g:5283:2: rule__DateTimeType__Group__1__Impl rule__DateTimeType__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DateTimeType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateTimeType__Group__2();

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
    // $ANTLR end "rule__DateTimeType__Group__1"


    // $ANTLR start "rule__DateTimeType__Group__1__Impl"
    // InternalTextualDataModel.g:5290:1: rule__DateTimeType__Group__1__Impl : ( ( rule__DateTimeType__NameAssignment_1 ) ) ;
    public final void rule__DateTimeType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5294:1: ( ( ( rule__DateTimeType__NameAssignment_1 ) ) )
            // InternalTextualDataModel.g:5295:1: ( ( rule__DateTimeType__NameAssignment_1 ) )
            {
            // InternalTextualDataModel.g:5295:1: ( ( rule__DateTimeType__NameAssignment_1 ) )
            // InternalTextualDataModel.g:5296:2: ( rule__DateTimeType__NameAssignment_1 )
            {
             before(grammarAccess.getDateTimeTypeAccess().getNameAssignment_1()); 
            // InternalTextualDataModel.g:5297:2: ( rule__DateTimeType__NameAssignment_1 )
            // InternalTextualDataModel.g:5297:3: rule__DateTimeType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DateTimeType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDateTimeTypeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DateTimeType__Group__1__Impl"


    // $ANTLR start "rule__DateTimeType__Group__2"
    // InternalTextualDataModel.g:5305:1: rule__DateTimeType__Group__2 : rule__DateTimeType__Group__2__Impl ;
    public final void rule__DateTimeType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5309:1: ( rule__DateTimeType__Group__2__Impl )
            // InternalTextualDataModel.g:5310:2: rule__DateTimeType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DateTimeType__Group__2__Impl();

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
    // $ANTLR end "rule__DateTimeType__Group__2"


    // $ANTLR start "rule__DateTimeType__Group__2__Impl"
    // InternalTextualDataModel.g:5316:1: rule__DateTimeType__Group__2__Impl : ( ( rule__DateTimeType__Group_2__0 )? ) ;
    public final void rule__DateTimeType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5320:1: ( ( ( rule__DateTimeType__Group_2__0 )? ) )
            // InternalTextualDataModel.g:5321:1: ( ( rule__DateTimeType__Group_2__0 )? )
            {
            // InternalTextualDataModel.g:5321:1: ( ( rule__DateTimeType__Group_2__0 )? )
            // InternalTextualDataModel.g:5322:2: ( rule__DateTimeType__Group_2__0 )?
            {
             before(grammarAccess.getDateTimeTypeAccess().getGroup_2()); 
            // InternalTextualDataModel.g:5323:2: ( rule__DateTimeType__Group_2__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==22) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalTextualDataModel.g:5323:3: rule__DateTimeType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DateTimeType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDateTimeTypeAccess().getGroup_2()); 

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
    // $ANTLR end "rule__DateTimeType__Group__2__Impl"


    // $ANTLR start "rule__DateTimeType__Group_2__0"
    // InternalTextualDataModel.g:5332:1: rule__DateTimeType__Group_2__0 : rule__DateTimeType__Group_2__0__Impl rule__DateTimeType__Group_2__1 ;
    public final void rule__DateTimeType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5336:1: ( rule__DateTimeType__Group_2__0__Impl rule__DateTimeType__Group_2__1 )
            // InternalTextualDataModel.g:5337:2: rule__DateTimeType__Group_2__0__Impl rule__DateTimeType__Group_2__1
            {
            pushFollow(FOLLOW_23);
            rule__DateTimeType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateTimeType__Group_2__1();

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
    // $ANTLR end "rule__DateTimeType__Group_2__0"


    // $ANTLR start "rule__DateTimeType__Group_2__0__Impl"
    // InternalTextualDataModel.g:5344:1: rule__DateTimeType__Group_2__0__Impl : ( '{' ) ;
    public final void rule__DateTimeType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5348:1: ( ( '{' ) )
            // InternalTextualDataModel.g:5349:1: ( '{' )
            {
            // InternalTextualDataModel.g:5349:1: ( '{' )
            // InternalTextualDataModel.g:5350:2: '{'
            {
             before(grammarAccess.getDateTimeTypeAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDateTimeTypeAccess().getLeftCurlyBracketKeyword_2_0()); 

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
    // $ANTLR end "rule__DateTimeType__Group_2__0__Impl"


    // $ANTLR start "rule__DateTimeType__Group_2__1"
    // InternalTextualDataModel.g:5359:1: rule__DateTimeType__Group_2__1 : rule__DateTimeType__Group_2__1__Impl rule__DateTimeType__Group_2__2 ;
    public final void rule__DateTimeType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5363:1: ( rule__DateTimeType__Group_2__1__Impl rule__DateTimeType__Group_2__2 )
            // InternalTextualDataModel.g:5364:2: rule__DateTimeType__Group_2__1__Impl rule__DateTimeType__Group_2__2
            {
            pushFollow(FOLLOW_23);
            rule__DateTimeType__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateTimeType__Group_2__2();

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
    // $ANTLR end "rule__DateTimeType__Group_2__1"


    // $ANTLR start "rule__DateTimeType__Group_2__1__Impl"
    // InternalTextualDataModel.g:5371:1: rule__DateTimeType__Group_2__1__Impl : ( ( rule__DateTimeType__Group_2_1__0 )? ) ;
    public final void rule__DateTimeType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5375:1: ( ( ( rule__DateTimeType__Group_2_1__0 )? ) )
            // InternalTextualDataModel.g:5376:1: ( ( rule__DateTimeType__Group_2_1__0 )? )
            {
            // InternalTextualDataModel.g:5376:1: ( ( rule__DateTimeType__Group_2_1__0 )? )
            // InternalTextualDataModel.g:5377:2: ( rule__DateTimeType__Group_2_1__0 )?
            {
             before(grammarAccess.getDateTimeTypeAccess().getGroup_2_1()); 
            // InternalTextualDataModel.g:5378:2: ( rule__DateTimeType__Group_2_1__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==24) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalTextualDataModel.g:5378:3: rule__DateTimeType__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DateTimeType__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDateTimeTypeAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__DateTimeType__Group_2__1__Impl"


    // $ANTLR start "rule__DateTimeType__Group_2__2"
    // InternalTextualDataModel.g:5386:1: rule__DateTimeType__Group_2__2 : rule__DateTimeType__Group_2__2__Impl rule__DateTimeType__Group_2__3 ;
    public final void rule__DateTimeType__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5390:1: ( rule__DateTimeType__Group_2__2__Impl rule__DateTimeType__Group_2__3 )
            // InternalTextualDataModel.g:5391:2: rule__DateTimeType__Group_2__2__Impl rule__DateTimeType__Group_2__3
            {
            pushFollow(FOLLOW_23);
            rule__DateTimeType__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateTimeType__Group_2__3();

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
    // $ANTLR end "rule__DateTimeType__Group_2__2"


    // $ANTLR start "rule__DateTimeType__Group_2__2__Impl"
    // InternalTextualDataModel.g:5398:1: rule__DateTimeType__Group_2__2__Impl : ( ( rule__DateTimeType__LocalizationsAssignment_2_2 )* ) ;
    public final void rule__DateTimeType__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5402:1: ( ( ( rule__DateTimeType__LocalizationsAssignment_2_2 )* ) )
            // InternalTextualDataModel.g:5403:1: ( ( rule__DateTimeType__LocalizationsAssignment_2_2 )* )
            {
            // InternalTextualDataModel.g:5403:1: ( ( rule__DateTimeType__LocalizationsAssignment_2_2 )* )
            // InternalTextualDataModel.g:5404:2: ( rule__DateTimeType__LocalizationsAssignment_2_2 )*
            {
             before(grammarAccess.getDateTimeTypeAccess().getLocalizationsAssignment_2_2()); 
            // InternalTextualDataModel.g:5405:2: ( rule__DateTimeType__LocalizationsAssignment_2_2 )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==53) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalTextualDataModel.g:5405:3: rule__DateTimeType__LocalizationsAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__DateTimeType__LocalizationsAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

             after(grammarAccess.getDateTimeTypeAccess().getLocalizationsAssignment_2_2()); 

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
    // $ANTLR end "rule__DateTimeType__Group_2__2__Impl"


    // $ANTLR start "rule__DateTimeType__Group_2__3"
    // InternalTextualDataModel.g:5413:1: rule__DateTimeType__Group_2__3 : rule__DateTimeType__Group_2__3__Impl ;
    public final void rule__DateTimeType__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5417:1: ( rule__DateTimeType__Group_2__3__Impl )
            // InternalTextualDataModel.g:5418:2: rule__DateTimeType__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DateTimeType__Group_2__3__Impl();

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
    // $ANTLR end "rule__DateTimeType__Group_2__3"


    // $ANTLR start "rule__DateTimeType__Group_2__3__Impl"
    // InternalTextualDataModel.g:5424:1: rule__DateTimeType__Group_2__3__Impl : ( '}' ) ;
    public final void rule__DateTimeType__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5428:1: ( ( '}' ) )
            // InternalTextualDataModel.g:5429:1: ( '}' )
            {
            // InternalTextualDataModel.g:5429:1: ( '}' )
            // InternalTextualDataModel.g:5430:2: '}'
            {
             before(grammarAccess.getDateTimeTypeAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDateTimeTypeAccess().getRightCurlyBracketKeyword_2_3()); 

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
    // $ANTLR end "rule__DateTimeType__Group_2__3__Impl"


    // $ANTLR start "rule__DateTimeType__Group_2_1__0"
    // InternalTextualDataModel.g:5440:1: rule__DateTimeType__Group_2_1__0 : rule__DateTimeType__Group_2_1__0__Impl rule__DateTimeType__Group_2_1__1 ;
    public final void rule__DateTimeType__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5444:1: ( rule__DateTimeType__Group_2_1__0__Impl rule__DateTimeType__Group_2_1__1 )
            // InternalTextualDataModel.g:5445:2: rule__DateTimeType__Group_2_1__0__Impl rule__DateTimeType__Group_2_1__1
            {
            pushFollow(FOLLOW_10);
            rule__DateTimeType__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateTimeType__Group_2_1__1();

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
    // $ANTLR end "rule__DateTimeType__Group_2_1__0"


    // $ANTLR start "rule__DateTimeType__Group_2_1__0__Impl"
    // InternalTextualDataModel.g:5452:1: rule__DateTimeType__Group_2_1__0__Impl : ( '@description' ) ;
    public final void rule__DateTimeType__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5456:1: ( ( '@description' ) )
            // InternalTextualDataModel.g:5457:1: ( '@description' )
            {
            // InternalTextualDataModel.g:5457:1: ( '@description' )
            // InternalTextualDataModel.g:5458:2: '@description'
            {
             before(grammarAccess.getDateTimeTypeAccess().getDescriptionKeyword_2_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDateTimeTypeAccess().getDescriptionKeyword_2_1_0()); 

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
    // $ANTLR end "rule__DateTimeType__Group_2_1__0__Impl"


    // $ANTLR start "rule__DateTimeType__Group_2_1__1"
    // InternalTextualDataModel.g:5467:1: rule__DateTimeType__Group_2_1__1 : rule__DateTimeType__Group_2_1__1__Impl rule__DateTimeType__Group_2_1__2 ;
    public final void rule__DateTimeType__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5471:1: ( rule__DateTimeType__Group_2_1__1__Impl rule__DateTimeType__Group_2_1__2 )
            // InternalTextualDataModel.g:5472:2: rule__DateTimeType__Group_2_1__1__Impl rule__DateTimeType__Group_2_1__2
            {
            pushFollow(FOLLOW_3);
            rule__DateTimeType__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateTimeType__Group_2_1__2();

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
    // $ANTLR end "rule__DateTimeType__Group_2_1__1"


    // $ANTLR start "rule__DateTimeType__Group_2_1__1__Impl"
    // InternalTextualDataModel.g:5479:1: rule__DateTimeType__Group_2_1__1__Impl : ( '(' ) ;
    public final void rule__DateTimeType__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5483:1: ( ( '(' ) )
            // InternalTextualDataModel.g:5484:1: ( '(' )
            {
            // InternalTextualDataModel.g:5484:1: ( '(' )
            // InternalTextualDataModel.g:5485:2: '('
            {
             before(grammarAccess.getDateTimeTypeAccess().getLeftParenthesisKeyword_2_1_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDateTimeTypeAccess().getLeftParenthesisKeyword_2_1_1()); 

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
    // $ANTLR end "rule__DateTimeType__Group_2_1__1__Impl"


    // $ANTLR start "rule__DateTimeType__Group_2_1__2"
    // InternalTextualDataModel.g:5494:1: rule__DateTimeType__Group_2_1__2 : rule__DateTimeType__Group_2_1__2__Impl rule__DateTimeType__Group_2_1__3 ;
    public final void rule__DateTimeType__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5498:1: ( rule__DateTimeType__Group_2_1__2__Impl rule__DateTimeType__Group_2_1__3 )
            // InternalTextualDataModel.g:5499:2: rule__DateTimeType__Group_2_1__2__Impl rule__DateTimeType__Group_2_1__3
            {
            pushFollow(FOLLOW_11);
            rule__DateTimeType__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateTimeType__Group_2_1__3();

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
    // $ANTLR end "rule__DateTimeType__Group_2_1__2"


    // $ANTLR start "rule__DateTimeType__Group_2_1__2__Impl"
    // InternalTextualDataModel.g:5506:1: rule__DateTimeType__Group_2_1__2__Impl : ( ( rule__DateTimeType__DescriptionAssignment_2_1_2 ) ) ;
    public final void rule__DateTimeType__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5510:1: ( ( ( rule__DateTimeType__DescriptionAssignment_2_1_2 ) ) )
            // InternalTextualDataModel.g:5511:1: ( ( rule__DateTimeType__DescriptionAssignment_2_1_2 ) )
            {
            // InternalTextualDataModel.g:5511:1: ( ( rule__DateTimeType__DescriptionAssignment_2_1_2 ) )
            // InternalTextualDataModel.g:5512:2: ( rule__DateTimeType__DescriptionAssignment_2_1_2 )
            {
             before(grammarAccess.getDateTimeTypeAccess().getDescriptionAssignment_2_1_2()); 
            // InternalTextualDataModel.g:5513:2: ( rule__DateTimeType__DescriptionAssignment_2_1_2 )
            // InternalTextualDataModel.g:5513:3: rule__DateTimeType__DescriptionAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__DateTimeType__DescriptionAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDateTimeTypeAccess().getDescriptionAssignment_2_1_2()); 

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
    // $ANTLR end "rule__DateTimeType__Group_2_1__2__Impl"


    // $ANTLR start "rule__DateTimeType__Group_2_1__3"
    // InternalTextualDataModel.g:5521:1: rule__DateTimeType__Group_2_1__3 : rule__DateTimeType__Group_2_1__3__Impl ;
    public final void rule__DateTimeType__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5525:1: ( rule__DateTimeType__Group_2_1__3__Impl )
            // InternalTextualDataModel.g:5526:2: rule__DateTimeType__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DateTimeType__Group_2_1__3__Impl();

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
    // $ANTLR end "rule__DateTimeType__Group_2_1__3"


    // $ANTLR start "rule__DateTimeType__Group_2_1__3__Impl"
    // InternalTextualDataModel.g:5532:1: rule__DateTimeType__Group_2_1__3__Impl : ( ')' ) ;
    public final void rule__DateTimeType__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5536:1: ( ( ')' ) )
            // InternalTextualDataModel.g:5537:1: ( ')' )
            {
            // InternalTextualDataModel.g:5537:1: ( ')' )
            // InternalTextualDataModel.g:5538:2: ')'
            {
             before(grammarAccess.getDateTimeTypeAccess().getRightParenthesisKeyword_2_1_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDateTimeTypeAccess().getRightParenthesisKeyword_2_1_3()); 

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
    // $ANTLR end "rule__DateTimeType__Group_2_1__3__Impl"


    // $ANTLR start "rule__UuidType__Group__0"
    // InternalTextualDataModel.g:5548:1: rule__UuidType__Group__0 : rule__UuidType__Group__0__Impl rule__UuidType__Group__1 ;
    public final void rule__UuidType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5552:1: ( rule__UuidType__Group__0__Impl rule__UuidType__Group__1 )
            // InternalTextualDataModel.g:5553:2: rule__UuidType__Group__0__Impl rule__UuidType__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__UuidType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UuidType__Group__1();

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
    // $ANTLR end "rule__UuidType__Group__0"


    // $ANTLR start "rule__UuidType__Group__0__Impl"
    // InternalTextualDataModel.g:5560:1: rule__UuidType__Group__0__Impl : ( 'UuidType' ) ;
    public final void rule__UuidType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5564:1: ( ( 'UuidType' ) )
            // InternalTextualDataModel.g:5565:1: ( 'UuidType' )
            {
            // InternalTextualDataModel.g:5565:1: ( 'UuidType' )
            // InternalTextualDataModel.g:5566:2: 'UuidType'
            {
             before(grammarAccess.getUuidTypeAccess().getUuidTypeKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getUuidTypeAccess().getUuidTypeKeyword_0()); 

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
    // $ANTLR end "rule__UuidType__Group__0__Impl"


    // $ANTLR start "rule__UuidType__Group__1"
    // InternalTextualDataModel.g:5575:1: rule__UuidType__Group__1 : rule__UuidType__Group__1__Impl rule__UuidType__Group__2 ;
    public final void rule__UuidType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5579:1: ( rule__UuidType__Group__1__Impl rule__UuidType__Group__2 )
            // InternalTextualDataModel.g:5580:2: rule__UuidType__Group__1__Impl rule__UuidType__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__UuidType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UuidType__Group__2();

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
    // $ANTLR end "rule__UuidType__Group__1"


    // $ANTLR start "rule__UuidType__Group__1__Impl"
    // InternalTextualDataModel.g:5587:1: rule__UuidType__Group__1__Impl : ( ( rule__UuidType__NameAssignment_1 ) ) ;
    public final void rule__UuidType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5591:1: ( ( ( rule__UuidType__NameAssignment_1 ) ) )
            // InternalTextualDataModel.g:5592:1: ( ( rule__UuidType__NameAssignment_1 ) )
            {
            // InternalTextualDataModel.g:5592:1: ( ( rule__UuidType__NameAssignment_1 ) )
            // InternalTextualDataModel.g:5593:2: ( rule__UuidType__NameAssignment_1 )
            {
             before(grammarAccess.getUuidTypeAccess().getNameAssignment_1()); 
            // InternalTextualDataModel.g:5594:2: ( rule__UuidType__NameAssignment_1 )
            // InternalTextualDataModel.g:5594:3: rule__UuidType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UuidType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUuidTypeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__UuidType__Group__1__Impl"


    // $ANTLR start "rule__UuidType__Group__2"
    // InternalTextualDataModel.g:5602:1: rule__UuidType__Group__2 : rule__UuidType__Group__2__Impl ;
    public final void rule__UuidType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5606:1: ( rule__UuidType__Group__2__Impl )
            // InternalTextualDataModel.g:5607:2: rule__UuidType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UuidType__Group__2__Impl();

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
    // $ANTLR end "rule__UuidType__Group__2"


    // $ANTLR start "rule__UuidType__Group__2__Impl"
    // InternalTextualDataModel.g:5613:1: rule__UuidType__Group__2__Impl : ( ( rule__UuidType__Group_2__0 )? ) ;
    public final void rule__UuidType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5617:1: ( ( ( rule__UuidType__Group_2__0 )? ) )
            // InternalTextualDataModel.g:5618:1: ( ( rule__UuidType__Group_2__0 )? )
            {
            // InternalTextualDataModel.g:5618:1: ( ( rule__UuidType__Group_2__0 )? )
            // InternalTextualDataModel.g:5619:2: ( rule__UuidType__Group_2__0 )?
            {
             before(grammarAccess.getUuidTypeAccess().getGroup_2()); 
            // InternalTextualDataModel.g:5620:2: ( rule__UuidType__Group_2__0 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==22) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalTextualDataModel.g:5620:3: rule__UuidType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UuidType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUuidTypeAccess().getGroup_2()); 

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
    // $ANTLR end "rule__UuidType__Group__2__Impl"


    // $ANTLR start "rule__UuidType__Group_2__0"
    // InternalTextualDataModel.g:5629:1: rule__UuidType__Group_2__0 : rule__UuidType__Group_2__0__Impl rule__UuidType__Group_2__1 ;
    public final void rule__UuidType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5633:1: ( rule__UuidType__Group_2__0__Impl rule__UuidType__Group_2__1 )
            // InternalTextualDataModel.g:5634:2: rule__UuidType__Group_2__0__Impl rule__UuidType__Group_2__1
            {
            pushFollow(FOLLOW_23);
            rule__UuidType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UuidType__Group_2__1();

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
    // $ANTLR end "rule__UuidType__Group_2__0"


    // $ANTLR start "rule__UuidType__Group_2__0__Impl"
    // InternalTextualDataModel.g:5641:1: rule__UuidType__Group_2__0__Impl : ( '{' ) ;
    public final void rule__UuidType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5645:1: ( ( '{' ) )
            // InternalTextualDataModel.g:5646:1: ( '{' )
            {
            // InternalTextualDataModel.g:5646:1: ( '{' )
            // InternalTextualDataModel.g:5647:2: '{'
            {
             before(grammarAccess.getUuidTypeAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getUuidTypeAccess().getLeftCurlyBracketKeyword_2_0()); 

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
    // $ANTLR end "rule__UuidType__Group_2__0__Impl"


    // $ANTLR start "rule__UuidType__Group_2__1"
    // InternalTextualDataModel.g:5656:1: rule__UuidType__Group_2__1 : rule__UuidType__Group_2__1__Impl rule__UuidType__Group_2__2 ;
    public final void rule__UuidType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5660:1: ( rule__UuidType__Group_2__1__Impl rule__UuidType__Group_2__2 )
            // InternalTextualDataModel.g:5661:2: rule__UuidType__Group_2__1__Impl rule__UuidType__Group_2__2
            {
            pushFollow(FOLLOW_23);
            rule__UuidType__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UuidType__Group_2__2();

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
    // $ANTLR end "rule__UuidType__Group_2__1"


    // $ANTLR start "rule__UuidType__Group_2__1__Impl"
    // InternalTextualDataModel.g:5668:1: rule__UuidType__Group_2__1__Impl : ( ( rule__UuidType__Group_2_1__0 )? ) ;
    public final void rule__UuidType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5672:1: ( ( ( rule__UuidType__Group_2_1__0 )? ) )
            // InternalTextualDataModel.g:5673:1: ( ( rule__UuidType__Group_2_1__0 )? )
            {
            // InternalTextualDataModel.g:5673:1: ( ( rule__UuidType__Group_2_1__0 )? )
            // InternalTextualDataModel.g:5674:2: ( rule__UuidType__Group_2_1__0 )?
            {
             before(grammarAccess.getUuidTypeAccess().getGroup_2_1()); 
            // InternalTextualDataModel.g:5675:2: ( rule__UuidType__Group_2_1__0 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==24) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalTextualDataModel.g:5675:3: rule__UuidType__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UuidType__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUuidTypeAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__UuidType__Group_2__1__Impl"


    // $ANTLR start "rule__UuidType__Group_2__2"
    // InternalTextualDataModel.g:5683:1: rule__UuidType__Group_2__2 : rule__UuidType__Group_2__2__Impl rule__UuidType__Group_2__3 ;
    public final void rule__UuidType__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5687:1: ( rule__UuidType__Group_2__2__Impl rule__UuidType__Group_2__3 )
            // InternalTextualDataModel.g:5688:2: rule__UuidType__Group_2__2__Impl rule__UuidType__Group_2__3
            {
            pushFollow(FOLLOW_23);
            rule__UuidType__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UuidType__Group_2__3();

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
    // $ANTLR end "rule__UuidType__Group_2__2"


    // $ANTLR start "rule__UuidType__Group_2__2__Impl"
    // InternalTextualDataModel.g:5695:1: rule__UuidType__Group_2__2__Impl : ( ( rule__UuidType__LocalizationsAssignment_2_2 )* ) ;
    public final void rule__UuidType__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5699:1: ( ( ( rule__UuidType__LocalizationsAssignment_2_2 )* ) )
            // InternalTextualDataModel.g:5700:1: ( ( rule__UuidType__LocalizationsAssignment_2_2 )* )
            {
            // InternalTextualDataModel.g:5700:1: ( ( rule__UuidType__LocalizationsAssignment_2_2 )* )
            // InternalTextualDataModel.g:5701:2: ( rule__UuidType__LocalizationsAssignment_2_2 )*
            {
             before(grammarAccess.getUuidTypeAccess().getLocalizationsAssignment_2_2()); 
            // InternalTextualDataModel.g:5702:2: ( rule__UuidType__LocalizationsAssignment_2_2 )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==53) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalTextualDataModel.g:5702:3: rule__UuidType__LocalizationsAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__UuidType__LocalizationsAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

             after(grammarAccess.getUuidTypeAccess().getLocalizationsAssignment_2_2()); 

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
    // $ANTLR end "rule__UuidType__Group_2__2__Impl"


    // $ANTLR start "rule__UuidType__Group_2__3"
    // InternalTextualDataModel.g:5710:1: rule__UuidType__Group_2__3 : rule__UuidType__Group_2__3__Impl ;
    public final void rule__UuidType__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5714:1: ( rule__UuidType__Group_2__3__Impl )
            // InternalTextualDataModel.g:5715:2: rule__UuidType__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UuidType__Group_2__3__Impl();

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
    // $ANTLR end "rule__UuidType__Group_2__3"


    // $ANTLR start "rule__UuidType__Group_2__3__Impl"
    // InternalTextualDataModel.g:5721:1: rule__UuidType__Group_2__3__Impl : ( '}' ) ;
    public final void rule__UuidType__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5725:1: ( ( '}' ) )
            // InternalTextualDataModel.g:5726:1: ( '}' )
            {
            // InternalTextualDataModel.g:5726:1: ( '}' )
            // InternalTextualDataModel.g:5727:2: '}'
            {
             before(grammarAccess.getUuidTypeAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getUuidTypeAccess().getRightCurlyBracketKeyword_2_3()); 

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
    // $ANTLR end "rule__UuidType__Group_2__3__Impl"


    // $ANTLR start "rule__UuidType__Group_2_1__0"
    // InternalTextualDataModel.g:5737:1: rule__UuidType__Group_2_1__0 : rule__UuidType__Group_2_1__0__Impl rule__UuidType__Group_2_1__1 ;
    public final void rule__UuidType__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5741:1: ( rule__UuidType__Group_2_1__0__Impl rule__UuidType__Group_2_1__1 )
            // InternalTextualDataModel.g:5742:2: rule__UuidType__Group_2_1__0__Impl rule__UuidType__Group_2_1__1
            {
            pushFollow(FOLLOW_10);
            rule__UuidType__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UuidType__Group_2_1__1();

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
    // $ANTLR end "rule__UuidType__Group_2_1__0"


    // $ANTLR start "rule__UuidType__Group_2_1__0__Impl"
    // InternalTextualDataModel.g:5749:1: rule__UuidType__Group_2_1__0__Impl : ( '@description' ) ;
    public final void rule__UuidType__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5753:1: ( ( '@description' ) )
            // InternalTextualDataModel.g:5754:1: ( '@description' )
            {
            // InternalTextualDataModel.g:5754:1: ( '@description' )
            // InternalTextualDataModel.g:5755:2: '@description'
            {
             before(grammarAccess.getUuidTypeAccess().getDescriptionKeyword_2_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getUuidTypeAccess().getDescriptionKeyword_2_1_0()); 

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
    // $ANTLR end "rule__UuidType__Group_2_1__0__Impl"


    // $ANTLR start "rule__UuidType__Group_2_1__1"
    // InternalTextualDataModel.g:5764:1: rule__UuidType__Group_2_1__1 : rule__UuidType__Group_2_1__1__Impl rule__UuidType__Group_2_1__2 ;
    public final void rule__UuidType__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5768:1: ( rule__UuidType__Group_2_1__1__Impl rule__UuidType__Group_2_1__2 )
            // InternalTextualDataModel.g:5769:2: rule__UuidType__Group_2_1__1__Impl rule__UuidType__Group_2_1__2
            {
            pushFollow(FOLLOW_3);
            rule__UuidType__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UuidType__Group_2_1__2();

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
    // $ANTLR end "rule__UuidType__Group_2_1__1"


    // $ANTLR start "rule__UuidType__Group_2_1__1__Impl"
    // InternalTextualDataModel.g:5776:1: rule__UuidType__Group_2_1__1__Impl : ( '(' ) ;
    public final void rule__UuidType__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5780:1: ( ( '(' ) )
            // InternalTextualDataModel.g:5781:1: ( '(' )
            {
            // InternalTextualDataModel.g:5781:1: ( '(' )
            // InternalTextualDataModel.g:5782:2: '('
            {
             before(grammarAccess.getUuidTypeAccess().getLeftParenthesisKeyword_2_1_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getUuidTypeAccess().getLeftParenthesisKeyword_2_1_1()); 

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
    // $ANTLR end "rule__UuidType__Group_2_1__1__Impl"


    // $ANTLR start "rule__UuidType__Group_2_1__2"
    // InternalTextualDataModel.g:5791:1: rule__UuidType__Group_2_1__2 : rule__UuidType__Group_2_1__2__Impl rule__UuidType__Group_2_1__3 ;
    public final void rule__UuidType__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5795:1: ( rule__UuidType__Group_2_1__2__Impl rule__UuidType__Group_2_1__3 )
            // InternalTextualDataModel.g:5796:2: rule__UuidType__Group_2_1__2__Impl rule__UuidType__Group_2_1__3
            {
            pushFollow(FOLLOW_11);
            rule__UuidType__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UuidType__Group_2_1__3();

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
    // $ANTLR end "rule__UuidType__Group_2_1__2"


    // $ANTLR start "rule__UuidType__Group_2_1__2__Impl"
    // InternalTextualDataModel.g:5803:1: rule__UuidType__Group_2_1__2__Impl : ( ( rule__UuidType__DescriptionAssignment_2_1_2 ) ) ;
    public final void rule__UuidType__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5807:1: ( ( ( rule__UuidType__DescriptionAssignment_2_1_2 ) ) )
            // InternalTextualDataModel.g:5808:1: ( ( rule__UuidType__DescriptionAssignment_2_1_2 ) )
            {
            // InternalTextualDataModel.g:5808:1: ( ( rule__UuidType__DescriptionAssignment_2_1_2 ) )
            // InternalTextualDataModel.g:5809:2: ( rule__UuidType__DescriptionAssignment_2_1_2 )
            {
             before(grammarAccess.getUuidTypeAccess().getDescriptionAssignment_2_1_2()); 
            // InternalTextualDataModel.g:5810:2: ( rule__UuidType__DescriptionAssignment_2_1_2 )
            // InternalTextualDataModel.g:5810:3: rule__UuidType__DescriptionAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__UuidType__DescriptionAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getUuidTypeAccess().getDescriptionAssignment_2_1_2()); 

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
    // $ANTLR end "rule__UuidType__Group_2_1__2__Impl"


    // $ANTLR start "rule__UuidType__Group_2_1__3"
    // InternalTextualDataModel.g:5818:1: rule__UuidType__Group_2_1__3 : rule__UuidType__Group_2_1__3__Impl ;
    public final void rule__UuidType__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5822:1: ( rule__UuidType__Group_2_1__3__Impl )
            // InternalTextualDataModel.g:5823:2: rule__UuidType__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UuidType__Group_2_1__3__Impl();

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
    // $ANTLR end "rule__UuidType__Group_2_1__3"


    // $ANTLR start "rule__UuidType__Group_2_1__3__Impl"
    // InternalTextualDataModel.g:5829:1: rule__UuidType__Group_2_1__3__Impl : ( ')' ) ;
    public final void rule__UuidType__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5833:1: ( ( ')' ) )
            // InternalTextualDataModel.g:5834:1: ( ')' )
            {
            // InternalTextualDataModel.g:5834:1: ( ')' )
            // InternalTextualDataModel.g:5835:2: ')'
            {
             before(grammarAccess.getUuidTypeAccess().getRightParenthesisKeyword_2_1_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getUuidTypeAccess().getRightParenthesisKeyword_2_1_3()); 

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
    // $ANTLR end "rule__UuidType__Group_2_1__3__Impl"


    // $ANTLR start "rule__Localization__Group__0"
    // InternalTextualDataModel.g:5845:1: rule__Localization__Group__0 : rule__Localization__Group__0__Impl rule__Localization__Group__1 ;
    public final void rule__Localization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5849:1: ( rule__Localization__Group__0__Impl rule__Localization__Group__1 )
            // InternalTextualDataModel.g:5850:2: rule__Localization__Group__0__Impl rule__Localization__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Localization__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Localization__Group__1();

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
    // $ANTLR end "rule__Localization__Group__0"


    // $ANTLR start "rule__Localization__Group__0__Impl"
    // InternalTextualDataModel.g:5857:1: rule__Localization__Group__0__Impl : ( '@localization' ) ;
    public final void rule__Localization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5861:1: ( ( '@localization' ) )
            // InternalTextualDataModel.g:5862:1: ( '@localization' )
            {
            // InternalTextualDataModel.g:5862:1: ( '@localization' )
            // InternalTextualDataModel.g:5863:2: '@localization'
            {
             before(grammarAccess.getLocalizationAccess().getLocalizationKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getLocalizationAccess().getLocalizationKeyword_0()); 

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
    // $ANTLR end "rule__Localization__Group__0__Impl"


    // $ANTLR start "rule__Localization__Group__1"
    // InternalTextualDataModel.g:5872:1: rule__Localization__Group__1 : rule__Localization__Group__1__Impl rule__Localization__Group__2 ;
    public final void rule__Localization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5876:1: ( rule__Localization__Group__1__Impl rule__Localization__Group__2 )
            // InternalTextualDataModel.g:5877:2: rule__Localization__Group__1__Impl rule__Localization__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Localization__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Localization__Group__2();

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
    // $ANTLR end "rule__Localization__Group__1"


    // $ANTLR start "rule__Localization__Group__1__Impl"
    // InternalTextualDataModel.g:5884:1: rule__Localization__Group__1__Impl : ( ( rule__Localization__LocaleAssignment_1 ) ) ;
    public final void rule__Localization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5888:1: ( ( ( rule__Localization__LocaleAssignment_1 ) ) )
            // InternalTextualDataModel.g:5889:1: ( ( rule__Localization__LocaleAssignment_1 ) )
            {
            // InternalTextualDataModel.g:5889:1: ( ( rule__Localization__LocaleAssignment_1 ) )
            // InternalTextualDataModel.g:5890:2: ( rule__Localization__LocaleAssignment_1 )
            {
             before(grammarAccess.getLocalizationAccess().getLocaleAssignment_1()); 
            // InternalTextualDataModel.g:5891:2: ( rule__Localization__LocaleAssignment_1 )
            // InternalTextualDataModel.g:5891:3: rule__Localization__LocaleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Localization__LocaleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLocalizationAccess().getLocaleAssignment_1()); 

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
    // $ANTLR end "rule__Localization__Group__1__Impl"


    // $ANTLR start "rule__Localization__Group__2"
    // InternalTextualDataModel.g:5899:1: rule__Localization__Group__2 : rule__Localization__Group__2__Impl rule__Localization__Group__3 ;
    public final void rule__Localization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5903:1: ( rule__Localization__Group__2__Impl rule__Localization__Group__3 )
            // InternalTextualDataModel.g:5904:2: rule__Localization__Group__2__Impl rule__Localization__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__Localization__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Localization__Group__3();

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
    // $ANTLR end "rule__Localization__Group__2"


    // $ANTLR start "rule__Localization__Group__2__Impl"
    // InternalTextualDataModel.g:5911:1: rule__Localization__Group__2__Impl : ( '(' ) ;
    public final void rule__Localization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5915:1: ( ( '(' ) )
            // InternalTextualDataModel.g:5916:1: ( '(' )
            {
            // InternalTextualDataModel.g:5916:1: ( '(' )
            // InternalTextualDataModel.g:5917:2: '('
            {
             before(grammarAccess.getLocalizationAccess().getLeftParenthesisKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLocalizationAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Localization__Group__2__Impl"


    // $ANTLR start "rule__Localization__Group__3"
    // InternalTextualDataModel.g:5926:1: rule__Localization__Group__3 : rule__Localization__Group__3__Impl rule__Localization__Group__4 ;
    public final void rule__Localization__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5930:1: ( rule__Localization__Group__3__Impl rule__Localization__Group__4 )
            // InternalTextualDataModel.g:5931:2: rule__Localization__Group__3__Impl rule__Localization__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__Localization__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Localization__Group__4();

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
    // $ANTLR end "rule__Localization__Group__3"


    // $ANTLR start "rule__Localization__Group__3__Impl"
    // InternalTextualDataModel.g:5938:1: rule__Localization__Group__3__Impl : ( ( rule__Localization__Group_3__0 )? ) ;
    public final void rule__Localization__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5942:1: ( ( ( rule__Localization__Group_3__0 )? ) )
            // InternalTextualDataModel.g:5943:1: ( ( rule__Localization__Group_3__0 )? )
            {
            // InternalTextualDataModel.g:5943:1: ( ( rule__Localization__Group_3__0 )? )
            // InternalTextualDataModel.g:5944:2: ( rule__Localization__Group_3__0 )?
            {
             before(grammarAccess.getLocalizationAccess().getGroup_3()); 
            // InternalTextualDataModel.g:5945:2: ( rule__Localization__Group_3__0 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_STRING) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalTextualDataModel.g:5945:3: rule__Localization__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Localization__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLocalizationAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Localization__Group__3__Impl"


    // $ANTLR start "rule__Localization__Group__4"
    // InternalTextualDataModel.g:5953:1: rule__Localization__Group__4 : rule__Localization__Group__4__Impl ;
    public final void rule__Localization__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5957:1: ( rule__Localization__Group__4__Impl )
            // InternalTextualDataModel.g:5958:2: rule__Localization__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Localization__Group__4__Impl();

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
    // $ANTLR end "rule__Localization__Group__4"


    // $ANTLR start "rule__Localization__Group__4__Impl"
    // InternalTextualDataModel.g:5964:1: rule__Localization__Group__4__Impl : ( ')' ) ;
    public final void rule__Localization__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5968:1: ( ( ')' ) )
            // InternalTextualDataModel.g:5969:1: ( ')' )
            {
            // InternalTextualDataModel.g:5969:1: ( ')' )
            // InternalTextualDataModel.g:5970:2: ')'
            {
             before(grammarAccess.getLocalizationAccess().getRightParenthesisKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLocalizationAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Localization__Group__4__Impl"


    // $ANTLR start "rule__Localization__Group_3__0"
    // InternalTextualDataModel.g:5980:1: rule__Localization__Group_3__0 : rule__Localization__Group_3__0__Impl rule__Localization__Group_3__1 ;
    public final void rule__Localization__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5984:1: ( rule__Localization__Group_3__0__Impl rule__Localization__Group_3__1 )
            // InternalTextualDataModel.g:5985:2: rule__Localization__Group_3__0__Impl rule__Localization__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Localization__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Localization__Group_3__1();

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
    // $ANTLR end "rule__Localization__Group_3__0"


    // $ANTLR start "rule__Localization__Group_3__0__Impl"
    // InternalTextualDataModel.g:5992:1: rule__Localization__Group_3__0__Impl : ( ( rule__Localization__NameAssignment_3_0 ) ) ;
    public final void rule__Localization__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:5996:1: ( ( ( rule__Localization__NameAssignment_3_0 ) ) )
            // InternalTextualDataModel.g:5997:1: ( ( rule__Localization__NameAssignment_3_0 ) )
            {
            // InternalTextualDataModel.g:5997:1: ( ( rule__Localization__NameAssignment_3_0 ) )
            // InternalTextualDataModel.g:5998:2: ( rule__Localization__NameAssignment_3_0 )
            {
             before(grammarAccess.getLocalizationAccess().getNameAssignment_3_0()); 
            // InternalTextualDataModel.g:5999:2: ( rule__Localization__NameAssignment_3_0 )
            // InternalTextualDataModel.g:5999:3: rule__Localization__NameAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Localization__NameAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getLocalizationAccess().getNameAssignment_3_0()); 

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
    // $ANTLR end "rule__Localization__Group_3__0__Impl"


    // $ANTLR start "rule__Localization__Group_3__1"
    // InternalTextualDataModel.g:6007:1: rule__Localization__Group_3__1 : rule__Localization__Group_3__1__Impl ;
    public final void rule__Localization__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6011:1: ( rule__Localization__Group_3__1__Impl )
            // InternalTextualDataModel.g:6012:2: rule__Localization__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Localization__Group_3__1__Impl();

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
    // $ANTLR end "rule__Localization__Group_3__1"


    // $ANTLR start "rule__Localization__Group_3__1__Impl"
    // InternalTextualDataModel.g:6018:1: rule__Localization__Group_3__1__Impl : ( ( rule__Localization__DescriptionAssignment_3_1 )? ) ;
    public final void rule__Localization__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6022:1: ( ( ( rule__Localization__DescriptionAssignment_3_1 )? ) )
            // InternalTextualDataModel.g:6023:1: ( ( rule__Localization__DescriptionAssignment_3_1 )? )
            {
            // InternalTextualDataModel.g:6023:1: ( ( rule__Localization__DescriptionAssignment_3_1 )? )
            // InternalTextualDataModel.g:6024:2: ( rule__Localization__DescriptionAssignment_3_1 )?
            {
             before(grammarAccess.getLocalizationAccess().getDescriptionAssignment_3_1()); 
            // InternalTextualDataModel.g:6025:2: ( rule__Localization__DescriptionAssignment_3_1 )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_STRING) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalTextualDataModel.g:6025:3: rule__Localization__DescriptionAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Localization__DescriptionAssignment_3_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLocalizationAccess().getDescriptionAssignment_3_1()); 

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
    // $ANTLR end "rule__Localization__Group_3__1__Impl"


    // $ANTLR start "rule__Double__Group__0"
    // InternalTextualDataModel.g:6034:1: rule__Double__Group__0 : rule__Double__Group__0__Impl rule__Double__Group__1 ;
    public final void rule__Double__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6038:1: ( rule__Double__Group__0__Impl rule__Double__Group__1 )
            // InternalTextualDataModel.g:6039:2: rule__Double__Group__0__Impl rule__Double__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Double__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Double__Group__1();

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
    // $ANTLR end "rule__Double__Group__0"


    // $ANTLR start "rule__Double__Group__0__Impl"
    // InternalTextualDataModel.g:6046:1: rule__Double__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Double__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6050:1: ( ( ( '-' )? ) )
            // InternalTextualDataModel.g:6051:1: ( ( '-' )? )
            {
            // InternalTextualDataModel.g:6051:1: ( ( '-' )? )
            // InternalTextualDataModel.g:6052:2: ( '-' )?
            {
             before(grammarAccess.getDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalTextualDataModel.g:6053:2: ( '-' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==54) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalTextualDataModel.g:6053:3: '-'
                    {
                    match(input,54,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDoubleAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__Double__Group__0__Impl"


    // $ANTLR start "rule__Double__Group__1"
    // InternalTextualDataModel.g:6061:1: rule__Double__Group__1 : rule__Double__Group__1__Impl rule__Double__Group__2 ;
    public final void rule__Double__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6065:1: ( rule__Double__Group__1__Impl rule__Double__Group__2 )
            // InternalTextualDataModel.g:6066:2: rule__Double__Group__1__Impl rule__Double__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__Double__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Double__Group__2();

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
    // $ANTLR end "rule__Double__Group__1"


    // $ANTLR start "rule__Double__Group__1__Impl"
    // InternalTextualDataModel.g:6073:1: rule__Double__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Double__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6077:1: ( ( ( RULE_INT )? ) )
            // InternalTextualDataModel.g:6078:1: ( ( RULE_INT )? )
            {
            // InternalTextualDataModel.g:6078:1: ( ( RULE_INT )? )
            // InternalTextualDataModel.g:6079:2: ( RULE_INT )?
            {
             before(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalTextualDataModel.g:6080:2: ( RULE_INT )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_INT) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalTextualDataModel.g:6080:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Double__Group__1__Impl"


    // $ANTLR start "rule__Double__Group__2"
    // InternalTextualDataModel.g:6088:1: rule__Double__Group__2 : rule__Double__Group__2__Impl rule__Double__Group__3 ;
    public final void rule__Double__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6092:1: ( rule__Double__Group__2__Impl rule__Double__Group__3 )
            // InternalTextualDataModel.g:6093:2: rule__Double__Group__2__Impl rule__Double__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Double__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Double__Group__3();

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
    // $ANTLR end "rule__Double__Group__2"


    // $ANTLR start "rule__Double__Group__2__Impl"
    // InternalTextualDataModel.g:6100:1: rule__Double__Group__2__Impl : ( '.' ) ;
    public final void rule__Double__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6104:1: ( ( '.' ) )
            // InternalTextualDataModel.g:6105:1: ( '.' )
            {
            // InternalTextualDataModel.g:6105:1: ( '.' )
            // InternalTextualDataModel.g:6106:2: '.'
            {
             before(grammarAccess.getDoubleAccess().getFullStopKeyword_2()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getDoubleAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__Double__Group__2__Impl"


    // $ANTLR start "rule__Double__Group__3"
    // InternalTextualDataModel.g:6115:1: rule__Double__Group__3 : rule__Double__Group__3__Impl rule__Double__Group__4 ;
    public final void rule__Double__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6119:1: ( rule__Double__Group__3__Impl rule__Double__Group__4 )
            // InternalTextualDataModel.g:6120:2: rule__Double__Group__3__Impl rule__Double__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__Double__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Double__Group__4();

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
    // $ANTLR end "rule__Double__Group__3"


    // $ANTLR start "rule__Double__Group__3__Impl"
    // InternalTextualDataModel.g:6127:1: rule__Double__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6131:1: ( ( RULE_INT ) )
            // InternalTextualDataModel.g:6132:1: ( RULE_INT )
            {
            // InternalTextualDataModel.g:6132:1: ( RULE_INT )
            // InternalTextualDataModel.g:6133:2: RULE_INT
            {
             before(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__Double__Group__3__Impl"


    // $ANTLR start "rule__Double__Group__4"
    // InternalTextualDataModel.g:6142:1: rule__Double__Group__4 : rule__Double__Group__4__Impl ;
    public final void rule__Double__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6146:1: ( rule__Double__Group__4__Impl )
            // InternalTextualDataModel.g:6147:2: rule__Double__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Double__Group__4__Impl();

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
    // $ANTLR end "rule__Double__Group__4"


    // $ANTLR start "rule__Double__Group__4__Impl"
    // InternalTextualDataModel.g:6153:1: rule__Double__Group__4__Impl : ( ( rule__Double__Group_4__0 )? ) ;
    public final void rule__Double__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6157:1: ( ( ( rule__Double__Group_4__0 )? ) )
            // InternalTextualDataModel.g:6158:1: ( ( rule__Double__Group_4__0 )? )
            {
            // InternalTextualDataModel.g:6158:1: ( ( rule__Double__Group_4__0 )? )
            // InternalTextualDataModel.g:6159:2: ( rule__Double__Group_4__0 )?
            {
             before(grammarAccess.getDoubleAccess().getGroup_4()); 
            // InternalTextualDataModel.g:6160:2: ( rule__Double__Group_4__0 )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=12 && LA70_0<=13)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalTextualDataModel.g:6160:3: rule__Double__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Double__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDoubleAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Double__Group__4__Impl"


    // $ANTLR start "rule__Double__Group_4__0"
    // InternalTextualDataModel.g:6169:1: rule__Double__Group_4__0 : rule__Double__Group_4__0__Impl rule__Double__Group_4__1 ;
    public final void rule__Double__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6173:1: ( rule__Double__Group_4__0__Impl rule__Double__Group_4__1 )
            // InternalTextualDataModel.g:6174:2: rule__Double__Group_4__0__Impl rule__Double__Group_4__1
            {
            pushFollow(FOLLOW_33);
            rule__Double__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Double__Group_4__1();

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
    // $ANTLR end "rule__Double__Group_4__0"


    // $ANTLR start "rule__Double__Group_4__0__Impl"
    // InternalTextualDataModel.g:6181:1: rule__Double__Group_4__0__Impl : ( ( rule__Double__Alternatives_4_0 ) ) ;
    public final void rule__Double__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6185:1: ( ( ( rule__Double__Alternatives_4_0 ) ) )
            // InternalTextualDataModel.g:6186:1: ( ( rule__Double__Alternatives_4_0 ) )
            {
            // InternalTextualDataModel.g:6186:1: ( ( rule__Double__Alternatives_4_0 ) )
            // InternalTextualDataModel.g:6187:2: ( rule__Double__Alternatives_4_0 )
            {
             before(grammarAccess.getDoubleAccess().getAlternatives_4_0()); 
            // InternalTextualDataModel.g:6188:2: ( rule__Double__Alternatives_4_0 )
            // InternalTextualDataModel.g:6188:3: rule__Double__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Double__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getDoubleAccess().getAlternatives_4_0()); 

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
    // $ANTLR end "rule__Double__Group_4__0__Impl"


    // $ANTLR start "rule__Double__Group_4__1"
    // InternalTextualDataModel.g:6196:1: rule__Double__Group_4__1 : rule__Double__Group_4__1__Impl rule__Double__Group_4__2 ;
    public final void rule__Double__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6200:1: ( rule__Double__Group_4__1__Impl rule__Double__Group_4__2 )
            // InternalTextualDataModel.g:6201:2: rule__Double__Group_4__1__Impl rule__Double__Group_4__2
            {
            pushFollow(FOLLOW_33);
            rule__Double__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Double__Group_4__2();

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
    // $ANTLR end "rule__Double__Group_4__1"


    // $ANTLR start "rule__Double__Group_4__1__Impl"
    // InternalTextualDataModel.g:6208:1: rule__Double__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__Double__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6212:1: ( ( ( '-' )? ) )
            // InternalTextualDataModel.g:6213:1: ( ( '-' )? )
            {
            // InternalTextualDataModel.g:6213:1: ( ( '-' )? )
            // InternalTextualDataModel.g:6214:2: ( '-' )?
            {
             before(grammarAccess.getDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalTextualDataModel.g:6215:2: ( '-' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==54) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalTextualDataModel.g:6215:3: '-'
                    {
                    match(input,54,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDoubleAccess().getHyphenMinusKeyword_4_1()); 

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
    // $ANTLR end "rule__Double__Group_4__1__Impl"


    // $ANTLR start "rule__Double__Group_4__2"
    // InternalTextualDataModel.g:6223:1: rule__Double__Group_4__2 : rule__Double__Group_4__2__Impl ;
    public final void rule__Double__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6227:1: ( rule__Double__Group_4__2__Impl )
            // InternalTextualDataModel.g:6228:2: rule__Double__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Double__Group_4__2__Impl();

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
    // $ANTLR end "rule__Double__Group_4__2"


    // $ANTLR start "rule__Double__Group_4__2__Impl"
    // InternalTextualDataModel.g:6234:1: rule__Double__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6238:1: ( ( RULE_INT ) )
            // InternalTextualDataModel.g:6239:1: ( RULE_INT )
            {
            // InternalTextualDataModel.g:6239:1: ( RULE_INT )
            // InternalTextualDataModel.g:6240:2: RULE_INT
            {
             before(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_4_2()); 

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
    // $ANTLR end "rule__Double__Group_4__2__Impl"


    // $ANTLR start "rule__DataModel__NameAssignment_1"
    // InternalTextualDataModel.g:6250:1: rule__DataModel__NameAssignment_1 : ( ruleElementName ) ;
    public final void rule__DataModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6254:1: ( ( ruleElementName ) )
            // InternalTextualDataModel.g:6255:2: ( ruleElementName )
            {
            // InternalTextualDataModel.g:6255:2: ( ruleElementName )
            // InternalTextualDataModel.g:6256:3: ruleElementName
            {
             before(grammarAccess.getDataModelAccess().getNameElementNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElementName();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getNameElementNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__DataModel__NameAssignment_1"


    // $ANTLR start "rule__DataModel__DescriptionAssignment_2_1_2"
    // InternalTextualDataModel.g:6265:1: rule__DataModel__DescriptionAssignment_2_1_2 : ( ruleText ) ;
    public final void rule__DataModel__DescriptionAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6269:1: ( ( ruleText ) )
            // InternalTextualDataModel.g:6270:2: ( ruleText )
            {
            // InternalTextualDataModel.g:6270:2: ( ruleText )
            // InternalTextualDataModel.g:6271:3: ruleText
            {
             before(grammarAccess.getDataModelAccess().getDescriptionTextParserRuleCall_2_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getDescriptionTextParserRuleCall_2_1_2_0()); 

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
    // $ANTLR end "rule__DataModel__DescriptionAssignment_2_1_2"


    // $ANTLR start "rule__DataModel__LocalesAssignment_2_2_2"
    // InternalTextualDataModel.g:6280:1: rule__DataModel__LocalesAssignment_2_2_2 : ( RULE_ID ) ;
    public final void rule__DataModel__LocalesAssignment_2_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6284:1: ( ( RULE_ID ) )
            // InternalTextualDataModel.g:6285:2: ( RULE_ID )
            {
            // InternalTextualDataModel.g:6285:2: ( RULE_ID )
            // InternalTextualDataModel.g:6286:3: RULE_ID
            {
             before(grammarAccess.getDataModelAccess().getLocalesIDTerminalRuleCall_2_2_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getLocalesIDTerminalRuleCall_2_2_2_0()); 

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
    // $ANTLR end "rule__DataModel__LocalesAssignment_2_2_2"


    // $ANTLR start "rule__DataModel__LocalizationsAssignment_2_3"
    // InternalTextualDataModel.g:6295:1: rule__DataModel__LocalizationsAssignment_2_3 : ( ruleLocalization ) ;
    public final void rule__DataModel__LocalizationsAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6299:1: ( ( ruleLocalization ) )
            // InternalTextualDataModel.g:6300:2: ( ruleLocalization )
            {
            // InternalTextualDataModel.g:6300:2: ( ruleLocalization )
            // InternalTextualDataModel.g:6301:3: ruleLocalization
            {
             before(grammarAccess.getDataModelAccess().getLocalizationsLocalizationParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLocalization();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getLocalizationsLocalizationParserRuleCall_2_3_0()); 

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
    // $ANTLR end "rule__DataModel__LocalizationsAssignment_2_3"


    // $ANTLR start "rule__DataModel__EntitiesAssignment_2_4"
    // InternalTextualDataModel.g:6310:1: rule__DataModel__EntitiesAssignment_2_4 : ( ruleEntity ) ;
    public final void rule__DataModel__EntitiesAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6314:1: ( ( ruleEntity ) )
            // InternalTextualDataModel.g:6315:2: ( ruleEntity )
            {
            // InternalTextualDataModel.g:6315:2: ( ruleEntity )
            // InternalTextualDataModel.g:6316:3: ruleEntity
            {
             before(grammarAccess.getDataModelAccess().getEntitiesEntityParserRuleCall_2_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getEntitiesEntityParserRuleCall_2_4_0()); 

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
    // $ANTLR end "rule__DataModel__EntitiesAssignment_2_4"


    // $ANTLR start "rule__DataModel__RelationshipsAssignment_2_5"
    // InternalTextualDataModel.g:6325:1: rule__DataModel__RelationshipsAssignment_2_5 : ( ruleRelationship ) ;
    public final void rule__DataModel__RelationshipsAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6329:1: ( ( ruleRelationship ) )
            // InternalTextualDataModel.g:6330:2: ( ruleRelationship )
            {
            // InternalTextualDataModel.g:6330:2: ( ruleRelationship )
            // InternalTextualDataModel.g:6331:3: ruleRelationship
            {
             before(grammarAccess.getDataModelAccess().getRelationshipsRelationshipParserRuleCall_2_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationship();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getRelationshipsRelationshipParserRuleCall_2_5_0()); 

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
    // $ANTLR end "rule__DataModel__RelationshipsAssignment_2_5"


    // $ANTLR start "rule__DataModel__DataTypesAssignment_2_6"
    // InternalTextualDataModel.g:6340:1: rule__DataModel__DataTypesAssignment_2_6 : ( ruleDataType ) ;
    public final void rule__DataModel__DataTypesAssignment_2_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6344:1: ( ( ruleDataType ) )
            // InternalTextualDataModel.g:6345:2: ( ruleDataType )
            {
            // InternalTextualDataModel.g:6345:2: ( ruleDataType )
            // InternalTextualDataModel.g:6346:3: ruleDataType
            {
             before(grammarAccess.getDataModelAccess().getDataTypesDataTypeParserRuleCall_2_6_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getDataTypesDataTypeParserRuleCall_2_6_0()); 

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
    // $ANTLR end "rule__DataModel__DataTypesAssignment_2_6"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalTextualDataModel.g:6355:1: rule__Entity__NameAssignment_1 : ( ruleElementName ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6359:1: ( ( ruleElementName ) )
            // InternalTextualDataModel.g:6360:2: ( ruleElementName )
            {
            // InternalTextualDataModel.g:6360:2: ( ruleElementName )
            // InternalTextualDataModel.g:6361:3: ruleElementName
            {
             before(grammarAccess.getEntityAccess().getNameElementNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElementName();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getNameElementNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__KindAssignment_2_1"
    // InternalTextualDataModel.g:6370:1: rule__Entity__KindAssignment_2_1 : ( ruleEntityKind ) ;
    public final void rule__Entity__KindAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6374:1: ( ( ruleEntityKind ) )
            // InternalTextualDataModel.g:6375:2: ( ruleEntityKind )
            {
            // InternalTextualDataModel.g:6375:2: ( ruleEntityKind )
            // InternalTextualDataModel.g:6376:3: ruleEntityKind
            {
             before(grammarAccess.getEntityAccess().getKindEntityKindEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityKind();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getKindEntityKindEnumRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Entity__KindAssignment_2_1"


    // $ANTLR start "rule__Entity__GeneralsAssignment_3_1"
    // InternalTextualDataModel.g:6385:1: rule__Entity__GeneralsAssignment_3_1 : ( ( ruleElementName ) ) ;
    public final void rule__Entity__GeneralsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6389:1: ( ( ( ruleElementName ) ) )
            // InternalTextualDataModel.g:6390:2: ( ( ruleElementName ) )
            {
            // InternalTextualDataModel.g:6390:2: ( ( ruleElementName ) )
            // InternalTextualDataModel.g:6391:3: ( ruleElementName )
            {
             before(grammarAccess.getEntityAccess().getGeneralsEntityCrossReference_3_1_0()); 
            // InternalTextualDataModel.g:6392:3: ( ruleElementName )
            // InternalTextualDataModel.g:6393:4: ruleElementName
            {
             before(grammarAccess.getEntityAccess().getGeneralsEntityElementNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleElementName();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getGeneralsEntityElementNameParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getGeneralsEntityCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__Entity__GeneralsAssignment_3_1"


    // $ANTLR start "rule__Entity__DescriptionAssignment_4_1_2"
    // InternalTextualDataModel.g:6404:1: rule__Entity__DescriptionAssignment_4_1_2 : ( ruleText ) ;
    public final void rule__Entity__DescriptionAssignment_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6408:1: ( ( ruleText ) )
            // InternalTextualDataModel.g:6409:2: ( ruleText )
            {
            // InternalTextualDataModel.g:6409:2: ( ruleText )
            // InternalTextualDataModel.g:6410:3: ruleText
            {
             before(grammarAccess.getEntityAccess().getDescriptionTextParserRuleCall_4_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getDescriptionTextParserRuleCall_4_1_2_0()); 

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
    // $ANTLR end "rule__Entity__DescriptionAssignment_4_1_2"


    // $ANTLR start "rule__Entity__LocalizationsAssignment_4_2"
    // InternalTextualDataModel.g:6419:1: rule__Entity__LocalizationsAssignment_4_2 : ( ruleLocalization ) ;
    public final void rule__Entity__LocalizationsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6423:1: ( ( ruleLocalization ) )
            // InternalTextualDataModel.g:6424:2: ( ruleLocalization )
            {
            // InternalTextualDataModel.g:6424:2: ( ruleLocalization )
            // InternalTextualDataModel.g:6425:3: ruleLocalization
            {
             before(grammarAccess.getEntityAccess().getLocalizationsLocalizationParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLocalization();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getLocalizationsLocalizationParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Entity__LocalizationsAssignment_4_2"


    // $ANTLR start "rule__Entity__AttributesAssignment_4_3"
    // InternalTextualDataModel.g:6434:1: rule__Entity__AttributesAssignment_4_3 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6438:1: ( ( ruleAttribute ) )
            // InternalTextualDataModel.g:6439:2: ( ruleAttribute )
            {
            // InternalTextualDataModel.g:6439:2: ( ruleAttribute )
            // InternalTextualDataModel.g:6440:3: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_3_0()); 

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
    // $ANTLR end "rule__Entity__AttributesAssignment_4_3"


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // InternalTextualDataModel.g:6449:1: rule__Attribute__NameAssignment_0 : ( ruleElementName ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6453:1: ( ( ruleElementName ) )
            // InternalTextualDataModel.g:6454:2: ( ruleElementName )
            {
            // InternalTextualDataModel.g:6454:2: ( ruleElementName )
            // InternalTextualDataModel.g:6455:3: ruleElementName
            {
             before(grammarAccess.getAttributeAccess().getNameElementNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleElementName();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getNameElementNameParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Attribute__NameAssignment_0"


    // $ANTLR start "rule__Attribute__DataTypeAssignment_1"
    // InternalTextualDataModel.g:6464:1: rule__Attribute__DataTypeAssignment_1 : ( ( ruleElementName ) ) ;
    public final void rule__Attribute__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6468:1: ( ( ( ruleElementName ) ) )
            // InternalTextualDataModel.g:6469:2: ( ( ruleElementName ) )
            {
            // InternalTextualDataModel.g:6469:2: ( ( ruleElementName ) )
            // InternalTextualDataModel.g:6470:3: ( ruleElementName )
            {
             before(grammarAccess.getAttributeAccess().getDataTypeDataTypeCrossReference_1_0()); 
            // InternalTextualDataModel.g:6471:3: ( ruleElementName )
            // InternalTextualDataModel.g:6472:4: ruleElementName
            {
             before(grammarAccess.getAttributeAccess().getDataTypeDataTypeElementNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleElementName();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getDataTypeDataTypeElementNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getDataTypeDataTypeCrossReference_1_0()); 

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
    // $ANTLR end "rule__Attribute__DataTypeAssignment_1"


    // $ANTLR start "rule__Attribute__LowerAssignment_2"
    // InternalTextualDataModel.g:6483:1: rule__Attribute__LowerAssignment_2 : ( RULE_INT ) ;
    public final void rule__Attribute__LowerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6487:1: ( ( RULE_INT ) )
            // InternalTextualDataModel.g:6488:2: ( RULE_INT )
            {
            // InternalTextualDataModel.g:6488:2: ( RULE_INT )
            // InternalTextualDataModel.g:6489:3: RULE_INT
            {
             before(grammarAccess.getAttributeAccess().getLowerINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getLowerINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Attribute__LowerAssignment_2"


    // $ANTLR start "rule__Attribute__UpperAssignment_4"
    // InternalTextualDataModel.g:6498:1: rule__Attribute__UpperAssignment_4 : ( ruleUnlimitedNatural ) ;
    public final void rule__Attribute__UpperAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6502:1: ( ( ruleUnlimitedNatural ) )
            // InternalTextualDataModel.g:6503:2: ( ruleUnlimitedNatural )
            {
            // InternalTextualDataModel.g:6503:2: ( ruleUnlimitedNatural )
            // InternalTextualDataModel.g:6504:3: ruleUnlimitedNatural
            {
             before(grammarAccess.getAttributeAccess().getUpperUnlimitedNaturalParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleUnlimitedNatural();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getUpperUnlimitedNaturalParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Attribute__UpperAssignment_4"


    // $ANTLR start "rule__Attribute__IdentityAssignment_5"
    // InternalTextualDataModel.g:6513:1: rule__Attribute__IdentityAssignment_5 : ( ( '[id]' ) ) ;
    public final void rule__Attribute__IdentityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6517:1: ( ( ( '[id]' ) ) )
            // InternalTextualDataModel.g:6518:2: ( ( '[id]' ) )
            {
            // InternalTextualDataModel.g:6518:2: ( ( '[id]' ) )
            // InternalTextualDataModel.g:6519:3: ( '[id]' )
            {
             before(grammarAccess.getAttributeAccess().getIdentityIdKeyword_5_0()); 
            // InternalTextualDataModel.g:6520:3: ( '[id]' )
            // InternalTextualDataModel.g:6521:4: '[id]'
            {
             before(grammarAccess.getAttributeAccess().getIdentityIdKeyword_5_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getIdentityIdKeyword_5_0()); 

            }

             after(grammarAccess.getAttributeAccess().getIdentityIdKeyword_5_0()); 

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
    // $ANTLR end "rule__Attribute__IdentityAssignment_5"


    // $ANTLR start "rule__Attribute__DefaultValueAssignment_6_2"
    // InternalTextualDataModel.g:6532:1: rule__Attribute__DefaultValueAssignment_6_2 : ( ruleText ) ;
    public final void rule__Attribute__DefaultValueAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6536:1: ( ( ruleText ) )
            // InternalTextualDataModel.g:6537:2: ( ruleText )
            {
            // InternalTextualDataModel.g:6537:2: ( ruleText )
            // InternalTextualDataModel.g:6538:3: ruleText
            {
             before(grammarAccess.getAttributeAccess().getDefaultValueTextParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getDefaultValueTextParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__Attribute__DefaultValueAssignment_6_2"


    // $ANTLR start "rule__Attribute__DescriptionAssignment_7_1_2"
    // InternalTextualDataModel.g:6547:1: rule__Attribute__DescriptionAssignment_7_1_2 : ( ruleText ) ;
    public final void rule__Attribute__DescriptionAssignment_7_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6551:1: ( ( ruleText ) )
            // InternalTextualDataModel.g:6552:2: ( ruleText )
            {
            // InternalTextualDataModel.g:6552:2: ( ruleText )
            // InternalTextualDataModel.g:6553:3: ruleText
            {
             before(grammarAccess.getAttributeAccess().getDescriptionTextParserRuleCall_7_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getDescriptionTextParserRuleCall_7_1_2_0()); 

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
    // $ANTLR end "rule__Attribute__DescriptionAssignment_7_1_2"


    // $ANTLR start "rule__Attribute__LocalizationsAssignment_7_2"
    // InternalTextualDataModel.g:6562:1: rule__Attribute__LocalizationsAssignment_7_2 : ( ruleLocalization ) ;
    public final void rule__Attribute__LocalizationsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6566:1: ( ( ruleLocalization ) )
            // InternalTextualDataModel.g:6567:2: ( ruleLocalization )
            {
            // InternalTextualDataModel.g:6567:2: ( ruleLocalization )
            // InternalTextualDataModel.g:6568:3: ruleLocalization
            {
             before(grammarAccess.getAttributeAccess().getLocalizationsLocalizationParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLocalization();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getLocalizationsLocalizationParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__Attribute__LocalizationsAssignment_7_2"


    // $ANTLR start "rule__Relationship__NameAssignment_2"
    // InternalTextualDataModel.g:6577:1: rule__Relationship__NameAssignment_2 : ( ruleElementName ) ;
    public final void rule__Relationship__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6581:1: ( ( ruleElementName ) )
            // InternalTextualDataModel.g:6582:2: ( ruleElementName )
            {
            // InternalTextualDataModel.g:6582:2: ( ruleElementName )
            // InternalTextualDataModel.g:6583:3: ruleElementName
            {
             before(grammarAccess.getRelationshipAccess().getNameElementNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleElementName();

            state._fsp--;

             after(grammarAccess.getRelationshipAccess().getNameElementNameParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Relationship__NameAssignment_2"


    // $ANTLR start "rule__Relationship__KindAssignment_3_1"
    // InternalTextualDataModel.g:6592:1: rule__Relationship__KindAssignment_3_1 : ( ruleRelationshipKind ) ;
    public final void rule__Relationship__KindAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6596:1: ( ( ruleRelationshipKind ) )
            // InternalTextualDataModel.g:6597:2: ( ruleRelationshipKind )
            {
            // InternalTextualDataModel.g:6597:2: ( ruleRelationshipKind )
            // InternalTextualDataModel.g:6598:3: ruleRelationshipKind
            {
             before(grammarAccess.getRelationshipAccess().getKindRelationshipKindEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationshipKind();

            state._fsp--;

             after(grammarAccess.getRelationshipAccess().getKindRelationshipKindEnumRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Relationship__KindAssignment_3_1"


    // $ANTLR start "rule__Relationship__DescriptionAssignment_4_1_2"
    // InternalTextualDataModel.g:6607:1: rule__Relationship__DescriptionAssignment_4_1_2 : ( ruleText ) ;
    public final void rule__Relationship__DescriptionAssignment_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6611:1: ( ( ruleText ) )
            // InternalTextualDataModel.g:6612:2: ( ruleText )
            {
            // InternalTextualDataModel.g:6612:2: ( ruleText )
            // InternalTextualDataModel.g:6613:3: ruleText
            {
             before(grammarAccess.getRelationshipAccess().getDescriptionTextParserRuleCall_4_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getRelationshipAccess().getDescriptionTextParserRuleCall_4_1_2_0()); 

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
    // $ANTLR end "rule__Relationship__DescriptionAssignment_4_1_2"


    // $ANTLR start "rule__Relationship__LocalizationsAssignment_4_2"
    // InternalTextualDataModel.g:6622:1: rule__Relationship__LocalizationsAssignment_4_2 : ( ruleLocalization ) ;
    public final void rule__Relationship__LocalizationsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6626:1: ( ( ruleLocalization ) )
            // InternalTextualDataModel.g:6627:2: ( ruleLocalization )
            {
            // InternalTextualDataModel.g:6627:2: ( ruleLocalization )
            // InternalTextualDataModel.g:6628:3: ruleLocalization
            {
             before(grammarAccess.getRelationshipAccess().getLocalizationsLocalizationParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLocalization();

            state._fsp--;

             after(grammarAccess.getRelationshipAccess().getLocalizationsLocalizationParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Relationship__LocalizationsAssignment_4_2"


    // $ANTLR start "rule__Relationship__EndsAssignment_4_3"
    // InternalTextualDataModel.g:6637:1: rule__Relationship__EndsAssignment_4_3 : ( ruleRelationshipEnd ) ;
    public final void rule__Relationship__EndsAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6641:1: ( ( ruleRelationshipEnd ) )
            // InternalTextualDataModel.g:6642:2: ( ruleRelationshipEnd )
            {
            // InternalTextualDataModel.g:6642:2: ( ruleRelationshipEnd )
            // InternalTextualDataModel.g:6643:3: ruleRelationshipEnd
            {
             before(grammarAccess.getRelationshipAccess().getEndsRelationshipEndParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationshipEnd();

            state._fsp--;

             after(grammarAccess.getRelationshipAccess().getEndsRelationshipEndParserRuleCall_4_3_0()); 

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
    // $ANTLR end "rule__Relationship__EndsAssignment_4_3"


    // $ANTLR start "rule__RelationshipEnd__NameAssignment_0"
    // InternalTextualDataModel.g:6652:1: rule__RelationshipEnd__NameAssignment_0 : ( ruleElementName ) ;
    public final void rule__RelationshipEnd__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6656:1: ( ( ruleElementName ) )
            // InternalTextualDataModel.g:6657:2: ( ruleElementName )
            {
            // InternalTextualDataModel.g:6657:2: ( ruleElementName )
            // InternalTextualDataModel.g:6658:3: ruleElementName
            {
             before(grammarAccess.getRelationshipEndAccess().getNameElementNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleElementName();

            state._fsp--;

             after(grammarAccess.getRelationshipEndAccess().getNameElementNameParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__RelationshipEnd__NameAssignment_0"


    // $ANTLR start "rule__RelationshipEnd__EntityAssignment_1"
    // InternalTextualDataModel.g:6667:1: rule__RelationshipEnd__EntityAssignment_1 : ( ( ruleElementName ) ) ;
    public final void rule__RelationshipEnd__EntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6671:1: ( ( ( ruleElementName ) ) )
            // InternalTextualDataModel.g:6672:2: ( ( ruleElementName ) )
            {
            // InternalTextualDataModel.g:6672:2: ( ( ruleElementName ) )
            // InternalTextualDataModel.g:6673:3: ( ruleElementName )
            {
             before(grammarAccess.getRelationshipEndAccess().getEntityEntityCrossReference_1_0()); 
            // InternalTextualDataModel.g:6674:3: ( ruleElementName )
            // InternalTextualDataModel.g:6675:4: ruleElementName
            {
             before(grammarAccess.getRelationshipEndAccess().getEntityEntityElementNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleElementName();

            state._fsp--;

             after(grammarAccess.getRelationshipEndAccess().getEntityEntityElementNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRelationshipEndAccess().getEntityEntityCrossReference_1_0()); 

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
    // $ANTLR end "rule__RelationshipEnd__EntityAssignment_1"


    // $ANTLR start "rule__RelationshipEnd__LowerAssignment_2"
    // InternalTextualDataModel.g:6686:1: rule__RelationshipEnd__LowerAssignment_2 : ( RULE_INT ) ;
    public final void rule__RelationshipEnd__LowerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6690:1: ( ( RULE_INT ) )
            // InternalTextualDataModel.g:6691:2: ( RULE_INT )
            {
            // InternalTextualDataModel.g:6691:2: ( RULE_INT )
            // InternalTextualDataModel.g:6692:3: RULE_INT
            {
             before(grammarAccess.getRelationshipEndAccess().getLowerINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRelationshipEndAccess().getLowerINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__RelationshipEnd__LowerAssignment_2"


    // $ANTLR start "rule__RelationshipEnd__UpperAssignment_4"
    // InternalTextualDataModel.g:6701:1: rule__RelationshipEnd__UpperAssignment_4 : ( ruleUnlimitedNatural ) ;
    public final void rule__RelationshipEnd__UpperAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6705:1: ( ( ruleUnlimitedNatural ) )
            // InternalTextualDataModel.g:6706:2: ( ruleUnlimitedNatural )
            {
            // InternalTextualDataModel.g:6706:2: ( ruleUnlimitedNatural )
            // InternalTextualDataModel.g:6707:3: ruleUnlimitedNatural
            {
             before(grammarAccess.getRelationshipEndAccess().getUpperUnlimitedNaturalParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleUnlimitedNatural();

            state._fsp--;

             after(grammarAccess.getRelationshipEndAccess().getUpperUnlimitedNaturalParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__RelationshipEnd__UpperAssignment_4"


    // $ANTLR start "rule__RelationshipEnd__DescriptionAssignment_5_1_2"
    // InternalTextualDataModel.g:6716:1: rule__RelationshipEnd__DescriptionAssignment_5_1_2 : ( ruleText ) ;
    public final void rule__RelationshipEnd__DescriptionAssignment_5_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6720:1: ( ( ruleText ) )
            // InternalTextualDataModel.g:6721:2: ( ruleText )
            {
            // InternalTextualDataModel.g:6721:2: ( ruleText )
            // InternalTextualDataModel.g:6722:3: ruleText
            {
             before(grammarAccess.getRelationshipEndAccess().getDescriptionTextParserRuleCall_5_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getRelationshipEndAccess().getDescriptionTextParserRuleCall_5_1_2_0()); 

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
    // $ANTLR end "rule__RelationshipEnd__DescriptionAssignment_5_1_2"


    // $ANTLR start "rule__RelationshipEnd__LocalizationsAssignment_5_2"
    // InternalTextualDataModel.g:6731:1: rule__RelationshipEnd__LocalizationsAssignment_5_2 : ( ruleLocalization ) ;
    public final void rule__RelationshipEnd__LocalizationsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6735:1: ( ( ruleLocalization ) )
            // InternalTextualDataModel.g:6736:2: ( ruleLocalization )
            {
            // InternalTextualDataModel.g:6736:2: ( ruleLocalization )
            // InternalTextualDataModel.g:6737:3: ruleLocalization
            {
             before(grammarAccess.getRelationshipEndAccess().getLocalizationsLocalizationParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLocalization();

            state._fsp--;

             after(grammarAccess.getRelationshipEndAccess().getLocalizationsLocalizationParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__RelationshipEnd__LocalizationsAssignment_5_2"


    // $ANTLR start "rule__BooleanType__NameAssignment_1"
    // InternalTextualDataModel.g:6746:1: rule__BooleanType__NameAssignment_1 : ( ruleElementName ) ;
    public final void rule__BooleanType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6750:1: ( ( ruleElementName ) )
            // InternalTextualDataModel.g:6751:2: ( ruleElementName )
            {
            // InternalTextualDataModel.g:6751:2: ( ruleElementName )
            // InternalTextualDataModel.g:6752:3: ruleElementName
            {
             before(grammarAccess.getBooleanTypeAccess().getNameElementNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElementName();

            state._fsp--;

             after(grammarAccess.getBooleanTypeAccess().getNameElementNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__BooleanType__NameAssignment_1"


    // $ANTLR start "rule__BooleanType__DescriptionAssignment_2_1_2"
    // InternalTextualDataModel.g:6761:1: rule__BooleanType__DescriptionAssignment_2_1_2 : ( ruleText ) ;
    public final void rule__BooleanType__DescriptionAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6765:1: ( ( ruleText ) )
            // InternalTextualDataModel.g:6766:2: ( ruleText )
            {
            // InternalTextualDataModel.g:6766:2: ( ruleText )
            // InternalTextualDataModel.g:6767:3: ruleText
            {
             before(grammarAccess.getBooleanTypeAccess().getDescriptionTextParserRuleCall_2_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getBooleanTypeAccess().getDescriptionTextParserRuleCall_2_1_2_0()); 

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
    // $ANTLR end "rule__BooleanType__DescriptionAssignment_2_1_2"


    // $ANTLR start "rule__BooleanType__LocalizationsAssignment_2_2"
    // InternalTextualDataModel.g:6776:1: rule__BooleanType__LocalizationsAssignment_2_2 : ( ruleLocalization ) ;
    public final void rule__BooleanType__LocalizationsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6780:1: ( ( ruleLocalization ) )
            // InternalTextualDataModel.g:6781:2: ( ruleLocalization )
            {
            // InternalTextualDataModel.g:6781:2: ( ruleLocalization )
            // InternalTextualDataModel.g:6782:3: ruleLocalization
            {
             before(grammarAccess.getBooleanTypeAccess().getLocalizationsLocalizationParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLocalization();

            state._fsp--;

             after(grammarAccess.getBooleanTypeAccess().getLocalizationsLocalizationParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__BooleanType__LocalizationsAssignment_2_2"


    // $ANTLR start "rule__StringType__NameAssignment_1"
    // InternalTextualDataModel.g:6791:1: rule__StringType__NameAssignment_1 : ( ruleElementName ) ;
    public final void rule__StringType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6795:1: ( ( ruleElementName ) )
            // InternalTextualDataModel.g:6796:2: ( ruleElementName )
            {
            // InternalTextualDataModel.g:6796:2: ( ruleElementName )
            // InternalTextualDataModel.g:6797:3: ruleElementName
            {
             before(grammarAccess.getStringTypeAccess().getNameElementNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElementName();

            state._fsp--;

             after(grammarAccess.getStringTypeAccess().getNameElementNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__StringType__NameAssignment_1"


    // $ANTLR start "rule__StringType__DescriptionAssignment_2_1_2"
    // InternalTextualDataModel.g:6806:1: rule__StringType__DescriptionAssignment_2_1_2 : ( ruleText ) ;
    public final void rule__StringType__DescriptionAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6810:1: ( ( ruleText ) )
            // InternalTextualDataModel.g:6811:2: ( ruleText )
            {
            // InternalTextualDataModel.g:6811:2: ( ruleText )
            // InternalTextualDataModel.g:6812:3: ruleText
            {
             before(grammarAccess.getStringTypeAccess().getDescriptionTextParserRuleCall_2_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getStringTypeAccess().getDescriptionTextParserRuleCall_2_1_2_0()); 

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
    // $ANTLR end "rule__StringType__DescriptionAssignment_2_1_2"


    // $ANTLR start "rule__StringType__LocalizationsAssignment_2_2"
    // InternalTextualDataModel.g:6821:1: rule__StringType__LocalizationsAssignment_2_2 : ( ruleLocalization ) ;
    public final void rule__StringType__LocalizationsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6825:1: ( ( ruleLocalization ) )
            // InternalTextualDataModel.g:6826:2: ( ruleLocalization )
            {
            // InternalTextualDataModel.g:6826:2: ( ruleLocalization )
            // InternalTextualDataModel.g:6827:3: ruleLocalization
            {
             before(grammarAccess.getStringTypeAccess().getLocalizationsLocalizationParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLocalization();

            state._fsp--;

             after(grammarAccess.getStringTypeAccess().getLocalizationsLocalizationParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__StringType__LocalizationsAssignment_2_2"


    // $ANTLR start "rule__StringType__LengthAssignment_2_3_1"
    // InternalTextualDataModel.g:6836:1: rule__StringType__LengthAssignment_2_3_1 : ( RULE_INT ) ;
    public final void rule__StringType__LengthAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6840:1: ( ( RULE_INT ) )
            // InternalTextualDataModel.g:6841:2: ( RULE_INT )
            {
            // InternalTextualDataModel.g:6841:2: ( RULE_INT )
            // InternalTextualDataModel.g:6842:3: RULE_INT
            {
             before(grammarAccess.getStringTypeAccess().getLengthINTTerminalRuleCall_2_3_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getLengthINTTerminalRuleCall_2_3_1_0()); 

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
    // $ANTLR end "rule__StringType__LengthAssignment_2_3_1"


    // $ANTLR start "rule__StringType__MinLengthAssignment_2_4_1"
    // InternalTextualDataModel.g:6851:1: rule__StringType__MinLengthAssignment_2_4_1 : ( RULE_INT ) ;
    public final void rule__StringType__MinLengthAssignment_2_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6855:1: ( ( RULE_INT ) )
            // InternalTextualDataModel.g:6856:2: ( RULE_INT )
            {
            // InternalTextualDataModel.g:6856:2: ( RULE_INT )
            // InternalTextualDataModel.g:6857:3: RULE_INT
            {
             before(grammarAccess.getStringTypeAccess().getMinLengthINTTerminalRuleCall_2_4_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getMinLengthINTTerminalRuleCall_2_4_1_0()); 

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
    // $ANTLR end "rule__StringType__MinLengthAssignment_2_4_1"


    // $ANTLR start "rule__StringType__MaxLengthAssignment_2_5_1"
    // InternalTextualDataModel.g:6866:1: rule__StringType__MaxLengthAssignment_2_5_1 : ( RULE_INT ) ;
    public final void rule__StringType__MaxLengthAssignment_2_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6870:1: ( ( RULE_INT ) )
            // InternalTextualDataModel.g:6871:2: ( RULE_INT )
            {
            // InternalTextualDataModel.g:6871:2: ( RULE_INT )
            // InternalTextualDataModel.g:6872:3: RULE_INT
            {
             before(grammarAccess.getStringTypeAccess().getMaxLengthINTTerminalRuleCall_2_5_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getMaxLengthINTTerminalRuleCall_2_5_1_0()); 

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
    // $ANTLR end "rule__StringType__MaxLengthAssignment_2_5_1"


    // $ANTLR start "rule__StringType__PatternAssignment_2_6_1"
    // InternalTextualDataModel.g:6881:1: rule__StringType__PatternAssignment_2_6_1 : ( ruleText ) ;
    public final void rule__StringType__PatternAssignment_2_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6885:1: ( ( ruleText ) )
            // InternalTextualDataModel.g:6886:2: ( ruleText )
            {
            // InternalTextualDataModel.g:6886:2: ( ruleText )
            // InternalTextualDataModel.g:6887:3: ruleText
            {
             before(grammarAccess.getStringTypeAccess().getPatternTextParserRuleCall_2_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getStringTypeAccess().getPatternTextParserRuleCall_2_6_1_0()); 

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
    // $ANTLR end "rule__StringType__PatternAssignment_2_6_1"


    // $ANTLR start "rule__NumericType__NameAssignment_1"
    // InternalTextualDataModel.g:6896:1: rule__NumericType__NameAssignment_1 : ( ruleElementName ) ;
    public final void rule__NumericType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6900:1: ( ( ruleElementName ) )
            // InternalTextualDataModel.g:6901:2: ( ruleElementName )
            {
            // InternalTextualDataModel.g:6901:2: ( ruleElementName )
            // InternalTextualDataModel.g:6902:3: ruleElementName
            {
             before(grammarAccess.getNumericTypeAccess().getNameElementNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElementName();

            state._fsp--;

             after(grammarAccess.getNumericTypeAccess().getNameElementNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__NumericType__NameAssignment_1"


    // $ANTLR start "rule__NumericType__DescriptionAssignment_2_1_2"
    // InternalTextualDataModel.g:6911:1: rule__NumericType__DescriptionAssignment_2_1_2 : ( ruleText ) ;
    public final void rule__NumericType__DescriptionAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6915:1: ( ( ruleText ) )
            // InternalTextualDataModel.g:6916:2: ( ruleText )
            {
            // InternalTextualDataModel.g:6916:2: ( ruleText )
            // InternalTextualDataModel.g:6917:3: ruleText
            {
             before(grammarAccess.getNumericTypeAccess().getDescriptionTextParserRuleCall_2_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getNumericTypeAccess().getDescriptionTextParserRuleCall_2_1_2_0()); 

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
    // $ANTLR end "rule__NumericType__DescriptionAssignment_2_1_2"


    // $ANTLR start "rule__NumericType__LocalizationsAssignment_2_2"
    // InternalTextualDataModel.g:6926:1: rule__NumericType__LocalizationsAssignment_2_2 : ( ruleLocalization ) ;
    public final void rule__NumericType__LocalizationsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6930:1: ( ( ruleLocalization ) )
            // InternalTextualDataModel.g:6931:2: ( ruleLocalization )
            {
            // InternalTextualDataModel.g:6931:2: ( ruleLocalization )
            // InternalTextualDataModel.g:6932:3: ruleLocalization
            {
             before(grammarAccess.getNumericTypeAccess().getLocalizationsLocalizationParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLocalization();

            state._fsp--;

             after(grammarAccess.getNumericTypeAccess().getLocalizationsLocalizationParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__NumericType__LocalizationsAssignment_2_2"


    // $ANTLR start "rule__NumericType__SizeAssignment_2_3_1"
    // InternalTextualDataModel.g:6941:1: rule__NumericType__SizeAssignment_2_3_1 : ( rulePositiveShort ) ;
    public final void rule__NumericType__SizeAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6945:1: ( ( rulePositiveShort ) )
            // InternalTextualDataModel.g:6946:2: ( rulePositiveShort )
            {
            // InternalTextualDataModel.g:6946:2: ( rulePositiveShort )
            // InternalTextualDataModel.g:6947:3: rulePositiveShort
            {
             before(grammarAccess.getNumericTypeAccess().getSizePositiveShortParserRuleCall_2_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePositiveShort();

            state._fsp--;

             after(grammarAccess.getNumericTypeAccess().getSizePositiveShortParserRuleCall_2_3_1_0()); 

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
    // $ANTLR end "rule__NumericType__SizeAssignment_2_3_1"


    // $ANTLR start "rule__NumericType__TotalDigitsAssignment_2_4_1"
    // InternalTextualDataModel.g:6956:1: rule__NumericType__TotalDigitsAssignment_2_4_1 : ( rulePositiveShort ) ;
    public final void rule__NumericType__TotalDigitsAssignment_2_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6960:1: ( ( rulePositiveShort ) )
            // InternalTextualDataModel.g:6961:2: ( rulePositiveShort )
            {
            // InternalTextualDataModel.g:6961:2: ( rulePositiveShort )
            // InternalTextualDataModel.g:6962:3: rulePositiveShort
            {
             before(grammarAccess.getNumericTypeAccess().getTotalDigitsPositiveShortParserRuleCall_2_4_1_0()); 
            pushFollow(FOLLOW_2);
            rulePositiveShort();

            state._fsp--;

             after(grammarAccess.getNumericTypeAccess().getTotalDigitsPositiveShortParserRuleCall_2_4_1_0()); 

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
    // $ANTLR end "rule__NumericType__TotalDigitsAssignment_2_4_1"


    // $ANTLR start "rule__NumericType__FractionDigitsAssignment_2_5_1"
    // InternalTextualDataModel.g:6971:1: rule__NumericType__FractionDigitsAssignment_2_5_1 : ( rulePositiveShort ) ;
    public final void rule__NumericType__FractionDigitsAssignment_2_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6975:1: ( ( rulePositiveShort ) )
            // InternalTextualDataModel.g:6976:2: ( rulePositiveShort )
            {
            // InternalTextualDataModel.g:6976:2: ( rulePositiveShort )
            // InternalTextualDataModel.g:6977:3: rulePositiveShort
            {
             before(grammarAccess.getNumericTypeAccess().getFractionDigitsPositiveShortParserRuleCall_2_5_1_0()); 
            pushFollow(FOLLOW_2);
            rulePositiveShort();

            state._fsp--;

             after(grammarAccess.getNumericTypeAccess().getFractionDigitsPositiveShortParserRuleCall_2_5_1_0()); 

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
    // $ANTLR end "rule__NumericType__FractionDigitsAssignment_2_5_1"


    // $ANTLR start "rule__NumericType__MinInclusiveAssignment_2_6_1"
    // InternalTextualDataModel.g:6986:1: rule__NumericType__MinInclusiveAssignment_2_6_1 : ( ruleDouble ) ;
    public final void rule__NumericType__MinInclusiveAssignment_2_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:6990:1: ( ( ruleDouble ) )
            // InternalTextualDataModel.g:6991:2: ( ruleDouble )
            {
            // InternalTextualDataModel.g:6991:2: ( ruleDouble )
            // InternalTextualDataModel.g:6992:3: ruleDouble
            {
             before(grammarAccess.getNumericTypeAccess().getMinInclusiveDoubleParserRuleCall_2_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getNumericTypeAccess().getMinInclusiveDoubleParserRuleCall_2_6_1_0()); 

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
    // $ANTLR end "rule__NumericType__MinInclusiveAssignment_2_6_1"


    // $ANTLR start "rule__NumericType__MinExclusiveAssignment_2_7_1"
    // InternalTextualDataModel.g:7001:1: rule__NumericType__MinExclusiveAssignment_2_7_1 : ( ruleDouble ) ;
    public final void rule__NumericType__MinExclusiveAssignment_2_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:7005:1: ( ( ruleDouble ) )
            // InternalTextualDataModel.g:7006:2: ( ruleDouble )
            {
            // InternalTextualDataModel.g:7006:2: ( ruleDouble )
            // InternalTextualDataModel.g:7007:3: ruleDouble
            {
             before(grammarAccess.getNumericTypeAccess().getMinExclusiveDoubleParserRuleCall_2_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getNumericTypeAccess().getMinExclusiveDoubleParserRuleCall_2_7_1_0()); 

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
    // $ANTLR end "rule__NumericType__MinExclusiveAssignment_2_7_1"


    // $ANTLR start "rule__NumericType__MaxInclusiveAssignment_2_8_1"
    // InternalTextualDataModel.g:7016:1: rule__NumericType__MaxInclusiveAssignment_2_8_1 : ( ruleDouble ) ;
    public final void rule__NumericType__MaxInclusiveAssignment_2_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:7020:1: ( ( ruleDouble ) )
            // InternalTextualDataModel.g:7021:2: ( ruleDouble )
            {
            // InternalTextualDataModel.g:7021:2: ( ruleDouble )
            // InternalTextualDataModel.g:7022:3: ruleDouble
            {
             before(grammarAccess.getNumericTypeAccess().getMaxInclusiveDoubleParserRuleCall_2_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getNumericTypeAccess().getMaxInclusiveDoubleParserRuleCall_2_8_1_0()); 

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
    // $ANTLR end "rule__NumericType__MaxInclusiveAssignment_2_8_1"


    // $ANTLR start "rule__NumericType__MaxExclusiveAssignment_2_9_1"
    // InternalTextualDataModel.g:7031:1: rule__NumericType__MaxExclusiveAssignment_2_9_1 : ( ruleDouble ) ;
    public final void rule__NumericType__MaxExclusiveAssignment_2_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:7035:1: ( ( ruleDouble ) )
            // InternalTextualDataModel.g:7036:2: ( ruleDouble )
            {
            // InternalTextualDataModel.g:7036:2: ( ruleDouble )
            // InternalTextualDataModel.g:7037:3: ruleDouble
            {
             before(grammarAccess.getNumericTypeAccess().getMaxExclusiveDoubleParserRuleCall_2_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getNumericTypeAccess().getMaxExclusiveDoubleParserRuleCall_2_9_1_0()); 

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
    // $ANTLR end "rule__NumericType__MaxExclusiveAssignment_2_9_1"


    // $ANTLR start "rule__NumericType__MeasurementUnitAssignment_2_10_1"
    // InternalTextualDataModel.g:7046:1: rule__NumericType__MeasurementUnitAssignment_2_10_1 : ( ruleText ) ;
    public final void rule__NumericType__MeasurementUnitAssignment_2_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:7050:1: ( ( ruleText ) )
            // InternalTextualDataModel.g:7051:2: ( ruleText )
            {
            // InternalTextualDataModel.g:7051:2: ( ruleText )
            // InternalTextualDataModel.g:7052:3: ruleText
            {
             before(grammarAccess.getNumericTypeAccess().getMeasurementUnitTextParserRuleCall_2_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getNumericTypeAccess().getMeasurementUnitTextParserRuleCall_2_10_1_0()); 

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
    // $ANTLR end "rule__NumericType__MeasurementUnitAssignment_2_10_1"


    // $ANTLR start "rule__DateType__NameAssignment_1"
    // InternalTextualDataModel.g:7061:1: rule__DateType__NameAssignment_1 : ( ruleElementName ) ;
    public final void rule__DateType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:7065:1: ( ( ruleElementName ) )
            // InternalTextualDataModel.g:7066:2: ( ruleElementName )
            {
            // InternalTextualDataModel.g:7066:2: ( ruleElementName )
            // InternalTextualDataModel.g:7067:3: ruleElementName
            {
             before(grammarAccess.getDateTypeAccess().getNameElementNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElementName();

            state._fsp--;

             after(grammarAccess.getDateTypeAccess().getNameElementNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__DateType__NameAssignment_1"


    // $ANTLR start "rule__DateType__DescriptionAssignment_2_1_2"
    // InternalTextualDataModel.g:7076:1: rule__DateType__DescriptionAssignment_2_1_2 : ( ruleText ) ;
    public final void rule__DateType__DescriptionAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:7080:1: ( ( ruleText ) )
            // InternalTextualDataModel.g:7081:2: ( ruleText )
            {
            // InternalTextualDataModel.g:7081:2: ( ruleText )
            // InternalTextualDataModel.g:7082:3: ruleText
            {
             before(grammarAccess.getDateTypeAccess().getDescriptionTextParserRuleCall_2_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getDateTypeAccess().getDescriptionTextParserRuleCall_2_1_2_0()); 

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
    // $ANTLR end "rule__DateType__DescriptionAssignment_2_1_2"


    // $ANTLR start "rule__DateType__LocalizationsAssignment_2_2"
    // InternalTextualDataModel.g:7091:1: rule__DateType__LocalizationsAssignment_2_2 : ( ruleLocalization ) ;
    public final void rule__DateType__LocalizationsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:7095:1: ( ( ruleLocalization ) )
            // InternalTextualDataModel.g:7096:2: ( ruleLocalization )
            {
            // InternalTextualDataModel.g:7096:2: ( ruleLocalization )
            // InternalTextualDataModel.g:7097:3: ruleLocalization
            {
             before(grammarAccess.getDateTypeAccess().getLocalizationsLocalizationParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLocalization();

            state._fsp--;

             after(grammarAccess.getDateTypeAccess().getLocalizationsLocalizationParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__DateType__LocalizationsAssignment_2_2"


    // $ANTLR start "rule__DateTimeType__NameAssignment_1"
    // InternalTextualDataModel.g:7106:1: rule__DateTimeType__NameAssignment_1 : ( ruleElementName ) ;
    public final void rule__DateTimeType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:7110:1: ( ( ruleElementName ) )
            // InternalTextualDataModel.g:7111:2: ( ruleElementName )
            {
            // InternalTextualDataModel.g:7111:2: ( ruleElementName )
            // InternalTextualDataModel.g:7112:3: ruleElementName
            {
             before(grammarAccess.getDateTimeTypeAccess().getNameElementNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElementName();

            state._fsp--;

             after(grammarAccess.getDateTimeTypeAccess().getNameElementNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__DateTimeType__NameAssignment_1"


    // $ANTLR start "rule__DateTimeType__DescriptionAssignment_2_1_2"
    // InternalTextualDataModel.g:7121:1: rule__DateTimeType__DescriptionAssignment_2_1_2 : ( ruleText ) ;
    public final void rule__DateTimeType__DescriptionAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:7125:1: ( ( ruleText ) )
            // InternalTextualDataModel.g:7126:2: ( ruleText )
            {
            // InternalTextualDataModel.g:7126:2: ( ruleText )
            // InternalTextualDataModel.g:7127:3: ruleText
            {
             before(grammarAccess.getDateTimeTypeAccess().getDescriptionTextParserRuleCall_2_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getDateTimeTypeAccess().getDescriptionTextParserRuleCall_2_1_2_0()); 

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
    // $ANTLR end "rule__DateTimeType__DescriptionAssignment_2_1_2"


    // $ANTLR start "rule__DateTimeType__LocalizationsAssignment_2_2"
    // InternalTextualDataModel.g:7136:1: rule__DateTimeType__LocalizationsAssignment_2_2 : ( ruleLocalization ) ;
    public final void rule__DateTimeType__LocalizationsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:7140:1: ( ( ruleLocalization ) )
            // InternalTextualDataModel.g:7141:2: ( ruleLocalization )
            {
            // InternalTextualDataModel.g:7141:2: ( ruleLocalization )
            // InternalTextualDataModel.g:7142:3: ruleLocalization
            {
             before(grammarAccess.getDateTimeTypeAccess().getLocalizationsLocalizationParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLocalization();

            state._fsp--;

             after(grammarAccess.getDateTimeTypeAccess().getLocalizationsLocalizationParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__DateTimeType__LocalizationsAssignment_2_2"


    // $ANTLR start "rule__UuidType__NameAssignment_1"
    // InternalTextualDataModel.g:7151:1: rule__UuidType__NameAssignment_1 : ( ruleElementName ) ;
    public final void rule__UuidType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:7155:1: ( ( ruleElementName ) )
            // InternalTextualDataModel.g:7156:2: ( ruleElementName )
            {
            // InternalTextualDataModel.g:7156:2: ( ruleElementName )
            // InternalTextualDataModel.g:7157:3: ruleElementName
            {
             before(grammarAccess.getUuidTypeAccess().getNameElementNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElementName();

            state._fsp--;

             after(grammarAccess.getUuidTypeAccess().getNameElementNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__UuidType__NameAssignment_1"


    // $ANTLR start "rule__UuidType__DescriptionAssignment_2_1_2"
    // InternalTextualDataModel.g:7166:1: rule__UuidType__DescriptionAssignment_2_1_2 : ( ruleText ) ;
    public final void rule__UuidType__DescriptionAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:7170:1: ( ( ruleText ) )
            // InternalTextualDataModel.g:7171:2: ( ruleText )
            {
            // InternalTextualDataModel.g:7171:2: ( ruleText )
            // InternalTextualDataModel.g:7172:3: ruleText
            {
             before(grammarAccess.getUuidTypeAccess().getDescriptionTextParserRuleCall_2_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getUuidTypeAccess().getDescriptionTextParserRuleCall_2_1_2_0()); 

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
    // $ANTLR end "rule__UuidType__DescriptionAssignment_2_1_2"


    // $ANTLR start "rule__UuidType__LocalizationsAssignment_2_2"
    // InternalTextualDataModel.g:7181:1: rule__UuidType__LocalizationsAssignment_2_2 : ( ruleLocalization ) ;
    public final void rule__UuidType__LocalizationsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:7185:1: ( ( ruleLocalization ) )
            // InternalTextualDataModel.g:7186:2: ( ruleLocalization )
            {
            // InternalTextualDataModel.g:7186:2: ( ruleLocalization )
            // InternalTextualDataModel.g:7187:3: ruleLocalization
            {
             before(grammarAccess.getUuidTypeAccess().getLocalizationsLocalizationParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLocalization();

            state._fsp--;

             after(grammarAccess.getUuidTypeAccess().getLocalizationsLocalizationParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__UuidType__LocalizationsAssignment_2_2"


    // $ANTLR start "rule__Localization__LocaleAssignment_1"
    // InternalTextualDataModel.g:7196:1: rule__Localization__LocaleAssignment_1 : ( RULE_ID ) ;
    public final void rule__Localization__LocaleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:7200:1: ( ( RULE_ID ) )
            // InternalTextualDataModel.g:7201:2: ( RULE_ID )
            {
            // InternalTextualDataModel.g:7201:2: ( RULE_ID )
            // InternalTextualDataModel.g:7202:3: RULE_ID
            {
             before(grammarAccess.getLocalizationAccess().getLocaleIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLocalizationAccess().getLocaleIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Localization__LocaleAssignment_1"


    // $ANTLR start "rule__Localization__NameAssignment_3_0"
    // InternalTextualDataModel.g:7211:1: rule__Localization__NameAssignment_3_0 : ( ruleText ) ;
    public final void rule__Localization__NameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:7215:1: ( ( ruleText ) )
            // InternalTextualDataModel.g:7216:2: ( ruleText )
            {
            // InternalTextualDataModel.g:7216:2: ( ruleText )
            // InternalTextualDataModel.g:7217:3: ruleText
            {
             before(grammarAccess.getLocalizationAccess().getNameTextParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getLocalizationAccess().getNameTextParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__Localization__NameAssignment_3_0"


    // $ANTLR start "rule__Localization__DescriptionAssignment_3_1"
    // InternalTextualDataModel.g:7226:1: rule__Localization__DescriptionAssignment_3_1 : ( ruleText ) ;
    public final void rule__Localization__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTextualDataModel.g:7230:1: ( ( ruleText ) )
            // InternalTextualDataModel.g:7231:2: ( ruleText )
            {
            // InternalTextualDataModel.g:7231:2: ( ruleText )
            // InternalTextualDataModel.g:7232:3: ruleText
            {
             before(grammarAccess.getLocalizationAccess().getDescriptionTextParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getLocalizationAccess().getDescriptionTextParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Localization__DescriptionAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x003C021C19800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x001C021800000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000A0400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0020000001800010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0100000200400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0020000001800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020400010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x002001E001800000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0023FC0001800000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00C0000000000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0040000000000020L});

}