package com.company;

public class Student extends BaseEntity {
    private int regNo;
    public Student(int regNo, String firstName, String secondName){
        super(firstName,secondName);
        this.regNo = regNo;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    @Override
    public String getFirstName(){
        return super.getFirstName();
    }
    @Override
    public String getSecondName(){
        return super.getSecondName();
    }

    public String getFullName(){
        return (super.getFirstName() +" "+ super.getSecondName());
    }
    @Override
    public String toString(){
        return String.format("Student Id is : %s%n with FirstName: %s%n And LastName : %s", id, super.getFirstName(), super.getSecondName());
    }

}
