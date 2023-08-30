package trabalho;


public class Euro extends Moeda {

	public Euro(double v) {
		super(v);
	}
	
	@Override
	public double valorConvertidoReal() {//metodo valorConvertido implementado;
		return valor * 6;//o valor do Euro sera multiplicado por 6 para simular sua cotação para o real;
	}
	@Override
	public String toString() {
		return "Euro= " + valor + " EUR";
	}

}
