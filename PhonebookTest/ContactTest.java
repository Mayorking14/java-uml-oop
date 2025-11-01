package PhonebookTest;

import Phonebook.Contact;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class ContactTest {

        private Contact contact;

        @BeforeEach
        public void setUp() {
            contact = new Contact("Chibuzor", "123456");
        }


        @Test
        public void testToGetName() {
            contact.setName("Chibuzor");
            assertEquals("Chibuzor", contact.getName());

        }

        @Test
        public void testToGetPhoneNumber() {
            contact.setContact("12345");
            assertEquals("12345", contact.getContact());
        }

        @Test
        public void testThatContactContainsOnlyNumbers(){
            assertThrows(IllegalArgumentException.class, () -> contact.setContact("123@4t56"));
        }

        @Test
        public void testThatContactNotEmpty(){
        assertThrows(IllegalArgumentException.class, () -> contact.setContact(""));
        }

        @Test
        public void testThatNameCannotBeEmpty(){
            assertThrows(IllegalArgumentException.class, () -> contact.setName(""));
        }




}
