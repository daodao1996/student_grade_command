package com.tw;

import java.util.HashMap;
import java.util.Map;

public class Klass {
    private String className;
    private Map<String,Student> students = new HashMap<>();

    public void addStudent(Student s){
        this.students.put(s.getId(),s);
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Map<String, Student> getStudents() {
        return students;
    }

    public void setStudents(Map<String, Student> students) {
        this.students = students;
    }
}
