import java.util.Scanner;

public class DivideMethod {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double num1 = input.nextDouble();

        System.out.println("Enter another number: ");
        double num2 = input.nextDouble();

        divide(num1, num2);
    }

    public static void divide (double num1, double num2){

        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
        
    }
}
