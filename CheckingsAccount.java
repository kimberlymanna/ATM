public class CheckingsAccount extends BankAccount implements Transactions {
    public CheckingsAccount(){
    }
    public CheckingsAccount(double b){
        Cbalance = b;
    }
    public void withdraw(){
        System.out.println("Enter the amount you want to withdraw from: " + Cbalance);
        boolean done = false;
        while(!done){
            double amount = in.nextDouble();
            if (amount > getBalance()){
                System.out.println("Error: Insufficient Funds");
            }
            else{
                done = true;
                Cbalance = Cbalance - amount;
                System.out.println("Your amount is now: " + Cbalance);
            }
        }
    }
    public void deposit(){
        System.out.println("Input the amount you want to deposit: " + Cbalance);
        boolean done = false;
        while(!done){
            double amount = in.nextDouble();
            if(amount < 0){
                System.out.println("Error: Cannot deposit negative amounts");
            }
            else{
                done = true;
                Cbalance = Cbalance + amount;
                System.out.println("Your amount is now: " + Cbalance);
            }
        }
    }
    public double getBalance(){
        return Cbalance;
    }
    public void setBalance(double b){
        Cbalance = b;
    }
public static double Cbalance;
}