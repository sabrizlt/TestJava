package testJava;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static audio[] listAudio = { Audio("Cenere, Lazza", 10, 5) };
	static video[] listVideo = { Video("Tutorial Java", 5, 10, 10) };
	static immagine[] listImg = { Immagine("Cover", 10) };

	static public void Menu() {
		System.out.println("...............................");
		System.out.println("BENVENUTO NEL PLAYER DI SABRI");
		System.out.println("...............................");
		System.out.println("PREMI: [0] Per avviare l'audio");
		System.out.println("PREMI: [1] Per alzare il volume dell'audio");
		System.out.println("PREMI: [2] Per abbassare il volume dell'audio");
		System.out.println("PREMI: [3] Per avviare il video");
		System.out.println("PREMI: [4] Per alzare il volume del video");
		System.out.println("PREMI: [5] Per abbassare il volume del video");
		System.out.println("PREMI: [6] Per alzare la luminosità del video");
		System.out.println("PREMI: [7] Per abbassare la luminosità del video");
		System.out.println("PREMI: [8] Per mostrare l'immagine");
		System.out.println("PREMI: [9] Per alzare la luminosità dell'immagine");
		System.out.println("PREMI: [10] Per abbassare la luminosità dell'immagine");
		System.out.println("...............................");
		System.out.println("⬇️ ⬇️ ⬇️ ⬇️ ⬇️ ⬇️ ⬇️ ⬇️ ⬇️ ⬇️ ⬇️ ⬇️ ⬇️ ⬇️ ⬇️ ⬇️ ⬇️ ⬇️ ⬇️ ⬇️");
		String input = sc.nextLine();
		CheckInputMenu(input);
	}

	static public audio Audio(String titolo, int durata, int volume) {
		return new audio(titolo, durata, volume);
	}

	static public video Video(String titolo, int durata, int volume, int lum) {
		return new video(titolo, durata, volume, lum);
	}

	static public immagine Immagine(String titolo, int lum) {
		return new immagine(titolo, lum);
	}

	

	static public void CheckInputMenu(String value) {
		switch (value) {

			case "0":
				listAudio[0].Play();
				Menu();
				break;

			case "1":
				System.out.println("di quanto vuoi alzare il volume dell'audio?");
				String inputAlza = sc.nextLine();
				listAudio[0].AlzaVolume(Integer.parseInt(inputAlza));
				;
				Menu();
				break;
			case "2":
				System.out.println("di quanto vuoi abbassare il volume dell'audio?");
				String inputAbbassa = sc.nextLine();
				listAudio[0].AbbassaVolume(Integer.parseInt(inputAbbassa));
				Menu();
				break;
			case "3":
				listVideo[0].Play();
				Menu();
				break;
			case "4":
				System.out.println("di quanto vuoi alzare il volume del video?");
				String input = sc.nextLine();
				listVideo[0].AlzaVolume(Integer.parseInt(input));
				Menu();
				break;
			case "5":
				System.out.println("di quanto vuoi abbassare il volume del video?");
				String input2 = sc.nextLine();
				listVideo[0].AbbassaVolume(Integer.parseInt(input2));
				Menu();
				break;
				case "6":
				System.out.println("di quanto vuoi alzare la luminosità dal video?");
				String input3 = sc.nextLine();
				listVideo[0].alzaLuminosita(Integer.parseInt(input3));
				Menu();
				break;
			case "7":
				System.out.println("di quanto vuoi abbassare la luminosità del video?");
				String input4 = sc.nextLine();
				listVideo[0].abbassaLuminosita(Integer.parseInt(input4));

			case "8":
				listImg[0].Show();
				Menu();
				break;
			case "9":
				System.out.println("di quanto vuoi alzare la luminosità dell'immagine?");
				String input5 = sc.nextLine();
				listImg[0].alzaLuminosita(Integer.parseInt(input5));
				Menu();
				break;
			case "10":
				System.out.println("di quanto vuoi abbassare la luminosità dell'immagine?");
				String input6 = sc.nextLine();
				listImg[0].abbassaLuminosita(Integer.parseInt(input6));

				Menu();
				break;
		}

	}

	public static void main(String[] args) {
		Menu();
	}
}
