package org.example;

import io.dropwizard.client.HttpClientConfiguration;
import io.dropwizard.core.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.*;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.validation.constraints.NotEmpty;

public class trueConfiguration extends Configuration {
    // TODO: implement service configuration
    @NotEmpty
    private String template;
    @NotEmpty
    private String defaultName="Stranger";

    @JsonProperty
    public String getTemplate() {
        return template;
    }
    @JsonProperty
    public void setTemplate(String template) {
        this.template = template;
    }
    @JsonProperty
    public String getDefaultName() {
        return defaultName;
    }
    @JsonProperty
    public void setDefaultName(String defaultName) {
        this.defaultName = defaultName;
    }

}
