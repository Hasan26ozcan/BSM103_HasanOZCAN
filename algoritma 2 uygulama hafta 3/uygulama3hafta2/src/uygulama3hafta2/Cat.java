package uygulama3hafta2;

public class Cat {
	
	int age;
	String color;
	String name;
	
	public Cat() {
		this.color="renk girilmedi";
		this.age =0;
		this.name="isim girilmedi";
		
		
	}
	public Cat(String name, int age) {
		this.name=name;
		this.age=age;
		
	}
	public Cat(String name,String color,int age) {
		this.age=age;
		this.color=color;
		this.name=name;
	}
	public Cat(int age,String name,String color) {
		this.age=age;
		this.color=color;
		this.name=name;
	}

}
