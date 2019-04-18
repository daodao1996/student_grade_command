package com.tw;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


// name + '|' + math + '|' + chinese +
//                "|" + english + "|" + code + "|" + total/4 +
//                "|" + total
public class StudentTest {
    @Test
    public void testStudentToString() {
        Student s = new Student("tom","2015","汉族","1",
                99,80,90,100);
        String result = "tom|99.0|80.0|90.0|100.0|92.25|369.0";
        assertEquals(s.toString(),result);
    }
}
