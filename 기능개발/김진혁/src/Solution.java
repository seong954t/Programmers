import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
//        int[] progresses = {93,30,55};
//        int[] speeds = {1,30,5};
        int[] progresses = {40, 93, 30, 55, 60, 65};
        int[] speeds = {60, 1, 30, 5 , 10, 7};
//        int[] progresses = {93, 30, 55, 60, 40, 65};
//        int[] speeds = {1, 30, 5 , 10, 60, 7};
        System.out.println(solution(progresses, speeds));
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> workAnswerList = new ArrayList<>();
        int[] workDate = new int[progresses.length];

        Arrays.setAll(progresses, i -> 100 - progresses[i]);

        IntStream.range(0, progresses.length)
                .forEach(i -> {
                    workDate[i] = (int) Math.ceil((double) progresses[i] / (double) speeds[i]);
                });

        int currentWork = workDate[0];
        int distribute = 1;
        for(int i = 1; i < workDate.length; i++){
            if(currentWork >= workDate[i]){
                distribute++;
            }else{
                currentWork = workDate[i];
                workAnswerList.add(distribute);
                distribute = 1;
            }
        }
        workAnswerList.add(distribute);


        int[] answer = new int[workAnswerList.size()];

        int size = 0;
        for(int work : workAnswerList){
            answer[size++] = work;
            System.out.println(work);
        }

        return answer;
    }
}
