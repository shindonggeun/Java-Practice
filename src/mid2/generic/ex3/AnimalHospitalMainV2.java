package mid2.generic.ex3;

import mid2.generic.animal.Cat;
import mid2.generic.animal.Dog;

public class AnimalHospitalMainV2 {

    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();

        // 문제 발생: Integer, Object 같은 동물과 전혀 관계 없는 타입을 타입 인자로 전달할 수 있는 점
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> objectHospital = new AnimalHospitalV2<>();
    }

}
