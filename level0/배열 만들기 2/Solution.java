import java.util.*;

class Solution {
    
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            if (check(i)) list.add(i);
        }
        
        return list.size() == 0 ? new int[] {-1} : list.stream().mapToInt(i -> i).toArray();
    }
    
    boolean check(int n) {
        int r = 0;
        while (n != 0) {
            r = n % 10;
            if (!(r == 0 || r == 5)) return false;
            n /= 10;
        }
        return true;
    }
}