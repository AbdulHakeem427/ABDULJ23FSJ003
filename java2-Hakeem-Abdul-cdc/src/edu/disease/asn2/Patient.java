package edu.disease.asn2;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/**
 * 
 * @author ABDUL HAKEEM
 * 
 * Represents a patient with information about their diseases and exposures.
 * Implements the Comparable interface for sorting based on the patient's name.
 */
public class Patient  implements Comparable<Patient>{
	private  UUID patientId;
    private String firstName;
    private String lastName; 
    private Exposure[] exposures;
    private UUID[] diseaseIds;
    
    private int checkMaxDiseases;
    private int checkMaxExposures;
    
    
    /**
     * Constructs a Patient object with the specified maximum diseases and exposures.
     *
     * @param maxDiseases   The maximum number of diseases a patient can have.
     * @param maxExposures  The maximum number of exposures a patient can have.
     * @throws IllegalArgumentException If maxDiseases or maxExposures is less than or equal to 0.
     */
    //constructor with 2 params 
    public Patient(int maxDiseases, int maxExposures){
    	if (maxDiseases <= 0 || maxExposures <= 0)  {				  			 
            throw new IllegalArgumentException();
    	}
    	
        this.diseaseIds = new UUID[maxDiseases];
        this.exposures = new Exposure[maxExposures];
        this.checkMaxDiseases=maxDiseases;
        this.checkMaxExposures=maxExposures;
        
	}
    
    /**
     * Compares this patient to another patient for sorting purposes.
     *
     * @param o The patient to compare to.
     * @return A negative integer, zero, or a positive integer as this patient is less than, equal to,
     *         or greater than the specified patient based on their names.
     */
    @Override
    public int compareTo(Patient that) {
        int lastNameComparison = compareStringsIgnoreCase(this.lastName, that.lastName);

        if (lastNameComparison != 0) {
            return lastNameComparison;
        }

        return compareStringsIgnoreCase(this.firstName, that.firstName);
    }

    private int compareStringsIgnoreCase(String str1, String str2) {
        if (str1 == null && str2 == null) {
            return 0;
        } else if (str1 == null) {
            return -1;
        } else if (str2 == null) {
            return 1;
        }

        return str1.compareToIgnoreCase(str2);
    }

    /**
     * Adds a disease ID to the patient's list of diseases.
     *
     * @param diseaseId The UUID of the disease to add.
     * @throws IndexOutOfBoundsException If the disease IDs array is full.
     */
    public void addDiseaseId(UUID diseaseId)  throws IndexOutOfBoundsException{
    	
        for (int i = 0; i < diseaseIds.length; i++) {
            if (diseaseIds[i] == null) {
                diseaseIds[i] = diseaseId;
                return; // Exit the loop once a slot is found for the new diseaseId
            }
        }
    }
    
    /**
     * Adds an exposure to the patient's list of exposures.
     *
     * @param newExposure The exposure to add.
     * @throws IndexOutOfBoundsException If the exposures array is full.
     */
    public void addExposure(Exposure newExposure) throws IndexOutOfBoundsException {
        for (int i = 0; i < exposures.length; i++) {
            if (exposures[i] == null) {
                exposures[i] = newExposure;
                return; // Exit the loop once a slot is found for the new exposure
            }
        }
        // If loop completes without finding an empty slot, the array is full
        //throw new IndexOutOfBoundsException("Exposures array is full.");
    }
    
	public UUID getPatientId() {
		return patientId;
	}
	/**
	 * Sets the patient's unique ID.
	 *
	 * @param patientId The UUID representing the patient's unique ID.
	 */
	public void setPatientId(UUID patientId) {
		this.patientId = patientId;
	}

	/**
	 * Returns the first name of the patient.
	 *
	 * @return The first name of the patient.
	 */
	public String getFirstName() {
	    return firstName;
	}
	
	/**
	 * Sets the first name of the patient.
	 *
	 * @param firstName The first name of the patient.
	 */
	public void setFirstName(String firstName) {
	    this.firstName = firstName;
	}
	
	/**
	 * Returns the last name of the patient.
	 *
	 * @return The last name of the patient.
	 */
	public String getLastName() {
	    return lastName;
	}
	
	/**
	 * Sets the last name of the patient.
	 *
	 * @param lastName The last name of the patient.
	 */
	public void setLastName(String lastName) {
	    this.lastName = lastName;
	}
	/**
	 * Returns the array of exposures associated with the patient.
	 *
	 * @return The array of exposures.
	 */
	public Exposure[] getExposures() {
		return exposures;
	}
	/**
	 * Sets the array of exposures associated with the patient.
	 *
	 * @param exposures The array of exposures to set.
	 */
	public void setExposures(Exposure[] exposures) {
		this.exposures = exposures;
	}
	/**
	 * Returns the array of disease IDs associated with the patient.
	 *
	 * @return The array of disease IDs.
	 */
	public UUID[] getDiseaseIds() {
		return diseaseIds;
	}
	/**
	 * Sets the array of disease IDs associated with the patient.
	 *
	 * @param diseaseIds The array of disease IDs to set.
	 */
	public void setDiseaseIds(UUID[] diseaseIds) {
		this.diseaseIds = diseaseIds;
	}
	/**
	 * Returns a string representation of the patient.
	 *
	 * @return A formatted string containing patient information, including patient ID, first name, last name,
	 *         exposures, and disease IDs.
	 */
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", exposures=" + Arrays.toString(exposures) + ", diseaseIds=" + Arrays.toString(diseaseIds) + "]";
	}
	
	/**
	 * Checks if the patient has a specific disease.
	 *
	 * @param diseaseId The UUID of the disease to check.
	 * @return it return true, if the patient has the disease,  otherw false.
	 */

	public boolean hasDisease(UUID diseaseId) {
	    for (UUID id : diseaseIds) {
	        if (id != null && id.equals(diseaseId)) {
	            return true;
	        }
	    }
	    return false;
	}
	/**
	 * Checks if the patient has a specific exposure.
	 *
	 * @param exposure The exposure to check.
	 * @return it return true, if the patient has the exposure,  otherwise false.
	 */
	
	public boolean hasExposure(Exposure exposure) {
	    for (Exposure e : exposures) {
	        if (e != null && e.equals(exposure)) {
	            return true;
	        }
	    }
	    return false;
	}
	/**
	 * Returns the maximum number of diseases a patient can have.
	 *
	 * @return The maximum number of diseases.
	 */
	public int getCheckMaxDiseases() {
		return checkMaxDiseases;
	}

	/**
	 * Returns the maximum number of exposures a patient can have.
	 *
	 * @return The maximum number of exposures.
	 */

	public int getCheckMaxExposures() {
		return checkMaxExposures;
	}
	
	/**
	 * Returns the hash code value for this patient.
	 *
	 * @return The hash code value based on the patient's unique ID.
	 */

	@Override
	public int hashCode() {
		return Objects.hash(patientId);
	}
	/**
	 * Compares this patient to another object for equality.
	 *
	 * @param obj The object to compare to.
	 * @return it return true,   if the objects are equal (same class and same patient ID),  false otherwise.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		Patient other = (Patient) obj;
		return Objects.equals(patientId, other.patientId);
	    
	
	}	 
    
    
}
