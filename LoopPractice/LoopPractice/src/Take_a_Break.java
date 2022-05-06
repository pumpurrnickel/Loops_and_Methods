import java.util.Scanner;

public class Take_a_Break {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Do you want to take a break?");

        while (true) {
            String response = input.nextLine();

            if (response.equals("yes") || response.equals("Yes")) {
                break;
            }

            System.out.println("Do you want to take a break?");

        }

        input.close();

    }
}