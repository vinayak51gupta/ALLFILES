import java.util.*;
public class basic{
   public static void main(String args[]){
      StringBuffer str1=new StringBuffer("eleven plus two");
      StringBuffer str2=new StringBuffer("twelve plus one");
      for(int i=0 ; i<str1.length() ; i++){
         if(str1.charAt(i)==' '){
            str1.delete(i, i+1);
         }
      }
      for(int j=0 ; j<str2.length() ; j++){
         if(str2.charAt(j)==' '){
         str2.delete(j , j+1);
         }
      }
      for(int i=0 ; i<str1.length() ; i++){
         for(int j=0 ; j<str2.length() ; j++){
            if(str1.charAt(i)==str2.charAt(j)){
               str2.delete(j,j+1);
               break;
            }
         }
      }
      if(str2.toString().equals("")){
         System.out.print("both are anagrams");
      }
      else{
         System.out.print("wrong answer");
      }
   }
}