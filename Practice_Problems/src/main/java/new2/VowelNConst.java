package new2.new2;

import java.util.Scanner;

public class VowelNConst {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Alphabet");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Enter is a vowel ");
                break;
            default:
                System.out.println("Enter is a Consonant ");
                break;

        }

    }
}

