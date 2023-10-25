public class Employee extends Person{

    private String specialization;
    private String experience;
    private int salary;
    protected static int employee_id;

    static{
        employee_id = 100000;
    }

    public Employee(String name, String surname, int age, String specialization, String experience, int salary) {
        super(name, surname, age);
        this.specialization = specialization;
        this.experience = experience;
        this.salary = salary;
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

    }

    @Override
    public String toString() {
        return "Employee{" +
                "specialization='" + specialization + '\'' +
                ", experience='" + experience + '\'' +
                ", salary=" + salary +
                '}';
    }
}
