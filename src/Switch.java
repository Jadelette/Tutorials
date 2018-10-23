public class Switch {

    public static void main(String[] args) {

        int iVal = 97;

        switch (iVal%2) {

            case 0:
                System.out.print(iVal);
                System.out.print(" is even.");
                break;
            case 1:
                System.out.print(iVal);
                System.out.print(" is odd.");
                break;
            default :
            System.out.println("oops, it broke");
        }
    }
}
