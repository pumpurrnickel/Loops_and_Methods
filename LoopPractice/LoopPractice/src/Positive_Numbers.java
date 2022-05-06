import java.util.Scanner;

public class Positive_Numbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numb = 1;

        while (numb != 0) {

            System.out.println("Enter a number:");
            numb = input.nextInt();

            if (numb < 0) {

                System.out.println("Please enter a positive number.");

            }

            else if (numb > 0) {

                System.out.println("Your number was " + numb);

            }
        }

        input.close();

    }
}