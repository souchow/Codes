package assignment3d4;

import java.util.Scanner;

public class ReplaceString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String S : ");
        String S = input.nextLine();
        System.out.println("Enter a String S1 : ");
        String S1 = input.nextLine();
        System.out.println("Enter a String S2 : ");
        String S2 = input.nextLine();

        String replacedString = S.replaceAll(S1, S2);
        System.out.println("Replaced String is  : " + replacedString);
    }
}
