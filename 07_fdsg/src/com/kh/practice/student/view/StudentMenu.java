package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	private StudentController ssm = new StudentController();
	
	public StudentMenu() {
		System.out.println("========== 학생 정보 출력 ==========");
		Student[] arr = ssm.printStudent();  //학생객체배열
		for(Student s: arr) {
			System.out.println(s.inform());
		}
		
		System.out.println("========== 학생 성적 출력 ==========");
		System.out.println("학생 점수 합계 : "+(int)ssm.avgScore()[0]);
		System.out.println("학생 점수 평균 : "+ssm.avgScore()[1]);
		
		System.out.println("========== 성적 결과 출력 ==========");
		for(Student s:arr) {
			System.out.println(s.getName()+"은 "+(
					s.getScore()<StudentController.CUT_LINE ? "재시험 대상입니다." : "통과입니다."));
	
	}
}
}