package programmers.level0.date241124;

// https://school.programmers.co.kr/learn/courses/30/lessons/181873
// 0.02-0.04ms
public class Date241124No181873 {
    public String solution(String my_string, String alp) {
        return my_string.replace(alp, alp.toUpperCase());
    }

    public static void main(String[] args) {
        Date241124No181873 solution = new Date241124No181873();
        System.out.print(solution.solution("programmers", "p"));
    }
}
