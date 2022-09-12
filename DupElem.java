package New3;

import java.util.Arrays;
import java.util.Scanner;

public class DupElem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the element of an array");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter Array Element are");
        System.out.println(Arrays.toString(array));
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
                    count = 1;
                    System.out.print(array[i] + "  is an duplicate element");
                }

            }

        }
        if (count == 0) {
            System.out.println("There is no duplicate element");
        }
    }
}

