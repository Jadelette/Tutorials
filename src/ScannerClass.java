import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter an integer:");
        int myInt = reader.nextInt();

        System.out.printf("You entered %d.%n%n", myInt);

        System.out.print("Enter a string: ");
        reader.nextLine();
        //the additional method call above is to consume the 'new line' created after hitting 'enter' after entering the int
        String myString = reader.nextLine();

        System.out.printf("You entered \"%s\".%n%n", myString);





    }

}
