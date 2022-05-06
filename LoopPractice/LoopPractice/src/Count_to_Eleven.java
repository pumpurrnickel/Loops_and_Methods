import java.util.Scanner;

public class Count_to_Eleven {
    public static void main(String[] args){

        System.out.println("Enter a number less than 11.");

        Scanner input = new Scanner(System.in);
        int numb = input.nextInt();

        for (int i = numb; i <= 11; i++) {

            System.out.println(i);

        }

        input.close();

    }
}