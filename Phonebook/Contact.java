package Phonebook;

public class Contact {

    private String name;
    private String contact;


    public Contact(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public void setName(String name) {
        if (name.isEmpty()){
            throw new IllegalArgumentException("Name field cannot be empty");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setContact(String contact) {

        if (contact.isEmpty()){
            throw new IllegalArgumentException("contact must not be empty");
        }

        else if(!contact.matches("\\d+")){
            throw new IllegalArgumentException("contact must contain digits only");
        }
        this.contact = contact;
    }

    public String getContact() {
        return contact;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Contact: " + contact;
    }
}
