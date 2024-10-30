package org.example.dm.design;

public class StringHelpers {

    private StringHelpers() {
        // Don't instantiate the helper class
    }

    public static boolean isNotBlank(String str) {
        return str != null && !str.isBlank();
    }

    public static String[] tokenizeNaturalCase(String str) {
        return str == null ? new String[0] : str.split(" ");
    }

    public static String toCamelCase(String[] strs) {
        var parts = strs.clone();
        for (int i = 1; i < parts.length; i++) {
            parts[i] = toUpperFirst(parts[i]);
        }
        return String.join("", parts);
    }

    public static String toUpperCamelCase(String[] strs) {
        var parts = strs.clone();
        for (int i = 0; i < parts.length; i++) {
            parts[i] = toUpperFirst(parts[i]);
        }
        return String.join("", parts);
    }

    public static String toUpperFirst(String str) {
        return str == null || str.isEmpty() ? str : str.substring(0, 1).toUpperCase() + str.substring(1);
    }

}
