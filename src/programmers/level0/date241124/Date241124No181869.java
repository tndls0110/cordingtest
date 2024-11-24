package programmers.level0.date241124;

// https://school.programmers.co.kr/learn/courses/30/lessons/181868
// 0.01-0.36ms
public class Date241124No181869 {
    public String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        return answer;
    }

    public static void main(String[] args) {
        Date241124No181869 solution = new Date241124No181869();
        for (String str : solution.solution("\"i love you")) {
            System.out.print(str+" / ");
        }
    }
}
