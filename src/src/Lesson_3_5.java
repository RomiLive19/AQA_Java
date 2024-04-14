/**
 Lesson_3
 Написать метод, который определяет, является ли год високосным,
 и возвращает boolean (високосный - true, не високосный - false).
 Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 *
 */

public class Lesson_3_5 {
    public static void main(String[] args) {
        Mymetod(2024);
    }
    public static void Mymetod(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("true");}
        else {
            System.out.println("false");
        }
    }
}