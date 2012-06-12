public class Carta implements Comparable<Carta> {
	private NipeEnum nipe;
	private NumeroEnum numero;

	public Carta(NipeEnum nipe, NumeroEnum numero) {
		this.nipe = nipe;
		this.numero = numero;
	}

	public NipeEnum getNipe() {
		return nipe;
	}

	public void setNipe(NipeEnum nipe) {
		this.nipe = nipe;
	}

	public NumeroEnum getNumero() {
		return numero;
	}

	public void setNumero(NumeroEnum numero) {
		this.numero = numero;
	}

	@Override
	public int compareTo(Carta o) {
		// TODO Auto-generated method stub
		int meuPeso = this.getNumero().getPeso();
		int pesoForasteiro = o.getNumero().getPeso();
		return (new Integer(meuPeso)).compareTo(new Integer(pesoForasteiro));
	}

}
