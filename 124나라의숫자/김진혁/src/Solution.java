public class Solution {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            System.out.println(solution(i));
        }
    }

    public static String solution(int n) {
        String answer = "";

        while(n > 0) {
            n = n-1;
            answer = rule(n%3) + answer;
            n /= 3;
        }
        return answer;
    }

    public static String rule(int n) {
        switch (n) {
            case 0:
                return "1";
            case 1:
                return "2";
            case 2:
                return "4";

        };
        return "";
    }
}
