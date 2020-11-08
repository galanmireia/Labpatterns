package adapter;
import domain.Symptom;
public class ComparatorString implements java.util.Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		//nombre-severityIndex
		String  prueba1= ((Symptom)arg0).getName();
		String prueba2 = ((Symptom)arg1).getName();
		
	//	int  prueba3= ((Symptom)arg0).getSeverityIndex();
		//int prueba4 = ((Symptom)arg1).getSeverityIndex();
		int S = prueba1.compareTo(prueba2);
		 
        // Show the results of the comparison.  
        if (S < 0) { System.out.println("\"" + prueba1 + "\"" + " is lexicographically higher than " + "\"" + prueba2 + "\"");
        return -1;
        } else if (S == 0) {
            System.out.println("\"" + prueba1 + "\"" + " is lexicographically  equal to " + "\"" + prueba2 + "\"");
            return 0;
        } else {
            System.out.println("\"" + prueba1 + "\"" + " is lexicographically less than " + "\"" + prueba2 + "\"");
            return +1;
        }
	
		
		
		//compareto
	}

}
