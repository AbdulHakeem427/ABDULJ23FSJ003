package edu.disease.asn2;

import java.util.UUID;
/**
 * 
 * @author ABDUL HAKEEM
 * The ManagerForPatient interface represents a system for managing patients, their diseases, and exposures.
 * It provides methods to add patients, retrieve patient information, and associate diseases and exposures with patients.
 */
public interface ManagerForPatient {
	/**
     * Adds a new patient to the system with the specified information.
     *
     * @param firstName     The first name of the patient.
     * @param lastName      The last name of the patient.
     * @param maxDiseases   The maximum number of diseases the patient can have.
     * @param maxExposures  The maximum number of exposures the patient can have.
     * @return              The newly created Patient object.
     */
    public Patient addPatient(String firstName, String lastName, int maxDiseases, int maxExposures);

    /**
     * Retrieves a patient based on their unique patient ID.
     *
     * @param patientId     The unique identifier of the patient to retrieve.
     * @return              The Patient object associated with the given patient ID, or null if not found.
     */
    public Patient getPatient(UUID patientId);

    /**
     * Adds a disease to a patient's record.
     *
     * @param patientId     The unique identifier of the patient to add the disease to.
     * @param diseaseId     The unique identifier of the disease to add to the patient.
     */
    public void addDiseaseToPatient(UUID patientId, UUID diseaseId);

    /**
     * Adds an exposure event to a patient's record.
     *
     * @param patientId     The unique identifier of the patient to add the exposure to.
     * @param exposure      The Exposure object representing the exposure event to add.
     */
    public void addExposureToPatient(UUID patientId, Exposure exposure);
}
