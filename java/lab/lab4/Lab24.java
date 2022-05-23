package lab.lab4;

public class Lab24 {
    public static String checkSubString(String str1, String str2) {
        String major = (str1.length() > str2.length()) ? str1 : str2;
        String minor = (str1.length() > str2.length()) ? str2 : str1;

        System.out.println(major.indexOf(minor));
        if (major.contains(major)) {
            return "Substring is present in the string";
        } else {
            return "Substring is  not present in the string";

        }
    }

    public static void main(String[] args) {

        String str1 = "Ramayan";
        String str2 = "Ram";
        System.out.println(checkSubString(str1, str2));
    }
}
