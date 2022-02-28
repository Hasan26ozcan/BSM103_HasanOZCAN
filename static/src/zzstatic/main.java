package zzstatic;


public class main {
	public static void deneme() {
		System.out.println("deneme");
	}
   public static void main(String[] args) {
	student student1=new student();
	student student2=new student();
	student student3=new student();
	deneme();// işte burada olduğu gibi static bir metot static olmayan bir metotdu çağıramaz
// eğer yukardaki deeneme metotdunki statici silerek dene	
	
	
	System.out.println("öğrenci sayıyı:"+student.no_of_students);
	student.deneme();
}
}
