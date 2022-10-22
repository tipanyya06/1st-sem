import java.util.*;
public class sample2 {

    public static void main(String[] args){
    Scanner sc = new Scanner (System.in);

    int num = 0;
    int total= 0;

    while(num<=10){
        total +=num;
        System.out.println("Enter num: ");
        num=sc.nextInt();
        System.out.println("Value of num is: "+ num);
    }
    System.out.println("The Total is "+ total);
    }
}   
