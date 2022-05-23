package lab.lab2;

public class Lab_sheet2_11 {
    public static void main(String[] args) {
        int [] array = {15,2,8};
        System.out.println("  element in orginal order");
        for (int i =0 ; i < array.length;i++){
            System.out.println(array[i] + " ");
        }
        
        for (int i =0 ; i < array.length ;i++){
            for (int j = i+1; j < array.length;j++){
                if (array[i]> array[j]){
                    int a = array[i];
                    array[i] = array[j];
                    array[j] = a;

                }
            }
        }
        System.out.println(" Element in ascending order");
        for (int i = 0; i < array.length;i++){
            System.out.println(array[i]+ "");
        }
    }
}
