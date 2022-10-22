import java.util.Scanner;
    public class intermediateB{
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter username: ");
        int un = sc.nextInt();
        
        System.out.println("Enter password: ");
        int pw = sc.nextInt();

        if(un == 1230 && pw != 456789){
            System.out.println("Password is incorrect!");
        }
        else if(un != 1230 && pw == 456789){
            System.out.println("Username is incorrect!");
        }
        else if(un != 1230 && pw != 456789){
            System.out.println("Login Failed!");
        }
        else if(un == 1230 && pw == 456789){
            System.out.println("Login Successful!");
        }
        else{
            System.out.println("Out of range!");
        }

        }
    }
