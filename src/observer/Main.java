package observer;

import java.util.Observable;

import domain.Covid19Pacient;
import factory.SymptomFactory;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		SymptomFactory SymptomFactory = new SymptomFactory();
	
		Covid19Pacient pacient = new Covid19Pacient("Mireia",22,SymptomFactory);
		Covid19Pacient pacient2 = new Covid19Pacient("Xabi",50,SymptomFactory);
		Covid19Pacient pacient3 = new Covid19Pacient("Alex",75,SymptomFactory);
		PacientObserverGUI pacientGUI = new PacientObserverGUI(pacient);
		PacientSymptomGUI frame = new PacientSymptomGUI(pacient);
		PacientThermometerGUI frame2 = new PacientThermometerGUI(pacient);
		SemaphorGUI a = new SemaphorGUI(pacient);
		PacientObserverGUI pacientGUI2 = new PacientObserverGUI(pacient2);
		PacientSymptomGUI frame3 = new PacientSymptomGUI(pacient2);
		PacientThermometerGUI frame4 = new PacientThermometerGUI(pacient2);
		SemaphorGUI a2 = new SemaphorGUI(pacient2);
		PacientObserverGUI pacientGUI3 = new PacientObserverGUI(pacient3);
		PacientSymptomGUI frame5 = new PacientSymptomGUI(pacient3);
		PacientThermometerGUI frame6 = new PacientThermometerGUI(pacient3);
		SemaphorGUI a3 = new SemaphorGUI(pacient3);
		
		
	}


}
