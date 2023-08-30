package trabalho;


public class Dolar extends Moeda {
	
	public Dolar(double v) {
		super(v);
	}
	
	@Override
	public double valorConvertidoReal() {//metodo valorConvertido implementado;
		return valor * 5;//o valor do Dolar sera multiplicado por 5 para simular sua cotação para o real;
	}		
	@Override
	public String toString() {
		return "Dolar= " + valor + " $";
	}
	
}
	