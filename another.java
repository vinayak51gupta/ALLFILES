import java.util.*;
public class basic{
    public static void pattern(int marks[]){
       int no[]=new int[marks.length];
       int j=0;
       for(int i=marks.length-1 ; i>=0 ; i--){
        no[j]=marks[i];
        j++;
       }
       for(int i=0 ; i<marks.length ; i++){
        System.out.print(no[i]+"  ");
       }
    }
    public static void main(String args[]){
        int marks[]={97,98,99,1,2,3,10000,1000000,0,4,6,7};
        pattern(marks);
    }
}