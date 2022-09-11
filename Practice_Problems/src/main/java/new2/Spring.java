package new2.new2;
import java.util.Scanner;
public class Spring {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a month");
            int month = sc.nextInt();
            System.out.println("Enter date in a month");
            int day = sc.nextInt();
            if (month == 3 && day >= 20 && day <= 31 || month == 4 && day >= 1 && day <= 30 || month == 5 && day >= 1 && day <= 31 || month == 6 && day >= 1 && day <= 20) {
                System.out.println("its a Spring month for given date");
            } else {
                System.out.println("No its not a spring month for given date");
            }
        }
    }

