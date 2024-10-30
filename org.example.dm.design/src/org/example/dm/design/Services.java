package org.example.dm.design;

import java.lang.System.Logger;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Stream;

import org.example.dm.Attribute;
import org.example.dm.DataModel;
import org.example.dm.DataType;
import org.example.dm.DmFactory;
import org.example.dm.Entity;
import org.example.dm.Localization;
import org.example.dm.NamedElement;
import org.example.dm.Relationship;
import org.example.dm.RelationshipEnd;

/**
 * The services class used by VSM.
 */
public class Services {

    private static final System.Logger LOGGER = System.getLogger(Services.class.toString());

    public Object log(Object obj) {
        LOGGER.log(Logger.Level.INFO, obj);
        return obj;
    }

    public String getLabel(DataModel element) {
        return StringHelpers.toUpperCamelCase(StringHelpers.tokenizeNaturalCase(element.getName()));
    }

    public String getLabel(Entity element) {
        return StringHelpers.toUpperCamelCase(StringHelpers.tokenizeNaturalCase(element.getName()));
    }

    public String getLabel(Relationship element) {
        return StringHelpers.toUpperCamelCase(StringHelpers.tokenizeNaturalCase(element.getName()));
    }

    public String getLabel(DataType element) {
        return StringHelpers.toUpperCamelCase(StringHelpers.tokenizeNaturalCase(element.getName()));
    }

    public String getLabel(Attribute element) {
        return StringHelpers.toCamelCase(StringHelpers.tokenizeNaturalCase(element.getName()));
    }

    public String getLabel(RelationshipEnd element) {
        return StringHelpers.toCamelCase(StringHelpers.tokenizeNaturalCase(element.getName()));
    }

    public void updateLocales(DataModel dataModel, String locales) {
        var localeList = Stream.of(locales.split(",")).map(String::trim).filter(StringHelpers::isNotBlank).toList();
        dataModel.getLocales().clear();
        dataModel.getLocales().addAll(localeList);

        updateLocalizations(dataModel, localeList);
        for (var entity : dataModel.getEntities()) {
            updateLocalizations(entity, localeList);
            for (var attribute : entity.getAttributes()) {
                updateLocalizations(attribute, localeList);
            }
        }
        for (var relationship : dataModel.getRelationships()) {
            updateLocalizations(relationship, localeList);
            for (var end : relationship.getEnds()) {
                updateLocalizations(end, localeList);
            }
        }
        for (var dataType : dataModel.getDataTypes()) {
            updateLocalizations(dataType, localeList);
        }
    }

    public void updateLocalizations(NamedElement element) {
        var dataModel = EmfHelpers.findContainerOrSelf(element, DataModel.class).orElseThrow();
        updateLocalizations(element, dataModel.getLocales());
    }

    public void updateLocalizations(NamedElement element, List<String> locales) {
        SortedMap<String, Localization> localizations = new TreeMap<>();
        for (var localization : element.getLocalizations()) {
            if (StringHelpers.isNotBlank(localization.getLocale())) {
                localizations.put(localization.getLocale(), localization);
            }
        }
        element.getLocalizations().clear();
        for (var locale : locales) {
            Localization localization = localizations.remove(locale);
            if (localization == null) {
                localization = DmFactory.eINSTANCE.createLocalization();
                localization.setLocale(locale);
            }
            element.getLocalizations().add(localization);
        }
        for (var localization : localizations.values()) {
            if (StringHelpers.isNotBlank(localization.getName())
                    || StringHelpers.isNotBlank(localization.getDescription())) {
                element.getLocalizations().add(localization);
            }
        }
    }

}
