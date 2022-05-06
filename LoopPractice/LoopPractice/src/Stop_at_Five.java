import java.util.Scanner;

public class Stop_at_Five {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number...that is preferably not 5.");

        while (true) {

            int response = input.nextInt();

            if (response == 5) {

                break;

            }
        
            System.out.println("Enter another number (not 5 please I beg you).");

        }
        
        System.out.println("NO GOD NO. NO NO NO NO NO. YOU RUINED IT.");
        input.close();

    }
}