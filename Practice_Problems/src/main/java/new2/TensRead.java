package new2.new2;

import java.util.Scanner;

public class TensRead {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 10 100 1000 ");
        int num = sc.nextInt();
        if (num == 1) {
            System.out.println("Entered UNIT'S");
        } else if (num == 10) {
            System.out.println("Entered TEN'S");
        } else if (num == 100) {
            System.out.println("Entered HUNDRED'S");
        } else if (num == 1000) {
            System.out.println("Entered THOUSAND'S");
        } else {
            System.out.println("Invalid entry");
        }
    }
}

