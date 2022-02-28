package zzinterface;

public class Manager extends Employeee  {
	//miras alınan şeyde ekstradan birşey ekleme;
private int raise;
	public Manager(String isim, String department, int salary,int raise) {
		super(isim, department, salary);
		this.raise=raise;
	 System.out.println("bilgilerimiz burada daha rahar bir şekilde bulunabilir");
	}
	//ama eğer override etmeeden eklemek istersek ise o zaman baştan bir metotla yapalım bu işlemi
	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.info();
		System.out.println("burada ise ek olarak zamnıda söyleyeleim: "+this.raise);
	}
	@Override
	public String toString() {
		return "manager objesi";
	}
	public void raisesalary() {
		System.out.println("yapıalaca olan zam miktarı :"+this.raise);
	}

}
