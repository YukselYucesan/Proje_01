package task4;

import java.util.Scanner;

public class StatesOfWater {
    public static void main(String[] args) {

        Scanner read= new Scanner(System.in);
        System.out.print("Water temperature = ");
        int sc= read.nextInt();

        if (sc<0) System.out.println("Water is in solid form.");
        else if (sc < 100) System.out.println("Water is in liquid form.");
        else System.out.println("Water is in gaseous form.");

    }
}
