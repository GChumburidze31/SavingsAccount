
public class SavingsAccount {
   // use the static variable to store the annual interest rate

    private static double annualInterestRate = 0.4; // 4% of int rate

    // Use instance variable to store savings balance
    private double savingsBalance;

    // use a constructor and initialize savingsBalance
    public SavingsAccount(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }

    // Method to calculate and add the monthly interest to the savings balance4
    public void calculateMonthlyInterest() {
        double monthlyInterest = (this.savingsBalance * annualInterestRate) / 12;
        this.savingsBalance += monthlyInterest;
    }

    // Static method to modify the annual interest rate
    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }

    // Getter method for savingsBalance
    public double getSavingsBalance() {
        return this.savingsBalance;
    }
    public static void main(String[] args) {
        // Instantiate two SavingsAccount objects
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        // Calculate the monthly interest with an annual interest rate of 4%
        System.out.println("Monthly balances at 4% annual interest rate:");
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("Saver 1: $%.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver 2: $%.2f%n", saver2.getSavingsBalance());

        // Modify the interest rate to 5%
        SavingsAccount.modifyInterestRate(0.05);

        // Calculate and print the new balances after changing the interest rate to 5%
        System.out.println("Monthly balances at 5% annual interest rate:");
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("Saver 1: $%.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver 2: $%.2f%n", saver2.getSavingsBalance());
    }
}