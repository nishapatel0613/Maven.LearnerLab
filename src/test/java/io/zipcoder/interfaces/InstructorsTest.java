package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest {

    @Test
    public void testGetInstance() {
        People people = Instructors.getInstance();
        int expected = 3;

        int actual = people.count();

        Assert.assertEquals(expected,actual);
    }
}