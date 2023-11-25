package CodSoft.Task3;

// import java.util.HashMap;
// import java.util.Map;
import java.util.Scanner;

public class ATM {
    private int amount;
    int total;
    Bank ob_Bank;
    Store obStore=new Store();
    ATM(int id){
         this.total = obStore.user.get(id);
    }
    public void deposit(Scanner ob){
                 try{ System.out.println("Enter the amount to be loaded");
                   amount=ob.nextInt();
                 if(amount>10000)
                 System.out.println("Please load below 10000");
                 else
                 {
                    total+=amount;
                    System.out.println("Amount loaded successfully");
                 }
                }
                 finally{
                    ob.nextLine();
                 }
    }

    public void withdraw(Scanner ob){
        amount=ob.nextInt();
        if(amount>total){
            System.out.println("You don't have so much amount");
        }
        else{
            total-=amount;
            System.out.println("Debited successfully");
        }
    }

    public void display(){
            System.out.println("the rest amount or hte balance is "+total);
    }
        
}
