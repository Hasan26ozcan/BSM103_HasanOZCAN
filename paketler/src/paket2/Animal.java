package paket2;

public class Animal {
	//protector ile yazdýðým bir þeye o pakette her yerden eriþebiliyoruz
	//ve private sayesinde getname yapmamýz gerekn yerde protect sayesinde this.name þeklide ulaþabiliyoruz rahat yapmamýzý saðlýyor
	//ama unutma burdan türemesi gerekiyor
	protected String name;

	public Animal(String name) {
		super();
		this.name = name;
	}
	public void speak() {
		System.out.println("hayvanýn ismi: "+this.name);
	}
}
