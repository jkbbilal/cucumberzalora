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

public WebElement getTextemail() {
	return textemail;
}
public WebElement getTextpass() {
	return textpass;
}
public WebElement getClicklogin() {
	return clicklogin;
}


}
