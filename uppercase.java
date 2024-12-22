import java.util.*;
public class uupercase{
 public static void main(String args[]){
    String name="hi my name is vinayak";
    String upper="";
    for(int i=0 ; i<name.length() ; i++){
        int a=(int)name.charAt(i);
        a-=32;
        upper +=(char)a;
    }
    System.out.print(upper);
 }
}