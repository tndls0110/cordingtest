package programmers.level0.date241124;

// https://school.programmers.co.kr/learn/courses/30/lessons/181936
// 0.01-0.03ms
public class Date241124No181936 {
    public int solution(int number, int n, int m) {
        int answer = 0;
        if (number % (n * m / gcd(n, m)) == 0) {
            answer = 1;
        }
        return answer;
    }

    public int gcd(int n, int m) {
        int r = 0;
        while (m > 0) {
            r = n % m;
            n = m;
            m = r;
        }
        return n;
    }

    public static void main(String[] args) {
        Date241124No181936 solution = new Date241124No181936();
        System.out.print(solution.solution(60, 2, 3));
    }
}
