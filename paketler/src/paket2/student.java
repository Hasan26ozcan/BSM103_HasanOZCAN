package paket2;

public class student {
// biz burda eðer public i silersek iþte o zaman default oluyor ve sadece class kalýyor
	 //böyle bir durumda sadece o paketteler ona eriþeilir baþka pakettekiler ona eriþemez
	private String name;
	
	
	
	public student(String name) {
		super();
		this.name = name;
	}
	public void info() {
		System.out.println("ismi: "+this.name);
	}
}
