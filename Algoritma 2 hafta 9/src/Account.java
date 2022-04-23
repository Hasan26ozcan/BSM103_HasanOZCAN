
public class Account {
	String name;
	int money;
	
	public Account(String name,int money) {
		this.money=money;
		this.name=name;
	}
	public String toString() {
		return name+":$"+money;
	}
}
