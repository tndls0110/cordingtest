package programmers.level0.date241124;

// https://school.programmers.co.kr/learn/courses/30/lessons/120816
// 0.01-0.03ms
public class Date241124No120816 {
    public int solution(int slice, int n) {
        int answer = 0;
        if (n % slice > 0) {
            answer = (n / slice) + 1;
        } else {
            answer = n / slice;
        }
        return answer;
    }

    public static void main(String[] args) {
        Date241124No120816 solution = new Date241124No120816();
        int result = solution.solution(4, 12);
        System.out.println(result);
    }
}
