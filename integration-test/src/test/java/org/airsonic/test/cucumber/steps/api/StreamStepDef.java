package org.airsonic.test.cucumber.steps.api;

import cucumber.api.java8.En;
import org.airsonic.test.SpringContext;
import org.airsonic.test.cucumber.server.AirsonicServer;
import org.apache.commons.lang.NotImplementedException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = SpringContext.class)
public class StreamStepDef implements En {

    private CloseableHttpResponse response;
    private CloseableHttpClient client;

    public StreamStepDef(AirsonicServer server) {
        this.client = HttpClientBuilder.create().build();
        Given("Media file stream/piano.mp3 is added", () -> {
            throw new NotImplementedException();
        });

        When("A stream request is sent", () -> {
            throw new NotImplementedException();
        });

        Then("The response should have some bytes", () -> {
            throw new NotImplementedException();
        });


    }

}
