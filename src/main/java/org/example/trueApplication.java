package org.example;

import io.dropwizard.client.HttpClientBuilder;
import io.dropwizard.client.HttpClientConfiguration;
import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;
import org.example.health.TemplateHealthCheck;
import org.example.resources.HelloWorldResource;

import java.net.http.HttpClient;

public class trueApplication extends Application<trueConfiguration> {

    public static void main(final String[] args) throws Exception {
        new trueApplication().run(args);
    }

    @Override
    public String getName() {
        return "true";
    }

    @Override
    public void initialize(final Bootstrap<trueConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final trueConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
        // Registering health check
        TemplateHealthCheck templateHealthCheck = new TemplateHealthCheck(configuration.getTemplate());
        environment.jersey().register(templateHealthCheck);
        // Registering Helloworld rsource
        HelloWorldResource helloWorldResource = new HelloWorldResource(
                configuration.getTemplate(),
                configuration.getDefaultName()
        );
        environment.jersey().register(helloWorldResource);


    }

}
