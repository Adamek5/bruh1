package zoo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Savec extends Zvire {
	private final boolean TEPLOKREVNOST = true;
	private int teplotaZvirete;
	
	
	public Savec(LocalDate datumNarozeni, String jmeno,
			boolean zijuVCesku) {
		super(datumNarozeni, jmeno, zijuVCesku);
		// TODO Auto-generated constructor stub
	}
	
	public void vydejZvuk(String citoslovce) {
		System.out.println(citoslovce);
	}
}