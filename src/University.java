import java.util.ArrayList;

public final class University extends Building{

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
    public void print() {

    }

    @Override
    public String toString() {
        return "University{" +
                "inventoryList=" + inventoryList +
                ", students=" + students +
                ", employees=" + employees +
                ", schedule=" + schedule +
                '}';
    }
}
