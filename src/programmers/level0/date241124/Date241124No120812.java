package programmers.level0.date241124;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://school.programmers.co.kr/learn/courses/30/lessons/120849
// 0.38-0.80ms
public class Date241124No120812 {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(map.toString());

        int max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("{"+entry.getKey()+"="+entry.getValue()+"}");
            if (entry.getValue() > max) {
                max = entry.getValue();
                answer = entry.getKey();
            } else if (entry.getValue() == max) {
                answer = -1;
            }
            System.out.println("max: "+max+", mode: "+answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        Date241124No120812 solution = new Date241124No120812();
        int[] array = {1, 1, 2, 2, 3, 3, 3, 4, 5};
        System.out.print(solution.solution(array));
    }
}
