// Tom Czubat

package main;

public class Contact {

	  private static final int ID_LENGTH = 10;
	  private static final int FIRSTNAME_LENGTH = 10;
	  private static final int lASTNAME_LENGTH = 10;
	  private static final int PHONENUMBER_LENGTH = 10;
	  private static final int ADDRESS_LENGTH = 30;
	  private static final String INITIAL_ID = "Initial Id";
	  private static final String INITIAL_NAME = "Initial name";
	  private static final String INITIAL_ADDRESS = "Initial address";
	  private static final String INITIAL_NUMBER = "09876543210";
	  
	  private String contactId;
	  private String firstName;
	  private String lastName;
	  private String phoneNumber;
	  private String address;

	  Contact() {
	    this.contactId = INITIAL_ID;
	    this.firstName = INITIAL_NAME;
	    this.lastName = INITIAL_NAME;
	    this.phoneNumber = INITIAL_NUMBER;
	    this.address = INITIAL_ADDRESS;
	  }

	  Contact(String contactId) {
	    updateContactId(contactId);
	    this.firstName = INITIAL_NAME;
	    this.lastName = INITIAL_NAME;
	    this.phoneNumber = INITIAL_NUMBER;
	    this.address = INITIAL_ADDRESS;
	  }

	  Contact(String contactId, String firstName) {
	    updateContactId(contactId);
	    updateFirstName(firstName);
	    this.lastName = INITIAL_NAME;
	    this.phoneNumber = INITIAL_NUMBER;
	    this.address = INITIAL_ADDRESS;
	  }

	  Contact(String contactId, String firstName, String lastName) {
	    updateContactId(contactId);
	    updateFirstName(firstName);
	    updateLastName(lastName);
	    this.phoneNumber = INITIAL_NUMBER;
	    this.address = INITIAL_ADDRESS;
	  }

	  Contact(String contactId, String firstName, String lastName,
	          String phoneNumber) {
	    updateContactId(contactId);
	    updateFirstName(firstName);
	    updateLastName(lastName);
	    updatePhoneNumber(phoneNumber);
	    this.address = INITIAL_ADDRESS;
	  }

	  Contact(String contactId, String firstName, String lastName,
	          String phoneNumber, String address) {
	    updateContactId(contactId);
	    updateFirstName(firstName);
	    updateLastName(lastName);
	    updatePhoneNumber(phoneNumber);
	    updateAddress(address);
	  }

	  protected final String getContactId() { 
		  return contactId; 
	  }

	  protected final String getFirstName() { 
		  return firstName;
	  }

	  protected final String getLastName() { 
		  return lastName;
	  }

	  protected final String getPhoneNumber() {
		  return phoneNumber;
	  }

	  protected final String getAddress() { 
		  return address;
	  }

	  protected void updateFirstName(String firstName) {
	    if (firstName == null) {
	      throw new IllegalArgumentException("First name can't be null.");
	    } else if (firstName.length() > FIRSTNAME_LENGTH) {
	      throw new IllegalArgumentException("First name can't be longer than " +
	                                         FIRSTNAME_LENGTH + " characters.");
	    } else {
	      this.firstName = firstName;
	    }
	  }

	  protected void updateLastName(String lastName) {
	    if (lastName == null) {
	      throw new IllegalArgumentException("Last name can't be null.");
	    } else if (lastName.length() > lASTNAME_LENGTH) {
	      throw new IllegalArgumentException("Last name can't be longer than " +
	    		  lASTNAME_LENGTH + " characters.");
	    } else {
	      this.lastName = lastName;
	    }
	  }

	  protected void updatePhoneNumber(String phoneNumber) {
	    String regex = "[0-9]+";
	    if (phoneNumber == null) {
	      throw new IllegalArgumentException("Phone number can't be null.");
	    } else if (phoneNumber.length() != PHONENUMBER_LENGTH) {
	      throw new IllegalArgumentException(
	          "Phone number length invalid. Make sure it is " +
	          PHONENUMBER_LENGTH + " digits.");
	    } else if (!phoneNumber.matches(regex)) {
	      throw new IllegalArgumentException(
	          "Phone number can't have anything but numbers");
	    } else {
	      this.phoneNumber = phoneNumber;
	    }
	  }

	  protected void updateAddress(String address) {
	    if (address == null) {
	      throw new IllegalArgumentException("Address can't be empty");
	    } else if (address.length() > ADDRESS_LENGTH) {
	      throw new IllegalArgumentException("Address can't be longer than " +
	                                         ADDRESS_LENGTH +
	                                         " characters");
	    } else {
	      this.address = address;
	    }
	  }

	  protected void updateContactId(String contactId) {
	    if (contactId == null) {
	      throw new IllegalArgumentException("Contact ID can't be null");
	    } else if (contactId.length() > ID_LENGTH) {
	      throw new IllegalArgumentException("Contact ID cannot be longer than " +
	                                         ID_LENGTH + " characters");
	    } else {
	      this.contactId = contactId;
	    }
	  }
	}