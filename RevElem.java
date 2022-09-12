package New3;
import java.util.Arrays;
import java.util.Scanner;
public class RevElem {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of an Array");
            int size = sc.nextInt();
            int[] array = new int[size];
            System.out.println("Enter the Element of an Array");
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }
            System.out.println("Enter Array are");
            System.out.println(Arrays.toString(array));
            System.out.println("Array Element in reverse order are");
            for (int i = size-1; i >=0; i--) {
                System.out.print(array[i]+" ");
            }

        }
    }

