import java.util.Scanner;

public class QSN_2 {
    public void PrintDayInWord(int dayNo){ //Using Switch-Case Statement.
        switch(dayNo){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter a valid day number (Between 0-6).");
                break;
        }
    }

    public void PrintDayInWord2(int dayNo){ //Using If-Else Statement
        if(dayNo == 0){
            System.out.println("Sunday");
        }
        else if(dayNo == 1){
            System.out.println("Monday");
        }
        else if(dayNo == 2){
            System.out.println("Tuesday");
        }
        else if(dayNo == 3){
            System.out.println("Wednesday");
        }
        else if(dayNo == 4){
            System.out.println("Thursday");
        }
        else if(dayNo == 5){
            System.out.println("Friday");
        }
        else if(dayNo == 6){
            System.out.println("Saturday");
        }
        else{
            System.out.println("Enter a valid day number (Between 0-6).");
        }
    }
    public static void main(String[] args) {
        QSN_2 qs = new QSN_2(); //Creating Object of class QSN_2
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no. of day : ");
        int dayNo = input.nextInt();
        qs.PrintDayInWord(dayNo); //Calling method for Switch-Case Statement
        qs.PrintDayInWord2(dayNo); //Calling method for If-Else Statement
    }
}
