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
		wrods.addAll(wrods2);// mesela bu da farkl� bir y�ntem oalrak s�ylenebilir
		System.out.println(wrods);
		//next bi bo�luk g�resiye kadar okur 
		//nextline ise o c�mle o sat�r bitesie kadar okur
		wrods.addAll(read());
		// itersek burda bir tane daha set olu�tururuz ona da ikinici de�eri atar�z �ylede birle�tirebiliriz
		System.out.println(wrods);
		for (String words : read()) {
			System.out.println(words);
		}
		// ve set sayesinde �nceden olan eleman� yazd�rm�yoruz
		
	}	
	public static Set<String>	read() throws FileNotFoundException {
		Set<String> words =new TreeSet<String>();
		Scanner scan=new Scanner(System.in);
		System.out.println("se�mek isted�iniz dosya ad�n� giriniz: ");
		String filename=scan.next();
		Scanner input=new Scanner(new File(filename));
		while(input.hasNext()) {// okuncak bir�ey vamr� yokmu diye bak�yor while i�i
			String screan=input.nextLine().toLowerCase();
			words.add(screan);
		}
			
			return words;	
	}
}
