package mid2.generic.test.ex4;

import mid2.generic.animal.Cat;
import mid2.generic.animal.Dog;

public class MethodMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 100);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog targetDog = new Dog("큰 멍멍이", 200);
        Dog bigger = AnimalMethod.bigger(dog, targetDog); // 제네릭 메서드 호출 시 타입 추론 사용 -> AnimalMethod.<Dog>bigger(dog, targetDog);
        System.out.println("bigger = " + bigger);
    }
}
