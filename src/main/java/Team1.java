import java.util.Random;

public class Team1 {
	private int score=0;
	
	Player p1=new Player();
	Player p2=new Player();
	Player p3=new Player();
	Player p4=new Player();
	Player p5=new Player();

	Random rand = new Random();
	
	public void spawn()
	{
		p1.setxPosition(rand.nextInt(25));
		p2.setxPosition(rand.nextInt(25));
		p3.setxPosition(rand.nextInt(25));
		p4.setxPosition(rand.nextInt(25));
		p5.setxPosition(rand.nextInt(25));
		
		p1.setyPosition(rand.nextInt(20));
		p2.setyPosition(rand.nextInt(20));
		p3.setyPosition(rand.nextInt(20));
		p4.setyPosition(rand.nextInt(20));
		p5.setyPosition(rand.nextInt(20));
		}
}
