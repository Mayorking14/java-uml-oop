import Phonebook.Contact;
import Phonebook.PhoneBook;
import Phonebook.PhoneBooks;

import java.text.BreakIterator;
import java.util.Scanner;

public class Main {
    static PhoneBooks phoneBooks = new PhoneBooks();
    static PhoneBook phoneBook = new PhoneBook();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String option = "";
        while (!option.equals("6")) {
            System.out.print("PHONEBOOK MANAGER");
            System.out.println(""" 
                    
                    1. Create Contact
                    2. Add PhoneBook
                    3. Display PhoneBooks
                    4. Search PhoneBook
                    5. Delete Phonebook
                    6. Exit
                    """);
            System.out.print("Choose an option: ");
            option = input.next();

            switch (option) {
                case "1":
                    System.out.println("Enter Name: ");
                    String contactName = input.next();
                    System.out.print("Enter Phone Number: ");
                    String phoneNumber = input.next();
                    Contact contact = new Contact(contactName, phoneNumber);
                    phoneBook.addContact(contact);
                    System.out.println("contact created");
                    break;

                case "2":
                    System.out.println("Enter PhoneBookName: ");
                    String phoneBookName = input.next();
                    phoneBooks.addPhonebook(phoneBookName, phoneBook);
                    System.out.println(phoneBooks);
                    break;

                case "3":
                    System.out.println("List of Phonebooks");
                    System.out.print(phoneBooks.displayPhoneBooks());
                    break;

                case "4":
                    System.out.println("Enter PhoneBookName: ");
                    String phoneBook = input.next();
                    phoneBooks.findPhoneBookByName(phoneBook);
                    System.out.println(phoneBooks);
                    break;

               case "5":
                   System.out.println("Enter PhoneBookName: ");
                   String phoneBookDelete = input.next();
                   phoneBooks.deletePhoneBok(phoneBookDelete);
                   System.out.println("phone book deleted");
                    break;
                    
                case  "6":
                    option = "6";
                    System.out.println("Exiting ");

            }

            }
        }
    }
