import java.util.*;
public class basic{
   public static void print(int n  , String str){
      if(n==0){
         return ;
      }
      print(n-1 , str);
      int a=n;
      boolean isprime=true;
      while(a>0){
         if((a&1)==1){
            a=a>>1;
            if((a&1)==1){
               isprime=false;
               break;
            }
         }
         else{
            isprime=true;
         }
         a=a>>1;
      }
      if(isprime==true){
         str+=Integer.toBinaryString(n)+" ";
         System.out.print(str);
      }
      
   } 
   public static void main(String args[]){
      int n=10;
      String str="";
      print(n , str);
      System.out.print(str);
   }
}


