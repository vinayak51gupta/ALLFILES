import java.util.*;
public class stringcompression{
  public static void main(String args[]){
   String name="aaaabbbccccccddd";
   StringBuilder sb = new StringBuilder("");
   char ch=name.charAt(0);
   int no=1;
   for(int i=1 ; i<name.length() ; i++){
    if(ch==name.charAt(i)){
      no++;
    }
    else{
      sb.append(ch);
      if(no>1){
      sb.append(no);
      }
      no=1;
      ch=name.charAt(i);
    }
   }
   sb.append(ch);
   if(no>1){
   sb.append(no);
   }
   System.out.print("String compression = "+sb);
  }
}