import java.util.*;
public class increment{
 public static void main(String args[]){
    int no=7;
    int i=0;
    while(true){ //if previous no is not power of two
    if((no&(1<<i))!=0){
        no=(no&(~(1<<i)));
        i++;
    }
    else{
        no=(no|(1<<i));
        break;
    }
}
System.out.print(no);
 }
}