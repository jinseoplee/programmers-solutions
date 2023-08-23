class Solution {
    
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();
        
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int c = (e - s + 1) / 2;
            
            for (int j = 0; j < c; j++) {
                char tmp = arr[s + j];
                arr[s + j] = arr[e - j];
                arr[e - j] = tmp;
            }
        }
        
        return String.valueOf(arr);
    }
    
}