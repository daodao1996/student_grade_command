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

    public String getInformation(){
        return this.name+" "+this.id+" "+this.nation+" "+this.className
        +" "+this.math+" "+this.chinese+" "+this.english+" "+this.code;
    }

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

    public String getClassName(){
        return className;
    }
}
