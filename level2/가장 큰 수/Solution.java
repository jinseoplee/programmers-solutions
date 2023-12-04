import java.util.*;

class Solution {
	public String solution(int[] numbers) {
		StringBuilder answer = new StringBuilder();
		String[] strNums = new String[numbers.length];

		// 정수형 배열을 문자열 배열로 변환
		for (int i = 0; i < numbers.length; i++) {
			strNums[i] = String.valueOf(numbers[i]);
		}

		// 정렬 수행
		Arrays.sort(strNums, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

		for (int i = 0; i < strNums.length; i++) {
			answer.append(strNums[i]);
		}

		if (answer.charAt(0) == '0') return "0";
		return new String(answer.toString());
	}
}