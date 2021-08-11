package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class InstructorTest{

    @Test
    public void testImplementation(){
        //Given
        Instructor instructor = new Instructor(5L,"John");
        Learner[] learners = new Learner[10];
        double expectedNumberOfHours = 6;

        //When

       // double actualNumberOfHours = instructor.lecture(learners,5);

        //Then
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        //Given
        Instructor instructor = new Instructor(5L,"John");
        long expectedId = 5;
        String expectedName = "John";

        //When
        long actualId = instructor.getId();
        String actualName = instructor.getName();

        //Then
        Assert.assertTrue(instructor instanceof Person);
    }
    @Test
    public void teachTest(){
        //Given
        Instructor instructor = new Instructor(5L,"John");
        Student student = new Student(10L,"George");
        instructor.teach(student,25);

        //When
        double expectedStudyTime = 25;
        double actualStudyTime = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expectedStudyTime,actualStudyTime,0);
    }
    @Test
    public void testLecture(){
        //Given
        Instructor instructor = new Instructor(5L,"John");
        Student george = new Student(5L,"George");
        Student meson = new Student(6L,"Meson");
        Student joe = new Student(7L,"Joe");
        Learner[] learners = {george,meson,joe};

        instructor.lecture(learners,25);

        double expectedGeorge = 50;
        double expectedMeson = 50;
        double expectedJoe = 50;

        //When
        double actualGeorge = george.getTotalStudyTime();
        double actualMeson = meson.getTotalStudyTime();
        double actualJoe = joe.getTotalStudyTime();

        //Then
        Assert.assertEquals(expectedGeorge,actualGeorge,0);
        Assert.assertEquals(expectedMeson,actualMeson,0);
        Assert.assertEquals(expectedJoe,actualJoe,0);
    }


}