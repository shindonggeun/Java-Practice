package mid2.generic.ex2;

import mid2.generic.animal.Animal;
import mid2.generic.animal.Cat;
import mid2.generic.animal.Dog;

public class AnimalMain2 {

    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이" , 100);
        Cat cat = new Cat("냐옹이", 50);

        Box<Animal> animalBox = new Box<>();
        animalBox.setValue(animal);
        animalBox.setValue(dog);
        animalBox.setValue(cat);

        Animal findAnimal = animalBox.getValue();
        System.out.println("findAnimal = " + findAnimal);
    }
}
