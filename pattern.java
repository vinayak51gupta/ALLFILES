import java.util.*;
public class basic{
    public static void pattern(int totrow){
        for(int i=1 ; i<=totrow ; i++){
            for(int j=1 ; j<=(totrow-i) ; j++){
            System.out.print(" ");
            }
        //stars
        for(int j=1 ; j<= 2*i-1 ; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=totrow ; i>=1 ; i--){
        for(int j=1 ; j<=(totrow-i) ; j++){
            System.out.print(" ");
            }
        //stars
        for(int j=1 ; j<= 2*i-1 ; j++){
            System.out.print("*");
        }
     System.out.println();
    }
}
    public static void main(String args[]){
        pattern(5);
    }
}