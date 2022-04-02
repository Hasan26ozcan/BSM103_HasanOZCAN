import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class sets2 {
	public static void main(String[] args) throws FileNotFoundException {
		Set<String> wrods=new HashSet<String>();
		Set<String> wrods2=new HashSet<String>();
		wrods =read();
		System.out.println(wrods);
		wrods2=read();
		wrods.addAll(wrods2);// mesela bu da farklý bir yöntem oalrak söylenebilir
		System.out.println(wrods);
		//next bi boþluk göresiye kadar okur 
		//nextline ise o cümle o satýr bitesie kadar okur
		wrods.addAll(read());
		// itersek burda bir tane daha set oluþtururuz ona da ikinici deðeri atarýz öylede birleþtirebiliriz
		System.out.println(wrods);
		for (String words : read()) {
			System.out.println(words);
		}
		// ve set sayesinde önceden olan elemaný yazdýrmýyoruz
		
	}	
	public static Set<String>	read() throws FileNotFoundException {
		Set<String> words =new TreeSet<String>();
		Scanner scan=new Scanner(System.in);
		System.out.println("seçmek istedðiniz dosya adýný giriniz: ");
		String filename=scan.next();
		Scanner input=new Scanner(new File(filename));
		while(input.hasNext()) {// okuncak birþey vamrý yokmu diye bakýyor while içi
			String screan=input.nextLine().toLowerCase();
			words.add(screan);
		}
			
			return words;	
	}
}
