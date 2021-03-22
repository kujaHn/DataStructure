package array;

public class NullArray {
    public static void main(String[] args) {
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
