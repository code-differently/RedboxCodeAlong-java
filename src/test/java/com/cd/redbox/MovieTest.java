package com.cd.redbox;

import org.junit.Assert;
import org.junit.Test;

public class MovieTest {

    @Test
    public void testGetId() {
        //given
        Movie movie = new Movie(10L, null);
        //when
        Long expected = 10L;
        Long actual = movie.getId();
        //then
        Assert.assertEquals(actual, expected);
    }


}
