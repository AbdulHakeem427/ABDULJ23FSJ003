package edu.disease.asn2;

import java.util.UUID;
/**
 * @author ABDUL HAKEEM
 * 
 * The DiseaseControlManagement class implements interfaces for managing diseases and patients,
 * as well as adding diseases and exposures to patients.
 */

public class DiseaseControlManagement implements ManagerForDisease ,ManagerForPatient  {
	
	private Disease[] diseases;
	private Patient[] patients;
	private int diseaseCount;
	private int patientCount;
	
	/**
     * Constructs a DiseaseControlManagement object with the specified maximum numbers of diseases and patients.
     *
     * @param maxDiseases Maximum number of diseases.
     * @param maxPatients Maximum number of patients.
     * @throws IllegalArgumentException If maxDiseases or maxPatients is not greater than 0.
     */
	
	public DiseaseControlManagement(int maxDiseases,int maxPatients) {
		if (maxDiseases <= 0 || maxPatients <= 0) {
            throw new IllegalArgumentException("Maximum diseases and patients must be greater than 0.");
        }
        diseases = new Disease[maxDiseases];
        patients = new Patient[maxPatients];
        this.diseaseCount=0;
        this.patientCount=0;
	}
	
	/**
     * Adds a new disease to the management system.
     *
     * @param name       Name of the disease.
     * @param infectious Indicates whether the disease is infectious or not.
     * @return The newly added Disease object.
     * @throws IllegalStateException If the maximum number of diseases has been reached.
     */
	@Override
	public Disease addDisease(String name, boolean infectious) {
		// TODO Auto-generated method stub
		if (isDiseasesArrayFull()) {
            throw new IllegalStateException("Cannot add more diseases. The array is full.");
        }
		 UUID diseaseId = UUID.randomUUID();
        Disease newDisease;
        if (infectious) {
            newDisease = new InfectiousDisease(diseaseId,name); // Create an instance of InfectiousDisease
        } else {
            newDisease = new NonInfectiousDisease(diseaseId,name); // Create an instance of NonInfectiousDisease
        }

        newDisease.setName(name); // Set the disease name
        newDisease.setDiseaseId(UUID.randomUUID()); 
       
        diseases[diseaseCount] = newDisease; // Add the disease to the array
        diseaseCount++; // Increment the disease count

        return newDisease;
	
	}
	public boolean isDiseasesArrayFull() {
        for (Disease disease : diseases) {
            if (disease == null) {
                return false;
            }
        }
        return true;
    }
	
	
	/**
     * Retrieves a disease based on its unique ID.
     *
     * @param diseaseId The unique ID of the disease.
     * @return The Disease object matching the specified diseaseId, or null if not found.
     */
	@Override
    public Disease getDisease(UUID diseaseId) {
        for (int i = 0; i < diseaseCount; i++) {
            if (diseases[i].getDiseaseId().equals(diseaseId)) {
                Disease retrievedDisease = diseases[i];
                diseases = null; // Clear the reference
                return retrievedDisease;// Return the disease if the IDs match
            }
        }

        System.out.println("Disease with UUID " + diseaseId + " not found.");
        return null;
    }
	
	/**
     * Adds a new patient to the management system.
     *
     * @param firstName :    first name of the patient.
     * @param lastName   :   last name of the patient.
     * @param maxDiseases :  maximum number of diseases a patient can have.
     * @param maxExposures : maximum number of exposures a patient can have.
     * @return The newly added Patient object.
     * @throws IllegalStateException If the maximum number of patients has been reached.
     */
	
	@Override
    public Patient addPatient(String firstName, String lastName, int maxDiseases, int maxExposures) {
        if (isPatientsArrayFull()) {
            throw new IllegalStateException("Cannot add more patients. The array is full.");
        }

        Patient newPatient = new Patient(maxDiseases, maxExposures);
        newPatient.setPatientId(UUID.randomUUID()); // Set a new patient ID
        newPatient.setFirstName(firstName);
        newPatient.setLastName(lastName);
        newPatient.setExposures(new Exposure[maxExposures]);
        newPatient.setDiseaseIds(new UUID[maxDiseases]);
        patients[patientCount] = newPatient; // Add the patient to the array
        patientCount++; // Increment the patient count

        return newPatient;
    }
	public boolean isPatientsArrayFull() {
        return patientCount >= patients.length;
    }
	
	/**
     * Retrieves a patient based on their unique ID.
     *
     * @param patientId The unique ID of the patient.
     * @return The Patient object matching the specified patientId, or null if not found.
     */

    @Override
    public Patient getPatient(UUID patientId) {
        for (Patient patient : patients) {
            if (patient != null && patient.getPatientId().equals(patientId)) {
                return patient; // Return the patient if the IDs match
            }
        }
        return null; // Return null if no matching patient is found
    }
    
    
    /**
     * Associates a disease with a patient.
     *
     * @param patientId The unique ID of the patient.
     * @param diseaseId The unique ID of the disease to be associated.
     * @throws IllegalArgumentException If patientId or diseaseId is not found.
     */
    @Override
    public void addDiseaseToPatient(UUID patientId, UUID diseaseId) {
        Patient patient = null;
        Disease disease = null;

        // Find the patient with the given ID
        for (Patient p : patients) {
            if (p != null && p.getPatientId().equals(patientId)) {
                patient = p;
                break;
            }
        }

        // Find the disease with the given ID
        for (Disease d : diseases) {
            if (d != null && d.getDiseaseId().equals(diseaseId)) {
                disease = d;
                break;
            }
        }

        // If patient or disease not found, throw an exception
        if (patient == null) {
            throw new IllegalArgumentException("Patient not found with the specified ID.");
        }
        if (disease == null) {
            throw new IllegalArgumentException("Disease not found with the specified ID.");
        }

        // Add the disease ID to the patient
        patient.addDiseaseId(diseaseId);
    }
    
    /**
     * Adds an exposure to a patient's record.
     *
     * @param patientId ,the unique ID of the patient.
     * @param exposure , the exposure object to be added.
     * @throws IllegalArgumentException ,If patientId is not found.
     */
    @Override
    public void addExposureToPatient(UUID patientId, Exposure exposure) {
        Patient patient = null;
        // Find the patient with the given ID
        for (Patient p : patients) {
            if (p != null && p.getPatientId().equals(patientId)) {
                patient = p;
                break;
            }
        }

        // If patient not found, throw an exception
        if (patient == null) {
            throw new IllegalArgumentException("Patient not found with the specified ID.");
        }

        // Add the exposure to the patient
        patient.addExposure(exposure);
    }
    
}
