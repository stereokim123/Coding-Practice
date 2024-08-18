import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        return (int) Arrays.stream(array)
                .filter(num -> num == n)
                .count();
    }
}