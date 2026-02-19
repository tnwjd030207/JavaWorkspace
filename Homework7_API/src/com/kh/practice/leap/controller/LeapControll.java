package com.kh.practice.leap.controller;

//날짜 정보를 다루기 위한 Calendar 클래스 import
import java.util.Calendar;

public class LeapControll {

 /**
  * 윤년인지 아닌지를 판단하는 메서드
  * @param year 검사할 연도
  * @return 윤년이면 true, 아니면 false
  */
 public boolean isLeapYear(int year) {

     /*
      * 윤년 조건
      * 1. 4로 나누어 떨어지고
      * 2. 100으로 나누어 떨어지지 않거나
      * 3. 400으로 나누어 떨어지면 윤년
      */
     if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
         return true;   // 윤년
     }

     return false;      // 평년
 }

 
 /**
  * 1년 1월 1일부터 오늘까지의 총 날짜 수를 계산하는 메서드
  * @param c Calendar 객체 (오늘 날짜 정보)
  * @return 누적된 총 날짜 수
  */
 public long leapDate(Calendar c) {

     /*
      * 계산 순서
      * 1. 1년부터 작년까지의 날짜 수 누적
      * 2. 올해의 지난 달들 날짜 수 누적
      * 3. 이번 달의 날짜(date) 더하기
      */

     long total = 0;   // 총 날짜 수를 저장할 변수

     // 1️⃣ 1년부터 (현재 연도 - 1)까지의 날짜 계산
     for (int i = 1; i < c.get(Calendar.YEAR); i++) {
         // 각 연도가 윤년이면 366일, 평년이면 365일 더함
         if (isLeapYear(i)) {
             total += 366;
         } else {
             total += 365;
         }
     }

     /*
      * 현재 연도의 지난 달까지의 날짜 계산
      * 자바에서 월은 0부터 시작
      * 0 = 1월, 1 = 2월, ..., 11 = 12월
      */
     int month = c.get(Calendar.MONTH);

     for (int i = 0; i < month; i++) {
         switch (i) {

         // 31일까지 있는 달
         case 0, 2, 4, 6, 7, 9, 11:   // 1,3,5,7,8,10,12월
             total += 31;
             break;

         // 30일까지 있는 달
         case 3, 5, 8, 10:           // 4,6,9,11월
             total += 30;
             break;

         // 2월 (윤년 여부에 따라 다름)
         case 1:                     // 2월
             total += isLeapYear(c.get(Calendar.YEAR)) ? 29 : 28;
             break;
         }
     }

     // 3️⃣ 이번 달의 날짜 (오늘 날짜) 더하기
     int date = c.get(Calendar.DATE);
     total += date;

     // 최종 누적 날짜 수 반환
     return total;
 }
}
