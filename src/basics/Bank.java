package basics;

public class Bank {

        int BankBalance;
        String pass;
    Bank(int b,String s) {
    this.BankBalance=b;
    this.pass=s;
    }
    //withdraw amount
    void withdraw(int amt){
        System.out.println(amt);
        System.out.println("Remaining amount is "+(this.BankBalance-amt));
    }
    // change password
    void ChangePassword(String p){
        System.out.print(this.pass);
        this.pass=p;
        System.out.println("  changed password to "+p);

    }
    //checkBalance
    void checkBalance(){
//        this.BankBalance=b;
        System.out.println("Bank balance is "+this.BankBalance);
    }
}


