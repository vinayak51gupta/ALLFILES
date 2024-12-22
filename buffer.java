import java.util.*;
public class basic{
    public static void main(String args[]){
        String name="abcd";
        for(int i=1 ; i<name.length() ; i++){
            for(int j=i-1 ;j<i ; j++){
                System.out.print(name.substring(j, i+1)+" ");
            }
        }
    }
}