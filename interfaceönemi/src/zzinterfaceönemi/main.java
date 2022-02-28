package zzinterface�nemi;
class DatabaseManager{
	public void AddDatabase(IDatabase database) {
		database.add();
	}
	public void UpdateDatabase(IDatabase database) {
		database.update();
	}
	public void GetDatabase(IDatabase database) {
		database.get();
	}
	public void DeleteDatabase(IDatabase database) {
		database.delete ();
	}
}// bu paranteze �ok dikkat et 2 saattir bunun yerini kar��t�yorsun
public class main {

	public static void main(String[] args) {
		DatabaseManager datamana=new DatabaseManager();
		datamana.AddDatabase(new Mongodatabase());
		//mesela oracle databaseyi ekledikya ama sadece ekledik i�te ba�ka hi�bir �eyi ellemiyoruz 
		//sadece yapt���m�z �ey �a��rmak �nceki yaz�lanlar� ve bu sayede koddaki devaml�l��� sa�lamak
		datamana.AddDatabase(new Oracledatabase());
		datamana.DeleteDatabase(new Oracledatabase());
		
	}

}

