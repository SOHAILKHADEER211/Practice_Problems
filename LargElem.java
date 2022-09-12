package New3;
import java.util.Arrays;
import java.util.Scanner;
public class LargElem {

        public static void main(String[] args) {
            System.out.println("Enter the size of an Array");
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int[] array = new int[size];
            System.out.println("Enter The Element of An Array");
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }
            System.out.println("Arrays given are");
            System.out.println(Arrays.toString(array));
            int max = array[0];
            for (int i = 0; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
            }
            System.out.println("Maximum Element array is = " + max);
        }
    }

