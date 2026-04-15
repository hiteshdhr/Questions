import java.util.Scanner;

public class Automorphicnumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int square = n * n;
        int temp = n;

        boolean isAuto = true;

        while(temp > 0){
            if(temp % 10 != square % 10){
                isAuto = false;
                break;
            }
            temp /= 10;
            square /= 10;
        }

        if(isAuto)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not Automorphic");
    }
}