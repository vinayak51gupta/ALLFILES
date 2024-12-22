import java.util.*;
public class transpose{
 public static void main(String args[]){
  int marks[][]={{1,4},{2,5},{3,6}};
  int matrix[][]=new int[marks[0].length][marks.length];
  pattern(marks,matrix);
 }
 public static void pattern(int marks[][],int matrix[][]){
  for(int row=0 ; row<marks.length ; row++){
    for(int col=0 ; col<marks[0].length ; col++){
      matrix[col][row]=marks[row][col];
    }
  }
  for(int row=0 ; row<matrix.length ; row++){
    for(int col=0  ;col<matrix[0].length ; col++){
      System.out.print(matrix[row][col]+" ");
    }
    System.out.println();
  }
 }
}