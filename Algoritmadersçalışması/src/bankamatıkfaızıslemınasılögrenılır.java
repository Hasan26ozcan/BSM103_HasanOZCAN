
public class bankamat�kfa�z�slem�nas�l�gren�l�r {

	public static void main(String[] args) {
		double birikenpara =0;
		double anapara =1000;
		double faiz = 0.05;
		
		System.out.println("y�ll�k olarak biriken para.");
		
		for(int yil =1;yil<=10;yil++) {
			
			birikenpara = anapara * Math.pow (1+faiz, yil);
			
			System.out.println("biriken para miktar�: "+yil+"         "+birikenpara);
		}

	}

}
