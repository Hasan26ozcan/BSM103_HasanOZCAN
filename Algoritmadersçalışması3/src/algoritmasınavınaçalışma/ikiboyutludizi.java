package algoritmasýnavýnaçalýþma;

import java.util.Scanner;

public class ikiboyutludizi {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
int[][] arr=new int[2][3];
System.out.println("tablo deðerlerinizi griniz: ");
for(int index=0;index<2;index++) {
	for (int deðer = 0; deðer < 3; deðer++) {
		arr[index][deðer]=scan.nextInt();
	}
}

}
}