package main.java.model;

public class Contact {
	String contactID;     // all the variables is given in the instruction
	  String firstName;
	  String lastName;
	  String phoneNumber;
	  String address; 
	  
	  
        public Contact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
          if (contactID == null) {
            throw new IllegalArgumentException("Contact ID cannot be left blank");
          } else {
        	  if (contactID.length() > 10){
        		  throw new IllegalArgumentException("Contact ID can be no longer than 10 characters");
        	  }
          }
          this.contactID = contactID;
          
          
          setfirstName(firstName);
          
          setlastName(lastName);
          
          setphoneNumber(phoneNumber);
          
          setaddress(address);     
          
        }
  	  
	  public String getcontactID(){
		    return contactID;
		  }
	  public void setfirstName(String firstName) {
		  if (firstName == null) {
	            throw new IllegalArgumentException("First Name cannot be left blank");
	          } else {
	        	  if (firstName.length() > 10) {
	        		  throw new IllegalArgumentException("First Name cannot be longer than 10 characters");
	        	  }
	          }
		  this.firstName = firstName;
	  }
	  public String getfirstName() {
		  return firstName;
	  }
	  public void setlastName(String lastName) {
		  if (lastName == null) {
	            throw new IllegalArgumentException("Last Name cannot be left blank");
	          } else {
	        	  if (lastName.length() > 10) {
	        		  throw new IllegalArgumentException("Last Name can be no longer than 10 characters");
	        	  }
	          }
		  this.lastName = lastName;
	  }
	  public String getlastName() {
		  return lastName;
	  }
	  public void setphoneNumber(String phoneNumber) {
		  if (phoneNumber == null) {
	            throw new IllegalArgumentException("Phone number cannot be left blank");
	          } else {
	        	  if (phoneNumber.length() < 10) {
	        		  throw new IllegalArgumentException("Phone number cannot be less than 10 numbers");
	        	  } else if (phoneNumber.length() > 10) {
	        		  throw new IllegalArgumentException("Phone number cannot be more than 10 numbers");
	        	  }
	          }
		  this.phoneNumber = phoneNumber;
	  }
	  public String getphoneNumber() {
		  return phoneNumber;
	  }
	  public void setaddress(String address) {
		  if (address == null) {
	            throw new IllegalArgumentException("Address cannot be left blank");
	          }else {
	        	  if (address.length() > 30) {
	        	  throw new IllegalArgumentException("Address cannot be longer than 30 characters");
	        	  }
	          }
		  this.address = address;
	  }
	  public String getaddress() {
		  return address;
	  }

}


