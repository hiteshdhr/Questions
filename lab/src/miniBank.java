import java.util.Scanner;

public class miniBank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 0;

        while(true){
            System.out.println("\n1.Deposit 2.Withdraw 3.Check Balance 4.Exit");
            int choice = sc.nextInt();

            if(choice == 1){
                int amt = sc.nextInt();
                balance += amt;
            }
            else if(choice == 2){
                int amt = sc.nextInt();
                if(amt <= balance)
                    balance -= amt;
                else
                    System.out.println("Insufficient balance");
            }
            else if(choice == 3){
                System.out.println("Balance: " + balance);
            }
            else{
                break;
            }
        }
    }
}
