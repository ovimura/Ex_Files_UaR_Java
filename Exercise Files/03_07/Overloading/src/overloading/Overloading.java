/*
 * This program demonstrates the concept of overloading methods
 * we will create several methods with the same name but different 
 * parameters or return types
 */
package overloading;

/**
 *
 * @author Peggy Fisher
 */
public class Overloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("The average of three integers: " + average(3,5,8));
        System.out.println("The average of three doubles: " + average(3.0,5.0,8.0));
    }

    public static double average(int x, int y, int z) {
        return (x+y+z)/3.0;
    }

    public static double average(double x, double y, double z) {
        return (x+y+z)/3;
    }
}
