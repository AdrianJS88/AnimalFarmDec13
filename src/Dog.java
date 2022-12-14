public  class Dog extends Animal{

    @Override
     void sound() {

        System.out.println("Sunet specific cainelui");
        SoundOfAnimals.soundOfAnimal("dog.mp3");
     }  @Override
    public void move() {
        System.out.println("Asta e caine si se misca foarte repede . ");
    }
}
