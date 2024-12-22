import java.util.*;
public class swap{
 public static void main(String args[]){
    int no=10;
    int i=0;
    int j=1;
    int k=-5;
    int l=-6;
    if((no&(1<<j))==0){
        k=0;
    }
    else{
        k=1;
    }
    if((no&(1<<i))==0){
        l=0;
    }
    else{
        l=1;
    }
    if(k==l){
        System.out.print("both nos are equal");
    }else{
    if(k==0){
        no=(no&(~(1<<i)));
        no=(no|(1<<j));
    }
    else{
        no=(no|(1<<i));
        no=(no&(~(1<<j)));
    }
}
    System.out.print(no);
 }
}