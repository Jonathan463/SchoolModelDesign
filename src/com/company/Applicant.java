package com.company;

public class Applicant extends BaseEntity{

    //private int age;
    public Applicant(int age, String firstName, String secondName){
        //super(age);
        super(age,firstName,secondName);
        //this.age = age;

    }

    public Applicant(String firstName, String secondName) {
        super(firstName,secondName);
    }

    public int getAge() {
        return super.getAge();
    }

    public void setAge(int age) {
        super.age = age;
    }

    @Override
    public String getFirstName() {
        return getFirstName();
    }

    @Override
    public String getSecondName() {
        return getFirstName();
    }
}
