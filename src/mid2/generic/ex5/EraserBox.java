package mid2.generic.ex5;

public class EraserBox<T> {

    public boolean instanceCheck(Object param) {
//        return param instanceof T; // 컴파일 오류 발생 -> 자바는 타입 매개변수에 instanceof를 허용하지 않는다
        return false;
    }

    public void create() {
//        return new T(); // 컴파일 오류 발생 -> 컴파일 한 뒤 new T는 항상 new Object가 되므로 개발자가 의도한 것과 다름, 따라서 자바는 타입 매개변수에 new를 허용하지 않음 (타입 이레이저)
    }
}
