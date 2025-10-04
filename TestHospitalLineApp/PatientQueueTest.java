package TestHospitalLineApp;

import HospitalLineApp.Patient;
import HospitalLineApp.PatientQueue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatientQueueTest {

    @Test
    void testQueueStartsEmpty() {
        PatientQueue queue = new PatientQueue();
        assertEquals(0, queue.getQueueSize());
    }

    @Test
    void testAddPatientToQueue() {
        PatientQueue queue = new PatientQueue();
        Patient patient = new Patient("Alice", 30, "987-654", "Checkup");
        queue.addToQueue(patient);
        assertEquals(1, queue.getQueueSize());
    }
}

