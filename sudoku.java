import java.util.*;
public class sudoku{
   public static void print(int board[][] , int row , int col , int no){
      if(no==10){
         return;
      }
      board[row][col]=no;
      if(check(board , row , col , no)){
         return;
      }
      else{
         board[row][col]=0;
         print(board, row, col, no+1);
      }
   }
   public static boolean check(int board[][] , int row , int col , int no){
      for(int j=0 ; j<board.length ; j++){
         if(j!=col){
            if(board[row][col]==board[row][j]){
               return false;
            }
         }
      }
      for(int i=0 ; i<board.length ; i++){
         if(i!=row){
            if(board[row][col]==board[i][col]){
               return false;
            }
         }
      }
         int sr = (row/3)*3;
         int sc = (col/3)*3;
         for(int h=sr ; h<(sr+3) ; h++){
            for(int q=sc ; q<(sc+3) ; q++){
               if(h!=row && q!=col){
                  if(board[row][col]==board[h][q]){
                     return false;
                  }
               }
            }
         }
         return true;
      }
      public static void result(int board[][]){
         for(int i=0 ; i<board.length ; i++){
            for(int j=0 ; j<board.length ; j++){
               System.out.print(board[i][j]+" ");
            }
            System.out.println();
         }
      }
   public static void main(String args[]){
      int board [][]={{0,0,8,0,0,0,0,0,0},
                      {4,9,0,1,5,7,0,0,2},
                      {0,0,3,0,0,4,1,9,0},
                      {1,8,5,0,6,0,0,2,0},
                      {0,0,0,0,2,0,0,6,0},
                      {9,6,0,4,0,5,3,0,0},
                      {0,3,0,0,7,2,0,0,4},
                      {0,4,9,0,3,0,0,5,7},
                      {8,2,7,0,0,9,0,1,3}};
   for(int i=0 ; i<board.length ; i++){
      for(int j=0 ; j<board.length ; j++){
         if(board[i][j]==0){
         print(board , i , j , 1);
         }
         else{
            continue;
         }
      }
   }
   result(board);
}
}