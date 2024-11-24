package programmers.level0.date241124;

// https://school.programmers.co.kr/learn/courses/30/lessons/120849
// 0.03-0.08ms
public class Date241124No120849 {
    public String solution(String my_string) {
        String answer = my_string.replace("a", "");
        answer = answer.replace("e", "");
        answer = answer.replace("i", "");
        answer = answer.replace("o", "");
        answer = answer.replace("u", "");
        return answer;
    }

    public static void main(String[] args) {
        Date241124No120849 solution = new Date241124No120849();
        System.out.print(solution.solution("nice to meet you"));
    }
}
