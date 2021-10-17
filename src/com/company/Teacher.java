package com.company;

public class Teacher extends Staff{

    //private String id;
    private String courseAssignedTo;
    private String classInchargeOf;

    @Override
    public String getName() {
        return null;
    }

    public Teacher(String id, String courseAssignedTo, String classInchargeOf){
        super(id);
        this.classInchargeOf = classInchargeOf;
        this.courseAssignedTo = courseAssignedTo;
    }
    public String getCourseAssignedTo() {
        return courseAssignedTo;
    }

    public void setCourseAssignedTo(String courseAssignedTo) {
        this.courseAssignedTo = courseAssignedTo;
    }

    public String getClassInchargeOf() {
        return classInchargeOf;
    }

    public void setClassInchargeOf(String classInchargeOf) {
        this.classInchargeOf = classInchargeOf;
    }



    /*public String getId() {
        return id;
    }*/;

    public void setId(String id) {
        super.id = id;
    }
    public String getId(){
        return id;
    }

    @Override
    public String JobSpecification(String work) {
        return work;
    }
    @Override
    public String toString(){
        return String.format("Teachers Id is : %s%n Course Assigned To Teacher Is : %s%n And Class Incharged Of Is : %s",super.id, courseAssignedTo, classInchargeOf);
    }
}
