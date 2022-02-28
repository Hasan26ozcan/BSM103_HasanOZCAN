package paket1;

import paket2.Animal;

 public class Horse extends Animal {
public Horse(String name) {
		super(name);
		
	}

@Override
public void speak() {
	// iþte normalden farklý olarak private olsaydý ya da public
	System.out.println(this.name+"konuþma iþlemi yapýyor");
}

}


