package javahomework4h2;

public class GameManager implements GameService{
	
	public GameManager() {
		
	}
	@Override
	public void add(Game game) {
		System.out.println(game.getName()+ " eklendi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+ " güncellendi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+ " silindi");
		
	}
	
	
	
	@Override
	public void sell(Game game, User user) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addMultiple(Game[] games) {
		for (Game game : games) {
			add(game);
		}
		
	}
	

}
