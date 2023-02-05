import java.util.Scanner;

public class QSN_4 {
    public static boolean isPrime(int num){
        if(num < 2){
            return false;
        }
        for(int i=2; i < num/2; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
    public void checkEvenOddPrime(int number){
        if(number % 2 == 0){
            System.out.println("Even Number");
        }
        else if(isPrime(number)){
            System.out.println("Odd Prime");
        }
        else{
            System.out.println("Odd non prime");
        }
    }
    public static void main(String[] args) {
        QSN_4 qs = new QSN_4();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = input.nextInt();
        qs.checkEvenOddPrime(number);
    }
}
