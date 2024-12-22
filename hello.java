import java.util.*;
public class hello{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the radius of circle");
        int r = sc.nextInt();
        float area = 3.14f*r*r;
        System.out.print("area will be = ");
        System.out.print(area);
    }
}