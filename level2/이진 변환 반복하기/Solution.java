class Solution {
	public int[] solution(String s) {
		int round = 0; // 이진 변환 횟수
		int removeCnt = 0; // 제거된 0의 개수

		while (!s.equals("1")) {
			// s의 모든 0을 제거한 길이 c를 구한다.
			int c = s.replaceAll("0", "").length();

			// 제거한 0의 개수를 더한다.
			removeCnt += s.length() - c;

			// c를 2진법으로 표현한 문자열로 바꾼다.
			s = Integer.toBinaryString(c);

			round++;
		}

		return new int[] { round, removeCnt };
	}
}