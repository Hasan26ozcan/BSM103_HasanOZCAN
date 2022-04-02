import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maps2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("test.txt"));
		Map<String , Integer> words=new HashMap<>();
		while(input.hasNext()) {
			String deger=input.next().toLowerCase();
			if(!words.containsKey(deger)) {
				
			words.put(deger, 1);
			}
			else {
			int sayi=words.get(deger);
				words.put(deger, sayi+1);
			}
		}
		System.out.println(words);
	}

}
