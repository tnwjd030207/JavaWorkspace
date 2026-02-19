package com.kh.chap2_protocol.tcp.server.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		//1) 연결하고자 하는 서버의 IP주소와 Port번호 저장
		int ServerPort = 30000;
		String serverIp = "192.168.10.18";
		
		Socket socket = null;
		
		//2) 서버의 IP주소와 Port번호를 활용하여 서버에 연결요청
		try {
			socket = new Socket(serverIp, ServerPort);
			try(BufferedReader br = new BufferedReader( new InputStreamReader(socket.getInputStream()));
					PrintWriter pw = new PrintWriter(socket.getOutputStream());
					Scanner sc = new Scanner(System.in);
					){
				
				while(true) {
					System.out.println("서버에 보낼 메세지 :");
					String messge = sc.nextLine();
					
					pw.println(messge);
					
					
					if(messge.equals("exit")) {
						System.out.println("접속 종료");
						break;
					}
					System.out.println("받은 메세지 :"+br.readLine());
				}
				
			}catch(IOException e) {
			e.printStackTrace();
		}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("서버 연결 성공!");
		
		//3) 서버와 연결된 입출력 스트림 생성

}
	}
