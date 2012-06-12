import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mao {

	private List<Carta> cartas;

	public Mao() {
		cartas = new ArrayList<Carta>();
	}

	public void addCarta(Carta carta) {
		cartas.add(carta);
		Collections.sort(cartas);
	}

	public List<Carta> getCartas() {
		return cartas;
	}

	public boolean temRoyal() {

		if (temFlush()) {

			if (tem(NumeroEnum.DEZ) && tem(NumeroEnum.AS)
					&& tem(NumeroEnum.VALETE) && tem(NumeroEnum.DAMA)
					&& tem(NumeroEnum.REI))
				return true;

		}

		return false;
	}

	private boolean tem(NumeroEnum numero) {
		for (Carta carta : cartas)
			if (carta.getNumero() == numero)
				return true;

		return false;
	}

	public boolean temStraightFlush() {
		return false; // temFlush() && temStraight();
	}

	public boolean temPar() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean temFlush() {
		NipeEnum naipe = cartas.get(0).getNipe();
		for (Carta carta : cartas) {
			if (carta.getNipe() != naipe) {
				return false;
			}
		}
		return true;
	}

	public boolean temStraight() {
		int pesoAnterior = 0;
		for (Carta carta : cartas) {
			if (pesoAnterior > 0){
				if ((pesoAnterior + 1) != carta.getNumero().getPeso()){
					return false;
				}
			}
			pesoAnterior = carta.getNumero().getPeso();
		}
		return true;
	}

}
