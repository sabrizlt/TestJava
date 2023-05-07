package testJava;


public class video extends elementoMultimediale{
	int durata = 0;
	int luminonsita = 0;
	int volume = 0;
	public video(String titolo, int durata,int volume ,int lum) {
		super(titolo);
		this.durata = durata;
		this.volume = volume;
		this.luminonsita = lum;
	}
	
	public void Play() {
		System.out.println("Video in esecuzione");
		for(int i = 0; i< this.durata; i++ ) {
			System.out.println(Titolo.toString());
		}
		for(int i = 0; i< this.volume; i++ ) {
			System.out.println ("*");
		}
		
	}
	
	public void alzaLuminosita(int value) {
		this.luminonsita += value;
	}
	
	public void abbassLuminosita(int value) {
		this.luminonsita -= value;
	}
	
	
	public void AlzaVolume(int value) {
		System.out.println("Volume alzato di:" + value);
		this.volume += value;
	}
	
	public void AbbassaVolume(int value) {
		System.out.println("Volume abbassato di:" + value);
		this.volume -= value;
	}
		
}