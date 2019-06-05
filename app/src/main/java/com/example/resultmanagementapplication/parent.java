package com.example.resultmanagementapplication;

public class parent {
    private String fname;
   private String mname;
   private String lname;
   private String phone_number;
   private String address;
   private String email_id;
   private String student_id;
   private String occupation;

    public parent(String fname, String mname, String lname, String phone_number, String address, String email_id, String student_id, String occupation) {
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.phone_number = phone_number;
        this.address = address;
        this.email_id = email_id;
        this.student_id = student_id;
        this.occupation = occupation;
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

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
