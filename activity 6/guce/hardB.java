import java.util.Scanner;
public class hardB {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int balance = 1000;

        System.out.println("Enter PIN: ");
        int pin = sc.nextInt();

        if(pin == 123456){
            System.out.println("Please choose transaction:");
            System.out.println("[W] - Withdraw");
            System.out.println("[D] - Deposit");
            System.out.println("[C] - Check balance");
            System.out.println("Enter here: ");
            char choice = sc.next().charAt(0);

            if(choice == 'W' || choice == 'w'){
                System.out.println("How much would you like to withdraw: ");
                int wid = sc.nextInt();
                if(wid <= balance){
                    balance -= wid;
                System.out.println("Your remaining balance is: " + balance);
                System.out.println("You'll get " + wid + " pesos.");
                System.out.println("Thank you for banking with us!");
                }
                else{
                    System.out.println("Insufficient!");
                    System.exit(0);
                }
            }
            else if(choice == 'D' || choice == 'd'){
                System.out.println("How much would you like to deposit: ");
                int dep = sc.nextInt();
                balance += dep;
                System.out.println("Your remaining balance is: " + balance);
                System.out.println("Thank you for banking with us!");
            }
            else if(choice == 'C' || choice == 'c'){
                System.out.println("Your remaining balance is: " + balance);
                System.out.println("Thank you for banking with us!");
            }
        }
        else{
            System.out.println("Incorrect PIN!");
        }
    }
}