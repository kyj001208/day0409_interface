package exam;

public class PlayerTest {

	public static void main(String[] args) {
		
		Player play=null;
		play=new MusicPlayer("봄이 좋냐 ");
		play.play();
		play.pause();
		play.stop();
		System.out.println();
		play=new MoviePlayer("파묘 ");
		play.play();
		play.pause();
		play.stop();
		
		
	}

}
