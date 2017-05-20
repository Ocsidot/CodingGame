import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {
    /**
    * As long as the new bit is the same as the previous bit, output a "0".
    * Otherwise (if the new bit differs from the previous bit) end the sequence with " ". 
    * Then output a "0 0" or "00 0" depending on the new bit (it already includes the first counting "0" for the new bit).
    **/
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        char[] MESSAGE = in.nextLine().toCharArray();

        //Convert char to bit value
        boolean previoutBit = (MESSAGE[0] & 0x40) != 0;
        System.out.print(previoutBit ? "0 " : "00 ");
        
        for (char B : MESSAGE)
        {
            for (char bm = 0x40; bm != 0; bm >>= 1)
            {
                boolean bit = (B & bm) != 0;
                System.out.print((bit == previoutBit) ? "0"
                                               : bit ? " 0 0"
                                                     : " 00 0");
                previoutBit = bit;
            }
        }
    }
}
