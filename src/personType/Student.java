package personType;

import abstractClass.Person;

public class Student extends Person {
    private int group;
    private String specialization;
    private boolean social_scholarship;
    private final int student_id;
    private static int counter;

    static {
        counter = 100001;
    }


    public Student(String name, String surname, int age, int group, String specialization, boolean social_scholarship) {
        super(name, surname, age);
        this.group = group;
        this.specialization = specialization;
        this.social_scholarship = social_scholarship;
        student_id = counter++;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public boolean isSocial_scholarship() {
        return social_scholarship;
    }

    public void setSocial_scholarship(boolean social_scholarship) {
        this.social_scholarship = social_scholarship;
    }

    @Override
    public String toString() {
        return "humans.Student{" +
                "group=" + group +
                ", specialization='" + specialization + '\'' +
                ", social_scholarship=" + social_scholarship +
                "} " + super.toString();
    }

    @Override
    public void activity() {
        System.out.println(this.getName() + "Talking with friends.");
    }

    @Override
    public void work() {
        System.out.println(this.getName() + "Studying...");
    }

    @Override
    public void rest() {
        System.out.println(this.getName() + "Scrolling TikToks.");
    }

    @Override
    public void print() {
        System.out.println("-----------------------------------------");
        System.out.println("Student ID: " + student_id);
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurname());
        System.out.println("Age: " + getAge());
        System.out.println("Group: " + group);
        System.out.println("Specialization: " + specialization);
        System.out.println("Social scholarship: " + social_scholarship);
        System.out.println("-----------------------------------------");
    }

    public int getStudent_id() {
        return student_id;
    }
}


