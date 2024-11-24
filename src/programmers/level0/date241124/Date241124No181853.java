package programmers.level0.date241124;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/181853
// 0.34-4.04ms
public class Date241124No181853 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        Arrays.sort(num_list);
        for (int i = 0; i < 5; i++) {
            answer[i] = num_list[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Date241124No181853 solution = new Date241124No181853();
        int[] num_list = {12, 4, 15, 46, 38, 1, 14};
        int[] result = solution.solution(num_list);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
