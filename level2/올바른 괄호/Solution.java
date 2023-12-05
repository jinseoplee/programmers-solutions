import java.util.*;

class Solution {
	Stack<Character> stack = new Stack<>();

	boolean solution(String s) {
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch == '(') {
				stack.push('(');
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				stack.pop();
			}
		}

		if (stack.isEmpty()) {
			return true;
		}
		return false;
	}
}