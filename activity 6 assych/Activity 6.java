import java.util.Scanner;
    public class Act6
    {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second number: ");
        int num2 = sc.nextInt();

        int sum = num1+num2;
        int diff = num1-num2;
        int prdct = num1*num2;
        int qtnt = num1/num2;

        if(num1 > 0 && num2 > 0){
        System.out.println("Choose Operation: ");
        System.out.println("[S]-Sum");
        System.out.println("[D]-Difference");
        System.out.println("[P]-Product");
        System.out.println("[Q]-Quotient");
        char choice = sc.next().charAt(0);

        System.out.println("Your choice: "+ choice);
        switch(choice){
            case 'S':
            System.out.println("You choose to add the two numbers, the answer is " + sum);
            break;
            case 's':
            System.out.println("You choose to add the two numbers, the answer is " + sum);
            break;
            case 'D':
            System.out.println("You choose to subtract the two numbers, the answer is " + diff);
            break;
            case 'd':
            System.out.println("You choose to subtract the two numbers, the answer is " + diff);
            break;
            case 'P':
            System.out.println("You choose to multiply the two numbers, the answer is " + prdct);
            break;
            case 'p':
            System.out.println("You choose to multiply the two numbers, the answer is " + prdct);
            break;
            case 'Q':
            System.out.println("You choose to divide the two numbers, the answer is " + qtnt);
            break; 
            case 'q':
            System.out.println("You choose to divide the two numbers, the answer is " + qtnt);
            break; 

            default:
            System.out.println("Invalid Operation");
            break; 
        }   
        }
        else {
            System.out.println("invalid Number");
        }
       
    
    }
        }