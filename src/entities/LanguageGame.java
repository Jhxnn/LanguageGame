package entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class LanguageGame {

	private int language;

	private ArrayList<String> italianWords = new ArrayList<String>(
			Arrays.asList("Amore","Cane","Chiave","Gelato","Pesce","Libro","Gatto","Mare","Amico","Vino","Fiore","Montagna", "Ciao", "Salve", "Arrivederci", "Piazza", "Tavolo"));
	private ArrayList<String> englishWords = new ArrayList<String>(
			Arrays.asList("Love","Dog","Key","Ice Cream","Fish","Book","Cat","Sea","Friend","Wine","Flower","Mountain", "Hi", "Hello", "Good Bye", "Square", "Table"));
	private ArrayList<String> translation = new ArrayList<String>(
			Arrays.asList("AMOR","CACHORRO","CHAVE","SORVETE","PEIXE","LIVRO","GATO","MAR","AMIGO","VINHO","FLOR","MONTANHA", "OI", "OLA", "TCHAU", "PRAÇA", "MESA"));

	public LanguageGame(int language) {
		this.language = language;


	}

	public String startGame() {
		int wordIndex = 0;
		if (language == 0) {
			Random randomNumber = new Random();
			wordIndex = randomNumber.nextInt(italianWords.size());
			String word = italianWords.get(wordIndex);
			System.out.println("Palavra: " + word);

		}
		if (language == 1) {
			Random randomNumber = new Random();
			wordIndex = randomNumber.nextInt(englishWords.size());
			String word = englishWords.get(wordIndex);
			System.out.println("Palavra: " + word);

		}

		String correctWord = translation.get(wordIndex);
		return correctWord;

	}

	public boolean testWord(String word, String palavraCorreta, Players player, int playerNumber) {

		word = word.toUpperCase();
		if (palavraCorreta.equals(word)) {
			System.out.println("Resposta Correta");
			if (playerNumber == 1) {
				player.setPlayer1Points(player.getPlayer1Points() + 5);
				System.out.println("Jogador 1 está com " + player.getPlayer1Points() + " ponto(s)");
				if (player.getPlayer1Points() == 1) {
					System.out.println("Jogador um venceu parabens: " + player.getPlayer1());
					boolean stopGame = true;
					return stopGame;
					
				}
			}
			if (playerNumber == 2) {
				player.setPlayer2Points(player.getPlayer2Points() + 5);
				System.out.println("Jogador 2 está com " + player.getPlayer2Points() + " pontos(s)");
				if (player.getPlayer2Points() == 1) {
					System.out.println("Jogador dois venceu parabens: " + player.getPlayer2());
					boolean stopGame = true;
					return stopGame;
				}
			}
		} else {
			System.out.println("Palavra errada");
		}

		boolean stopGame = false;
		return stopGame;
	}

}
