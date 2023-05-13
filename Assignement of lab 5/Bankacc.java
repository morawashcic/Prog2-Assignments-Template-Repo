class BankAccount {

    public double balance ;
    public String username ;
    public String bankname;
    public final String country = "Egypt" ;
    public int NumOfUsers =0 ;
    public int NumOfcalls =0 ;

    public BankAccount() {
        System.out.println( "Bank account has been created ");
        NumOfUsers ++;
    }
    public BankAccount( double x ,String n , String b) {
        balance = x ;
        username = n ;
        bankname=b;
        NumOfUsers ++;
    }
    public void Deposite (double amount){
        balance += amount ;
        NumOfcalls++;
    }

    public void withdraw (double amount){
        balance -= amount;
        NumOfcalls++;
    }


}











public class Bankacc
{
    public static void main(String[] args) {

        BankAccount acc1=new BankAccount();
        BankAccount acc2=new BankAccount(1000,"Aborawash","Alexbank");
        acc2.Deposite(500);
        acc2.withdraw(100);
        System.out.println( "balance of account is = " +acc2.balance);
        System.out.println(acc2.NumOfcalls);
        System.out.println(acc2.NumOfUsers);




    }
}