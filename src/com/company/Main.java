package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String fname = "John";
        String sName = "peter";

        Staff staff = new Teacher("F100", "Physics","Jss1");
        Student student = new Student(30342, "Jonathan", "Godson");
        Course course = new Course("Physics","Phys101");
        System.out.println(course.getCourse());
        System.out.println(staff.getFirstName());
        System.out.println(staff);
        System.out.println(student);

    }
}
