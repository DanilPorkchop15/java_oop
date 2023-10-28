package university;

import abstractClass.Building;
import personType.Employee;
import personType.Student;

import java.util.ArrayList;

public final class University extends Building {

    private ArrayList<Inventory> inventoryList;
    private ArrayList<Student> students;
    private ArrayList<Employee> employees;
    private Schedule schedule;

    public University(String name, String address, String customer, String building_permit, ArrayList<Inventory> inventoryList, ArrayList<Student> students, ArrayList<Employee> employees, Schedule schedule) {
        super(name, address, customer, building_permit);
        this.inventoryList = inventoryList;
        this.students = students;
        this.employees = employees;
        this.schedule = schedule;
    }

    public ArrayList<Inventory> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(ArrayList<Inventory> inventoryList) {
        this.inventoryList = inventoryList;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "university.University{" +
                "inventoryList=" + inventoryList +
                ", students=" + students +
                ", employees=" + employees +
                ", schedule=" + schedule +
                '}';
    }

    @Override
    public void print() {
        System.out.println("university.University Name: " + getName());
        System.out.println("university.University Address: " + getAddress());
        System.out.println("university.University Customer: " + getCustomer());
        System.out.println("university.University abstractClass.Building Permit: " + getBuilding_permit());
        System.out.println("university.University university.Inventory List: " + inventoryList);
        System.out.println("university.University Students: " + students);
        System.out.println("university.University Employees: " + employees);
        System.out.println("university.University university.Schedule: " + schedule);
        System.out.println();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addInventory(Inventory inventory) {
        inventoryList.add(inventory);
    }

    public void removeInventory(Inventory inventory) {
        inventoryList.remove(inventory);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void countList() {
        System.out.println("Количество студентов: " + students.size());
        System.out.println("Количество работников: " + employees.size());
        System.out.println("Количество инвентаря: " + inventoryList.size());
    }

    public void printStudentsWithScholarship() {
        for (Student student : students) {
            if (student.isSocial_scholarship()) {
                student.print();
            }
        }
    }

    public void printSpecialtiesWithEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.getSpecialization());
        }
        for (Employee employee : employees) {
            System.out.println("------------------");
            System.out.println("Специальность: " + employee.getSpecialization());
            System.out.println("Работники:");
            for (Employee emp : employees) {
                if (emp.getSpecialization().equals(employee.getSpecialization())) {
                    emp.print();
                }
            }
            System.out.println("------------------");
        }
    }

    public void printSpecialtiesWithStudents() {
        for (Student student : students) {
            System.out.println(student.getSpecialization());
        }
        for (Student student : students) {
            System.out.println("------------------");
            System.out.println("Специальность: " + student.getSpecialization());
            System.out.println("Студенты:");
            for (Student std : students) {
                if (std.getSpecialization().equals(student.getSpecialization())) {
                    std.print();
                }
            }
            System.out.println("------------------");
        }
    }

    public void printStudentById(int id) {
        for (Student student : students) {
            if (student.getStudent_id() == id) {
                student.print();
                return;
            }
        }
        System.out.println("Студент с id " + id + " не найден");
    }

    public void printEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getEmployee_id() == id) {
                employee.print();
                return;
            }
        }
        System.out.println("Работник с id " + id + " не найден");
    }
    public void printSchedule(){
        System.out.println(schedule.getDate());
        System.out.println(schedule.getInformation());
    }
}