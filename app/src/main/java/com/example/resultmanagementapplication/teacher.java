package com.example.resultmanagementapplication;

public class teacher {
    private String fname;
    private String mname;
    private String lname;
    private String teacher_phone;
    private String address;
    private String blood_group;
    private String join_date;
    private String email_id;

    public teacher(String fname, String mname, String lname, String teacher_phone, String address, String blood_group, String join_date, String email_id) {
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.teacher_phone = teacher_phone;
        this.address = address;
        this.blood_group = blood_group;
        this.join_date = join_date;
        this.email_id = email_id;
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

    public String getTeacher_phone() {
        return teacher_phone;
    }

    public void setTeacher_phone(String teacher_phone) {
        this.teacher_phone = teacher_phone;
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

    public String getJoin_date() {
        return join_date;
    }

    public void setJoin_date(String join_date) {
        this.join_date = join_date;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }
}
