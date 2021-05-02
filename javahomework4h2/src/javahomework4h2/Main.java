package javahomework4h2;

public class Main {

	public static void main(String[] args) {

		User user=new User();
		user.setId(1);
		user.setFirstName("Erdi");
		user.setLastName("Dedemli");
		user.setBirthofYear("1995");
		
		UserManager userManager=new UserManager(new UserCheckManager());
		userManager.add(user);
		
		Game game=new Game();
		game.setId(1);
		game.setName("FIFA");
		
		Game game1=new Game();
		game1.setId(2);
		game1.setName("PES");
		
		Game game2=new Game();
		game2.setId(3);
		game2.setName("Age of Empires");
		
		Game[] games= {game,game1,game2};
		
		GameManager gameManager=new GameManager();
		gameManager.addMultiple(games);
		
		Campaign campaign=new Campaign();
		campaign.setId(1);
		campaign.setName("Ayýn ilk haftasý indirimi");
		campaign.setDiscountRate(50);
		
		Campaign campaign1=new Campaign();
		campaign1.setId(1);
		campaign1.setName("Günlük indirim");
		campaign1.setDiscountRate(15);
		
		Campaignmanager campaignmanager=new Campaignmanager();

		campaignmanager.add(campaign1);
		campaignmanager.update(campaign1);
		campaignmanager.delete(campaign);
	
		SellManager sellManager=new SellManager();
		sellManager.sell(user, game2, campaign);
		

	}

}
