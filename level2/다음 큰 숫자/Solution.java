class Solution {
	int countOnes(int n) {
		String binaryNum = Integer.toBinaryString(n);
		int oneCnt = 0;
		for (int i = 0; i < binaryNum.length(); i++) {
			if (binaryNum.charAt(i) == '1') oneCnt++;
		}
		return oneCnt;
	}

	public int solution(int n) {
		int answer = n;
		int cnt = countOnes(n);
		while (true) {
			// n보다 크고, 2진수로 변환했을 때 1의 개수가 같은 경우 종료한다.
			if (cnt == countOnes(++answer))
				break;
		}
		return answer;
	}
}