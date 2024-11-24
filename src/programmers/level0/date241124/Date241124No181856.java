package programmers.level0.date241124;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/181856
// ms
public class Date241124No181856 {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if (arr1.length > arr2.length) {
            answer = 1;
        } else if (arr1.length < arr2.length) {
            answer = -1;
        } else if (arr1.length == arr2.length)  {
            int sum1 = 0;
            int sum2 = 0;
            for (int i : arr1) {
                sum1 += i;
            }
            for (int j : arr2) {
                sum2 += j;
            }
            if (sum1 > sum2) {
                answer = 1;
            } else if (sum1 < sum2) {
                answer = -1;
            } else if (sum1 == sum2) {
                answer = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Date241124No181856 solution = new Date241124No181856();
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 3, 3, 3, 3};
        int result = solution.solution(arr1, arr2);
        System.out.println(result);
    }
}
