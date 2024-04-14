import java.util.Arrays;
/**
 Lesson_3
 Задать целочисленный массив, состоящий из элементов 0 и 1.
 Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
 С помощью цикла и условия заменить 0 на 1, 1 на 0;
 *
 */
public class Lesson_3_6 {
    public static void main(String args[]) {
        int [] nums = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 1 - nums[i];
        }
            System.out.println(Arrays.toString(nums));
    }
}
