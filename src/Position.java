public class Position {
    public int finder(int[] arr, int num, int index) {
        //casos base
        if (arr[index]==num){
            return index;
        }
        if (arr.length-1==index){
            return -1;
        }
        //llamados recursivos
        return finder(arr,num,index+1);
    }
}
