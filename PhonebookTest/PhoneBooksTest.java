package PhonebookTest;

import Phonebook.Contact;
import Phonebook.PhoneBook;
import Phonebook.PhoneBooks;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBooksTest {

    private PhoneBooks phoneBooks;
    private PhoneBook phonebook;
    private PhoneBook phoneBook2;
    private Contact contact;
    private Contact contact1;
    private Contact contact2;

    @BeforeEach
    public void setUp() {
        phoneBooks = new PhoneBooks();
        phonebook = new PhoneBook();
        phoneBook2 = new PhoneBook();
        contact = new Contact("Ikuku", "091638627");
        contact1 = new Contact("Ezemwo", "0916372973");
        contact2 = new Contact("Amadioha", "0802726200");
    }

    @Test
    public void testAddPhoneBookToPhoneBooks() {
        phonebook.addContact(contact);
        phonebook.addContact(contact1);
        phonebook.addContact(contact2);
        phoneBooks.addPhonebook("Bad people", phonebook);
        assertEquals(1, phoneBooks.getSize());
    }

    @Test
    public void testFindPhoneBookByName() {
        phonebook.addContact(contact);
        phonebook.addContact(contact1);
        phonebook.addContact(contact2);
        Contact contact3 = new Contact("Femi Shiifu", "070362737");
        Contact contact4 = new Contact("Ebuka", "08023540");
        Contact contact5 = new Contact("Chiamaka", "0802234500");
        phoneBook2.addContact(contact3);
        phoneBook2.addContact(contact4);
        phoneBook2.addContact(contact5);

        phoneBooks.addPhonebook("Bad people", phonebook);
        phoneBooks.addPhonebook("Good people", phoneBook2);
        assertEquals(phoneBook2, phoneBooks.findPhoneBookByName("Good people"));
    }

    @Test
    public void testToDeletePhoneBook(){
        phonebook.addContact(contact);
        phonebook.addContact(contact1);
        phonebook.addContact(contact2);
        Contact contact3 = new Contact("Femi Shiifu", "070362737");
        Contact contact4 = new Contact("Ebuka", "08023540");
        Contact contact5 = new Contact("Chiamaka", "0802234500");
        phoneBook2.addContact(contact3);
        phoneBook2.addContact(contact4);
        phoneBook2.addContact(contact5);

        phoneBooks.addPhonebook("Bad people", phonebook);
        phoneBooks.addPhonebook("Good people", phoneBook2);
        phoneBooks.deletePhoneBok("Bad people");
        assertEquals(1, phoneBooks.getSize());

        }







    }


