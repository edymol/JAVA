package com.deved.service;

import com.deved.main.Processes;

public class StringMethods implements Processes {
    private int lengthResult;
    private char charResult;
    private String substringResult;
    private boolean equalResult;
    private boolean equalIgnoreCaseResult;
    private int indexOfSubstringResult;
    private String replacedStringResult;
    private String[] splitStringResult;


    @Override
    public int calculateLength(String str) {
        // Use the built-in length() method to calculate the length of the string
        System.out.println("The length of the String is: " + str.length());
        return str.length();
    }

    @Override
    public char getCharAtIndex(String str, int index) {
        // Check if the index is within the valid range of the string
        if (index >= 0 && index < str.length()) {
            System.out.println("Index: " + index + " has char" + str.charAt(index));

            // Return the character at the specified index
            return str.charAt(index);
        } else {
            // Handle index out of bounds gracefully, e.g., return a default character or throw an exception
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
    }

    @Override
    public String getSubstring(String str, int beginIndex) {
        // Use the substring method to get a substring starting from the specified index
        return str.substring(beginIndex);
    }

    @Override
    public boolean areStringsEqual(String str1, String str2) {
        // Use the equals method to compare strings for equality
        if (str1.equals(str2))
            System.out.println(str1 + " and " + str2 + " are equal");

        else {
            System.out.println(str1 + " and " + str2 + " are Not equal");

        }// Use the equals method to compare strings for equality
        return str1.equals(str2);
    }

    @Override
    public boolean areStringsEqualIgnoreCase(String str1, String str2) {
        // Use the equalsIgnoreCase method to compare strings for equality, ignoring case
        return str1.equalsIgnoreCase(str2);
    }

    @Override
    public int getIndexOfSubstring(String str, String target) {
        // Use the indexOf method to find the index of the first occurrence of a substring
        return str.indexOf(target);
    }

    @Override
    public String replaceSubstring(String str, String target, String replacement) {
        // Use the replace method to replace all occurrences of the target substring with the replacement string
        return str.replace(target, replacement);
    }

    @Override
    public String[] splitString(String str, String delimiter) {
        // Use the split method to split the string into an array based on the delimiter
        return str.split(delimiter);
    }

}