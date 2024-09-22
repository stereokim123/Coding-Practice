import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return (int) IntStream.rangeClosed(1, n)
                .filter(i -> IntStream.rangeClosed(1, i)
                        .filter(divisor -> i % divisor == 0)
                        .count() >= 3)
                .count();
    }
}
