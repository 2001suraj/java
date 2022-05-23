package fundamental.normal;

import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner aa =new Scanner(System.in);
        System.out.println("Enter the arry size");
        int ac = aa.nextInt();
        int arr []= new int[ac];
        int i,j;
        System.out.println("Enter the 5 number");
        for(i = 0;i<ac;i++){
            arr[i]=aa.nextInt();
        }
        System.out.println("before sorting ...");
        for(i=0;i<ac;i++){
            System.out.println(arr[i]+"\t");
        }
        for(i=0;i<ac;i++){
            for(j=1+i;j<ac;j++){
                if(arr[i]>arr[j]){
                    int temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        System.out.println("Element in ascending order");
            System.out.println(arr[i]);

        }
        System.out.println();
        aa.close();
    }
}
