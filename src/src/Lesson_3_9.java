import java.util.Arrays;

/**
 Lesson_3
 Создать квадратный двумерный целочисленный
 массив (количество строк и столбцов одинаковое),
 и с помощью цикла(-ов) заполнить его диагональные элементы единицами
 (можно только одну из диагоналей, если обе сложно).
 Определить элементы одной из диагоналей можно по следующему
 принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], ..., [n][n];
 *
 */

public class Lesson_3_9 {
    public static void main(String[] args) {
        int size = 3;
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
            System.out.println(java.util.Arrays.toString(matrix[i]));
        }
    }
}