package model;

public class PhoneBook {
    private String phoneNumber = null;
    private String group = null;
    private String name = null;
    private String introduce = null;
    private String address = null;
    private String email = null;
    private String dateOfBirth = null;
    public PhoneBook() {
    }
    public PhoneBook(String phoneNumber,String group,String name,String introduce,String address,String dateOfBirth,String email) {
        this.phoneNumber = phoneNumber;
        this.group = group;
        this.name = name;
        this.introduce = introduce;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String toString() {
        return getPhoneNumber()+","+getGroup()+","+getName()+","+getIntroduce()+","+getAddress();
    }
}
