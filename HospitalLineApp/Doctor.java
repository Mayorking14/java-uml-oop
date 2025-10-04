package HospitalLineApp;

public class Doctor {
        private String name;
        private String contactInfo;
        private String department;
        public boolean isAvailable;

        public Doctor(String name, String contact, String department) {
            this.name = name;
            this.contactInfo = contact;
            this.department = department;
            this.isAvailable = true;
        }

        public void setAvailability(boolean availability) {
            this.isAvailable = availability;
        }

        public String getDetails() {
            return name + " " + department + " " + contactInfo;
        }

        public boolean isAvailable() {
            return this.isAvailable;
        }
}



