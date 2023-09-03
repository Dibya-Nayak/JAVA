

import java.util.Scanner;

class ATM{
   float balance;
   int pin=546;

   public void checkPin(){
       System.out.println("Enter Pin: ");
       Scanner sc =new Scanner(System.in);
       int entered_pin = sc.nextInt();
       if(entered_pin==pin)
       {
           menu();
       }
       else{
           System.out.println("Enter valid pin.");
           menu();
       }
   }


   public void menu(){
       System.out.println("Enter your choice: ");
       System.out.println("1. Check A/C Balance");
       System.out.println("2. Withdraw Money");
       System.out.println("3.Deposit Money");
       System.out.println("4. Exit");
       Scanner sc =new Scanner(System.in);
       int option = sc.nextInt();

       if(option==1) {
           checkBalance();
       } else if (option==2) {
           withdrawMoney();
       } else if (option==3) {
           depositMoney();
       } else if (option==4) {
           return;
       }
       else {
           System.out.println("Enter a valid choice");
       }
   }

   public void checkBalance(){
       System.out.println("Balance : " + balance);
       menu();
   }
   public void withdrawMoney(){
       System.out.println("Enter Amount to withdraw: ");
       Scanner sc = new Scanner(System.in);
       float amount = sc.nextFloat();
       if(amount>balance){
           System.out.println("Insufficient Balance.");
       }
       else{
           balance=balance-amount;
           System.out.println("Money Withdraw Successful.");
       }
       menu();
   }
   public void depositMoney(){
       System.out.println("Enter Amount: ");
       Scanner sc = new Scanner(System.in);
       float amount= sc.nextFloat();
       balance=balance+amount;
       System.out.println("Money Deposited Successfully.");
       menu();
   }
   public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkPin();
}

}