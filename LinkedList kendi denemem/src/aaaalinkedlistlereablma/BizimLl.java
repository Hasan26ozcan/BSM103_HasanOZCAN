package aaaalinkedlistlereablma;

public class BizimLl {
	
	Eleman bas;
	Eleman son;
	
	public BizimLl() {
		bas =null;
		son=null;
	}
	public int Stackpop() {
		int sayin=bas.sayi;
		bastansil();
		return sayin;
	}
	
	
	
	public void stack(int sayi) {
		BasaEkle(sayi);
	}
	
	
	
	public int QueueRemove() {
		int sayin =bas.sayi;
		System.out.println(bas.sayi);
		bastansil();
		return sayin;
		
	}
	
	public void queuePush(int sayi) {
		sonaEkle(sayi);
	}
	
	
	public void s�ral�ekle(int sayi) {
		Eleman yenisayi=new Eleman(sayi);
		if(!doluMu()) {
			BasaEkle(sayi);
		}else {
			if(sayi< bas.sayi) {
				BasaEkle(sayi);
				return ;
			}
			boolean bulunduMu=false;
			//eklenecek noktay� bulal�m
			Eleman birinci=bas;
			Eleman ikinci=birinci.s�radaki;
			
			if(ikinci ==null) {
				// bur durumda tek eleman var
				//yeni gelen eleman�da sona eklememiz gerekiyor
				sonaEkle(sayi);
				bulunduMu=true;
			}
			while(ikinci!= null) {
				if(sayi>birinci.sayi && sayi<ikinci.sayi) {
					//eklenecek noktay� bulduk
					birinci.s�radaki=yenisayi;
					yenisayi.s�radaki=ikinci;
					bulunduMu=true;
				}
				birinci=ikinci;
				ikinci=ikinci.s�radaki;
				
			}
			 if(!bulunduMu) {
					sonaEkle(sayi);
				}
		
		}
		
		
	}
	
	public void s�f�rla() {//tamamen s�f�rlamam�z� sa�l�yor
		bas =null;
		son=null;
	}
	
	public void bubbleSort() {
		if(!doluMu()) {
			// Listede eleman yok
			System.out.println("Listede eleman yok!");
		} else if( bas == son ) {
			// Listede tek eleman var
			System.out.println("Listede tek eleman var!");
		} else {
			// Bubble sort ba�lar
			boolean degisiklikYapildiMi = true;
			
			Eleman onceki;
			Eleman birinci;
			Eleman ikinci;
			
			while( degisiklikYapildiMi ) {
				degisiklikYapildiMi = false;
				onceki = null;//olup olmamamas� �ok �enmli deil ��nk� zaten i�erde null yap�yoruz
				birinci = bas;
				ikinci = birinci.s�radaki;
				
				if( ilkibuyukmu(birinci, ikinci) ) {
					yerde�i�tirme(null, birinci, ikinci);
					degisiklikYapildiMi = true;
				}
				
				// ilk elemandan sonra onceki devreye girer
				onceki = birinci;
				birinci = ikinci;
				ikinci = ikinci.s�radaki;
				
				while( ikinci != null ) {
					
					if( ilkibuyukmu(birinci, ikinci) ) {
						yerde�i�tirme(onceki, birinci, ikinci);
						degisiklikYapildiMi = true;
					}
					onceki = birinci;
					birinci = ikinci;
					ikinci = ikinci.s�radaki;
				}
			}
		}
	}
	
	public boolean ilkibuyukmu(Eleman birinci,Eleman ikinci) {
		if(birinci.sayi > ikinci.sayi) {
			return true;
		}else {
			
		
		return false;
		}
	}
	//birinci ve ikinci elemanlar�n yerleri de�i�tirir
	public void yerde�i�tirme(Eleman onceki ,Eleman birinci,Eleman ikinci) {
		if(birinci==bas) {
			//birinci basta yer al�yor
			if(ikinci==son) {
				//ikincide sonda yer al�yor
				ikinci.s�radaki=birinci;
				birinci.s�radaki=null;
				son=birinci;
				bas =ikinci;
				
			}else {
				//birinci ba�ta ikinci sonda de�il
				birinci.s�radaki=ikinci.s�radaki;
				ikinci.s�radaki=birinci;
				bas=ikinci;			
			}
		}else if(ikinci==son){
				//ikinc eleman sonda ama birinci eleman basta de�il
				ikinci.s�radaki=birinci;
				birinci.s�radaki=null;
				onceki.s�radaki=ikinci;
				son=birinci;				
			}
			else {
				// birinci ve ikinci listenin i�inde ba��nda veya sonunda de�il
				birinci.s�radaki=ikinci.s�radaki;
				ikinci.s�radaki=birinci;		
				onceki.s�radaki=ikinci;
			}
	}
	//---------------------------------------------------------------------------------------------------------------------
	// silme yeriydi bunlar indekse g�re say�ya g�re silme alan� da buras�
	public void verilende�erinhespinisil(int sayi) {
		if(doluMu()){
			if(bas == son) {
				//tek eleman var
				if(bas.sayi ==sayi) {
					bas = null;
					son= null;
				}			
			}		
			else {
				//sildi�imiz ba�ta de�il
				Eleman isaretci1=bas;
				Eleman isaretci2=null;
				while(isaretci1 !=null ) {
					if(isaretci1.sayi==sayi) {
						if(bas ==isaretci1) {
							bastansil();
						}
						else {
							if(isaretci1==son) {
								sondanSil();
								isaretci1=null;
							}else {//ortadan silme
					Eleman isare=isaretci1.s�radaki;
					isaretci2.s�radaki=null;
					isaretci1.s�radaki=null;
					isaretci2.s�radaki=isare;
					isaretci1=isare;// bunu burda e�itliyoruz ki burdan devam etmesini sa�l�yor ve o de�erdeki bt��n elemanlar�n hepsini silmesini
					//silmesini sa�l�yoruz
					
					//g�ncel eleman�m�za y�nlendirtmesi gerekiyor
					//bu y�zden 1 ve 2 bizim liste i�inde gezenlerimiz oldu�u i�in
					//1 in gidece�i devam edice�i yeri 3 �n yani gelecek olan yere ba�lamam�z gerekiyor 
					//3 �n g�sterdi�i elemandan devam etmek istiyorsak o zaman 1 ona e�itlenicek
							}			
						}					
					}
					else {
					isaretci2=isaretci1;
					isaretci1=isaretci1.s�radaki;
					}				
				}	
			}
		}
	}
	public void verilende�erisil(int sayi) {
		if(doluMu()){
			if(bas == son) {
				//tek eleman var
				if(bas.sayi ==sayi) {
					bas = null;
				son= null;
				}			
			}
			else {
				if(bas.sayi == sayi) {
				bastansil();
				}
		
				//en az iki eleman var
	
				//en az iki eleman var ve sildi�imiz ba�ta de�il
				else {
				Eleman isaretci1=bas;
				Eleman isaretci2=null;
				while(isaretci1 !=null && isaretci1.sayi !=sayi) {
					isaretci2=isaretci1;
					isaretci1=isaretci1.s�radaki;
				}
				 if(isaretci1== null) {
					 
				 }
				 else {
					 if (isaretci1.sayi==son.sayi) {
						 //sondan silme
						sondanSil();
					}
					 else {
						//ortadan silme
						Eleman isare=isaretci1.s�radaki;
					isaretci2.s�radaki=null;
					isaretci1.s�radaki=null;
					isaretci2.s�radaki=isare;
					 }
				 }
			}
		}
	}
	}
	public void indeksisil(int indekss) {
		if(doluMu()){
			if(bas == son) {
				//tek eleman var
				bas = null;
				son= null;
			}	
			else {
				if(indekss <= 0) {
				bastansil();
				}	
				//en az iki eleman var
				
				//en az iki eleman var ve sildi�imiz ba�ta de�il
				else {
				Eleman isaretci1=bas;
				Eleman isaretci2=null;
				int indeks=0;
				while(isaretci1 !=null && indeks<indekss) {
					isaretci2=isaretci1;
					isaretci1=isaretci1.s�radaki;
					indeks++;				
				}	
				 if(isaretci1== null) {			 
				 }
				 else {
					 if (isaretci1==son) {
						 //sondan silme
						sondanSil();
					}
					 else {
						//ortadan silme
						Eleman isare=isaretci1.s�radaki;
					isaretci2.s�radaki=null;
					isaretci1.s�radaki=null;
					isaretci2.s�radaki=isare;
					 }
				 }
			}
		}
	}
	}
	public void sondanSil() {
		if(doluMu()) {
			if(bas ==son) {
				bas=null;
				son=null;
			}
			else {
				Eleman isaretci1=bas;
				while(isaretci1.s�radaki!=son) {
					isaretci1=isaretci1.s�radaki;			
					}
				Eleman sayi=isaretci1;
				isaretci1.s�radaki=null;
				son=sayi;
				}		
			}
		}
	public void bastansil() {
		
		if(doluMu()) {
			Eleman sayi=bas.s�radaki;
			bas.s�radaki =null;
			bas=sayi;
		}
		else if(bas == son){
			bas =null;
			son= null;
		}
	}
	//----------------------------------------------------------------------------------------------------------------------
	// ekleme yerleriydi bunlar ve ekrana yazd�rma yeir var i�erde
	public void indekseeklemek(int indekss,int sayi) {
		Eleman yenieleman=new Eleman(sayi);
		Eleman isaretci1=bas;
		Eleman isaretci2=null;
		int indeks=0;
		if(doluMu()) {
			if(indekss <=0) {
				 BasaEkle(sayi);
			/*	yenieleman.s�radaki=bas;
				bas =yenieleman;
				*/
			}
			else {
			while(isaretci1!=null && indeks<indekss) {
				isaretci2=isaretci1;
				isaretci1=isaretci1.s�radaki;
				indeks++;
			}
			if(isaretci1 == null) {
				sonaEkle(sayi);
			/*son.s�radaki=yenieleman;
				son=yenieleman;
				*/
			}
			else {
				isaretci2.s�radaki=yenieleman;
				yenieleman.s�radaki=isaretci1;
			}
		}
		}
		else {
			bas=yenieleman;
			son=yenieleman;
		}
	}	
	public void ekranalisteyiyazd�rma() {
		Eleman yazd�rma=bas;
		int i=0;
		while(yazd�rma!=null) {
			System.out.print(yazd�rma.sayi+" ");
			yazd�rma=yazd�rma.s�radaki;
		i++;
		}
		System.out.println();
		System.out.println("tekrar say�s�: "+i);
		System.out.println();
		
	}
	public void sonaEkle(int sayi) {
		Eleman yenieleman=new Eleman(sayi);
		if(doluMu()) {
			//i�i doluyken
			son.s�radaki=yenieleman;
			son=yenieleman;		
		}
		else {
			//i�i bo�ken
			bas=yenieleman;
			son=yenieleman;
		}
	}
	public void BasaEkle(int sayi) {
		Eleman yenisayi=new Eleman(sayi);
		if(doluMu()) {
			// liste doluyken
			// yenisayi.s�radaki yapt���m�zda metotta bo� tan�mlad���m�z i�in say�y� ilk olu�turdu�umuzda sonrada say� yok anla�na gelmektedir
			yenisayi.s�radaki=bas;
			bas =null;
			bas =yenisayi;		
		}
		else {
			// liste bo�ken
			bas=yenisayi;
			son=yenisayi;
		}
	}
	public boolean doluMu() {
		if(bas !=null) {
			return true;
		}
		else {
			return false;
		}
	}

}
