package paket2;

public class student {
// biz burda e�er public i silersek i�te o zaman default oluyor ve sadece class kal�yor
	 //b�yle bir durumda sadece o paketteler ona eri�eilir ba�ka pakettekiler ona eri�emez
	private String name;
	
	
	
	public student(String name) {
		super();
		this.name = name;
	}
	public void info() {
		System.out.println("ismi: "+this.name);
	}
}
