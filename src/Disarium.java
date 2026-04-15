import java.util.Scanner;

public class Disarium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String s = String.valueOf(n);
        int sum = 0;

        for(int i=0;i<s.length();i++){
            int digit = s.charAt(i) - '0';
            sum += Math.pow(digit, i+1);
        }

        if(sum == n)
            System.out.println("Disarium Number");
        else
            System.out.println("Not Disarium");
    }
}