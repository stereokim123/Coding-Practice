import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        return (int) Arrays.stream(array)
                .filter(num -> num > height)
                .count();
    }
}