package exam;

public class MusicPlayer implements Player{
	
	private String songName;
	
	public MusicPlayer(String songName) {
		this.songName=songName;
		System.out.println(songName+"음악 준비중");
	}

	@Override
	public void play() {
		System.out.println(songName +"음악을 재생됩니다");
		
	}

	@Override
	public void pause() {
		
		System.out.println(songName +"음악을 일시중지 합니다");
	}

	@Override
	public void stop() {
		
		System.out.println(songName +"음악을 중지 합니다");
		
	}

}
