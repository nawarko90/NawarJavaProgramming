package day31_constructors;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Nawar Hussein", 123456798);
        System.out.println(account1);

        account1.deposit(500);
        account1.checkBalance();

        account1.withdraw(200);
        account1.checkBalance();

        account1.withdraw(900);
        account1.checkBalance();

        System.out.println();
        System.out.println("=====================================================");

        BankAccount account2= new BankAccount();
        account2.setInfo("Waleed Hussein",32154687);
        System.out.println(account2);

        account2.deposit(1000);
        account2.checkBalance();
        account2.withdraw(400);
        account2.checkBalance();


    }
}
