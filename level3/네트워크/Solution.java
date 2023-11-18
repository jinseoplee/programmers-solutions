class Solution {

	void dfs(int v, int[][] computers, boolean[] visited) {
		visited[v] = true;
		for (int i = 0; i < computers.length; i++) {
			if (!visited[i] && computers[v][i] == 1) {
				dfs(i, computers, visited);
			}
		}
	}

	public int solution(int n, int[][] computers) {
		int networkCnt = 0;

		// i번 컴퓨터와 연결된 네트워크를 탐색
		boolean[] visited = new boolean[n];
		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				dfs(i, computers, visited);
				networkCnt++;
			}
		}
		return networkCnt;
	}
}