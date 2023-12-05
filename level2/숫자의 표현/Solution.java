class Solution {
	public int solution(int n) {
		int start = 0, end = 0, sum = 0, answer = 0;
		while (start <= n) {
			if (sum < n) {
				sum += ++end;
			} else if (sum > n) {
				sum -= start++;
			} else {
				answer++;
				sum += ++end;
			}
		}
		return answer;
	}
}