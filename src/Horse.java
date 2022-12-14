public class Horse extends Animal {

    @Override
    public void sound() {

    System.out.println("horse sound");
    SoundOfAnimals.soundOfAnimal("Horse-Angry-Neigh-And-Breathing-www.fesliyanstudios.com.mp3");
}

    @Override
    public void move() {
        System.out.println("horse se misca diferit de caine si pisica  ");
    }
}
