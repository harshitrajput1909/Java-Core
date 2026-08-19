package classs;

public class Rbi {
    private int BankCode;
    private int CashLimit;
    public int  bankcode(int code){
        this.BankCode=code;
//        System.out.println("the bank code is "+BankCode);
        return BankCode;
    }

    public int cashlimit(int limit){
        this.CashLimit=limit;
//        System.out.println("the cash limit is "+CashLimit);
        return CashLimit;
    }

//    public int set(int code,int limit){
//        this.BankCode=code;
//        this.CashLimit=limit;
//        return BankCode,CashLimit;
//    }
}
