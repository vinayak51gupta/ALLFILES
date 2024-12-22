import java.util.*;
public class basic{
    public static void pattern(int n){
        for(int row = 1 ; row<=n ; row++){
            for(int space=4 ; space>0 ; space--){
                System.out.print(" ");
                for(int stars=1 ; stars<=5 ; stars++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        pattern(4);
    }
}