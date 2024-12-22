import java.util.*;
public class selectionsort{
      public static void pattern(int marks[]){
        int min=Integer.MAX_VALUE;
        int minpos=0;
        for(int turn=0 ; turn<marks.length ; turn++){
            for(int j=turn ; j<marks.length ; j++){
                if(min>marks[j]){
                    min=marks[j];
                    minpos=j;
                }
            }
            int temp=marks[minpos];
            marks[minpos]=marks[turn];
            marks[turn]=temp;
            min=Integer.MAX_VALUE;
        }
      }
      public static void selection(int marks[]){
        for(int i=0 ; i<marks.length ; i++){
            System.out.print(marks[i]+" ");
        }
      }
      public static void main(String args[]){
        int marks[]={5,4,3,2,1};
        pattern(marks);
        selection(marks);
      }
}