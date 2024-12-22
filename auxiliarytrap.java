import java.util.*;
public class basic{
    public static void auxiliarytrap(int height[]){
        int min;
        int tw;
        int sum=0;
        int n=height.length;
        int lb[]= new int[n];
        lb[0]=height[0];
        for(int i=1;i<n;i++){
            lb[i]=Math.max(height[i],lb[i-1]);
        }
        int rb[]=new int[n];
        rb[n-1]=height[n-1];
        for(int i=n-2 ; i>=0 ; i--){
            rb[i]=Math.max(height[i],rb[i+1]);
        }
        for(int i=0 ; i<n ; i++){
            min=Math.min(lb[i],rb[i]);
            tw=min-height[i];
            sum=sum+tw;
        }
        System.out.print(sum);
    }
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        auxiliarytrap(height);
    }
}