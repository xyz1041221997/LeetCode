package may.day;

public class IntArray {
    public boolean space(int[] array){
        int l = array.length;
        int sum = 0;
        for(int i = 0;i < l;i++){
            sum += array[i];
        }
        if(sum%2 != 0){
            return false;
        }
        return true;
    }
}
