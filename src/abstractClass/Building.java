package abstractClass;

import interfaces.IPrintable;

public abstract class Building implements IPrintable {
    private String name;
    private String address;
    private String customer;
    private String building_permit;

    public Building(String name, String address, String customer, String building_permit) {
        this.name = name;
        this.address = address;
        this.customer = customer;
        this.building_permit = building_permit;
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getBuilding_permit() {
        return building_permit;
    }

    public void setBuilding_permit(String building_permit) {
        this.building_permit = building_permit;
    }
}
