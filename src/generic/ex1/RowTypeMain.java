package generic.ex1;

public class RowTypeMain {

    public static void main(String[] args) {
        // 제네릭 타입을 사용할 때는 항상 <>을 사용해서 사용시점에 원하는 타입을 지정해야하지만
        // 다음과 같이 <>을 지정하지 않을 수 있는데, 이런 것을 로 타입 (row type), 또는 원시 타입이라고 한다.
        // 원시 타입을 사용하면 내부의 타입 매개변수가 Object로 사용된다고 이해하면 된다.
        GenericBox intergerBox = new GenericBox();
//        GenericBox<Object> intergerBox = new GenericBox<>(); // 권장
        intergerBox.setValue(10);
        Integer result = (Integer) intergerBox.getValue();
        System.out.println("result = " + result);
    }
}
