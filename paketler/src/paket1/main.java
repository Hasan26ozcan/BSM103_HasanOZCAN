package paket1;

import java.util.ArrayList;
import java.util.Scanner;

import paket2.student;

public class main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<String> a=new ArrayList();
		student screan =new student("ahmet");
		screan.info();
//		mesela burada oldu�u gibi biz burda student2 i�in biz ba��ndaki publici sildik ve sonucunda 
		//bizi etkileyen bir�ey ��kmad�
		student2 paket1student=new student2("ahmet");
		paket1student.info();
	}

}
