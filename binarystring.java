import java.util.*;
public class binarystring{
   public static void print(String name , int no , int n){
    int count=0;
      if(n>no){
      return;
    }
    name+=Integer.toBinaryString(n);
    for(int i=1 ; i<name.length(); i++){
      for(int j=i-1 ;j<i ; j++){
         if(name.charAt(j)=='1'){
            if(name.charAt(i)==name.charAt(j)){
               count++;
            }
         }
      }
    }
    if(count==0){
      System.out.print(name+" ");
    }
    name="";
    print(name , no, n+1);
   }
   public static void main(String args[]){
      String name="";
      int no=15;
      int n=0;
      print(name , no , n);
   }
}