package task2;

import java.util.Scanner;

public class TriangleClassification {
    public static void main(String[] args) {

        Scanner read= new Scanner(System.in);
        System.out.print("1. Enter side length = ");
        int side1 = read.nextInt();

        System.out.print("2. Enter side length = ");
        int side2 = read.nextInt();

        System.out.print("3. Enter side length = ");
        int side3 = read.nextInt();

        if (side1 <(side2 + side3) && side1 >(side2 - side3)){
            if (side1 == side2 && side2 == side3) System.out.println("Valid and equilateral triangle.");
            else if (side1 == side2 || side2 == side3 || side1 == side3) System.out.println("Valid and isosceles triangle.");
            else if (side1 != side2 && side2 != side3 && side1 != side3) System.out.println("Valid and scalene triangle.");
        }
        else System.out.println("Invalid triangle");

    }
}
