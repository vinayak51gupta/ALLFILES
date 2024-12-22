import java.util.*;
public class gridproblem{
   public static void gridboard(char grid[][] , int row , int col){
      if(row==grid.length-1 && col==grid.length-1){
         grid[row][col]='Y';
         print(grid);
         return;
      }
      if(col==grid.length | row==grid.length){
         return;
      }
      grid[row][col]='Y';
      gridboard(grid, row, col+1);
      gridboard(grid, row+1, col);
      grid[row][col]='N';
   }
   public static void print(char grid[][]){
      System.out.println("_____POSSIBLE PATH_____");
      for(int i=0 ; i<grid.length ; i++){
         for(int j=0 ; j<grid.length ; j++){
            System.out.print(grid[i][j]+" ");
         }
         System.out.println();
      }
   }
   public static void main(String args[]){
      int N=3;
      int M=3;
      char grid[][]=new char[N][M];
      for(int i=0 ; i<N ; i++){
         for(int j=0 ; j<M ; j++){
            grid[i][j]='N';
         }
        }
      gridboard(grid , 0 , 0);
   }
}