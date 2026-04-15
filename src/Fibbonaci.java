import java.util.Scanner;

public class Fibbonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms :");
        int n = sc.nextInt();

        int first = 1;
        int second = 1;
        System.out.print("The number of fibbonaci series upto "+ n + "term is : ");

        for(int i=1; i<=n; i++){
            System.out.print(first + " " );
            int nextTerm = first + second;
            first = second;
            second = nextTerm;
        }
    }


}
