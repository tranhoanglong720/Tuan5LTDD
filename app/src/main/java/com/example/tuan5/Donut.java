package com.example.tuan5;

public class Donut {
    private int id;
    private String Name1;
    private String Name2;
    private String Name3;

    public Donut(int id, String tasty_donut, String spicy_tasty_donut_family, String s) {
        this.id=id;
        this.Name1=tasty_donut;
        this.Name2=spicy_tasty_donut_family;
        this.Name3=s;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName1(String name1) {
        Name1 = name1;
    }

    public void setName2(String name2) {
        Name2 = name2;
    }

    public void setName3(String name3) {
        Name3 = name3;
    }


    public int getId() {
        return id;
    }

    public String getName1() {
        return Name1;
    }

    public String getName2() {
        return Name2;
    }

    public String getName3() {
        return Name3;
    }


}
