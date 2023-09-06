package edu.disease.asn1;

import java.util.Arrays;

/**
 * The `Patient` class represents information about a patient, including their personal details,
 * exposure events, and associated disease IDs.
 */
import java.util.Objects;
import java.util.UUID;
	
/**
 * 
 * @author ABDUL HAKEEM
 * 
 * The Patient class represents a patient, containing information about their unique identifier,
 * first name, last name, associated exposure events, and disease IDs.
 */
public class Patient  {
	private UUID patientId;
    private String firstName;
    private String lastName; 
    private Exposure[] exposures;
    private UUID[] diseaseIds;
    
    
    
    //constructor with 2 params 
    /**
     * Constructs a Patient object with a specified maximum number of diseases and exposures.
     *
     * @param maxDiseases The maximum number of disease IDs that can be associated with the patient.
     * @param maxExposures The maximum number of exposure events that can be recorded for the patient.
     * @throws IllegalArgumentException if maxDiseases or maxExposures is less than or equal to zero.
     */
    public Patient(int maxDiseases, int maxExposures) throws IllegalArgumentException{
    	if (maxDiseases <= 0)  {				  			 
            throw new IllegalArgumentException();
    	}
    	if(maxExposures <= 0) {
    		throw new IllegalArgumentException();
    	}
        this.diseaseIds = new UUID[maxDiseases];
        this.exposures = new Exposure[maxExposures];
	}
    /**
     * Adds a disease ID to the list of associated disease IDs for the patient.
     *
     * @param diseaseId The UUID of the disease to be added.
     * @throws IndexOutOfBoundsException if the disease IDs array is full.
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
     * Adds an exposure event to the list of exposure events for the patient.
     *
     * @param newExposure The exposure event to be added.
     * @throws IndexOutOfBoundsException if the exposures array is full.
     */
    public void addExposure(Exposure newExposure) throws IndexOutOfBoundsException {
        for (int i = 0; i < exposures.length; i++) {
            if (exposures[i] == null) {
                exposures[i] = newExposure;
                return; // Exit the loop once a slot is found for the new exposure
            }
        }
    }
    /**
     * Computes the hash code for the Patient based on its unique identifier.
     *
     * @return The hash code value for the Patient.
     */
    @Override
    public int hashCode() {
        return Objects.hash(patientId);
    }

    /**
     * Compares this Patient to the specified object for equality.
     *
     * @param obj The object to compare to.
     * @return {@code true} if the Patients have the same unique identifier, {@code false} otherwise.
     */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		return Objects.equals(patientId, other.patientId);
	}

	
	/**
     * Retrieves the unique identifier of the patient.
     *
     * @return The unique identifier of the patient.
     */
    public UUID getPatientId() {
        return patientId;
    }

    /**
     * Sets the unique identifier of the patient.
     *
     * @param patientId The unique identifier to set for the patient.
     */
    public void setPatientId(UUID patientId) {
        this.patientId = patientId;
    }

    /**
     * Retrieves the first name of the patient.
     *
     * @return The first name of the patient.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the patient.
     *
     * @param firstName The first name to set for the patient.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Retrieves the last name of the patient.
     *
     * @return The last name of the patient.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the patient.
     *
     * @param lastName The last name to set for the patient.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Retrieves the exposure events associated with the patient.
     *
     * @return An array of Exposure objects representing the exposure events.
     */
    public Exposure[] getExposures() {
        return exposures;
    }

    /**
     * Sets the exposure events associated with the patient.
     *
     * @param exposures An array of Exposure objects representing the exposure events.
     */
    public void setExposures(Exposure[] exposures) {
        this.exposures = exposures;
    }

    /**
     * Retrieves the disease IDs associated with the patient.
     *
     * @return An array of UUIDs representing the disease IDs.
     */
    public UUID[] getDiseaseIds() {
        return diseaseIds;
    }

    /**
     * Sets the disease IDs associated with the patient.
     *
     * @param diseaseIds An array of UUIDs representing the disease IDs.
     */
    public void setDiseaseIds(UUID[] diseaseIds) {
        this.diseaseIds = diseaseIds;
    }
    
    /**
     * Generates a string representation of the Patient object.
     *
     * @return A string containing the patient's unique identifier, first name, last name,
     *         exposure events, and associated disease IDs.
     */
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", exposures=" + Arrays.toString(exposures) + ", diseaseIds=" + Arrays.toString(diseaseIds) + "]";
	}

	
    
    
}
