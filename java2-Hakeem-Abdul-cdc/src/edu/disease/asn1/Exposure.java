package edu.disease.asn1;

import java.util.Objects;
import java.util.UUID;
import java.time.LocalDateTime;

/**
 * 
 * @author ABDUL HAKEEM
 *
 * The Exposure class represents a recorded exposure event for a patient
 * each exposure event is associated with a patient ID, a datetime, and an exposure type.
 */
public class Exposure {
    private UUID patientId;
    private LocalDateTime datetime;
    private String exposureType;
    
    /**
    * Constructs a new Exposure object with the given patient ID.
    *
    * @param patientId The unique identifier of the patient associated with this exposure event.
    */

    public Exposure(UUID patientId) {
        this.patientId = patientId;
    }
    
   
    
   
    /**
     * retrieves the datetime of this exposure event.
     *
     * @return The datetime of the exposure event.
     */
    public LocalDateTime getDatetime() {
        return datetime;
    }
    

    /**
     * Retrieves the patient ID associated with this exposure event.
     *
     * @return The patient ID as a UUID.
     */
    public UUID getPatientId() {
		return patientId;
	}

	public void setPatientId(UUID patientId) {
		this.patientId = patientId;
	}

	/**
    * sets the datetime of this exposure event.
    *
    * @param datetime The datetime of the exposure event.
    */
    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }
    /**
     * Sets the exposure type of this exposure event.
     * The exposure type must be 'D' (direct) or 'I' (indirect).
     *
     * @param exposureType The exposure type to set.
     * @throws IllegalArgumentException If the exposure type is not D or I.
     */
    public void setExposureType(String exposureType) {
        if (exposureType.equals("D") || exposureType.equals("I")) {
            this.exposureType = exposureType;
        } else {
            throw new IllegalArgumentException("Exposure type must be 'D' (direct) or 'I' (indirect).");
        }
    }
    /**
     * retrieves the exposure type of this exposure event
     *
     * @return The exposure type, which can be D (direct) or I (indirect).
     */
    public String getExposureType() {
        return exposureType;
    }
    
    /**
     * Generates a string representation of the Exposure object.
     *
     * @return A string containing the patient ID, datetime, and exposure type of the event.
     */

    @Override
    public String toString() {
        return "Exposure{" +
                "patientId=" + patientId +
                ", datetime=" + datetime +
                ", exposureType='" + exposureType + '\'' +
                '}';
    }




	@Override
	public int hashCode() {
		return Objects.hash(datetime, patientId);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exposure other = (Exposure) obj;
		return Objects.equals(datetime, other.datetime) && Objects.equals(patientId, other.patientId);
	}
    

	
	

	
    
}
