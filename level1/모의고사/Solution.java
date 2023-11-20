class Solution {
    int[] student1 = {1, 2, 3, 4, 5};
    int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
    int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    int[] score = new int[3];
    
    public int[] solution(int[] answers) {
        // 수포자들의 점수를 계산한다.
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == student1[i % 5]) score[0]++;
            if (answers[i] == student2[i % 8]) score[1]++;
            if (answers[i] == student3[i % 10]) score[2]++;
        }
        
        // 가장 높은 점수를 계산합니다.
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        
        int size = 0;
        for (int i = 0; i < 3; i++) {
            if (score[i] == maxScore) size++;
        }
        
        // 가장 높은 점수를 받은 사람을 반환합니다.
        int[] answer = new int[size];
        for (int idx = 0, i = 0; i < 3; i++) {
            if (score[i] == maxScore) answer[idx++] = i + 1;
        }
        return answer;
    }
}