package day31_constructors;

public class BankAccount {
    public String accountHolder;
    public int accountNumber;
    public double balance;

    public void setInfo(String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", accountBalance=$" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("you available balance is: $"+balance);
    }

    public void deposit(double amount){
        if(amount <=0){
            System.err.println("depositing amount can't be 0 or negative");
            return; // exits the method
        }
        balance+=amount;
    }

    public void withdraw(double amount){
        if(amount > balance){
            System.err.println("insufficient balance");
            return;
        }
        if(amount<=0){
            System.err.println("the withdrawing amount can't be 0 or negative");
            return;
        }
        balance-=amount;
    }

}

/*
BankAccount Task:
        Attributes:
                1. accountHolder, 2. accountNumber, 3. balance

        Actions:
            1. setInfo(): sets the accountHolder and accountNumber attributes
            2. toString()
                3. checkBalance():displays the available balance
                2. deposit(): increases the balance by the given amount
        3. withdraw(): decreases the balance by the given amount
 */