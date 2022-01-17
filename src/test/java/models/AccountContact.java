package models;

public class AccountContact {
    String salutation;
    String firstName;
    String lastName;
    String accountName;

    String emailContact;
    String phoneNumberContact;

    public AccountContact(String salutation, String firstName, String lastName, String accountName,
                          String emailContact, String phoneNumberContact) {
        this.salutation = salutation;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountName = accountName;
        this.emailContact = emailContact;
        this.phoneNumberContact = phoneNumberContact;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getEmailContact() {
        return emailContact;
    }

    public void setEmailContact(String emailContact) {
        this.emailContact = emailContact;
    }

    public String getPhoneNumberContact() {
        return phoneNumberContact;
    }

    public void setPhoneNumberContact(String phoneNumberContact) {
        this.phoneNumberContact = phoneNumberContact;
    }
}
