package factory;

import domain.Covid19Pacient;
import domain.Medicament;

public class Main {

	public static void main(String[] args) {
		SymptomFactory a = new SymptomFactory();
		Medicament m=new Medicament("Ibuprofeno",a);
		MedicalGUI mgui=new MedicalGUI(m);
		

	}

}
