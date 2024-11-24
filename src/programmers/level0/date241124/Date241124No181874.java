package programmers.level0.date241124;

// https://school.programmers.co.kr/learn/courses/30/lessons/181874
// 0.08-0.12ms
public class Date241124No181874 {
    public String solution(String myString) {
        StringBuffer buffer = new StringBuffer();
        for (char c : myString.toCharArray()) {
            if (c == 'a' || c == 'A'){
                buffer.append("A");
            } else {
                buffer.append(String.valueOf(c).toLowerCase());
            }
        }
        return buffer.toString();
    }

    public static void main(String[] args) {
        Date241124No181874 solution = new Date241124No181874();
        System.out.print(solution.solution("PrOgRaMmEr"));
    }
}
