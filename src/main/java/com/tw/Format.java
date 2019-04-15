package com.tw;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Format {
    private String input;

    Format(String input){
        this.input = input;
    }

    public Student judgeInputFormatAddStudent(){
        String pattern = "(.+;.+)|(.+/..+)|(.+&.+)|(.+!.+)";
        String patternNumber = "[0-9]{1,2}.?[0-9]*";
        String[] studentInfo;
        if(!Pattern.matches(pattern,input) && input.split(",").length == 8){
            studentInfo = input.split(",");
            for(int iter=4;iter<studentInfo.length;iter++){
                if(Pattern.matches(patternNumber,studentInfo[iter].split(":")[1])){
                    studentInfo[iter] = studentInfo[iter].split(":")[1];
                }else{
                    return null;
                }
            }
        }else{
            return null;
        }

        return new Student(studentInfo[0],studentInfo[1],studentInfo[2],studentInfo[3],
                Float.parseFloat(studentInfo[4]),Float.parseFloat(studentInfo[5]),
                Float.parseFloat(studentInfo[6]),Float.parseFloat(studentInfo[7]));
    }

    public List<String> judgeInputFormatSearchGrade(){
        String patternNumber = "[0-9]+(,[0-9]+)*";
        List<String> studentsId = new ArrayList<>();
        if(Pattern.matches(patternNumber,input)){
            for(String id:input.split(",")){
                studentsId.add(id);
            }
        }
        return studentsId;
    }
}
