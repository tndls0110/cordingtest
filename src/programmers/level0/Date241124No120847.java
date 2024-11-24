package programmers.level0;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/120847
// 0.32-0.51ms
public class Date241124No120847 {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        answer = numbers[numbers.length-1] * numbers[numbers.length-2];
        return answer;
    }

    public static void main(String[] args) {
        Date241124No120847 solution = new Date241124No120847();
        int[] numbers = {0, 31, 24, 10, 1, 9};
        int result = solution.solution(numbers);
        System.out.println("result / "+result);
    }
}
