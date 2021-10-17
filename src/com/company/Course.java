package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Course {

    private String courseName;
    private String courseCode;

    HashMap<String, String> map;

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public void setCourse(String courseName, String courseCode) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public String getCourse() {
        String course = "";
        for (Map.Entry<String, String> entry : map.entrySet()) {
            course = entry.getKey() + ":" + entry.getValue();
        }
        return course;
    }


    public String CourseList(String courseName, String courseCode) {

        String listOfCourse = null;
        map = new HashMap<>();
        map.put("Physics", "PHY101");
        map.put("Introductory Mathematics", "MATHS101");
        map.put("Organic Chemistry", "ICH101");
        map.put(courseName, courseCode);

        for (Map.Entry<String, String> entry : map.entrySet()) {
            listOfCourse = entry.getKey() + ":" + entry.getValue();
        }
        return listOfCourse;

    }
}