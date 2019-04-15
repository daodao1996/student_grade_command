package com.tw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Klass {
    private String className;
    private Map<String,Student> students = new HashMap<>();

    public void addStudent(Student s){
        this.students.put(s.getId(),s);
    }

    public float getAverage(List<Float> l){
        return l.stream().reduce((a,b) -> a+b).get();
    }

    public float getMedian(List<Float> l){
        if(l.size() > 1){
            l.stream().sorted();
            if(l.size() % 2 != 0){
                return l.get( (l.size()-1) / 2);
            }else{
                return (l.get(l.size()/2) +
                        l.get(l.size()/2 - 1))/2;
            }
        }else{
            return l.get(0);
        }
    }

    public String getGradeListById(List<String> studentID) {
        List<Float> totalList = new ArrayList<>();
        String result="成绩单\n" +
                "姓名|数学|语文|英语|编程|平均分|总分\n" +
                "========================\n";
        StringBuilder studentGrades = new StringBuilder();
        for(String id : studentID){
            if(students.containsKey(id)){
                studentGrades.append(students.get(id).toString());
                totalList.add(students.get(id).getTotal());
            }
        }

        return result + studentGrades + "========================\n" +
                "全班总分平均数："+ getAverage(totalList) +
                "\n全班总分中位数："+getMedian(totalList);
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
