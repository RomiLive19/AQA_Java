import java.util.Scanner;
import java.util.Arrays;

/**
 Lesson_3
 Написать метод, принимающий на вход два аргумента: len и initialValue,
 и возвращающий одномерный массив типа int длиной len,
 каждая ячейка которого равна initialValue.
 *
 */
public class Lesson_3_10 {
    public static void main(String[] args) {
        int len = 5;
        int initialValue = 7;
        int[] matrix = newmatrix(len, initialValue);
        System.out.println(Arrays.toString(matrix));
    }
    public static int[] newmatrix(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }
}