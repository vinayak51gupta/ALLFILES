import java.util.*;
public class nums{
    public static void check(int nums[]){
        boolean isprime=true;
        for(int i=0 ; i<nums.length-1 ; i++){
            for(int j=i+1 ; j<nums.length ; j++){
                if(nums[i]==nums[j]){
                    isprime=true;
                    break;
                }
                else{
                    isprime=false;
                }
            }
            if(isprime==true){
                break;
            }
        }
        System.out.print(isprime);
    }
    public static void main(String args[]){
        int nums[] = {1,1,1,3,3,4,3,2,4,2};
        check(nums);
    }
}