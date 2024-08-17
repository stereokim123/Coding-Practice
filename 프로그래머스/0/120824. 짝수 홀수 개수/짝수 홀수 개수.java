class Solution {
    public int[] solution(int[] num_list) {
        // 짝수와 홀수의 개수를 저장할 변수
        int evenCount = 0;  // 짝수 개수
        int oddCount = 0;   // 홀수 개수

        // 배열을 순회하며 짝수와 홀수를 카운트
        for (int num : num_list) {
            if (num % 2 == 0) {
                evenCount++;  // 짝수일 경우
            } else {
                oddCount++;   // 홀수일 경우
            }
        }

        // 결과를 배열로 반환
        int[] answer = {evenCount, oddCount}; // 첫 번째는 짝수 개수, 두 번째는 홀수 개수
        return answer;
    }
}
