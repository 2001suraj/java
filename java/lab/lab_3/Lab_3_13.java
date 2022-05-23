//          1                                                  
//         212                                                 
//        32123                                                      
//       4321234                                               
//      543212345                                              
//     65432123456                                             
//    7654321234567                                            
//     65432123456                                             
//      543212345                                              
//       4321234                                               
//        32123                                                
//         212                                                 
//          1 

package lab.lab_3;

import java.util.Scanner;

public class Lab_3_13 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = ac.nextInt();

        int i, j;

        for (i = 1; i <= n; i++) {
            for (j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (j = 1; j < i + 1; j++) {
                System.out.print((i - j) + 1);
            }
            for (j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();

        }
        for (i = n; i >= 1; i--) {
            for (j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (j = i - 1; j >= 2; j--) {
                System.out.print(j);
            }
            for (j = i - 1; j >= 1; j--) {
                System.out.print(i - j);
            }
            System.out.println();
        }

    }
}
