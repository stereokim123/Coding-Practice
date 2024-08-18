import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(String[] strlist) {
        return Arrays.stream(strlist)   // 문자열 배열을 스트림으로 변환
                .mapToInt(String::length)  // 각 문자열의 길이를 IntStream으로 변환
                .toArray();  // IntStream을 int 배열로 변
    }
}
