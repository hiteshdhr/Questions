import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word you wanted to reverse: ");
      String n = sc.next();

      char[] arr = n.toCharArray();
      int l = arr.length;

         int median = l / 2;


         for(int i =0; i<median; i++){
             char temp = arr[i];
             arr[i] = arr[l-1-i];
             arr[l-1-i] = temp;
         }
           String reverse = new String(arr);
        System.out.print(reverse);
   sc.close();
    }
}
// name ko reverse jrna hai .. jiska matlab ye hai ki hello lo olleh hitesh hsetih