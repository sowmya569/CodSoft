package CodSoft.Task3;

import java.util.Random;
import java.util.Scanner;

public class Bank {

    private int amount=0;
    private int id;
    Store ob_store=new Store();

    public void create_account(){
        System.out.println("Enter your name");
        Scanner ob=new Scanner(System.in);
        String name=ob.next();
        Random rand_id=new Random();
        System.out.println("Enter the id");
        int your_id=rand_id.nextInt();
        System.out.println("This is your id "+your_id);
        System.out.println("Enter an initial amount of 1000 in your account");
        amount=ob.nextInt();
        ob_store.user.put(your_id,amount);
        ob_store.get_userList();
        System.out.println("Account Successfully Created!!");
        }
}