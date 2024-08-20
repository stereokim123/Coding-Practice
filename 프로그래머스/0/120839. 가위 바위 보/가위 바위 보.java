import java.util.stream.Collectors;

class Solution {
    public String solution(String rsp) {
        return rsp.chars()
                  .mapToObj(ch -> {
                      if (ch == '2') {
                          return "0";
                      } else if (ch == '0') {
                          return "5";
                      } else {
                          return "2";
                      }
                  })
                  .collect(Collectors.joining());
    }
}
