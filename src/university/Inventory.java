package university;

import interfaces.IPrintable;

public class Inventory implements IPrintable {
    private String name;
    private int count;

    public Inventory(String name, int count) {
        this.name = name;
        this.count = count;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "university.Inventory{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }
}
