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
	
	
	public void sýralýekle(int sayi) {
		Eleman yenisayi=new Eleman(sayi);
		if(!doluMu()) {
			BasaEkle(sayi);
		}else {
			if(sayi< bas.sayi) {
				BasaEkle(sayi);
				return ;
			}
			boolean bulunduMu=false;
			//eklenecek noktayý bulalým
			Eleman birinci=bas;
			Eleman ikinci=birinci.sýradaki;
			
			if(ikinci ==null) {
				// bur durumda tek eleman var
				//yeni gelen elemanýda sona eklememiz gerekiyor
				sonaEkle(sayi);
				bulunduMu=true;
			}
			while(ikinci!= null) {
				if(sayi>birinci.sayi && sayi<ikinci.sayi) {
					//eklenecek noktayý bulduk
					birinci.sýradaki=yenisayi;
					yenisayi.sýradaki=ikinci;
					bulunduMu=true;
				}
				birinci=ikinci;
				ikinci=ikinci.sýradaki;
				
			}
			 if(!bulunduMu) {
					sonaEkle(sayi);
				}
		
		}
		
		
	}
	
	public void sýfýrla() {//tamamen sýfýrlamamýzý saðlýyor
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
			// Bubble sort baþlar
			boolean degisiklikYapildiMi = true;
			
			Eleman onceki;
			Eleman birinci;
			Eleman ikinci;
			
			while( degisiklikYapildiMi ) {
				degisiklikYapildiMi = false;
				onceki = null;//olup olmamamasý çok öenmli deil çünkü zaten içerde null yapýyoruz
				birinci = bas;
				ikinci = birinci.sýradaki;
				
				if( ilkibuyukmu(birinci, ikinci) ) {
					yerdeðiþtirme(null, birinci, ikinci);
					degisiklikYapildiMi = true;
				}
				
				// ilk elemandan sonra onceki devreye girer
				onceki = birinci;
				birinci = ikinci;
				ikinci = ikinci.sýradaki;
				
				while( ikinci != null ) {
					
					if( ilkibuyukmu(birinci, ikinci) ) {
						yerdeðiþtirme(onceki, birinci, ikinci);
						degisiklikYapildiMi = true;
					}
					onceki = birinci;
					birinci = ikinci;
					ikinci = ikinci.sýradaki;
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
	//birinci ve ikinci elemanlarýn yerleri deðiþtirir
	public void yerdeðiþtirme(Eleman onceki ,Eleman birinci,Eleman ikinci) {
		if(birinci==bas) {
			//birinci basta yer alýyor
			if(ikinci==son) {
				//ikincide sonda yer alýyor
				ikinci.sýradaki=birinci;
				birinci.sýradaki=null;
				son=birinci;
				bas =ikinci;
				
			}else {
				//birinci baþta ikinci sonda deðil
				birinci.sýradaki=ikinci.sýradaki;
				ikinci.sýradaki=birinci;
				bas=ikinci;			
			}
		}else if(ikinci==son){
				//ikinc eleman sonda ama birinci eleman basta deðil
				ikinci.sýradaki=birinci;
				birinci.sýradaki=null;
				onceki.sýradaki=ikinci;
				son=birinci;				
			}
			else {
				// birinci ve ikinci listenin içinde baþýnda veya sonunda deðil
				birinci.sýradaki=ikinci.sýradaki;
				ikinci.sýradaki=birinci;		
				onceki.sýradaki=ikinci;
			}
	}
	//---------------------------------------------------------------------------------------------------------------------
	// silme yeriydi bunlar indekse göre sayýya göre silme alaný da burasý
	public void verilendeðerinhespinisil(int sayi) {
		if(doluMu()){
			if(bas == son) {
				//tek eleman var
				if(bas.sayi ==sayi) {
					bas = null;
					son= null;
				}			
			}		
			else {
				//sildiðimiz baþta deðil
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
					Eleman isare=isaretci1.sýradaki;
					isaretci2.sýradaki=null;
					isaretci1.sýradaki=null;
					isaretci2.sýradaki=isare;
					isaretci1=isare;// bunu burda eþitliyoruz ki burdan devam etmesini saðlýyor ve o deðerdeki btüün elemanlarýn hepsini silmesini
					//silmesini saðlýyoruz
					
					//güncel elemanýmýza yönlendirtmesi gerekiyor
					//bu yüzden 1 ve 2 bizim liste içinde gezenlerimiz olduðu için
					//1 in gideceði devam ediceði yeri 3 ün yani gelecek olan yere baðlamamýz gerekiyor 
					//3 ün gösterdiði elemandan devam etmek istiyorsak o zaman 1 ona eþitlenicek
							}			
						}					
					}
					else {
					isaretci2=isaretci1;
					isaretci1=isaretci1.sýradaki;
					}				
				}	
			}
		}
	}
	public void verilendeðerisil(int sayi) {
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
	
				//en az iki eleman var ve sildiðimiz baþta deðil
				else {
				Eleman isaretci1=bas;
				Eleman isaretci2=null;
				while(isaretci1 !=null && isaretci1.sayi !=sayi) {
					isaretci2=isaretci1;
					isaretci1=isaretci1.sýradaki;
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
						Eleman isare=isaretci1.sýradaki;
					isaretci2.sýradaki=null;
					isaretci1.sýradaki=null;
					isaretci2.sýradaki=isare;
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
				
				//en az iki eleman var ve sildiðimiz baþta deðil
				else {
				Eleman isaretci1=bas;
				Eleman isaretci2=null;
				int indeks=0;
				while(isaretci1 !=null && indeks<indekss) {
					isaretci2=isaretci1;
					isaretci1=isaretci1.sýradaki;
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
						Eleman isare=isaretci1.sýradaki;
					isaretci2.sýradaki=null;
					isaretci1.sýradaki=null;
					isaretci2.sýradaki=isare;
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
				while(isaretci1.sýradaki!=son) {
					isaretci1=isaretci1.sýradaki;			
					}
				Eleman sayi=isaretci1;
				isaretci1.sýradaki=null;
				son=sayi;
				}		
			}
		}
	public void bastansil() {
		
		if(doluMu()) {
			Eleman sayi=bas.sýradaki;
			bas.sýradaki =null;
			bas=sayi;
		}
		else if(bas == son){
			bas =null;
			son= null;
		}
	}
	//----------------------------------------------------------------------------------------------------------------------
	// ekleme yerleriydi bunlar ve ekrana yazdýrma yeir var içerde
	public void indekseeklemek(int indekss,int sayi) {
		Eleman yenieleman=new Eleman(sayi);
		Eleman isaretci1=bas;
		Eleman isaretci2=null;
		int indeks=0;
		if(doluMu()) {
			if(indekss <=0) {
				 BasaEkle(sayi);
			/*	yenieleman.sýradaki=bas;
				bas =yenieleman;
				*/
			}
			else {
			while(isaretci1!=null && indeks<indekss) {
				isaretci2=isaretci1;
				isaretci1=isaretci1.sýradaki;
				indeks++;
			}
			if(isaretci1 == null) {
				sonaEkle(sayi);
			/*son.sýradaki=yenieleman;
				son=yenieleman;
				*/
			}
			else {
				isaretci2.sýradaki=yenieleman;
				yenieleman.sýradaki=isaretci1;
			}
		}
		}
		else {
			bas=yenieleman;
			son=yenieleman;
		}
	}	
	public void ekranalisteyiyazdýrma() {
		Eleman yazdýrma=bas;
		int i=0;
		while(yazdýrma!=null) {
			System.out.print(yazdýrma.sayi+" ");
			yazdýrma=yazdýrma.sýradaki;
		i++;
		}
		System.out.println();
		System.out.println("tekrar sayýsý: "+i);
		System.out.println();
		
	}
	public void sonaEkle(int sayi) {
		Eleman yenieleman=new Eleman(sayi);
		if(doluMu()) {
			//içi doluyken
			son.sýradaki=yenieleman;
			son=yenieleman;		
		}
		else {
			//içi boþken
			bas=yenieleman;
			son=yenieleman;
		}
	}
	public void BasaEkle(int sayi) {
		Eleman yenisayi=new Eleman(sayi);
		if(doluMu()) {
			// liste doluyken
			// yenisayi.sýradaki yaptýðýmýzda metotta boþ tanýmladýðýmýz için sayýyý ilk oluþturduðumuzda sonrada sayý yok anlaýna gelmektedir
			yenisayi.sýradaki=bas;
			bas =null;
			bas =yenisayi;		
		}
		else {
			// liste boþken
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
