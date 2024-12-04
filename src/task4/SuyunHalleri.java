package task4;

import java.util.Scanner;

public class SuyunHalleri {
    public static void main(String[] args) {

        Scanner read= new Scanner(System.in);
        System.out.print("Suyun sıcaklığı = ");
        int sc= read.nextInt();

        if (sc<0) System.out.println("Su katı haldedir.");
        else if (sc < 100) System.out.println("Su sıvı haldedir.");
        else System.out.println("Su gaz halindedir.");


    }
}
