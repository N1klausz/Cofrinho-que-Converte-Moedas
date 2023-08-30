package trabalho;

abstract public class Moeda {
@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
		
}

	double valor;
	

	public Moeda(double valor) {
		super();
		this.valor = valor;
	}


	abstract double valorConvertidoReal();//metodo abstrato, sem parametro, as classes filhas terão q implementa-lo;



}

