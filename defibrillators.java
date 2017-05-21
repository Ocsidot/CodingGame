/**
* Input
* Line 1: User's longitude (in degrees)

* Line 2: User's latitude (in degrees)

* Line 3: The number N of defibrillators located in the streets of Montpellier

* N next lines: a description of each defibrillator

* Output
* The name of the defibrillator located the closest to the user’s position.
* Constraints
* 0 < N < 10000
**/
import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String LON = in.next();
        String LAT = in.next();
        int N = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        
        double minDist = Double.MAX_VALUE;
        String address = "";
        for (int i = 0; i < N; i++) {
            String DEFIB = in.nextLine();
            String[] infos = DEFIB.split(";");
            double dist = getDistanceBetweenPoints(LON, LAT, infos[4], infos[5]);
            
            if(dist == 0){
                System.out.println(infos[1]);
                return;
            }
            if(dist < minDist)
            {
                minDist = dist;
                address = infos[1];
            }
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(address);
    }
    
    public static Double getDistanceBetweenPoints(double longitudeA, double latitudeA,
        double longitudeB, double latitudeB)
    {
        double x = (longitudeB - longitudeA) * Math.cos((latitudeA+latitudeB)/2);
        double y = latitudeB - latitudeA;
        double distance  = Math.sqrt(x*x + y*y) * 6371;
        return distance;
    }
    
    public static Double getDistanceBetweenPoints(String longA, String latA, String longB, String latB)
    {
        return getDistanceBetweenPoints(StringToDouble(longA), StringToDouble(latA), StringToDouble(longB), StringToDouble(latB));
    }
    
    public static Double StringToDouble(String value)
    {
     return Double.parseDouble(value.replace(',', '.'));  
    }
}
