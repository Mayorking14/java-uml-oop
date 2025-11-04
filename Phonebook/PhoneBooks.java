package Phonebook;

import java.util.HashMap;

public class PhoneBooks {

    private HashMap<String, PhoneBook> phoneBooks = new HashMap<>();

    public void addPhonebook(String name, PhoneBook phonebook) {
        phoneBooks.put(name, phonebook);
    }


    public int getSize() {
        return phoneBooks.size();
    }

    public PhoneBook findPhoneBookByName(String name) {
        for (String phoneBook : phoneBooks.keySet()) {
            if (phoneBook.equals(name)) {
                return phoneBooks.get(phoneBook);
            }
        }
        return null;
    }

    public void deletePhoneBok(String name) {
        if  (phoneBooks.containsKey(name)) {
            phoneBooks.remove(name);
        }

    }

    public HashMap<String, PhoneBook> displayPhoneBooks(){
        return phoneBooks;
    }

    @Override
    public String toString() {
        return "PhoneBooks{" + "phoneBooks=" + phoneBooks + '}';
    }
}