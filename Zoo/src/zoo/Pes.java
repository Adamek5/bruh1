package zoo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pes extends Savec{

	public Pes(LocalDate datumNarozeni, String jmeno,
			boolean zijuVCesku) {
		super(datumNarozeni, jmeno, zijuVCesku);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void vypisInformace() {
		System.out.println("Jsem pes");
	}
	
	
	
	

}
