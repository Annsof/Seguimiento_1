import java.util.ArrayList;

public class RecursiveSum {
    public int sum(int[] arr, int index, int acomulador) {
        //casos base
        if (index==arr.length){
            return acomulador;
        }
        //llamados recursivos
        return sum(arr, index+1,acomulador+arr[index]);
    }
    public int sum (int[] arr, int index){
        if (index==arr.length){
            return 0;
        }
        return arr[index]+ sum(arr,index+1);
    }
}