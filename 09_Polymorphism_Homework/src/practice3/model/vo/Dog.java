package practice3.model.vo;

public class Dog extends Animal {
	public static final String PLACE = "局斑墨其";
	private int weight;
	
	public Dog() {
		
	}
	public Dog(String name, String kinds, int weight){
		super(name, kinds);
		this.weight = weight;
	}
	
	
	public String getPLACE() {
		return PLACE;
	}
	public void setPLACE(String pLACE) {
		PLACE = pLACE;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public void speak() {
		//Animal 林家蔼
		System.out.println(super.toString() + "个公霸 : " + weight + "kg");
	}
}
