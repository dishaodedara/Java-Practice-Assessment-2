import java.util.*;
import javax.security.auth.login.AccountNotFoundException;
import java.util.*;
class Account {
    private int id;
    private double balance; //balance for account
    private static double annualInterestRate; //store the cuurent interest rate
    private java.util.Date dateCreated; //stores account created date.

    public Account() {
        dateCreated = new java.util.Date();
    }

    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new java.util.Date();
    }
    import java.util .*;
import javax.security.auth.login.AccountNotFoundException;

    class Account {
        private int id;
        private double balance; //balance for account
        private static double annualInterestRate; //store the cuurent interest rate
        private java.util.Date dateCreated; //stores account created date.

        public Account() {
            dateCreated = new java.util.Date();
        }

        Account(int id, double balance) {
            this.id = id;
            this.balance = balance;
            dateCreated = new java.util.Date();
        }

        public int getId() {
            return this.id;
        }

        public double getBalance() {
            return this.balance;
        }

        public static double getAnnualInterestRate() {
            return annualInterestRate;
        }

        public void setId(int newId) {
            id = newId;
        }

        public void setBalance(double newBalance) {
            balance = newBalance;
        }

        public static void setAnnualInterestRate(double newAnnualInterestRate) {
            annualInterestRate = newAnnualInterestRate;
        }

        public double getMonthlyInterestRate() {
            return (annualInterestRate / 100) / 12;
        }

        public double getMonthlyInterest() {
            return balance * getMonthlyInterestRate();
        }

        public void withdraw(double amount) {
            balance = balance - amount;
        }

        public void deposit(double amount) {
            balance = balance + amount;
        }

        public java.util.Date getDateCreated() {
            return dateCreated;
        }

        public void getAccountdetailes() {
            System.out.println("id : " + getId());
            System.out.println("Balance : " + getBalance());
            System.out.println("annualInterestRate : " + Account.getAnnualInterestRate());
            System.out.println("Monthly interest is : " + getMonthlyInterest());
            System.out.println("This account was created at : " + getDateCreated());
        }
    }

    class Pr2_2 {
        public static void main(String[] args) {
            Account a = new Account(82, 5000)
            Account.setAnnualInterestRate(10);
            a.withdraw(200);
            a.deposit(400);
            a.getAccountdetailes();
        }

    }
      System.out.println("\n by 21ce82_Disha");
}