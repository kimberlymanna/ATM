import java.util.Scanner;
public class BankAccount {
    Scanner in = new Scanner(System.in);
    public BankAccount(){
    }
    public BankAccount(int p, double b, int accountNum){
        pin = p;
        accountNumber = accountNum;
    }
    public void accountLogin(){
        System.out.println("Please enter your 8 digit account number:");
        boolean done = false;
        while (!done){
        int lengthA = String.valueOf(in.nextInt()).length();
        if(lengthA < MAX_LENGTH_OF_ACCOUNTNUMBER || lengthA > MAX_LENGTH_OF_ACCOUNTNUMBER)
            System.out.println("Error: please re-enter account number"); 
        else {
            done = true;
            accountNumber = lengthA;
        }
    }
    System.out.println("Please enter your 4 digit pin: ");
    boolean input = false;
    while(!input){
        int lengthB= String.valueOf(in.nextInt()).length();
        if(lengthB < MAX_LENGTH_OF_PIN || lengthB > MAX_LENGTH_OF_PIN){
            System.out.println("Error: please re-enter pin");
        }
        else {
            input = true;            
            pin = lengthB; 
            }
        }
    }
    public void displayMenu(){
    System.out.println("\nPlease Choose From the Following Options:" + "\n 1. Checking Account \n 2. Savings Account \n 3. Exit");
    boolean userExited = false;
    while (!userExited){
        switch(input = in.nextInt()){
            case 1:
                CheckingsAccount c = new CheckingsAccount();
                System.out.println("Checkings Account options");
                System.out.println("Please enter the number next to the transaction desired ");
                System.out.println("Withdraw: 1 \nDeposit: 2 \nExit: 3");
                System.out.println("Your current balance is: " + c.getBalance());
                int userInput2 = in.nextInt();
                if(userInput2 == 1){
                    c.withdraw();
                    System.out.print("If you wish to perform additional transactions, please select an option ");
                    System.out.println("\nChecking Account - 1 \nSavings Account - 2 \nExit - 3");
                }
                else if(userInput2 == 2){
                    c.deposit();
                    System.out.print("If you wish to perform additional transactions, please select an option ");
                    System.out.println("\nChecking Account - 1 \nSavings Account - 2 \nExit - 3");
                }
                else if(userInput2 == 3){
                    userExited = true;
                    System.out.println("Exiting...");
                }
                break;
            case 2:
                SavingsAccount s = new SavingsAccount();
                System.out.println("Savings Account options");
                System.out.println("Please type the number next to the action that you want to do: ");
                System.out.println("Withdraw: 1 \nDeposit: 2 \nExit: 3");
                System.out.println("Your current balance is: " + s.getBalance());
                int userInput = in.nextInt();
                if(userInput == 1){
                    s.withdraw();
                    System.out.print("If you wish to perform additional transactions, please select an option ");
                    System.out.println("\nChecking Account - 1 \nSavings Account - 2 \nExit - 3");
                }
                else if(userInput == 2){
                    s.deposit();
                    System.out.print("If you wish to perform additional transactions, please select an option ");
                    System.out.println("\nChecking Account - 1 \nSavings Account - 2 \nExit - 3");
                }
                else if(userInput == 3){
                    userExited = true;
                    System.out.println("Exiting...");
                }
                break;
            case 3:
                System.out.println("Exiting...");
                userExited = true;
                break;
            default:
                System.out.println("Error: please enter an option from 1-3");
            }
        }
    }
private int pin;
private int accountNumber;
private int lengthA;
private int lengthB;
private int input;
final int MAX_LENGTH_OF_ACCOUNTNUMBER = 8;
final int MAX_LENGTH_OF_PIN = 4;
public static double Cbalance;
public static double Sbalance;
}

