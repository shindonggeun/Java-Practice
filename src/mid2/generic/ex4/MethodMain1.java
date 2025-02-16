package mid2.generic.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        // 타입 인자 (Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전잘");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);

        String s = GenericMethod.<String>genericMethod("hello");
//        GenericMethod.<String>numberMethod("hello"); // 컴파일 오류: Number의 자식만 입력 가능 (제네릭 메서드도 타입 매개변수 제한 가능)

        // 제네릭 메서드를 호출할 때 타입 추론 가능함
        // 타입 추론, 타입 인자 생략 가능 (해당 경우 타입을 추론해서 컴파일러가 대신 처리하기 때문에 타입을 전달하지 않는 것처럼 보이지만 실제로는 타입 인자가 전달됨!)
        System.out.println("타입 추론");
        Integer result1 = GenericMethod.genericMethod(i);
        Integer integerValue1 = GenericMethod.numberMethod(10);
        Double doubleValue1 = GenericMethod.numberMethod(20.0);
    }
}
