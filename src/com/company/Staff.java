package com.company;

abstract class Staff extends BaseEntity{
    public Staff(String id, String firstName, String secondName){
        super(id);
    }

    public Staff(String id) {
        super(id);
    }
    public Staff(String firstName, String secondName){
        super(firstName,secondName);
    }
    abstract public String getName();
    abstract public String JobSpecification(String work);
}
