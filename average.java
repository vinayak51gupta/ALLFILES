import java.util.*;
public class average{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first no");
        int a = sc.nextInt();
        System.out.print("enter second no");
        int b = sc.nextInt();
        System.out.print("enter third no");
        int c = sc.nextInt();
        double avg=(a+b+c)/2;
        System.out.print("2the average of 3 nos will be=");
        System.out.print(avg);
    }
}