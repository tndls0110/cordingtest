package programmers.level0.date241124;

// https://school.programmers.co.kr/learn/courses/30/lessons/181856
// 0.02-0.06ms
public class Date241124No181863 {
    public String solution(String rny_string) {
        return rny_string.replace("m", "rn");
    }

    public static void main(String[] args) {
        Date241124No181863 solution = new Date241124No181863();
        System.out.println(solution.solution("masterpiece"));
    }
}
