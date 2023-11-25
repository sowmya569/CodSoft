package CodSoft;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
   
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the total subjects!");
        int total=ob.nextInt();
        int mark=0;
        float percent=0.0f;
        List<Integer> marks=new ArrayList<>();
        for(int i=1;i<=total;i++){
            System.out.println("Enter the subject "+i+" marks");
            mark=ob.nextInt();
            if(mark>=0 && mark<=100)
            marks.add(mark); 
        }
        int avg=0;
        int sum=0;
        for(int i:marks){
            sum+=i;
        }
        avg=sum/marks.size();
        System.out.println("Your average marks in total is "+avg);
        System.out.println("The total marks is "+sum+" out of "+(total*100));
        percent=sum/total;
        System.out.println("The total percentage is "+percent);
        if(percent<=100 && percent>90){
            System.out.println("A+:Outstanding");
        }
        else if(percent<=90 && percent>80){
            System.out.println("A:Excellent");
        }
        else if(percent<=80 && percent>70){
            System.out.println("B:Good");
        }
        else if(percent<=70 &&percent>60){
            System.out.println("C:Work Hard");
        }
        else{
            System.out.println("D:Work more to qualify");
        }
         ob.close(); 
    }
  
}
