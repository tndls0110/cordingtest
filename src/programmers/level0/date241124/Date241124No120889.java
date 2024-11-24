package programmers.level0.date241124;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/120906
// 0.34-0.51ms
public class Date241124No120889 {
    public int solution(int[] sides) {
        int answer = 2;
        Arrays.sort(sides);
        System.out.println(sides[0]+"/"+sides[1]+"/"+sides[2]);
        if ((sides[0] + sides[1]) > sides[2]) {
            System.out.println("만들 수 있다.");
            answer = 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Date241124No120889 solution = new Date241124No120889();
        int[] sides = {199, 72, 222};
        System.out.println(solution.solution(sides));
    }
}
