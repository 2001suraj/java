package myclass;

import java.util.Scanner;

public class Net_lab_2_9 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        double net_amount, purchase_amount, discount;
        int number;

        System.out.println(" choose 1 for laptop  and 2 for desktop ");
        number = aa.nextInt();
        System.out.println(" Enter the actual amount : ");
        purchase_amount = aa.nextDouble();

        switch (number) {
        case 1:
            if (purchase_amount <= 25000) {
                System.out.println(" The price of laptop  is " + purchase_amount);
            } else if (purchase_amount <= 57000 && purchase_amount >= 25001) {
                discount = 5 / 100 * purchase_amount;
                net_amount = purchase_amount - discount;
                System.out.println(" The price of laptop  is " + net_amount);
            } else if (purchase_amount <= 100000 && purchase_amount > 57001) {
                discount = 7.5 / 100 * purchase_amount;
                net_amount = purchase_amount - discount;
                System.out.println(" The price of laptop  is " + net_amount);
            } else {
                discount = 10 / 100 * purchase_amount;
                net_amount = purchase_amount - discount;
                System.out.println(" The price of laptop  is " + net_amount);
            }
            break;
        case 2:
            if (purchase_amount <= 25000) {
                discount = 5 / 100 * purchase_amount;
                net_amount = purchase_amount - discount;
                System.out.println(" The price of desktop  is " + net_amount);
            } else if (purchase_amount <= 57000 && purchase_amount > 25001) {
                discount = 7.5 / 100 * purchase_amount;
                net_amount = purchase_amount - discount;
                System.out.println(" The price of desktop  is " + net_amount);
            } else if (purchase_amount <= 100000 && purchase_amount > 57001) {
                discount = 10 / 100 * purchase_amount;
                net_amount = purchase_amount - discount;
                System.out.println(" The price of desktop  is " + net_amount);
            } else {
                discount = 15 / 100 * purchase_amount;
                net_amount = purchase_amount - discount;
                System.out.println(" The price of desktop  is " + net_amount);
            }
        default:
            System.out.println("invalid entry , please enter 1 or 2 only");
        }
        aa.close();

    }
}
