import java.util.*;
public class duplicate{
    public static void print(String name , StringBuilder sb, int n){
        if(n==name.length()){
            return;
        }    
        int count=0;
     for(int i=(n-1) ; i>=0 ; i--){
        if(name.charAt(n)==name.charAt(i)){
            count++;
        }
     }
     if(count==0){
        sb.append(name.charAt(n));
     }
     print(name,sb,n+1);
    }
    public static void main(String args[]){
        int n=0;
        String name="appnnacollege";
        StringBuilder sb = new StringBuilder("");
        print(name,sb,n);
        System.out.print(sb);
    }
}