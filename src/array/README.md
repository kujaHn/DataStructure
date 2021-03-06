# 배열(Array)

* 배열은 거의 모든 프로그래밍 언어에 구현되어 있다.
* 배열이란 연관된 데이터를 하나의 변수에 `그룹핑`해 관리하는 방법.
* 배열을 쓰면 변수 하나에 여러 정보를 담을 수 있고, 주로 `반복문`을 첨가해 효율적으로 처리한다.

## 배열 입력
* 방법 1
```
public class ArrayFruit {
    public static void main(String[] args) {
        String[] fruit = new String[5];
        fruit[0] = "사과";
        fruit[1] = "수박";
        fruit[2] = "배";
        fruit[3] = "포도";
        fruit[4] = "딸기";
    }
}
```  
* 방법 2
```
public class ArrayFruit {
    public static void main(String[] args) {
        String[] fruit = new String[]{"사과", "수박", "배", "포도", "딸기"};
    }
}
```
* `사과`, `수박`, 같은 값들은 `배열에 저장된 값`이다.
    * 저장할 값의 `타입`에 따라 `String[]`, `int[]` 등등으로 나뉜다.
* `[숫자]`는 각 값들을 식별하는 `인덱스`이다. 간단히 `값`들의 `주소`라고 생각을 하면 된다.
    * 배열을 선언할때 사용되는 `[숫자]` 는 `배열의 크기`이다.
* `값`과 `인덱스`를 합친것을 `엘리먼트`라고 한다.

## 배열 출력
배열을 불러오거나 출력을 하려면 `주소`를 알아야 한다. 이것을 `인덱스`라고 했었다.  
```
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
```
* 결과  
![image](https://user-images.githubusercontent.com/72388950/112017430-f3ee2280-8b70-11eb-8b48-e423298f040f.png)

* 특정한 `인덱스`를 입력해서 값을 불러올 수 있다.
* 일반적으로 변수 명만으로는 전체를 출력할 수 없다. => 인스턴스 주소가 출력이 된다.
* `반복문`을 이용해서 한번에 출력도 가능하다.
* `Arrays` 클래스에서는 한번에 출력을 가능케 하는 오버라이딩 된 `toString()`를 지원하고 있다.
    * `Arrays`클래스의 `toString()` 구현코드
    ```
        public static String toString(Object[] a) {
            if (a == null)
                return "null";

            int iMax = a.length - 1;
            if (iMax == -1)
                return "[]";

            StringBuilder b = new StringBuilder();
            b.append('[');
            for (int i = 0; ; i++) {
                b.append(String.valueOf(a[i]));
                if (i == iMax)
                    return b.append(']').toString();
                b.append(", ");
            }
        }
    ```
* 레퍼런스 변수를 `출력`할 경우 `String`타입의 `toString()`을 따른다.
    * `println(레퍼런스 변수)` 구현코드
        ```
        public void println(Object x) {
            String s = String.valueOf(x);
            if (getClass() == PrintStream.class) {
                // need to apply String.valueOf again since first invocation
                // might return null
                writeln(String.valueOf(s));
            } else {
                synchronized (this) {
                    print(s);
                    newLine();
                }
            }
        }
        ```
    * `valueOf(레퍼런스 변수)` 구현코드   
        ```
        public static String valueOf(Object obj) {
            return (obj == null) ? "null" : obj.toString();
        }
        ```
    * `String` 클래스의 `toString()` 구현코드
        ```
        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
        ```
     그렇기 떄문에 `[Ljava.lang.String;@16b98e56`과 같은 `인스턴스 주소(hashCode)`가 출력이 되는 것이다.

## 배열의 특징
### 1. 변하지 않는 인덱스

fruit[2]를 null로 선언을 해 보자.

```
public class NullArray {
    public static void main(String[] args) {
        // 각 타입에 따라 String[], int[] 등등 가능하다.
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
```
그에따른 결과는 다음과 같다.  
```
사과
수박
배
포도
딸기
-----------------
사과
수박
null
포도
딸기
```
이렇게 `null`값이 남는다. 배열은 인덱스에 따라 값을 유지하기 떄문에 엘리먼트를 삭제해도 빈 공간이 남는다.  
좋게 말하자면 수정을해도 인덱스 값이 변경되지 않아서 안정성이 있고  
나쁘게 말하자면 빈자리가 남아 메모리의 낭비가 있다.  
이 특징들을 바꾸어서 말하자면, `불변`하는 인덱스를 이용한 `조회`가 빠르고, `추가`, `삭제` 는 느리다.

### 크기가 변하지 않는다.
맨 처음 배열을 선언하는 코드를 보자
`String[] fruit = new String[5];` 여기서 우리는 `배열의 크기`를 지정했었다.  
만약에 크기를 지정하지 않으면 어떻게 될까?  
`java: array dimension missing`라는 컴파일 에러가 뜨게 된다.  
이렇게 배열은 크기를 반드시 지정해 주어야 하기떄문에 `확장성`이 떨어진다.  
이를 보완하는게 `리스트` 이다.
## 결론
`인덱스`가 중요한 정보라면 `배열`을 사용하자.
