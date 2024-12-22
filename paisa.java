import java.util.*;
public class paisa{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float income,tax;
        System.out.print("enter your income=");
        income=sc.nextFloat();
        if(income<500000){
            System.out.print("no tax is applicable");}
            else if(income>=500000 && income<=1000000){
                System.out.print("tax will be=");
                tax = 0.2f*income;
            System.out.print(tax);}
                else{
                    tax = 0.3f*income;
                    System.out.print(tax);
                }
    }
}