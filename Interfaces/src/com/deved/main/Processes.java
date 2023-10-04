package com.deved.main;

public interface Processes {
    int calculateLength(String str);
    char getCharAtIndex(String str, int index);
    String getSubstring(String str, int beginIndex);
    boolean areStringsEqual(String str1, String str2);
    boolean areStringsEqualIgnoreCase(String str1, String str2);
    int getIndexOfSubstring(String str, String target);
    String replaceSubstring(String str, String target, String replacement);
    String[] splitString(String str, String delimiter);
}
