class Solution {
    
    public int solution(String[] strArr) {
        int[] arr = new int[31];
        int max = 0;

        for (int i = 0; i < strArr.length; i++) {
            arr[strArr[i].length()]++;
        }
        
        for (int i = 1; i < 31; i++) {
            max = Math.max(max, arr[i]);
        }
        
        return max;
    }
    
}