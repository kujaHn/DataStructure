package array;

public class Fruit {
    public static void main(String[] args) {
        // 각 타입에 따라 String[], int[] 등등 가능하다.
        String[] fruit = new String[5];
        fruit[0] = "사과";
        fruit[1] = "수박";
        fruit[2] = "배";
        fruit[3] = "포도";
        fruit[4] = "딸기";

        // 원하는 값의 인덱스를 알아야 출력이 가능하다.
        System.out.println(fruit[1]);

        // 반복문을 이용해서 한번에 출력도 가능하다.
        for (String s : fruit) {
            System.out.println(s);
        }
    }
}