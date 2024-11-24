package programmers.level0.date241124;

// https://school.programmers.co.kr/learn/courses/30/lessons/181937
// 0.01-0.03ms
public class Date241124No181937 {
    public int solution(int num, int n) {
        int answer = 0;
        if (num % n == 0) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        Date241124No181937 solution = new Date241124No181937();
        System.out.print(solution.solution(34, 3));
    }
}
