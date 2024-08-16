package program;

import java.util.Scanner;

import entities.LanguageGame;
import entities.Players;

public class App {

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);

		System.out.println("Digite o nome do Jogador 1");
		String playerName1 = Sc.next();
		System.out.println("Digite o nome do Jogador 2");
		String playerName2 = Sc.next();

		System.out.println("Escolha uma lingua:   Italiano - 0    Inglês - 1");
		int language = Sc.nextInt();

		Players players = new Players(playerName1, playerName2);
		LanguageGame game = new LanguageGame(language);

		boolean stopGame = false;

		while (stopGame == false) {
			String palavraCorreta = game.startGame();
			System.out.println("Jogador 1 Qual a tradução dessa palavra?");

			String word1 = Sc.next();

			stopGame = game.testWord(word1, palavraCorreta, players, 1);
			if(stopGame == true) {
				break;
			}

			System.out.println("Jogador 2 Qual a tradução dessa palavra?");
			palavraCorreta = game.startGame();

			String word2 = Sc.next();
			stopGame = game.testWord(word2, palavraCorreta, players, 2);
			

			if (stopGame == true) {
				System.out.println("recomeçar?   sim - 1    nao - 2");
				int restart = Sc.nextInt();
				if (restart == 1) {
					stopGame = false;
				} else {
					stopGame = true;
				}
			}

		}

		Sc.close();

	}
}
