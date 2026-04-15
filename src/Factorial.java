import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n = sc.nextInt();


        int factorial = 1;
        for(int i = n; i>0; i--){
            factorial *= i;
            //System.out.println(factorial);
        }
        System.out.println(factorial);
    }

}
// 3 * 2 *1
// 5 4 3 2 1
