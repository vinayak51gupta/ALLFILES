import java.util.*;
public class nknights{
   public static boolean issafe(char board[][] , int row , int col){
       for(int i=row-1 ; i>=0 ; i--){
        if(board[i][col]=='B'){
            return false;
        }
       }
      }
      return true;
   }
   public static void nknight(char board[][] , int row){
      if(row==board.length){
       printboard(board);
       return;
      }
      for(int j=0 ; j<board.length ; j++){
         if(issafe(board , row , j)){
         board[row][j]='B';
         nknight(board, row+1);
         board[row][j]='-';
         }
      }
   }
   public static void printboard(char board[][]){
      System.out.println("_____CHESSBOARD_____");
      for(int i=0 ; i<board.length ; i++){
         for(int j=0 ; j<board.length ; j++){
          System.out.print(board[i][j]+" ");
         }
         System.out.println();
      }
   }
   public static void main(String args[]){
      int n=3;
      char board[][]=new char[n][n];
      //initialize
      for(int i=0 ; i<n ; i++){
         for(int j=0 ; j<n ; j++){
            board[i][j]='-';
         }
      }
      nknight(board , 0);
   }
}