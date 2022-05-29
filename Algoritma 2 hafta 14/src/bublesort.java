import java.util.Arrays;

public class bublesort {
	public static void main(String[] args) {
		bublesort bublesorts=new bublesort();
		String[] arr={"Ahmet","AHmet","ahmeT","bahmet","AHMET","ahmet","baHmet"};
		//yani bir tane bile büyük harf varsa o önde yazýlýyor
		//hemen arkasýndan küçük harfler baþlýyor önemli detay büyük harf varsa en öndeler
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		int[] arr1 ={12,4,62,21,1,8,23,9,54};
		bublesorts.bublesort(arr1);
		System.out.println(Arrays.toString(arr1));
		run(arr1);
		run2(arr1);
	}
	public void bublesort(int[] arr) {
		boolean control=true;
		if(control== true) {
			control =false;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j+1]<arr[j]) {
					control =true;
					int sayi= arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=sayi;
					
				}
			}
		}
	}
}
	public void bublesortverimlihalimi(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j+1]<arr[j]) {
					int sayi= arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=sayi;
				}
			}
		}
	}
	public static void run(int[]arr) {
		bublesort bublesorts=new bublesort();
		long start=System.nanoTime();
		bublesorts.bublesort(arr);
		long end=System.nanoTime();
		long time=end-start;
		System.out.println("bu kodu yapma süresi : "+time);
	}
	public static void run2(int[]arr) {
		bublesort bublesorts=new bublesort();

		long start=System.nanoTime();
		bublesorts.bublesortverimlihalimi(arr);
		long end=System.nanoTime();
		long time=end-start;
		System.out.println("bu kodu yapma süresi : "+time);
	}

}
