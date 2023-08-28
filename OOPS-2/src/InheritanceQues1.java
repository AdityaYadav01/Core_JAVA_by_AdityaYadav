// Create an Account class and inherit it into Saving Account or Loan Account.

class Account{
    private final String AccNo;
    private final String Name;
    private String Address;
    private final String DOB;
    private int PhoneNO;
    protected double balance;

    public Account(String accN, String name, String add, String dob, int phn){
        this.AccNo = accN;
        this.Name = name;
        this.Address = add;
        this.DOB = dob;
        this.PhoneNO = phn;
        balance = 78781.235;
    }

    // Reading the properties of accounts using get method

    public String getAccNo(){ return AccNo; }
    public String getName(){return Name;}
    public String getAddress(){return Address;}
    public String getDOB(){return DOB;}
    public int getPhnNo(){return PhoneNO;}
    public double getBalance(){return balance;}

    public void setAddress(String add){
        Address = add;
    }

    public void setPhoneNO(int PhnNo){
        PhoneNO = PhnNo;
    }

}

class SavingAccount extends Account{
    public SavingAccount(String accN, String name, String add, String dob, int phn) {
        super(accN, name, add, dob, phn);
    }

    public double getDeposit(){
        return Deposit(8956.256);
    }

    public double Deposit(double amount){
        balance += amount;
        return amount;
    }


    public void WithDraw(double amount){
        balance -= amount;

    }
}

class LoanAccount extends Account{
    public LoanAccount(String accN, String name, String add, String dob, int phn) {
        super(accN, name, add, dob, phn);
    }

    public void PayEMI(int amount){
        balance -= amount;
    }
}




public class InheritanceQues1 {
    public static void main(String[] args) {
        Account acc = new Account("545454", "Aditya", "delhi","06/01/2003", 6565644);
        System.out.println("Account Number: " + acc.getAccNo());
        System.out.println("Name: " + acc.getName());
        System.out.println("Address: " + acc.getAddress());
        System.out.println("Date: " + acc.getDOB());
        System.out.println("Phone No. " + acc.getPhnNo());
        System.out.println("Balance: " + acc.getBalance());

        SavingAccount sacc = new SavingAccount("545454", "Aditya", "delhi","06/01/2003", 6565644);
        System.out.println("Deposit Amount: " + sacc.getDeposit());
    }
}
