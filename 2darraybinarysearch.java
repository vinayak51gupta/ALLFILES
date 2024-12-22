import java.util.*;
public class basic{
    public static void main(String args[]){
        int arr[][] = {{10,20,30,40},
                       {15,25,36,45},
                       {27,29,37,48},
                       {32,33,39,50}};
        int key = 50;
    for(int row = 0 ; row<arr.length ; row++){
     int si = 0;
     int ei = arr.length-1;
     while(si<=ei){
        int mid = (si+((ei-si)/2));
        if(arr[row][mid]==key){
            System.out.print(row+","+mid);
            break;
        }
        else if(arr[row][mid]<key){
         si = mid+1;
        }
        else{
            ei = mid-1;
        }
     }
    }
    }
}