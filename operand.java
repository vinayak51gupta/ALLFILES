import java.util.*;
public class operand{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter both nos");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int large;
    large = (a>b) ? a : b ;
    System.out.print(large);
}
}