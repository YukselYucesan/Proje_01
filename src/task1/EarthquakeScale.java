package task1;

import java.util.Scanner;

public class EarthquakeScale {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("Deprem büyüklüğü (Earthquake magnitude) = ");
        double magnitude = read.nextDouble();

        if (0 <= magnitude && magnitude < 2.0) System.out.println("Micro - Mikro");
        else if (0 <= magnitude && magnitude < 3.0) System.out.println("Very minor - Çok küçük");
        else if (0 <= magnitude && magnitude < 4.0) System.out.println("Minor - Küçük");
        else if (0 <= magnitude && magnitude < 5.0) System.out.println("Light - Hafif");
        else if (0 <= magnitude && magnitude < 6.0) System.out.println("Moderate - Orta");
        else if (0 <= magnitude && magnitude < 7.0) System.out.println("Strong - Ağır");
        else if (0 <= magnitude && magnitude < 8.0) System.out.println("Major - Büyük");
        else if (0 <= magnitude && magnitude < 10.0) System.out.println("Great - Çok Büyük");
        else if (10.0 <= magnitude && magnitude <= 15.0) System.out.println("Meteoric - Meteorik");
        else System.out.println("Incorrect entry");

    }
}
