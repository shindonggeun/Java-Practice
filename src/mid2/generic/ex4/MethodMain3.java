package mid2.generic.ex4;

import mid2.generic.animal.Cat;
import mid2.generic.animal.Dog;

public class MethodMain3 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 50);

        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.set(dog);

        // 제네릭 타입보다 제네릭 메서드가 높은 우선순위를 갖는다
        // 여기서 적용된 제네릭 메서드의 T는 상한이 없다. 따라서 Object로 취급된다
        // Object로 취급되기 때문에 t.getName()과 같은 Animal에 존재하는 메서드는 호출할 수 없다
        // 프로그래밍에서는 모호한 표현은 매우 좋지 않다!!!
        Cat returnCat = hospital.printAndReturn(cat); // Cat returnCat = hospital.<Cat>printAndReturn(cat); 같은 표현
        System.out.print("returnCAT = " + returnCat);
    }
}
