package com.deved.service;

import java.util.Scanner;

public class GetIntCase {
    public int getIntValue() {
        System.out.println("Please select from 1 - 8  for which method you would like to perform");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}
