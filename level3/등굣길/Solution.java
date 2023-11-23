class Solution {
	public int solution(int m, int n, int[][] puddles) {
		int[][] dp = new int[n][m];

		// 물에 잠긴 지역을 -1로 저장한다.
		for (int[] puddle : puddles) {
			dp[puddle[1] - 1][puddle[0] - 1] = -1;
		}

		dp[0][0] = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				// 물에 잠긴 지역을 0으로 바꾼다.
				if (dp[i][j] == -1) {
					dp[i][j] = 0;
					continue;
				}

				// 위쪽 값 더하기
				if (i != 0) {
					dp[i][j] += dp[i - 1][j];
				}

				// 왼쪽 값 더하기
				if (j != 0) {
					dp[i][j] += dp[i][j - 1];
				}

				dp[i][j] %= 1000000007;
			}
		}
		return dp[n - 1][m - 1];
	}
}