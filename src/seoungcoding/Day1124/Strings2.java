package seoungcoding.Day1124;

import java.util.Scanner;

//문자열 처리시 유용한 기능을 제공하는 메서드
//
public class Strings2 {
    public static void main(String[] args) {
        // 문자열 길이 : length

        // 문자열 검색
        //indexOf : 지정한 문자 찾기, 위치값 출력
        String str = "Hello, World!!";
        int idx = str.indexOf('W');
        System.out.println(idx);
        idx = str.indexOf('s');
        System.out.println(idx);
        idx = str.indexOf("Hello");
        System.out.println(idx);

        //lastIndexOf(문자): 오른쪽 기준 지정한 문자 찾기, 위치값 출력
        str = "Hello, Hi, Noon";
        idx = str.lastIndexOf('H');
        System.out.println(idx);

        // 문자 바꾸기 : replace
        // replace(찾을 문자열, 바꿀문자열)

        str = "A*B*C*D";
        str = str.replace("*", "-");
        System.out.println(str);
        //문자열 분리 : spilt
        //지정한 문자를 기준으로 문자열을 나ㅝ 배열에 저장
        str = "201350050,김태희,경기도,1985.3.22,컴퓨터,504";
        String[] result = str.split(",");

//        for(int i = 0; i <result.length; ++i){
//            System.out.println(result[i]);
//        }

        for(String data : result){
            System.out.println(data);
        }//향상된 for문을 사용하면 배열을 쉽게 다룰수 있음
        //문자열 추출 : substring
        //substring(시작위치, 끝위치-1)
        str = "Hello, World!!";
        String data = str.substring(str.indexOf('W'),12);
        System.out.println(data);

        //ex) 주민번호에서 성별체크하는 자바코드 작성
        //123456-123455, 123123-4567890
        //1, 2 : 2000년 이전 남여 구분
        //3, 4 : 2000년 이후 남여 구분

        Scanner sc = new Scanner(System.in);
        System.out.println("주민등록번호 입력하시오(-포함) : ");
        String strs = sc.next();
        String[] st = strs.split("-");
        if(st[1].substring(0,1).equals("1")) {
            System.out.println("2000년 이전 남자");
        }else if(st[1].substring(0,1).equals("2")){
            System.out.println("2000년 이전 여자");
        }else if(st[1].substring(0,1).equals("3")){
            System.out.println("2000년 이후 남자");
        }else if(st[1].substring(0,1).equals("4")){
            System.out.println("2000년 이후 여자");
        }else
            System.out.println("외국인");

        //지정한 위치의 문자 추출 : charAt
        str = "970888-1009888";
        System.out.println(str.charAt(7));

        //
        int num = 1234567;
        String str1 = String.format("%d", num);
        String str2 = "1234567";

        str1 = String.format("%,d", num);
        System.out.println(str1.matches(str2));

        System.out.println(str1.matches("[a-z].+"));
        System.out.println(str1.matches("[0-9].+"));
        // 정규표현식 regular expression
        // 특정한 규칙을 가진 문자열의 집합을 표현하기 위하여 사용하는 형식언어
        //[0-9] : 숫자집합
        //[a-z,A-Z] : 영문자 집합
        //[가-힣] : 한글 집합
        //* : 0이상 무한개의 임의의 문자 반복
        //ab* : ab, ab
        //+ :1개 이상 무한개의 임의의 문자 반복
        //ab+ : aba, ab1, abA, abaa, ...
        // ? : 0개 또는 1개의 임의의 문자 반복
        //ab? : aba, abb, ... ab0, abZ, abz
        //{n,m} : 최소 n개 이상 m개 이하 반복
        //[0-9]{3,4} : 123, 987 , 1234, 9876
        // ^ : 문자열 시작
        // ^123 : 123으로 시작하는 문자열 의미
        //$ : 문자열 끝
        //123$ : 123으로 끝나는 문자열 의미
        //. : 임의의 문자를 의미
        //.{3, } : 문자의 최소길이는 3
        //ex) 사용자 아이디가 다음규칙에 적합하게 작성되었는지 학인



        //다음 문자열이 전화번호형식에 맞게 작성되었는지
        //알아보는 정규식을 작성하세요
        //010-123-4567, 011-1234-5678
        String phone = "010-123-4567";
        String pattern1 = "[0-9]{3}-[0-9]{3,4}-[0-9]{4}";
        System.out.println(phone.matches(pattern1));

        String id = "2asdD84!";
        String pattern2 = "[a-zA-Z0-9!]+";
        System.out.println(id.matches(pattern2));
        //첫 글자는 영문자 소문자/대문자
        // 두번째는 영문자, 숫자, 특수기호 등이 포함
        //최소 길이는 6~18자
        String id2 = "a2asd2!";
        String pattern3 = "^[a-zA-Z]{1}[a-zA-Z0-9!@#$%^&*+=?/-]{5,17}";
        System.out.println(id2.matches(pattern3));
    }

}
