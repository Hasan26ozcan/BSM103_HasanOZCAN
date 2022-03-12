package uygulama3hafta2;

public class main {

	public static void main(String[] args) {
		Cat kedi1= new Cat(); 
		kedi1.color="sarý";
		System.out.println(kedi1.age+"	"+kedi1.color+"	"+kedi1.name );
		
		
		Cat kedi2=new Cat("karabaþ",3);
		System.out.println("ismi: "+kedi2.name+"		yaþý :"+kedi2.age+"		rengi :"+kedi2.color);
		
	    Cat kedi3=new Cat("karakedi","renkli",23);
	    System.out.println(kedi3.name+","+kedi3.age+","+kedi3.color);
	    Cat kedi4 =new Cat(56,"kedi","gri");
	    System.out.println(kedi4.age+","+kedi4.name+","+kedi4.color);
	}
}
