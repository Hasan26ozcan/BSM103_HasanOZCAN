package algoritmas�nav�na�al��ma;

import java.util.Scanner;

public class y�zdeka��n�n�iftoldu�unuhesaplama {

	public static void main(String[] args) {
	int saya�=0;
	Scanner scan=new Scanner(System.in);
	int[] arr=new int[4];
	for (int index = 0; index < arr.length; index++) {
		arr[index]=scan.nextInt();
		if(arr[index]%2 ==0) {
			saya�++;
		
	}
	/*for (int de�er = 0; de�er < arr.length; de�er++) {
		if(arr[de�er]%2 ==0) {
			saya�++;
		}
	}*/
	}
	System.out.println("y�zde "+saya�*100/arr.length+"�ifttir");
	int tek=saya�*100/arr.length;
	int de�er=100-tek;
	System.out.println("y�zde "+de�er+"say�d�r");
//e�er b�l�l� durumda ise 2/4 ise mesela cevap 0 ��k�yor ve do�ru sonucu bize vermiyor
	}
	}
