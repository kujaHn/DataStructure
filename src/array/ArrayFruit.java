package array;

import java.util.Arrays;

public class ArrayFruit {
    public static void main(String[] args) {
        // 각 타입에 따라 String[], int[] 등등 가능하다.
        // 방법1 : String[] fruit = new String[]{"사과", "수박", "배", "포도", "딸기"};
        // 방법2
        String[] fruit = new String[5];
        fruit[0] = "사과";
        fruit[1] = "수박";
        fruit[2] = "배";
        fruit[3] = "포도";
        fruit[4] = "딸기";

        // 원하는 값의 인덱스를 알아야 출력이 가능하다.
        System.out.println(fruit[1]);

        // 배열의 변수 명만으로는 전체를 출력할 수 없다.
        System.out.println(fruit);

        // 반복문을 이용해서 배열 전체를 출력할 수 있다.
        for (String s : fruit) {
            System.out.print(s + " ");
        }
        System.out.println();

        // Arrays클래스에서는 이를 오버라이딩 된 toString()을 지원하고 있다.
        System.out.println(Arrays.toString(fruit));

        //String 클래스에서의 toString()은 인스턴스 주소를 호출한다.
        System.out.println(fruit.toString());
    }
}