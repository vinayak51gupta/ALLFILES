import java.util.*;
public class targetsum{
   public static void main(String args[]){
      ArrayList <Integer> list = new ArrayList<>();
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5);
      list.add(6);
      int target=5;
      for(int i=0 ; i<list.size()-1 ; i++){
         for(int j=(i+1) ; j<list.size() ; j++){
            if((list.get(i)+list.get(j))==target){
               System.out.println(list .get(i)+" "+list.get(j));
            }
         }
      }
   }
}