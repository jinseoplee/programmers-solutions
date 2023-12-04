class Solution {
	public String solution(String s) {
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		String[] nums = s.split(" ");

		// 최소값과 최대값을 찾는다.
		for (int i = 0; i < nums.length; i++) {
			int n = Integer.parseInt(nums[i]);
			min = Math.min(min, n);
			max = Math.max(max, n);
		}

		return min + " " + max;
	}
}