package com.kh.chap02_String.controller;

public class B_StringBuilderAndStringBuffer {
	
	/*StringBuilder and StringBuffer
	 * - ���ڿ� ��� ����Ŭ����
	 * - ���ڿ��� �޸� ���� �̽��� �ذ��ϱ� ���� ������� Ŭ����
	 * - �� Ŭ������ ������� ������
	 * - �������� "����ȭ" ����
	 * 
	 * - StringBuilder�� ����ȭ�� �������� �ʱ� ������ "��Ƽ������ȯ��"���� ���� ������ ���δ�
	 * - StringBuffer�� ����ȭ�� �����ϱ� ������ "��Ƽ������ȯ��"���� ������ �������� ������ �� ������ ������ ���� ���ϴ�
	 * 
	 */
	
	public void mathod() {
		String str = "Hello";
		str += "World";
		
		StringBuilder sb1 = new StringBuilder("Hello");
		sb1.append("World"); // ���� ����������� �̾�� ����
		sb1.append("!!!"); //�ּҰ� 1���� ���
		
		StringBuffer sb2 = new StringBuffer("Hello");
		sb2.append("World!");
		
		System.out.println(sb1);
		System.out.println(sb2);
		
		System.out.println("���ڿ��� ���̴�?"+sb1.length());
		System.out.println("���ڿ����� 0�� ������ ��ġ��?"+sb1.lastIndexOf("0"));
		
		//0�� �ε������� ���ڸ� ����
		System.out.println("��� ���� ���� :"+sb1.delete(0, sb1.length()));
		
		//Ư�� ��ġ�� ���ڸ� ����
		System.out.println("������ ��ġ�� ���� �����ϱ� :"+sb1.delete(0, sb1.length()-1));
		
	}
}
