package list.basic;

import java.util.ArrayList;
import java.util.List;

public class AddFruit {
    public static void main(String[] args) {
        //추가는 기본적으로 add 메소드를 사용
        ArrayList fruit = new ArrayList();
        fruit.add("사과");
        fruit.add("수박");
        fruit.add("배");
        fruit.add("포도");
        fruit.add("딸기");

        System.out.println("추가 전 : " + fruit);

        // add(값)을 사용하면 제일 뒤에 데이터가 추가가 된다.
        fruit.add("파인애플");

        //내가 원하는 곳에 데이터를 끼워넣을 수 있다.
        fruit.add(3, "바나나");
        System.out.println("추가 후 : " + fruit.toString());
    }
}
