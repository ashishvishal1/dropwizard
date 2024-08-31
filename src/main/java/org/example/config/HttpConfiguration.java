package org.example.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.client.HttpClientConfiguration;
import io.dropwizard.core.Configuration;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class HttpConfiguration extends Configuration {
    @Valid
    @NotNull
    private HttpClientConfiguration httpClient = new HttpClientConfiguration();

    @JsonProperty("httpClient")
    public HttpClientConfiguration getHttpClientConfiguration() {
        return httpClient;
    }

    @JsonProperty("httpClient")
    public void setHttpClientConfiguration(HttpClientConfiguration httpClient) {
        this.httpClient = httpClient;
    }
}
