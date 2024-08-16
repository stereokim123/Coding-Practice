class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {  // i가 짝수인지 확인
                answer += i;   // 짝수인 i를 더함
            }
        }
        return answer;
    }
}
