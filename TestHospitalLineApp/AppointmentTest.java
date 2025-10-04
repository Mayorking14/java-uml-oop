package TestHospitalLineApp;

import HospitalLineApp.Appointment;
import HospitalLineApp.Doctor;
import HospitalLineApp.Patient;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppointmentTest {

    @Test
    void testDefaultStatusIsScheduled() {
        Doctor doctor = new Doctor("Dr. John", "123-456", "Cardiology");
        Patient patient = new Patient("Alice", 30, "987-654", "Checkup");
        Appointment appointment = new Appointment(doctor, patient, "2025-10-04 10:00");

        assertEquals("Scheduled", appointment.getStatus());
    }

    @Test
    void testChangeStatus() {
        Doctor doctor = new Doctor("Dr. John", "123-456", "Cardiology");
        Patient patient = new Patient("Alice", 30, "987-654", "Checkup");
        Appointment appointment = new Appointment(doctor, patient, "2025-10-04 10:00");

        appointment.setStatus("Seen");
        assertEquals("Seen", appointment.getStatus());
    }
}

