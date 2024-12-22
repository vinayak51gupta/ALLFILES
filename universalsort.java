import java.util.*;
public class universalsort{
  public static void bubblesort(int marks[]){
   for(int turn=0 ; turn<marks.length ; turn++){
    for(int j=0 ; j<marks.length-1-turn ; j++){
      if(marks[j]>marks[j+1]){
        int temp=marks[j];
        marks[j]=marks[j+1];
        marks[j+1]=temp;
      }
    }
   }
   for(int i=0 ; i<marks.length ; i++){
    System.out.print(marks[i]+" ");
   }
  }
  public static void selectionsort(int marks[]){
    int min=Integer.MIN_VALUE;
    int minpos=0;
   for(int turn=0 ; turn<marks.length ; turn++){
    for(int j=turn ; j<marks.length ; j++){
      if(min<marks[j]){
        min=marks[j];
        minpos=j;
      }
    }
    int temp=marks[turn];
    marks[turn]=marks[minpos];
    marks[minpos]=temp;
    min=Integer.MIN_VALUE;
   }
   for(int i=0;i<marks.length ; i++){
    System.out.print(marks[i]+" ");
   }
  }
  public static void insertionsort(int marks[]){
   for(int turn=0 ; turn<marks.length-1 ; turn++){
    for(int j=turn+1 ; j>0 ; j--){
      if(marks[j-1]>marks[j]){
        int temp=marks[j-1];
        marks[j-1]=marks[j];
        marks[j]=temp;
      }
    }
   }
   for(int i=0 ; i<marks.length ; i++){
    System.out.print(marks[i]+" ");
   }
  }
  public static void countingsort(int marks[]){
   int count[]=new int[marks.length];
   for(int turn=0 ; turn<count.length ; turn++){
    count[marks[turn]]++;
   }
   int j=0;
   for(int i=count.length-1 ;i>=0 ; i--){
    while(count[i]>0){
      marks[j]=i;
      j++;
      count[i]--;
    }
   }
   for(int k=0 ; k<marks.length ; k++){
    System.out.print(marks[k]+" ");
   }
  }
  public static void main(String args[]){
    int marks[]={1,4,1,3,2,4,3,7};
    countingsort(marks);
  }
}