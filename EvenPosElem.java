package New3;

import java.util.Arrays;
import java.util.Scanner;

public class EvenPosElem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the Element of An Array");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Entered Array Are");
        System.out.println(Arrays.toString(array));
        System.out.println("Element of Even Position Array are");
        for (int i = 1; i < size; i += 2) {
            System.out.print(array[i] + " ");
        }
    }
}

