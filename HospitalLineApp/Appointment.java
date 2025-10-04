package HospitalLineApp;

public class Appointment {
        private Doctor doctor;
        private Patient patient;
        private String appointmentTime;
        private String status;

        public Appointment(Doctor doctor, Patient patient, String appointmentTime) {
            this.doctor = doctor;
            this.patient = patient;
            this.appointmentTime = appointmentTime;
            this.status = "Scheduled";
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getStatus() {
            return status;
        }
}

