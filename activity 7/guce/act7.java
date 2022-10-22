import java.util.Scanner;
import java.util.Random;

public class act7 {
    public static void main(String[] args) {
        Random ran = new Random();
        
        int ans=0;
        int guess;

        Scanner sc = new Scanner(System.in);
        int rn1 = ran.nextInt(100)+1;
        int rn2 = ran.nextInt(100)+1;
        int operator = ran.nextInt(4)+1;

        System.out.println("Welcome to Math Test!");
        switch(operator){
            case 1:
            System.out.println(rn1 +"+"+ rn2+"=");
            ans = rn1 + rn2;
            break;
            case 2:
            System.out.println(rn1 +"-"+ rn2+"=");
            ans = rn1 - rn2; 
            break;
            case 3:
            System.out.println(rn1 +"*"+ rn2+"=");
            ans = rn1 * rn2; 
            break;
            case 4:
            System.out.println(rn1+"/"+rn2+"=");
            ans = rn1/rn2; 
            break;
            }
        System.out.println("Enter your aswwer: ");
        guess= sc.nextInt();
        if(guess != ans){
            System.out.println("Wrong!");
        }
        else if(guess == ans){
            System.out.println("Congratulations! You've got the correct answah!");
            
        }
    }
        
    }
