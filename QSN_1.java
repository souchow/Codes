package Assignment_1;

import java.util.Scanner;

public class QSN_1 {
    public void CheckPassFail(int mark){
        if(mark >= 50 && mark <= 100){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
        System.out.println("DONE");
    }
    public static void main(String[] args) {
        QSN_1 qs = new QSN_1();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your mark : ");
        int mark = input.nextInt();
        qs.CheckPassFail(mark);

    }
}
