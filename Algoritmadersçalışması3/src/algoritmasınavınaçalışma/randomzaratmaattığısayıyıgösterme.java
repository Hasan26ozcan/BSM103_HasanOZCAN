package algoritmas�nav�na�al��ma;
import java.util.*;
public class randomzaratmaatt���say�y�g�sterme {

	public static void main(String[] args) {
	int[] zar=new int[6];
	Random r=new Random();	
	for (int index = 0; index < 6 ; index++) {
		zar[r.nextInt(6)]++;
		
	}
	for (int de�er = 0; de�er < zar.length; de�er++) {
		System.out.println(de�er+1+"         "+zar[de�er] );
	}
	
	}
	
}
