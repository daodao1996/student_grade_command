package com.tw;

import org.junit.Test;

import static org.junit.Assert.*;

public class FormatTest {
    @Test
    public void testJudgeInputFormatAddStudent() {
        String input = "tom,2015,汉族,1,语文:90,数学:100,英语:88,编程:100";
        Format f = new Format(input);
        Student s = new Student("tom","2015","汉族","1",
                100,90,88,100);
        assertEquals(s,f.judgeInputFormatAddStudent());
    }

}
