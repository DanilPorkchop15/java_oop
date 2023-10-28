package personType;

import abstractClass.Person;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;

public class Employee extends Person {

    private String specialization;
    private String experience;
    private int salary;
    private final int employee_id;
    private static int counter;

    static{
        counter = 200001;
    }

    public Employee(String name, String surname, int age, String specialization, String experience, int salary) {
        super(name, surname, age);
        this.specialization = specialization;
        this.experience = experience;
        this.salary = salary;
        employee_id = counter++;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public void activity() {
        System.out.println("Talking with colleagues.");
    }

    @Override
    public void work() {
        System.out.println("Teaching...");
    }

    @Override
    public void rest() {
        System.out.println("Drinking coffee.");
    }

    @Override
    public void print() {
        System.out.println("Name: " + this.getName() + "\nSurname: " + this.getSurname() + "\nAge: " + this.getAge() + "\nSpecialization: " + this.specialization + "\nExperience: " + this.experience + "\nSalary: " + this.salary + "\nID:" + this.getEmployee_id());
    }

    @Override
    public String toString() {
        return "humans.Employee{" +
                "specialization='" + specialization + '\'' +
                ", experience='" + experience + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void remark(Student s){
        System.out.println("Сотрудник " + this.getName() + " " + this.getSurname() + " сделал зачемание студенту: " + s.getName() + " " + s.getSurname());
    }

    public void remark(ArrayList<Student> s){
        for(Student i: s){
            System.out.println("Сотрудник " + this.getName() + " " + this.getSurname() + " сделал зачемание студенту: " + i.getName() + " " + i.getSurname());
        }
    }


}

