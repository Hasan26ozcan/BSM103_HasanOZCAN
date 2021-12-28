import java.util.ArrayList;
public class aarlistçalýþmasý {

	public static void main(String[] args) {
		ArrayList<String> arkhe =new ArrayList();
		
		arkhe.add("selamlar güzellik");
		arkhe.add("çok güzelsin sen ya");
		arkhe.add("boþuna aþýk olmadým sana");
		arkhe.add("caným kodlama");
		arkhe.add("seviliyorsun yavrum");
		arkhe.add("<3");

		System.out.println("elamlar 0 ýn karþýlýðý: "+ arkhe.get(0));
		System.out.println("elamlar 1 ýn karþýlýðý: "+ arkhe.get(1));
		System.out.println("elamlar 2 ýn karþýlýðý: "+ arkhe.get(2));
		System.out.println("elamlar 3 ýn karþýlýðý: "+ arkhe.get(3));
		System.out.println("elamlar 4 ýn karþýlýðý: "+ arkhe.get(4));
		System.out.println("elamlar 5 ýn karþýlýðý: "+ arkhe.get(5));
		System.out.println("5 i tekrarla: "+ arkhe.get(5));
		
		for(int i=0;i<arkhe.size();i++){
			System.out.println("elemanlar: "+arkhe.get(i));
			
		}


	}

}
