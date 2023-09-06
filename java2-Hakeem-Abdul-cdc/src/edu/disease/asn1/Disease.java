package edu.disease.asn1;

import java.util.Objects;
import java.util.UUID;
/**
 * 
 * @author ABDUL HAKEEM
 * 
 * 
 * Disease class represents information about a specific disease.
 * Each disease is identified by a unique identifier (disease ID) and has a name.
 */
public  class  Disease {
	
	
	private UUID diseaseId;
	private String name;
	  
	
	
	

	  public Disease(UUID diseaseId, String name) {
		super();
		this.diseaseId = diseaseId;
		this.name = name;
	}
	/**
	   * Get the unique identifier of the disease.
	   *
	   *    
	   *  @return The unique identifier of the disease.
	   */
	  
	public UUID getDiseaseId() {
		return diseaseId;
	}
    /**
     * Set the unique identifier of the disease.
     *
     * @param diseaseId The unique identifier to set for the disease.
     */
    public void setDiseaseId(UUID diseaseId) {
        this.diseaseId = diseaseId;
    }

    /**
     * Get the name of the disease.
     *
     * @return The name of the disease.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the disease.
     *
     * @param name The name to set for the disease.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Computes the hash code for the disease based on its unique identifier.
     *
     * @return The hash code value for the disease.
     */
    @Override
    public int hashCode() {
        if (diseaseId != null) {
            return diseaseId.hashCode();
        }
        return 0;
    }

    /**
     * Compares this disease to the specified object for equality.
     *
     * @param obj The object to compare to.
     * @return {@code true} if the diseases have the same unique identifier, {@code false} otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Disease o = (Disease) obj;
        if (diseaseId != null) {
            return diseaseId.equals(o.diseaseId);
        }
        return false;
    }

    /**
     * Generates a string representation of the disease.
     *
     * @return A string representation of the disease.
     */
    @Override
    public String toString() {
        return "Disease [diseaseId=" + diseaseId + ", name=" + name + "]";
    }
}