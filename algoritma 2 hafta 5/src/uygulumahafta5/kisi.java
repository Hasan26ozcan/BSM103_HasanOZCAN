package uygulumahafta5;

public class kisi {
	private String isim;
	private Integer yas;
	
	public kisi(String isim,Integer yas) {
		setisim(isim);
		setyas(yas);
	}
	public void setisim(String isim) {
		this.isim=isim;
	}
	public void setyas(Integer yas) {
		this.yas=yas;
	}
	public String getisim() {
		return isim;
	}
	public Integer getyas() {
		return yas;
	}

}
