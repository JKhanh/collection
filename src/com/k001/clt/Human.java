package com.k001.clt;

public class Human implements Comparable<Human>{
    private String name;
    private int age;
    private String place;

    public Human(){

    };

    public Human(String name, int age, String place){
        super();
        this.name = name;
        this.age = age;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String toString(){
        return "Name = " + name + ", Age = " + age + ", Place = " + place;
    }

    @Override
    public int compareTo(Human human) {
        return this.getName().compareTo(human.getName());
    }
}
