

public class BankAccount {
    
    private double checkingBalance;
    private double savingsBalance;
    private static int account;
    private static double account1;
    private double total;

    public BankAccount(){
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        account = account + 1;
        account1 = this.checkingBalance + this.checkingBalance;
    }

    //Getter methods, don't need set[ters for balances
    public void getCheckingBalance(){
        System.out.println(checkingBalance);
    }

    public void getSavingBalance(){
        System.out.println(savingsBalance);
    }

    public void chooseAccount(){
        System.out.println("Choose your Bank type:");
        System.out.println("1: Savings Account");
        System.out.println("2: Checking Account");
    }

    /////////////////////Depost Money//////////////////////////
    public double depositMoney(double money, int accountType){

        if(accountType ==1){
            checkingBalance = checkingBalance + money;
        }
        else{
            savingsBalance = savingsBalance + money;
        }
        total = checkingBalance + savingsBalance;
        return total;

    }

    //////////////////Withdraw Money///////////////////////////
    public void withdraw(double money, int accountType){

        if(checkingBalance + savingsBalance < money || checkingBalance < 0 || savingsBalance < 0){
            System.out.println("Sorry, insufficient funds");
        }
        else{
            if(accountType == 1){
                checkingBalance = checkingBalance - money;
            }
            else{
                savingsBalance = savingsBalance - money;
            }
            total = checkingBalance + savingsBalance;
        }
    }

    //////Total Money/////////////////////////////////
    public double balance(){
        return checkingBalance + savingsBalance;
    }



}
