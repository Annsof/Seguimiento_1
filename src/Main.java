public class Main {
    public static void main(String[] args) {
        //RecursiveSum obj = new RecursiveSum();
        //System.out.println(obj.sum(new int[]{12, -1, 15, 2, 4, 14}, 0, 0));

        //RecursiveString str = new RecursiveString();
        //String s="hola hptas";
        //System.out.println(str.revertir(s,s.length()-1));

        //Average aver = new Average();
        //System.out.println(aver.aver(new int[]{1,2,3,4,5,6}, 0, 0));

        //Position posi = new Position();
        //System.out.println(posi.finder(new int[]{1,15,8,19,21,40,-4,10}, 19, 0));

        Maleta maleta = new Maleta();
        Integer[] items = new Integer[]{250,200,100,25,25,25,25};
        Integer[] items2 = new Integer[]{50,100,200,250};
        System.out.println(maleta.maleta(items2,new int[items2.length],500));
        System.out.println(maleta.maleta(items,new int[items.length],500));

    }
}