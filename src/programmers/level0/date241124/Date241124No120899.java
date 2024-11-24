package programmers.level0.date241124;

// https://school.programmers.co.kr/learn/courses/30/lessons/120899
// 0.01-0.02ms
public class Date241124No120899 {
    public int[] solution(int[] array) {
        int[] answer = {array[0], 0};
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i-1]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Date241124No120899 solution = new Date241124No120899();
        int[] array = {9, 10, 11, 8};
        int[] result = solution.solution(array);
        System.out.println("" + result[0] + ", " + result[1]);
    }
}
