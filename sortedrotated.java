import java.util.*;
public class sortedrotated{
   public static void main(String args[]){
      int arr[]={4,5,6,7,0,1,2};
      int si=0;
      int ei=arr.length-1;
      int target=2;
      while(si<=ei){
         int mid = (si+(ei-si)/2);
         if(arr[si]<=target && target<=arr[mid]){
            if(arr[mid]==target){
               System.out.print(mid);
               break;
            }
            else{
            ei = mid-1;
            continue;  
            }
         }
         else{
            si = mid+1;
            continue;
         }
      }
   }
}