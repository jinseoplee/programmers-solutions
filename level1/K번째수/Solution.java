import java.util.Arrays;

class Solution {

	// k번째에 있는 수를 반환한다.
	int findKth(int i, int j, int k, int[] arr) {
		// arr 배열을 i번째 숫자부터 j번째까지 자른다.
		int[] cutArr = Arrays.copyOfRange(arr, i - 1, j);
		// 배열을 정렬한다.
		Arrays.sort(cutArr);
		// k번째 있는 수를 반환한다.
		return cutArr[k - 1];
	}

	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		int idx = 0;
		for (int[] command : commands) {
			int i = command[0];
			int j = command[1];
			int k = command[2];
			answer[idx++] = findKth(i, j, k, array);
		}

		return answer;
	}
}