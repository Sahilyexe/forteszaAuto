package com.fortesza.retoAutomatizacion.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/perfil.feature",
        glue = "com.fortesza.retoAutomatizacion.stepsdefinitions",
        snippets = SnippetType.CAMELCASE )
public class EjemploRunner {}
