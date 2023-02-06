package assignment3d4;

import java.util.Scanner;


public class ReverseString {
    public static String reverseUsingRecursion(String str){ //Using Recursion
        if(str.length() == 0){
            return "";
        }
        return str.charAt(str.length()-1) + reverseUsingRecursion(str.substring(0, str.length()-1));
    }

    public static String reverseUsingStringBuilderClass(String str){ //Using StringBuilder Class
        StringBuilder sb = new StringBuilder(str);
        StringBuilder result =  sb.reverse();
        return result.toString();
    }
    public static String reverseUsingStringBufferClass(String str){ //Using StringBuffer Class
        StringBuffer sb = new StringBuffer(str);
        StringBuffer result =  sb.reverse();
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String to Reverse : ");
        String str = input.nextLine();
        System.out.println(reverseUsingRecursion(str));
        System.out.println(reverseUsingStringBuilderClass(str));
        System.out.println(reverseUsingStringBufferClass(str));
    }
}
