package edu.disease.asn2;


import java.util.UUID;

/**
 * @author ABDUL HAKEEM
 */

abstract public class Disease {	
	/**
     * The unique identifier for the disease.
     */
	private UUID diseaseId;

    /**
     * Constructor to create a Disease instance with a given ID and name.
     *
     * @param diseaseId The unique identifier for the disease.
     * @param name      The name of the disease.
     */
	private String name;
	
	public abstract  String[] getExamples();
	
	/**
     * Abstract method to check if the disease is infectious.
     *
     * @return True if the disease is infectious, otherwise false.
     */
	public abstract boolean isInfectious();

	public Disease(UUID diseaseId, String name) {
		super();
		this.diseaseId = diseaseId;
		this.name = name;
	}
	
	/**
     *
     * @return The disease's unique identifier.
     */
	public UUID getDiseaseId() {
		return diseaseId; 	
	 }  
	/**
     *
     * @param diseaseId The unique identifier for the disease.
     */
	public void setDiseaseId(UUID diseaseId) {
		this.diseaseId = diseaseId;
	}
	
	/**
     *
     * @return The name of the disease.
     */
	public String getName() {
		return name;
	}
	/**
     *
     * @param name The name of the disease.
     */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
     * Compute the hash code for the disease.
     *
     * @return The hash code based on the disease's unique identifier.
     */
	
	@Override
	public int hashCode() {
		if(diseaseId!=null) {
			return diseaseId.hashCode();
		}else {
		return 0;
		}
	}
	
	/**
     * Abstract method to check if the disease is infectious.
     *
     * @return True if the disease is infectious, otherwise false.
     */
	@Override
	public boolean equals(Object obj) {
		Disease d= (Disease) obj;
		if(diseaseId!=null) {
			if(diseaseId.hashCode()==d.diseaseId.hashCode()) {
				return true;
			}
		}
				
		return false;	
	}
	@Override
	public String toString() {
		return "Disease [diseaseId=" + diseaseId + ", name=" + name + "]";
	}
	
	  
}

