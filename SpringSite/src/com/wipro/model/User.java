package com.wipro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //allocate class to entity type
@Table(name="bookusers") //link to bookusers in SQL DB
public class User {
  
	@Id //id tag to assign attributes to columns in SQL table
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    @Column(name="employeeID")//assign employeeID string in DB to employeeID string in model
    String employeeID;
    
    @Column(name="firstName")
    String firstName;
    
    @Column(name="lastName")
    String lastName;
    
    @Column(name="emailAddr")
    String emailAddr;
    
    @Column(name="password")
    String password;
   
    @Column(name="dateofbirth")
    String DOB;
    
    @Column(name="addressLine1")
    String addressLine1;
    
    @Column(name="addressLine2")
    String addressLine2;
    
    @Column(name="country")
    String country;
    
    @Column(name="state")
    String county;
    
    @Column(name="postcode")
    String postCode;
    
    @Column(name="contactnumber")
    String contactNumber;
    
    @Column(name="cardnumber") 
    String cardNumber;
    
    @Column(name="cardname")
    String cardName;
    
    @Column(name="cardExpDate")
    String cardExpDate;
    
    @Column(name="securitylevel")
    String securityLevel;
   
    public String getEmployeeID() {
          return employeeID;
    }
    public void setEmployeeID(String employeeID) {
          this.employeeID = employeeID;
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
    public String getDOB() {
          return DOB;
    }
    public void setDOB(String dOB) {
          DOB = dOB;
    }
    public String getEmailAddr() {
          return emailAddr;
    }
    public void setEmailAddr(String emailAddr) {
          this.emailAddr = emailAddr;
    }
    public String getPassword() {
          return password;
    }
    public void setPassword(String password) {
          this.password = password;
    }
    public String getAddressLine1() {
          return addressLine1;
    }
    public void setAddressLine1(String addressLine1) {
          this.addressLine1 = addressLine1;
    }
    public String getAddressLine2() {
          return addressLine2;
    }
    public void setAddressLine2(String addressLine2) {
          this.addressLine2 = addressLine2;
    }
    public String getCountry() {
          return country;
    }
    public void setCountry(String country) {
          this.country = country;
    }
    public String getCounty() {
          return county;
    }
    public void setCounty(String county) {
          this.county = county;
    }
    public String getPostCode() {
          return postCode;
    }
    public void setPostCode(String postCode) {
          this.postCode = postCode;
    }
    public String getContactNumber() {
          return contactNumber;
    }
    public void setContactNumber(String contactNumber) {
          this.contactNumber = contactNumber;
    }
    public String getCardNumber() {
          return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
          this.cardNumber = cardNumber;
    }
    public String getCardName() {
          return cardName;
    }
    public void setCardName(String cardName) {
          this.cardName = cardName;
    }
    public String getCardExpDate() {
          return cardExpDate;
    }
    public void setCardExpDate(String cardExpDate) {
          this.cardExpDate = cardExpDate;
    }
    public String getSecurityLevel() {
          return securityLevel;
    }
    public void setSecurityLevel(String securityLevel) {
          this.securityLevel = securityLevel;
    }
    //constructor for user model
    public User (){
          
    }
    
	@Override /*override tag added because we are overriding the toString 
	method that is automatically made when you create a class
	*/
	public String toString() {/*can be used in the future to log the 
	information of your class in a file and check for errors
	*/
		return "User [employeeID=" + employeeID + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", emailAddr=" + emailAddr
				+ ", password=" + password + ", DOB=" + DOB + ", addressLine1="
				+ addressLine1 + ", addressLine2=" + addressLine2
				+ ", country=" + country + ", county=" + county + ", postCode="
				+ postCode + ", contactNumber=" + contactNumber
				+ ", cardNumber=" + cardNumber + ", cardName=" + cardName
				+ ", cardExpDate=" + cardExpDate + ", securityLevel="
				+ securityLevel + "]";
	};
    
    
     
}
