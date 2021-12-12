package models;

public class Account {
    String accountName;
    String webSite;
    String type;
    String description;
    String phone;
    String employees;
    String industry;


    public Account(String accountName, String webSite, String type,String description, String phone,
                   String employees, String industry) {
        this.accountName = accountName;
        this.webSite = webSite;
        this.type = type;
        this.description = description;
        this.phone = phone;
        this.employees = employees;
        this.industry = industry;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }
}
