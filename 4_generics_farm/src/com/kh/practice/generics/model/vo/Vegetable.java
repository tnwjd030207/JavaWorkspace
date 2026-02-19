package com.kh.practice.generics.model.vo;

public class Vegetable {
private Streing name;

public Vegetable() {
	
}

public Vegetable(String kind, Streing name) {
	super();
	this.name = name;
}

public Streing getName() {
	return name;
}

public void setName(Streing name) {
	this.name = name;
}

@Override
public String toString() {
	return "Vegetable []";
}




}
