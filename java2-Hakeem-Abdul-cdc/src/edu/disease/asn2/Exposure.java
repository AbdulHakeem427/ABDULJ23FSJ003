package edu.disease.asn2;

import java.util.Objects;
import java.util.UUID;



import java.time.LocalDateTime;

/**
 * @author ABDUL HAKEEM
 * The Exposure class represents information about a patient's exposure, including their ID,exposure datetime, and exposure type.
 */
public class Exposure {
    private UUID patientId;
    private LocalDateTime datetime;
    private String exposureType;

    /**
     * Constructs an  Exposure  object with the specified patient ID.
     *
     * @param patientId The ID of the patient.
     */
    public Exposure(UUID patientId) {
        this.patientId = patientId;
    }

    /**
     * Retrieves the patient's ID.
     *
     * @return The patient's ID.
     */
    public UUID getPatientId() {
        return patientId;
    }

    /**
     * Sets the patient's ID.
     *
     * @param patientId The ID of the patient.
     */
    public void setPatientId(UUID patientId) {
        this.patientId = patientId;
    }

    /**
     * Retrieves the exposure datetime.
     *
     * @return The exposure datetime.
     */
    public LocalDateTime getDatetime() {
        return datetime;
    }

    /**
     * Sets the exposure datetime.
     *
     * @param datetime The exposure datetime.
     */
    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }

    /**
     * Retrieves the exposure type.
     *
     * @return The exposure type ("D" for direct, "I" for indirect).
     */
    public String getExposureType() {
        return exposureType;
    }

    /**
     * Sets the exposure type.
     *
     * @param exposureType The exposure type ("D" for direct, "I" for indirect).
     * @throws IllegalArgumentException If exposure type is not "D" or "I".
     */
    public void setExposureType(String exposureType) throws IllegalArgumentException {
        if (exposureType.equals("D") || exposureType.equals("I")) {
            this.exposureType = exposureType;
        } else {
            throw new IllegalArgumentException("Exposure type must be D (direct) or I (indirect).");
        }
    }

    /**
     * Returns a string representation of the {@code Exposure} object.
     *
     * @return A string representation of the object.
     */
    @Override
    public String toString() {
        return "Exposure{" +
                "patientId=" + patientId +
                ", datetime=" + datetime +
                ", exposureType='" + exposureType + '\'' +
                '}';
    }

    /**
     * Computes the hash code for the Exposure based on its datetime and patientId.
     *
     * @return The hash code value for the Exposure.
     */
	@Override
	public int hashCode() {
		return Objects.hash(datetime, patientId);
	}
	/**
     * Compares this Exposure to the specified object for equality.
     *
     * @param obj The object to compare to.
     * @return  true, if the Exposures have the same datetime and patientId, otherwise false.
     */
	@Override
	public boolean equals(Object obj) {
		Exposure ex = (Exposure) obj;
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		
		if (ex.datetime == null && datetime != null) {
	        return false;
	    }
	    
	    if (!Objects.equals(ex.datetime, datetime)) {
	        return false;
	    }
	    if (!Objects.equals(ex.patientId, patientId)) {
	        return false;
	    }
	    
	    return true;
	}

}