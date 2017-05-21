/**
* Input
* Line 1: N, the number of temperatures to analyze
* 
* Line 2: A string with the N temperatures expressed as integers ranging from -273 to 5526
* 
* Output
* Display 0 (zero) if no temperatures are provided. Otherwise, display the temperature closest to 0.
* Constraints
* 0 ≤ N < 10000
**/
import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        in.nextLine();
        String temps = in.nextLine(); // the n temperatures expressed as integers ranging from -273 to 5526
        
        if(n == 0){
            System.out.println(0);
        } else {
            int closest = Integer.MAX_VALUE;
            String[] tempsArray = temps.split(" ");
            for(int i = 0; i<tempsArray.length;i++){
                int cur = Integer.parseInt(tempsArray[i]);
                if(Math.abs(cur) < Math.abs(closest)){
                  closest = cur;   
                }
                if(Math.abs(cur) == Math.abs(closest)){
                    closest = Math.max(closest,cur);
                }
            }
            System.out.println(closest);
        }
    }
}
