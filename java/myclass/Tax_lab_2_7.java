package myclass;

import java.util.Scanner;

public class Tax_lab_2_7 {
    public static void main(String[] args) {
        double tax_amount, total_tax, initial_tax;
        Scanner aa = new Scanner(System.in);
        System.out.println("Enter the Total annual income ");
        tax_amount = aa.nextDouble();

        if (tax_amount <= 100000) {
            System.out.println("No tax");
            System.out.println("The annual income is " + tax_amount);

        }
        else if (tax_amount >= 100000 && tax_amount <=150000){
            total_tax = tax_amount * 10 /100;
            System.out.println(" The total tax is " +  total_tax);
        }
        else if (tax_amount >= 150000 && tax_amount <=250000){
            initial_tax = tax_amount * 20 /100;
            total_tax = initial_tax +5000;
            System.out.println(" The total tax is " +  total_tax);
        }
        else{
            initial_tax = tax_amount * 30 /100;
            total_tax = initial_tax + 25000;
            System.out.println(" The total tax is " + total_tax);
        }
        aa.close();
        
    }
}
