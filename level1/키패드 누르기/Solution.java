class Solution {
	int[][] keyPos = { 
			{ 3, 1 }, // 0
			{ 0, 0 }, // 1
			{ 0, 1 }, // 2
			{ 0, 2 }, // 3
			{ 1, 0 }, // 4
			{ 1, 1 }, // 5
			{ 1, 2 }, // 6
			{ 2, 0 }, // 7
			{ 2, 1 }, // 8
			{ 2, 2 } // 9
	};

	int[] leftPos = { 3, 0 }; // *
	int[] rightPos = { 3, 2 }; // #

	public String solution(int[] numbers, String hand) {
		StringBuilder sb = new StringBuilder();

		for (int num : numbers) {
			String thumb = pushNumber(num, hand);
			sb.append(thumb);

			if (thumb.equals("L")) leftPos = keyPos[num];
			if (thumb.equals("R")) rightPos = keyPos[num];
		}

		return sb.toString();
	}

	String pushNumber(int num, String hand) {
		if (num == 1 || num == 4 || num == 7) return "L";
		if (num == 3 || num == 6 || num == 9) return "R";

		// 2, 5, 8, 0
		int leftDist = getDistance(leftPos, num);
		int rightDist = getDistance(rightPos, num);

		if (leftDist < rightDist) return "L";
		if (rightDist < leftDist) return "R";

		return hand.equals("left") ? "L" : "R";
	}

	int getDistance(int[] pos, int num) {
		return Math.abs(pos[0] - keyPos[num][0]) + Math.abs(pos[1] - keyPos[num][1]);
	}
}