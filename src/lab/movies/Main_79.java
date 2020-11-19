package lab.movies;

import java.util.Arrays;

public class Main_79 {
    public static void main(String[] args) {
        String[] genre = {"액션","판타지","영웅","마법"};
        String[] dirtor = { "조 루소", "앤소니 루소", "안소니 루소"};
        String[] actor = { "크리스 에반스", "로버트", "크리스 헴 스위스"};
        String summary = "《어벤져스: 엔드게임》은 2019년 개봉한 미국의 슈퍼히어로 영화로, 마블 코믹스의 동명 팀을 원작으로 하고 있으며, " +
                "마블 스튜디오가 제작하고, 월트 디즈니 스튜디오스 모션 픽처스가 배급하였다.";
        String desc = "MCU의 성장은 모두 로다주 덕분";
        Movie aven = new Movie("어밴져스4", "2019", 180, "mavel", genre, dirtor, actor, summary, desc );

        System.out.println("영화 이름: "+aven.getTitle());
        System.out.println("개봉 연도: "+aven.getYear());
        System.out.println("러닝 타임: "+aven.getRuntime());
        System.out.println("제작사: "+aven.getPrdtin());
        System.out.println("장르: "+Arrays.toString(aven.getGenre()));
        System.out.println("영화 감독: "+Arrays.toString(aven.getDirtor()));
        System.out.println("출연 배우: "+Arrays.toString(aven.getActor()));
        System.out.println("영화 줄거리: "+aven.getSummary());
        System.out.println("배우 인삿말: "+aven.getDesc());

    }
}
//
//    배열을 문자열로 변환하는 방법
//          Arrays.toString( )
//    char 배열을 문자열로 변환하는 방법
//        String.valueOf( )
//        new String( )
//     문자열을 char로 변환하는 방법
//        .toCharArray( )
