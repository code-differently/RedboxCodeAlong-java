package com.cd.redbox;

public class Movie {

    private Long id;
    private String title;

    public Movie(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id= id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
    }
}
