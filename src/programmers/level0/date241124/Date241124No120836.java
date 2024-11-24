package programmers.level0.date241124;

// https://school.programmers.co.kr/learn/courses/30/lessons/120836
// 0.01-4.40ms
public class Date241124No120836 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Date241124No120836 solution = new Date241124No120836();
        System.out.println(solution.solution(20));
    }
}
