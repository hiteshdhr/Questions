import java.util.Scanner;

public class rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.print("Enter number of rotations: ");
        int r = sc.nextInt();


        int temp = num;
        int count = 0;
        while (temp > 0) {
            temp /= 10;
            count++;
        }


        r = r % count;


        for (int i = 1; i <= r; i++) {
            int lastDigit = num % 10;          // Aakhri digit nikala
            int remainingPart = num / 10;      // Baaki bacha number


            num = (int) (lastDigit * Math.pow(10, count - 1) + remainingPart);

            System.out.println("After rotation " + i + ": " + num);
        }

        System.out.println("Final Result: " + num);
    }
}