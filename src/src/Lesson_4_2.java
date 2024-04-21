/**
 Lesson_4
 **/

public class Lesson_4_2 {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Ivanov Ivan Ivanovich", "QA", "ivanovich@gmail.com", "+375291111111", 70000.0, 20);
        employees[1] = new Employee("Chekhov Anton Pavlovich", "AQA", "pavlovich@gmail.com", "+375292222222", 80000.0, 42);
        employees[2] = new Employee("Pushkin Alexander Sergeevich", "JAVA", "sidorov@gmail.com", "+375293333333", 190000.0, 35);
        employees[3] = new Employee("Tolstoy Lev Nicolaevich", "SA", "sergeevich@gmail.com", "+375294444444", 80000.0, 45);
        employees[4] = new Employee("Bulgakov Mikhail Afanasyevich ", "PM", "afanasyevich@gmail.com", "+375295555555", 70000.0, 18);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].age > 40) {
                employees[i].printInfo();
                System.out.println();
            }
        }
    }
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

        public void printInfo() {
            System.out.println("Информация о сутруднике:");
            System.out.println("ФИО: " + fullName);
            System.out.println("Должность: " + position);
            System.out.println("Email: " + email);
            System.out.println("Телефон: " + phone);
            System.out.println("Зарплата: " + salary);
            System.out.println("Возраст : " + age);
        }
    }
}
