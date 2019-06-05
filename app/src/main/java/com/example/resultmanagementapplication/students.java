package com.example.resultmanagementapplication;

public class students {
    private String id;
    private String fname;
    private String mname;
    private String lname;
    private String parent_name;
    private String parent_phone;
    private String dob;
    private String address;
    private String blood_group;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getParent_name() {
        return parent_name;
    }

    public void setParent_name(String parent_name) {
        this.parent_name = parent_name;
    }

    public String getParent_phone() {
        return parent_phone;
    }

    public void setParent_phone(String parent_phone) {
        this.parent_phone = parent_phone;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBlood_group() {
        return blood_group;
    }

    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }

    public students(String id, String fname, String mname, String lname, String parent_name, String parent_phone, String dob, String address, String blood_group) {
        this.id = id;
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.parent_name = parent_name;
        this.parent_phone = parent_phone;
        this.dob = dob;
        this.address = address;
        this.blood_group = blood_group;
    }
}
