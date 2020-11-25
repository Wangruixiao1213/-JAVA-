import java.util.Date;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        myAccount[] myATM = new myAccount[10];
        for (int i = 0; i < 10; i++) {
            myATM[i] = new myAccount();
            myATM[i].setId(100 + i);
            myATM[i].setBalance(100);
        }
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter an id:");
            int myId = input.nextInt();
            System.out.print("\n");
            int choice = 0;
            int idIndex = myId - 100;
            double tmpMoney = 0;

            if (idIndex >= 0 && idIndex <= 9) {
                while (choice != 4) {
                    System.out.print("Main menu:\n1:check balance\n2:withdraw\n3:deposit\n4:exit\nEnter a choice:");
                    choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println(myATM[idIndex].getBalance());
                            break;
                        case 2:
                            System.out.print("How much do you want to withdraw:");
                            tmpMoney = input.nextDouble();
                            myATM[idIndex].withDraw(tmpMoney);
                            break;
                        case 3:
                            System.out.print("How much do you want to withdraw:");
                            tmpMoney = input.nextDouble();
                            myATM[idIndex].deposit(tmpMoney);
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Invalid input!Please try again!");
                    }
                }
            }
            else{
                System.out.println("Id is not existed!");
            }
        }

    }
}

class myAccount {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dataCreated = new Date();

    public myAccount() {
    }

    public myAccount(int tmpId, double tmpBalance) {
        id = tmpId;
        balance = tmpBalance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int tmpId) {
        id = tmpId;
    }

    public void setBalance(double tmpBalance) {
        balance = tmpBalance;
    }

    public void setAnnualInterestRate(double tmpAnnualInterestRate) {
        annualInterestRate = tmpAnnualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public void withDraw(double drawBalance) {
        if (drawBalance > balance)
            System.out.println("Don't have enough money");
        else {
            balance -= drawBalance;
            System.out.println("已取出" + drawBalance + " 还剩下" + balance);
        }
    }

    public void deposit(double depositBalance) {
        balance += depositBalance;
        System.out.println("已存入" + depositBalance + " 现在有" + balance);
    }

    public String getDate() {
        return dataCreated.toString();
    }
}
