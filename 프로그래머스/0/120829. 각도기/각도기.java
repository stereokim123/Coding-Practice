class Solution {
    public int solution(int angle) {
        int answer = 0;
        if (angle == 180) {
            answer = 4;
        } else if (90 < angle && angle < 180) {
            answer = 3;
        } else if (90 == angle) {
            answer = 2;            
        } else if (0 < angle && angle < 90) {
            answer = 1;
        }
        return answer;
    }
}