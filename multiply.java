import java.util.*;
public class basic{
    public static void main(String args[]){
        int n=7;
        for(int row=0 ; row<=n/2 ; row++){
            for(int col=0 ; col<=row ; col++){
                if(((row+col)%2==0)){
                    System.out.print("*");
                }
                else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
        for(int row=((n/2)-1) ; row>=0 ; row--){
            for(int col=0 ; col<=row ; col++){
                if(((row+col)%2==0)){
                    System.out.print("*");
                }
                else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}