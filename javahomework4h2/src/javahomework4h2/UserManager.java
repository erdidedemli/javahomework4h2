package javahomework4h2;

public class UserManager {
	UserCheckManager userCheckManager;
	public  UserManager(UserCheckManager userCheckManager) {
		this.userCheckManager=userCheckManager;
	}
	public void add(User user) {
		if(userCheckManager.isReal(user)) {
			System.out.println("Sisteme kullan�c� eklendi");
		}else {
			System.out.println("Sisteme kullan�c� ekleme i�leme ba�ar�s�z oldu");
		}
		
	}

}
