package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor(){
        Person person = new Person(3,"Nisha");
        String Name = "Nisha";
        long id = 3;

        Assert.assertEquals(id,person.getId());
        Assert.assertEquals(Name,person.getName());


    }
    @Test
    public void testSetName(){
        Person person = new Person(3,"Nisha");

        String expected = "Nisha";
        String actual = person.getName();

        Assert.assertEquals(expected,actual);
    }


}
