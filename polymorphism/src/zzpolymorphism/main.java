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
		System.out.println("hayvan konuþuyor");
	}
	
}
class Bird extends Animal{

	public Bird(String name) {
		super(name);
		
	}

	@Override
	public void speak() {
		System.out.println(getName()+"ötüyor...");		
	}

}
class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public void speak() {
		System.out.println(getName()+"havlýyor...");
	}
	
}
class Horse extends Animal{

	public Horse(String name) {
		super(name);
		
	}

	@Override
	public void speak() {
	System.out.println(getName()+"kiþniyor");	
	}
	
}

public class main {
	
	public static void speaktry(Animal animal) {
		// mesela iþte burada olduðu gibi birden fazla metot yazmaya gerek yok 
		// eðer teker teker olsaydý o zaman 3 tane metot yazýcaktýk ve boþa yer
		animal.speak();
	}

	public static void main(String[] args) {	
		Animal animal=new Animal("karataþ");
		animal.speak();
		Animal bird=new Bird("maviþ ");
		bird.speak();
		Animal dog=new Dog("karabaþ ");
		dog.speak();
		Animal horse =new Horse("aytolgalý ");
		horse.speak();
		
		speaktry(new Horse("attolgalý"));
	}
}
