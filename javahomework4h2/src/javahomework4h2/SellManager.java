package javahomework4h2;

public class SellManager implements SellService{

	@Override
	public void sell(User user, Game game, Campaign campaign) {
		System.out.println(user.getFirstName()+" "+ user.getLastName()+" kullanýcýsý "
					+game.getName()+ " isimli oyunu "+ campaign.getDiscountRate()
					+ " indirim oraný ile satýn aldý");
		
	}

}
