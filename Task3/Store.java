package CodSoft.Task3;

import java.util.HashMap;
import java.util.Map;

public class Store {
    
    public static  Map<Integer,Integer> user=new HashMap<>();

     public boolean verifing(int id){
       return user.containsKey(id);
}

public void get_userList(){
    for(Map.Entry<Integer,Integer> user_list:user.entrySet()){
        System.out.println("ID: "+user_list.getKey()+"\nAmount: "+user_list.getValue());
    }
}

public int get_Amount(int id){
    return user.get(id);
}

}
