import java.util.*;
public class basic{
    public static void main(String args[]){
        int no1 = 24;
        int no2 = 36;
        int i = 2;
        int j = 2;
        ArrayList <Integer> list1 = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<>();
        while(no1 != 1){
            if(no1%i==0){
                list1.add(i);
                no1 = no1/i;
            }
            else{
                i++;
            }
        }
        while(no2 != 1){
            if(no2%j==0){
                list2.add(j);
                no2 = no2/j;
            }
            else{
                j++;
            }
        }
        int result = 1;
        for(int a = 0 ; a<list1.size() ; a++){
            for(int b = 0 ; b<list2.size() ; b++){
                if(list1.get(a)==list2.get(b)){
                    result = result*list1.get(a);
                    list1.remove(a);
                    list2.remove(b);
                    break;
                }
            }
        }
       
    }
}