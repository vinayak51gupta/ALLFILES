import java.util.*;
public class basic{
    public static void trapwater(int marks[]){
        int sum=0;
        int tw;
        int min=0;
        for(int i=0 ; i<marks.length ; i++){
            int lb=Integer.MIN_VALUE;
            int rb=Integer.MIN_VALUE;
            if(i==0){
                lb=marks[0];
            }
            else{
                for(int j=0 ; j<i ; j++){
                    if(lb<marks[j]){
                        lb=marks[j];
                    }
                }
            }
            if(i==marks.length-1){
                rb=marks[marks.length-1];
            }
            else{
                for(int k=i+1 ; k<marks.length ; k++){
                    if(rb<marks[k]){
                        rb=marks[k];
                    }
                }
            }
            if(lb<rb){
                min=lb;
            }
            else{
                min=rb;
            }
            tw=min-marks[i];
            if(tw<0){
                tw=0;
            }
            sum=sum+tw;
        }
        System.out.print("water trapped will be ="+sum);
    }
    public static void main(String args[]){
        int marks[] = {4,2,0,3,2,5};
        trapwater(marks);
    }
}