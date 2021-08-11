package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class StudentTest{

    Student student = new Student(3,"Nisha");
    @Test
    public void testImplementation(){
        //Given
        long expectedId = 3;
        String expectedName = "Nisha";
        double expectedTotalNumberOfHours = 4;
        double expectedGetTotalStudyTime = 4;

        //When
        double actualGetTotalStudyTime = student.getTotalStudyTime();

        //Then
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        //Given
        long expectedId = 3;
        String expectedName = "Nisha";
        double expectedTotalNumberOfHours = 4;
        double expectedGetTotalStudyTime = 4;

        //When
        double actualId = student.getId();
        String actualName = student.getName();

        //Then
        Assert.assertEquals(expectedId,actualId,0);
        Assert.assertEquals(expectedName,actualName);

    }
    @Test
    public void testLearn(){
        //Given
        Student student = new Student(9L,"Jhon");

        //When
        student.learn(50);


        //Then
        Assert.assertEquals(50,student.totalStudyTime,0);

    }

}