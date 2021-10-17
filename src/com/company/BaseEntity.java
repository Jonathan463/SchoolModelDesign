package com.company;

abstract class BaseEntity {
    public String id;
    public int age;
    private String firstName;
    private String secondName;

    public BaseEntity(String id, int age, String firstName, String secondName){
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.secondName = secondName;
    }
    public BaseEntity(String id){
        this.id = id;
    }
    public BaseEntity(int age){
        this.age = age;
    }
    public BaseEntity(String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
    }
    public BaseEntity(int age, String firstName, String secondName){
        this.age = age;
        this.firstName = firstName;
        this.secondName = secondName;
    }
    public BaseEntity(String id, String firstName, String secondName) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
