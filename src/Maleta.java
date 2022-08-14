import java.util.Arrays;
import java.util.Collections;

//I have not tried all the possible conditions, probably in some orders it does not give the expected result but it is a first attempt!
public class Maleta {
    public String maleta(Integer[] items,int[] bag,int target){
        String out = "";
        boolean flag1=true;
        boolean flag2=true;
        Arrays.sort(items, Collections.reverseOrder());
        for(int i=0;i<items.length && flag1;i++){
            if(items[i]!=0){
                for(int j=0;j<bag.length && flag2;j++){
                    if(bag[j]==0){
                        bag[j]=items[i];
                        flag2=false;
                    }
                }
                items = Arrays.copyOfRange(items, 1, items.length);
                flag1=false;
            }
        }

        int sum=0;
        for (int i : bag) {
            sum += i;
        }
        if(sum==target){
            out+="A possible combination could be found! Those are:";
            for (int i : bag) {
                if(i!=0) {
                    out += "[" + i + "] ";
                }
            }
            return out;
        }
        if (sum > target){
            for(int j=bag.length-1;j>0 && (sum > target);j--){
                if(bag[j]!=0){
                    bag[j]=0;
                    sum=0;
                    for (int i : bag) {
                        sum += i;
                    }

                }
            }
        }
        if (0==items.length){
            out="A possible combination could not be found :(!";
            return out;
        }
        return  maleta(items,bag,target);
    }
}
