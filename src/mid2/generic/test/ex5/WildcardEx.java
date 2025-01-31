package mid2.generic.test.ex5;

import mid2.generic.animal.Animal;

public class WildcardEx {

    // 이것은 제네릭 메서드이다.
    // Box<Dog> dogBox를 전달한다. 타입 추론에 의해 타입 T가 Dog가 된다.
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    // 이것은 제네릭 메서드가 아니다. 일반적인 메서드이다.
    // Box<Dog> dogBox를 전달한다. 와일드카드 ?는 모든 타입을 받을 수 있다.
    // Box<Dog>, Box<Cat>, Box<Object> 등 다 가능
    // ? 만 사용해서 제한없이 모든 타입을 다 받을 수 있는 와일드카드를 비제한 와일드카드라 한다. -> ? == <? extends Object> 로 해석 가능
    static void printWildcardV1(Box<?> box) {
        System.out.println("? = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }
}
