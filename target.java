import java.util.*;
public class target{
    public static void main(String args[]){
        ArrayList <Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(1);
        list.add(2);
        list.add(3);
        int max = Integer.MIN_VALUE;
        int rp = 0;
        for(int i = 0 ; i<list.size() ; i++){
            if(max<list.get(i)){
                max = list.get(i);
                rp = i;
            }
        }
        int lp = rp+1;
        int key = 8;
        while(lp!=rp){
            if((list.get(lp)+list.get(rp))==key){
                System.out.println(list.get(lp)+","+list.get(rp)+" at index "+lp+","+rp);
                if(lp!=list.size()-1){
                lp++;
                }else{
                    rp--;
                }
            }
            else if((list.get(lp)+list.get(rp))>key){
                if(rp==0){
                    rp=list.size()-1;
                }
                else{
                    rp--;
                }
            }
            else{
                if(lp==list.size()-1){
                    lp=0;
                }
                else{
                    lp++;
                }
            }
        }
    }
}