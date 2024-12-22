import java.util.*;
public class basic{
    public static void conversion(int n){
        int lastdigit , power=0 , result;
        while(n>0){
        lastdigit = n%10;
        result = lastdigit*(2^power);
        n /=10;
        power++;
        }
        System.out.print("decimal value will be=" + result);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a binary value=");
        int n=sc.nextInt();
        conversion(n);
    }
}