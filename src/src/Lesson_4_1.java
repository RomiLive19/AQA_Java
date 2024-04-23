/**
 * Lesson_4
 **/

public class Lesson_4_1 {

    static class Employee {
        private String fullName;
        private String position;
        private String email;
        private String phone;
        private double salary;
        private int age;

        public Employee(String fullName, String position, String email, String phone, double salary, int age) {
            this.fullName = fullName;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        public void print() {
            System.out.println("Информация о сутруднике:");
            System.out.println("ФИО: " + fullName);
            System.out.println("Должность: " + position);
            System.out.println("Email: " + email);
            System.out.println("Телефон: " + phone);
            System.out.println("Зарплата: " + salary);
            System.out.println("Возраст : " + age);
        }

        public static void main(String[] args) {
            Employee employee1 = new Employee("Romanov Roman Romanovich", "QA", "romanov@mail.com", "+375291234567", 100000.0, 35);
            employee1.print();
        }
    }
}


