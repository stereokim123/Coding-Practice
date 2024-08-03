class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n == 5 && n == 3 && n == 1) {
            answer = (n * 6) / 6;
        } else if (n == 6) {
            answer = 1;
            
        } else {
            answer = ((n * 6) /2) / 6;
        }
        return answer;
    }
}