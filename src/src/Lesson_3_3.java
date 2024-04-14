import java.util.Scanner;

/**
 Lesson_3
 Написать метод, которому в качестве параметра передается целое число.
 Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
 *
 */
public class Lesson_3_3 {
    public static void main(String[] args) {
        int number = -12;
        //Scanner scanner = new Scanner(System.in);
        //int number = scanner.nextInt();

        if (number>=0)
            System.out.println("false");
        else {
            System.out.println("true");
        }
    }
}