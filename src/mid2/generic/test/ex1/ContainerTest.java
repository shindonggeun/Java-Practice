package mid2.generic.test.ex1;

public class ContainerTest {

    public static void main(String[] args) {
        Container<String> stringContainer = new Container<>();
        System.out.println("빈값 확인1: " + stringContainer.isEmpty()); // 빈값 확인1: true

        stringContainer.setItem("data1");
        System.out.println("저장 데이터: " + stringContainer.getItem()); // 저장 데이터: data1
        System.out.println("빈값 확인2: " + stringContainer.isEmpty()); // 빈값 확인2: false

        Container<Integer> integerContainer = new Container<>();
        integerContainer.setItem(10);
        System.out.println("저장 데이터: " + integerContainer.getItem()); // 저장 데이터: 10
    }
}