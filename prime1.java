import java.util.*;
public class basic{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a no to check whether it is prime or not");
        int n=sc.nextInt();
        boolean isprime=true;
        for(int i=2 ; i <=Math.sqrt(n) ; i++){
            if(n%i==0){
                isprime=false;
                break;
            }
            else{
                isprime=true;
            }
        }
        if(isprime==true){
            System.out.println("no is prime");
        }
        else{
            System.out.println("no is not prime");
        }
    }
}