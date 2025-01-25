package mid2.generic.test.ex2;

public class PairTest {

    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>();
        pair1.setFirst(1);
        pair1.setSecond("data");
        System.out.println(pair1.getFirst()); // 1
        System.out.println(pair1.getSecond()); // data
        System.out.println("pair1 = " + pair1); // pair1 = Pair{first=1, second=data}

        Pair<String, String> pair2 = new Pair<>();
        pair2.setFirst("key");
        pair2.setSecond("value");
        System.out.println(pair2.getFirst()); // key
        System.out.println(pair2.getSecond()); // value
        System.out.println("pair2 = " + pair2); // pair2 = Pair{first=key, second=value}
    }
}
