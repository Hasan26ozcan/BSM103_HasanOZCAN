package paket1;

import paket2.Animal;

public class protectedmain {

	public static void main(String[] args) {
	Animal hayvan=new Animal("adi");
	hayvan.speak();
	System.out.println(hayvan.name);
// bu hata �nemli bir hata paket 2 ve paket 1 e ba�tan sona tekrar tekrar okuman gerekli	 
	
	}

}
