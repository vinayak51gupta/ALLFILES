import java.util.*;
public class Nbinarystring{
    public static void recursion(String str , int no){
        if(no==-1){
         return;
        }
        recursion(str, no-1);
        int ld = no;
        boolean isprime = true;
        while(ld>0){
            if((ld&1)==1){
                ld = ld>>1;
                if((ld&1)==1){
                    isprime = false;
                    break;
                }
            }
            else{
                ld = ld>>1;
            }
        }
        if(isprime==true){
         str = str+Integer.toBinaryString(no)+" ";
         System.out.print(str);
        }      
    }
    public static void main(String args[]){
    recursion("" , 20);
    }
}