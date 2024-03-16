package application;

import java.util.Scanner;
import entities.PedraPapelTesoura;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem-vindo ao jogo Pedra, Papel e Tesoura");
		System.out.println("Escolha: 1 - Pedra, 2 - Papel, 3 - Tesoura");
		
		int playerChoice = sc.nextInt();
		int enemyChoice = (int)(Math.random()* 3) + 1;
		
		System.out.println("Você escolheu: " + PedraPapelTesoura.choiceToString(playerChoice));
		System.out.println("O inimigo escolheu: " + enemyChoice);
		
		int result = PedraPapelTesoura.determineWinner(playerChoice, enemyChoice);
		if(result == 0) {
			System.out.println("Empate!");
		} else if (result == 1) {
			System.out.println("Você ganhou!");
		} else {
			System.out.println("Você perdeu!");
		}

	}

}
