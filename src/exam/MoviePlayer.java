package exam;

public class MoviePlayer implements Player {
	
	private String MovieName;
	
	public MoviePlayer(String MovieName) {
		this.MovieName=MovieName;
		System.out.println(MovieName+"영화 준비중");
	}

	@Override
	public void play() {
		System.out.println(MovieName +"영화가 재생됩니다");
		
	}

	@Override
	public void pause() {
		System.out.println(MovieName +"영화가 일시중지 됩니다");
		
	}

	@Override
	public void stop() {
		
		System.out.println(MovieName +"영화가 중지됩니다");
		
	}

}
