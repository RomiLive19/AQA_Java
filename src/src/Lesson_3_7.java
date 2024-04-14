import java.util.Arrays;

/**
 Lesson_3
 Задать пустой целочисленный массив длиной 100.
 С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;
 *
 */
public class Lesson_3_7 {
    public static void main(String args[]) {
        int[] nums = new int[100];
        for (int i = 0; i < 100; i++) {
            nums[i] = i+1;
            }
        System.out.println(Arrays.toString(nums));
    }
}