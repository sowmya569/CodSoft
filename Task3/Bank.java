package CodSoft.Task3;

import java.util.Random;
import java.util.Scanner;

public class Bank {

    private int amount=0;
    private int id;
    Store ob_store=new Store();

    public void create_account(){
        ATM ob_atm;
        System.out.println("Enter your name");
        Scanner ob=new Scanner(System.in);
        String name=ob.next();
        // Random rand_id=new Random();
        System.out.println("Enter the id");
        int your_id=ob.nextInt();
        System.out.println("This is your id "+your_id);
        System.out.println("Enter an initial amount of 1000 in your account");
        amount=ob.nextInt();
        ob_store.user.put(your_id,amount);
        ob_atm=new ATM(your_id);
        System.out.println("Account Successfully Created!!");
        }

        public int get_Amount(){
            return amount;
        }

       public int get_Id(){
        return id;
       }
}