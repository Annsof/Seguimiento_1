public class Average {
    public double aver(int[] arr, int index, double acomulador) {
        //casos base
        if (index==arr.length){
            return (acomulador/arr.length);
        }
        //llamados recursivos
        return aver(arr, index+1,acomulador+arr[index]);
    }
}
