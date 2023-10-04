package com.deved.controller;

import com.deved.service.GetIntCase;
import com.deved.service.StringMethods;

import java.util.Scanner;

public class SwitchCases {
    StringMethods methods = new StringMethods();
    GetIntCase ic = new GetIntCase();

    public void processSwitch() {
        int input = ic.getIntValue(); // Call getIntValue() to get the integer input

        switch (input) {
            case 1 -> {
                System.out.println("You picked the length method");
                System.out.println("Give me the string");
                Scanner scan1 = new Scanner(System.in);
                String str = scan1.nextLine();
                int length = methods.calculateLength(str);
            }
            // Do something with the 'length' value
            case 2 -> {
                System.out.println("You have picked Char Index");
                System.out.println("Give me the string");
                Scanner scan2 = new Scanner(System.in);
                String str1 = scan2.nextLine();
                System.out.println("Give me the location of the char");
                Scanner pos = new Scanner(System.in);
                int position = pos.nextInt();
                char charAtIndex = methods.getCharAtIndex(str1, position);
            }
            // Do something with the 'charAtIndex' value
            case 3 -> {
                System.out.println("You picked the getSubstring method");
                System.out.println("Give me the string");
                Scanner scan3 = new Scanner(System.in);
                String str2 = scan3.nextLine();
                System.out.println("Give me the begin index");
                int beginIndex = scan3.nextInt();
                String substring = methods.getSubstring(str2, beginIndex);
            }
            // Do something with the 'substring' value
            case 4 -> {
                System.out.println("You picked the areStringsEqual method");
                System.out.println("Give me the first string");
                Scanner scan4 = new Scanner(System.in);
                String str3 = scan4.nextLine();
                System.out.println("Give me the second string");
                String str4 = scan4.nextLine();
                boolean areEqual = methods.areStringsEqual(str3, str4);
            }
            // Do something with the 'areEqual' value
            case 5 -> {
                System.out.println("You picked the areStringsEqualIgnoreCase method");
                System.out.println("Give me the first string");
                Scanner scan5 = new Scanner(System.in);
                String str5 = scan5.nextLine();
                System.out.println("Give me the second string");
                String str6 = scan5.nextLine();
                boolean areEqualIgnoreCase = methods.areStringsEqualIgnoreCase(str5, str6);
            }
            // Do something with the 'areEqualIgnoreCase' value
            case 6 -> {
                System.out.println("You picked the getIndexOfSubstring method");
                System.out.println("Give me the string");
                Scanner scan6 = new Scanner(System.in);
                String str7 = scan6.nextLine();
                System.out.println("Give me the target substring");
                String target = scan6.nextLine();
                int indexOfSubstring = methods.getIndexOfSubstring(str7, target);
            }
            // Do something with the 'indexOfSubstring' value
            case 7 -> {
                System.out.println("You picked the replaceSubstring method");
                System.out.println("Give me the string");
                Scanner scan7 = new Scanner(System.in);
                String str8 = scan7.nextLine();
                System.out.println("Give me the target substring");
                String target2 = scan7.nextLine();
                System.out.println("Give me the replacement string");
                String replacement = scan7.nextLine();
                String replacedString = methods.replaceSubstring(str8, target2, replacement);
            }
            // Do something with the 'replacedString' value
            case 8 -> {
                System.out.println("You picked the splitString method");
                System.out.println("Give me the string");
                Scanner scan8 = new Scanner(System.in);
                String str9 = scan8.nextLine();
                System.out.println("Give me the delimiter (\", ; : | - _ . \\t ' /\"\n) ");
                String delimiter = scan8.nextLine();
                String[] splitArray = methods.splitString(str9, delimiter);
            }
            // Do something with the 'splitArray' value
            default -> {
            }
            // Handle the default case
        }
    }
}