package paket2;

public class Animal {
	//protector ile yazd���m bir �eye o pakette her yerden eri�ebiliyoruz
	//ve private sayesinde getname yapmam�z gerekn yerde protect sayesinde this.name �eklide ula�abiliyoruz rahat yapmam�z� sa�l�yor
	//ama unutma burdan t�remesi gerekiyor
	protected String name;

	public Animal(String name) {
		super();
		this.name = name;
	}
	public void speak() {
		System.out.println("hayvan�n ismi: "+this.name);
	}
}
