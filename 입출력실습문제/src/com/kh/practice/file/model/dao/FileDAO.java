package com.kh.practice.file.model.dao;

import java.io.File;
import java.io.FileReader;

public class FileDAO {
	public boolean checkName(String file) {
		File f = new File(file);
		return f.exists();
	}
	
	public void fileSave(String file, String s) {
		try {
			fw = new FileWriter(file);
			
		} catch(){
			
		}
	}
	
	public StringBuilder  fileOpen(String file){
		FileReader fe = null;
		StringBuilder sb = new StringBuilder();
		
		try {
		fr = new FileReader(null);
		
		int value = 0;
		while((value = fc.read()) != -1) {
			sb.append(char)
		}
		} catch{
			
		}
	}
	
	public void  fileEdit(String file, String s) {
		
	}
}
