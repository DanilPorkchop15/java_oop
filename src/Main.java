import personType.Employee;
import personType.Student;
import university.Schedule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

//Вариант 3
//        Создайте структуру классов, которые могли бы использоваться в работе университета. В
//        университете должны храниться списки инвентаря, сотрудников, учеников, информация о
//        расписании и т.д.
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Иван", "Иванов", 30, "Преподаватель", "5 лет", 100000);
        Employee employee2 = new Employee("Елена", "Смирнова", 35, "Менеджер по продажам", "8 лет", 120000);
        Employee employee3 = new Employee("Алексей", "Петров", 28, "Преподаватель", "3 года", 80000);
        Employee employee4 = new Employee("Ольга", "Сидорова", 32, "Бухгалтер", "6 лет", 110000);
        Employee employee5 = new Employee("Сергей", "Козлов", 27, "Дизайнер", "4 года", 90000);
        Employee employee6 = new Employee("Наталья", "Морозова", 33, "Преподаватель", "7 лет", 100000);
        Employee employee7 = new Employee("Дмитрий", "Волков", 29, "Преподаватель", "2 года", 80000);
        Employee employee8 = new Employee("Мария", "Тихонова", 31, "Бухгалтер", "6 лет", 95000);
        Employee employee9 = new Employee("Григорий", "Николаев", 34, "Маркетолог", "4 года", 110000);
        Employee employee10 = new Employee("Екатерина", "Павлова", 26, "Преподаватель", "3 года", 100000);

        Student student1 = new Student("Иван", "Иванов", 20, 1, "Информатика", false);
        Student student2 = new Student("Алексей", "Смирнов", 21, 2, "Экономика", true);
        Student student3 = new Student("Мария", "Петрова", 19, 1, "Математика", false);
        Student student4 = new Student("Екатерина", "Сидорова", 20, 3, "Физика", true);
        Student student5 = new Student("Александр", "Кузнецов", 21, 2, "Экономика", false);
        Student student6 = new Student("Ольга", "Васильева", 19, 1, "Информатика", true);
        Student student7 = new Student("Дмитрий", "Петров", 20, 3, "Физика", false);
        Student student8 = new Student("Анна", "Смирнова", 21, 2, "Экономика", true);
        Student student9 = new Student("Николай", "Иванов", 19, 1, "Математика", false);
        Student student10 = new Student("Елена", "Козлова", 20, 3, "Физика", true);

        student1.print();
        employee5.print();
        System.out.println();
        System.out.println(student2);



        Schedule schedule = new Schedule("8:00 - 9:30 \n9:40 - 11:10 \n8:00 - 9:30 \n8:00 - 9:30 \n", new Date());

        schedule.print();

        ArrayList<Student> students = new ArrayList<Student>(Arrays.asList(student1, student2, student3, student4, student5, student6, student7, student8, student9, student10));
        ArrayList<Employee> employees = new ArrayList<Employee>(Arrays.asList(employee1, employee2, employee3, employee4, employee5, employee6, employee7, employee8, employee9, employee10));





    }
}