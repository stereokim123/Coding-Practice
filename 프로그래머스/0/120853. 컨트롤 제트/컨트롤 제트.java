import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String s) {
        List<Integer> numbers = new ArrayList<>();
        
        for (String token : s.split(" ")) {
            if (token.equals("Z")) {
                if (!numbers.isEmpty()) {
                    numbers.remove(numbers.size() - 1); // 마지막 숫자 제거
                }
            } else {
                numbers.add(Integer.parseInt(token)); // 숫자 추가
            }
        }
        
        return numbers.stream().mapToInt(Integer::intValue).sum(); // 스트림으로 합산
    }
}
