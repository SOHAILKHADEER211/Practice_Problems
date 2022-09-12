package New3;

import java.util.Arrays;
import java.util.Scanner;

public class ascendingElem {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of An Array");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the Element of An Array ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter Array Element are");
        System.out.println(Arrays.toString(array));
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}



