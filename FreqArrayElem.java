package New3;

import java.util.Arrays;
import java.util.Scanner;

public class FreqArrayElem {

    public static void main(String[] args) {
        System.out.print("Enter the Size of Array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the Element in an Array");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("array entered");
        System.out.println(Arrays.toString(array));
        int[] freq = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }

            }
            System.out.println(array[i] + " frequency is " + count + " times");
        }

    }
}

