class Bank {
    private String name;
    private String headOfficeAddress;
    private String chairmanName;
    private int branchCount;
    private double fdInterestRate;
    private double personalLoanInterestRate;
    private double homeLoanInterestRate;

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getHeadOfficeAddress() {
        return headOfficeAddress;
    }
    public void setHeadOfficeAddress(String headOfficeAddress) {
        this.headOfficeAddress = headOfficeAddress;
    }

    public String getChairmanName() {
        return chairmanName;
    }
    public void setChairmanName(String chairmanName) {
        this.chairmanName = chairmanName;
    }

    public int getBranchCount() {
        return branchCount;
    }
    public void setBranchCount(int branchCount) {
        this.branchCount = branchCount;
    }

    public double getFdInterestRate() {
        return fdInterestRate;
    }
    public void setFdInterestRate(double fdInterestRate) {
        this.fdInterestRate = fdInterestRate;
    }

    public double getPersonalLoanInterestRate() {
        return personalLoanInterestRate;
    }
    public void setPersonalLoanInterestRate(double personalLoanInterestRate) {
        this.personalLoanInterestRate = personalLoanInterestRate;
    }

    public double getHomeLoanInterestRate() {
        return homeLoanInterestRate;
    }
    public void setHomeLoanInterestRate(double homeLoanInterestRate) {
        this.homeLoanInterestRate = homeLoanInterestRate;
    }


    public String toString() {
        return "Bank Name: " + name +
                "\nHead Office: " + headOfficeAddress +
                "\nChairman: " + chairmanName +
                "\nBranches: " + branchCount +
                "\nFD Interest Rate: " + fdInterestRate + "%" +
                "\nPersonal Loan Interest Rate: " + personalLoanInterestRate + "%" +
                "\nHome Loan Interest Rate: " + homeLoanInterestRate + "%\n";
    }
}
class SBI extends Bank {
    SBI() {
        setName("SBI");
        setHeadOfficeAddress("Mumbai");
        setChairmanName("Dinesh Kumar Khara");
        setBranchCount(22000);
        setFdInterestRate(5.5);
        setPersonalLoanInterestRate(9.6);
        setHomeLoanInterestRate(8.4);
    }
}

class BOI extends Bank {
    BOI() {
        setName("BOI");
        setHeadOfficeAddress("Mumbai");
        setChairmanName("A. K. Das");
        setBranchCount(5100);
        setFdInterestRate(5.25);
        setPersonalLoanInterestRate(10.2);
        setHomeLoanInterestRate(8.75);
    }
}

class ICICI extends Bank {
    ICICI() {
        setName("ICICI");
        setHeadOfficeAddress("Mumbai");
        setChairmanName("Sandeep Bakhshi");
        setBranchCount(5200);
        setFdInterestRate(6.0);
        setPersonalLoanInterestRate(11.0);
        setHomeLoanInterestRate(9.0);
    }
}

public class Question6 {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank boi = new BOI();
        Bank icici = new ICICI();
       // System.out.println(icici.toString());
        //System.out.println(icici.getFdInterestRate());

      //  System.out.println(sbi);
       // System.out.println(boi);
       // System.out.println(icici);
       // icici.getBranchCount();
    }
}
