import java.util.*;
public class insert{
      public static void pattern(int marks[]){
        for(int turn=0 ; turn<marks.length-1 ; turn++){
            for(int j=turn+1; j>0 ; j--){
                if(marks[j-1]>marks[j]){
                  int temp=marks[j-1];
                  marks[j-1]=marks[j];
                  marks[j]=temp;
                }
        }
      }
    }
      public static void insertion(int marks[]){
        for(int i=0 ; i<marks.length ; i++){
            System.out.print(marks[i]+" ");
        }
      }
      public static void main(String args[]){
        int marks[]={5,4,3,2,1};
        pattern(marks);
        insertion(marks);
      }
}