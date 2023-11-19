class Solution {
	public int solution(int[][] triangle) {
		// dp 테이블 생성 및 초기화
		int[][] dp = new int[triangle.length + 1][triangle.length + 1];
		for (int i = 1; i <= triangle.length; i++) {
			for (int j = 1; j <= i; j++) {
				dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + triangle[i - 1][j - 1];
			}
		}

		// 거쳐간 숫자의 최댓값을 구한다.
		int max = 0;
		for (int i = 1; i <= triangle.length; i++) {
			max = Math.max(max, dp[triangle.length][i]);
		}
		return max;
	}
}