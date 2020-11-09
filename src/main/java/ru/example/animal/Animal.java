package ru.example.animal;

public class Animal {
    private int age;
    private String color;
    private String name;
    private boolean isDomestic; //является домашним или диким
    private boolean isSwim; //умеет ли плавать
    private boolean isClimbsTrees; //умеет ли лазить по деревьям

    public Animal(int age, String color, boolean isDomestic) {
        this.age = age;
        this.color = color;
        this.isDomestic = isDomestic;
    }

    public Animal() {
        this(1,"grey",false);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isDomestic() {
        return isDomestic;
    }

    public void setDomestic(boolean domestic) {
        isDomestic = domestic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSwim() {
        return isSwim;
    }

    public void setSwim(boolean swim) {
        isSwim = swim;
    }

    public boolean isClimbsTrees() {
        return isClimbsTrees;
    }

    public void setClimbsTrees(boolean climbsTrees) {
        isClimbsTrees = climbsTrees;
    }

    public void move() {
        System.out.println("Животное передвигается");
    }
    public void eat() {
        System.out.println("Животное питается");
    }
    public void makeSounds() {
        System.out.print("Животное издает звуки ");
    }
    public void swim(){   }
    public void climbsTrees(){   }

    @Override
    public String toString() {
        return "животное, " +
                "возраст=" + age +
                ", цвет='" + color + '\'' +
                ", имя='" + name + '\'' +
                ", домашнее=" + isDomestic +
                ", плавает=" + isSwim +
                ", лазит по деревьям=" + isClimbsTrees;
    }
}
