package new2.new2;
import java.util.Scanner;

public class quad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double delta = 0.0;
        double root1 = 0.0;
        double root2 = 0.0;
        System.out.println("Enter the value of num ");
        double num = sc.nextDouble();
        if (num == 0.0) {
            System.out.println("For Quaderatic Equation value of  num Cannot be Zero..");
            return;
        } else {
            System.out.println("Enter the value of num2");
            double num2 = sc.nextDouble();
            System.out.println("Enter the value of num3");
            double num3 = sc.nextDouble();
            System.out.println("Entered Quaderatic Equation are" + num + "x^2+" + num2 + "x+" + num3);
            delta = ((Math.pow(num2, 2)) - (4 * num * num3));
            if (delta < 0) {
                System.out.println("Root Will Be imaginary");
                double real = -num2 / (2 * num);
                double imaginary = Math.sqrt(-delta) / (2 * num);
                System.out.printf("root1= %.2f+%.2fi", real, imaginary);
                System.out.format("\nroot1= %.2f-%.2fi", real, imaginary);
            } else if (delta == 0) {
                System.out.println(" Roots Will real and equal");
                root1 = (((-(num2)) + Math.sqrt(delta)) / (2 * num));
                root2 = (((-(num2)) - Math.sqrt(delta)) / (2 * num));
                System.out.println(root1 + "   " + root2);
            } else if (delta > 0) {
                System.out.println(" Roots Will real and distinct");
                root1 = (((-num2) + Math.sqrt(delta)) / (2 * num));
                root2 = (((-num2) - Math.sqrt(delta)) / (2 * num));
                System.out.println(root1 + "   " + root2);

            }
        }
    }
}

