
public enum JogadaEnum {
	ROYALFLUSH(10), STRAIGHTFLUSH(9), QUADRA(8), FULLHOUSE(7), FLUSH(6), STRAIGHT(
			5), TRINCA(4), DOISPARES(3), PAR(2), MAIORCARTA(1);

	private int peso;

	private JogadaEnum(int peso) {
		this.peso = peso;
	}

	public int getPeso() {
		return peso;
	}

}
