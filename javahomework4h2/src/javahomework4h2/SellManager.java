package javahomework4h2;

public class SellManager implements SellService{

	@Override
	public void sell(User user, Game game, Campaign campaign) {
		System.out.println(user.getFirstName()+" "+ user.getLastName()+" kullan�c�s� "
					+game.getName()+ " isimli oyunu "+ campaign.getDiscountRate()
					+ " indirim oran� ile sat�n ald�");
		
	}

}
