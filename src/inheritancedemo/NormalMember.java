package inheritancedemo;

public class NormalMember extends Member {
    public NormalMember(){
        System.out.println("Child constructor with no parameter");
    }//end of constructor

    public NormalMember(String pName, int pMemberID, int pMemberSince) {
        super(pName, pMemberID, pMemberSince);
        System.out.println("Child constructor with three parameters");
    }//end of constructor 2

    //overriding method
    @Override
    public void calculateAnnualFee() {
        annualFee = (1-0.01*getDiscount())*(100+12*30);
    } //end of override

} //end fo class
