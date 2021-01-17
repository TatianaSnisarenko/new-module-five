package lectures;

public class Animal {
    private int paws = 4;

    public Animal() {
        howManyPaws();
    }

    public void howManyPaws(){
        System.out.println(paws);
    }
}

class Cat extends Animal{
    private  int paws = 4;

    public Cat() {
    }

    @Override
    public void howManyPaws() {
        System.out.println(paws);
    }
}

class AnimalMain{
    public static void main(String[] args) {
        //Animal animal = new Animal();
        Cat cat = new Cat();
    }
}
