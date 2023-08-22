class Solution {
    
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] strArr = my_string.split("");
        
        for (int i : indices) {
            strArr[i] = "";
        }
        
        for (int i = 0; i < strArr.length; i++) {
            answer += strArr[i];
        }
        
        return answer;
    }
    
}