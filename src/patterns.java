import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        //  Same number pattern
        System.out.println("\nPattern 1:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }

        //Increasing numbers
        System.out.println("\nPattern 2:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        //Continuous numbers
        System.out.println("\nPattern 3:");
        int num = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        //Reverse triangle
        System.out.println("\nPattern 4:");
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }

        // Reverse decreasing
        System.out.println("\nPattern 5:");
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }

        //Pyramid
        System.out.println("\nPattern 6:");
        for(int i=1;i<=n;i++){

            for(int j=i;j<n;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print(j);
            }

            for(int j=i-1;j>=1;j--){
                System.out.print(j);
            }

            System.out.println();
        }

        // Special pattern
        System.out.println("\nPattern 7:");
        for(int i=1;i<=n;i++){

            for(int j=n;j>=n-i+1;j--){
                System.out.print(j);
            }

            for(int j=n-i+2;j<=n;j++){
                System.out.print(j);
            }

            System.out.println();
        }

        //Shifted numbers
        System.out.println("\nPattern 8:");
        for(int i=1;i<=n;i++){
            for(int j=n-i+1;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        //Double side pattern
        System.out.println("\nPattern 9:");
        for(int i=1;i<=n;i++){

            for(int j=i;j<=n;j++){
                System.out.print(j);
            }

            for(int j=1;j<=2*(i-1);j++){
                System.out.print(" ");
            }

            for(int j=n;j>=i;j--){
                System.out.print(j);
            }

            System.out.println();
        }

        sc.close();
    }
}