
public class içiçedöngülerkiþiselçalýþým {
	public static final int N=6;
	public static final int M=7;
	public static void main(String[] args) {

		for(int line = N; line >= 1;line--) {
			for(int sütun=0; sütun < N + (line *-1);sütun++) {
				System.out.print("*");

			}
				
				System.out.println(line);

				
			}
		for(int sayi1=1;sayi1<=6;sayi1++) {
			for(int boþluk2=0;boþluk2<6+(-1*sayi1);boþluk2++) {
				System.out.print("+");
				
			}
			System.out.println(sayi1);
		}
		for(int sayi2=6;sayi2>1;sayi2--) {
			for(int satýr=0;satýr<6+(-1*sayi2);satýr++) {
				System.out.print("-");
			}
			System.out.println(sayi2);
		}
		for(int sütun =1;sütun<N;sütun++) {
			for(int satýr=0;satýr<N+(sütun*-1);satýr++) {
				System.out.print(" boþluk ");
				
			}
			System.out.println("*");
		}
		for(int sütun =6;sütun>=1;sütun--) {
			for(int satýr=1;satýr<=6+(-1*sütun);satýr++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		for(int tekrar=1;tekrar<=2;tekrar++) {
		for (int sütun=1; sütun<10; sütun++) {//Döngümüzün ne kadar döneceðini belirtir.
	           for(int j=1; j<10+(-1*sütun);j++) {//Üçgenimizi yaparken ekran çýktýsýnýn sol tarafýndaki boþluðu belirtir.
	               System.out.print("+");//Boþluðumuzu belirtiyoruz.
	           }
	           for (int k=1; k<=sütun; k++) {//Yýldýz sembolümüzün yazýlmasýný saðlar.
	               System.out.print("*");//Sembolümüzü belirledik ve çýktýsýný saðladýk.
	               System.out.print(" ");//Yýldýz sembolümüzün arasýna boþluk koyulmasýný saðlar. 
	           }
	            System.out.println("");//Döngüden sonra diðer satýra atlamamýzý saðlar.
	        }
		
		
		
		for(int sütun =1;sütun<=6;sütun++) {
			for(int boþluk =sütun;boþluk<6;boþluk++) {
				System.out.print(" ");
				
			}
			for(int simge=0;simge<sütun;simge++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int sütun=0;sütun<=6;sütun++) {
			for(int boþuk=sütun;boþuk<6;boþuk++) {
				System.out.print(" ");

			}
			for(int üçgen=0;üçgen<sütun;üçgen++) {
				System.out.print("*");
					
			}
			System.out.println();
		}
		for(int sütun=0;sütun<=6;sütun++) {
			for(int boþluk=sütun;boþluk<6;boþluk++) {
				System.out.print("+");
			}
			System.out.println(sütun);
		}
		for(int sütun=6;sütun>0;sütun--) {
			for(int boþluk=0;boþluk<6+(sütun*-1);boþluk++) {
				System.out.print("%");
				
			}
			System.out.println(sütun);
		
			}
		
		for(int sütun=1;sütun<=6;sütun++) {
			for(int boþluk=0;boþluk<M+(sütun*-1);boþluk++){
				System.out.print("?");
		}
			System.out.println(sütun);
			}
	
		for(int sütun=1;sütun<=6;sütun++) {
			for(int boþluk=0;boþluk<6+(-1*sütun);boþluk++) {
				System.out.print("*");
			}
			System.out.println(sütun);
		}
		for(int sütun=6;sütun>0;sütun--) {
			for(int boþluk=0;boþluk<6+(sütun*-1);boþluk++) {
				System.out.print("*");
				
			}
			System.out.println(sütun+"-&*");
		}
		for(int sütun=1;sütun<=6;sütun++) {
			for(int boþluk=sütun;boþluk<6;boþluk++) {
				System.out.print(" ");
			}
			for(int eleman= 0;eleman<sütun;eleman++) {
				System.out.print(sütun);
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int sütun=1;sütun<=6;sütun++) {
			for(int boþluk=0;boþluk<6+(sütun*-1);boþluk++) {
				System.out.print(" ");
			}
			for(int ekran=0;ekran<sütun;ekran++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int sütun=1;sütun<6;sütun++) {
			for(int ekran=0;ekran<sütun;ekran++) {
				System.out.print("*");
				System.out.print(" ");
				
			}
			System.out.println();
		}
		}
		}
	
			
			
		
		}
	
				
				
		

	



