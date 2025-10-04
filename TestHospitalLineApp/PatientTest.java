package TestHospitalLineApp;

import HospitalLineApp.Patient;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatientTest {

    @Test
    void testGetDetails() {
        Patient patient = new Patient("Alice", 30, "987-654", "Checkup");
        assertEquals("Alice, Age: 30, Reason: Checkup", patient.getDetails());
    }
}




