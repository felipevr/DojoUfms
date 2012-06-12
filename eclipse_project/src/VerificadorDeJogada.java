

public class VerificadorDeJogada {

	public JogadaEnum verificar(Mao mao) {
		if(mao.temRoyal())
			return JogadaEnum.ROYALFLUSH;

		if(mao.temStraightFlush())
			return JogadaEnum.STRAIGHTFLUSH;

		if(mao.temFlush())
			return JogadaEnum.FLUSH;

		if(mao.temStraight())
			return JogadaEnum.STRAIGHT;

		if(mao.temPar())
			return JogadaEnum.PAR;

		return JogadaEnum.MAIORCARTA;
	}

}
