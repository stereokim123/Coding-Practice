class Solution {
    public int solution(int n) {
        int i = 1;
        int factorial = 1;
        
        // i!이 n보다 커지기 전까지 반복
        while (factorial <= n) {
            i++;
            factorial *= i;
        }
        
        // i가 n을 초과했으므로 가장 큰 i는 i - 1
        return i - 1;
    }
}
