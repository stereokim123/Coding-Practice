class Solution {
    public long solution(int balls, int share) {
        // share가 0이거나 balls와 같으면 경우의 수는 1
        if (share == 0 || balls == share) {
            return 1;
        }
        
        long result = 1;
        // nCk 계산: n! / (n-k)! * k! 을 계산하기 위한 방법
        // 큰 값의 계산을 피하기 위해 나누면서 곱셈을 진행
        for (int i = 0; i < share; i++) {
            result *= (balls - i);
            result /= (i + 1);
        }

        return result;
    }
}
