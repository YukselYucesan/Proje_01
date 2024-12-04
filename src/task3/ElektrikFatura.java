package task3;

import java.util.Scanner;

public class ElektrikFatura {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Yeni tarihteki sayaç miktarı = ");
        int yeniOkuma= oku.nextInt();
        System.out.print("Eski tarihteki sayaç miktarı = ");
        int eskiOkuma= oku.nextInt();

        int elektrikTüketimi= yeniOkuma-eskiOkuma;
        float aylikFatura=0;
        float birimFiyat=0;

        if(elektrikTüketimi>=0){
            if (elektrikTüketimi<=100) birimFiyat=1.1F;
            else if (elektrikTüketimi<=200) birimFiyat=1.3F;
            else if (elektrikTüketimi<=300) birimFiyat=1.5F;
            else if (elektrikTüketimi<=400) birimFiyat=1.7F;
            else if (elektrikTüketimi<=500) birimFiyat=1.9F;
            else birimFiyat=2.3F;

            aylikFatura=birimFiyat*elektrikTüketimi;
            System.out.println("aylikFatura = " + aylikFatura);

        } else System.out.println("Hatalı Giriş");


    }
}
