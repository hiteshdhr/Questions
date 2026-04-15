import java.util.Scanner;

class spyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0, prod = 1;

        while(n > 0){
            int d = n % 10;
            sum += d;
            prod *= d;
            n /= 10;
        }

        if(sum == prod)
            System.out.println("Spy Number");
        else
            System.out.println("Not Spy");
    }
}
