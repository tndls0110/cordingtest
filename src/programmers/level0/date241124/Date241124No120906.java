package programmers.level0.date241124;

// https://school.programmers.co.kr/learn/courses/30/lessons/120906
// 0.04-0.07ms
public class Date241124No120906 {
    public int solution(int n) {
        int answer = 0;
        for (char c : String.valueOf(n).toCharArray()) {
            answer += Character.getNumericValue(c);
        }
        return answer;
    }

    public static void main(String[] args) {
        Date241124No120906 solution = new Date241124No120906();
        System.out.println(solution.solution(1234));
    }
}
