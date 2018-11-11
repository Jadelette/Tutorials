package inheritancedemo;

public class VIPMember extends Member {
    public VIPMember(String pName, int pMemberID, int pMemberSince) {
        super(pName, pMemberID, pMemberSince);
        System.out.println("child constructor with 3 parameters");
    }//end of constructor

    @Override
    public void calculateAnnualFee() {
        annualFee = (1-0.01*getDiscount())*1200;
    }//end fo override
} //end of class
