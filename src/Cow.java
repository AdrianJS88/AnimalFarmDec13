public class Cow extends Animal {

    @Override
    void sound() {

        System.out.println("mugeste vaca");
        SoundOfAnimals.soundOfAnimal("cow.mp3");
    }  @Override
    public void move() {
        System.out.println("asta e vaca , se misca altfel fata de caine si de vaca ");
    }
}
