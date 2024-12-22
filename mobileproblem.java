import java.util.*;
public class mobileproblem{
   public static void print(String str , String str1 , int n){
      if(n==str.length()){
         return;
      }
      for(int i=0 ; i<str1.length() ; i++){
         System.out.print(str.charAt(n));
         System.out.print(str1.charAt(i)+" ");
      }
      System.out.println();
      print(str, str1, n+1);
   }
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      String str="";
      String str1="";
    System.out.print("enter a no");
    int no=sc.nextInt();
    String arr[]={"oper" , "" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"};
    if(no<10){
      str=str+arr[no];
      for(int i=0 ; i<str.length() ; i++){
         System.out.print(str.charAt(i)+" ");
      }
    }
    else{
    int ld=no%10;
    str1=str1+arr[ld];
    no=no/10;
    str=str+arr[no];
    print(str , str1 , 0);
    }
   }
}