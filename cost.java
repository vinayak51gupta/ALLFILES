import java.util.*;
public class cost{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the cost of pencil=");
        float pencil = sc.nextFloat();
        System.out.print("enter the cost of pen=");
        float pen = sc.nextFloat();
        System.out.print("enter the cost of eraser=");
        float eraser = sc.nextFloat();
        float cost = pencil+pen+eraser;
        System.out.print("total cost will be=");
        System.out.print(cost);
        double ac = cost+(0.18*cost);
        System.out.print("\ntotal cost after applying gst will be=");
        System.out.print(ac);
    }
}
