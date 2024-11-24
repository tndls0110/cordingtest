package programmers.level0;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/120905
// 0.02-0.04ms
public class Date241124No120905 {
    public List<Integer> solution(int n, int[] numlist) {
        List<Integer> answer = new ArrayList<Integer>();
        for (int num : numlist) {
            if (num % n == 0) {
                answer.add(num);
                System.out.println(num);
            }
        }
//        System.out.println(answer.toString());
        return answer;
    }

    public static void main(String[] args) {
        Date241124No120905 solution = new Date241124No120905();
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        List<Integer> result = solution.solution(3, numlist);
        System.out.println(result.toString());
    }
}
