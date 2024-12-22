import java.util.*;
public class basic{
    public static int pattern(String marks[],String n){
        for(int i=0 ; i<marks.length ; i++){
            if(marks[i]==n){
                return i;
            }
        }
        return -1;
    }
public static void main(String args[]){
    String marks[]={"chole","kulcha","paneer","bread","pastry"};
    String n="halwa";
    int index = pattern(marks,n);
    System.out.print(index);
}
}