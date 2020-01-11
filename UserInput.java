package mypack;
import java.util.Scanner;
import java.util.Random;

public class UserInput {
    static String name; int activity; static int num; static float balance = 0.00f;
    static Scanner input = new Scanner(System.in);
    static String[] n = {};
    public static void main (String[]args) {
        System.out.println("Welcome to the bank");
        System.out.println("What would you like to do today?");
        System.out.println("1- Create New Account \n2- Check Balance \n3- Deposit \n4- Withdrawal");
        int activity = input.nextInt();
        if(activity == 1){newAcc();}
        else if(activity == 2){checkBalance();}
        else if(activity == 3){Deposit();}
        else if(activity == 4){Withdraw();}
        else {System.out.println("Choose correct option"); main(n);}

    }
    public static void newAcc(){
        System.out.println("Please enter your name: ");
        name = input.nextLine();
        System.out.println("1- Savings Account?\n 2- Current Account?");
        int acctype = input.nextInt();
        if(acctype == 1 || acctype ==2) {
            Random ran = new Random();
            num = Math.abs(ran.nextInt());
            System.out.println("Congratulations " + name + " Your account has been created.\n Account number is: " + num);
            main(n);
        }
    }
    public static void checkBalance(){
        System.out.println(("Enter your account number: "));
        int acc = input.nextInt();
        if (acc == num) {
            System.out.println(name + " your balance is "+ balance);
            main(n);
        } else if (acc !=num) {
            System.out.println("Wrong account number "+ name);}
            main(n);}

    public static void Deposit(){
        System.out.println("Enter your account number: ");
        int acc = input.nextInt();
        if (acc == num) {
            System.out.println(name + " , how much will you like to deposit? ");
            float dep = input.nextFloat();
            System.out.println("An amount of "+ dep + " has been deposited.");
            balance = balance + dep;
            main(n);
        } else if (acc !=num) {
            System.out.println("Wrong account number "+ name);}
        main(n);}

    public static void Withdraw(){
        System.out.println("Enter your account number: ");
        int acc = input.nextInt();
        if (acc == num) {
            System.out.println(name + " , how much will you like to withdraw? ");
            float wdraw = input.nextFloat();
            if(wdraw <= balance){
            System.out.println("An amount of "+ wdraw + " has been withdrawn.");
                balance = balance - wdraw;}
            else {System.out.println("Do not have enough funds");}
            main(n);
        } else if (acc !=num) {
            System.out.println("Wrong account number "+ name);}
        main(n);}


    }

       /* String cont = "y";
        while(cont.equalsIgnoreCase("y") ) {
            System.out.println(("Enter your age: "));
            int age = input.nextInt();
            if (age > 0 && age < 18) {
                System.out.println("Not allowed");
            } else if (age >= 18 && age <= 59) {
                System.out.println("Allowed");
            } else if (age > 59) {
                System.out.println("Too old");
            }
            System.out.println("Do you want to continue, Y to continue:");
            cont = input.next();
        }*/






