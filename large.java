import java.util.*;
public class large{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("enter the values of a and b");
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b){
            System.out.print("a is bigger");
        }
        else{
            System.out.print("b is bigger");
        }
    }
}