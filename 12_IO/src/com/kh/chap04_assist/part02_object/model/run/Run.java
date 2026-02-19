package com.kh.chap04_assist.part02_object.model.run;

import com.kh.chap04_assist.part02_object.model.dao.ObjectDao;
import com.kh.chap04_assist.part02_object.model.dao.ObjectDao1;

public class Run {

	public static void main(String[] args) {
		ObjectDao dao = new ObjectDao();
		//ob.fileSave();
		//ob.fileRead();
		
		ObjectDao1 dao2 = new ObjectDao1();
		dao2.fileSave();
		dao2.fileRead();
	}

}
