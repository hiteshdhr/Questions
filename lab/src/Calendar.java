
import java.util.*;

class Caledar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month and year: ");
        int month = sc.nextInt();
        int year = sc.nextInt();

        Calendar cal = new GregorianCalendar(year, month-1, 1);

        int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        int start = cal.get(Calendar.DAY_OF_WEEK);

        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for(int i=1;i<start;i++){
            System.out.print("    ");
        }

        for(int i=1;i<=days;i++){
            System.out.printf("%4d", i);
            if((i + start -1)%7 == 0)
                System.out.println();
        }
    }
}
