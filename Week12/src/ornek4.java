import java.util.Scanner;

public class algoritmasorular3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(" bir kelime giriniz: ");
		String kelime=scan.nextLine();
		System.out.println("girdiðiniz kelime: "+kelime);
		
		System.out.println("kelimenin tersten yazýlmýþ hali: "+tersten(kelime));
		}
public static String tersten(String harf) {
	String ters="";
	//kelime
	//emilek
	for(int index=harf.length();index>0;index--) {
		ters=ters+harf.substring(index-1,index);
		//ters="e"+"m"+"i"+"l"+"e"+"k"
		//abc a-0 b-1 c-3 substring(1,3) 
		
	}
	
	
	
	return ters;
}








	public static double ortalama(double[] arr) {
		double ortalama=0.0;
		double total=0;
		for (int index = 0; index < arr.length; index++) {
			total=total+arr[index];
			
		}
		ortalama=total/arr.length;
		return ortalama;
	}
	

}
