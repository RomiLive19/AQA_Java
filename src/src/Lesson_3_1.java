/**
 Lesson_3
 Написать метод, принимающий на вход два
 целых числа и проверяющий, что их сумма лежит в пределах
 от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
 *
 */
public class Lesson_3_1 {
    public static void main(String[] args) {
        Summetod1();
    }
    public static void Summetod1() {
        int a = 5;
        int b = 15;
        if ((a+b) >=10 && (a+b) <=20)
        System.out.println("true");
        else {
            System.out.println("false");
        }
    }
}
