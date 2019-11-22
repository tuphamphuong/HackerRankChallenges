package com.tupp.thirty_day_of_code;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by Tu Pham Phuong - phamptu@gmail.com on 11/22/19.
 */
public class Day0HelloWorld {
    public static void main(String[] args) {
        // Create a Scanner object to read input from stdin.
        Scanner scan = new Scanner(System.in);

        // Read a full line of input from stdin and save it to our variable, inputString.
        String inputString = scan.nextLine();

        // Close the scanner object, because we've finished reading
        // all of the input from stdin needed for this challenge.
        scan.close();

        // Print a string literal saying "Hello, World." to stdout.
        System.out.println("Hello, World.");

        // TODO: Write a line of code here that prints the contents of inputString to stdout.
        System.out.println(inputString);
    }
}
