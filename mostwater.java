import java.util.*;
public class mostwater{
   public static void main(String args[]){
      ArrayList <Integer> list = new ArrayList<>();
      list.add(1); list.add(8); list.add(6); list.add(2); list.add(5); list.add(4); list.add(8); list.add(3); list.add(7);
      int lb=0;
      int rb=0;
      int sum=Integer.MIN_VALUE;
      int min=0;
      for(int i=0 ; i<list.size()-1 ; i++){
         for(int j=(i+1) ; j<list.size() ; j++){
            min=Math.min(list.get(i) , list.get(j));
            int result= min*(j-i);
            if(sum<result){
               sum=result;
               lb=i;
               rb=j;
            }
         }
      }
      System.out.print("max water will be stores in "+"("+list.get(lb)+","+list.get(rb)+")"+" and max water will="+sum);
   }
}