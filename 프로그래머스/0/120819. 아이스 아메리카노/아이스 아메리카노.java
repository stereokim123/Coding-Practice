class Solution {
    public int[] solution(int money) {
        int sum = money / 5500;
        int minus = money - (5500 * sum);
        int[] answer = {sum, minus};


        return answer;
    }
}