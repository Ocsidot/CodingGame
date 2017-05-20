import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Initialization input
 * Line 1: the number surfaceN of points used to draw the surface of Mars.
 * Next surfaceN lines: a couple of integers landX landY providing the coordinates of a ground point. By linking all the points together in a sequential fashion, you form the surface of Mars which is composed of several segments. For the first point, landX = 0 and for the last point, landX = 6999
 * 
 * Input for one game turn
 * A single line with 7 integers: X Y hSpeed vSpeed fuel rotate power
 * X,Y are the coordinates of Mars Lander (in meters).
 * hSpeed and vSpeed are the horizontal and vertical speed of Mars Lander (in m/s). These can be negative depending on the direction of Mars Lander.
 * fuel is the remaining quantity of fuel in liters. When there is no more fuel, the power of thrusters falls to zero.
 * rotate is the angle of rotation of Mars Lander expressed in degrees.
 * power is the thrust power of the landing ship.
 * 
 * Output for one game turn
 * A single line with 2 integers: rotate power :
 * rotate is the desired rotation angle for Mars Lander. Please note that for each turn the actual value of the angle is limited to the value of the previous turn +/- 15°.
 * power is the desired thrust power. 0 = off. 4 = maximum power. Please note that for each turn the value of the actual power is limited to the value of the previous turn +/- 1.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int surfaceN = in.nextInt(); // the number of points used to draw the surface of Mars.
        for (int i = 0; i < surfaceN; i++) {
            int landX = in.nextInt(); // X coordinate of a surface point. (0 to 6999)
            int landY = in.nextInt(); // Y coordinate of a surface point. By linking all the points together in a sequential fashion, you form the surface of Mars.
        }

        // game loop
        while (true) {
            int X = in.nextInt();
            int Y = in.nextInt();
            int hSpeed = in.nextInt(); // the horizontal speed (in m/s), can be negative.
            int vSpeed = in.nextInt(); // the vertical speed (in m/s), can be negative.
            int fuel = in.nextInt(); // the quantity of remaining fuel in liters.
            int rotate = in.nextInt(); // the rotation angle in degrees (-90 to 90).
            int power = in.nextInt(); // the thrust power (0 to 4).

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            
            if (vSpeed <= -40) {
                System.out.println("0 4");
            } 
            else {
                System.out.println("0 0");
            }

            //System.out.println("-20 3"); // rotate power. rotate is the desired rotation angle. power is the desired thrust power.
        }
    }
}
