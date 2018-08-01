package org.airsonic.test.cucumber.steps.api;

import cucumber.api.java8.En;
import org.airsonic.test.cucumber.server.AirsonicServer;
import org.apache.commons.lang.NotImplementedException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.nio.file.Paths;

public class StreamStepDef implements En {

    private CloseableHttpResponse response;
    private CloseableHttpClient client;

    public StreamStepDef(AirsonicServer server) {
        this.client = HttpClientBuilder.create().build();
        Given("Media file (.*) is added", (String mediaFile) -> {
            // TODO fix this
//            throw new NotImplementedException();
            server.uploadToDefaultMusicFolder(
                    Paths.get(this.getClass().getResource("/blobs/stream/piano").toURI()),
                    "");
        });

        When("A stream request is sent", () -> {
            throw new NotImplementedException();
        });

        Then("The response should have some bytes", () -> {
            throw new NotImplementedException();
        });


    }

}
