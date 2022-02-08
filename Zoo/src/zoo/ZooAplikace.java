package zoo;

public class ZooAplikace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zvire zvire = new Zvire(null, "Pepa", false);
		zvire.isZijuVCesku();
		zvire.getDatumNarozeni();
		zvire.getJmeno();
		
		Savec savec = new Savec(null, "Franta", false);
		savec.isZijuVCesku();
		savec.getDatumNarozeni();
		savec.getJmeno();
	}

}
