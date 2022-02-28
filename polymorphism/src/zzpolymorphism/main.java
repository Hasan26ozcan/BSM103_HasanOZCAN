package zzpolymorphism;

class Animal{
	private String name;

	public Animal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void speak() {
		System.out.println("hayvan konu�uyor");
	}
	
}
class Bird extends Animal{

	public Bird(String name) {
		super(name);
		
	}

	@Override
	public void speak() {
		System.out.println(getName()+"�t�yor...");		
	}

}
class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public void speak() {
		System.out.println(getName()+"havl�yor...");
	}
	
}
class Horse extends Animal{

	public Horse(String name) {
		super(name);
		
	}

	@Override
	public void speak() {
	System.out.println(getName()+"ki�niyor");	
	}
	
}

public class main {
	
	public static void speaktry(Animal animal) {
		// mesela i�te burada oldu�u gibi birden fazla metot yazmaya gerek yok 
		// e�er teker teker olsayd� o zaman 3 tane metot yaz�cakt�k ve bo�a yer
		animal.speak();
	}

	public static void main(String[] args) {	
		Animal animal=new Animal("karata�");
		animal.speak();
		Animal bird=new Bird("mavi� ");
		bird.speak();
		Animal dog=new Dog("karaba� ");
		dog.speak();
		Animal horse =new Horse("aytolgal� ");
		horse.speak();
		
		speaktry(new Horse("attolgal�"));
	}
}
