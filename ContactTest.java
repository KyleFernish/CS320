package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.java.model.Contact;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("1234567891", "fName", "lName", "1234567891", "123456789112345678911234567891");
		assertTrue(contact.getcontactID().equals("1234567891"));
		assertTrue(contact.getfirstName().equals("fName"));
		assertTrue(contact.getlastName().equals("lName"));
		assertTrue(contact.getphoneNumber().equals("1234567891"));
		assertTrue(contact.getaddress().equals("123456789112345678911234567891"));
	}
	
	@Test
	void testContactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678910", "1234567890", "1234567890", "1234567891", "123456789112345678911234567891");
	});
		}
	
	@Test
	void testContactIDNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "fName", "lName", "1234567891", "123456789112345678911234567891");
	});
		}
	
	@Test
	void testContactFirstnameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567891", "12345678910", "lName", "1234567891", "123456789112345678911234567891");
	});
		}
	
	@Test
	void testContactFirstNameNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567891", null, "lName", "1234567891", "123456789112345678911234567891");
	});
		}
	
	@Test
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567891", "fName", "12345678910", "1234567891", "123456789112345678911234567891");
	});
		}
	
	@Test
	void testContactLastNameNotNul() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567891", "fName", null, "1234567891", "123456789112345678911234567891");
	});
		}
	
	@Test
	void testContactPhoneNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567891", "fName", "lName", "12345678910", "123456789112345678911234567891");
	});
		}
	
	@Test
	void testContactPhoneNumberTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567891", "fName", "lName", "123456789", "123456789112345678911234567891");
	});
	}
	
	@Test
	void testContactPhoneNumberNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567891", "fName", "lName", null, "123456789112345678911234567891");
	});
		}
	
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567891", "fName", "lName", "1234567891", "1234567891123456789112345678910");
	});
		}
	
	@Test
	void testContactAddressNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567891", "fName", "lName", "1234567891", null);
	});
		}
	
}
