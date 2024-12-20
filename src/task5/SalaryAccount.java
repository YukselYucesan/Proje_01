package task5;

import java.util.Scanner;

public class SalaryAccount {
    public static void main(String[] args) {

        Scanner read= new Scanner(System.in);
        System.out.print("Fixed Salary = ");
        float fixedSalary = read.nextFloat();
        System.out.print("Sales Profit = ");
        float salesProfit = read.nextFloat();
        System.out.print("Performance Level = ");
        float performanceLevel = read.nextFloat();

        float PremiumRate =0;
        
        if (fixedSalary > performanceLevel) {
            PremiumRate = 0.10F;
        } else {
            PremiumRate = 0.05F;
        }

        float premium= salesProfit * PremiumRate;
        float totalSalary = salesProfit + premium;

        System.out.println("Total Salary = " + totalSalary);

    }
}
