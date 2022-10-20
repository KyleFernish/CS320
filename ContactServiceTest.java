package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import main.java.model.ContactService;

class ContactServiceTest {
		@Test
		public void testNewContact() {
	        ContactService ServiceContact = new ContactService();
	  		ServiceContact.newContact(ServiceContact.newContactID(), "fname", "lname", "1234567891", "address");
	  		ServiceContact.contactList.get(0);
			assertTrue(ServiceContact.contactList.size() == 1);
		}
		
		@Test
		public void testDeleteContact() {
			ContactService ServiceContact = new ContactService();
			ServiceContact.newContact(ServiceContact.newContactID(), "fname", "lname", "1234567891", "address");
			
			try {
				ServiceContact.deleteContact(ServiceContact.contactList.get(0).getcontactID());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			assertTrue(ServiceContact.contactList.size() == 0);
		}
		
		@Test
		public void testUpdateFirstName() {
			ContactService ServiceContact = new ContactService();
			ServiceContact.newContact(ServiceContact.newContactID(), "fname", "lname", "1234567891", "address");
			
			try {
				ServiceContact.updateFirstName(ServiceContact.contactList.get(0).getcontactID(), "new fname");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			assertTrue(ServiceContact.contactList.get(0).getfirstName().equals("new fname"));
		}
		
		@Test
		public void testUpdateLastName() {
			ContactService ServiceContact = new ContactService();
			ServiceContact.newContact(ServiceContact.newContactID(), "fname", "lname", "1234567891", "address");
			
			try {
				ServiceContact.updateFirstName(ServiceContact.contactList.get(0).getcontactID(), "new lname");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			assertTrue(ServiceContact.contactList.get(0).getfirstName().equals("new lname"));
		}
		
		@Test
		public void testUpdatePhoneNumber() {
			ContactService ServiceContact = new ContactService();
			ServiceContact.newContact(ServiceContact.newContactID(), "fname", "lname", "1234567891", "address");
			
			try {
				ServiceContact.updatePhoneNumber(ServiceContact.contactList.get(0).getcontactID(), "1234567890");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			assertTrue(ServiceContact.contactList.get(0).getphoneNumber().equals("1234567890"));
		}
		
		@Test
		public void testUpdateAddress() {
			ContactService ServiceContact = new ContactService();
			ServiceContact.newContact(ServiceContact.newContactID(), "fname", "lname", "1234567891", "address");
			
			try {
				ServiceContact.updateAddress(ServiceContact.contactList.get(0).getcontactID(), "addresses");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			assertTrue(ServiceContact.contactList.get(0).getaddress().equals("addresses"));
		}
		
	}

