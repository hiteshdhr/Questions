import java.util.Scanner;

class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//Diamond Pattern
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++) System.out.print(" ");
            for(int j=1;j<=2*i-1;j++) System.out.print("*");
            System.out.println();
        }

        for(int i=n-1;i>=1;i--){
            for(int j=n;j>i;j--) System.out.print(" ");
            for(int j=1;j<=2*i-1;j++) System.out.print("*");
            System.out.println();
        }


        //Palindromic Pyramid
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++) System.out.print(" ");

            for(int j=1;j<=i;j++) System.out.print(j);
            for(int j=i-1;j>=1;j--) System.out.print(j);

            System.out.println();
        }


        int num = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}