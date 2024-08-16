package entities;

public class Players {
	
	private String player1;
	private String player2;
	private int player1Points;
	private int player2Points;
	
	
	public Players(String player1, String player2) {
		this.player1 = player1;
		this.player2 = player2;
		
	}


	public String getPlayer1() {
		return player1;
	}


	public void setPlayer1(String player1) {
		this.player1 = player1;
	}


	public String getPlayer2() {
		return player2;
	}


	public void setPlayer2(String player2) {
		this.player2 = player2;
	}


	public int getPlayer1Points() {
		return player1Points;
	}


	public void setPlayer1Points(int player1Points) {
		this.player1Points = player1Points;
	}


	public int getPlayer2Points() {
		return player2Points;
	}


	public void setPlayer2Points(int player2Points) {
		this.player2Points = player2Points;
	}
	
	
	
	
	
}
