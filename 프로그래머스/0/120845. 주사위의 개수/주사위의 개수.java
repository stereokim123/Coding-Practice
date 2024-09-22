class Solution {
    public int solution(int[] box, int n) {
        int length = box[0] / n;
        int width = box[1] / n;
        int height = box[2] / n;

        int answer = length * width * height;
        return answer;
    }
}