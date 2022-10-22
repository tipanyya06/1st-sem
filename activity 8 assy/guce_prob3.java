import java.util.Scanner;
public class guce_prob3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word="";
    
        do{
            System.out.print("\nPlease Enter Anyword: ");
            word = sc.nextLine();
            System.out.println("Enter q to quit");
        }while(!word.equals ("q") && !word.equals ("Q"));
        sc.close();
        }
    }