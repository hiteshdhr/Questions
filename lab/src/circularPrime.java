import java.util.Scanner;

public class circularPrime {

    static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String s = String.valueOf(n);

        boolean isCircular = true;

        for(int i=0;i<s.length();i++){
            int num = Integer.parseInt(s);
            if(!isPrime(num)){
                isCircular = false;
                break;
            }
            s = s.substring(1) + s.charAt(0);
        }

        if(isCircular)
            System.out.println("Circular Prime");
        else
            System.out.println("Not Circular Prime");
    }
}
