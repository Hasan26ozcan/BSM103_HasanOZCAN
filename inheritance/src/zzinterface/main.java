package zzinterface;

public class main {
	// interface yani kalýtým direkt olarka miras alamsý olayýna daha rahat bir þekilde söyleyebiliriz;
    public static void main(String[] args) {
    	Employeee çalýþ =new Employeee("Hasan", "software developer",  50000);
    	çalýþ.info();
    	Manager mana=new Manager("Hasan", "yazlým mühendisliði", 1000000,9000);
    	mana.info();
    	//iþte buda ayrý olarak zam miktarýný veren birleþtirmeden yazmak içinde böyle birþey yapýyoruz
    	mana.raisesalary();
    	System.out.println("---------------------------------------");
    	//override bize içini deðiþtirmek için fýrsat veriyor 
    	// ve biz içini nasýl istersek öyle yapýyoruz
    	System.out.println(mana.toString());
    	// polymorhism dediðimiz olay ise
    	//çok biçimlilik yani bunu kýsa biz öetle þöyle açýklayalaým
    	System.out.println("-----------------------------polymorhþsm yerindeyiz þuanda----------------------------");
    	Employeee emman=new Manager("Hasan","full staack developer", 600000, 6543221);
    	System.out.println(emman);
    	emman.info();
    }
}
