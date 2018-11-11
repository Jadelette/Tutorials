package inheritancedemo;

public class InheritanceDemo {

    public static void main(String[] args) {
        Member[] clubMembers = new Member[6];

        clubMembers[0] = new NormalMember("Jade", 1, 2017);
        clubMembers[1] = new NormalMember("Steve", 2, 2015);
        clubMembers[2] = new NormalMember("Ethan", 3, 2018);
        clubMembers[3] = new VIPMember("Rach", 4, 2003);
        clubMembers[4] = new VIPMember("Claire", 5, 2010);
        clubMembers[5] = new VIPMember("Tali", 6, 2012);

        for (Member m : clubMembers) {
            m.calculateAnnualFee();
            m.displayMemInfo();
        } //end of foreach

        /*NormalMember mem1 = new NormalMember("James", 1, 2010);
        VIPMember mem2 = new VIPMember("Andy", 2, 2011);

        mem1.calculateAnnualFee();
        mem2.calculateAnnualFee();

        mem1.displayMemInfo();
        mem2.displayMemInfo();

        mem1.setDiscount();
        mem1.calculateAnnualFee();
        mem1.displayMemInfo(); */
    } //end of main method

} //end of class
