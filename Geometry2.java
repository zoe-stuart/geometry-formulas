
/**
 * Write a description of class Geometry here.
 * 
 * @author (your name) 
 * @version August 25, 2014
 */

public class Geometry {

    /**
     * Calculates the area of a paralellogram.
     *
     * @param b  base
     * @param h  height
     * @return   area 
     */
    public static double areaOfParallelogram(double b, double h)
    {
        double a = b * h;
        
        return a;
    }
    
    /**
     * Calculates the circumference of a circle.
     * 
     * @param r     radius of circle
     * @return      circumference
     */
    public static double circumferenceOfCircle(double r)
    {
        double c = 2 * Math.PI * r; 
        
        return c;
    }
    
    public static void main(String[] args) 
    {
        System.out.println( areaOfParallelogram(15.0, 7.8) );
        System.out.println( areaOfParallelogram(6.0, 19.2) );

        System.out.println( circumferenceOfCircle(5.0) );

        // You try. Write and test functions that determine the ...
     
        // 1. area of a trapezoid
        
        // 2. volume of a sphere
        
        // 3. surface area of a cone
        
        // 4. length of hypotenuse of a triangle given both legs
        
        // 5. slope of a line that contains the points (x1, y1) and (x2, y2)
        
        // 6. distance between two points (x1, y1) and (x2, y2)
        
        // 7. area of a triangle given lengths of 3 sides. (use Heron's formula.)
        
        // 8. for each of your functions, include javadoc style comments. then create the html documentation

    }

}
