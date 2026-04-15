import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

         int table =10;
        for(int i=1; i<=table; i++){
            int product = n * i;
            System.out.println("THE table of n is : " + product);
        }
      //  System.out.println("THE table of n is : " + product);
    }
}
//table ma ho ye rha hai ki- ek n number ko numbers of time multiply kr rhe hai.. jisme max kr skte hai 10 ki limit tk ..\
// 2 ki table krni hai toh . 2*1 = 2 , 2 + 2, 2 + 2 + 2

