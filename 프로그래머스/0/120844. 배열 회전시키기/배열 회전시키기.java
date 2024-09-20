import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        if ("left".equals(direction)) {
            return IntStream.concat(
                    Arrays.stream(numbers, 1, numbers.length),
                    Arrays.stream(numbers, 0, 1))
                    .toArray();
        } else if ("right".equals(direction)) {
            return IntStream.concat(
                    Arrays.stream(numbers, numbers.length - 1, numbers.length),
                    Arrays.stream(numbers, 0, numbers.length-1))
                    .toArray();
        } else {
            return numbers;
        }
    }
}