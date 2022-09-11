package new2.new2;

import java.util.Scanner;

public class NaturalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The numbers to be sum : ");
        int total = 0;
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            total += i;
        }
        System.out.println("Sum of " + num + " natural number =  " + total);
    }
}


