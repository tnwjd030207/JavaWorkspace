package practice3.model.vo;

public abstract class Animal {
		private String name;
		private String Kinds;
		
		//접근제한자 protected
		public Animal() {
			
		}
		
		public Animal(String name, String kinds) {
			this.name = name;
			this.Kinds = kinds;
		}

		@Override
		public String toString() {
			return "Animal [name=" + name + ", Kinds=" + Kinds + "]";
		}
		
		public abstract void speak();
	
	
}
