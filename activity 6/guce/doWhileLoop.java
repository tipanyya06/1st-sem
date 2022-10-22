import java.util.Scanner;
import java.util.Random;
public class doWhileLoop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int rn;
        int guess;
        rn = ran.nextInt(100)+1;
        System.out.println("Welcome to guess the number game!");
        do{
        System.out.println("Enter your guess: ");
        guess = sc.nextInt();
        if(guess < rn){
            System.out.println("Make it Higher!");
        }
        else if(guess > rn){
            System.out.println("Lower Dadey!");
        }
        else if(guess == rn){
            System.out.println("Congratulations! You've got the correct answah!");
        }
    }while(guess!=rn);
    }
}