import java.util.Scanner;
public class switchcase2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Options");
        System.out.println("[1] - Monday");
        System.out.println("[2] - Tuesday");
        System.out.println("[3] - Wedsnesday");
        System.out.println("[4] - Thusday");
        System.out.println("[5] - Friday");
        System.out.println("Enter your Choice: ");
        char choice = sc.next().charAt(0);
        
       switch(choice){
        case '1' :
        System.out.println("It's Monday");
        break;
        case '2' :
        System.out.println("It's Tuesday");
        break;
        case '3' :
        System.out.println("It's Wedsnesday");
        break;
        case '4' :
        System.out.println("It's Thursday");
        break;
        case '5' :
        System.out.println("It's Friyey");
        break;

        default:
        System.out.println("Tulog!");
        break;
       }
    }    
}
