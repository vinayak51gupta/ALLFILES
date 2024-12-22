import java.util.*;
public class basic{
    public static void pattern(int n){
        for(int row=1 ; row<=n/2 ; row++){
                for(int stars=1 ; stars<=row ; stars++){
                    System.out.print("*");
                }
                for(int space=(n-2*row) ; space>0 ; space--){
                    System.out.print(" ");
                }
                for(int star=1 ; star<=row ; star++){
                    System.out.print("*");
                }
                System.out.println();
        }
        for(int row=n/2 ; row>0 ; row--){
            for(int stars=1 ; stars<=row ; stars++){
                System.out.print("*");
            }
            for(int space=(n-2*row) ; space>0 ; space--){
                System.out.print(" ");
            }
            for(int star=1 ; star<=row ; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        pattern(8);
    }
}