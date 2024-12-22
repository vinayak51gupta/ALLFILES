import java.util.*;
public class tax{
    public static void main(String args[]){
        Scannner sc = new Scanner(System.in);
        System.out.print("enter your income=");
        int income=sc.nextDouble();
        if(income<500000){
            System.out.print("no tax");}
            else if(income>=500000 && income<=1000000){
                System.out.print("20%tax");}
                else{
                    System.out.print("30%tax");
                }
    }
}
