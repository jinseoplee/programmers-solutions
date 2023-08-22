import java.util.*;

class Solution {
    
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> ret = new ArrayList<>();
        
        for (String strNum : intStrs) {
            int num = Integer.parseInt(strNum.substring(s, s + l));
            if (num > k) ret.add(num);
        }
        
        return ret.stream().mapToInt(i -> i).toArray();
    }
    
}