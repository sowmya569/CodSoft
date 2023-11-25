package CodSoft;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
        public static void main(String[] args) {
        int flag=1;
       Scanner ob=new Scanner(System.in);
    // Randomnumber ob=new Randomnumber(); 
    Random ran=new Random();
    int random_no=ran.nextInt(100);
    int count=0;
    int score=100;
    while(count<5){
      System.out.println("Enter a number!!");  
    int guess_number=ob.nextInt();
        count++;
        if(guess_number==random_no){
            System.out.println("You guessed it!!");
            System.out.println("The magic number is: "+random_no);
            flag=0;
            break;
        }
        else if(guess_number<random_no){
            System.out.println("The number is less than the magic number!");
        }
        else
        {
            System.out.println("The number is greater than the magic number!!");
        }
        score-=10;
        if(count==4){
            System.out.println("One last chance!");
        }
    }
    if(flag==0)
    System.out.println("Your score:"+score);
    else{
          System.out.println("Your score:"+score); 
          System.out.println("the magic number is"+random_no);
    }
    ob.close();
    }

}
