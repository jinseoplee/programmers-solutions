class Solution {
    
    public int solution(String binomial) {
        String[] arr = binomial.split(" ");
        String op = arr[1];
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[2]);
        int result = 0;
        
        if (op.equals("+")) {
            result = a + b;
        } else if (op.equals("-")) {
            result =  a - b;
        } else if (op.equals("*")) {
            result =  a * b;
        }
        
        return result;
    }
    
}