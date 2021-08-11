package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PeopleTest {

    @Test
    public void testAdd() {
        //Given
        People people = Instructors.getInstance();
        List expected  = new ArrayList<Person>();
        Person person = new Person(3L,"George");

        //When
         people.add(person);

        //Then
        Assert.assertTrue(people.contains(person));

    }
    @Test
    public void testRemove() {
        //Given
        People people = Instructors.getInstance();
        List expected  = new ArrayList<Person>();
        Person person = new Person(3L,"George");

        //When
        people.remove(person);

        //Then
        Assert.assertFalse(people.contains(person));

    }
    @Test
    public void testFindById() {
        //Given
        Person person = new Person(4L,"Meson");
        People people = new People();
        people.add(person);
        Person expected = person;

        //When
         Person actual = people.findById(4L);


        //Then
        Assert.assertEquals(expected,actual);

    }



}