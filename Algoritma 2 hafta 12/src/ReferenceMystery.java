import java.util.Arrays;

public class ReferenceMystery {
	public static void main(String[] args) {
		Basicpoint p=new Basicpoint(11, 22);
		int[] a= {33,44};
		int n=55;
		System.out.println(p.x +","+p.y+" "+Arrays.toString(a)+" "+n);
		myster(p, a, n);
		System.out.println(p.x +","+p.y+" "+Arrays.toString(a)+" "+n);
		a[0]=a[1];
		p.x=p.y;
		myster(p, a, n);
		System.out.println(p.x +","+p.y+" "+Arrays.toString(a)+" "+n);
		
		
	}
	public static int myster(Basicpoint p1,int[] a,int n) {
		n=0;
		a[0] +=11;
		a[1]=77;
		p1.x=p1.x+33;
		System.out.println(p1.x +","+p1.y+" "+Arrays.toString(a)+" "+n);
		return n;
		
	}

}
