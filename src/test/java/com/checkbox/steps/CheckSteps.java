package com.checkbox.steps;

import com.checkbox.pageobjects.CheckPage;

import net.thucydides.core.annotations.Step;

public class CheckSteps {
	
    CheckPage checkpage;
	
	@Step
	public void seleccionar_check() {
//		a. Abrir el navegador con la URL establecida
		checkpage.open();
//		b. Seleccionar el checkbox requerido	
		String opcion = " checkbox 1";
		checkpage.seleccionacheck(opcion);
	}

}
