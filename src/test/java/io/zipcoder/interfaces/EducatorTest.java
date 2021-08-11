package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class EducatorTest{
    @Test
    public void teachEnumTest(){
        Student student = Students.getInstance().findById(1L);
        Educator.JOHN.teach(student,2);

        Double expected = 3.0;
        Double actual = student.totalStudyTime;

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void EducatorInstanceTest(){
        Instructor expected = Instructors.getInstance().findById(100L);
        Instructor actual = Educator.JOHN.instructor;

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void lectureEnumTest(){
        Student[] students = Students.getInstance().toArray();
        Educator.JOHN.lecture(students,19);

        Double expected = 2.0;
        Double actual = students[0].getTotalStudyTime();

        Assert.assertEquals(expected,actual);
    }

}