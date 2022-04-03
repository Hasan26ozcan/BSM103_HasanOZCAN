import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class wordcount {
	public static void main(String[] args) throws FileNotFoundException {
		countwords();
	}
		
	public static void countwords() throws FileNotFoundException {	
		Set<String> words=new TreeSet<String>();
		ArrayList<String> screan=new ArrayList<>();
		Scanner scan=new Scanner(System.in);
		System.out.println("dosya adýný giriniz: ");
		String dosyaadý=scan.next();
		Scanner input=new Scanner(new File(dosyaadý));
		while(input.hasNext()) {
			
			/* words.add(içine yazýlabilecek yeri þöylede yapabiliriz)
			 * String deger=input.next().toLowerCase();
			 */
			String deger=input.next().toLowerCase();
			
			words.add(deger);
			screan.add(deger);
		}
		System.out.println("Set olan yer böyle:       "+words);
		System.out.println(words.size());
		System.out.println("ArrayList olan yer böyle: "+screan);
		System.out.println(screan.size());
		System.out.println("------------------------------------------");
		for (String string : words) {
			System.out.println(string);
		}
		System.out.println("--------------------");
		System.out.println(screan.containsAll(words));
		
	}

}
