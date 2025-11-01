package Phonebook;

import java.util.ArrayList;

public class phonebook {

    private ArrayList<Contact> contacts =  new ArrayList<>();


    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }

    public int getSize(){
       return this.contacts.size();
    }


    public String findContactByName(String name) {
        for (Contact contact : this.contacts) {
            if(contact.getName().equals(name)){
                return contact.getContact();
            }
        }
        return "contact not found";
    }

    public void deleteContact(String name) {
//        for (Contact phoneNumber : this.contacts) {
//            if(phoneNumber.getName().equals(name)){
//                this.contacts.remove(phoneNumber);
//            }
//        }
        this.contacts.removeIf(phoneNumber -> phoneNumber.getName().equals(name));
    }


    public ArrayList<Contact> displayAllContacts() {
        return contacts;
    }
}
