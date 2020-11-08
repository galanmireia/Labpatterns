package adapter;

import domain.Symptom;

public class ComparatorInt implements java.util.Comparator {
	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		//nombre-severityIndex

		
	    int prueba1 = ((Symptom)arg0).getSeverityIndex();
		int prueba2 = ((Symptom)arg1).getSeverityIndex();
		

		 
        // Show the results of the comparison.  
        if (prueba1>prueba2) { System.out.println("\"" + prueba1 + "\"" + " is lexicographically higher than " + "\"" + prueba2 + "\"");
        return -1;
        } else if (prueba1==prueba2) {
            System.out.println("\"" + prueba1 + "\"" + " is lexicographically  equal to " + "\"" + prueba2 + "\"");
            return 0;
        } else {
            System.out.println("\"" + prueba1 + "\"" + " is lexicographically less than " + "\"" + prueba2 + "\"");
            return +1;
        }
	
		
		
		//compareto
	}
}
