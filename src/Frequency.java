import java.util.Scanner;

public class Frequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int[] freq = new int[10];

        while(n > 0){
            int digit = n % 10;
            freq[digit]++;
            n /= 10;
        }

        for(int i=0;i<10;i++){
            if(freq[i] > 0){
                System.out.println(i + " -> " + freq[i]);
            }
        }
    }
}
