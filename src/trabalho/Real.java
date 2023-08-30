package trabalho;


public class Real extends Moeda {

	public Real(double v) {
		super(v);
	}
	
	@Override
	public double valorConvertidoReal() {//metodo valorConvertido implementado;
		return valor;//como o valor ja esta em real nao ha necessidade de conversao aqui;
	}
	@Override
	public String toString() {
		return "Real= " + valor + " R$";
	}

}
