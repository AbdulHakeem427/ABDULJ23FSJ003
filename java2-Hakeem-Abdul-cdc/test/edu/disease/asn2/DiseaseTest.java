package edu.disease.asn2;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.UUID;



public class DiseaseTest {

	 @Test
	    public void testSetAndGetForAllField() {
	        UUID diseaseId = UUID.randomUUID();
	        String name = "Influenza";

	        Disease disease = new NonInfectiousDisease(diseaseId, name);

	        // Test getters
	        assertEquals(diseaseId, disease.getDiseaseId());
	        assertEquals(name, disease.getName());

	        // Test setters
	        UUID newDiseaseId = UUID.randomUUID();
	        String newName = "COVID-19";

	        disease.setDiseaseId(newDiseaseId);
	        disease.setName(newName);

	        assertEquals(newDiseaseId, disease.getDiseaseId());
	        assertEquals(newName, disease.getName());
	    }  

    @Test
    public void testInfectiousDisease() {
        InfectiousDisease influenza = new InfectiousDisease(UUID.randomUUID(), "Influenza");

        assertTrue(influenza.isInfectious());
        assertArrayEquals(new String[]{"Influenza", "COVID-19", "Malaria", "Tuberculosis"}, influenza.getExamples());
    }

    @Test
    public void testNonInfectiousDisease() {
        NonInfectiousDisease diabetes = new NonInfectiousDisease(UUID.randomUUID(), "Diabetes");

        assertFalse(diabetes.isInfectious());
        assertArrayEquals(new String[]{"Diabetes", "Hypertension", "Asthma", "Cancer"}, diabetes.getExamples());
    }

   
    
    @Test
    public void testHashCode() {
        UUID diseaseId1 = UUID.randomUUID();
        UUID diseaseId2 = UUID.randomUUID();

        Disease disease1 = new NonInfectiousDisease(diseaseId1, "Diabetes");
        Disease disease2 = new NonInfectiousDisease(diseaseId1, "Hypertension");
        Disease disease3 = new NonInfectiousDisease(diseaseId2, "Diabetes");

        assertEquals(disease1.hashCode(), disease2.hashCode());
        assertNotEquals(disease1.hashCode(), disease3.hashCode());
    }

    @Test
    public void testEquals() {
        UUID diseaseId1 = UUID.randomUUID();
        UUID diseaseId2 = UUID.randomUUID();

        Disease disease1 = new NonInfectiousDisease(diseaseId1, "Diabetes");
        Disease disease2 = new NonInfectiousDisease(diseaseId1, "Hypertension");
        Disease disease3 = new NonInfectiousDisease(diseaseId2, "Diabetes");

        assertTrue(disease1.equals(disease2));
        assertFalse(disease1.equals(disease3));
    }
    
    
    @Test
    public void testHashCodeForInfectiousDisease() {
        UUID diseaseId1 = UUID.randomUUID();
        UUID diseaseId2 = UUID.randomUUID();

        Disease disease1 = new InfectiousDisease(diseaseId1, "COVID-19");
        Disease disease2 = new InfectiousDisease(diseaseId1, "Malaria");
        Disease disease3 = new InfectiousDisease(diseaseId2, "COVID-19");

        assertEquals(disease1.hashCode(), disease2.hashCode());
        assertNotEquals(disease1.hashCode(), disease3.hashCode());
    }

    @Test
    public void testEqualsForInfectiousDisease() {
        UUID diseaseId1 = UUID.randomUUID();
        UUID diseaseId2 = UUID.randomUUID();

        Disease disease1 = new NonInfectiousDisease(diseaseId1, "COVID-19");
        Disease disease2 = new NonInfectiousDisease(diseaseId1, "Malaria");
        Disease disease3 = new NonInfectiousDisease(diseaseId2, "COVID-19");

        assertTrue(disease1.equals(disease2));
        assertFalse(disease1.equals(disease3));
    }
    

    @Test
    public void testToStringForNonTnfectiousDisease() {
        UUID diseaseId = UUID.randomUUID();
        NonInfectiousDisease disease = new NonInfectiousDisease(diseaseId, "Malaria");

        assertEquals("Disease [diseaseId=" + disease.getDiseaseId() + ", name=Malaria]", disease.toString());
    }
    
    @Test
    public void testToStringForInfectious() {
        UUID diseaseId = UUID.randomUUID();
        InfectiousDisease disease = new InfectiousDisease(diseaseId, "Cancer");

        assertEquals("Disease [diseaseId=" + disease.getDiseaseId() + ", name=Cancer]", disease.toString());
    }
    

    
}


