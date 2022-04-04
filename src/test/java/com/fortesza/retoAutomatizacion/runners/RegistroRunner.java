package com.fortesza.retoAutomatizacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/registro.feature",
        glue = "com.fortesza.retoAutomatizacion.stepsdefinitions",
        snippets = SnippetType.CAMELCASE )
public class RegistroRunner {}
