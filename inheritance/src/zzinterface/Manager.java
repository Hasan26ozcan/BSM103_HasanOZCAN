package zzinterface;

public class Manager extends Employeee  {
	//miras al�nan �eyde ekstradan bir�ey ekleme;
private int raise;
	public Manager(String isim, String department, int salary,int raise) {
		super(isim, department, salary);
		this.raise=raise;
	 System.out.println("bilgilerimiz burada daha rahar bir �ekilde bulunabilir");
	}
	//ama e�er override etmeeden eklemek istersek ise o zaman ba�tan bir metotla yapal�m bu i�lemi
	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.info();
		System.out.println("burada ise ek olarak zamn�da s�yleyeleim: "+this.raise);
	}
	@Override
	public String toString() {
		return "manager objesi";
	}
	public void raisesalary() {
		System.out.println("yap�alaca olan zam miktar� :"+this.raise);
	}

}
