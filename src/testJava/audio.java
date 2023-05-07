package testJava;


public class audio extends elementoMultimediale {
	int durata = 0;
	int volume = 0;
	public audio(String titolo, int dura, int volume) {
		super(titolo);
		this.durata = dura;
		this.volume = volume;
	}
	
	
	public void Play() {
		System.out.println("Audio in esecuzione ▶️");
		for(int i = 0; i< this.durata; i++ ) {
			System.out.println(Titolo.toString());
		}
		for(int i = 0; i< this.volume; i++ ) {
			System.out.println ("!");
		}
	}
	
	public void AlzaVolume(int value) {
		System.out.println("il volume è stato alzato di:" + value);
		this.volume += value;
	}
	
	public void AbbassaVolume(int value) {
		System.out.println("il volume è stato abbassato di:" + value);
		this.volume -= value;
	}
	
}
