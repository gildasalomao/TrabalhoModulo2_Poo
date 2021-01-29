package mz.co.ciuem.aula6.Trabalho;

import java.util.Scanner;

public class ExecutaAluguer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos estudantes vao alugar quartos?");
		int n = sc.nextInt();
		
		EstudanteAluguer e=new EstudanteAluguer();
		
		EstudanteAluguer[] est = new EstudanteAluguer[n];

		for (int i = 0; i < est.length; i++) {
			sc.nextLine();
			System.out.println("Nome do Estudante: ");
			e.setNome(sc.nextLine());
			System.out.println("Numero de celular: ");
			e.setCelular(sc.nextInt());;
			
			do {
			System.out.println("Escolha um quarto no intervalo de 0-9: ");	
			e.setNrQuarto(sc.nextInt());
			}while(e.getNrQuarto()>9);
			
			est[i] = new EstudanteAluguer(e.getNome(), e.getCelular(), e.getNrQuarto());
			
		}
		
			System.out.println("===================PENTICIONATO=============");
			System.out.println("===========Lista de Estudantes e quartos Alugados=========");

			for (int y = 0; y < est.length; y++) {
				System.out.println("Aluguer #" + (y + 1) + ".\n" + est[y] + "\n");
			}

			System.out.println("Quartos Alugados:");

			// Ordenando array
			for (int x = 1; x < est.length; x++) {
				for (int j = 0; j < x; j++) {
					if (est[x].getNrQuarto() < est[j].getNrQuarto()) {
						EstudanteAluguer temp = est[x];
						est[x] = est[j];
						est[j] = temp;
					}
				}

			}
			// Imprimindo array em ordem crescente
			for (int k = 0; k < est.length; k++) {
				System.out.println(est[k].ListarQuartoEmOrdemCrescente());
			}		
		

}
	}

