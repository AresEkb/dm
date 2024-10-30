package org.example.dm.xtext;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;

public class TextualDataModelValueConverterService extends DefaultTerminalConverters {

    @ValueConverter(rule = "ElementName")
    public IValueConverter<String> elementNameConverter() {
        return new ElementNameConverter();
    }

    @ValueConverter(rule = "Text")
    public IValueConverter<String> textConverter() {
        return new ElementNameConverter();
    }

    @ValueConverter(rule = "UnlimitedNatural")
    public IValueConverter<Integer> unlimitedNaturalConverter() {
        return new UnlimitedNaturalConverter();
    }

}
