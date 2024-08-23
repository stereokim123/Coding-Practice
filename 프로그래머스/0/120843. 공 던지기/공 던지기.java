public class Solution {
    public int solution(int[] numbers, int k) {
        int n = numbers.length;
        // (k - 1) * 2를 배열의 길이로 나눈 나머지로 인덱스를 계산
        int index = (2 * (k - 1)) % n;
        return numbers[index];
    }
}
