package New;

import java.util.Scanner;

public class String_Com {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String");
        String S = sc.next();
        System.out.println("Enter Second String");
        String S1 = sc.next();
        if (S.equals(S1)) {
            System.out.println("Equal");
        } else
            System.out.println("No its not Equal ");
    }
}

