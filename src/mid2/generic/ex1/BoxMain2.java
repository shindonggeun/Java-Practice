package mid2.generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.setValue(10);
        Integer integer = (Integer) integerBox.getValue();; // 다운 캐스팅 (Object -> Integer 캐스팅)
        System.out.println("integer = " + integer);
        
        ObjectBox stringBox = new ObjectBox();
        stringBox.setValue("hello");
        String str = (String) stringBox.getValue(); // 다운 캐스팅 (Object -> String 캐스팅)
        System.out.println("str = " + str);

        // 잘못된 타입의 인수 전달시
        integerBox.setValue("문자100");
        Integer result = (Integer) integerBox.getValue(); // String -> Integer 캐스팅 예외 (Runtime Exception - ClassCastException)
        System.out.println("result = " + result);
    }
}
