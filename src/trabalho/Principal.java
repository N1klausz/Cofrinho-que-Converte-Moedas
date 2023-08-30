package trabalho;

import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		
		Cofrinho cofrinho = new Cofrinho();
		Scanner teclado = new Scanner(System.in);
		int opcao;

			System.out.println("***********************************");
			System.out.println("Menu do Cofre RU4171043");
			System.out.println("1-Adicionar Moedas");
			System.out.println("2-Remover Moeda");
			System.out.println("3-Listar Moedas");
			System.out.println("4-Valor total convertido para Real");
			System.out.println("0-Fechar Cofre");
			System.out.println("***********************************");
			opcao=teclado.nextInt();

			int tipoMoed;
			double valor;
			Moeda moed = null;
			
			while(opcao!=0) {		//loop para as opções do menu, apenas serão aceitas: 0,1,2,3,4;
				
				switch(opcao) {
				
				case 1:
					
					tipoMoed=0;
					while(tipoMoed>3 || tipoMoed<=0) {// loop para a adição de moedas;
						System.out.println("$++++$$$$$$++++$");
						System.out.println("Escolha a Moeda:");
						System.out.println("1-Real");
						System.out.println("2-Dolar");
						System.out.println("3-Euro");
						System.out.println("$++++$$$$$$++++$");
						tipoMoed = teclado.nextInt();
					}
					System.out.println("Digite o valor: ");
					valor = teclado.nextDouble();
					if(valor<=0) {
						System.out.println("Nao aceitamos valores negativos!");
					}
					moed=null;
					if(tipoMoed==1) {
					moed = new Real(valor);
					}
					if(tipoMoed==2) {
						moed = new Dolar(valor);
					}
					if(tipoMoed==3) {
						moed = new Euro(valor);
					}
					cofrinho.adicionar(moed);	
					break;
					
				case 2:

					tipoMoed=0;
					while(tipoMoed>3 || tipoMoed<=0) {// loop para a remoção de moedas
						System.out.println("$----$$$$$$----$");
						System.out.println("Escolha a Moeda a ser removida:");
						System.out.println("1-Real");
						System.out.println("2-Dolar");
						System.out.println("3-Euro");
						System.out.println("$----$$$$$$----$");
						tipoMoed = teclado.nextInt();
					}
					System.out.println("Digite o valor que deseja remover: ");
					valor = teclado.nextDouble();
				
					moed=null;
					if(tipoMoed==1) {
					moed = new Real(valor);
	
					}
					
					if(tipoMoed==2) {
						moed = new Dolar(valor);
					}

					if(tipoMoed==3) {
						moed = new Euro(valor);
					}
					if (tipoMoed>3){
						System.out.println("Opcao invalida!");	
					}
					cofrinho.remover(moed);
					break;
				
				case 3:// opção para a lista de moedas
					cofrinho.listar();
					break;
				case 4: //aqui sera chamada a opção de converter a moeda
					cofrinho.converter();
					break;
				default://caso o usuario digite algo que não seja 0,1,2,3,4;
					System.out.println("Opcao nao aceita, tente novamente");
					}
				System.out.println();
				System.out.println("***********************************");
				System.out.println("Menu do Cofre RU4171043");
				System.out.println("1-Adicionar Moedas");
				System.out.println("2-Remover Moeda");
				System.out.println("3-Listar Moedas");
				System.out.println("4-Valor total convertido para Real");
				System.out.println("0-Encerrar Programa");
				System.out.println("***********************************");
				opcao=teclado.nextInt();
			}
		
		
			System.out.println("Ate breve, lembre-se: Economize e Invista!");	// msg de encerramento;
	}	
	
}