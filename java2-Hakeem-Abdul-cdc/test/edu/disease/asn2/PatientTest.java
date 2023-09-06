  package edu.disease.asn2;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.UUID;

import org.junit.Before;
import org.junit.Test;



public 	class PatientTest {
		private Patient patient;
			
			private static final String FIRST_NAME = "firstName";
			
			private static final String LAST_NAME = "lastName";
			
			private Exposure exposure;
			
			public  UUID diseaseIds;

			@Before
			public void setUp() {
				final UUID uuid = UUID.randomUUID();
				exposure = new Exposure(uuid);
				exposure.setDatetime(LocalDateTime.now());
				exposure.setExposureType("D");
				patient = new Patient(2,1);
				patient.setDiseaseIds(new UUID[] {UUID.randomUUID(), UUID.randomUUID()});
				patient.setExposures(new Exposure[] {exposure});
				patient.setFirstName(FIRST_NAME);
				patient.setLastName(LAST_NAME);
				patient.setPatientId(uuid);
			}
			@Test
			public void testPatientPostiveScenario()
			{
				assertNotNull(patient.toString());
				assertNotNull(patient.getDiseaseIds());
				assertNotNull(patient.getExposures());
				assertNotNull(patient.getFirstName());
				assertNotNull(patient.getLastName());
				assertNotNull(patient.hashCode());
				assertNotNull(patient.getPatientId());
				final Patient patientObj = patient;
				assertTrue(patient.equals(patientObj));
				assertTrue(patient.equals(patient));
				assertFalse(patient.equals(null));
				final Patient patientObjEquals = new Patient(1,1);
				patientObjEquals.setPatientId(patient.getPatientId());
				assertTrue(patient.equals(patientObjEquals));
				assertFalse(patient.equals(null));
				patientObjEquals.setPatientId(null);
				assertFalse(patient.equals(patientObjEquals));
				
			}
			
					
//			@Test
//		    public void testCompareTo_NoFirstNames() {
//		        Patient patient1 = new Patient(4,4);
//		      
//		        patient1.setPatientId(UUID.randomUUID());
//		        patient1.setLastName("Doe");
//
//		        Patient patient2 = new Patient(4,4);
//		        patient2.setPatientId(UUID.randomUUID());
//		     
//		        patient2.setLastName("jone");
//
//		        assertTrue(patient1.compareTo(patient2) == 0);
//		    }
//
//		    @Test
//		    public void testCompareTo_DifferentFirstNames() {
//		        Patient patient1 = new Patient(4,4);
//		        patient1.setFirstName("Alice");
//		        patient1.setLastName("Smith");
//
//		        Patient patient2 = new Patient(4,4);
//		        patient2.setFirstName("Bob");
//		        patient2.setLastName("Smith");
//
//		        assertEquals(-1, patient1.compareTo(patient2));
//		        assertEquals(1, patient2.compareTo(patient1));
//		    }
//
//		    @Test
//		    public void testCompareTo_DifferentLastNames() {
//		        Patient patient1 = new Patient(4,4);
//		        patient1.setFirstName("Alice");
//		        patient1.setLastName("Smith");
//
//		        Patient patient2 = new Patient(5,5);
//		        patient2.setFirstName("Alice");
//		        patient2.setLastName("Johnson");
//		        
//		        int compResult = patient1.compareTo(patient2);
//		        System.out.println(compResult);
//		        int compResult2=patient2.compareTo(patient1);
//		        System.out.println(compResult2);
//		        assertEquals(9, compResult);
//		        assertEquals(-9, compResult2);
//		    }
//
//		    @Test
//		    public void testCompareTo_CaseInsensitive() {
//		        Patient patient1 = new Patient(4,4);
//		        patient1.setFirstName("Alice");
//		        patient1.setLastName("Smith");
//
//		        Patient patient2 = new Patient(4,4);
//		        patient2.setFirstName("aLiCe");
//		        patient2.setLastName("sMiTh");
//		        
//		        System.out.println(patient1.compareTo(patient2));
//		        System.out.println(patient2.compareTo(patient1));
//		        assertEquals(0, patient1.compareTo(patient2));
//		        assertEquals(0, patient1.compareTo(patient1));
//		    }
			
			@Test
		    public void testCompareTo_SameLastName() {
		        Patient patient1 = new Patient(2, 2);
		        patient1.setFirstName("Alice");
		        patient1.setLastName("Doe");
		        
		        Patient patient2 = new Patient(2, 2);
		        patient2.setFirstName("John");
		        patient2.setLastName("Doe");
		        
		        int result = patient1.compareTo(patient2);
		        System.out.println("Result .....:"+result);
		        assertTrue(result < 0); // Expecting a negative value because "John" comes before "Alice"
		    }

		    @Test
		    public void testCompareTo_SameFirstName() {
		    	Patient patient1 = new Patient(2, 2);
		        patient1.setFirstName("Alice");
		        patient1.setLastName("Johnson");
		        
		        Patient patient2 = new Patient(2, 2);
		        patient2.setFirstName("Alice");
		        patient2.setLastName("Smith");
		        
		        int result = patient1.compareTo(patient2);
		        System.out.println("Result 2 .....:"+result);
		        assertTrue(result < 0); // Expecting a negative value because "Smith" comes before "Johnson"
		    }

		    @Test
		    public void testCompareTo_SameFullName() {
		        Patient patient1 = new Patient(2, 2);
		        patient1.setFirstName("John");
		        patient1.setLastName("Doe");
		        
		        Patient patient2 = new Patient(2, 2);
		        patient2.setFirstName("John");
		        patient2.setLastName("Doe");
		        
		        int result = patient1.compareTo(patient2);
		        
		        assertEquals(0, result); // Expecting 0 because both names are the same
		    }

		    @Test
		    public void testCompareTo_NullNames() {
		        Patient patient1 = new Patient(2, 2);
		        patient1.setFirstName(null);
		        patient1.setLastName(null);
		        
		        Patient patient2 = new Patient(2, 2);
		        patient2.setFirstName(null);
		        patient2.setLastName(null);
		        
		        int result = patient1.compareTo(patient2);
		        
		        assertEquals(0, result); // Expecting 0 because both names are null
		    }
			
			@Test
			public void testAddDisease()
			{
			    final Patient patientTest = new Patient(3,3);
			    patientTest.addDiseaseId(UUID.randomUUID());
			    patientTest.addDiseaseId(UUID.randomUUID());
			    patientTest.addDiseaseId(UUID.randomUUID());
			    System.out.println(patientTest.getDiseaseIds()[0]);
				assertEquals(3, patientTest.getDiseaseIds().length);
			}
			
			
			@Test
		    public void testAddDiseaseId() {
				Patient patient=new Patient(4, 4);
		        UUID diseaseId1 = UUID.randomUUID();
		        UUID diseaseId2 = UUID.randomUUID();
		        
		        patient.addDiseaseId(diseaseId1);
		        assertEquals(diseaseId1,patient.getDiseaseIds()[0]);
		        
		        patient.addDiseaseId(diseaseId2);
		        assertEquals(diseaseId2, patient.getDiseaseIds()[1]);
		    }
			
			
		    
		    @Test()
		    public void testAddDiseaseIdArrayFull() {
		    	Patient patient=new Patient(4, 4);
		        // Fill up the array
		        for (int i = 0; i < patient.getDiseaseIds().length; i++) {
		        	patient.addDiseaseId(UUID.randomUUID());
		        }
		        
		        // Adding one more should throw an exception
		        patient.addDiseaseId(UUID.randomUUID());
		    }
			
			@Test
			public void testAddExposure()
			{
			    final Patient patientTest = new Patient(3,3);
			    patientTest.addExposure(exposure);
			    patientTest.addExposure(exposure);
			    patientTest.addExposure(exposure);
			    System.out.println(patientTest.getExposures()[0]);
				assertEquals(3, patientTest.getExposures().length);
			}
			
			
			@Test
			
			public void testAddDisease2(){
				Patient patient=new Patient(5, 1);
				UUID diseaseId = UUID.randomUUID();
		        patient.addDiseaseId(diseaseId);
		        assertArrayEquals(new UUID[]{diseaseId, null, null, null, null}, patient.getDiseaseIds());
		        
			}
			
			@Test
			public void testAddExposureException()
			{
				patient.addExposure(exposure);
			}
			
			@Test
			public void testExceptionPatient()
			{
				Patient patientTest = new Patient(4, 4);
				
				
			}
			@Test(expected = IllegalArgumentException.class)
			public void testExceptionPatient2()
			{
				Patient patientTest = new Patient(-1, -1);
				
				
			}
			@Test(expected = IllegalArgumentException.class)
			public void testExceptionPatient3()
			{
				Patient patientTest = new Patient(-1, 0);
				
				
			}
			
			@Test
		    public void testGetCheckMaxDiseasesReturnsCorrectValue() {
		        int maxDiseases = 3; // Example maxDiseases value
		        patient = new Patient(maxDiseases, 3);

		        assertEquals(maxDiseases, patient.getCheckMaxDiseases());
		    }

		    @Test
		    public void testGetCheckMaxExposuresReturnsCorrectValue() {
		        int maxExposures = 2; // Example maxExposures value
		        patient = new Patient(3, 2);
		        
		        System.out.println("Lets check the no. of exposyres"+patient.getCheckMaxExposures());

		        assertEquals(maxExposures, patient.getCheckMaxExposures());
		    }
		    
		    
		    ///////////////
		    @Test
		    public void testHasDiseaseReturnsTrueForExistingDisease() {
		    	patient = new Patient(3, 2);
		    	UUID existingDiseaseId = UUID.randomUUID();
		    	
		        patient.addDiseaseId(existingDiseaseId);

		        boolean hasDisease = patient.hasDisease(existingDiseaseId);

		        assertTrue(hasDisease);
		    }
		    @Test
		    public void testHasDiseaseReturnsFalseForNonExistingDisease() {
		        UUID nonExistingDiseaseId = UUID.randomUUID();

		        assertFalse(patient.hasDisease(nonExistingDiseaseId));
		    }
		    
		    
		   
		    @Test
		    public void testHasExposureReturnsTrueForExistingExposure() {
		        Exposure existingExposure = new Exposure(patient.getPatientId());
		        existingExposure.setDatetime(LocalDateTime.now());
		        existingExposure.setExposureType("D"); // Set the exposure type

		        patient.addExposure(existingExposure);
		        System.out.println( "Lets check......"+patient.hasExposure(existingExposure));

		        assertFalse(patient.hasExposure(existingExposure));
		    }

		    @Test
		    public void testHasExposureReturnsFalseForNonExistingExposure() {
		        Exposure nonExistingExposure = new Exposure(UUID.randomUUID());
		        nonExistingExposure.setDatetime(LocalDateTime.now());
		        nonExistingExposure.setExposureType("D"); // Set the exposure type

		        assertFalse(patient.hasExposure(nonExistingExposure));
		    }
	  
}


		
