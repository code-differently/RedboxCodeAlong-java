package com.cd.redbox;

import org.junit.Assert;
import org.junit.Test;

public class UserTest {
    @Test
    public void testGetId(){
        //given
        User user = new User(10L, null);
        //when
        Long expected = 10L;
        Long actual = user.getId();
        //then
        Assert.assertEquals(actual,expected);

    }
    @Test
    public void testGetName(){
        //given
        User user = new User(12L, "Java");
        //when
        String expected = "Java";
        String actual = user.getName();
        //then
        Assert.assertEquals(actual,expected);
    }
}
