package com.example.onlinecalc;

public class Model {
    private String name;
    private String txt;
    public Model(String name, String txt){
        this.txt = txt;
        this.name = name;
    }
    public String getName(){ return name; }
    public String getName2(){ return txt; }
}

