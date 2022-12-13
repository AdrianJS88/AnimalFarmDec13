public class Horse extends Animal {

    @Override
    public void sound() {

    System.out.println("horse sound");
    SoundOfAnimals.soundOfAnimal("horse.mp3");
}

    @Override
    public void move() {
        System.out.println("horse se misca  ");
    }
}
