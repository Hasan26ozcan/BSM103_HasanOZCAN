package zzinterface;

public class main {
	// interface yani kal�t�m direkt olarka miras alams� olay�na daha rahat bir �ekilde s�yleyebiliriz;
    public static void main(String[] args) {
    	Employeee �al�� =new Employeee("Hasan", "software developer",  50000);
    	�al��.info();
    	Manager mana=new Manager("Hasan", "yazl�m m�hendisli�i", 1000000,9000);
    	mana.info();
    	//i�te buda ayr� olarak zam miktar�n� veren birle�tirmeden yazmak i�inde b�yle bir�ey yap�yoruz
    	mana.raisesalary();
    	System.out.println("---------------------------------------");
    	//override bize i�ini de�i�tirmek i�in f�rsat veriyor 
    	// ve biz i�ini nas�l istersek �yle yap�yoruz
    	System.out.println(mana.toString());
    	// polymorhism dedi�imiz olay ise
    	//�ok bi�imlilik yani bunu k�sa biz �etle ��yle a��klayala�m
    	System.out.println("-----------------------------polymorh�sm yerindeyiz �uanda----------------------------");
    	Employeee emman=new Manager("Hasan","full staack developer", 600000, 6543221);
    	System.out.println(emman);
    	emman.info();
    }
}
