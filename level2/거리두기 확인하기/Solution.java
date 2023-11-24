import java.util.*;

class Solution {
	int[] dr = { -1, 1, 0, 0 };
	int[] dc = { 0, 0, -1, 1 };

	public int[] solution(String[][] places) {
		int[] answer = new int[5];
		for (int i = 0; i < 5; i++) {
			answer[i] = isOk(places[i]);
		}
		return answer;
	}

	int isOk(String[] place) {
		for (int r = 0; r < 5; r++) {
			for (int c = 0; c < 5; c++) {
				if (place[r].charAt(c) == 'P') {
					if (bfs(r, c, place)) return 0;
				}
			}
		}
		return 1;
	}

	boolean bfs(int r, int c, String[] place) {
		Queue<Pair> q = new ArrayDeque<>();
		boolean[][] visited = new boolean[5][5];
		q.offer(new Pair(r, c));
		visited[r][c] = true;

		while (!q.isEmpty()) {
			Pair curr = q.poll();

			for (int dir = 0; dir < 4; dir++) {
				int nextR = curr.r + dr[dir];
				int nextC = curr.c + dc[dir];
				int distance = Math.abs(r - nextR) + Math.abs(c - nextC);

				if (nextR < 0 || nextR >= 5 || nextC < 0 || nextC >= 5) continue;
				if (place[nextR].charAt(nextC) == 'X' || distance > 2 || visited[nextR][nextC]) continue;
				if (place[nextR].charAt(nextC) == 'P') return true;

				q.offer(new Pair(nextR, nextC));
				visited[nextR][nextC] = true;
			}
		}

		return false;
	}
}

class Pair {
	int r, c;

	Pair(int r, int c) {
		this.r = r;
		this.c = c;
	}
}