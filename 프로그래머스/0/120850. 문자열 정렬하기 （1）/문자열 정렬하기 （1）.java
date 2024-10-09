import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public List<Integer> solution(String my_string) {
        return my_string.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .sorted()
                .boxed()
                .collect(Collectors.toList());
    }
}