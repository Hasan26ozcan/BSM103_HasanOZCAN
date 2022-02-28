package zzinterfaceönemi;
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
}// bu paranteze çok dikkat et 2 saattir bunun yerini karıştıyorsun
public class main {

	public static void main(String[] args) {
		DatabaseManager datamana=new DatabaseManager();
		datamana.AddDatabase(new Mongodatabase());
		//mesela oracle databaseyi ekledikya ama sadece ekledik işte başka hiçbir şeyi ellemiyoruz 
		//sadece yaptığımız şey çağırmak önceki yazılanları ve bu sayede koddaki devamlılığı sağlamak
		datamana.AddDatabase(new Oracledatabase());
		datamana.DeleteDatabase(new Oracledatabase());
		
	}

}

