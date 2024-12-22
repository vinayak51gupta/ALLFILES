import java.util.*;
public class prime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no=");
        int no2=sc.nextInt();
        for(int no=2 ; no<no2 ; no++){
            if(no2%no==0){
                break;
            }
            else{
                System.out.print("no is prime");
            }
            System.out.println("no is not prime");
        }
    }
}
