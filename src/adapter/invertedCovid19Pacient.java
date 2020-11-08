package adapter;

import java.util.List;

import domain.Symptom;

public class invertedCovid19Pacient implements InvertedIterator{

	List<Symptom> symptoms;
	int position=0;
	
	public invertedCovid19Pacient(List<Symptom> s) {
		this.symptoms = s;
	}
	
	@Override
	public Object previous() {
		// TODO Auto-generated method stub
		
		Symptom symptom=symptoms.get(position);
	
		position--;
		return symptom;
	}

	@Override
	public boolean hasPrevious() {
		// TODO Auto-generated method stub
		return position>0;
	}
	
	@Override
	public void goLast() {
		// TODO Auto-generated method stub
		position=symptoms.size()-1;
		
	}
	
	public boolean hasNext() {
		return position<symptoms.size();
	}
	
	public Object next() {
		Symptom symptom=symptoms.get(position);
		position++;
		return symptom;
	}



}
