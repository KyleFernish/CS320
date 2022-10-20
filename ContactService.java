package main.java.model;

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.UUID;

import java.util.List;

public class ContactService {
  private String ContactID; 
  
    public List<Contact> contactList = new ArrayList<>();
  {
  
  ContactID = UUID.randomUUID().toString().substring(0, Math.min(toString().length(), 10));
  
  }
   public void newContact(String newContactID, String firstName, String lastName, String phoneNumber, String address) {
    Contact contact = new Contact(newContactID(), firstName, lastName, phoneNumber, address);
    contactList.add(contact);
  }
  
  public void deleteContact(String contactID) throws Exception{
    contactList.remove(searchForContact(contactID));
  }
  
  public void updateFirstName(String contactID, String firstName) throws Exception{
    searchForContact(contactID).setfirstName(firstName);
  }
  public void updateLastName(String contactID, String lastName) throws Exception {
    searchForContact(contactID).setlastName(lastName);
  }
  public void updatePhoneNumber(String contactID, String phoneNumber) throws Exception{
    searchForContact(contactID).setphoneNumber(phoneNumber);
  }
  public void updateAddress(String contactID, String address) throws Exception{
    searchForContact(contactID).setaddress(address);
  }
  
  protected List<Contact>getContactList(){
    return contactList;
  }
  public String newContactID(){
    return ContactID = UUID.randomUUID().toString().substring(0, Math.min(toString().length(), 10));
  }
  private Contact searchForContact(String contactID) throws Exception{
    int index = 0;
    while(index < contactList.size()){
      if(contactID.equals(contactList.get(index).getcontactID())){
        return contactList.get(index);
      }
      index++;
    }
    throw new Exception("The contact does not exist");
  }
    
}


