import java.util.Stack;

class Solution {
	Stack<Integer> stack = new Stack<>();
	int removeCnt = 0;

	public int solution(int[][] board, int[] moves) {
		for (int move : moves) {
			int dollNum = pickDoll(board, move - 1);
			if (dollNum != 0) processStack(dollNum);
		}
		return removeCnt;
	}

	int pickDoll(int[][] board, int column) {
		int dollNum = 0;
		for (int i = 0; i < board.length; i++) {
			if (board[i][column] != 0) {
				dollNum = board[i][column];
				board[i][column] = 0;
				return dollNum;
			}
		}
		return dollNum;
	}

	void processStack(int dollNum) {
        // 스택의 top에 있는 인형과 새로 쌓이는 인형이 동일한 경우
		if (!stack.isEmpty() && stack.peek() == dollNum) {
			stack.pop();
			removeCnt += 2; // 인형 두 개가 제거된다.
		} else {
			stack.push(dollNum);
		}
	}
}