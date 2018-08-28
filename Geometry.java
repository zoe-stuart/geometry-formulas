/**
 * Here are some useful Geometry formulas to demonstrate how functions can return values.
 * Also look at the Java Docs.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Geometry 
{
    /**
     * Calculates the area of a parallelogram.
     *
     * @param b  length of base of parallelogram
     * @param h  height of the parallelogram
     * @return   area of the parallelogram
     */
    public static double parallelogramArea(double length, double width) 
    {
        return length * width;
    }
    
    /**
     * Calculates the area of a trapezoid.
     *
     * @param a  length of base 1 of trapezoid
     * @param b  length of base 2 of trapezoid
     * @param h  height of trapezoid
     * @return   area of the parallelogram
     */
    public static double trapezoidArea(double a, double b, double h) 
    {
        return (a + b) / 2 * h;
    }
    
    /**
     * Calculates the volume of a rectangular prism.
     *
     * @param l  length of rectangular prism
     * @param w  width of rectangular prism
     * @param h  height of rectangular prism
     * @return   volume of the rectangular prism
     */
    public static double rectangularPrismArea(double l, double w, double h) 
    {
        return l * w * h;
    }
    
    /**
     * Calculates the volume of a cone.
     *
     * @param r  radius of base
     * @param h  height of cone
     * @return   volume of the cone
     */
    public static double coneArea(double r, double h) 
    {
        return Math.PI * Math.pow(r, 2) * h / 3;
    }
    
    /**
     * Calculates the surace area of a rectangular prism.
     *
     * @param l  length of rectangular prism
     * @param w  width of rectangular prism
     * @param h  height of rectangular prism
     * @return   surface area of the rectangular prism
     */
    public static double rectangularPrismSA(double l, double w, double h) 
    {
        return 2 * ((w * l) + (h * l) + (h * w));
    }
    
    /**
     * Calculates the surace area of a sphere.
     *
     * @param r  radius of sphere
     * @return   surace area of the sphere
     */
    public static double sphereSA(double r) 
    {
        return 4 * Math.PI * Math.pow(r, 2);
    }
    
    /**
     * Calculates the hypotenuse of a right triangle, when given the two legs.
     *
     * @param a  first leg
     * @param b  second leg
     * @return   hypotenuse of the triangle
     */
    public static double triangleHypotenuse(double a, double b) 
    {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
    
    /**
     * Calculates the distance between two points.
     *
     * @param x1  x coordinate of first point
     * @param y1  y coordinate of first point
     * @param x2  x coordinate of second point
     * @param y2  y coordinate of second point
     * @return    distance between the points
     */
    public static double distance(double x1, double y1, double x2, double y2) 
    {
        double diffX = x2 - x1;
        double diffY = y2 - y1;
        
        return Math.sqrt(Math.pow(diffX, 2) + Math.pow(diffY, 2));
    }
    
    /**
     * Calculates the slope between two points.
     *
     * @param x1  x coordinate of first point
     * @param y1  y coordinate of first point
     * @param x2  x coordinate of second point
     * @param y2  y coordinate of second point
     * @return    slope between the points
     */
    public static double slope(double x1, double y1, double x2, double y2) 
    {
        double diffX = x2 - x1;
        double diffY = y2 - y1;
        
        return diffY - diffX;
    }
    
    /**
     * Calculates the area of a triangle, given the side lengths.
     *
     * @param a  length of side 1
     * @param b  length of side 2
     * @param c  length of side 3
     * @return   area of the triangle
     */
    public static double triangleAreaABC(double a, double b, double c) 
    {
        double s = (a + b + c) / 2;
        
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    
    /**
     * Calculates the area of a triangle, given base and height.
     *
     * @param b  length of base of triangle
     * @param h  height of the triangle
     * @return   area of the triangle
     */
    public static double triangleAreaBH(double base, double height) 
    {
        double area = base * height / 2.0;
        
        return area;
    }
    
    /**
     * Calculates the volume of a sphere.
     *
     * @param r  radius of sphere
     * @return   volume of the sphere
     */
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    public static void main(String[] args) 
    {
        double ta1 = triangleAreaBH(4.2, 8.1);
        double ta2 = triangleAreaBH(3.0, 123.157);
        
        System.out.println(ta1);
        System.out.println(ta2);
        
        double ra1 = parallelogramArea(5.2, 9.3);
        System.out.println(ra1);
    }
}
