package list.basic;

import java.util.ArrayList;

public class RemoveFruit {
    public static void main(String[] args) {
        ArrayList fruit = new ArrayList();
        fruit.add("사과");
        fruit.add("수박");
        fruit.add("배");
        fruit.add("포도");
        fruit.add("딸기");

        System.out.println("삭제 전 : " + fruit);

        fruit.remove(3);

        System.out.println("삭제 후 : " + fruit);
    }
}
