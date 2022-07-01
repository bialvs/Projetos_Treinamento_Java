// Jogo de adivinhação com objetivo de treinar estruturas condicionais e de repetição em Java
// Funcionamento: Caso o usuário deseje jogar, o computador escolherá um número aleatório entre X e Y até que o usuário acerte!


import java.util.Random;
import java.util.Scanner;

public class Jogo {
	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			Random gerador = new Random();
			
			int escolhaDoComputador;
			int escolhaDoUsuario;
					
			
			System.out.println("Ola, qual e o seu nome?");
			String nome = scan.nextLine();
			System.out.println(nome + ", voce quer jogar comigo? \nDigite 1 para sim e 2 para nao");
			int opcao = scan.nextInt();
			
			if(opcao == 2) {
				System.out.println("Que pena, fica para proxima!");
			}
			else if (opcao == 1) {
				System.out.println("OK! O jogo e assim... Irei escolher um numero \nentre 0 e 10 e voce tera que advinhar qual numero eu escolhi!");
				
				escolhaDoComputador = gerador.nextInt(11);
				
				System.out.println(nome + ", ja escolhi meu numero! Agora tente advinhar!!");
				
				
			do{
					escolhaDoUsuario = scan.nextInt();
					if (escolhaDoUsuario != escolhaDoComputador) {
						System.out.println("Resposta errada. Tente novamente!");
					}
					else {
						System.out.println("Parabens, voce acertou!");

					}
				
				}while(escolhaDoComputador != escolhaDoUsuario);
				
				
			}
		}
		
	}
}
