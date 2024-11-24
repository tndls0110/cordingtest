package programmers.level0.date241124;

// https://school.programmers.co.kr/learn/courses/30/lessons/120899
// 7.64-14.20ms
public class Date241124No181849 {
    public int solution(String num_str) {
        int answer = 0;
        char[] arr = num_str.toCharArray();
        for (char c : arr) {
            answer += Integer.parseInt(String.valueOf(c));
            System.out.println("c: "+c+", answer: "+answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        Date241124No181849 solution = new Date241124No181849();
        int result = solution.solution("123456789");
        System.out.println(result);
    }
}
