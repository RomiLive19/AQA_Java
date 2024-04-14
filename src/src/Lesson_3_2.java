import java.util.Scanner;

/**
 Lesson_3
 Написать метод, которому в качестве параметра передается
 целое число, метод должен напечатать в консоль,
 положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
 *
 */
public class Lesson_3_2 {
    public static void main(String[] args) {
        Summetod();
    }
    public static void Summetod() {
        int number = -21;
        //Scanner scanner = new Scanner(System.in);
        //int number = scanner.nextInt();

        if (number>=0)
            System.out.println(number +"  число положительное");
        else {
            System.out.println(number +"  число отрицательное");
        }
    }
}