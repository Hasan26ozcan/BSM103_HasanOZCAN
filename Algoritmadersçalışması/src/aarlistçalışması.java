import java.util.ArrayList;
public class aarlist�al��mas� {

	public static void main(String[] args) {
		ArrayList<String> arkhe =new ArrayList();
		
		arkhe.add("selamlar g�zellik");
		arkhe.add("�ok g�zelsin sen ya");
		arkhe.add("bo�una a��k olmad�m sana");
		arkhe.add("can�m kodlama");
		arkhe.add("seviliyorsun yavrum");
		arkhe.add("<3");

		System.out.println("elamlar 0 �n kar��l���: "+ arkhe.get(0));
		System.out.println("elamlar 1 �n kar��l���: "+ arkhe.get(1));
		System.out.println("elamlar 2 �n kar��l���: "+ arkhe.get(2));
		System.out.println("elamlar 3 �n kar��l���: "+ arkhe.get(3));
		System.out.println("elamlar 4 �n kar��l���: "+ arkhe.get(4));
		System.out.println("elamlar 5 �n kar��l���: "+ arkhe.get(5));
		System.out.println("5 i tekrarla: "+ arkhe.get(5));
		
		for(int i=0;i<arkhe.size();i++){
			System.out.println("elemanlar: "+arkhe.get(i));
			
		}


	}

}
