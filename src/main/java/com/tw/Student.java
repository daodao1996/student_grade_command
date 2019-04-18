package com.tw;

public class Student {
    private String id;
    private String name;
    private String nation;
    private String className;
    private float math;
    private float chinese;
    private float english;
    private float code;
    private float total;

    Student(String name,String id,String nation,String className,
            float math,float chinese,float english,float code){
        this.name = name;
        this.id = id;
        this.nation = nation;
        this.className = className;
        this.math = math;
        this.chinese = chinese;
        this.english = english;
        this.code = code;
        if(nation.equals("汉族")){
            this.total = math+chinese+english+code;
        }else{
            this.total = math+chinese+english+code+10;
        }
    }
//    姓名|数学|语文|英语|编程|平均分|总分
    @Override
    public String toString() {
        return  name + '|' + math + '|' + chinese +
                "|" + english + "|" + code + "|" + total/4 +
                "|" + total;
    }

    public String getId() {
        return id;
    }

    public float getTotal(){
        return total;
    }

    public String getName(){
        return name;
    }
}
