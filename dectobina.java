import java.util.*;
public class basic{
    public static void dectobin(int n){
        int remainder;
        int power=0;
        int result=0;
        int decimal = n;
        while(n>0){
            remainder= n%2;
            result = result + remainder*(int)Math.pow(10,power);
            power++;
            n /=2;
        }
        System.out.print("the conversion of" + decimal + "to binary will be =" + result);
    }
    public static void main(String args[]){
        dectobin(8);
    }
}