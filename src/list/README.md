# 리스트(LIST)
* 배열은 바뀌지 않는 `인덱스`를 이용해서 `빠른 데이터 조회`가 장점이였으나, 데이터를 `삭제` 하는 경우 빈 공간이 생긴다.
* `리스트`는 `빠른 데이터 조회`를 포기하고, **빈 공간을 없앤** 데이터 스트럭처이다.

## 배열 vs 리스트

### 1. 삭제
다음과 같은 데이터들이 있다.  
  ![image](https://user-images.githubusercontent.com/72388950/112004660-57725300-8b65-11eb-8810-3c1f9b3d39ce.png)  
여기서 `index 2`의 데이터를 제거해 본다면, 배열과 리스트는 다음과 같은 차이점이 있을 것이다.  
* 배열   
![image](https://user-images.githubusercontent.com/72388950/112004789-77097b80-8b65-11eb-9d1b-8c74ef6c9830.png)

* 리스트  
![image](https://user-images.githubusercontent.com/72388950/112004814-7e308980-8b65-11eb-9dd4-1e95cbd038f0.png)  

구체적인 사용법은 `basic/RemoveFruit.class`를 참고하자.  
```
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
```
* 원하는 데이터를 제거하려면 `remove(인덱스)`을 사용하자.
### 2. 추가

기본적으로 `배열`은 데이터를 배열의 크기 이상으로 추가할 수 있는 방법이 없다.  
하지만 `리스트`는 충분히 가능하다. `basic/AddFruit.class`를 참고하자.
```
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
        System.out.println("추가 후 : " + fruit);
    }
}
```
* 기본적으로 마지막에 데이터를 추가하려면 `add(값)`을 사용하자.
* 원하는 `위치(인덱스)`에 추가하려면 `add(인덱스,값)`을 사용하자.
* 결과  
  ![image](https://user-images.githubusercontent.com/72388950/112009586-dc5f6b80-8b69-11eb-9e68-06289d45bc61.png)
