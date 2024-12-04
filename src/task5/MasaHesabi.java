package task5;

import java.util.Scanner;

public class MasaHesabi {
    public static void main(String[] args) {

        Scanner read= new Scanner(System.in);
        System.out.print("Sabit Maaş = ");
        float sabitMaas = read.nextFloat();
        System.out.print("Satış Kazancı = ");
        float satisKazanci = read.nextFloat();
        System.out.print("Performans Seviyesi = ");
        float performanSeviyesi= read.nextFloat();


        float primOranı=0;
        
        if (sabitMaas > performanSeviyesi) {
            primOranı = 0.10F;
        } else {
            primOranı = 0.05F;
        }

        float prim= satisKazanci * primOranı;
        float toplamMaas=satisKazanci + prim;

        System.out.println("toplamMaas = " + toplamMaas);

    }
}
