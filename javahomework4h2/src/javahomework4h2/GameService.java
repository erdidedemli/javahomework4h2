package javahomework4h2;

public interface GameService {

	public void add(Game game);
	public void update(Game game);
	public void delete(Game game);
	public void sell(Game game,User user);
	public void addMultiple(Game[] games);
}
