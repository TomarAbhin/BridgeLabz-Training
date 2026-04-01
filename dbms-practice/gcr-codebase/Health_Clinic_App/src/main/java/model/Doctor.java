package model;

public class Doctor {
    private int id;
    private String name;
    private int specialtyId;
    private String contact;
    private double fee;
    private boolean active;

    public Doctor(int id, String name, int specialtyId,
                  String contact, double fee, boolean active) {
        this.id = id;
        this.name = name;
        this.specialtyId = specialtyId;
        this.contact = contact;
        this.fee = fee;
        this.active = active;
    }

    public String getName() { return name; }
    public int getSpecialtyId() { return specialtyId; }
    public String getContact() { return contact; }
    public double getFee() { return fee; }
}
