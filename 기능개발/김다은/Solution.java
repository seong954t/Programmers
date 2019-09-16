import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] progresses = {93, 30, 55, 60, 40, 65};
        int[] speeds = {1, 30, 5, 10, 60, 7};
        for (int i : solution(progresses, speeds)) {
            System.out.println(i);
        }
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new LinkedList<>();
        int day = (int)Math.ceil((double)(100-progresses[0])/speeds[0]), sum = 1;
        for (int i = 1; i < progresses.length; i++) {
            if (day < (int)Math.ceil((double)(100-progresses[i])/speeds[i])) {
                day = (int)Math.ceil((double)(100-progresses[i])/speeds[i]);
                answer.add(sum);
                sum = 1;
            } else {
                sum++;
            }
        }
        answer.add(sum);
        return answer.stream().mapToInt(i->i).toArray();
    }
}