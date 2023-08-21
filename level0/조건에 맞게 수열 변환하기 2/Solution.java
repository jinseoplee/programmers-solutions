class Solution {
    
    public int solution(int[] arr) {
        int[] before = new int[arr.length];
        int x = 0;
        
        while (!equals(before, arr)) {
            System.arraycopy(arr, 0, before, 0, arr.length);
            
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            
            x++;
        }
        
        return x - 1;
    }
    
    boolean equals(int[] before, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (before[i] != arr[i]) return false;
        }
        return true;
    }
}