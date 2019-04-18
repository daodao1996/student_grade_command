package com.tw;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FormatTest {
    @Test
    public void testJudgeInputFormatAddStudentAndWhenInputCorrectFormat() {
        String input = "tom,2015,汉族,1,语文:90,数学:100,英语:88,编程:100";
        Format f = new Format(input);
        Student s = new Student("tom","2015","汉族","1",
                100,90,88,100);
        assertEquals(s.toString(),f.judgeInputFormatAddStudent().toString());
    }

    @Test
    public void testJudgeInputFormatAddStudentAndWhenInputWrongFormat() {
        String input1 = "tom,2015,汉族;1,语文:90,数学:100.英语:88,编程:100";
        String input2 = "tom,2015,汉族,1,语文:aa,数学:10e,英语:88,编程:100";
        Format f1 = new Format(input1);
        Format f2 = new Format(input2);
        assertNull(f1.judgeInputFormatAddStudent());
        assertNull(f2.judgeInputFormatAddStudent());
    }

    @Test
    public void testjudgeInputFormatSearchGradeAndWhenInputCorrectFormat() {
        String input = "2015,2016,2017,2018";
        List<String> idList= new ArrayList<>();
        idList.add("2015");
        idList.add("2016");
        idList.add("2017");
        idList.add("2018");
        assertEquals(new Format(input).judgeInputFormatSearchGrade(),
                idList);
    }

    @Test
    public void testjudgeInputFormatSearchGradeAndWhenInputWrongFormat() {
        String input1 = "2015;2016,2017?2018";
        String input2 = "2015,2016,2017,2018,";
        List<String> idList = new ArrayList<>();

        assertEquals(new Format(input1).judgeInputFormatSearchGrade(),idList);
        assertEquals(new Format(input2).judgeInputFormatSearchGrade(),idList);
    }

}
