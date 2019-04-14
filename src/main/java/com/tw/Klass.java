package com.tw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Klass {
    private String className;
    private Map<String,Student> students = new HashMap<>();
    private List<Float> gradesList = new ArrayList<>();

    public void addStudent(Student s){
        this.students.put(s.getId(),s);
        gradesList.add(s.getTotal());
    }

    public float getAverage(){
        return gradesList.stream().reduce((a,b) -> a+b).get();
    }

    public float getMedian(){
        if(gradesList.size() % 2 != 0){
            return gradesList.get( (gradesList.size()-1) / 2);
        }else{
            return (gradesList.get(gradesList.size()/2) +
                    gradesList.get(gradesList.size()/2 - 1))/2;
        }
    }

    @Override
    public String toString() {
        String result="成绩单\n" +
                "姓名|数学|语文|英语|编程|平均分|总分\n" +
                "========================\n";
        StringBuffer studentGrades = new StringBuffer();
        for(Map.Entry<String,Student> entry : students.entrySet()){
            studentGrades.append(entry.toString());
        }

        return result + studentGrades + "========================\n" +
                "全班总分平均数："+ getAverage() +
                "\n全班总分中位数："+getMedian();
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
