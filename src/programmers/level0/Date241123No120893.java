package programmers.level0;

public class Date241123No120893 {
    public String solution(String my_string) {
        String answer = "";
        for (char c : my_string.toCharArray()) {
            if (Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c);
//                System.out.println("대문자임");
//                System.out.println(answer);
            } else {
                answer += Character.toUpperCase(c);
//                System.out.println("소문자임");
//                System.out.println(answer);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Date241123No120893 solution = new Date241123No120893();
        String result = solution.solution("cccCCC");
        System.out.println("cccCCC / "+result);
    }
}
