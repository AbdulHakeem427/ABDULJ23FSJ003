package edu.disease.asn2;

import java.util.UUID;

/**
 * @author ABDUL HAKEEM
 * 
* The  InfectiousDisease  class represents a type of disease that is infectious, which means it can be
* transmitted from one individual to another. This class extends the  Disease class and provides specific
* information and behavior for infectious diseases.
*/
public class InfectiousDisease  extends Disease{
	
	
	
	public InfectiousDisease(UUID diseaseId, String name) {
		super(diseaseId, name);
		// TODO Auto-generated constructor stub
	}
	
	/**
    * Returns an array of examples of infectious diseases.
    *
    * @return An array of example infectious disease names.
    */
	@Override
    public String[] getExamples() {
        return new String[] {
            "Influenza",
            "COVID-19",
            "Malaria",
            "Tuberculosis"
        };
    }
	/**
     * Checks if the disease is infectious.
     *
     * @return  true, indicating that the disease is infectious.
     */
	@Override
	public boolean isInfectious() {
	
		return true;
	}
	
}

