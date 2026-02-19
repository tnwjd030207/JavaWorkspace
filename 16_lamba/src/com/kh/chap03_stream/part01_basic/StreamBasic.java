package com.kh.chap03_stream.part01_basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException; // 예외 처리 추가
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamBasic {
    public static void main(String[] args) {
        
        // 1. 배열
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // 변수명을 클래스명과 다르게 소문자로 시작 (intStream1)
        IntStream intStream1 = Arrays.stream(arr);
        
        String[] sArr = {"아자스", "야르", "무지컬"};
        Stream<String> stream = Arrays.stream(sArr);
        
        // 2. 컬렉션
        ArrayList<Integer> list = new ArrayList<>();
        Stream<Integer> arryStream = list.stream();
        
        Set<Integer> set = new HashSet<>();
        Stream<Integer> setStream = set.stream();
        
        HashMap<String, Integer> map = new HashMap<>();
        Stream<String> mapStream = map.keySet().stream();
        
        // 3. Stream 클래스를 통한 스트림 생성
        Stream<String> empty = Stream.empty();
        
        Stream<String> sStream = Stream.<String>builder()
            .add("A")
            .add("B")
            .build();
            
        Stream<String> oStream = Stream.of("a", "b", "c", "d");
        
        Stream<Integer> iStream = Stream.generate(() -> 1).limit(100); 
        
        // 첫 번째 iStream2
        Stream<Integer> iStream2 = Stream.iterate(1, i -> i + 1).limit(100);
        
        // 기본자료형 스트림을 통한 스트림 생성
        // 위에서 iStream2를 썼으므로 iStream4로 변경
        IntStream iStream4 = IntStream.range(1, 5); 
        IntStream iStream3 = IntStream.rangeClosed(1, 5); 
        
        // 4. 파일 스트림을 통한 스트림 생성
        // new 키워드 추가 및 IOException 처리
        try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            Stream<String> lines = br.lines();
            lines.forEach(str -> System.out.println(str));
        } catch (IOException e) {
            System.out.println("파일을 찾을 수 없거나 읽기 오류 발생");
        }
        
        // Stream의 반복문
        for (String str : sArr) {
            System.out.println(str);
        }
        
        stream.forEach((str) -> System.out.println(str));
        
        // 2, 4의 배수인 값들의 합 구하기 (기존 방식)
        int sum = 0;
        for (int i : arr) {
            if (i % 2 == 0 && i % 4 == 0) {
                sum += i;
            }
        }
        
        // 스트림으로 구현
        // 변수명 intStream1을 사용하여 필터링 진행
        IntStream iStream5 = Arrays.stream(arr) // 위에서 사용한 스트림은 소모되었으므로 새로 생성
                .filter(num -> num % 2 == 0)
                .peek(num -> System.out.println("peek: " + num))
                .filter(num -> num % 4 == 0);
        
        int sum2 = iStream5.sum();
        System.out.println("sum2: " + sum2);
    }
}