package algoritmasýnavýnaçalýþma;
import java.util.*;
public class randomzaratmaattýðýsayýyýgösterme {

	public static void main(String[] args) {
	int[] zar=new int[6];
	Random r=new Random();	
	for (int index = 0; index < 6 ; index++) {
		zar[r.nextInt(6)]++;
		
	}
	for (int deðer = 0; deðer < zar.length; deðer++) {
		System.out.println(deðer+1+"         "+zar[deðer] );
	}
	
	}
	
}
