package task2;

import java.util.Scanner;

public class UcgenSiniflandirma {
    public static void main(String[] args) {

        Scanner read= new Scanner(System.in);
        System.out.print("1. kenar uzunluğu giriniz = ");
        int kenar1= read.nextInt();

        System.out.print("2. kenar uzunluğu giriniz = ");
        int kenar2= read.nextInt();

        System.out.print("3. kenar uzunluğu giriniz = ");
        int kenar3= read.nextInt();

        if (kenar1<(kenar2+kenar3) && kenar1>(kenar2-kenar3)){
            if (kenar1==kenar2 && kenar2==kenar3) System.out.println("Geçerli ve eşkenar üçgen");
            else if (kenar1 == kenar2 || kenar2 == kenar3 || kenar1 == kenar3) System.out.println("Geçerli ve ikizkenar üçgen");
            else if (kenar1!=kenar2 && kenar2!=kenar3 && kenar1!=kenar3) System.out.println("Geçerli ve çeşitkenar üçgen");
        }
        else System.out.println("Geçersiz üçgen");


    }
}
