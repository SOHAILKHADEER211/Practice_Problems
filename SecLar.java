package New3;
import java.util.Arrays;
import java.util.Scanner;
public class SecLar {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the sizen of an array");
            int size = sc.nextInt();
            int[] array = new int[size];
            System.out.println("Enter the element of an array");
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }
            System.out.println("Enter Array Element are");
            System.out.println(Arrays.toString(array));
            Arrays.sort(array);
            System.out.println("Sorted Array");
            System.out.println(Arrays.toString(array));
            int SecondLargest = array[size-2];
            System.out.println("Second Largest Array Element is " + SecondLargest);
        }
    }

