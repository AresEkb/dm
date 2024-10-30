<?xml version="1.0" encoding="UTF-8"?>
<dm:DataModel xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:dm="http://www.example.org/dm" xmi:id="_UgQHsGw_Ee-3np3omAWIpQ" name="software architecture">
  <localizations xmi:id="_UgQHsWw_Ee-3np3omAWIpQ" name="архитектура программного продукта" locale="ru">
    <localizations xmi:id="_sk7VgGzrEe-INYJYp9pCuA"/>
    <localizations xmi:id="_sk7VgWzrEe-INYJYp9pCuA"/>
    <localizations xmi:id="_sk7VgmzrEe-INYJYp9pCuA"/>
    <localizations xmi:id="_sk7Vg2zrEe-INYJYp9pCuA"/>
  </localizations>
  <localizations xmi:id="_UgQHsmw_Ee-3np3omAWIpQ" name="" locale="fr">
    <localizations xmi:id="_sk7VhGzrEe-INYJYp9pCuA"/>
    <localizations xmi:id="_sk7VhWzrEe-INYJYp9pCuA"/>
    <localizations xmi:id="_sk7VhmzrEe-INYJYp9pCuA"/>
    <localizations xmi:id="_sk7Vh2zrEe-INYJYp9pCuA"/>
  </localizations>
  <locales>ru</locales>
  <locales>fr</locales>
  <entities xmi:id="_GupRoGxCEe-fXqJrb_buJg" name="persistent entity" kind="ATTRIBUTE_SET">
    <localizations xmi:id="_N6xN8GzuEe-HZsrcTcqjdA" name="базовая сущность" locale="ru"/>
    <localizations xmi:id="_R1O4YGzuEe-HZsrcTcqjdA" locale="fr"/>
    <attributes xmi:id="_IpjfIGxCEe-fXqJrb_buJg" name="id" identity="true" dataType="_kHBHwGxsEe-N7vNLdFmZWg" lower="1" upper="1">
      <localizations xmi:id="_N6xN82zuEe-HZsrcTcqjdA" name="идентификатор" locale="ru"/>
      <localizations xmi:id="_R1O4YWzuEe-HZsrcTcqjdA" locale="fr"/>
    </attributes>
  </entities>
  <entities xmi:id="_CHDQ4GxBEe-fXqJrb_buJg" name="named entity" generals="_GupRoGxCEe-fXqJrb_buJg" kind="ATTRIBUTE_SET">
    <localizations xmi:id="_N6xN9mzuEe-HZsrcTcqjdA" name="именованная сущность" locale="ru"/>
    <localizations xmi:id="_R1O4YmzuEe-HZsrcTcqjdA" locale="fr"/>
    <attributes xmi:id="_UgQHtGw_Ee-3np3omAWIpQ" name="name" dataType="_T0eGUGxsEe-N7vNLdFmZWg" lower="1" upper="1">
      <localizations xmi:id="_N6x1AGzuEe-HZsrcTcqjdA" name="название" locale="ru"/>
      <localizations xmi:id="_R1O4Y2zuEe-HZsrcTcqjdA" locale="fr"/>
    </attributes>
    <attributes xmi:id="_EyK94GxCEe-fXqJrb_buJg" name="description" dataType="_V5xl8GxsEe-N7vNLdFmZWg" upper="1">
      <localizations xmi:id="_N6x1A2zuEe-HZsrcTcqjdA" name="описание" locale="ru"/>
      <localizations xmi:id="_R1O4ZGzuEe-HZsrcTcqjdA" locale="fr"/>
    </attributes>
  </entities>
  <entities xmi:id="_UgQHs2w_Ee-3np3omAWIpQ" name="software" generals="_CHDQ4GxBEe-fXqJrb_buJg">
    <localizations xmi:id="_N6x1BmzuEe-HZsrcTcqjdA" name="программный продукт" locale="ru"/>
    <localizations xmi:id="_R1O4ZWzuEe-HZsrcTcqjdA" locale="fr"/>
  </entities>
  <entities xmi:id="_bVvUoGxGEe-fXqJrb_buJg" name="subsystem" generals="_CHDQ4GxBEe-fXqJrb_buJg">
    <localizations xmi:id="_N6ycEGzuEe-HZsrcTcqjdA" name="подсистема" locale="ru"/>
    <localizations xmi:id="_R1PfcGzuEe-HZsrcTcqjdA" locale="fr"/>
  </entities>
  <entities xmi:id="_6juCUGxAEe-fXqJrb_buJg" name="requirement" generals="_CHDQ4GxBEe-fXqJrb_buJg" kind="ABSTRACT_ENTITY">
    <localizations xmi:id="_N6ycE2zuEe-HZsrcTcqjdA" name="требование" locale="ru"/>
    <localizations xmi:id="_R1PfcWzuEe-HZsrcTcqjdA" locale="fr"/>
    <attributes xmi:id="_36hl8GxVEe-fXqJrb_buJg" name="effort" dataType="_sBlVIGxtEe-N7vNLdFmZWg" upper="1">
      <localizations xmi:id="_N6zDIGzuEe-HZsrcTcqjdA" name="трудозатраты" locale="ru"/>
      <localizations xmi:id="_R1PfcmzuEe-HZsrcTcqjdA" locale="fr"/>
    </attributes>
  </entities>
  <entities xmi:id="_34fTsGxXEe-fXqJrb_buJg" name="business requirement" generals="_6juCUGxAEe-fXqJrb_buJg">
    <localizations xmi:id="_N6zDI2zuEe-HZsrcTcqjdA" name="бизнес-требование" locale="ru"/>
    <localizations xmi:id="_R1Pfc2zuEe-HZsrcTcqjdA" locale="fr"/>
  </entities>
  <entities xmi:id="__7HGUGxXEe-fXqJrb_buJg" name="system requirement" generals="_6juCUGxAEe-fXqJrb_buJg">
    <localizations xmi:id="_N6zDJmzuEe-HZsrcTcqjdA" name="системное требование" locale="ru"/>
    <localizations xmi:id="_R1PfdGzuEe-HZsrcTcqjdA" locale="fr"/>
    <attributes xmi:id="_jLFloGxZEe-fXqJrb_buJg" name="user scenario" dataType="_M8R_IGxvEe-kk4Qo5zeFBA" upper="1">
      <localizations xmi:id="_N6zqMWzuEe-HZsrcTcqjdA" name="пользовательский сценарий" locale="ru"/>
      <localizations xmi:id="_R1PfdWzuEe-HZsrcTcqjdA" locale="fr"/>
    </attributes>
  </entities>
  <entities xmi:id="_YSxVEGxVEe-fXqJrb_buJg" name="priority" generals="_CHDQ4GxBEe-fXqJrb_buJg" kind="REFERENCE_DATA">
    <localizations xmi:id="_N6zqNGzuEe-HZsrcTcqjdA" name="приоритет" locale="ru"/>
    <localizations xmi:id="_R1PfdmzuEe-HZsrcTcqjdA" locale="fr"/>
    <attributes xmi:id="_QpLJoGxZEe-fXqJrb_buJg" name="ordinal" dataType="_RvL_YGxtEe-N7vNLdFmZWg" lower="1" upper="1">
      <localizations xmi:id="_N6zqN2zuEe-HZsrcTcqjdA" name="порядковый номер" locale="ru"/>
      <localizations xmi:id="_R1Pfd2zuEe-HZsrcTcqjdA" locale="fr"/>
    </attributes>
  </entities>
  <relationships xmi:id="_DsEUoGxGEe-fXqJrb_buJg" kind="COMPOSITION">
    <localizations xmi:id="_N60RQGzuEe-HZsrcTcqjdA" locale="ru"/>
    <localizations xmi:id="_R1PfeGzuEe-HZsrcTcqjdA" locale="fr"/>
    <ends xmi:id="_DsEUoWxGEe-fXqJrb_buJg" entity="_UgQHs2w_Ee-3np3omAWIpQ">
      <localizations xmi:id="_N60RQ2zuEe-HZsrcTcqjdA" locale="ru"/>
      <localizations xmi:id="_R1PfeWzuEe-HZsrcTcqjdA" locale="fr"/>
    </ends>
    <ends xmi:id="_DsE7sGxGEe-fXqJrb_buJg" entity="_6juCUGxAEe-fXqJrb_buJg">
      <localizations xmi:id="_N60RRmzuEe-HZsrcTcqjdA" locale="ru"/>
      <localizations xmi:id="_R1PfemzuEe-HZsrcTcqjdA" locale="fr"/>
    </ends>
  </relationships>
  <relationships xmi:id="_dnsJIGxGEe-fXqJrb_buJg" kind="COMPOSITION">
    <localizations xmi:id="_N60RSWzuEe-HZsrcTcqjdA" name="" locale="ru"/>
    <localizations xmi:id="_R1Pfe2zuEe-HZsrcTcqjdA" locale="fr"/>
    <ends xmi:id="_dnsJIWxGEe-fXqJrb_buJg" name="parent" entity="_bVvUoGxGEe-fXqJrb_buJg" upper="1">
      <localizations xmi:id="_N604UmzuEe-HZsrcTcqjdA" name="родительская подсистема" locale="ru"/>
      <localizations xmi:id="_R1PffGzuEe-HZsrcTcqjdA" locale="fr"/>
    </ends>
    <ends xmi:id="_dnsJImxGEe-fXqJrb_buJg" name="children" entity="_bVvUoGxGEe-fXqJrb_buJg" upper="-1">
      <localizations xmi:id="_N604VWzuEe-HZsrcTcqjdA" name="дочерние подсистемы" locale="ru"/>
      <localizations xmi:id="_R1PffWzuEe-HZsrcTcqjdA" locale="fr"/>
    </ends>
  </relationships>
  <relationships xmi:id="_lLZLIGxGEe-fXqJrb_buJg" kind="COMPOSITION">
    <localizations xmi:id="_N604WGzuEe-HZsrcTcqjdA" locale="ru"/>
    <localizations xmi:id="_R1PffmzuEe-HZsrcTcqjdA" locale="fr"/>
    <ends xmi:id="_lLZLIWxGEe-fXqJrb_buJg" entity="_UgQHs2w_Ee-3np3omAWIpQ">
      <localizations xmi:id="_N61fYGzuEe-HZsrcTcqjdA" locale="ru"/>
      <localizations xmi:id="_R1Pff2zuEe-HZsrcTcqjdA" locale="fr"/>
    </ends>
    <ends xmi:id="_lLZyMGxGEe-fXqJrb_buJg" entity="_bVvUoGxGEe-fXqJrb_buJg">
      <localizations xmi:id="_N61fY2zuEe-HZsrcTcqjdA" locale="ru"/>
      <localizations xmi:id="_R1PfgGzuEe-HZsrcTcqjdA" locale="fr"/>
    </ends>
  </relationships>
  <relationships xmi:id="_1k39MGxVEe-fXqJrb_buJg">
    <localizations xmi:id="_N61fZmzuEe-HZsrcTcqjdA" locale="ru"/>
    <localizations xmi:id="_R1PfgWzuEe-HZsrcTcqjdA" locale="fr"/>
    <ends xmi:id="_1k4kQGxVEe-fXqJrb_buJg" name="" entity="_6juCUGxAEe-fXqJrb_buJg" upper="-1">
      <localizations xmi:id="_N62GcGzuEe-HZsrcTcqjdA" locale="ru"/>
      <localizations xmi:id="_R1QGgGzuEe-HZsrcTcqjdA" locale="fr"/>
    </ends>
    <ends xmi:id="_1k4kQWxVEe-fXqJrb_buJg" name="priority" entity="_YSxVEGxVEe-fXqJrb_buJg" upper="1">
      <localizations xmi:id="_N62Gc2zuEe-HZsrcTcqjdA" name="приоритет" locale="ru"/>
      <localizations xmi:id="_R1QGgWzuEe-HZsrcTcqjdA" locale="fr"/>
    </ends>
  </relationships>
  <relationships xmi:id="_CoT18GxkEe-hn6vP9yvn4A" name="requirement implementation">
    <localizations xmi:id="_N62GdmzuEe-HZsrcTcqjdA" locale="ru"/>
    <localizations xmi:id="_R1QGgmzuEe-HZsrcTcqjdA" locale="fr"/>
    <ends xmi:id="_CoUdAGxkEe-hn6vP9yvn4A" name="system requirements" entity="__7HGUGxXEe-fXqJrb_buJg" upper="-1">
      <localizations xmi:id="_N62tgGzuEe-HZsrcTcqjdA" name="системные требования" locale="ru"/>
      <localizations xmi:id="_R1QGg2zuEe-HZsrcTcqjdA" locale="fr"/>
    </ends>
    <ends xmi:id="_CoUdAWxkEe-hn6vP9yvn4A" name="business requirements" entity="_34fTsGxXEe-fXqJrb_buJg" upper="-1">
      <localizations xmi:id="_N62tg2zuEe-HZsrcTcqjdA" name="бизнес-требования" locale="ru"/>
      <localizations xmi:id="_R1QGhGzuEe-HZsrcTcqjdA" locale="fr"/>
    </ends>
  </relationships>
  <dataTypes xsi:type="dm:BooleanType" xmi:id="_TVlx8GxsEe-N7vNLdFmZWg" name="boolean">
    <localizations xmi:id="_N63UkGzuEe-HZsrcTcqjdA" name="логическое значение" locale="ru"/>
    <localizations xmi:id="_R1QGhWzuEe-HZsrcTcqjdA" locale="fr"/>
  </dataTypes>
  <dataTypes xsi:type="dm:StringType" xmi:id="_T0eGUGxsEe-N7vNLdFmZWg" name="string100" maxLength="100">
    <localizations xmi:id="_N637oWzuEe-HZsrcTcqjdA" name="строка (100)" locale="ru"/>
    <localizations xmi:id="_R1QGhmzuEe-HZsrcTcqjdA" locale="fr"/>
  </dataTypes>
  <dataTypes xsi:type="dm:StringType" xmi:id="_V5xl8GxsEe-N7vNLdFmZWg" name="string1000" maxLength="1000">
    <localizations xmi:id="_N637pGzuEe-HZsrcTcqjdA" name="строка (1000)" locale="ru"/>
    <localizations xmi:id="_R1QGh2zuEe-HZsrcTcqjdA" locale="fr"/>
  </dataTypes>
  <dataTypes xsi:type="dm:UuidType" xmi:id="_kHBHwGxsEe-N7vNLdFmZWg" name="UUID">
    <localizations xmi:id="_N64isGzuEe-HZsrcTcqjdA" name="UUID" locale="ru"/>
    <localizations xmi:id="_R1QGiGzuEe-HZsrcTcqjdA" locale="fr"/>
  </dataTypes>
  <dataTypes xsi:type="dm:NumericType" xmi:id="_RvL_YGxtEe-N7vNLdFmZWg" name="ordinal" size="4" fractionDigits="0" minInclusive="0.0">
    <localizations xmi:id="_N64is2zuEe-HZsrcTcqjdA" name="порядковый номер" locale="ru"/>
    <localizations xmi:id="_R1QGiWzuEe-HZsrcTcqjdA" locale="fr"/>
  </dataTypes>
  <dataTypes xsi:type="dm:NumericType" xmi:id="_sBlVIGxtEe-N7vNLdFmZWg" name="man-hour" size="4" fractionDigits="0" minInclusive="0.0" measurementUnit="человеко-час">
    <localizations xmi:id="_N65JwGzuEe-HZsrcTcqjdA" name="человеко-час" locale="ru"/>
    <localizations xmi:id="_R1QGimzuEe-HZsrcTcqjdA" locale="fr"/>
  </dataTypes>
  <dataTypes xsi:type="dm:StringType" xmi:id="_M8R_IGxvEe-kk4Qo5zeFBA" name="text">
    <localizations xmi:id="_N65Jw2zuEe-HZsrcTcqjdA" name="текст" locale="ru"/>
    <localizations xmi:id="_R1QGi2zuEe-HZsrcTcqjdA" locale="fr"/>
  </dataTypes>
</dm:DataModel>
