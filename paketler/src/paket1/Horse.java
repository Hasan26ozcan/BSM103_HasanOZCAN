package paket1;

import paket2.Animal;

 public class Horse extends Animal {
public Horse(String name) {
		super(name);
		
	}

@Override
public void speak() {
	// i�te normalden farkl� olarak private olsayd� ya da public
	System.out.println(this.name+"konu�ma i�lemi yap�yor");
}

}


