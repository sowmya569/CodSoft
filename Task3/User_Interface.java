package CodSoft.Task3;

import java.util.Scanner;

public class User_Interface {
    public static void main(String[] args) {
        Bank bank=new Bank();
        Scanner ob=new Scanner(System.in);
        System.out.println("\t\t\tWelcome to your Bank!!");
        System.out.println("\t\t\tFeel Safe with us and about your money");
        int id_verification=0;
        int flag=0;
        int id=0;
        while (true) {
        System.out.println("Are you here before ?");
        boolean verify=ob.nextBoolean();
        if(verify){
            Store store=new Store();
            store.get_userList();
            System.out.println("Please enter your id");
            id_verification=ob.nextInt();
            if(store.verifing(id_verification)){       
                 ATM obAtm=new ATM(id_verification);
                System.out.println("Welcome User!!");
                System.out.println("What are you looking for?");
                System.out.println("1.Create account!");
                System.out.println("2.Deposit an amount");
                System.out.println("3.Withdraw");
                System.out.println("4.Check balance");
                System.out.println("5.Transfer");
       System.out.println("Enter your choice!!");
       int ch=ob.nextInt();
       switch (ch) {
        case 1:
            bank.create_account();
            break;
        case 2:{ 
          obAtm.deposit(ob);
        break;
    }
        case 3:{
                obAtm.withdraw(ob);
        }
        case 4:{     
              obAtm.display();
              break;
        }
        case 5:{
            obAtm.Transfer(id_verification,ob);
            break;
        }
        default:System.out.println("Enter within the provided choices!");
            break;
       }
        }
        else{
            System.out.println("Please Don't cheat!!");
            return;
        }
    }
        else{
                System.out.println("Creating an account!!");
                bank.create_account();
            }
    }
}
}