/*
 * generated by Xtext 2.35.0
 */
package org.example.dm.xtext.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.example.dm.xtext.parser.antlr.internal.InternalTextualDataModelParser;
import org.example.dm.xtext.services.TextualDataModelGrammarAccess;

public class TextualDataModelParser extends AbstractAntlrParser {

	@Inject
	private TextualDataModelGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalTextualDataModelParser createParser(XtextTokenStream stream) {
		return new InternalTextualDataModelParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "DataModel";
	}

	public TextualDataModelGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TextualDataModelGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
