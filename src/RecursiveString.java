public class RecursiveString {
    public String revertir(String word, int index) {
        //casos base
        String result="";
        if (index==-1){
            return result;
        }
        //llamados recursivos
        char letter =  word.charAt(index);
        result=result+letter;
        return result + revertir(word, index-1);
    }
    public String revert (String s, int index, String acu){
        if(index==-1){
            return "";
        }
        return revert(s, index -1,acu+s.charAt(index));
    }
}
