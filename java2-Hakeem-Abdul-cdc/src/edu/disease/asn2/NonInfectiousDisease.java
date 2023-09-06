package edu.disease.asn2;

import java.util.UUID;

/**
 * 
 * @author ABDUL HAKEEM
 * 
 * The  NonInfectiousDisease class represents a type of disease that is non-infectious, meaning it is not
 * transmitted from one individual to another. This class extends the Disease class and provides specific
 * information and behavior for non-infectious diseases.
 */
public class NonInfectiousDisease extends Disease {
	public NonInfectiousDisease(UUID diseaseId, String name) {
		super(diseaseId, name);
		// TODO Auto-generated constructor stub
	}
	/**
     * Returns an array of examples of non-infectious diseases.
     *
     * @return An array of example non-infectious disease names.
     */
    @Override
    public String[] getExamples() {
        return new String[] {
            "Diabetes",
            "Hypertension",
            "Asthma",
            "Cancer"
        };
    }

    /**
     * Checks if the disease is infectious.
     *
     * @return  false, indicating that the disease is not infectious.
     */
    @Override
    public boolean isInfectious() {
        return false;
    }
}




