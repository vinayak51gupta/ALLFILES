import java .util.*;
public class basic{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a binary no=");
        int n=sc.nextInt();
        int decimal=0 , power=0 , lastdigit ;
        while(n>0){
        lastdigit = n%10;
        decimal = decimal + lastdigit* 2^power;
        power++;
        n /=10 ;
        }
        System.out.print("\ndecimal no will be" + decimal);
    }
}