package org.example.dm.xtext;

import org.eclipse.xtext.conversion.impl.STRINGValueConverter;
import org.eclipse.xtext.util.Strings;

public class ElementNameConverter extends STRINGValueConverter {

    @Override
    protected String toEscapedString(String value) {
        return '\'' + Strings.convertToJavaString(value, false) + '\'';
    }

}
