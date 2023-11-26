package CodSoft.Task3;

import java.util.Scanner;

public class ATM {
    private int amount;
    int total;
    int id;
    Bank ob_Bank;
    Store obStore=new Store();
    ATM(int id){
        this.id=id;
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
                    obStore.user.put(id, total);
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
        obStore.user.put(id, total);
    }

    public void display(){
            System.out.println("Your ID: "+id+" amount: "+obStore.user.get(id));
    }
        
    public void Transfer(int id,Scanner ob1){
           System.out.println("Enter the receiver id");
           int receiver_id=ob1.nextInt();
           int cash=0;
           if(obStore.verifing(receiver_id)){
            System.out.println("Enter the amount to be transferred!");
            cash=ob1.nextInt();
            if(cash<=obStore.user.get(id)){
                int total=obStore.get_Amount(receiver_id);
                total+=cash;
                obStore.user.put(receiver_id,total);
                int sender_amount=obStore.get_Amount(id);
                sender_amount-=cash;
                obStore.user.put(id, sender_amount);
            }else{
                System.out.println("the receiver id doesn't exist");
                System.out.println("Please verfiy once Again!");
            }
         }
    }
}
