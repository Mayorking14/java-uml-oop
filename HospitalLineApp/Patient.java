package HospitalLineApp;

public class Patient {
    private String name;
    private int age;
    private String contactInfo;
    private String visitPurpose;

    public Patient(String name, int age, String contactInfo, String visitPurpose) {
        this.name = name;
        this.age = age;
        this.contactInfo = contactInfo;
        this.visitPurpose = visitPurpose;
    }

    public String getDetails() {
        return name + ", Age: " + age + ", Reason: " + visitPurpose;
    }
}


