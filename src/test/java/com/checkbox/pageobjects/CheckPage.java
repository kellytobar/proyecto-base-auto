package com.checkbox.pageobjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;



@DefaultUrl("http://the-internet.herokuapp.com/checkboxes")
public class CheckPage extends PageObject{
	
	@FindBy(id="checkboxes")
	
	public WebElement formulario;
	
	public void seleccionacheck(String opcion) {
		List<WebElement> lchecks = formulario.findElements(By.tagName("input"));
				
		for (int i=0; i<lchecks.size(); i++) {
		// se valida si el elemento incluye checked, es decir, si está seleccionado el checkbox			
			if (lchecks.get(i).getAttribute("outerHTML").contains("checked")) {
				System.out.println(lchecks.get(i).getText()+"Esta seleccionado");
			}
			else {
				lchecks.get(i).click();
				System.out.println(lchecks.get(i).getAttribute("outerHTML")+"Toco seleccionar");
			}
		}
	}
}

	

