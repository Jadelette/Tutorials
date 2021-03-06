package inheritancedemo;

import java.util.Scanner;

abstract public class Member {
    public String welcome = "Welcome to ABC Fitness";
    protected double annualFee;
    private String name;
    private int memberID;
    private int memberSince;
    private int discount;

    public Member() {
        System.out.println("Parent constructor with no parameter");
    }   //emd of constructor

    public Member(String pName, int pMemberID, int pMemberSince) {
        System.out.println("Parent constructor with 3 parameters");

        name = pName;
        memberID = pMemberID;
        memberSince = pMemberSince;
    }//end of second constructor

    //getter
    public double getDiscount(){
        return discount;
    } //end of getter

    //setter
    public void setDiscount() {
        Scanner input = new Scanner(System.in);
        String password;
        System.out.print("Please enter admin password");
        password = input.nextLine();

        if (!password.equals("abcd")) {
            System.out.println("Invalid password. You do not have authority to edit discount.");
        } else {
            System.out.println("Please enter the discount:");
            discount = input.nextInt();
        }//end of if/else
    } // end of setter

    public void displayMemInfo() {
        System.out.println("Member name: " + name);
        System.out.println("Member ID: " + memberID);
        System.out.println("Member Since: " + memberSince);
        System.out.println("Annual Fee: " + annualFee);
    } //end of method

    //abstract method
    abstract public void calculateAnnualFee();
}//end of class
