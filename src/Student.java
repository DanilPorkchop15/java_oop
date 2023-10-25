public class Student extends Person {
    private int group;
    private String specialization;
    private boolean social_scholarship;
    protected  static int student_id;
    static{
        student_id = 200000;
    }

    public Student(String name, String surname, int age, int group, String specialization, boolean social_scholarship) {
        super(name, surname, age);
        this.group = group;
        this.specialization = specialization;
        this.social_scholarship = social_scholarship;
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
    public void activity() {
        System.out.println("Talking with friends.");
    }

    @Override
    public void work() {
        System.out.println("Studying...");
    }

    @Override
    public void rest() {
        System.out.println("Scrolling TikToks.");
    }

    @Override
    public void print() {

    }
}
