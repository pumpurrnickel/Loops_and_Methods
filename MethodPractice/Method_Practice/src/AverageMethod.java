import java.util.Scanner;

public class AverageMethod {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        double num1 = input.nextDouble();

        System.out.println("Enter your second number: ");
        double num2 = input.nextDouble();

        System.out.println("Enter your third number: ");
        double num3 = input.nextDouble();

        System.out.println(ave(num1, num2, num3));

    }

    public static double sum(double num1, double num2, double num3){

        return num1 + num2 + num3;

    }

    public static double ave(double num1, double num2, double num3){

        return sum(num1, num2, num3)/3;

    }
}