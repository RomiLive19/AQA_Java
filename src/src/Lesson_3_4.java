import java.util.Scanner;

/**
 Lesson_3
 Написать метод, которому в качестве аргументов передается строка и число,
 метод должен отпечатать в консоль указанную строку, указанное количество раз;
 *
 */

public class Lesson_3_4 {
    public static void main(String[] args) {
        Mymetod("ASTON", 7);
    }
    public static void Mymetod(String str, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(str);
        }
    }
}