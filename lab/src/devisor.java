import java.util.Scanner;

public class devisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter two numbers : ");

        int n1= sc.nextInt();
        int n2= sc.nextInt();

        int n=1;


        for(int i =1; i<=Math.min(n1,n2); i++) {
          if(n1%i==0 && n2%i==0){
              n = i;
          }
        }
        System.out.println("Greatest Common Divisor is = " + n);

    }
}
