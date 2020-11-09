import java.util.Date;
public class testAccount{
    public static void main(String[] args){
        Account myAccount = new Account(1122,20000);
        myAccount.setAnnualInterestRate(0.045);
        myAccount.withDraw(2500);
        myAccount.deposit(3000);
        System.out.println("余额为" + myAccount.getBalance());
        System.out.println("月利率为" + myAccount.getMonthlyInterestRate()*100 + '%');
        System.out.println("开户日期为" + myAccount.getDate()); 
    }
}
class Account{
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dataCreated = new Date();
    public Account(){}
    public Account(int tmpId,double tmpBalance){
        id = tmpId;
        balance = tmpBalance;
    }
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setId(int tmpId){
        id = tmpId;
    }
    public void setBalance(double tmpBalance){
        balance = tmpBalance;
    }
    public void setAnnualInterestRate(double tmpAnnualInterestRate){
        annualInterestRate = tmpAnnualInterestRate;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate / 12 ;
    }
    public void withDraw(double drawBalance){
        if(drawBalance > balance) System.out.println("Don't have enough money");
        else{
            balance -= drawBalance;
            System.out.println("已取出" + drawBalance + " 还剩下" + balance);
        }
    }
    public void deposit(double depositBalance){
        balance += depositBalance;
        System.out.println("已存入" + depositBalance + " 现在有" + balance);
    }
    public String getDate(){
        return dataCreated.toString();
    }
}


