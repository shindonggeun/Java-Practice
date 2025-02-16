package mid2.generic.test.ex3;

import mid2.generic.test.ex3.unit.BioUnit;

public class UnitPrinter {

    // 두가지 경우 똑같지만 이런 경우에는 와일드카드를 이용하는게 더 좋다
    public static <T extends BioUnit> void printV1(Shuttle<T> t1) {
        T unit = t1.out();
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }

    public static void printV2(Shuttle<? extends BioUnit> t1) {
        BioUnit unit = t1.out();
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }
}
