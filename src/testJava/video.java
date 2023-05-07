package testJava;


public class video extends elementoMultimediale{
	int durata = 0;
	int luminonsità = 0;
	int volume = 0;
	public video(String titolo, int durata, int volume , int luminosità) {
		super(titolo);
		this.durata = durata;
		this.volume = volume;
		this.luminonsità = luminosità;
	}
	
	public void Play() {
		System.out.println("Video in esecuzione");
		for(int i = 0; i< this.durata; i++ ) {
			System.out.println(Titolo.toString());
		}
		for(int i = 0; i< this.volume; i++ ) {
			System.out.println ("*");
		}
		for(int i = 0; i< this.luminonsità; i++ ){
			System.out.println ("-");		}
		
	}
	
	public void alzaLuminosita(int value) {
		System.out.println("la luminosità è stata alzata di:" + value);
		this.luminonsità += value;
	}
	
	public void abbassaLuminosita(int value) {
		System.out.println("la luminosità è stata abbassata di:" + value);
		this.luminonsità -= value;
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