import java.util.*;
public class contagious{
    public static void print(String name , int i){
     if(i==name.length()){
        return;
     }
        for(int j=i; j<name.length() ; j++){
        if(name.charAt(i)==name.charAt(j)){
            System.out.print(name.substring(i, j+1)+" ");
        }
     }
     print(name , i+1);
    }
    public static void main(String args[]){
        String name="aba";
        int i=0;
        print(name , i);
    }
}