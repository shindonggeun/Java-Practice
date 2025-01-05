package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>(); // 생성 시점에 T의 타입 결정
        integerBox.setValue(10);
//        integerBox.setValue("문자100"); // Integer 타입만 허용, 컴파일 오류
        Integer integer = integerBox.getValue(); // Integer 타입 반환 (캐스팅 필요 없음)
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.setValue("hello");
        String str = stringBox.getValue();
        System.out.println("str = " + str);

        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.setValue(10.5);
        Double doubleValue = doubleBox.getValue();
        System.out.println("doubleValue = " + doubleValue);

        // 타입 추론: 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>();
    }

}
