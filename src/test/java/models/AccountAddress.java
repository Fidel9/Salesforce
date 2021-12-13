package models;

public class AccountAddress {
    String billingAddress;
    String addressEnter;
    String shippingAddress;
    String billingStreet;

    public AccountAddress(String billingAddress, String shippingAddress,String billingStreet,String addressEnter) {
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingStreet;
        this.addressEnter = addressEnter;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public void setBillingStreet(String billingStreet) {
        this.billingStreet = billingStreet;
    }

    public String getAddressEnter() {
        return addressEnter;
    }

    public void setAddressEnter(String addressEnter) {
        this.addressEnter = addressEnter;
    }
}
