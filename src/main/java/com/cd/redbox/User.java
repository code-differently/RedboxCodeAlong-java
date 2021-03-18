package com.cd.redbox;

public class User {
    private Long id;
    private String name;

    public User(Long id, String name){
        this.id=id;
        this.name=name;

    }
    public Long getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
}
