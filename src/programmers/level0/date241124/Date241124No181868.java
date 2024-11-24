package programmers.level0.date241124;

// https://school.programmers.co.kr/learn/courses/30/lessons/181868
// 0.02-0.52ms
public class Date241124No181868 {
    public String[] solution(String my_string) {
        String trim = my_string.trim();
        while (trim.contains("  ")) {
            trim = trim.replace("  ", " ");
        }
        //System.out.println(trim);
        String[] answer = trim.split(" ");
        return answer;
    }

    public static void main(String[] args) {
        Date241124No181868 solution = new Date241124No181868();
        for (String str : solution.solution(" i    love  you")) {
            System.out.print(str+" / ");
        }
    }
}
