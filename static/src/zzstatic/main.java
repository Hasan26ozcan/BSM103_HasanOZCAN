package zzstatic;


public class main {
	public static void deneme() {
		System.out.println("deneme");
	}
   public static void main(String[] args) {
	student student1=new student();
	student student2=new student();
	student student3=new student();
	deneme();// i�te burada oldu�u gibi static bir metot static olmayan bir metotdu �a��ramaz
// e�er yukardaki deeneme metotdunki statici silerek dene	
	
	
	System.out.println("��renci say�y�:"+student.no_of_students);
	student.deneme();
}
}
