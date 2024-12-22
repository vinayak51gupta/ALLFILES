import java.util.*;
public class basice{
    public static void print(int i , int j){
        if(i==5){
            return ;
        }
        if(j==5){
            i=i+1;
            j=i;
            print(i , j);
        }
     System.out.print(i+","+j+"  ");
     print(i,j+1);
    }
public static void main(String args[]){
 int i=0;
 int j=0;
 print(i , j);
}
}