import java.util.Scanner;
public class switchcase1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Options");
        System.out.println("[A] - Aplle");
        System.out.println("[B] - Ball");
        System.out.println("[C] - Cat");
        System.out.println("Enter your Order: ");
        char choice = sc.next().charAt(0);
        
       switch(choice){
        case 'A':
        System.out.println("You choose Aplle");
        break;
        case 'B':
        System.out.println("You choose Ball");
        break;
        case 'C':
        System.out.println("You choose Cat");
        break;

        default:
        System.out.println("Invalid");
        break;
       }
    }  
}
