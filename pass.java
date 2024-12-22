import java.util.*;
public class pass{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter marks = ");
        float marks=sc.nextFloat();
        String name = (marks>=33)?"pass":"fail";
        System.out.print(name);
    }
}