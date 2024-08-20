import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int[] solution(int[] emergency) {
        // 원래 배열의 인덱스와 값을 함께 처리하기 위해 인덱스를 배열에 저장
        Integer[] indices = new Integer[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            indices[i] = i;
        }

        // 응급도의 크기 순으로 인덱스를 정렬
        Arrays.sort(indices, (a, b) -> Integer.compare(emergency[b], emergency[a]));

        // 결과 배열을 만들어 응급도 순위 할당
        int[] result = new int[emergency.length];
        for (int i = 0; i < indices.length; i++) {
            result[indices[i]] = i + 1;
        }

        return result;
    }
}
