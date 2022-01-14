/*
 * This program is designed to calculate the exterior surface area of a house
 */
package simplecalculation;

import java.util.Scanner;

/**
 *
 * @author Peggy Fisher
 */
public class SimpleCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double length, width, height;
        int num_windows;
        double size_windows;
        int num_doors;
        double size_doors;
        double total_area;

        Scanner in = new Scanner(System.in);

        System.out.println("Wellcome to Simple Calculation challenge!");
        System.out.println();
        System.out.println("Enter the length of the house:");
        length = in.nextDouble();
        System.out.println("Enter the width of the house:");
        width = in.nextDouble();
        System.out.println("Enter the height of the house:");
        height = in.nextDouble();
        System.out.println("Enter the number of the windows:");
        num_windows = in.nextInt();
        System.out.println("Enter the size of the windows:");
        size_windows = in.nextDouble();
        System.out.println("Enter the number of the doors:");
        num_doors = in.nextInt();
        System.out.println("Enter the size of the door:");
        size_doors = in.nextDouble();

        double sides = 2*(length*height);
        double front_back = 2*(width*height);
        double w_area = num_windows*size_windows;
        double d_area = num_doors*size_doors;
        total_area = sides + front_back - w_area - d_area;

        System.out.println("\n\nThe total surface are to be painted is:" + total_area);
    }
    
}
