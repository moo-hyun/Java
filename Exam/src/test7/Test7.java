package test7;

interface Player {
	public abstract void play();
}

class BaseBallPlayer implements Player {

	@Override
	public void play() {
		System.out.println("야구를 합니다.");
	}
	
}

class FootBallPlayer implements Player {

	@Override
	public void play() {
		System.out.println("축구를 합니다.");
	}
	
}
public class Test7 {
	public static void main(String[] args) {
		Player p1 = new BaseBallPlayer();
		
		playGame(p1);
	}
	public static void playGame(Player p) {
		p.play();
	}

}
