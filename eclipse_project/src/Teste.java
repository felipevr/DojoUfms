import org.junit.Assert;
import org.junit.Test;

public class Teste {

	@Test
	public void testJogada() {
		Mao mao = new Mao();
		mao.addCarta(new Carta(NipeEnum.OURO, NumeroEnum.AS));
		mao.addCarta(new Carta(NipeEnum.OURO, NumeroEnum.REI));
		mao.addCarta(new Carta(NipeEnum.OURO, NumeroEnum.DAMA));
		mao.addCarta(new Carta(NipeEnum.OURO, NumeroEnum.VALETE));
		mao.addCarta(new Carta(NipeEnum.OURO, NumeroEnum.DEZ));
		JogadaEnum jogadaVerificada = new VerificadorDeJogada().verificar(mao);
		Assert.assertEquals(JogadaEnum.ROYALFLUSH, jogadaVerificada);
	}

	@Test
	public void testJogadaFlush() {
		Mao mao = new Mao();
		mao.addCarta(new Carta(NipeEnum.OURO, NumeroEnum.AS));
		mao.addCarta(new Carta(NipeEnum.OURO, NumeroEnum.DOIS));
		mao.addCarta(new Carta(NipeEnum.OURO, NumeroEnum.DAMA));
		mao.addCarta(new Carta(NipeEnum.OURO, NumeroEnum.VALETE));
		mao.addCarta(new Carta(NipeEnum.OURO, NumeroEnum.DEZ));
		JogadaEnum jogadaVerificada = new VerificadorDeJogada().verificar(mao);
		Assert.assertEquals(JogadaEnum.FLUSH, jogadaVerificada);
	}

	@Test
	public void testJogadaStraight() {
		Mao mao = new Mao();
		mao.addCarta(new Carta(NipeEnum.COPAS, NumeroEnum.AS));
		mao.addCarta(new Carta(NipeEnum.OURO, NumeroEnum.REI));
		mao.addCarta(new Carta(NipeEnum.PAUS, NumeroEnum.DAMA));
		mao.addCarta(new Carta(NipeEnum.OURO, NumeroEnum.VALETE));
		mao.addCarta(new Carta(NipeEnum.ESPADA, NumeroEnum.DEZ));
		JogadaEnum jogadaVerificada = new VerificadorDeJogada().verificar(mao);
		Assert.assertEquals(JogadaEnum.STRAIGHT, jogadaVerificada);
	}

	@Test
	public void testJogadaMaiorCarta() {
		Mao mao = new Mao();
		mao.addCarta(new Carta(NipeEnum.OURO, NumeroEnum.AS));
		mao.addCarta(new Carta(NipeEnum.PAUS, NumeroEnum.REI));
		mao.addCarta(new Carta(NipeEnum.OURO, NumeroEnum.DOIS));
		mao.addCarta(new Carta(NipeEnum.ESPADA, NumeroEnum.TRES));
		mao.addCarta(new Carta(NipeEnum.OURO, NumeroEnum.DEZ));
		JogadaEnum jogadaVerificada = new VerificadorDeJogada().verificar(mao);
		Assert.assertEquals(JogadaEnum.MAIORCARTA, jogadaVerificada);
	}

	@Test
	public void testJogadaStraightFlush() {
		Mao mao = new Mao();
		mao.addCarta(new Carta(NipeEnum.OURO, NumeroEnum.REI));
		mao.addCarta(new Carta(NipeEnum.OURO, NumeroEnum.DAMA));
		mao.addCarta(new Carta(NipeEnum.OURO, NumeroEnum.VALETE));
		mao.addCarta(new Carta(NipeEnum.OURO, NumeroEnum.DEZ));
		mao.addCarta(new Carta(NipeEnum.OURO, NumeroEnum.NOVE));
		JogadaEnum jogadaVerificada = new VerificadorDeJogada().verificar(mao);
		Assert.assertEquals(JogadaEnum.STRAIGHTFLUSH, jogadaVerificada);
	}



}
