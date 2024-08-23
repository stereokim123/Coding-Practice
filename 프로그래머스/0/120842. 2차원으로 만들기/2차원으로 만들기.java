import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int[][] solution(int[] num_list, int n) {
        return IntStream.range(0, num_list.length / n)
                .mapToObj(i -> Arrays.copyOfRange(num_list, i * n, (i + 1) * n))
                .toArray(int[][]::new);
    }
}