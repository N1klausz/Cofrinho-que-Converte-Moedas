package trabalho;

import java.util.ArrayList;


public class Cofrinho {
	
	private ArrayList<Moeda> listaMoeda = new ArrayList<Moeda>();//lista de moedas privada;

	public void adicionar(Moeda m) {//metodo para adcionar as moedas;
		listaMoeda.add(m);
		
	}
	
	public void remover(Moeda m) {//metodo para remover as moedas;
		listaMoeda.remove(m);
	}
	
	public void listar() {//metodo para listar as moedas;
		System.out.println("Suas Moedas: ");
		System.out.println();
		for (Moeda m : listaMoeda) {
			System.out.println(m);
		}	
	}
	
	void converter() {//metodo para coonverter as moedas;
		double valor = 0;
		for (Moeda m : listaMoeda) 
		{
			valor += m.valorConvertidoReal();
	}	
		System.out.println();
		System.out.printf("Total convertido para Real: %.2f R$" , valor);
		System.out.println();
	}

}


	

