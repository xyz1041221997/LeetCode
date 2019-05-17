package may.day.day15;

public class Palindrome_9 {
    public boolean isPalindrome(int x) {
      String s = x + "";
      char[] chars = s.toCharArray();
      String s2 = "";
      for(int i = chars.length - 1;i >= 0;i--){
          s2 += chars[i];
      }
      if(s.equals(s2)){
          return  true;
      }else{
          return false;
      }
    }
}
