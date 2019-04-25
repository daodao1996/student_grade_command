package com.tw;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;

public class IO {
    Klass klass = new Klass();
        public String input(String i) throws IOException {
            if (i.startsWith("1")) {
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入学生信息" +
                        "（格式：姓名, 学号, 民族, 班级, 学科: 成绩, ...），按回车提交：");
                String input = sc.nextLine();
                Student s = new Format(input).judgeInputFormatAddStudent();
                if(s != null){
                    String stuName = klass.addStudent(s);
                    return "学生"+stuName+"的成绩被添加";
                }else {
                    return "请按正确的格式输入" +
                            "（格式：姓名, 学号, 民族, 班级, 学科: 成绩, ...）：";
                }
            } else if (i.startsWith("2")) {
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入要打印的学生的学号" +
                        "（格式： 学号, 学号,...），按回车提交：");
                String input = sc.nextLine();
                List<String> stuIDList= new Format(input).judgeInputFormatSearchGrade();
                if(stuIDList != null){
                    return klass.getGradeListById(stuIDList);
                }else{
                    return "请按正确的格式输入要打印的学生的学号" +
                            "（格式： 学号, 学号,...），按回车提交：";
                }
            } else if (i.startsWith("3")) {
                System.exit(0);
                return "";   //根据id查询
            }else{
                return "";
            }
        }

        public void showMenu(){
            out.println("1. 添加学生\n" +
                    "2. 生成成绩单\n" +
                    "3. 退出请输入你的选择（1～3）：");
        }
}
