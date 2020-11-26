package seoungcoding.Day1125;

import java.util.*;
import java.util.Collection;


public class AdvCollection {
    // set : 집합
    // set 인터페이스를 구현한 컬렉션 클래스
    // 요소의 저장순서가 유지 안됨
    // 데이터를 중복으로 저장 불가

    // HashSet : 해쉬 알고리즘을 이용해서
    //데이터를 저장하기 때문에 검색속도가 빠름

    //일반적으로 저장된 지료의 양에 상관없이
    //특정 데이터를 찾는데 걸리는 시간이
    //항상 일정할 순 없을까?
    //=> 해쉬 알고리즘을 이용해서 실현
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        //데이터 추가 : add
        names.add("혜교");
        names.add("지현");
        names.add("수지");
        names.add("지현");

//        for(int i = 0; i < names.size(); ++i){
//            if(names.equals("혜교")){
//                System.out.println((i+1)+"번째에서 찾음");
//                break;
//            }


//
//        }//위치기반 검색
        for (String n : names) {
            if (n.equals("수지")) {
                System.out.println("데이터 찾음");
                break;
            }
        }//값 기반 검색
        if (names.contains("혜교")) {
            System.out.println("데이터 찾음!!");
        } else
            System.out.println("데이터 못찾음!!");//값 기만 검색


        //컬렉션 요소 순환iterate하기
        //컬렉션 프레임워크에 저장된 각 요소들을
        //읽어오는 방법을 표준화한 것

        Iterator<String> iter = names.iterator();
        //Iterator는 OOP프로그래밍에서 배열이나
        //그와 유사한 자료구조의 내부 요소를
        //순회하는 객체를 의미

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        //데이터 수정 : set (사용불가)
        //names.set(0, "수현");
        //따라서, 먼저 remove한 후 add로 처리
        //혜교를 수현으로 바꾸는 경우
        names.remove("혜교");
        names.add("수현");

        //hashset에 다양한 유형의 값을 추가해 봄
        names.add("apples");
        names.add("peach");
        names.add("berry");

        names.add("123");
        names.add("789");
        names.add("456");

        iter = names.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("\n");
        //값들이 특이한 순서로 출력됨
        //결과는 각 데이터의 고유 해쉬값에 의해 정렬되어 출력

        //https://url.kr/IJ7jdR
        //sha256 hash코드 생성기
        //sha (secure hash algorithm)
        //256 : 256bit 길이의 코드생성

        //ex) 로또 6/45 프로그램 생성
        //1~45사이 임의의 숫자 6개를 만드는 코드 작성
        //단, 중복은 허용하지 않음

        Set<Integer> Lotto = new HashSet<>();

        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        for (int i = 0; i < 6; i++){
            Lotto.add(random.nextInt(45)+1);
            if(Lotto.size() == i ) {
                i--;
            }
        }

        TreeSet TreeLotto = new TreeSet(Lotto);

        Iterator<Integer> ite = TreeLotto.iterator();

        while (ite.hasNext()) {
            System.out.print("["+ite.next()+"] ");
        }

//        int RandomNum[] = new int[6];
//        Random random = new Random();
//        random.setSeed(System.currentTimeMillis());
//
//        for (int i = 0; i < 6; i++) {
//            RandomNum[i] = random.nextInt(45)+1;
//            for(int j=0; j < i; j++) {
//                if(RandomNum[i] == RandomNum[j])
//                    i--;
//            }
//        for (i = 0; i < 6; i++) {
//            System.out.print("[" + RandomNum[i] + "] ");
//        }
//        } //배열로 짠 로또 번호 생성기

        //HashMap
        //키와 값으로 저장하는 컬렉션 클래스
        //Map인터페이스를 구현한 컬렉션 클래스
        //키와 값을 하나의 쌍으로 저장하는 방식을 사용
        //키는 실질적으로 값을 찾기 위한 방편으로 사용
        //요소의 저장 순서는 유지되지 않음
        //키는 중복 데이터를 저장할 수 없음
        //단, 값은 중복으로 저장 할 수 있음
        // 해쉬 알고리즘을 사용하기 때문에
        //검색속도가 매우 빠름
        System.out.println("\n");

        //데이터 추가 : put(키, 값)
        //게임이름과 가격을 저장하는 해시맵을 생성
        Map<String, Integer> product = new HashMap<>();
        product.put("디아블로", 30000);
        product.put("서든어택", 45000);
        product.put("오버워치", 20000);

        //값 조회 : get(key)
        System.out.println("\n"+product.get("서든어택"));
        //모든 키 확인 : keySet
        //keySet의 리턴값은
        Set<String> keys = product.keySet();

        for (String a : keys) {
            System.out.println(a);
        }
        //모든 값 확인 : values
        //values 메서드의 리턴값
        Collection<Integer> vals = product.values();
        for (Integer val : vals)
            System.out.println(val);


        Map<Integer, GameInfo> games = new HashMap<>();
        games.put(123, new GameInfo("블랙서바이벌", 35000));
        games.put(234, new GameInfo("워크래프트", 30000));
        games.put(345, new GameInfo("롤", 40000));

        Set<Integer> key1 = games.keySet();
        //키가 234인 게임의 정보 출력

        System.out.println(games.get(234).name);
        System.out.println(games.get(234).price);
        for (Integer a : key1) {
            if (games.get(a).name.equals("블랙서바이벌")) {
                System.out.println("찾음");
                break;
            }
        }//값 기반 검색

        //GameInfo의 모든 게임 정보 출력
//        for (Integer w : key1) {
//            System.out.println("키가" + key1 + "인 게임정보");
//            System.out.println(games.get(key1).name);
//            System.out.println(games.get(key1).price);
//        }

        //해시알고리즘
        //해시함수 : 임의의 길이를 갖는 임의의 데이터에 대해
        //고정된 길이의 데이터로 매핑하는 함수
        //해시값 : 해시함수를 적용해서 나온 값
        //해시함수는 복잡한 알고리즘을 사용하지 않기 때문에
        //CPU연산이 많이 필요하지 않음
        //같은 입력값에 대해서는 같은 출력값이 출력
        //단, 해시함수 알고리즘에 따라 다르게 출력 가능
        //간혹, 서로 다른 데이터에 대해 같은 결과값이
        //나오는 경우발생 => 충돌
        //대표적인 해시함수 : MD5, SHA256
        //응용분야 : 레코드 검색, 유사 레코드 비교, 암호화


    }
}