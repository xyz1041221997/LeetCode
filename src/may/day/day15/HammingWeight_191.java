package may.day.day15;

public class HammingWeight_191 {
    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        char[] chars = s.toCharArray();
        int sum = 0;
        for(int i = 0;i < chars.length;i++){
            if(chars[i] == '1'){
                sum++;
            }
        }
        return sum;
    }
}
