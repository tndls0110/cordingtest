package programmers.level0.date241124;

import java.util.Scanner;

// https://school.programmers.co.kr/learn/courses/30/lessons/181944
// 143.80-171.99ms
public class Date241124No181944 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }
}
