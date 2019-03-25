public class SavingsAccount extends BankAccount implements Transactions{
    public SavingsAccount(){
    }
    public SavingsAccount(double b){
        Sbalance = b;
    }
    public void withdraw(){
        System.out.println("Input the amount you want to withdraw from: " + Sbalance);
        boolean done = false;
        while(!done){
            double amount = in.nextDouble();
            if (amount > getBalance()){
                System.out.println("Error: Cannot withdraw negative amounts");
            }
            else{
                done = true;
                Sbalance = Sbalance - amount;
                System.out.println("Your amount is now: " + Sbalance);
            }
        }
    }
    public void deposit(){
        System.out.println("Input the amount you want to deposit: " + Sbalance);
        boolean done = false;
        while(!done){
            double amount = in.nextDouble();
            if(amount < 0){
                System.out.println("Error: Cannot deposit negative amounts");
            }
            else{
                done = true;
                Sbalance = Sbalance + amount;
                System.out.println("Your amount is now: " + Sbalance);
            }
        }
    }
    public double getBalance(){
        return Sbalance;
    }
    public void setBalance(double b){
        Sbalance = b;
    }
private static double Sbalance;
}