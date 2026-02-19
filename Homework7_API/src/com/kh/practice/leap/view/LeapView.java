package com.kh.practice.leap.view;

// 날짜 정보를 가져오기 위한 Calendar 클래스
import java.util.Calendar;

// 윤년 계산과 날짜 계산을 담당하는 Controller 클래스
import com.kh.practice.leap.controller.LeapControll;

public class LeapView {

    // LeapControll 객체 생성
    // → 윤년 판단, 날짜 계산 기능 사용을 위해 필요
    LeapControll lc = new LeapControll();

    /**
     * LeapView 생성자
     * 객체가 생성되면 자동으로 실행됨
     */
    public LeapView() {

        // 현재 날짜 정보를 가진 Calendar 객체 생성
        Calendar c = Calendar.getInstance();

        // 현재 연도(예: 2025) 가져오기
        int year = c.get(Calendar.YEAR);

        /*
         * 삼항 연산자를 사용해 윤년 여부 출력
         * isLeapYear(year)가 true이면 "윤년"
         * false이면 "평년"
         */
        System.out.println(
            year + "년은 " +
            (lc.isLeapYear(year) ? "윤년" : "평년") +
            "입니다"
        );

        // 1년 1월 1일부터 오늘까지의 총 날짜 수 계산
        long total = lc.leapDate(c);

        // 계산된 총 날짜 수 출력
        System.out.println("총 날짜 수 :" + total);
    }
   
}
