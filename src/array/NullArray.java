package array;

public class NullArray {
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

        for (String s : fruit) {
            System.out.println(s);
        }

        System.out.println("-----------------");

        // index 2를 null 선언
        fruit[2] = null;

        for (String s : fruit) {
            System.out.println(s);
        }
    }
}
