/**
* Input
* Line 1: the width L of a letter represented in ASCII art. All letters are the same width.
* 
* Line 2: the height H of a letter represented in ASCII art. All letters are the same height.
* 
* Line 3: The line of text T, composed of N ASCII characters.
* 
* Following lines: the string of characters ABCDEFGHIJKLMNOPQRSTUVWXYZ? Represented in ASCII art.
* 
* Output
* The text T in ASCII art.
* The characters a to z are shown in ASCII art by their equivalent in upper case.
* The characters that are not in the intervals [a-z] or [A-Z] will be shown as a question mark in ASCII art.
* Constraints
* 0 < L < 30
* 0 < H < 30
* 0 < N < 200
**/
import java.util.*;
import java.io.*;
import java.math.*;

 class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int letterWidth = in.nextInt();
        in.nextLine();
        int letterHeight = in.nextInt();
        in.nextLine();
        String expectedText = in.nextLine().toUpperCase();
        for (int i = 0; i < letterHeight; i++) {
            String row = in.nextLine();
            String line = "";
            for (int letterIndex = 0; letterIndex < expectedText.length(); ++letterIndex) {
                int asciiValue = expectedText.charAt(letterIndex) - 'A';
                if (asciiValue < 0 || asciiValue >= 26) { //between A and Z
                    asciiValue = 26;
                }
                line += row.substring(letterWidth * asciiValue, letterWidth * (asciiValue + 1));
            }
            System.out.println(line);
        }
    }
}
