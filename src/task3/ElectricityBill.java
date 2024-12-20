package task3;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {

        Scanner read=new Scanner(System.in);
        System.out.print("Reading amount on new date = ");
        int newReading = read.nextInt();
        System.out.print("Reading amount on old date= ");
        int oldReading = read.nextInt();

        int electricityConsumption = newReading - oldReading;
        float monthlyInvoice =0;
        float unitPrice =0;

        if(electricityConsumption >=0){
            if (electricityConsumption <=100) unitPrice =1.1F;
            else if (electricityConsumption <=200) unitPrice =1.3F;
            else if (electricityConsumption <=300) unitPrice =1.5F;
            else if (electricityConsumption <=400) unitPrice =1.7F;
            else if (electricityConsumption <=500) unitPrice =1.9F;
            else unitPrice =2.3F;

            monthlyInvoice = unitPrice * electricityConsumption;
            System.out.println("Unit Price = " + monthlyInvoice);

        } else System.out.println("Incorrect Entry");

    }
}
