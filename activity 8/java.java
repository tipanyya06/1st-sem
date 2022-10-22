import java.util.Scanner;
import java.util.Random;
public class java {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int c1 = ran.nextInt(6)+1;
		int c2 = ran.nextInt(6)+1;
	    int c3 = ran.nextInt(6)+1;
		
		System.out.println("Welcome to Java's Color Game!");
		System.out.println("Please select the color of your choice: ");
		System.out.println("[1]-Red\n[2]-Blue\n[3]-Green\n[4]-Yellow\n[5]-White\n[6]-Pink");
		System.out.print("Enter your choice here: " );
		int choice = sc.nextInt();
		
		if (choice == 1){
			System.out.println("You choose Red!");
		}
		else if (choice == 2){
			System.out.println("You choose Blue!");
		}
		else if (choice == 3){
			System.out.println("You choose Green!");
		}
	    else if (choice == 4){
			System.out.println("You choose Yellow!");
		}
		else if (choice == 5){
			System.out.println("You choose White!");
		}
		else if (choice == 6){
			System.out.println("You choose Pink!");
		}	else if (choice  > 6 || choice == 0){
			System.out.println("Invalid Color!");
			System.exit(0);
		}
		
		System.out.print("Place a bet for that color: ");
		int bet = sc.nextInt();
		
		System.out.print("Start rolling? [Y/N]: ");
		char start = sc.next().charAt(0);
				
		if (start == 'Y' || start == 'y' ){System.out.println("The three combination are: ");
		
		switch(c1){
		case 1: System.out.print("Red, "); break;	
		case 2: System.out.print("Blue, "); break;
		case 3: System.out.print("Green, "); break;	
		case 4: System.out.print("Yellow, "); break;	
		case 5: System.out.print("White, "); break;	
		case 6: System.out.print("Pink, "); break;
		}
		
		switch(c2){
    	case 1: System.out.print("Red, "); break;	
		case 2: System.out.print("Blue, "); break;
		case 3: System.out.print( "Green, "); break;	
		case 4: System.out.print("Yellow, "); break;	
		case 5: System.out.print("White, "); break;	
		case 6: System.out.print("Pink, "); break;
		}
		
		switch(c3){
		case 1: System.out.print("and Red "); break;	
		case 2: System.out.print("and Blue "); break;
		case 3: System.out.print("and Green "); break;
		case 4: System.out.print("and Yellow "); break;
		case 5: System.out.print("and White "); break;	
		case 6: System.out.print("and Pink "); break;
    	default: System.out.println("Invalid number");
    	break;
		}
		
		int total;
    	System.out.println("");
        if(choice == c1 || choice == c2 || choice == c3){
        total = bet * 2;
        System.out.println("You won " + total + "!" +" Congratulations!");
   		System.out.println("---------- End of Program ----------");
	 	System.exit(0);
			            }
		else if(choice == c1 && choice == c2){
        total = bet * 3;
        System.out.println("You won " + total + "!" +" Congratulations!");
   		System.out.println("---------- End of Program ----------");
	 	System.exit(0);
			            }
		else if(choice == c2 && choice == c3){
        total = bet * 3;
    	System.out.println("You won " + total + "!" +" Congratulations!");
   	 	System.out.println("---------- End of Program ----------");
	 	System.exit(0);
			            }
		else if(choice == c1 && choice == c3){
        total = bet * 3;
        System.out.println("You won " + total + "!" +" Congratulations!");
   	 	System.out.println("---------- End of Program ----------");
	 	System.exit(0);
			            }
		else if(choice == c1 && choice == c2 && choice == c3){
        total = bet * 4;
        System.out.println("You won " + total + "!" +" Congratulations!");
   	  	System.out.println("---------- End of Program ----------");
	 	System.exit(0);
			            }
		 else{
	    System. out.println("You lose!");
	    System.out.println("---------- End of Program ----------");
        System.exit(0);
				        }
		}
		
		else  if(start == 'N' || start == 'n' ){System.out.println("Thankyou for Playing!"); 
		}
		else  {System.out.println("invalid input");
		}		
	}
}