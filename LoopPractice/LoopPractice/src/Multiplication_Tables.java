import java.util.Scanner;

public class Multiplication_Tables {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int numb = input.nextInt();

        for (int i=0; i<=10; i++){

            System.out.println(numb + " x " + i + " = " + (numb*i));

        }

        input.close();

    }
}