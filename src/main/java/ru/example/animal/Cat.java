package ru.example.animal;

public class Cat extends Animal {
    private boolean isCatchMice; //ловит ли мышей

    public Cat(int age, String color, boolean isDomestic, boolean isCatchMice) {
        super(age, color, isDomestic);
        this.isCatchMice = isCatchMice;
        this.setClimbsTrees(true); //кошки лазят по деревьям
        this.setSwim(false); //кошки не умеют (не любят) плавать
    }

    public Cat() {
        this(1,"grey",true,true);
    }

    public boolean isCatchMice() {
        return isCatchMice;
    }

    public void setCatchMice(boolean catchMice) {
        isCatchMice = catchMice;
    }

    @Override
    public void makeSounds() {
        super.makeSounds();
        System.out.println(" - кошка мяукает");
    }

    @Override
    public String toString() {
        return "Кошка: " + super.toString() +
                ", ловит мышей=" + isCatchMice +
                ' ';
    }

    public void climbsTrees(){
        System.out.println("Кошка умеет лазить по деревьям");
    }
}
