public class ReturnMethod{
    public static void main(String[] args){

        System.out.println(printString());
        System.out.println(printInteger());
        System.out.println(printBoolean());

    }

    public static String printString() {

        return "Wowee zowee, I'm a string!";

    }

    public static int printInteger() {

        return 56;

    }

    public static boolean printBoolean() {

        return false;

    }
}