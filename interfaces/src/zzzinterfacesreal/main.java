package zzzinterfacesreal;

public class main {

	public static void main(String[] args) {
	/*	Iddatabase database=new Iddatabase() {
			
			@Override
			public void log() {
				// TODO Auto-generated method stub
				
			}
		};*/
		customer custom=new customer();
		custom.log();
		student stud =new student();
		stud.log();
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("evet işte burada olduğu gibi polymorhism de burada çalışabiliriyor");
		Iddatabase cusdata=new customer();
		cusdata.log();
		Iddatabase studata=new student();
		studata.log();
		
	}

}
