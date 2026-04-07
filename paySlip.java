
import java.util.Scanner;

public class paySlip {
    public static void main(String[] args) {

        System.out.println("--------------------------------------------------");
        System.out.println("                 PAYSLIP                          ");
        System.out.println("--------------------------------------------------");
        Scanner sc = new Scanner(System.in);


        System.out.print("Employee name : ");
        String name = sc.next();

        System.out.print("Enter your salary : ");
        float salary = sc.nextFloat();

        System.out.print("Your year of Experience: ");
        byte exp = sc.nextByte();

        System.out.println("--------------------------------------------------");

        float DA = (float) (0.085 * salary);
        System.out.println("DA : " + DA);
        float TA = (float) (0.10 *  salary);
        System.out.println("TA : " + TA);
        float HRA = (float) (0.125 * salary);
        System.out.println("HRA : " + HRA);
       float PF =  (float) (0.15 * salary);
        System.out.println("PF : " + PF);

        float Bonus =  (float) ((exp>= 30) ?  (0.30 * salary): (exp>=20) ? (0.20 * salary ) :
                (exp>=10) ? (0.10 * salary) : (0.05 * salary));
        System.out.println("Bonus : " + Bonus);

        System.out.println("--------------------------------------------------");

       float totalSalary = (salary + DA + TA + HRA + PF + Bonus) ;
        System.out.println("Total Salary : " + totalSalary);
        float netSalary = (totalSalary - PF);
        System.out.println("Net Salary : " + netSalary);

        System.out.println("--------------------------------------------------");



    }
}
