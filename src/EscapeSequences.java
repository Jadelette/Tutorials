public class EscapeSequences {

    public static void main(String[] args) {

        System.out.println("t\tt tab");

        System.out.println("new\nline");

        System.out.println("I want to print a backslash: \\");

        System.out.println("he said \"she said\"");

        //formatting output (not strictly an escape sequence

        System.out.printf("\nThe answer for %.3f divided by %d is %.2f.", 5.45, 3, 5.45/3);

        System.out.printf("%n%d%n%d", 12, 3);


// Width flag tells how many space to add
        System.out.printf("%n%8d", 12);

        System.out.printf("%n%,d", 12345);










    }
}
