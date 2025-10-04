package HospitalLineApp;

import java.util.ArrayList;

public class PatientQueue {
    private ArrayList<Patient> patients;

    public PatientQueue() {
        patients = new ArrayList<>();
    }

    public void addToQueue(Patient patient) {
        patients.add(patient);
    }

    public int getQueueSize() {
        return patients.size();
    }

    public Patient getNextPatient() {
        if (patients.isEmpty()) {
            return null;
        }
        return patients.get(0);
    }

    public void removeNextPatient() {
        if (!patients.isEmpty()) {
            patients.remove(0);
        }
    }
}