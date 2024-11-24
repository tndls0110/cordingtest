package programmers.level0.date241124;

// https://school.programmers.co.kr/learn/courses/30/lessons/181850
// 0.01-0.03ms
public class Date241124No181850 {
    public int solution(double flo) {
        int answer = (int) (flo / 1.0);
        return answer;
    }

    public static void main(String[] args) {
        Date241124No181850 solution = new Date241124No181850();
        int result = solution.solution(69.78);
        System.out.println(result);
    }
}
