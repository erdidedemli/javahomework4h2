package javahomework4h2;

public class UserCheckManager implements UserCheckService{

	@Override
	public boolean isReal(User user) {
	    System.out.println(user.getFirstName()+" "+user.getLastName() +" "+user.getBirthofYear());
		return true;
	}

	
}
