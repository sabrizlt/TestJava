package testJava;

public class immagine extends elementoMultimediale implements luminosità{
	int luminosità = 5;

	public immagine(String titolo, int luminosità) {
		super(titolo);
		this.luminosità = luminosità;
	}
	
	
	
	public void Show() {
		System.out.println(Titolo.toString()); {
			for(int i = 0; i< this.luminosità; i++ ){
			System.out.println ("-");		}
		}
	}

	@Override
	public void alzaLuminosita(int value) {
		System.out.println("la luminosità è stata alzata di:" + value);
		this.luminosità += value;
		
	}

	@Override
	public void abbassaLuminosita(int value) {
		System.out.println("la luminosità è stata abbassata di:" + value);
		this.luminosità -= value;
	}
}