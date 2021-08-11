package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class ZipcodeWilmingtonTest {
    @Test
    public void hostLectureTest(){
        Students students = Students.getInstance();
        ZipcodeWilmington zipcodeWilmington = ZipcodeWilmington.getInstance();

        Double expected = 2.0;
        zipcodeWilmington.hostLecture(1L,19.0);
        Double actual = zipcodeWilmington.getStudyMap().get(students.findById(3L));

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void enumHostLecture(){
        ZipcodeWilmington zipcodeWilmington = ZipcodeWilmington.getInstance();
        Educator john = Educator.JOHN;

        zipcodeWilmington.hostLecture(john,19.0);
        Double expected = 19.0;
        Double actual = john.timeWorked;

        Assert.assertEquals(expected,actual);
    }

}