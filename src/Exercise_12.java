//Hexagon area

import java.util.Scanner;

import static java.lang.StrictMath.tan;

public class Exercise_12 {

    public static void main(String[] args) {

        double s;
        // hexagon is the shape that has six sides

        Scanner input = new Scanner( System.in );
        System.out.println( "The length of a side of hexagon in inch: " );
        s = input.nextDouble();


         int allside = 6;
         double pie = 3.14159;

        //double A = 6* (s ^ 2);
        // the general formula of the area of hexagon;

         double AreaOfHexagon = (6 * (s * s)) / (4 * tan( pie / 6 ));

         System.out.println( "AreaOfHexagon: " + AreaOfHexagon);

    }
}
