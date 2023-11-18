import java.util.*;

class Pair {
	int r, c;

	Pair(int r, int c) {
		this.r = r;
		this.c = c;
	}
}

class Solution {
	// 상, 하, 좌, 우
	int[] dr = { -1, 1, 0, 0 };
	int[] dc = { 0, 0, -1, 1 };

	// 격자 범위 체크
	boolean inRange(int r, int c, int n, int m) {
		return 0 <= r && r < n && 0 <= c && c < m;
	}

	public int solution(int[][] maps) {
		Queue<Pair> q = new ArrayDeque<>();
		q.offer(new Pair(0, 0));

		int n = maps.length; // 가로
		int m = maps[0].length; // 세로

		while (!q.isEmpty()) {
			Pair curr = q.poll();

			if (curr.r == n - 1 && curr.c == m - 1) {
				return maps[curr.r][curr.c];
			}

			// 상, 하, 좌, 우 탐색
			for (int dir = 0; dir < 4; dir++) {
				int nextR = curr.r + dr[dir];
				int nextC = curr.c + dc[dir];

				// 다음 위치가 격자 범위 안에 있고 갈 수 있는 길인 경우
				if (inRange(nextR, nextC, n, m) && maps[nextR][nextC] == 1) {
					maps[nextR][nextC] = maps[curr.r][curr.c] + 1;
					q.offer(new Pair(nextR, nextC));
				}
			}
		}

        // 도착 지점까지 도달하지 못한 경우
		return -1;
	}
}