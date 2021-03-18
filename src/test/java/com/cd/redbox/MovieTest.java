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
    @Test
    public void getTitleTest() {
        //given
        Movie movie = new Movie(2L, "Ready Player One");
        //when
        String expected = "Ready Player One";
        String actual = movie.getTitle();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setIdTest(){
       // given
       Movie movie = new Movie(8L, "Ready Player Two");
       movie.setId(11L);
       Long expected = 11L;
       Long actual = movie.getId();
       Assert.assertEquals(expected, actual);

    }

    @Test
    public void setTitleTest(){
        //give
        Movie movie =new Movie(8L,"Ready Player Two");
        movie.setTitle("Sister Act");
        String expected = "Sister Act";
        String actual = movie.getTitle();
        Assert.assertEquals(expected, actual);
    }
}

