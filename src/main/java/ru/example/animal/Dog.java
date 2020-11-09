package ru.example.animal;

public class Dog extends Animal {
    public Dog(int age, String color, boolean isDomestic, String name) {
        super(age, color, isDomestic);
        this.setClimbsTrees(false); //собаки не лазят по деревьям
        this.setSwim(true); // собаки плавают
        this.setName(name);
    }

    public void swim(){
        System.out.println("Собака умеет плавать");
    }

    @Override
    public String toString() {
        return "Собака: " + super.toString();
    }

    @Override
    public void makeSounds() {
        super.makeSounds();
        System.out.println(" - собака гавкает");
    }
}
