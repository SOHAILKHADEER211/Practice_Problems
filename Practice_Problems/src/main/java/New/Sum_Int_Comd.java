package New;

import java.util.Scanner;
public class Sum_Int_Comd {
    public static void main(String args[]) {
        int sum = 25;
        for (int i = 0; i < args.length; i++) {
            int n = Integer.parseInt(args[i]);
            sum = sum + n;
        }
        System.out.println("Sum of command line args "  +sum);
    }
}
