import java.util.*;
public class week{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no 1-7");
        int number=sc.nextInt();
        switch(number){
            case 1 :System.out.print("sunday");
            break;
            case 2 :System.out.print("monday");
            break;
            case 3 :System.out.print("tuesday");
            break;
            case 4 :System.out.print("wednesday");
            break;
            case 5 :System.out.print("thursday");
            break;
            case 6 :System.out.print("friday");
            break;
            case 7 :System.out.print("saturday");
            break;
        default: System.out.print("wrong no");    
        }
    }

}
