package loops;

public class LoopWhile {

    public static void main(String[] args) {


        int kVal = 5;
        int factorial = 1;

        while (kVal > 1) {
            factorial *= kVal--;
            // kVal -=1;
            System.out.println(factorial);
            System.out.println(kVal);
        }
    }
}
