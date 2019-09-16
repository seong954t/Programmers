public class Solution {
    public static void main(String[] args) {
        int[] inputs = {1, 2, 3, 4};
        for (int n : inputs) {
            System.out.println(solution(n));
        }
    }

    public static String solution(int n) {
        StringBuilder sb = new StringBuilder();
        String numbers = "124";
        while (n > 0) {
            n--;
            sb.insert(0, numbers.charAt(n%3));
            n /= 3;
        }
        return sb.toString();
    }
}