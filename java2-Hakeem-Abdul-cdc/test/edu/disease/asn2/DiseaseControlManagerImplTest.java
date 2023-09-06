package edu.disease.asn2;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.UUID;

import org.junit.Before;
import org.junit.Test;

public class DiseaseControlManagerImplTest {
	
	
	private DiseaseControlManagement manager;

    @Before
    public void setUp() {
        manager = new DiseaseControlManagement(4, 4 );// Set appropriate array sizes
        assertNotNull(manager);
    }
    
    @Test
    public void checkConsIfBothTheNegative() {
    	assertThrows(IllegalArgumentException.class, () -> {
			manager = new DiseaseControlManagement(-5, -10);
		});
    	
    	
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void checkConsIfPatientsIsZero() {
    	
    	manager=new DiseaseControlManagement(4, 0);
    	
    }
    
    @Test
    public void testAddDiseaseNonInfectious() {
        Disease disease = manager.addDisease("Cancer", false);
        assertNotNull(disease);
        assertEquals("Cancer", disease.getName());
    }

    @Test
    public void testAddDiseaseInfectious() {
        Disease disease = manager.addDisease("COVID-19", true);
        assertNotNull(disease);
        assertEquals("COVID-19", disease.getName());
    }

    
    
    @Test(expected = IllegalStateException.class)
    public void testAddDiseaseArrayFull() {
        // Fill up the diseases array
        for (int i = 0; i < 4; i++) {
            manager.addDisease("Disease " + i, true);
        }
        
        // Adding one more disease should throw an exception
        manager.addDisease("Overflow Disease", true);
    }

    @Test
    public void testGetDiseaseExisting() {
        Disease fluDisease = manager.addDisease("Flu", true);
        Disease retrievedDisease = manager.getDisease(fluDisease.getDiseaseId());

        assertNotNull(retrievedDisease);
        assertEquals(fluDisease.getDiseaseId(), retrievedDisease.getDiseaseId());
    }

    @Test
    public void testGetDiseaseNonExisting() {
        UUID randomUUID = UUID.randomUUID();
        Disease retrievedDisease = manager.getDisease(randomUUID);
        assertNull(retrievedDisease);
    }
    
    @Test
    public void testGetDiseaseWhenDiseaseNotExists() {
        Disease fluDisease = manager.addDisease("Flu", true);

        Disease retrievedDisease = manager.getDisease(UUID.randomUUID());
        assertNull(retrievedDisease);
    }
  
    @Test
    public void testAddPatientAndGetPatient() {
    	manager = new DiseaseControlManagement(4, 3 );
        Patient patient = manager.addPatient("John", "Doe", 5, 3);
        assertNotNull(patient);
        System.out.println("First Name : "+patient.getFirstName());
        assertEquals("John", patient.getFirstName());
        System.out.println("Last Name : "+patient.getLastName());
        assertEquals("Doe", patient.getLastName());
        UUID patientId = patient.getPatientId();
        System.out.println("Patient :"+patientId);
        Patient retrievedPatient = manager.getPatient(patientId);
        System.out.println("Retrieve "+retrievedPatient);
        assertNotNull(retrievedPatient);
        assertEquals(patientId, retrievedPatient.getPatientId());      		
    
    }
    
  
    @Test
    public void testGetPatientWhenPatientExists() {
        Patient patient1 = manager.addPatient("John", "Doe", 5, 3);
        Patient patient2 = manager.addPatient("Jane", "Smith", 4, 2);
     
        System.out.println(patient1+".............."+patient2);

        Patient retrievedPatient1 = manager.getPatient(patient1.getPatientId());
        Patient retrievedPatient2 = manager.getPatient(patient2.getPatientId());

        
        assertNotNull(retrievedPatient1);
        assertEquals(patient1.getPatientId(), retrievedPatient1.getPatientId());
      //  System.out.println("retrived 1"+retrievedPatient1.getPatientId()+".......1........."+patient1.getPatientId());

        assertNotNull(retrievedPatient2);
        assertEquals(patient2.getPatientId(), retrievedPatient2.getPatientId());
        //System.out.println("retrived 2"+retrievedPatient2.getPatientId()+".........2........ "+patient2.getPatientId());
    }

    @Test
    public void testGetPatientWhenPatientNotExists() {
        Patient patient = manager.addPatient("John", "Doe", 5, 3);

        Patient retrievedPatient = manager.getPatient(UUID.randomUUID());
        assertNull(retrievedPatient);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAddPatientFullArray() {
        // Fill the patient array to its capacity
    	manager.addPatient("John", "Doe", 2, 3);
    	manager.addPatient("Jane", "Smith", 2, 3);
    	manager.addPatient("Alice", "Johnson", 2, 3);
    	manager.addPatient("Ababa","noe", 2, 3);
        // Adding one more patient should throw an IllegalStateException
    	manager.addPatient("Bob", "Brown", 2, 3);
    }
    
    
    @Test
    public void testGetPatientNotFound() {
        UUID patientId = UUID.randomUUID();
        Patient retrievedPatient = manager.getPatient(patientId);
        assertNull(retrievedPatient);
    }
    
    
    
    @Test
    public void testAddDiseaseToPatient() {
        Patient patient = manager.addPatient("John", "Doe", 5, 3);
        Disease disease = manager.addDisease("Flu", true);

        manager.addDiseaseToPatient(patient.getPatientId(), disease.getDiseaseId());
        
        System.out.println("Patient : "+patient.getFirstName()+" "+patient.getLastName());
        System.out.println("has DISEASE flu   "+patient.hasDisease(disease.getDiseaseId()));
        
        assertTrue(patient.hasDisease(disease.getDiseaseId())); // Check if disease is added to the patient
    }
    
    @Test
    public void testAddDiseaseToPatient2() {
        Disease disease = manager.addDisease("Flu", true);
        Patient patient = manager.addPatient("Jane", "Smith", 2, 3);
        assertNotNull(disease);
        assertNotNull(patient);

        manager.addDiseaseToPatient(patient.getPatientId(), disease.getDiseaseId());
        assertTrue(patient.hasDisease(disease.getDiseaseId()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDiseaseToPatientWithInvalidPatientId() {
        Disease disease = manager.addDisease("Flu", true);

        // Try adding disease to a patient with an invalid ID, should throw an exception
        manager.addDiseaseToPatient(UUID.randomUUID(), disease.getDiseaseId());
            
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAddDiseaseToPatientWithInvalidDiseaseId() {
        Patient patient = manager.addPatient("John", "Doe", 5, 3);

        // Try adding an invalid disease ID to a patient, should throw an exception
        manager.addDiseaseToPatient(patient.getPatientId(), UUID.randomUUID());
    }
  
    @Test
    public void testAddExposureToExistingPatient() {
        // Create a patient and add them to the manager
        Patient patient = manager.addPatient("Bob", "Brown", 5, 5);
        assertNotNull(patient);

        // Create an exposure
        Exposure exposure = new Exposure(patient.getPatientId());
        assertNotNull(exposure);

        // Add the exposure to the patient
        manager.addExposureToPatient(patient.getPatientId(), exposure);

        // Verify that the exposure is associated with the patient
        Exposure[] patientExposures = patient.getExposures();
        assertNotNull(patientExposures);
        boolean found = false;
        for (Exposure exp : patientExposures) {
            if (exp != null && exp.equals(exposure)) {
                found = true;
                break;
            }
        }
        assertTrue(found);
    }
    
   

    @Test(expected = IllegalArgumentException.class)
    public void testAddExposureToNonExistentPatient() {
        // Try to add an exposure to a patient that does not exist in the manager
        UUID nonExistentPatientId = UUID.randomUUID();
        Exposure exposure = new Exposure(nonExistentPatientId);
     
        manager.addExposureToPatient(nonExistentPatientId, exposure);
    }
    
    @Test
    public void testAddExposureToPatientWithFullExposures() {
    	
        // Create a patient with a maximum number of exposures
        Patient patient = manager.addPatient("John", "Doe", 1, 1);
        assertNotNull(patient);

        // Create and add the maximum number of exposures
        for (int i = 0; i < patient.getCheckMaxExposures(); i++) {
            Exposure exposure = new Exposure(patient.getPatientId());
            manager.addExposureToPatient(patient.getPatientId(), exposure);
        }

        Exposure extraExposure = new Exposure(patient.getPatientId());
        manager.addExposureToPatient(patient.getPatientId(), extraExposure);
    }

    @Test
    public void testAddMultipleExposuresToSamePatient() {
        // Create a patient
        Patient patient = manager.addPatient("Alice", "Smith", 5, 3);
        assertNotNull(patient);

        // Create and add multiple exposures to the same patient
        for (int i = 0; i < 3; i++) {
            Exposure exposure = new Exposure(patient.getPatientId());
            manager.addExposureToPatient(patient.getPatientId(), exposure);
        }

        // Verify that all exposures are associated with the patient
        Exposure[] patientExposures = patient.getExposures();
    
        assertEquals(3, patientExposures.length);
    }

   
   ///////////////
   
}
