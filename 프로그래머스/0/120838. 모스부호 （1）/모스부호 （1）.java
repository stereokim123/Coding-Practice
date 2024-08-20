import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String letter) {
        // 모스 부호와 알파벳을 매핑하는 HashMap 생성
        Map<String, String> morse = new HashMap<>();
        morse.put(".-", "a");
        morse.put("-...", "b");
        morse.put("-.-.", "c");
        morse.put("-..", "d");
        morse.put(".", "e");
        morse.put("..-.", "f");
        morse.put("--.", "g");
        morse.put("....", "h");
        morse.put("..", "i");
        morse.put(".---", "j");
        morse.put("-.-", "k");
        morse.put(".-..", "l");
        morse.put("--", "m");
        morse.put("-.", "n");
        morse.put("---", "o");
        morse.put(".--.", "p");
        morse.put("--.-", "q");
        morse.put(".-.", "r");
        morse.put("...", "s");
        morse.put("-", "t");
        morse.put("..-", "u");
        morse.put("...-", "v");
        morse.put(".--", "w");
        morse.put("-..-", "x");
        morse.put("-.--", "y");
        morse.put("--..", "z");

        // Stream을 사용하여 문자열 처리
        return Arrays.stream(letter.split(" "))        // 모스부호를 공백 기준으로 나누고 스트림 생성
                .map(morse::get)                       // 각 모스부호를 알파벳으로 변환
                .collect(Collectors.joining());        // 변환된 알파벳들을 합쳐 하나의 문자열로 만듦
    }
}
