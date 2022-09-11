package new2.new2;

import java.util.Scanner;

public class OperMaxMin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("x value ");
        float x = sc.nextFloat();
        System.out.println("y value ");
        float y = sc.nextFloat();
        System.out.println("z value ");
        float z = sc.nextFloat();
        float a1;
        float a2;
        float a3;
        float a4;
        float max;
        float min;
        a1 = x + (y * z);
        a2 = z + (x / y);
        a3 = (x % y) + z;
        a4 = (x * y) + z;
        System.out.println("Result1= " + a1);
        System.out.println("Result2= " + a2);
        System.out.println("Result3= " + a3);
        System.out.println("Result4= " + a4);
        /*if (a1 >= a2 && a1 >= a3 && a1 >= a4)
            max = a1;
        else if (a2 >= a1 && a2 >= a3 && a2 >= a4)
            max = a2;
        else if (a3 >= a1 && a3 >= a2 && a3 >= a4)
            max = a3;
        else
            max = a4;
        if (a1 <= a2 && a1 <= a3 && a1 <= a4)
            min = a1;
        else if (a2 <= a1 && a2 <= a3 && a2 <= a4)
            min = a2;
        else if (a3 <= a1 && a3 <= a2 && a3 <= a4)
            min = a3;
        else
            min = a4;*/
    }
}






