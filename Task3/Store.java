package CodSoft.Task3;

import java.util.HashMap;
import java.util.Map;

public class Store {
    
    Map<Integer,Integer> user=new HashMap<>();

     public boolean verifing(int id){
     if(user.containsKey(id)){
        return true;
     }
     else
     return false;
}

public void get_userList(){
    for(Map.Entry<Integer,Integer> user_list:user.entrySet()){
        System.out.println("ID: "+user_list.getKey()+"Amount: "+user_list.getValue());
    }
}
}
