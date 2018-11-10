package objectorienteddemo;

public class Staff {

    //constructor
    public Staff(String name)
    {
        nameOfStaff = name;
        System.out.println("\n" + nameOfStaff);
        System.out.println("----------------");
    }//end of constructor

    //second constructor
    public Staff(String firstName, String lastName)
    {
        nameOfStaff = firstName + " " + lastName;
        System.out.println("\n" + nameOfStaff);
        System.out.println("----------------");
    }//end of second constructor

    //declare fields (field = variable declared inside a class)
    private String nameOfStaff;
    private final int hourlyRate = 30;
    private int hoursWorked;

    public void printMessage()
            {
        System.out.println("Calculating pay... ");
            } //end of printMessage method

    public int calculatePay()
    {
        printMessage();

        int staffPay;
        staffPay = hoursWorked * hourlyRate;

        if (hoursWorked > 0) {
            return staffPay;
        }else {
            return -1;
        }
    }//end of calculatePay method

    public int calculatePay (int bonus, int allowance)
    {
        printMessage();
        if (hoursWorked >0)
        {
            return hoursWorked*hourlyRate+bonus+allowance;
        } else
        {
            return 0;
        }
    }//end of second calculatePay method (overloading)

    //setter method
    public void setHoursWorked(int hours){
        if (hours > 0)
        {
            hoursWorked = hours;
        } else
        {
            System.out.println("Error: hoursWorked Cannot be Smaller than Zero");
            System.out.println("Error: hoursWorked is not updated");
        }
    }//end of setter

    //getter method
    public int getHoursWorked()
    {
        return hoursWorked;
    }//end of getter



}//end of class
