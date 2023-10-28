package university;

import interfaces.IPrintable;

import java.util.Date;

public class Schedule implements IPrintable {
    private String information;
    private Date date;

    public Schedule(String information, Date date) {
        this.information = information;
        this.date = date;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "university.Schedule{" +
                "information='" + information + '\'' +
                ", date=" + date +
                '}';
    }
    @Override
    public void print() {
        System.out.println(toString());
    }
}
