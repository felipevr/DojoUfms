public enum NumeroEnum {
	AS(14),

	DOIS(2),

	TRES(3),

	REI(13),

	DAMA(12),

	VALETE(11),

	DEZ(10),

	NOVE(9),

	OITO(8),

	SETE(7),

	SEIS(6);

	private int peso;

	private NumeroEnum(int peso) {
		this.peso = peso;
	}

	public int getPeso() {
		return peso;
	}
}
