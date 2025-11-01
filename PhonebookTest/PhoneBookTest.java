package PhonebookTest;

import Phonebook.Contact;
import Phonebook.phonebook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {

    private phonebook phoneList;
    private Contact contact;
    private Contact contact1;

    @BeforeEach
    public void setUp(){
        phoneList = new phonebook();
        contact = new Contact("adam", "12345");
        contact1 = new Contact("chibuzor", "123t45");
    }

    @Test
    public void testAddContact(){
        Contact contact3 = new Contact("chi", "123456");
        phoneList.addContact(contact);
        phoneList.addContact(contact1);
        phoneList.addContact(contact3);
        assertEquals(3, phoneList.getSize());
    }

    @Test
    public void testToFindContactByName(){
        phoneList.addContact(contact);
        phoneList.addContact(contact1);
        assertEquals("12345", phoneList.findContactByName("adam"));
    }

    @Test
    public void testToDeleteContact(){
        Contact contact3 = new Contact("adams", "12345");
        phoneList.addContact(contact);
        phoneList.addContact(contact1);
        phoneList.addContact(contact3);
        phoneList.deleteContact("adam");
        assertEquals(1, phoneList.getSize());
        assertNull(null,phoneList.findContactByName("adam"));
    }

    @Test
    public void testToGetNumbersOfContacts(){
        phoneList.addContact(contact);
        phoneList.addContact(contact1);
        ArrayList<Contact> allContacts = phoneList.displayAllContacts();
        assertSame(phoneList.displayAllContacts(),  allContacts);
    }


}
