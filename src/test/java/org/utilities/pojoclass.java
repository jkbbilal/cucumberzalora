package org.utilities;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pojoclass extends baseclass {
public pojoclass() {
	PageFactory.initElements(driver, this);
}
@FindBy(name="email")
private WebElement textemail;
@FindBy(id="pass")
private WebElement textpass;
@FindBy(name="login")
private WebElement clicklogin;
@FindBy(xpath="//a[@href='/men/?from=homepage']")
private WebElement shopmen;
@FindBy(linkText="WOMEN")
private WebElement womensection;
@FindBy(xpath="//a[@id='wishlist__icon']")
private WebElement wishlist;
@FindBy(xpath="//a[@id='minicart__icon']")
private WebElement minicarticon;
@FindBy(xpath="//i[@id='account__icon']")
private WebElement Accounticon;
@FindBy(xpath="//a[@id='account-menu-login-btn']")
private WebElement login;
@FindBy(xpath="//a[text()='Close']")
private WebElement closealert;
@FindBy(xpath="//input[@id='LoginForm_email']")
private WebElement emailid;
@FindBy(xpath="//input[@name='LoginForm[password]']")
private WebElement password;
@FindBy(xpath="//button[@class='btn btn--fluid fsxl btn-dark login__button']")
private WebElement submitlogin;
@FindBy(xpath="//a[@class='btn txtUpper btn-light paml']")
private WebElement clikshopping;
@FindBy(xpath="//a[@id='account-menu-register-btn']")
private WebElement clikregister;
@FindBy(xpath="//input[@id='RegistrationForm_email']")
private WebElement enteruseremail;
@FindBy(xpath="//input[@id='RegistrationForm_password']")
private WebElement enterpass;
@FindBy(xpath="(//span[@class='radiomark'])[2]")
private WebElement genderclik;
@FindBy(xpath="//input[@id='RegistrationForm_first_name']")
private WebElement firstnameenter;
@FindBy(xpath="//select[@id='RegistrationForm_day']")
private WebElement birthdayfill;
@FindBy(xpath="//select[@id='RegistrationForm_month']")
private WebElement birthmonthfill;
@FindBy(xpath="//select[@id='RegistrationForm_year']")
private WebElement birthyearfill;
@FindBy(xpath="//button[@id='send']")
private WebElement confirmsubmit;
@FindBy(xpath="//input[@placeholder='Shop Monki New Arrivals']")
private WebElement searchbox;
@FindBy(xpath="//i[@class='icon_loupe-dark']")
private WebElement cliksearch;


public WebElement getClikshopping() {
	return clikshopping;
}
public WebElement getClikregister() {
	return clikregister;
}
public WebElement getEnteruseremail() {
	return enteruseremail;
}
public WebElement getEnterpass() {
	return enterpass;
}
public WebElement getGenderclik() {
	return genderclik;
}
public WebElement getFirstnameenter() {
	return firstnameenter;
}
public WebElement getBirthdayfill() {
	return birthdayfill;
}
public WebElement getBirthmonthfill() {
	return birthmonthfill;
}
public WebElement getBirthyearfill() {
	return birthyearfill;
}
public WebElement getConfirmsubmit() {
	return confirmsubmit;
}
public WebElement getTextemail() {
	return textemail;
}
public WebElement getTextpass() {
	return textpass;
}
public WebElement getClicklogin() {
	return clicklogin;
}

public WebElement getShopmen() {
	return shopmen;
}
public WebElement getWomensection() {
	return womensection;
}
public WebElement getWishlist() {
	return wishlist;
}
public WebElement getMinicarticon() {
	return minicarticon;
}
public WebElement getAccounticon() {
	return Accounticon;
}
public WebElement getLogin() {
	return login;
}
public WebElement getClosealert() {
	return closealert;
}
public WebElement getEmailid() {
	return emailid;
}
public WebElement getPassword() {
	return password;
}
public WebElement getSubmitlogin() {
	return submitlogin;
}


}
