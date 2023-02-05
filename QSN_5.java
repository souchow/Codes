public class QSN_5 {
    public static void main(String[] args) {
        int row = 5;
        for(int i=0; i<row; i++){
            for(int space = row; space>i; space--){
                System.out.print(" ");
            }
            int number = 1;
            for(int j=0; j<=i; j++){
                System.out.print(number + " ");
                number = number * (i-j)/(j+1);
            }
            System.out.println(" ");
        }
    }
}
