package programmers.level0.date241124;

import java.util.Scanner;

// https://school.programmers.co.kr/learn/courses/30/lessons/120823
// 125.88-164.63ms
public class Date241124No120823 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("*".repeat(i+1));
        }
    }
}
