package com.checkbox.definition;

import com.checkbox.steps.CheckSteps;

import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class CheckDefinition {
	
	@Steps
	CheckSteps checkeo;
	
	@Given("^Ingreso a la URL \"([^\"]*)\" y clickeo todos los check$")
	public void ingreso_a_la_URL_y_clickeo_todos_los_check(String arg1) {
		checkeo.seleccionar_check();
	}



}
