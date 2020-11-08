package adapter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import domain.Covid19Pacient;
import domain.Symptom;
import factory.SymptomFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SymptomFactory a = new SymptomFactory();
		Covid19Pacient p=new Covid19Pacient("Mireia", 29,a);
		p.addSymptom(new Symptom("s1", 10, 10), 1);
		p.addSymptom(new Symptom("s2", 20, 10), 2);
		p.addSymptom(new Symptom("s3", 5, 10), 3);
		p.addSymptom(new Symptom("s4", 25, 10), 4);
		p.addSymptom(new Symptom("s5", 15, 10), 5);
		List<Symptom> s = new ArrayList<Symptom>();
		s.addAll(p.getSymptoms());
		
		//a.goLast();
		
		
		Iterator iterador1 = Sorting.sortedIterator(p.invertedIterator(s), new ComparatorString());
		
		System.out.println("Izenak ordenatuta: ");
		while(iterador1.hasNext() ) {
		
			System.out.println(iterador1.next());
		}
		
		Iterator iterador2 = Sorting.sortedIterator(p.invertedIterator(s), new ComparatorInt());
		
		System.out.println(" Severity Index ordenatuta: ");
		while(iterador2.hasNext() ) {
			System.out.println(iterador2.next());
		}
		
		
	}

}
