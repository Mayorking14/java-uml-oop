package TestHospitalLineApp;

import HospitalLineApp.Doctor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DoctorTest {

    @Test
    void testDoctorDefaultAvailability() {
        Doctor doctor = new Doctor("Dr. John", "123-456", "Cardiology");
        assertTrue(doctor.isAvailable());
    }

    @Test
    void testSetAvailability() {
        Doctor doctor = new Doctor("Dr. John", "123-456", "Cardiology");
        doctor.setAvailability(false);
        assertFalse(doctor.isAvailable());
    }

    @Test
    void testGetDetails() {
        Doctor doctor = new Doctor("Dr. John", "123-456", "Cardiology");
        assertEquals("Dr. John Cardiology 123-456", doctor.getDetails());
    }
}


