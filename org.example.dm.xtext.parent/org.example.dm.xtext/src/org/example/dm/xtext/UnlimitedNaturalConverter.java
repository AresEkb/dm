package org.example.dm.xtext;

import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode;

public class UnlimitedNaturalConverter extends AbstractLexerBasedConverter<Integer> {

    private static final String STAR = "*";

    @Override
    public Integer toValue(String string, INode node) {
        return STAR.equals(string) ? -1 : Integer.valueOf(string);
    }

    @Override
    public String toString(Integer value) {
        return value == -1 ? STAR : String.valueOf(value);
    }

}
