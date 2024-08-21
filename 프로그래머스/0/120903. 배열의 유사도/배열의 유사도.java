import java.util.Arrays;
class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        return (int) Arrays.stream(s1)
                .filter(item -> Arrays.asList(s2).contains(item))
                .count();

    }
}