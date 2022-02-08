package zoo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Plaz extends Zvire {
	
	final boolean TEPLOKREVNOST = false;

	public Plaz(LocalDate datumNarozeni, ArrayList hodinyKrmeni, int pocetKrmeniZaDen, String jmeno,
			boolean zijuVCesku) {
		super(datumNarozeni, jmeno, zijuVCesku);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void vypisInformace() {
		System.out.println("Datum narození je ");
	}
	
	
}
