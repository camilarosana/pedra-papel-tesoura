package entities;

public class PedraPapelTesoura {
	
	public static String choiceToString(int choice) {
		switch(choice) {
		case 1: 
			return "Pedra";
		case 2:
			return "Papel";
		case 3:
			return "Tesoura";
		default:
			return "Escolha Inválida!";
		}
		
		
	}
	
	public static int determineWinner(int player, int enemy) {
		if (player == enemy) {
			return 0; // empate
		} else if((player == 1 && enemy == 3) || (player == 2 && enemy == 2) || (player == 3 && enemy == 2)) {
			return 1; // jogador ganha
		} else {
			return -1; // inimigo ganha
		}
	}
}
