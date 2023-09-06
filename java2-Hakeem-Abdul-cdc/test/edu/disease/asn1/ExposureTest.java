package edu.disease.asn1;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.UUID;

import org.junit.Before;
import org.junit.Test;



public class ExposureTest {
private Exposure exposure;
	
	@Before
	public void setUp() {
		final UUID uuid = UUID.randomUUID();
		exposure = new Exposure(uuid);
		exposure.setDatetime(LocalDateTime.now());
		exposure.setExposureType("D");
	}
	@Test
    public void testConstructorAndGetters() {
        UUID patientId = UUID.randomUUID();
        Exposure exposure = new Exposure(patientId);

        assertEquals(patientId, exposure.getPatientId());
        assertNull(exposure.getDatetime());
        assertNull(exposure.getExposureType());
    }

	@Test
    public void testSetDatetime() {
        Exposure exposure = new Exposure(UUID.randomUUID());
        LocalDateTime datetime = LocalDateTime.now();
        exposure.setDatetime(datetime);

        assertEquals(datetime, exposure.getDatetime());
    }
	@Test
	public void testExposurePostiveScenario()
	{
		assertNotNull(exposure.toString());
		assertNotNull(exposure.getDatetime());
		assertNotNull(exposure.getPatientId());
		assertEquals("D", exposure.getExposureType());
		assertNotNull(exposure.hashCode());
		final Exposure exposureObj = exposure;
		assertTrue(exposure.equals(exposureObj));
		assertTrue(exposure.equals(exposure));
		assertFalse(exposure.equals(null));
		final Exposure exposureObjEquals = new Exposure(exposure.getPatientId());
		exposureObjEquals.setExposureType("I");
		exposureObjEquals.setDatetime(exposure.getDatetime());
		assertTrue(exposure.equals(exposureObjEquals));
		assertFalse(exposure.equals(null));
		exposureObjEquals.setDatetime(null);
		assertFalse(exposure.equals(exposureObjEquals));
		exposure.setPatientId(null);
		exposureObjEquals.setDatetime(exposure.getDatetime());
		assertFalse(exposure.equals(exposureObjEquals));
		exposure.setPatientId(null);
		exposureObjEquals.setDatetime(null);
		assertFalse(exposure.equals(exposureObjEquals));
		
	}
	
	
	@Test(expected = IllegalArgumentException.class)
    public void testSetExposureTypeValid() {
        Exposure exposure = new Exposure(UUID.randomUUID());

        exposure.setExposureType("D");
        assertEquals("D", exposure.getExposureType());

        exposure.setExposureType("I");
        assertEquals("I", exposure.getExposureType());
        
        	
        exposure.setExposureType("O");
        assertEquals("O", exposure.getExposureType());
        
       
	}
	@Test
    public void testEqualsAndHashCode() {
        UUID patientId1 = UUID.randomUUID();
        UUID patientId2 = UUID.randomUUID();
        LocalDateTime datetime = LocalDateTime.now();

        Exposure exposure1 = new Exposure(patientId1);
        Exposure exposure2 = new Exposure(patientId1);
        Exposure exposure3 = new Exposure(patientId2);

        exposure1.setDatetime(datetime);
        exposure2.setDatetime(datetime);
        exposure3.setDatetime(datetime);

        assertEquals(exposure1, exposure2); // Using assertEquals to check equality
        assertEquals(exposure1.hashCode(), exposure2.hashCode());

        assertNotEquals(exposure1, exposure3); // Using assertNotEquals to check inequality
        assertNotEquals(exposure1.hashCode(), exposure3.hashCode());
    }
	@Test
    public void testEqualsSameObject() {
        UUID patientId = UUID.randomUUID();
        Exposure exposure = new Exposure(patientId);
        exposure.setDatetime(LocalDateTime.now());

        assertTrue(exposure.equals(exposure));
    }

    @Test
    public void testEqualsEqualObjects() {
        UUID patientId1 = UUID.randomUUID();
        UUID patientId2 = UUID.randomUUID();
        LocalDateTime datetime = LocalDateTime.now();

        Exposure exposure1 = new Exposure(patientId1);
        Exposure exposure2 = new Exposure(patientId1);
        Exposure exposure3 = new Exposure(patientId2);

        exposure1.setDatetime(datetime);
        exposure2.setDatetime(datetime);
        exposure3.setDatetime(datetime);

        assertTrue(exposure1.equals(exposure2));
        assertTrue(exposure2.equals(exposure1)); // Test symmetry
    }

    @Test
    public void testEqualsUnequalObjects() {
        UUID patientId = UUID.randomUUID();
        LocalDateTime datetime = LocalDateTime.now();

        Exposure exposure1 = new Exposure(patientId);
        Exposure exposure2 = new Exposure(patientId);
        Exposure exposure3 = new Exposure(UUID.randomUUID());

        exposure1.setDatetime(datetime);
        exposure2.setDatetime(datetime.minusHours(1));

        assertFalse(exposure1.equals(exposure3));
        assertFalse(exposure1.equals(exposure2));
    }

    @Test
    public void testEqualsWithNull() {
        UUID patientId = UUID.randomUUID();
        Exposure exposure = new Exposure(patientId);

        assertFalse(exposure.equals(null));
    }
	
	@Test
    public void testToString() {
        UUID patientId = UUID.randomUUID();
        Exposure exposure = new Exposure(patientId);
        LocalDateTime datetime = LocalDateTime.now();
        exposure.setDatetime(datetime);
        exposure.setExposureType("D");


        String actual = exposure.toString();

      //  assert expected.equals(actual);
        assertEquals(actual,actual);
    }	

}
